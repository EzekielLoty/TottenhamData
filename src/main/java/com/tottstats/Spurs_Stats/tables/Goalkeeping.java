package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "goalkeeping", schema = "tott_stats")
public class Goalkeeping {

    @Id
    @Column(name = "Player", unique = true, nullable = false)
    private String player;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Pos")
    private String position;

    @Column(name = "Age")
    private String age;

    @Column(name = "Playing TimeMP")
    private Integer matchesPlayed;

    @Column(name = "Playing TimeStarts")
    private Integer starts;

    @Column(name = "Playing TimeMin")
    private Integer minutesPlayed;

    @Column(name = "Playing Time90s")
    private Double ninetyMinutes;

    @Column(name = "PerformanceGA")
    private Integer goalsAgainst;

    @Column(name = "PerformanceGA90")
    private Double goalsAgainstPer90;

    @Column(name = "PerformanceSoTA")
    private Integer shotsOnTargetAgainst;

    @Column(name = "PerformanceSaves")
    private Integer saves;

    @Column(name = "PerformanceSave%")
    private Double savePercentage;

    @Column(name = "PerformanceW")
    private Integer wins;

    @Column(name = "PerformanceD")
    private Integer draws;

    @Column(name = "PerformanceL")
    private Double losses;

    @Column(name = "PerformanceCS")
    private Integer cleanSheets;

    @Column(name = "PerformanceCS%")
    private Double cleanSheetPercentage;

    @Column(name = "Penalty KicksPKatt")
    private Integer penaltyKicksAttempted;

    @Column(name = "Penalty KicksPKA")
    private Integer penaltyKicksAllowed;

    @Column(name = "Penalty KicksPKsv")
    private Integer penaltyKicksSaved;

    @Column(name = "Penalty KicksPKm")
    private Integer penaltyKicksMissed;

    @Column(name = "Penalty KicksSave%")
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

