package com.tottstats.spursstats.repository;

import com.tottstats.spursstats.tables.Shooting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShootingRepository extends JpaRepository<Shooting, Long> {
    Shooting findByPlayer(String player);

    @Query("SELECT DISTINCT s.player FROM Shooting s WHERE LOWER(s.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}


