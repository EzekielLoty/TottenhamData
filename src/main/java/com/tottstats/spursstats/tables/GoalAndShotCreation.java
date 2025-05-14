package com.tottstats.spursstats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "goal_and_shot_creation", schema = "tott_stats")
public class GoalAndShotCreation {

    @Id
    @Column(name = "player", unique = true, nullable = false)
    private String player;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String position;

    @Column(name = "age")
    private String age;

    @Column(name = "minutes_played")
    private Double ninetyMinutes;

    @Column(name = "shot_creating_actions")
    private Integer shotCreatingActions;

    @Column(name = "shot_creating_actions_per_90")
    private Double shotCreatingActionsPer90;

    @Column(name = "sca_pass_live")
    private Integer shotCreatingPassesLive;

    @Column(name = "sca_pass_dead")
    private Integer shotCreatingPassesDead;

    @Column(name = "sca_take_on")
    private Integer shotCreatingTakeOns;

    @Column(name = "sca_shot")
    private Integer shotCreatingShots;

    @Column(name = "sca_fouled")
    private Integer shotCreatingFoulsDrawn;

    @Column(name = "sca_defense")
    private Integer shotCreatingDefensiveActions;

    @Column(name = "goal_creating_actions")
    private Integer goalCreatingActions;

    @Column(name = "goal_creating_actions_per_90")
    private Double goalCreatingActionsPer90;

    @Column(name = "gca_pass_live")
    private Integer goalCreatingPassesLive;

    @Column(name = "gca_pass_dead")
    private Integer goalCreatingPassesDead;

    @Column(name = "gca_take_on")
    private Integer goalCreatingTakeOns;

    @Column(name = "gca_shot")
    private Integer goalCreatingShots;

    @Column(name = "gca_fouled")
    private Integer goalCreatingFoulsDrawn;

    @Column(name = "gca_defense")
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
