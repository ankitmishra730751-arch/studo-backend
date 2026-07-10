package com.ankit.hostelbooking.service;

import com.ankit.hostelbooking.entity.Booking;
import com.ankit.hostelbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
    public Booking updateBooking(Integer id, Booking updatedBooking) {

        Booking booking = bookingRepository.findById(id).orElse(null);

        if (booking != null) {
            booking.setStudentName(updatedBooking.getStudentName());
            booking.setHostelName(updatedBooking.getHostelName());
            booking.setRoomType(updatedBooking.getRoomType());
            booking.setBookingDate(updatedBooking.getBookingDate());

            return bookingRepository.save(booking);
        }

        return null;
    }
    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }
}
