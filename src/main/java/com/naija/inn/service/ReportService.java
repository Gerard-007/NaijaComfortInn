package com.naija.inn.service;

import com.naija.inn.model.Booking;
import com.naija.inn.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReportService {
    private final BookingRepository bookingRepository;

    public ReportService(BookingRepository reservationRepository) {
        this.bookingRepository = reservationRepository;
    }

    public String generateWeeklyReport() {
        LocalDate oneWeekAgo = LocalDate.now().minusDays(7);
        List<Booking> reservations = bookingRepository.findAll();

        long totalBookings = reservations.stream()
                .filter(res -> res.getCheckInDate().isAfter(oneWeekAgo))
                .count();

        double totalRevenue = reservations.stream()
                .mapToDouble(Booking::getTotalAmount)
                .sum();

        return "Weekly Report:\nTotal Bookings: " + totalBookings +
                "\nTotal Revenue: ₦" + totalRevenue;
    }
}
