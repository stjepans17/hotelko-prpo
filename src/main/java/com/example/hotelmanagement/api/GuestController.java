package com.example.hotelmanagement.api;

import com.example.hotelmanagement.entities.GuestDto;
import com.example.hotelmanagement.entities.repositories.GuestRepository; // importam guestRepository iz packagea (rabimo ga za interakcijo z GuestDto objektom)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1") // Base path za nase api poti (npr. /api/v1/guests )
public class GuestController {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping("/guests")
    public ResponseEntity<List<GuestDto>> returnGuests() {
        List<GuestDto> guests = guestRepository.findAll();
        return ResponseEntity.ok(guests);
    }
}