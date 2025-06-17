package com.example.travelsite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightController {

    @PostMapping("/searchFlights")
    public String searchFlights(@RequestParam String destination, @RequestParam String date, Model model) {
        // 簡易的にダミーのフライト情報を生成
        List<String> flights = new ArrayList<>();
        if (destination.equalsIgnoreCase("Tokyo")) {
            flights.add("Tokyo Flight 101 - 10:00");
            flights.add("Tokyo Flight 202 - 14:30");
        } else {
            flights.add("No flights available to " + destination);
        }

        model.addAttribute("destination", destination);
        model.addAttribute("date", date);
        model.addAttribute("flights", flights);

        return "results"; // templates/results.html を表示
    }
}
