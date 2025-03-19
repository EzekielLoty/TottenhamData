package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "shooting", schema = "tott_stats")
public class Shooting {

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

    @Column(name = "StandardGls")
    private Integer goals;

    @Column(name = "StandardSh")
    private Integer shots;

    @Column(name = "StandardSoT")
    private Integer shotsOnTarget;

    @Column(name = "StandardSoT%")
    private Double shotsOnTargetPercentage;

    @Column(name = "StandardSh/90")
    private Double shotsPer90;

    @Column(name = "StandardSoT/90")
    private Double shotsOnTargetPer90;

    @Column(name = "StandardG/Sh")
    private Double goalsPerShot;

    @Column(name = "StandardG/SoT")
    private Double goalsPerShotOnTarget;

    @Column(name = "StandardDist")
    private Double averageShotDistance;

    @Column(name = "StandardFK")
    private Integer freeKickShots;

    @Column(name = "StandardPK")
    private Integer penaltyGoals;

    @Column(name = "StandardPKatt")
    private Integer penaltyAttempts;

    @Column(name = "ExpectedxG")
    private Double expectedGoals;

    @Column(name = "ExpectednpxG")
    private Double nonPenaltyExpectedGoals;

    @Column(name = "ExpectednpxG/Sh")
    private Double nonPenaltyExpectedGoalsPerShot;

    @Column(name = "ExpectedG-xG")
    private Double goalsMinusExpectedGoals;

    @Column(name = "Expectednp:G-xG")
    private Double nonPenaltyGoalsMinusExpectedGoals;

    // Default constructor
    public Shooting() {
    }

    public Shooting(String player, String nation, String position, String age, Double ninetyMinutes, Integer goals, Integer shots, Integer shotsOnTarget, Double shotsOnTargetPercentage, Double shotsPer90, Double shotsOnTargetPer90, Double goalsPerShot, Double goalsPerShotOnTarget, Double averageShotDistance, Integer freeKickShots, Integer penaltyGoals, Integer penaltyAttempts, Double expectedGoals, Double nonPenaltyExpectedGoals, Double nonPenaltyExpectedGoalsPerShot, Double goalsMinusExpectedGoals, Double nonPenaltyGoalsMinusExpectedGoals) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.goals = goals;
        this.shots = shots;
        this.shotsOnTarget = shotsOnTarget;
        this.shotsOnTargetPercentage = shotsOnTargetPercentage;
        this.shotsPer90 = shotsPer90;
        this.shotsOnTargetPer90 = shotsOnTargetPer90;
        this.goalsPerShot = goalsPerShot;
        this.goalsPerShotOnTarget = goalsPerShotOnTarget;
        this.averageShotDistance = averageShotDistance;
        this.freeKickShots = freeKickShots;
        this.penaltyGoals = penaltyGoals;
        this.penaltyAttempts = penaltyAttempts;
        this.expectedGoals = expectedGoals;
        this.nonPenaltyExpectedGoals = nonPenaltyExpectedGoals;
        this.nonPenaltyExpectedGoalsPerShot = nonPenaltyExpectedGoalsPerShot;
        this.goalsMinusExpectedGoals = goalsMinusExpectedGoals;
        this.nonPenaltyGoalsMinusExpectedGoals = nonPenaltyGoalsMinusExpectedGoals;
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

    public Integer getGoals() {
        return goals;
    }

    public Integer getShots() {
        return shots;
    }

    public Integer getShotsOnTarget() {
        return shotsOnTarget;
    }

    public Double getShotsOnTargetPercentage() {
        return shotsOnTargetPercentage;
    }

    public Double getShotsPer90() {
        return shotsPer90;
    }

    public Double getShotsOnTargetPer90() {
        return shotsOnTargetPer90;
    }

    public Double getGoalsPerShot() {
        return goalsPerShot;
    }

    public Double getGoalsPerShotOnTarget() {
        return goalsPerShotOnTarget;
    }

    public Double getAverageShotDistance() {
        return averageShotDistance;
    }

    public Integer getFreeKickShots() {
        return freeKickShots;
    }

    public Integer getPenaltyGoals() {
        return penaltyGoals;
    }

    public Integer getPenaltyAttempts() {
        return penaltyAttempts;
    }

    public Double getExpectedGoals() {
        return expectedGoals;
    }

    public Double getNonPenaltyExpectedGoals() {
        return nonPenaltyExpectedGoals;
    }

    public Double getNonPenaltyExpectedGoalsPerShot() {
        return nonPenaltyExpectedGoalsPerShot;
    }

    public Double getGoalsMinusExpectedGoals() {
        return goalsMinusExpectedGoals;
    }

    public Double getNonPenaltyGoalsMinusExpectedGoals() {
        return nonPenaltyGoalsMinusExpectedGoals;
    }
}
