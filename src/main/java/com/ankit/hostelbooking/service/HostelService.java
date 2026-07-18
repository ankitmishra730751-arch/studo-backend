package com.ankit.hostelbooking.service;

import com.ankit.hostelbooking.entity.Hostel;
import com.ankit.hostelbooking.repository.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelService {

    @Autowired
    private HostelRepository hostelRepository;

    public Hostel saveHostel(Hostel hostel) {
        return hostelRepository.save(hostel);
    }

    public List<Hostel> getAllHostels() {
        return hostelRepository.findAll();
    }

    public Hostel getHostelById(Integer id) {
        return hostelRepository.findById(id).orElse(null);
    }

    public List<Hostel> getHostelsByCity(String city) {
        return hostelRepository.findByCity(city);
    }

    public List<Hostel> getHostelsByPrice(Double price) {
        return hostelRepository.findByPriceLessThanEqual(price);
    }

    public List<Hostel> getHostelsByName(String name) {
        return hostelRepository.findByNameContainingIgnoreCase(name);
    }

    public Hostel updateHostel(Integer id, Hostel updatedHostel) {

        Hostel hostel = hostelRepository.findById(id).orElse(null);

        if (hostel != null) {

            hostel.setName(updatedHostel.getName());
            hostel.setCity(updatedHostel.getCity());
            hostel.setLocation(updatedHostel.getLocation());
            hostel.setPrice(updatedHostel.getPrice());
            hostel.setRent(updatedHostel.getRent());
            hostel.setImageUrl(updatedHostel.getImageUrl());
            hostel.setGalleryImages(updatedHostel.getGalleryImages());
            hostel.setRating(updatedHostel.getRating());
            hostel.setReviews(updatedHostel.getReviews());
            hostel.setDistance(updatedHostel.getDistance());
            hostel.setHostelType(updatedHostel.getHostelType());
            hostel.setSharingType(updatedHostel.getSharingType());
            hostel.setMess(updatedHostel.getMess());
            hostel.setOwnerPhone(updatedHostel.getOwnerPhone());
            hostel.setFacilities(updatedHostel.getFacilities());
            hostel.setDescription(updatedHostel.getDescription());

            return hostelRepository.save(hostel);
        }

        return null;
    }

    public void deleteHostel(Integer id) {
        hostelRepository.deleteById(id);
    }
}