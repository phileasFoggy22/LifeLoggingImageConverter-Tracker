package com.bae.persisitence.domain;

import java.util.Date;

public class Hiking {
	private String location;
	private Date startDate;
	private Date endDate;
	private int lengthMiles;
	private String officialRouteName;

	public Hiking(String location, Date startDate, Date endDate, int lengthMiles, String officialRouteName) {
		super();
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.lengthMiles = lengthMiles;
		this.officialRouteName = officialRouteName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getLengthMiles() {
		return lengthMiles;
	}

	public void setLengthMiles(int lengthMiles) {
		this.lengthMiles = lengthMiles;
	}

	public String getOfficialRouteName() {
		return officialRouteName;
	}

	public void setOfficialRouteName(String officialRouteName) {
		this.officialRouteName = officialRouteName;
	}

}
