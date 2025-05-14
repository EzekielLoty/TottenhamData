package com.tottstats.spursstats;


import com.tottstats.spursstats.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerStatsService {

    private final StandardStatsRepository standardStatsRepository;
    private final ShootingRepository shootingRepository;
    private final PassingRepository passingRepository;
    private final PassTypesRepository passTypesRepository;
    private final PossessionRepository possessionRepository;
    private final DefensiveActionsRepository defensiveActionsRepository;
    private final PlayingTimeRepository playingTimeRepository;
    private final GoalkeepingRepository goalkeepingRepository;
    private final AdvancedGoalkeepingRepository advancedGoalkeepingRepository;
    private final GoalAndShotCreationRepository goalAndShotCreationRepository;
    private final MiscellaneousRepository miscellaneousRepository;

    @Autowired
    public PlayerStatsService(StandardStatsRepository standardStatsRepository,
                              ShootingRepository shootingRepository, PassingRepository passingRepository,
                              PassTypesRepository passTypesRepository, PossessionRepository possessionRepository,
                              DefensiveActionsRepository defensiveActionsRepository, PlayingTimeRepository playingTimeRepository,
                              GoalkeepingRepository goalkeepingRepository, AdvancedGoalkeepingRepository advancedGoalkeepingRepository,
                              GoalAndShotCreationRepository goalAndShotCreationRepository, MiscellaneousRepository miscellaneousRepository) {
        this.standardStatsRepository = standardStatsRepository;
        this.shootingRepository = shootingRepository;
        this.passingRepository = passingRepository;
        this.passTypesRepository = passTypesRepository;
        this.possessionRepository = possessionRepository;
        this.defensiveActionsRepository = defensiveActionsRepository;
        this.playingTimeRepository = playingTimeRepository;
        this.goalkeepingRepository = goalkeepingRepository;
        this.advancedGoalkeepingRepository = advancedGoalkeepingRepository;
        this.goalAndShotCreationRepository = goalAndShotCreationRepository;
        this.miscellaneousRepository = miscellaneousRepository;
    }

    public List<PlayerStatsDTO> findPlayersByName(String nameSearch) {
        // Get player names from any of the tables (using StandardStats as the reference)
        List<String> playerNames = standardStatsRepository.findPlayerNamesByNameContainingIgnoreCase(nameSearch);

        List<PlayerStatsDTO> result = new ArrayList<>();

        for (String playerName : playerNames) {
            PlayerStatsDTO dto = new PlayerStatsDTO();
            dto.setPlayerName(playerName);

            // Get all stats for this player
            dto.setStandardStats(standardStatsRepository.findByPlayer(playerName));
            dto.setShooting(shootingRepository.findByPlayer(playerName));
            dto.setPassing(passingRepository.findByPlayer(playerName));
            dto.setPassTypes(passTypesRepository.findByPlayer(playerName));
            dto.setPossession(possessionRepository.findByPlayer(playerName));
            dto.setDefensiveActions(defensiveActionsRepository.findByPlayer(playerName));
            dto.setPlayingTime(playingTimeRepository.findByPlayer(playerName));
            dto.setGoalkeeping(goalkeepingRepository.findByPlayer(playerName));
            dto.setAdvancedGoalkeeping(advancedGoalkeepingRepository.findByPlayer(playerName));
            dto.setGoalAndShotCreation(goalAndShotCreationRepository.findByPlayer(playerName));
            dto.setMiscellaneous(miscellaneousRepository.findByPlayer(playerName));

            result.add(dto);
        }

        return result;
    }
}