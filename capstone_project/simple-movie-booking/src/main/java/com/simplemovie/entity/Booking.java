package com.simplemovie.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking;
	
	private String customerName;
	
	private int seatsBooked;
	
	private LocalDate bookingDate;
	
	@ManyToOne
	@JoinColumn(name = "show_id")
	private Shows show;

	public int getBooking() {
		return booking;
	}

	public void setBooking(int booking) {
		this.booking = booking;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Shows getShow() {
		return show;
	}

	public void setShow(Shows show) {
		this.show = show;
	}
	
	
}
