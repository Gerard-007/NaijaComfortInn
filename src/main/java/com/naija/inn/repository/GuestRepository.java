package com.naija.inn.repository;

import com.naija.inn.model.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface GuestRepository extends MongoRepository<Guest, String> {
    Optional<Guest> findByPhone(String phone);
}
