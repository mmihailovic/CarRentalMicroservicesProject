package com.example.userservice.repository;

import com.example.userservice.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface RankRepository extends JpaRepository<Rank, Long> {
    Optional<Rank> getByName(String name);
}
