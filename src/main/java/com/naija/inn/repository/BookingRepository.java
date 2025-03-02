package com.naija.inn.repository;

import com.naija.inn.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface BookingRepository extends MongoRepository<Booking, String> {
    Optional<Booking> findByBookingReference(String bookingReference);
}
