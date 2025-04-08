package com.tottstats.Spurs_Stats.repository;

import com.tottstats.Spurs_Stats.tables.GoalAndShotCreation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GoalAndShotCreationRepository extends JpaRepository<GoalAndShotCreation, Long> {
    GoalAndShotCreation findByPlayer(String player);

    @Query("SELECT DISTINCT g.player FROM GoalAndShotCreation g WHERE LOWER(g.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}
