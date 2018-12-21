package com.techelevator.countrylanguage;

public class CountryLanguage {
	
	private String countryCode;
	private String language;
	private boolean isOfficial;
	private double percentage;
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public boolean isOfficial() {
		return isOfficial;
	}
	
	public void setOfficial(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
