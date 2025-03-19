package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "advanced_goalkeeping", schema = "tott_stats")
public class AdvancedGoalkeeping {

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

    @Column(name = "GoalsGA")
    private Long goalsAgainst;

    @Column(name = "GoalsPKA")
    private Long goalsPenaltyAgainst;

    @Column(name = "GoalsFK")
    private Long goalsFromFreeKicks;

    @Column(name = "GoalsCK")
    private Long goalsFromCornerKicks;

    @Column(name = "GoalsOG")
    private Long ownGoals;

    @Column(name = "ExpectedPSxG")
    private Double expectedPostShotXG;

    @Column(name = "ExpectedPSxG/SoT")
    private Double expectedPostShotXGPerShotOnTarget;

    @Column(name = "ExpectedPSxG+/-")
    private Double expectedPostShotXGPlusMinus;

    @Column(name = "Expected/90")
    private Double expectedPer90;

    @Column(name = "LaunchedCmp")
    private Long launchedCompleted;

    @Column(name = "LaunchedAtt")
    private Integer launchedAttempted;

    @Column(name = "LaunchedCmp%")
    private Double launchedCompletionPercentage;

    @Column(name = "PassesAtt (GK)")
    private Integer passesAttempted;

    @Column(name = "PassesThr")
    private Integer passesThrown;

    @Column(name = "PassesLaunch%")
    private Double passesLaunchPercentage;

    @Column(name = "PassesAvgLen")
    private Double passesAverageLength;

    @Column(name = "Goal KicksAtt")
    private Long goalKicksAttempted;

    @Column(name = "Goal KicksLaunch%")
    private Double goalKicksLaunchPercentage;

    @Column(name = "Goal KicksAvgLen")
    private Double goalKicksAverageLength;

    @Column(name = "CrossesOpp")
    private Long crossesOpposed;

    @Column(name = "CrossesStp")
    private Long crossesStopped;

    @Column(name = "CrossesStp%")
    private Double crossesStoppedPercentage;

    @Column(name = "Sweeper#OPA")
    private Integer sweeperActionsOutsidePenaltyArea;

    @Column(name = "Sweeper#OPA/90")
    private Double sweeperActionsOutsidePenaltyAreaPer90;

    @Column(name = "SweeperAvgDist")
    private Double sweeperAverageDistance;

    // Default constructor
    public AdvancedGoalkeeping() {
    }

    public AdvancedGoalkeeping(String player, String nation, String position, String age, Double ninetyMinutes, Long goalsAgainst, Long goalsPenaltyAgainst, Long goalsFromFreeKicks, Long goalsFromCornerKicks, Long ownGoals, Double expectedPostShotXG, Double expectedPostShotXGPerShotOnTarget, Double expectedPostShotXGPlusMinus, Double expectedPer90, Long launchedCompleted, Integer launchedAttempted, Double launchedCompletionPercentage, Integer passesAttempted, Integer passesThrown, Double passesLaunchPercentage, Double passesAverageLength, Long goalKicksAttempted, Double goalKicksLaunchPercentage, Double goalKicksAverageLength, Long crossesOpposed, Long crossesStopped, Double crossesStoppedPercentage, Integer sweeperActionsOutsidePenaltyArea, Double sweeperActionsOutsidePenaltyAreaPer90, Double sweeperAverageDistance) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.goalsAgainst = goalsAgainst;
        this.goalsPenaltyAgainst = goalsPenaltyAgainst;
        this.goalsFromFreeKicks = goalsFromFreeKicks;
        this.goalsFromCornerKicks = goalsFromCornerKicks;
        this.ownGoals = ownGoals;
        this.expectedPostShotXG = expectedPostShotXG;
        this.expectedPostShotXGPerShotOnTarget = expectedPostShotXGPerShotOnTarget;
        this.expectedPostShotXGPlusMinus = expectedPostShotXGPlusMinus;
        this.expectedPer90 = expectedPer90;
        this.launchedCompleted = launchedCompleted;
        this.launchedAttempted = launchedAttempted;
        this.launchedCompletionPercentage = launchedCompletionPercentage;
        this.passesAttempted = passesAttempted;
        this.passesThrown = passesThrown;
        this.passesLaunchPercentage = passesLaunchPercentage;
        this.passesAverageLength = passesAverageLength;
        this.goalKicksAttempted = goalKicksAttempted;
        this.goalKicksLaunchPercentage = goalKicksLaunchPercentage;
        this.goalKicksAverageLength = goalKicksAverageLength;
        this.crossesOpposed = crossesOpposed;
        this.crossesStopped = crossesStopped;
        this.crossesStoppedPercentage = crossesStoppedPercentage;
        this.sweeperActionsOutsidePenaltyArea = sweeperActionsOutsidePenaltyArea;
        this.sweeperActionsOutsidePenaltyAreaPer90 = sweeperActionsOutsidePenaltyAreaPer90;
        this.sweeperAverageDistance = sweeperAverageDistance;
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

    public Long getGoalsAgainst() {
        return goalsAgainst;
    }

    public Long getGoalsPenaltyAgainst() {
        return goalsPenaltyAgainst;
    }

    public Long getGoalsFromFreeKicks() {
        return goalsFromFreeKicks;
    }

    public Long getGoalsFromCornerKicks() {
        return goalsFromCornerKicks;
    }

    public Long getOwnGoals() {
        return ownGoals;
    }

    public Double getExpectedPostShotXG() {
        return expectedPostShotXG;
    }

    public Double getExpectedPostShotXGPerShotOnTarget() {
        return expectedPostShotXGPerShotOnTarget;
    }

    public Double getExpectedPostShotXGPlusMinus() {
        return expectedPostShotXGPlusMinus;
    }

    public Double getExpectedPer90() {
        return expectedPer90;
    }

    public Long getLaunchedCompleted() {
        return launchedCompleted;
    }

    public Integer getLaunchedAttempted() {
        return launchedAttempted;
    }

    public Double getLaunchedCompletionPercentage() {
        return launchedCompletionPercentage;
    }

    public Integer getPassesAttempted() {
        return passesAttempted;
    }

    public Integer getPassesThrown() {
        return passesThrown;
    }

    public Double getPassesLaunchPercentage() {
        return passesLaunchPercentage;
    }

    public Double getPassesAverageLength() {
        return passesAverageLength;
    }

    public Long getGoalKicksAttempted() {
        return goalKicksAttempted;
    }

    public Double getGoalKicksLaunchPercentage() {
        return goalKicksLaunchPercentage;
    }

    public Double getGoalKicksAverageLength() {
        return goalKicksAverageLength;
    }

    public Long getCrossesOpposed() {
        return crossesOpposed;
    }

    public Long getCrossesStopped() {
        return crossesStopped;
    }

    public Double getCrossesStoppedPercentage() {
        return crossesStoppedPercentage;
    }

    public Integer getSweeperActionsOutsidePenaltyArea() {
        return sweeperActionsOutsidePenaltyArea;
    }

    public Double getSweeperActionsOutsidePenaltyAreaPer90() {
        return sweeperActionsOutsidePenaltyAreaPer90;
    }

    public Double getSweeperAverageDistance() {
        return sweeperAverageDistance;
    }
}
