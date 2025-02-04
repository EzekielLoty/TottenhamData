package com.tottstats.Spurs_Stats;

import com.tottstats.Spurs_Stats.repository.PlayerRepository;
import com.tottstats.Spurs_Stats.tables.StandardStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/get-standard-player-stats")
    public List<StandardStats> getAllStandardStats(){
        return playerRepository.findAll();
    }
}
