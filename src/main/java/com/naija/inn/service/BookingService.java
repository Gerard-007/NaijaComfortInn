package com.naija.inn.service;

import com.naija.inn.dto.PaymentResponseDTO;
import com.naija.inn.model.Booking;
import com.naija.inn.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository reservationRepository) {
        this.bookingRepository = reservationRepository;
    }

    public Booking bookRoom(Booking reservation) {
        return bookingRepository.save(reservation);
    }

    public Optional<Booking> findByReference(String reference) {
        return bookingRepository.findByBookingReference(reference);
    }

    public PaymentResponseDTO calculatePayment(String roomType, int nights, boolean isFestivePeriod) {
        double basePrice;
        switch (roomType.toLowerCase()) {
            case "single":
                basePrice = 10000;
                break;
            case "double":
                basePrice = 15000;
                break;
            case "suite":
                basePrice = 25000;
                break;
            default:
                throw new IllegalArgumentException("Invalid room type");
        }

        double total = basePrice * nights;
        double festiveSurcharge = 0;

        if (isFestivePeriod) {
            festiveSurcharge = total * 0.20; // 20% increase
            total += festiveSurcharge;
        }

        PaymentResponseDTO response = new PaymentResponseDTO();
        response.setTotalAmount(total);
        response.setFestiveSurcharge(festiveSurcharge);
        return response;
    }
}
