package com.example.travelsite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.travelsite.model.Flight;
import com.example.travelsite.repository.FlightRepository;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findAllFlights() {
        return flightRepository.findAll();
    }
}
