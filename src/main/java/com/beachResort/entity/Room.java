package com.beachResort.entity;

import javax.persistence.*;

/*@Entity
@Table(name = "room")*/
public class Room {}/*{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomID;
    private String roomTypeID;
    @Column(name = "room_number", nullable = false)
    private int roomNum;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "name", nullable = false)
    private String name;
    public Room() {
    }

    public Room(String roomTypeID, int roomNum, String status, String name) {
        this.roomTypeID = roomTypeID;
        this.roomNum = roomNum;
        this.status = status;
        this.name = name;
    }

    public String getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(String roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/
