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

    public Hostel updateHostel(Integer id, Hostel updatedHostel) {

        Hostel hostel = hostelRepository.findById(id).orElse(null);

        if (hostel != null) {
            hostel.setName(updatedHostel.getName());
            hostel.setAddress(updatedHostel.getAddress());
            hostel.setCity(updatedHostel.getCity());
            hostel.setPrice(updatedHostel.getPrice());
            hostel.setDescription(updatedHostel.getDescription());
            hostel.setImageUrl(updatedHostel.getImageUrl());

            return hostelRepository.save(hostel);
        }

        return null;
    }

    public void deleteHostel(Integer id) {
        hostelRepository.deleteById(id);
    }
}