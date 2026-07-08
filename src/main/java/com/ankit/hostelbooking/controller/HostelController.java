package com.ankit.hostelbooking.controller;

import com.ankit.hostelbooking.entity.Hostel;
import com.ankit.hostelbooking.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostels")
public class HostelController {

    @Autowired
    private HostelService hostelService;

    @PostMapping("/add")
    public Hostel addHostel(@RequestBody Hostel hostel) {
        return hostelService.saveHostel(hostel);
    }

    @GetMapping
    public List<Hostel> getAllHostels() {
        return hostelService.getAllHostels();
    }

    @PutMapping("/update/{id}")
    public Hostel updateHostel(@PathVariable Integer id,
                               @RequestBody Hostel hostel) {
        return hostelService.updateHostel(id, hostel);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteHostel(@PathVariable Integer id) {
        hostelService.deleteHostel(id);
        return "Hostel Deleted Successfully";
    }
}
