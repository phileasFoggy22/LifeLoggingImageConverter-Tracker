package com.bae.persisitence.domain;

public abstract class Activity {

	private String lifelogDirectory;
	private String userEmail;
	private String description;

	public Activity(String lifelogDirectory, String userEmail, String description) {
		super();
		this.lifelogDirectory = lifelogDirectory;
		this.userEmail = userEmail;
		this.description = description;
	}

	public String getLifelogDirectory() {
		return lifelogDirectory;
	}

	public void setLifelogDirectory(String lifelogDirectory) {
		this.lifelogDirectory = lifelogDirectory;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
