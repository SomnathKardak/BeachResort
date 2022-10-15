package com.beachResort.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationID;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "reservation", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("reservation")
    private Set<ReservedRoom> reservedRooms ;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "number_of_adults")
    private int noOfAdults;

    @Column(name = "number_of_children")
    private int noOfChildrens;

    //private int guestID;

    public Reservation() {
    }

    public Reservation(Date arrivalDate, Date departureDate, int noOfAdults, int noOfChildrens/*, int guestID*/) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.noOfAdults = noOfAdults;
        this.noOfChildrens = noOfChildrens;
        //this.guestID = guestID;
    }

    public Long getReservationID() {
        return reservationID;
    }

    public void setReservationID(Long reservationID) {
        this.reservationID = reservationID;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public int getNoOfChildrens() {
        return noOfChildrens;
    }

    public void setNoOfChildrens(int noOfChildrens) {
        this.noOfChildrens = noOfChildrens;
    }

  /*  public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }*/

    public Set<ReservedRoom> getReservedRooms() {
        return reservedRooms;
    }

    public void setReservedRooms(Set<ReservedRoom> reservedRooms) {
        this.reservedRooms = reservedRooms;
    }
}
