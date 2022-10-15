package com.beachResort.repository;

import com.beachResort.entity.Reservation;
import com.beachResort.entity.ReservedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
