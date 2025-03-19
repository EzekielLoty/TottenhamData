package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "playing_time", schema = "tott_stats")
public class PlayingTime {

    @Id
    @Column(name = "Player", unique = true, nullable = false)
    private String player;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Pos")
    private String position;

    @Column(name = "Age")
    private String age;

    @Column(name = "MP")
    private Integer matchesPlayed;

    @Column(name = "Playing TimeMin")
    private Double minutesPlayed;

    @Column(name = "Playing TimeMn/MP")
    private Double minutesPerMatch;

    @Column(name = "Playing TimeMin%")
    private Double percentageMinutesPlayed;

    @Column(name = "Playing Time90s")
    private Double ninetyMinutesPlayed;

    @Column(name = "StartsStarts")
    private Integer starts;

    @Column(name = "StartsMn/Start")
    private Double minutesPerStart;

    @Column(name = "StartsCompl")
    private Integer completeMatches;

    @Column(name = "SubsSubs")
    private Integer substitutions;

    @Column(name = "SubsMn/Sub")
    private Double minutesPerSubstitution;

    @Column(name = "SubsunSub")
    private Integer unusedSubstitutes;

    @Column(name = "Team SuccessPPM")
    private Double pointsPerMatch;

    @Column(name = "Team SuccessonG")
    private Double teamGoalsWhenOnField;

    @Column(name = "Team SuccessonGA")
    private Double teamGoalsAgainstWhenOnField;

    @Column(name = "Team Success+/-")
    private Double teamGoalDifference;

    @Column(name = "Team Success+/-90")
    private Double teamGoalDifferencePer90;

    @Column(name = "Team SuccessOn-Off")
    private Double teamPerformanceOnOff;

    @Column(name = "Team Success (xG)onxG")
    private Double expectedGoalsWhenOnField;

    @Column(name = "Team Success (xG)onxGA")
    private Double expectedGoalsAgainstWhenOnField;

    @Column(name = "Team Success (xG)xG+/-")
    private Double expectedGoalDifference;

    @Column(name = "Team Success (xG)xG+/-90")
    private Double expectedGoalDifferencePer90;

    @Column(name = "Team Success (xG)On-Off")
    private Double expectedGoalsOnOff;

    // Default constructor
    public PlayingTime() {
    }

    public PlayingTime(String player, String nation, String position, String age, Integer matchesPlayed, Double minutesPlayed, Double minutesPerMatch, Double percentageMinutesPlayed, Double ninetyMinutesPlayed, Integer starts, Double minutesPerStart, Integer completeMatches, Integer substitutions, Double minutesPerSubstitution, Integer unusedSubstitutes, Double pointsPerMatch, Double teamGoalsWhenOnField, Double teamGoalsAgainstWhenOnField, Double teamGoalDifference, Double teamGoalDifferencePer90, Double teamPerformanceOnOff, Double expectedGoalsWhenOnField, Double expectedGoalsAgainstWhenOnField, Double expectedGoalDifference, Double expectedGoalDifferencePer90, Double expectedGoalsOnOff) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.minutesPlayed = minutesPlayed;
        this.minutesPerMatch = minutesPerMatch;
        this.percentageMinutesPlayed = percentageMinutesPlayed;
        this.ninetyMinutesPlayed = ninetyMinutesPlayed;
        this.starts = starts;
        this.minutesPerStart = minutesPerStart;
        this.completeMatches = completeMatches;
        this.substitutions = substitutions;
        this.minutesPerSubstitution = minutesPerSubstitution;
        this.unusedSubstitutes = unusedSubstitutes;
        this.pointsPerMatch = pointsPerMatch;
        this.teamGoalsWhenOnField = teamGoalsWhenOnField;
        this.teamGoalsAgainstWhenOnField = teamGoalsAgainstWhenOnField;
        this.teamGoalDifference = teamGoalDifference;
        this.teamGoalDifferencePer90 = teamGoalDifferencePer90;
        this.teamPerformanceOnOff = teamPerformanceOnOff;
        this.expectedGoalsWhenOnField = expectedGoalsWhenOnField;
        this.expectedGoalsAgainstWhenOnField = expectedGoalsAgainstWhenOnField;
        this.expectedGoalDifference = expectedGoalDifference;
        this.expectedGoalDifferencePer90 = expectedGoalDifferencePer90;
        this.expectedGoalsOnOff = expectedGoalsOnOff;
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

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public Double getMinutesPerMatch() {
        return minutesPerMatch;
    }

    public Double getPercentageMinutesPlayed() {
        return percentageMinutesPlayed;
    }

    public Double getNinetyMinutesPlayed() {
        return ninetyMinutesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMinutesPerStart() {
        return minutesPerStart;
    }

    public Integer getCompleteMatches() {
        return completeMatches;
    }

    public Integer getSubstitutions() {
        return substitutions;
    }

    public Double getMinutesPerSubstitution() {
        return minutesPerSubstitution;
    }

    public Integer getUnusedSubstitutes() {
        return unusedSubstitutes;
    }

    public Double getPointsPerMatch() {
        return pointsPerMatch;
    }

    public Double getTeamGoalsWhenOnField() {
        return teamGoalsWhenOnField;
    }

    public Double getTeamGoalsAgainstWhenOnField() {
        return teamGoalsAgainstWhenOnField;
    }

    public Double getTeamGoalDifference() {
        return teamGoalDifference;
    }

    public Double getTeamGoalDifferencePer90() {
        return teamGoalDifferencePer90;
    }

    public Double getTeamPerformanceOnOff() {
        return teamPerformanceOnOff;
    }

    public Double getExpectedGoalsWhenOnField() {
        return expectedGoalsWhenOnField;
    }

    public Double getExpectedGoalsAgainstWhenOnField() {
        return expectedGoalsAgainstWhenOnField;
    }

    public Double getExpectedGoalDifference() {
        return expectedGoalDifference;
    }

    public Double getExpectedGoalDifferencePer90() {
        return expectedGoalDifferencePer90;
    }

    public Double getExpectedGoalsOnOff() {
        return expectedGoalsOnOff;
    }
}
