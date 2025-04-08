package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "advanced_goalkeeping", schema = "tott_stats")
public class AdvancedGoalkeeping {

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

    @Column(name = "goals_conceded")
    private Long goalsAgainst;

    @Column(name = "goals_penalty_conceded")
    private Long goalsPenaltyAgainst;

    @Column(name = "goals_from_free_kicks")
    private Long goalsFromFreeKicks;

    @Column(name = "goals_from_corners")
    private Long goalsFromCornerKicks;

    @Column(name = "own_goals")
    private Long ownGoals;

    @Column(name = "expected_psxg")
    private Double expectedPostShotXG;

    @Column(name = "expected_psxg_per_sot")
    private Double expectedPostShotXGPerShotOnTarget;

    @Column(name = "psxg_goals_difference")
    private Double expectedPostShotXGPlusMinus;

    @Column(name = "expected_per_90")
    private Double expectedPer90;

    @Column(name = "launched_passes_completed")
    private Long launchedCompleted;

    @Column(name = "launched_passes_attempted")
    private Integer launchedAttempted;

    @Column(name = "launched_passes_completion_rate")
    private Double launchedCompletionPercentage;

    @Column(name = "passes_attempted")
    private Integer passesAttempted;

    @Column(name = "passes_thrown")
    private Integer passesThrown;

    @Column(name = "passes_launch_percentage")
    private Double passesLaunchPercentage;

    @Column(name = "passes_average_length")
    private Double passesAverageLength;

    @Column(name = "goal_kicks_attempted")
    private Long goalKicksAttempted;

    @Column(name = "goal_kicks_launch_percentage")
    private Double goalKicksLaunchPercentage;

    @Column(name = "goal_kicks_average_length")
    private Double goalKicksAverageLength;

    @Column(name = "crosses_faced")
    private Long crossesOpposed;

    @Column(name = "crosses_stopped")
    private Long crossesStopped;

    @Column(name = "crosses_stop_percentage")
    private Double crossesStoppedPercentage;

    @Column(name = "sweeper_actions")
    private Integer sweeperActionsOutsidePenaltyArea;

    @Column(name = "sweeper_actions_per_90")
    private Double sweeperActionsOutsidePenaltyAreaPer90;

    @Column(name = "sweeper_average_distance")
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
