package com.techelevator.countrylanguage;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCountryLanguageDAO implements CountryLanguageDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCCountryLanguageDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<CountryLanguage> getAllCountryLanguages() {
		List<CountryLanguage> countryLanguages = new ArrayList<>();
		String sql = "SELECT countrycode, language, isofficial, percentage FROM countrylanguage";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		
		while(results.next()) {
			CountryLanguage countryLanguage = new CountryLanguage();
			//countryLanguage.setCountryCode(results.getString("countrycode"));
			countryLanguages.add(countryLanguage);
		}
		
		return countryLanguages;
	}
	
}
