package com.tottstats.Spurs_Stats.repository;

import com.tottstats.Spurs_Stats.tables.Miscellaneous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MiscellaneousRepository extends JpaRepository<Miscellaneous, Long> {
    Miscellaneous findByPlayer(String player);

    @Query("SELECT DISTINCT m.player FROM Miscellaneous m WHERE LOWER(m.player) LIKE LOWER(CONCAT('%', :player, '%'))")
    List<String> findPlayerNamesByNameContainingIgnoreCase(@Param("player") String player);
}

