package com.naija.inn.service;

import com.naija.inn.model.Room;
import com.naija.inn.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAvailableRooms() {
        return roomRepository.findByIsAvailableTrue();
    }

    public void markRoomForMaintenance(String roomNumber) {
        Room room = roomRepository.findById(roomNumber)
                .orElseThrow(() -> new RuntimeException("Room not found"));
        room.setAvailable(false);
        roomRepository.save(room);
    }
}
