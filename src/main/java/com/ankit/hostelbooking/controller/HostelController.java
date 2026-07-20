package com.ankit.hostelbooking.controller;

import com.ankit.hostelbooking.entity.Hostel;
import com.ankit.hostelbooking.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostels")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://studo-frontend.vercel.app",
        "https://stubo.in",
        "https://www.stubo.in"
})
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

    @GetMapping("/{id}")
    public Hostel getHostelById(@PathVariable Integer id) {
        return hostelService.getHostelById(id);
    }

    @GetMapping("/city/{city}")
    public List<Hostel> getHostelsByCity(@PathVariable String city) {
        return hostelService.getHostelsByCity(city);
    }

    @GetMapping("/price/{price}")
    public List<Hostel> getHostelsByPrice(@PathVariable Double price) {
        return hostelService.getHostelsByPrice(price);
    }

    @GetMapping("/search/{name}")
    public List<Hostel> searchByName(@PathVariable String name) {
        return hostelService.getHostelsByName(name);
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