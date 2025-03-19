package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "miscellaneous", schema = "tott_stats")
public class Miscellaneous {

    @Id
    @Column(name = "Player", unique = true, nullable = false)
    private String player;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Pos")
    private String position;

    @Column(name = "Age")
    private String age;

    @Column(name = "90s")
    private Double ninetyMinutes;

    @Column(name = "PerformanceCrdY")
    private Integer yellowCards;

    @Column(name = "PerformanceCrdR")
    private Integer redCards;

    @Column(name = "Performance2CrdY")
    private Integer secondYellowCards;

    @Column(name = "PerformanceFls")
    private Integer foulsCommitted;

    @Column(name = "PerformanceFld")
    private Integer foulsDrawn;

    @Column(name = "PerformanceOff")
    private Integer offsides;

    @Column(name = "PerformanceCrs")
    private Integer crosses;

    @Column(name = "PerformanceInt")
    private Integer interceptions;

    @Column(name = "PerformanceTklW")
    private Integer tacklesWon;

    @Column(name = "PerformancePKwon")
    private Integer penaltyKicksWon;

    @Column(name = "PerformancePKcon")
    private Integer penaltyKicksConceded;

    @Column(name = "PerformanceOG")
    private Integer ownGoals;

    @Column(name = "PerformanceRecov")
    private Integer recoveries;

    @Column(name = "Aerial DuelsWon")
    private Integer aerialDuelsWon;

    @Column(name = "Aerial DuelsLost")
    private Integer aerialDuelsLost;

    @Column(name = "Aerial DuelsWon%")
    private Double aerialDuelsWonPercentage;

    // Default constructor
    public Miscellaneous() {
    }

    public Miscellaneous(String player, String nation, String position, String age, Double ninetyMinutes, Integer yellowCards, Integer redCards, Integer secondYellowCards, Integer foulsCommitted, Integer foulsDrawn, Integer offsides, Integer crosses, Integer interceptions, Integer tacklesWon, Integer penaltyKicksWon, Integer penaltyKicksConceded, Integer ownGoals, Integer recoveries, Integer aerialDuelsWon, Integer aerialDuelsLost, Double aerialDuelsWonPercentage) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.secondYellowCards = secondYellowCards;
        this.foulsCommitted = foulsCommitted;
        this.foulsDrawn = foulsDrawn;
        this.offsides = offsides;
        this.crosses = crosses;
        this.interceptions = interceptions;
        this.tacklesWon = tacklesWon;
        this.penaltyKicksWon = penaltyKicksWon;
        this.penaltyKicksConceded = penaltyKicksConceded;
        this.ownGoals = ownGoals;
        this.recoveries = recoveries;
        this.aerialDuelsWon = aerialDuelsWon;
        this.aerialDuelsLost = aerialDuelsLost;
        this.aerialDuelsWonPercentage = aerialDuelsWonPercentage;
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

    public Double getNinetyMinutes() {
        return ninetyMinutes;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public Integer getSecondYellowCards() {
        return secondYellowCards;
    }

    public Integer getFoulsCommitted() {
        return foulsCommitted;
    }

    public Integer getFoulsDrawn() {
        return foulsDrawn;
    }

    public Integer getOffsides() {
        return offsides;
    }

    public Integer getCrosses() {
        return crosses;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public Integer getTacklesWon() {
        return tacklesWon;
    }

    public Integer getPenaltyKicksWon() {
        return penaltyKicksWon;
    }

    public Integer getPenaltyKicksConceded() {
        return penaltyKicksConceded;
    }

    public Integer getOwnGoals() {
        return ownGoals;
    }

    public Integer getRecoveries() {
        return recoveries;
    }

    public Integer getAerialDuelsWon() {
        return aerialDuelsWon;
    }

    public Integer getAerialDuelsLost() {
        return aerialDuelsLost;
    }

    public Double getAerialDuelsWonPercentage() {
        return aerialDuelsWonPercentage;
    }
}
