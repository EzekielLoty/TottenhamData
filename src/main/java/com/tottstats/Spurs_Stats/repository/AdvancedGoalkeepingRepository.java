package com.tottstats.Spurs_Stats.repository;

import com.tottstats.Spurs_Stats.tables.AdvancedGoalkeeping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdvancedGoalkeepingRepository extends JpaRepository<AdvancedGoalkeeping, Long> {
    AdvancedGoalkeeping findByPlayer(String player);

    @Query("SELECT DISTINCT a.player FROM AdvancedGoalkeeping a WHERE LOWER(a.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}


