package com.beachResort.service.impl;

import com.beachResort.entity.Reservation;
import com.beachResort.entity.ReservedRoom;
import com.beachResort.entity.RoomType;
import com.beachResort.repository.ReservationRepository;
import com.beachResort.repository.ReservedRoomRepositoy;
import com.beachResort.repository.RoomTypeRepository;
import com.beachResort.service.BeachResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Service
public class BeachResortServiceImpl implements BeachResortService {
    @Autowired
    ReservedRoomRepositoy beachResortRepositoy;

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    RoomTypeRepository roomTypeRepository;

    @Override
    public String reservedRoom() {
        Set<ReservedRoom> reservedRooms = new HashSet<>();
        ReservedRoom r1 = new ReservedRoom();
        //r.setRoomType(rt);
        r1.setStatus("Success");
        r1.setNumberOfRooms(2);
        ReservedRoom r2 = new ReservedRoom();
        //r.setRoomType(rt);
        r2.setStatus("Success");
        r2.setNumberOfRooms(2);

        reservedRooms.add(r1);
        reservedRooms.add(r2);

        Reservation reservation = new Reservation();
        reservation.setArrivalDate(new Date());
        reservation.setDepartureDate(new Date());
        reservation.setNoOfAdults(2);
        reservation.setNoOfChildrens(1);

        RoomType rt = new RoomType() ;
        rt.setDescription("Test");
        rt.setMaxCapacity(3);

        r1.setReservation(reservation);
        r1.setRoomType(rt);

        r2.setReservation(reservation);
        r2.setRoomType(rt);

        reservation.setReservedRooms(reservedRooms);
        rt.setReservedRooms(reservedRooms);

        reservationRepository.save(reservation);
      //  roomTypeRepository.save(rt);
       /* Reservation reservation = new Reservation();
        reservation.setArrivalDate(new Date());
        reservation.setDepartureDate(new Date());
        reservation.setNoOfAdults(2);
        reservation.setNoOfChildrens(1);*/
       // r1.setReservation(reservation);

        //res.setReservedRooms(reservedRooms);

        //r2.setReservation(reservation);


     //  reservation.setReservedRooms(reservedRooms);

       // r1.setRoomType(rt);
       // r2.setRoomType(rt);





        return "Success";
    }
}
