package com.beachResort.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "room_type")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roomTypeID;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "roomType", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("roomType")
    private Set<ReservedRoom> reservedRooms;

    @Column(name = "max_capacity")
    private int maxCapacity;

    @Column(name = "description")
    private String description;

    public RoomType() {
    }

    public RoomType(int maxCapacity, String description) {
        this.maxCapacity = maxCapacity;
        this.description = description;
    }

    public int getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ReservedRoom> getReservedRooms() {
        return reservedRooms;
    }

    public void setReservedRooms(Set<ReservedRoom> reservedRooms) {
        this.reservedRooms = reservedRooms;
    }
}
