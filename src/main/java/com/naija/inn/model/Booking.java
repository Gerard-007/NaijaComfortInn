package com.naija.inn.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "reservations")
@Data
public class Booking {
    @Id
    private String bookingReference;
    private String guestId;
    private String roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalAmount;
}
