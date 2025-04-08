package com.tottstats.Spurs_Stats.repository;

import com.tottstats.Spurs_Stats.tables.Possession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PossessionRepository extends JpaRepository<Possession, Long> {
    Possession findByPlayer(String player);

    @Query("SELECT DISTINCT p.player FROM Possession p WHERE LOWER(p.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}

