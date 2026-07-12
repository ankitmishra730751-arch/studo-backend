package com.ankit.hostelbooking.service;
import com.ankit.hostelbooking.entity.User;
import com.ankit.hostelbooking.entity.Hostel;
import java.time.LocalDate;

import com.ankit.hostelbooking.repository.UserRepository;
import com.ankit.hostelbooking.repository.HostelRepository;
import com.ankit.hostelbooking.entity.Booking;
import com.ankit.hostelbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HostelRepository hostelRepository;

    public Booking addBooking(Booking booking, Integer userId, Integer hostelId) {

        User user = userRepository.findById(userId).orElse(null);
        Hostel hostel = hostelRepository.findById(hostelId).orElse(null);

        booking.setUser(user);
        booking.setHostel(hostel);
        booking.setBookingDate(LocalDate.now());
        booking.setStatus("PENDING");

        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
    public Booking getBookingById(Integer id) {
        return bookingRepository.findById(id).orElse(null);
    }
    public Booking updateBooking(Integer id, Booking updatedBooking) {

        Booking booking = bookingRepository.findById(id).orElse(null);

        if (booking != null) {

            booking.setRoomType(updatedBooking.getRoomType());
            booking.setBookingDate(updatedBooking.getBookingDate());
            booking.setStatus(updatedBooking.getStatus());

            if (updatedBooking.getUser() != null) {
                booking.setUser(updatedBooking.getUser());
            }

            if (updatedBooking.getHostel() != null) {
                booking.setHostel(updatedBooking.getHostel());
            }

            return bookingRepository.save(booking);
        }

        return null;
    }
    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }
}
