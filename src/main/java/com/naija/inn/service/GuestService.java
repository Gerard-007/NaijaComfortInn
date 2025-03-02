package com.naija.inn.service;

import com.naija.inn.model.Guest;
import com.naija.inn.repository.GuestRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public Guest registerGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    public Optional<Guest> findByPhone(String phone) {
        return guestRepository.findByPhone(phone);
    }
}
