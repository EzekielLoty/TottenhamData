package com.tottstats.spursstats.repository;

import com.tottstats.spursstats.tables.PlayingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayingTimeRepository extends JpaRepository<PlayingTime, Long> {
    PlayingTime findByPlayer(String player);

    @Query("SELECT DISTINCT p.player FROM PlayingTime p WHERE LOWER(p.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}


