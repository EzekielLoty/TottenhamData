package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "goalkeeping", schema = "tott_stats")
public class Goalkeeping {

    @Id
    @Column(name = "player", unique = true, nullable = false)
    private String player;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String position;

    @Column(name = "age")
    private String age;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played")
    private Integer minutesPlayed;

    @Column(name = "minutes_per_90")
    private Double ninetyMinutes;

    @Column(name = "goals_against")
    private Integer goalsAgainst;

    @Column(name = "goals_against_per_90")
    private Double goalsAgainstPer90;

    @Column(name = "shots_on_target_against")
    private Integer shotsOnTargetAgainst;

    @Column(name = "saves")
    private Integer saves;

    @Column(name = "save_percentage")
    private Double savePercentage;

    @Column(name = "wins")
    private Integer wins;

    @Column(name = "draws")
    private Integer draws;

    @Column(name = "losses")
    private Double losses;

    @Column(name = "clean_sheets")
    private Integer cleanSheets;

    @Column(name = "clean_sheet_percentage")
    private Double cleanSheetPercentage;

    @Column(name = "penalties_faced")
    private Integer penaltyKicksAttempted;

    @Column(name = "penalties_allowed")
    private Integer penaltyKicksAllowed;

    @Column(name = "penalties_saved")
    private Integer penaltyKicksSaved;

    @Column(name = "penalties_missed_by_opponents")
    private Integer penaltyKicksMissed;

    @Column(name = "penalty_save_percentage")
    private Double penaltySavePercentage;


    // Default constructor
    public Goalkeeping() {
    }

    public Goalkeeping(String player, String nation, String position, String age, Integer matchesPlayed, Integer starts, Integer minutesPlayed, Double ninetyMinutes, Integer goalsAgainst, Double goalsAgainstPer90, Integer shotsOnTargetAgainst, Integer saves, Double savePercentage, Integer wins, Integer draws, Double losses, Integer cleanSheets, Double cleanSheetPercentage, Integer penaltyKicksAttempted, Integer penaltyKicksAllowed, Integer penaltyKicksSaved, Integer penaltyKicksMissed, Double penaltySavePercentage) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutesPlayed = minutesPlayed;
        this.ninetyMinutes = ninetyMinutes;
        this.goalsAgainst = goalsAgainst;
        this.goalsAgainstPer90 = goalsAgainstPer90;
        this.shotsOnTargetAgainst = shotsOnTargetAgainst;
        this.saves = saves;
        this.savePercentage = savePercentage;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.cleanSheets = cleanSheets;
        this.cleanSheetPercentage = cleanSheetPercentage;
        this.penaltyKicksAttempted = penaltyKicksAttempted;
        this.penaltyKicksAllowed = penaltyKicksAllowed;
        this.penaltyKicksSaved = penaltyKicksSaved;
        this.penaltyKicksMissed = penaltyKicksMissed;
        this.penaltySavePercentage = penaltySavePercentage;
    }


    public String getPlayer() {
        return player;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public String getAge() {
        return age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public Double getNinetyMinutes() {
        return ninetyMinutes;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public Double getGoalsAgainstPer90() {
        return goalsAgainstPer90;
    }

    public Integer getShotsOnTargetAgainst() {
        return shotsOnTargetAgainst;
    }

    public Integer getSaves() {
        return saves;
    }

    public Double getSavePercentage() {
        return savePercentage;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getDraws() {
        return draws;
    }

    public Double getLosses() {
        return losses;
    }

    public Integer getCleanSheets() {
        return cleanSheets;
    }

    public Double getCleanSheetPercentage() {
        return cleanSheetPercentage;
    }

    public Integer getPenaltyKicksAttempted() {
        return penaltyKicksAttempted;
    }

    public Integer getPenaltyKicksAllowed() {
        return penaltyKicksAllowed;
    }

    public Integer getPenaltyKicksSaved() {
        return penaltyKicksSaved;
    }

    public Integer getPenaltyKicksMissed() {
        return penaltyKicksMissed;
    }

    public Double getPenaltySavePercentage() {
        return penaltySavePercentage;
    }
}

