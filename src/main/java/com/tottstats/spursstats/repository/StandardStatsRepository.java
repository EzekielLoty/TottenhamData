package com.tottstats.spursstats.repository;

import com.tottstats.spursstats.tables.StandardStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StandardStatsRepository extends JpaRepository<StandardStats, Long> {
    StandardStats findByPlayer(String player);

    @Query("SELECT DISTINCT s.player FROM StandardStats s WHERE LOWER(s.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}
