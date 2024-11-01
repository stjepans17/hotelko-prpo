package com.example.hotelmanagement.entities.repositories;

import com.example.hotelmanagement.entities.GuestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<GuestDto, Long> {
}

