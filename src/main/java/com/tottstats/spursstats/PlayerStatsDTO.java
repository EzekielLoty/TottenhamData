package com.tottstats.spursstats;

import com.tottstats.spursstats.tables.*;
import com.tottstats.spursstats.tables.StandardStats;

public class PlayerStatsDTO {
    private String playerName;
    private StandardStats standardStats;
    private Shooting shooting;
    private Passing passing;
    private PassTypes passTypes;
    private Possession possession;
    private DefensiveActions defensiveActions;
    private PlayingTime playingTime;
    private Goalkeeping goalkeeping;
    private AdvancedGoalkeeping advancedGoalkeeping;
    private GoalAndShotCreation goalAndShotCreation;
    private Miscellaneous miscellaneous;

    // Getters and setters
    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public StandardStats getStandardStats() {
        return standardStats;
    }

    public void setStandardStats(StandardStats standardStats) {
        this.standardStats = standardStats;
    }

    public Shooting getShooting() {
        return shooting;
    }

    public void setShooting(Shooting shooting) {
        this.shooting = shooting;
    }

    public Passing getPassing() {
        return passing;
    }

    public void setPassing(Passing passing) {
        this.passing = passing;
    }

    public PassTypes getPassTypes() {
        return passTypes;
    }

    public void setPassTypes(PassTypes passTypes) {
        this.passTypes = passTypes;
    }

    public Possession getPossession() {
        return possession;
    }

    public void setPossession(Possession possession) {
        this.possession = possession;
    }

    public DefensiveActions getDefensiveActions() {
        return defensiveActions;
    }

    public void setDefensiveActions(DefensiveActions defensiveActions) {
        this.defensiveActions = defensiveActions;
    }

    public PlayingTime getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(PlayingTime playingTime) {
        this.playingTime = playingTime;
    }

    public Goalkeeping getGoalkeeping() {
        return goalkeeping;
    }

    public void setGoalkeeping(Goalkeeping goalkeeping) {
        this.goalkeeping = goalkeeping;
    }

    public AdvancedGoalkeeping getAdvancedGoalkeeping() {
        return advancedGoalkeeping;
    }

    public void setAdvancedGoalkeeping(AdvancedGoalkeeping advancedGoalkeeping) {
        this.advancedGoalkeeping = advancedGoalkeeping;
    }

    public GoalAndShotCreation getGoalAndShotCreation() {
        return goalAndShotCreation;
    }

    public void setGoalAndShotCreation(GoalAndShotCreation goalAndShotCreation) {
        this.goalAndShotCreation = goalAndShotCreation;
    }

    public Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Miscellaneous miscellaneous) {
        this.miscellaneous = miscellaneous;
    }
}
