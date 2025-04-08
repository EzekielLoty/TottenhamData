package com.tottstats.Spurs_Stats.repository;

import com.tottstats.Spurs_Stats.tables.PassTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PassTypesRepository extends JpaRepository<PassTypes, Long> {
    PassTypes findByPlayer(String player);

    @Query("SELECT DISTINCT p.player FROM PassTypes p WHERE LOWER(p.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}


