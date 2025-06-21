package com.example.travelsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelsite.entity.Flight;
import com.example.travelsite.repository.FlightRepository;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    // すべてのフライトを取得
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    // 出発地と目的地で検索
    public List<Flight> searchFlights(String departure, String destination) {
        return flightRepository.findByDepartureAndDestination(departure, destination);
    }

    // フライトを保存（追加）
    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
