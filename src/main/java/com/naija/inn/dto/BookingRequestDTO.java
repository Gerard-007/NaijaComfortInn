package com.naija.inn.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class BookingRequestDTO {
    private String guestId;
    private String roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
}
