package com.ankit.hostelbooking.repository;

import com.ankit.hostelbooking.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface HostelRepository extends JpaRepository<Hostel, Integer> {
    List<Hostel>findByCity(String city);
    List<Hostel>findByPriceLessThanEqual(Double price);

}