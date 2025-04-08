package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "pass_types", schema = "tott_stats")
public class PassTypes {

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

    @Column(name = "passes_attempted")
    private Integer passAttempts;

    @Column(name = "passes_live")
    private Integer livePasses;

    @Column(name = "passes_dead")
    private Integer deadPasses;

    @Column(name = "free_kick_passes")
    private Integer freeKickPasses;

    @Column(name = "through_balls")
    private Integer throughBalls;

    @Column(name = "switches")
    private Integer switchPasses;

    @Column(name = "crosses")
    private Integer crosses;

    @Column(name = "throw_ins")
    private Integer throwIns;

    @Column(name = "corner_kicks")
    private Integer cornerKicks;

    @Column(name = "corners_in")
    private Integer cornerKicksInSwinging;

    @Column(name = "corners_out")
    private Integer cornerKicksOutSwinging;

    @Column(name = "corners_straight")
    private Integer cornerKicksStraight;

    @Column(name = "passes_completed")
    private Integer completedPasses;

    @Column(name = "offsides_passes")
    private Integer offTargetPasses;

    @Column(name = "passes_blocked")
    private Integer blockedPasses;


    // Default constructor
    public PassTypes() {
    }

    public PassTypes(String player, String nation, String position, String age, Double ninetyMinutes, Integer passAttempts, Integer livePasses, Integer deadPasses, Integer freeKickPasses, Integer throughBalls, Integer switchPasses, Integer crosses, Integer throwIns, Integer cornerKicks, Integer cornerKicksInSwinging, Integer cornerKicksOutSwinging, Integer cornerKicksStraight, Integer completedPasses, Integer offTargetPasses, Integer blockedPasses) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.passAttempts = passAttempts;
        this.livePasses = livePasses;
        this.deadPasses = deadPasses;
        this.freeKickPasses = freeKickPasses;
        this.throughBalls = throughBalls;
        this.switchPasses = switchPasses;
        this.crosses = crosses;
        this.throwIns = throwIns;
        this.cornerKicks = cornerKicks;
        this.cornerKicksInSwinging = cornerKicksInSwinging;
        this.cornerKicksOutSwinging = cornerKicksOutSwinging;
        this.cornerKicksStraight = cornerKicksStraight;
        this.completedPasses = completedPasses;
        this.offTargetPasses = offTargetPasses;
        this.blockedPasses = blockedPasses;
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

    public Integer getPassAttempts() {
        return passAttempts;
    }

    public Integer getLivePasses() {
        return livePasses;
    }

    public Integer getDeadPasses() {
        return deadPasses;
    }

    public Integer getFreeKickPasses() {
        return freeKickPasses;
    }

    public Integer getThroughBalls() {
        return throughBalls;
    }

    public Integer getSwitchPasses() {
        return switchPasses;
    }

    public Integer getCrosses() {
        return crosses;
    }

    public Integer getThrowIns() {
        return throwIns;
    }

    public Integer getCornerKicks() {
        return cornerKicks;
    }

    public Integer getCornerKicksInSwinging() {
        return cornerKicksInSwinging;
    }

    public Integer getCornerKicksOutSwinging() {
        return cornerKicksOutSwinging;
    }

    public Integer getCornerKicksStraight() {
        return cornerKicksStraight;
    }

    public Integer getCompletedPasses() {
        return completedPasses;
    }

    public Integer getOffTargetPasses() {
        return offTargetPasses;
    }

    public Integer getBlockedPasses() {
        return blockedPasses;
    }
}
