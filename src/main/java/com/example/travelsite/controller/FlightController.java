package com.example.travelsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.travelsite.entity.Flight;
import com.example.travelsite.service.FlightService;

@Controller
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/searchFlight")
    public String showFlightSearchForm() {
        return "searchFlight"; // HTMLファイル名に対応
    }

    @PostMapping("/searchFlight")
    public String searchFlights(@RequestParam String departure,
                                @RequestParam String destination,
                                Model model) {
        List<Flight> results = flightService.searchFlights(departure, destination);
        model.addAttribute("flights", results);
        return "resultFlight"; // HTMLファイル名に対応
    }
    
    @GetMapping("/search-form")
    public String showSearchForm() {
        return "searchFlight"; // templates/searchFlight.html を指す
    }
}
