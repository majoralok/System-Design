package com.codemate.bmshow.booking;

import java.util.Date;
import java.util.List;

import com.codemate.bmshow.enums.BookingStatus;
import com.codemate.bmshow.movie.Show;
import com.codemate.bmshow.movie.Seat;
import com.codemate.bmshow.payment.Payment;

public class Booking {
	  private String bookingNumber;
	  private int numberOfSeats;
	  private Date createdOn;
	  private BookingStatus status;

	  private Show show;
	  private List<Seat> seats;
	  private Payment payment;

	  /*
	   * Make payment for outstanding amount
	   */
	  public boolean makePayment(Payment payment) {
		  
	  }
	  
	  /**
	   * Cancel existing booking
	   * @return
	   */
	  public boolean cancel() {
		  
	  }
	  
	  /**
	   * @param seats
	   * allocate the seat.
	   * @return
	   */
	  public boolean assignSeats(List<Seat> seats) {
		  
	  }

}
