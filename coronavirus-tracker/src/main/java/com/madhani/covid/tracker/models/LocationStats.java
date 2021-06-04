package com.madhani.covid.tracker.models;

public class LocationStats {

	private String state;
	private String country;
	private String active;
	private String caseFatalityRatio;
	private int deaths;
	private String recovered;
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", active=" + active + ", caseFatalityRatio="
				+ caseFatalityRatio + ", deaths=" + deaths + ", recovered=" + recovered + "]";
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCaseFatalityRatio() {
		return caseFatalityRatio;
	}
	public void setCaseFatalityRatio(String caseFatalityRatio) {
		this.caseFatalityRatio = caseFatalityRatio;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public String getRecovered() {
		return recovered;
	}
	public void setRecovered(String recovered) throws Exception {
		this.recovered = recovered;
	}
	public LocationStats(String state, String country, String active, String caseFatalityRatio, int deaths,
			String recovered) {
		super();
		this.state = state;
		this.country = country;
		this.active = active;
		this.caseFatalityRatio = caseFatalityRatio;
		this.deaths = deaths;
		this.recovered = recovered;
	}
	public LocationStats() {
		super();
		// TODO Auto-generated constructor stub
	}

}
