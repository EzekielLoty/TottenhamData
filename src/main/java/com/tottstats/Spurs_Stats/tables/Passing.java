package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "passing", schema = "tott_stats")
public class Passing {

    @Id
    @Column(name = "Player", unique = true, nullable = false)
    private String player;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Pos")
    private String pos;

    @Column(name = "Age")
    private String age;

    @Column(name = "90s")
    private Double ninetyMinutes;

    @Column(name = "TotalCmp")
    private Integer totalCompletedPasses;

    @Column(name = "TotalAtt")
    private Integer totalAttemptedPasses;

    @Column(name = "TotalCmpPercentage")
    private Double totalCompletedPercentage;

    @Column(name = "TotalTotDist")
    private Integer totalTotalDistance;

    @Column(name = "TotalPrgDist")
    private Integer totalProgressiveDistance;

    @Column(name = "ShortCmp")
    private Integer shortCompletedPasses;

    @Column(name = "ShortAtt")
    private Integer shortAttemptedPasses;

    @Column(name = "ShortCmpPercentage")
    private Double shortCompletedPercentage;

    @Column(name = "MediumCmp")
    private Integer mediumCompletedPasses;

    @Column(name = "MediumAtt")
    private Long mediumAttemptedPasses;

    @Column(name = "MediumCmpPercentage")
    private Double mediumCompletedPercentage;

    @Column(name = "LongCmp")
    private Integer longCompletedPasses;

    @Column(name = "LongAtt")
    private Integer longAttemptedPasses;

    @Column(name = "LongCmpPercentage")
    private Double longCompletedPercentage;

    @Column(name = "Ast")
    private Integer assists;

    @Column(name = "xAG")
    private Double expectedAssists;

    @Column(name = "ExpectedxA")
    private Double expectedExpectedAssists;

    @Column(name = "ExpectedA_xAG")
    private Double expectedAssistsMinusxAG;

    @Column(name = "KP")
    private Integer keyPasses;

    @Column(name = "1/3")
    private Integer passesIn1stThird;

    @Column(name = "PPA")
    private Integer passesIntoPenaltyArea;

    @Column(name = "CrsPA")
    private Integer crossesIntoPenaltyArea;

    @Column(name = "PrgP")
    private Integer progressivePasses;

    // Default constructor
    public Passing() {
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
