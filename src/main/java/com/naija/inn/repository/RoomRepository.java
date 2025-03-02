package com.naija.inn.repository;

import com.naija.inn.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface RoomRepository extends MongoRepository<Room, String> {
    List<Room> findByIsAvailableTrue();
}
