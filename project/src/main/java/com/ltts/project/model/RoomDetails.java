package com.ltts.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class RoomDetails implements Serializable{
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private String hotelname;
	@Id
	private String roomnumber;
	private String roomtype;
	private String roomdescription;
	private String floor;
	private String facility;
	private String cost;
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getRoomdescription() {
		return roomdescription;
	}
	public void setRoomdescription(String roomdescription) {
		this.roomdescription = roomdescription;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public RoomDetails(String hotelname, String roomnumber, String roomtype, String roomdescription, String floor,
			String facility, String cost) {
		super();
		this.hotelname = hotelname;
		this.roomnumber = roomnumber;
		this.roomtype = roomtype;
		this.roomdescription = roomdescription;
		this.floor = floor;
		this.facility = facility;
		this.cost = cost;
	}
	public RoomDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RoomDetails [hotelname=" + hotelname + ", roomnumber=" + roomnumber + ", roomtype=" + roomtype
				+ ", roomdescription=" + roomdescription + ", floor=" + floor + ", facility=" + facility + ", cost="
				+ cost + "]";
	}
	
}