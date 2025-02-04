package com.tottstats.Spurs_Stats.repository;

import com.tottstats.Spurs_Stats.tables.StandardStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<StandardStats, String> {
}
