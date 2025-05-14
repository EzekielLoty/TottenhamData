package com.tottstats.spursstats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "playing_time", schema = "tott_stats")
public class PlayingTime {

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

    @Column(name = "minutes_played")
    private Double minutesPlayed;

    @Column(name = "avg_minutes_per_match")
    private Double minutesPerMatch;

    @Column(name = "minutes_played_percentage")
    private Double percentageMinutesPlayed;

    @Column(name = "minutes_per_90")
    private Double ninetyMinutesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "avg_minutes_per_start")
    private Double minutesPerStart;

    @Column(name = "full_matches_played")
    private Integer completeMatches;

    @Column(name = "substitute_appearances")
    private Integer substitutions;

    @Column(name = "avg_minutes_per_sub")
    private Double minutesPerSubstitution;

    @Column(name = "unused_sub_appearances")
    private Integer unusedSubstitutes;

    @Column(name = "points_per_match")
    private Double pointsPerMatch;

    @Column(name = "team_goals_while_on_field")
    private Double teamGoalsWhenOnField;

    @Column(name = "team_goals_against_while_on_field")
    private Double teamGoalsAgainstWhenOnField;

    @Column(name = "team_goal_difference")
    private Double teamGoalDifference;

    @Column(name = "team_goal_diff_per_90")
    private Double teamGoalDifferencePer90;

    @Column(name = "team_goal_diff_on_off")
    private Double teamPerformanceOnOff;

    @Column(name = "team_expected_goals_on_field")
    private Double expectedGoalsWhenOnField;

    @Column(name = "team_expected_goals_against")
    private Double expectedGoalsAgainstWhenOnField;

    @Column(name = "team_expected_goal_diff")
    private Double expectedGoalDifference;

    @Column(name = "team_expected_goal_diff_per_90")
    private Double expectedGoalDifferencePer90;

    @Column(name = "team_expected_goal_diff_on_off")
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
