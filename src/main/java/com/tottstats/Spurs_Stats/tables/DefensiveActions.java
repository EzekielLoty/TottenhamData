package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "defensive_actions", schema = "tott_stats")
public class DefensiveActions {

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

    @Column(name = "TacklesTkl")
    private Integer tackles;

    @Column(name = "TacklesTklW")
    private Integer tacklesWon;

    @Column(name = "TacklesDef 3rd")
    private Integer tacklesDefensiveThird;

    @Column(name = "TacklesMid 3rd")
    private Integer tacklesMiddleThird;

    @Column(name = "TacklesAtt 3rd")
    private Integer tacklesAttackingThird;

    @Column(name = "ChallengesTkl")
    private Integer challengesTackles;

    @Column(name = "ChallengesAtt")
    private Integer challengesAttempted;

    @Column(name = "ChallengesTkl%")
    private Double challengesTacklePercentage;

    @Column(name = "ChallengesLost")
    private Integer challengesLost;

    @Column(name = "BlocksBlocks")
    private Integer blocks;

    @Column(name = "BlocksSh")
    private Integer blocksShots;

    @Column(name = "BlocksPass")
    private Integer blocksPasses;

    @Column(name = "Int")
    private Integer interceptions;

    @Column(name = "Tkl+Int")
    private Integer tacklesInterceptions;

    @Column(name = "Clr")
    private Integer clearances;

    @Column(name = "Err")
    private Integer errors;

    // Default constructor
    public DefensiveActions() {
    }

    public DefensiveActions(String player, String nation, String position, String age, Double ninetyMinutes, Integer tackles, Integer tacklesWon, Integer tacklesDefensiveThird, Integer tacklesMiddleThird, Integer tacklesAttackingThird, Integer challengesTackles, Integer challengesAttempted, Double challengesTacklePercentage, Integer challengesLost, Integer blocks, Integer blocksShots, Integer blocksPasses, Integer interceptions, Integer tacklesInterceptions, Integer clearances, Integer errors) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.tackles = tackles;
        this.tacklesWon = tacklesWon;
        this.tacklesDefensiveThird = tacklesDefensiveThird;
        this.tacklesMiddleThird = tacklesMiddleThird;
        this.tacklesAttackingThird = tacklesAttackingThird;
        this.challengesTackles = challengesTackles;
        this.challengesAttempted = challengesAttempted;
        this.challengesTacklePercentage = challengesTacklePercentage;
        this.challengesLost = challengesLost;
        this.blocks = blocks;
        this.blocksShots = blocksShots;
        this.blocksPasses = blocksPasses;
        this.interceptions = interceptions;
        this.tacklesInterceptions = tacklesInterceptions;
        this.clearances = clearances;
        this.errors = errors;
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

    public Integer getTackles() {
        return tackles;
    }

    public Integer getTacklesWon() {
        return tacklesWon;
    }

    public Integer getTacklesDefensiveThird() {
        return tacklesDefensiveThird;
    }

    public Integer getTacklesMiddleThird() {
        return tacklesMiddleThird;
    }

    public Integer getTacklesAttackingThird() {
        return tacklesAttackingThird;
    }

    public Integer getChallengesTackles() {
        return challengesTackles;
    }

    public Integer getChallengesAttempted() {
        return challengesAttempted;
    }

    public Double getChallengesTacklePercentage() {
        return challengesTacklePercentage;
    }

    public Integer getChallengesLost() {
        return challengesLost;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public Integer getBlocksShots() {
        return blocksShots;
    }

    public Integer getBlocksPasses() {
        return blocksPasses;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public Integer getTacklesInterceptions() {
        return tacklesInterceptions;
    }

    public Integer getClearances() {
        return clearances;
    }

    public Integer getErrors() {
        return errors;
    }
}
