package com.example.travelsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.travelsite.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    // 出発地と到着地でフライトを検索する例（後ほど利用可）
    List<Flight> findByDepartureAndDestination(String departure, String destination);

    @Query("SELECT DISTINCT f.departure FROM Flight f")
    List<String> findDistinctDepartures();

    @Query("SELECT DISTINCT f.destination FROM Flight f")
    List<String> findDistinctDestinations();
}
