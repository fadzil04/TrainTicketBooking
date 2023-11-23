package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dataentity {
@Id
	private int passangerid;
	private String name;
	private String arriveLocation;
	private String departureLocation;
	private double ticketFare;
	public int getPassangerid() {
		return passangerid;
	}
	public void setPassangerid(int passangerid) {
		this.passangerid = passangerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArriveLocation() {
		return arriveLocation;
	}
	public void setArriveLocation(String arriveLocation) {
		this.arriveLocation = arriveLocation;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public double getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}
	public Dataentity(int passangerid, String name, String arriveLocation, String departureLocation,
			double ticketFare) {
		super();
		this.passangerid = passangerid;
		this.name = name;
		this.arriveLocation = arriveLocation;
		this.departureLocation = departureLocation;
		this.ticketFare = ticketFare;
	}
	public Dataentity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
