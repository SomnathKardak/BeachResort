package com.beachResort.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "reserved_room")
public class ReservedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reservedRoomID;

    @Column(name = "number_of_rooms")
    private int numberOfRooms;

   // @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "roomTypeID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "roomTypeID", referencedColumnName = "roomTypeID")
    @JsonIgnoreProperties("reservedRooms")
    private RoomType roomType;

   // @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name = "reservationID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "reservationID", referencedColumnName = "reservationID")
    @JsonIgnoreProperties("reservedRooms")
    private Reservation reservation;
   // private int reservationID;

    @Column(name = "status")
    private String status;

    public ReservedRoom() {
    }

    public ReservedRoom(int numberOfRooms, RoomType roomType, Reservation reservation, String status) {
        this.numberOfRooms = numberOfRooms;
        this.roomType = roomType;
        this.reservation = reservation;
        this.status = status;
    }

    public int getReservedRoomID() {
        return reservedRoomID;
    }

    public void setReservedRoomID(int reservedRoomID) {
        this.reservedRoomID = reservedRoomID;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public RoomType getRoomTypeID() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
