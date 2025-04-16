package com.tottstats.spursstats.repository;

import com.tottstats.spursstats.tables.DefensiveActions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DefensiveActionsRepository extends JpaRepository<DefensiveActions, Long> {
    DefensiveActions findByPlayer(String player);

    @Query("SELECT DISTINCT d.player FROM DefensiveActions d WHERE LOWER(d.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}

