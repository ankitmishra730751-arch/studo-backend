package com.ankit.hostelbooking.repository;

import com.ankit.hostelbooking.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository<Hostel, Integer> {

}