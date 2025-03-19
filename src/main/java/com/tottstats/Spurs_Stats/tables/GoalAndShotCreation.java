package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "goal_and_shot_creation", schema = "tott_stats")
public class GoalAndShotCreation {

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

    @Column(name = "SCASCA")
    private Integer shotCreatingActions;

    @Column(name = "SCASCA90")
    private Double shotCreatingActionsPer90;

    @Column(name = "SCA TypesPassLive")
    private Integer shotCreatingPassesLive;

    @Column(name = "SCA TypesPassDead")
    private Integer shotCreatingPassesDead;

    @Column(name = "SCA TypesTO")
    private Integer shotCreatingTakeOns;

    @Column(name = "SCA TypesSh")
    private Integer shotCreatingShots;

    @Column(name = "SCA TypesFld")
    private Integer shotCreatingFoulsDrawn;

    @Column(name = "SCA TypesDef")
    private Integer shotCreatingDefensiveActions;

    @Column(name = "GCAGCA")
    private Integer goalCreatingActions;

    @Column(name = "GCAGCA90")
    private Double goalCreatingActionsPer90;

    @Column(name = "GCA TypesPassLive")
    private Integer goalCreatingPassesLive;

    @Column(name = "GCA TypesPassDead")
    private Integer goalCreatingPassesDead;

    @Column(name = "GCA TypesTO")
    private Integer goalCreatingTakeOns;

    @Column(name = "GCA TypesSh")
    private Integer goalCreatingShots;

    @Column(name = "GCA TypesFld")
    private Integer goalCreatingFoulsDrawn;

    @Column(name = "GCA TypesDef")
    private Integer goalCreatingDefensiveActions;

    // Default constructor
    public GoalAndShotCreation() {
    }

    public GoalAndShotCreation(String player, String nation, String position, String age, Double ninetyMinutes, Integer shotCreatingActions, Double shotCreatingActionsPer90, Integer shotCreatingPassesLive, Integer shotCreatingPassesDead, Integer shotCreatingTakeOns, Integer shotCreatingShots, Integer shotCreatingFoulsDrawn, Integer shotCreatingDefensiveActions, Integer goalCreatingActions, Double goalCreatingActionsPer90, Integer goalCreatingPassesLive, Integer goalCreatingPassesDead, Integer goalCreatingTakeOns, Integer goalCreatingShots, Integer goalCreatingFoulsDrawn, Integer goalCreatingDefensiveActions) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.shotCreatingActions = shotCreatingActions;
        this.shotCreatingActionsPer90 = shotCreatingActionsPer90;
        this.shotCreatingPassesLive = shotCreatingPassesLive;
        this.shotCreatingPassesDead = shotCreatingPassesDead;
        this.shotCreatingTakeOns = shotCreatingTakeOns;
        this.shotCreatingShots = shotCreatingShots;
        this.shotCreatingFoulsDrawn = shotCreatingFoulsDrawn;
        this.shotCreatingDefensiveActions = shotCreatingDefensiveActions;
        this.goalCreatingActions = goalCreatingActions;
        this.goalCreatingActionsPer90 = goalCreatingActionsPer90;
        this.goalCreatingPassesLive = goalCreatingPassesLive;
        this.goalCreatingPassesDead = goalCreatingPassesDead;
        this.goalCreatingTakeOns = goalCreatingTakeOns;
        this.goalCreatingShots = goalCreatingShots;
        this.goalCreatingFoulsDrawn = goalCreatingFoulsDrawn;
        this.goalCreatingDefensiveActions = goalCreatingDefensiveActions;
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

    public Integer getShotCreatingActions() {
        return shotCreatingActions;
    }

    public Double getShotCreatingActionsPer90() {
        return shotCreatingActionsPer90;
    }

    public Integer getShotCreatingPassesLive() {
        return shotCreatingPassesLive;
    }

    public Integer getShotCreatingPassesDead() {
        return shotCreatingPassesDead;
    }

    public Integer getShotCreatingTakeOns() {
        return shotCreatingTakeOns;
    }

    public Integer getShotCreatingShots() {
        return shotCreatingShots;
    }

    public Integer getShotCreatingFoulsDrawn() {
        return shotCreatingFoulsDrawn;
    }

    public Integer getShotCreatingDefensiveActions() {
        return shotCreatingDefensiveActions;
    }

    public Integer getGoalCreatingActions() {
        return goalCreatingActions;
    }

    public Double getGoalCreatingActionsPer90() {
        return goalCreatingActionsPer90;
    }

    public Integer getGoalCreatingPassesLive() {
        return goalCreatingPassesLive;
    }

    public Integer getGoalCreatingPassesDead() {
        return goalCreatingPassesDead;
    }

    public Integer getGoalCreatingTakeOns() {
        return goalCreatingTakeOns;
    }

    public Integer getGoalCreatingShots() {
        return goalCreatingShots;
    }

    public Integer getGoalCreatingFoulsDrawn() {
        return goalCreatingFoulsDrawn;
    }

    public Integer getGoalCreatingDefensiveActions() {
        return goalCreatingDefensiveActions;
    }
}
