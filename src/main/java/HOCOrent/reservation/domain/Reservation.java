package HOCOrent.reservation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservationId", nullable = false, updatable = false)
	private Long id;
	private String apartment, bookedBy, bookingDate, reservationDate, startTime,endTime;
	private Boolean invoiced;

	//private Room room;
	
	//Constructors, getters ,setters
	public Reservation() {}

	public Reservation(Long id, String apartment, String bookedBy, String bookingDate, String reservationDate,
			String startTime, String endTime, Boolean invoiced) {
		super();
		this.id = id;
		this.apartment = apartment;
		this.bookedBy = bookedBy;
		this.bookingDate = bookingDate;
		this.reservationDate = reservationDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.invoiced = invoiced;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getInvoiced() {
		return invoiced;
	}

	public void setInvoiced(Boolean invoiced) {
		this.invoiced = invoiced;
	}


		//toString method
	@Override
	public String toString() {
		return "Reservation [getId()=" + getId() + ", getApartment()=" + getApartment() + ", getBookedBy()="
				+ getBookedBy() + ", getBookingDate()=" + getBookingDate() + ", getReservationDate()="
				+ getReservationDate() + ", getStartTime()=" + getStartTime() + ", getEndTime()=" + getEndTime()
				+ ", getInvoiced()=" + getInvoiced() +  "]";
	}
	
	
}
