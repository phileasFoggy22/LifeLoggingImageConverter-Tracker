package com.bae.persisitence.domain;

import java.util.Date;

public class Kayaking extends Activity {

	private String journeyStart;
	private String journeyEnd;
	private Date dateCompleted;
	private int durationMins;

	public Kayaking(String lifelogDirectory, String userEmail, String description, String journeyStart,
			String journeyEnd, Date dateCompleted, int durationMins) {
		super(lifelogDirectory, userEmail, description);
		this.journeyStart = journeyStart;
		this.journeyEnd = journeyEnd;
		this.dateCompleted = dateCompleted;
		this.durationMins = durationMins;
	}

	public String getJourneyStart() {
		return journeyStart;
	}

	public void setJourneyStart(String journeyStart) {
		this.journeyStart = journeyStart;
	}

	public String getJourneyEnd() {
		return journeyEnd;
	}

	public void setJourneyEnd(String journeyEnd) {
		this.journeyEnd = journeyEnd;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public int getDurationMins() {
		return durationMins;
	}

	public void setDurationMins(int durationMins) {
		this.durationMins = durationMins;
	}

}
