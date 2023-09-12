package com.springdb.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String place;
	private double longtitude;
	private double latitide;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	public double getLatitide() {
		return latitide;
	}

	public void setLatitide(double latitide) {
		this.latitide = latitide;
	}

	public Location() {
	}

	public Location(long id, String place, double longtitude, double latitide) {
		super();
		this.id = id;
		this.place = place;
		this.longtitude = longtitude;
		this.latitide = latitide;
	}

}
