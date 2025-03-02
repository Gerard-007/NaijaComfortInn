package com.naija.inn.controller;

import com.naija.inn.model.Room;
import com.naija.inn.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/available")
    public List<Room> getAvailableRooms() {
        return roomService.getAvailableRooms();
    }

    @PutMapping("/maintenance/{roomNumber}")
    public String markRoomForMaintenance(@PathVariable String roomNumber) {
        roomService.markRoomForMaintenance(roomNumber);
        return "Room " + roomNumber + " is now under maintenance.";
    }
}
