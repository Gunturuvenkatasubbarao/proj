package com.ltts.project.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking implements Serializable{
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	private String bookingid;
	private String roomnumber;
	private Date bookingdate;
	private String status;
	private Date checkoutdate;
	private String paymenttype;
	private String cost;
	private String menuid;
	private Date menudate;
	private boolean isBooked;

	public boolean getIsBooked() {
		return isBooked;
	}
	public void setIsBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public Date getMenudate() {
		return menudate;
	}
	public void setMenudate(Date menudate) {
		this.menudate = menudate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Booking(String bookingid, String roomnumber, Date bookingdate, String status, Date checkoutdate,
			String paymenttype, String cost, String menuid, Date menudate, boolean isBooked) {
		super();
		this.bookingid = bookingid;
		this.roomnumber = roomnumber;
		this.bookingdate = bookingdate;
		this.status = status;
		this.checkoutdate = checkoutdate;
		this.paymenttype = paymenttype;
		this.cost = cost;
		this.menuid = menuid;
		this.menudate = menudate;
		this.isBooked = isBooked;
	}
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", roomnumber=" + roomnumber + ", bookingdate=" + bookingdate
				+ ", status=" + status + ", checkoutdate=" + checkoutdate + ", paymenttype=" + paymenttype + ", cost="
				+ cost + ", menuid=" + menuid + ", menudate=" + menudate + ", isBooked=" + isBooked + "]";
	}
	
	
	
}