package com.techelevator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {

		/*
		 * This datasource will be used for creating connections to the database. Below,
		 * we provide the information required to make database connections
		 */
		BasicDataSource dataSource = null;
		
		try {
			/* Because we are using BasicDataSource, connection pooling will be
			 * used by default. It is recommended to favor using an object that implements
			 * the DataSource interface rather than using the DriverManager class, in order
			 * to take advantage of connection pooling.
			 */
			dataSource = new BasicDataSource();
			dataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
			dataSource.setUsername("postgres");
			dataSource.setPassword("postgres1");

			/* A Connection object controls the connection to the database. */
			Connection conn = dataSource.getConnection();

			/*
			 * Create a Statement object so that we can execute a SQL Query Statement,
			 * PreparedStatement, and CallableStatement objects are used for executing SQL
			 * statements.
			 */
			Statement stmt = conn.createStatement();

			/* Define a SQL query */
			String sqlActionFilmsReleaseIn2006 = "SELECT film.title, film.release_year "
					+ "FROM film JOIN film_category ON film.film_id = film_category.film_id "
					+ "JOIN category ON category.category_id = film_category.category_id "
					+ "WHERE film.release_year = 2006 " + "AND category.name = 'Action'";

			/*
			 * A ResultSet object contains the results of a query. The statement object is
			 * used to execute the query string that we built above, and returns a
			 * ResultSet.
			 */
			ResultSet results = stmt.executeQuery(sqlActionFilmsReleaseIn2006);

			/* Iterate over the results and display each one */
			System.out.println("Film Title\t\t\tRelease Year");
			while (results.next()) {
				String title = results.getString("title"); // returns the value of the "title" column from the current
															// row
				int releaseYear = results.getInt("release_year"); // returns the value of the "release_year" column from
																	// the current row
				System.out.println(title + "\t\t\t" + releaseYear);
			}

			/* The next query example takes a parameter (i.e. is dynamic) */
			String firstName = "Nick";
			String lastName = "Stallone";
			// String lastName = "O'Malley"; // This is an example of non-malicious user
			// input that will cause the query to break

			/*
			 * WARNING!!! You should NEVER create dynamic SQL this way! This will expose
			 * your application to a security vulnerability called SQL Injection. Favor
			 * parameterized queries for executing SQL statements.
			 */
			String sqlMoviesByActor = "SELECT film.title "
					+ "FROM film join film_actor on film.film_id = film_actor.film_id "
					+ "JOIN actor on actor.actor_id = film_actor.actor_id " + "WHERE actor.first_name = '"
					+ firstName.toUpperCase() + "' " + "AND actor.last_name = '" + lastName.toUpperCase() + "'";

			results = stmt.executeQuery(sqlMoviesByActor);

			System.out.println("\n\nFilms Starring " + firstName + " " + lastName + ": ");
			while (results.next()) {
				String title = results.getString("title");
				System.out.println(title);
			}

			/*
			 * The solution to the problem of building dynamic SQL statements is to use a
			 * PreparedStatement a parameterized SQL statement uses the '?' character as a
			 * placeholder for dynamic parameters
			 */
			String sqlMoviesByActorParameterized = "SELECT film.title "
					+ "FROM film join film_actor on film.film_id = film_actor.film_id "
					+ "JOIN actor on actor.actor_id = film_actor.actor_id " + "WHERE actor.first_name = ? "
					+ "AND actor.last_name = ?";

			/* PreparedStatement objects are created using the Connection object */
			PreparedStatement movieByActorStmt = conn.prepareStatement(sqlMoviesByActorParameterized);
			movieByActorStmt.setString(1, "NICK");
			movieByActorStmt.setString(2, "STALLONE");

			/* Call executeQuery to return the results as a ResultSet */
			results = movieByActorStmt.executeQuery();

			System.out.println("\n\nFilms Starring " + firstName + " " + lastName + ": ");
			while (results.next()) {
				String title = results.getString("title");
				System.out.println(title);
			}

			/*
			 * The statement objects can also be used to perform INSERT and UPDATE commands
			 */
			PreparedStatement insertActorStmt = conn
					.prepareStatement("INSERT INTO actor(first_name, last_name) " + "VALUES(?, ?)");
			String actorFirstName = "MARC";
			String actorLastName = "O'MALLEY";
			insertActorStmt.setString(1, actorFirstName);
			insertActorStmt.setString(2, actorLastName);

			/* The execute method is used for INSERT and UPDATE statements */
			insertActorStmt.executeUpdate();

			PreparedStatement findActorByNameStmt = conn
					.prepareStatement("SELECT * FROM actor WHERE first_name = ? AND last_name = ?");
			findActorByNameStmt.setString(1, actorFirstName);
			findActorByNameStmt.setString(2, actorLastName);
			results = findActorByNameStmt.executeQuery();
			System.out.println("\n\nActors named " + actorFirstName + " " + actorLastName + ":");
			while (results.next()) {
				int id = results.getInt("actor_id");
				String fname = results.getString("first_name");
				String lname = results.getString("last_name");
				System.out.println("(" + id + ") " + fname + " " + lname);
			}

			/*
			 * To use transactions in JDBC, we can turn off the default "autocommit"
			 * behavior of the Connection object
			 */
			conn.setAutoCommit(false);

			PreparedStatement deleteMarcOMalleyStmt = conn
					.prepareStatement("DELETE FROM ACTOR WHERE first_name = 'MARC' AND last_name = 'O''MALLEY'");
			deleteMarcOMalleyStmt.executeUpdate();

			conn.commit();

			/* Marc O'Malley rises again! */
			insertActorStmt.executeUpdate();

			conn.commit();
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (dataSource != null) {
				dataSource.close();
			}
		}
	}
}
