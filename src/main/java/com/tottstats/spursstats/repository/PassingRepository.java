package com.tottstats.spursstats.repository;

import com.tottstats.spursstats.tables.Passing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PassingRepository extends JpaRepository<Passing, Long> {
    Passing findByPlayer(String player);

    @Query("SELECT DISTINCT p.player FROM Passing p WHERE LOWER(p.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}


