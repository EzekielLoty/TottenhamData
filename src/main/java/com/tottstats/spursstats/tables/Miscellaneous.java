package com.tottstats.spursstats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "miscellaneous", schema = "tott_stats")
public class Miscellaneous {

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

    @Column(name = "yellow_cards")
    private Integer yellowCards;

    @Column(name = "red_cards")
    private Integer redCards;

    @Column(name = "second_yellow_cards")
    private Integer secondYellowCards;

    @Column(name = "fouls_committed")
    private Integer foulsCommitted;

    @Column(name = "fouls_drawn")
    private Integer foulsDrawn;

    @Column(name = "offsides")
    private Integer offsides;

    @Column(name = "crosses")
    private Integer crosses;

    @Column(name = "interceptions")
    private Integer interceptions;

    @Column(name = "tackles_won")
    private Integer tacklesWon;

    @Column(name = "penalties_won")
    private Integer penaltyKicksWon;

    @Column(name = "penalties_conceded")
    private Integer penaltyKicksConceded;

    @Column(name = "own_goals")
    private Integer ownGoals;

    @Column(name = "ball_recoveries")
    private Integer recoveries;

    @Column(name = "aerial_duels_won")
    private Integer aerialDuelsWon;

    @Column(name = "aerial_duels_lost")
    private Integer aerialDuelsLost;

    @Column(name = "aerial_duel_win_percentage")
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
