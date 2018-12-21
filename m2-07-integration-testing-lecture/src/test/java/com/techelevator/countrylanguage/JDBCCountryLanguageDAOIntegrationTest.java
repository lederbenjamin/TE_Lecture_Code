package com.techelevator.countrylanguage;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.DAOIntegrationTest;

public class JDBCCountryLanguageDAOIntegrationTest extends DAOIntegrationTest {

	private JDBCCountryLanguageDAO jdbcCountryLanauageDAO;
	
	@Before
	public void initializeSubject() {
		jdbcCountryLanauageDAO = new JDBCCountryLanguageDAO(getDataSource());
	}
	
	@Test
	public void getAllCountryLanguages_returns_all_country_languages() {
		// ARRANGE
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		jdbcTemplate.execute("INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('USA', 'English', true, 83.55)");
		jdbcTemplate.execute("INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('USA', 'Elvish', false, 0.55)");
		
		// ACT
		List<CountryLanguage> results = jdbcCountryLanauageDAO.getAllCountryLanguages();
		
		// ASSERT
		assertEquals(2, results.size());
		CountryLanguage expectedCountryLanguage = new CountryLanguage();
		expectedCountryLanguage.setCountryCode("USA");
		expectedCountryLanguage.setLanguage("Elvish");
		
		assertCountryLanguagesContains(expectedCountryLanguage, results);
	}
	
	private void assertCountryLanguagesContains(CountryLanguage expectedCountryLanguage, List<CountryLanguage> actualCountryLanguages) {
		CountryLanguage resolvedCountryLanguage = null;
		
		for(CountryLanguage countryLanguage : actualCountryLanguages) {
			if (expectedCountryLanguage.getLanguage().equals(countryLanguage.getLanguage())) {
				resolvedCountryLanguage = countryLanguage;
				break;
			}
		}
		
		if (resolvedCountryLanguage == null) {
			fail(String.format("The collection does not contain the expected countryLanguage %s.", expectedCountryLanguage.getLanguage()));
			return;
		}
		
		assertEquals(expectedCountryLanguage.getCountryCode(), resolvedCountryLanguage.getCountryCode());
	}
}
