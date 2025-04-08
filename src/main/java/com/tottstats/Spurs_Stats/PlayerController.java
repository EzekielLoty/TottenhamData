package com.tottstats.Spurs_Stats;

import com.tottstats.Spurs_Stats.repository.*;
import com.tottstats.Spurs_Stats.tables.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerStatsService playerStatsService;

    @Autowired
    StandardStatsRepository standardStatsRepository;

    @Autowired
    AdvancedGoalkeepingRepository advancedGoalkeepingRepository;

    @Autowired
    DefensiveActionsRepository defensiveActionsRepository;

    @Autowired
    GoalAndShotCreationRepository goalAndShotCreationRepository;

    @Autowired
    GoalkeepingRepository goalkeepingRepository;

    @Autowired
    MiscellaneousRepository miscellaneousRepository;

    @Autowired
    PassingRepository passingRepository;

    @Autowired
    PassTypesRepository passTypesRepository;

    @Autowired
    PlayingTimeRepository playingTimeRepository;

    @Autowired
    PossessionRepository possessionRepository;

    @Autowired
    ShootingRepository shootingRepository;

    @Autowired
    public PlayerController(PlayerStatsService playerStatsService) {
        this.playerStatsService = playerStatsService;
    }

    // GET mappings

    @GetMapping("/search")
    public ResponseEntity<List<PlayerStatsDTO>> searchPlayersByName(@RequestParam String player) {
        List<PlayerStatsDTO> playerStats = playerStatsService.findPlayersByName(player);
        return ResponseEntity.ok(playerStats);
    }

    @GetMapping("/get-standard-player-stats")
    public List<StandardStats> getAllStandardStats() {
        return standardStatsRepository.findAll();
    }

    @GetMapping("/get-advanced-goalkeeping-stats")
    public List<AdvancedGoalkeeping> getAllAdvancedGoalkeeping() {
        return advancedGoalkeepingRepository.findAll();
    }

    @GetMapping("/get-defensive-actions")
    public List<DefensiveActions> getAllDefensiveActions() {
        return defensiveActionsRepository.findAll();
    }

    @GetMapping("/get-goal-and-shot-creation")
    public List<GoalAndShotCreation> getAllGoalAndShotCreation() {
        return goalAndShotCreationRepository.findAll();
    }

    @GetMapping("/get-goalkeeping-stats")
    public List<Goalkeeping> getAllGoalkeeping() {
        return goalkeepingRepository.findAll();
    }

    @GetMapping("/get-miscellaneous-stats")
    public List<Miscellaneous> getAllMiscellaneous() {
        return miscellaneousRepository.findAll();
    }

    @GetMapping("/get-passing-stats")
    public List<Passing> getAllPassing() {
        return passingRepository.findAll();
    }

    @GetMapping("/get-pass-types")
    public List<PassTypes> getAllPassTypes() {
        return passTypesRepository.findAll();
    }

    @GetMapping("/get-playing-time")
    public List<PlayingTime> getAllPlayingTime() {
        return playingTimeRepository.findAll();
    }

    @GetMapping("/get-possession-stats")
    public List<Possession> getAllPossession() {
        return possessionRepository.findAll();
    }

    @GetMapping("/get-shooting-stats")
    public List<Shooting> getAllShooting() {
        return shootingRepository.findAll();
    }
}

