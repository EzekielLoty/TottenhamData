package com.tottstats.spursstats.repository;

import com.tottstats.spursstats.tables.Goalkeeping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GoalkeepingRepository extends JpaRepository<Goalkeeping, Long> {
    Goalkeeping findByPlayer(String player);

    @Query("SELECT DISTINCT g.player FROM Goalkeeping g WHERE LOWER(g.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}


