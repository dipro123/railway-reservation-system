package com.train.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Train {
	@Id
	@GeneratedValue
	private int trainId;
	private int trainno;
	private String trainname;
	private String fromstation;
	private String tostation;
	private int available;
	private int fare;
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public String getFromstation() {
		return fromstation;
	}
	public void setFromstation(String fromstation) {
		this.fromstation = fromstation;
	}
	public String getTostation() {
		return tostation;
	}
	public void setTostation(String tostation) {
		this.tostation = tostation;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public Train(int trainno, String trainname, String fromstation, String tostation, int available, int fare) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.fromstation = fromstation;
		this.tostation = tostation;
		this.available = available;
		this.fare = fare;
	}
	
	public Train() {
		super();
	}
	
	

}
