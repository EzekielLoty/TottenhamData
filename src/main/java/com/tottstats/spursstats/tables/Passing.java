package com.tottstats.spursstats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "passing", schema = "tott_stats")
public class Passing {

    @Id
    @Column(name = "player", unique = true, nullable = false)
    private String player;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String pos;

    @Column(name = "age")
    private String age;

    @Column(name = "minutes_played")
    private Double ninetyMinutes;

    @Column(name = "total_passes_completed")
    private Integer totalCompletedPasses;

    @Column(name = "total_passes_attempted")
    private Integer totalAttemptedPasses;

    @Column(name = "total_pass_completion_rate")
    private Double totalCompletedPercentage;

    @Column(name = "total_pass_distance")
    private Integer totalTotalDistance;

    @Column(name = "progressive_pass_distance")
    private Integer totalProgressiveDistance;

    @Column(name = "short_passes_completed")
    private Integer shortCompletedPasses;

    @Column(name = "short_passes_attempted")
    private Integer shortAttemptedPasses;

    @Column(name = "short_pass_completion_rate")
    private Double shortCompletedPercentage;

    @Column(name = "medium_passes_completed")
    private Integer mediumCompletedPasses;

    @Column(name = "medium_passes_attempted")
    private Long mediumAttemptedPasses;

    @Column(name = "medium_pass_completion_rate")
    private Double mediumCompletedPercentage;

    @Column(name = "long_passes_completed")
    private Integer longCompletedPasses;

    @Column(name = "long_passes_attempted")
    private Integer longAttemptedPasses;

    @Column(name = "long_pass_completion_rate")
    private Double longCompletedPercentage;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "expected_assisted_goals")
    private Double expectedAssists;

    @Column(name = "expected_assists")
    private Double expectedExpectedAssists;

    @Column(name = "assist_minus_xag")
    private Double expectedAssistsMinusxAG;

    @Column(name = "key_passes")
    private Integer keyPasses;

    @Column(name = "passes_into_final_third")
    private Integer passesIn1stThird;

    @Column(name = "passes_into_penalty_area")
    private Integer passesIntoPenaltyArea;

    @Column(name = "crosses_into_penalty_area")
    private Integer crossesIntoPenaltyArea;

    @Column(name = "progressive_passes")
    private Integer progressivePasses;

    public Passing(){

    }

    // Constructor with parameters
    public Passing(String player, String nation, String pos, String age, Double ninetyMinutes, Integer totalCompletedPasses,
                   Integer totalAttemptedPasses, Double totalCompletedPercentage, Integer totalTotalDistance,
                   Integer totalProgressiveDistance, Integer shortCompletedPasses, Integer shortAttemptedPasses,
                   Double shortCompletedPercentage, Integer mediumCompletedPasses, Long mediumAttemptedPasses,
                   Double mediumCompletedPercentage, Integer longCompletedPasses, Integer longAttemptedPasses,
                   Double longCompletedPercentage, Integer assists, Double expectedAssists, Double expectedExpectedAssists,
                   Double expectedAssistsMinusxAG, Integer keyPasses, Integer passesIn1stThird, Integer passesIntoPenaltyArea,
                   Integer crossesIntoPenaltyArea, Integer progressivePasses) {
        this.player = player;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.totalCompletedPasses = totalCompletedPasses;
        this.totalAttemptedPasses = totalAttemptedPasses;
        this.totalCompletedPercentage = totalCompletedPercentage;
        this.totalTotalDistance = totalTotalDistance;
        this.totalProgressiveDistance = totalProgressiveDistance;
        this.shortCompletedPasses = shortCompletedPasses;
        this.shortAttemptedPasses = shortAttemptedPasses;
        this.shortCompletedPercentage = shortCompletedPercentage;
        this.mediumCompletedPasses = mediumCompletedPasses;
        this.mediumAttemptedPasses = mediumAttemptedPasses;
        this.mediumCompletedPercentage = mediumCompletedPercentage;
        this.longCompletedPasses = longCompletedPasses;
        this.longAttemptedPasses = longAttemptedPasses;
        this.longCompletedPercentage = longCompletedPercentage;
        this.assists = assists;
        this.expectedAssists = expectedAssists;
        this.expectedExpectedAssists = expectedExpectedAssists;
        this.expectedAssistsMinusxAG = expectedAssistsMinusxAG;
        this.keyPasses = keyPasses;
        this.passesIn1stThird = passesIn1stThird;
        this.passesIntoPenaltyArea = passesIntoPenaltyArea;
        this.crossesIntoPenaltyArea = crossesIntoPenaltyArea;
        this.progressivePasses = progressivePasses;
    }

    public String getPlayer() {
        return player;
    }

    public String getNation() {
        return nation;
    }

    public String getPos() {
        return pos;
    }

    public String getAge() {
        return age;
    }

    public Double getNinetyMinutes() {
        return ninetyMinutes;
    }

    public Integer getTotalCompletedPasses() {
        return totalCompletedPasses;
    }

    public Integer getTotalAttemptedPasses() {
        return totalAttemptedPasses;
    }

    public Double getTotalCompletedPercentage() {
        return totalCompletedPercentage;
    }

    public Integer getTotalTotalDistance() {
        return totalTotalDistance;
    }

    public Integer getTotalProgressiveDistance() {
        return totalProgressiveDistance;
    }

    public Integer getShortCompletedPasses() {
        return shortCompletedPasses;
    }

    public Integer getShortAttemptedPasses() {
        return shortAttemptedPasses;
    }

    public Double getShortCompletedPercentage() {
        return shortCompletedPercentage;
    }

    public Integer getMediumCompletedPasses() {
        return mediumCompletedPasses;
    }

    public Long getMediumAttemptedPasses() {
        return mediumAttemptedPasses;
    }

    public Double getMediumCompletedPercentage() {
        return mediumCompletedPercentage;
    }

    public Integer getLongCompletedPasses() {
        return longCompletedPasses;
    }

    public Integer getLongAttemptedPasses() {
        return longAttemptedPasses;
    }

    public Double getLongCompletedPercentage() {
        return longCompletedPercentage;
    }

    public Integer getAssists() {
        return assists;
    }

    public Double getExpectedAssists() {
        return expectedAssists;
    }

    public Double getExpectedExpectedAssists() {
        return expectedExpectedAssists;
    }

    public Double getExpectedAssistsMinusxAG() {
        return expectedAssistsMinusxAG;
    }

    public Integer getKeyPasses() {
        return keyPasses;
    }

    public Integer getPassesIn1stThird() {
        return passesIn1stThird;
    }

    public Integer getPassesIntoPenaltyArea() {
        return passesIntoPenaltyArea;
    }

    public Integer getCrossesIntoPenaltyArea() {
        return crossesIntoPenaltyArea;
    }

    public Integer getProgressivePasses() {
        return progressivePasses;
    }
}
