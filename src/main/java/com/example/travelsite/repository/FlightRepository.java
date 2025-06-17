package com.example.travelsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travelsite.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    // 必要なら検索用メソッドを追加できます
}
