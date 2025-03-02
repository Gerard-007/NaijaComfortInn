package com.naija.inn.controller;

import com.naija.inn.model.Guest;
import com.naija.inn.service.GuestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/guests")
public class GuestController {
    private final GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/register")
    public Guest registerGuest(@RequestBody Guest guest) {
        return guestService.registerGuest(guest);
    }
}
