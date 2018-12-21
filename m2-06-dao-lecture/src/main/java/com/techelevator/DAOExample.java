package com.techelevator;

import java.sql.Date;
import java.time.Instant;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class DAOExample {

	public static void main(String[] args) {

		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");

		CityDAO dao = new JDBCCityDAO(worldDataSource);

		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setDistrict("KS");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);

		dao.save(smallville);

		City theCity = dao.findCityById(smallville.getId());
		System.out.println("The id for the new city is: " + theCity.getId());

		theCity = dao.findCityById(theCity.getId());

		System.out.println(theCity.getName());

		List<City> usCities = dao.findCityByCountryCode("USA");
		for (City city : usCities) {
			System.out.println(
					"City: " + city.getName() + ", Population:" + city.getPopulation());
		}

		List<City> ohioCities = dao.findCityByDistrict("Ohio");
		for (City city : ohioCities) {
			System.out.println("City: " + city.getName() + ", Population:" + city.getPopulation());
		}

		theCity.setName(Date.from(Instant.now()).toString());
		dao.update(theCity);

		theCity = dao.findCityById(theCity.getId());
		System.out.println("The city name is " + theCity.getName());

		dao.delete(theCity.getId());
	}

}
