package com.beachResort.repository;

import com.beachResort.entity.ReservedRoom;
import com.beachResort.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
}
