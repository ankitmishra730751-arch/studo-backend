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

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.addBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
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
