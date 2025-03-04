package com.naija.inn.controller;

import com.naija.inn.dto.PaymentResponseDTO;
import com.naija.inn.model.Booking;
import com.naija.inn.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/reservations")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService reservationService) {
        this.bookingService = reservationService;
    }

    @PostMapping("/book")
    public Booking bookRoom(@RequestBody Booking reservation) {
        return bookingService.bookRoom(reservation);
    }

    @GetMapping("/{reference}")
    public Optional<Booking> getReservation(@PathVariable String reference) {
        return bookingService.findByReference(reference);
    }

    @GetMapping("/calculate-payment")
    public PaymentResponseDTO calculatePayment(
            @RequestParam String roomType,
            @RequestParam int nights,
            @RequestParam boolean isFestivePeriod) {
        return bookingService.calculatePayment(roomType, nights, isFestivePeriod);

    }
}