package com.beachResort.repository;

import com.beachResort.entity.ReservedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedRoomRepositoy extends JpaRepository<ReservedRoom, Integer> {

}
