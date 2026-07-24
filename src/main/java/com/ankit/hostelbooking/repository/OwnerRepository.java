package com.ankit.hostelbooking.repository;

import com.ankit.hostelbooking.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    Owner findByEmail(String email);

    Owner findByPhone(String phone);

    Owner findByHostelName(String hostelName);

}
