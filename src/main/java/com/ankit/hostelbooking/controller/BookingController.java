package com.ankit.hostelbooking.controller;

import com.ankit.hostelbooking.entity.Booking;
import com.ankit.hostelbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/add/{userId}/{hostelId}")
    public Booking addBooking(
            @RequestBody Booking booking,
            @PathVariable Integer userId,
            @PathVariable Integer hostelId) {

        return bookingService.addBooking(booking, userId, hostelId);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Integer id) {
        return bookingService.getBookingById(id);
    }
    @PutMapping("/update/{id}")
    public Booking updateBooking(@PathVariable Integer id,
                                 @RequestBody Booking booking) {

        return bookingService.updateBooking(id, booking);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
        return "Booking Deleted Successfully";
    }
}
