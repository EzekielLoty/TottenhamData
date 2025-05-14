package com.tottstats.spursstats.tables;


import jakarta.persistence.*;

@Entity
@Table(name = "standard_stats", schema = "tott_stats")
public class StandardStats {

    @Id
    @Column(name = "Player", unique = true, nullable = false)
    private String player;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Pos")
    private String pos;

    @Column(name = "Age")
    private int age;

    @Column(name = "MP")
    private int mp;

    @Column(name = "playing_time_starts")
    private int playingTimeStarts;

    @Column(name = "playing_time_min")
    private Double  playingTimeMin;

    @Column(name = "playing_time_90s")
    private Double  playingTime90s;

    @Column(name = "performance_gls")
    private Double  performanceGls;

    @Column(name = "performance_ast")
    private Double  performanceAst;

    @Column(name = "performance_g_a")
    private Double  performanceGA;

    @Column(name = "performance_g_pk")
    private Double  performanceGPK;

    @Column(name = "performance_pk")
    private Double  performancePK;

    @Column(name = "performance_pk_att")
    private Double  performancePKatt;

    @Column(name = "performance_crd_y")
    private Double  performanceCrdY;

    @Column(name = "performance_crd_r")
    private Double  performanceCrdR;

    @Column(name = "expected_xg")
    private Double  expectedxG;

    @Column(name = "expected_npxg")
    private Double  expectednpxG;

    @Column(name = "expected_xag")
    private Double  expectedxAG;

    @Column(name = "expected_npxg_xag")
    private Double  expectednpxGxAG;

    @Column(name = "progression_prg_c")
    private Double  progressionPrgC;

    @Column(name = "progression_prg_p")
    private Double  progressionPrgP;

    @Column(name = "progression_prg_r")
    private Double  progressionPrgR;

    @Column(name = "per_90_minutes_gls")
    private Double  per90MinutesGls;

    @Column(name = "per_90_minutes_ast")
    private Double  per90MinutesAst;

    @Column(name = "per_90_minutes_g_a")
    private Double  per90MinutesGA;

    @Column(name = "per_90_minutes_g_pk")
    private Double  per90MinutesGPK;

    @Column(name = "per_90_minutes_g_a_pk")
    private Double  per90MinutesGAPK;

    @Column(name = "per_90_minutes_xg")
    private Double  per90MinutesxG;

    @Column(name = "per_90_minutes_xag")
    private Double  per90MinutesxAG;

    @Column(name = "per_90_minutes_xg_xag")
    private Double  per90MinutesxGxAG;

    @Column(name = "per_90_minutes_npxg")
    private Double  per90MinutesnpxG;

    @Column(name = "per_90_minutes_npxg_xag")
    private Double  per90MinutesnpxGxAG;

    // Default constructor
    public StandardStats() {
    }

    // Constructor with parameters
    public StandardStats(String player, String nation, String pos, int age, int mp, int playingTimeStarts, Double  playingTimeMin,
                         Double  playingTime90s, Double  performanceGls, Double  performanceAst, Double  performanceGA,
                         Double  performanceGPK, Double  performancePK, Double  performancePKatt, Double  performanceCrdY,
                         Double  performanceCrdR, Double  expectedxG, Double  expectednpxG, Double  expectedxAG,
                         Double  expectednpxGxAG, Double  progressionPrgC, Double  progressionPrgP, Double  progressionPrgR,
                         Double  per90MinutesGls, Double  per90MinutesAst, Double  per90MinutesGA, Double  per90MinutesGPK,
                         Double  per90MinutesGAPK, Double  per90MinutesxG, Double  per90MinutesxAG, Double  per90MinutesxGxAG,
                         Double  per90MinutesnpxG, Double  per90MinutesnpxGxAG) {
        this.player = player;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.playingTimeStarts = playingTimeStarts;
        this.playingTimeMin = playingTimeMin;
        this.playingTime90s = playingTime90s;
        this.performanceGls = performanceGls;
        this.performanceAst = performanceAst;
        this.performanceGA = performanceGA;
        this.performanceGPK = performanceGPK;
        this.performancePK = performancePK;
        this.performancePKatt = performancePKatt;
        this.performanceCrdY = performanceCrdY;
        this.performanceCrdR = performanceCrdR;
        this.expectedxG = expectedxG;
        this.expectednpxG = expectednpxG;
        this.expectedxAG = expectedxAG;
        this.expectednpxGxAG = expectednpxGxAG;
        this.progressionPrgC = progressionPrgC;
        this.progressionPrgP = progressionPrgP;
        this.progressionPrgR = progressionPrgR;
        this.per90MinutesGls = per90MinutesGls;
        this.per90MinutesAst = per90MinutesAst;
        this.per90MinutesGA = per90MinutesGA;
        this.per90MinutesGPK = per90MinutesGPK;
        this.per90MinutesGAPK = per90MinutesGAPK;
        this.per90MinutesxG = per90MinutesxG;
        this.per90MinutesxAG = per90MinutesxAG;
        this.per90MinutesxGxAG = per90MinutesxGxAG;
        this.per90MinutesnpxG = per90MinutesnpxG;
        this.per90MinutesnpxGxAG = per90MinutesnpxGxAG;
    }

    // Getters and Setters

    public String getPlayer() {
        return player;
    }



    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getPlayingTimeStarts() {
        return playingTimeStarts;
    }

    public void setPlayingTimeStarts(int playingTimeStarts) {
        this.playingTimeStarts = playingTimeStarts;
    }

    public Double  getPlayingTimeMin() {
        return playingTimeMin;
    }

    public void setPlayingTimeMin(Double  playingTimeMin) {
        this.playingTimeMin = playingTimeMin;
    }

    public Double  getPlayingTime90s() {
        return playingTime90s;
    }

    public void setPlayingTime90s(Double  playingTime90s) {
        this.playingTime90s = playingTime90s;
    }

    public Double  getPerformanceGls() {
        return performanceGls;
    }

    public void setPerformanceGls(Double  performanceGls) {
        this.performanceGls = performanceGls;
    }

    public Double  getPerformanceAst() {
        return performanceAst;
    }

    public void setPerformanceAst(Double  performanceAst) {
        this.performanceAst = performanceAst;
    }

    public Double  getPerformanceGA() {
        return performanceGA;
    }

    public void setPerformanceGA(Double  performanceGA) {
        this.performanceGA = performanceGA;
    }

    public Double  getPerformanceGPK() {
        return performanceGPK;
    }

    public void setPerformanceGPK(Double  performanceGPK) {
        this.performanceGPK = performanceGPK;
    }

    public Double  getPerformancePK() {
        return performancePK;
    }

    public void setPerformancePK(Double  performancePK) {
        this.performancePK = performancePK;
    }

    public Double  getPerformancePKatt() {
        return performancePKatt;
    }

    public void setPerformancePKatt(Double  performancePKatt) {
        this.performancePKatt = performancePKatt;
    }

    public Double  getPerformanceCrdY() {
        return performanceCrdY;
    }

    public void setPerformanceCrdY(Double  performanceCrdY) {
        this.performanceCrdY = performanceCrdY;
    }

    public Double  getPerformanceCrdR() {
        return performanceCrdR;
    }

    public void setPerformanceCrdR(Double  performanceCrdR) {
        this.performanceCrdR = performanceCrdR;
    }

    public Double  getExpectedxG() {
        return expectedxG;
    }

    public void setExpectedxG(Double  expectedxG) {
        this.expectedxG = expectedxG;
    }

    public Double  getExpectednpxG() {
        return expectednpxG;
    }

    public void setExpectednpxG(Double  expectednpxG) {
        this.expectednpxG = expectednpxG;
    }

    public Double  getExpectedxAG() {
        return expectedxAG;
    }

    public void setExpectedxAG(Double  expectedxAG) {
        this.expectedxAG = expectedxAG;
    }

    public Double  getExpectednpxGxAG() {
        return expectednpxGxAG;
    }

    public void setExpectednpxGxAG(Double  expectednpxGxAG) {
        this.expectednpxGxAG = expectednpxGxAG;
    }

    public Double  getProgressionPrgC() {
        return progressionPrgC;
    }

    public void setProgressionPrgC(Double  progressionPrgC) {
        this.progressionPrgC = progressionPrgC;
    }

    public Double  getProgressionPrgP() {
        return progressionPrgP;
    }

    public void setProgressionPrgP(Double  progressionPrgP) {
        this.progressionPrgP = progressionPrgP;
    }

    public Double  getProgressionPrgR() {
        return progressionPrgR;
    }

    public void setProgressionPrgR(Double  progressionPrgR) {
        this.progressionPrgR = progressionPrgR;
    }

    public Double  getPer90MinutesGls() {
        return per90MinutesGls;
    }

    public void setPer90MinutesGls(Double  per90MinutesGls) {
        this.per90MinutesGls = per90MinutesGls;
    }

    public Double  getPer90MinutesAst() {
        return per90MinutesAst;
    }

    public void setPer90MinutesAst(Double  per90MinutesAst) {
        this.per90MinutesAst = per90MinutesAst;
    }

    public Double  getPer90MinutesGA() {
        return per90MinutesGA;
    }

    public void setPer90MinutesGA(Double  per90MinutesGA) {
        this.per90MinutesGA = per90MinutesGA;
    }

    public Double  getPer90MinutesGPK() {
        return per90MinutesGPK;
    }

    public void setPer90MinutesGPK(Double  per90MinutesGPK) {
        this.per90MinutesGPK = per90MinutesGPK;
    }

    public Double  getPer90MinutesGAPK() {
        return per90MinutesGAPK;
    }

    public void setPer90MinutesGAPK(Double  per90MinutesGAPK) {
        this.per90MinutesGAPK = per90MinutesGAPK;
    }

    public Double  getPer90MinutesxG() {
        return per90MinutesxG;
    }

    public void setPer90MinutesxG(Double  per90MinutesxG) {
        this.per90MinutesxG = per90MinutesxG;
    }

    public Double  getPer90MinutesxAG() {
        return per90MinutesxAG;
    }

    public void setPer90MinutesxAG(Double  per90MinutesxAG) {
        this.per90MinutesxAG = per90MinutesxAG;
    }

    public Double  getPer90MinutesxGxAG() {
        return per90MinutesxGxAG;
    }

    public void setPer90MinutesxGxAG(Double  per90MinutesxGxAG) {
        this.per90MinutesxGxAG = per90MinutesxGxAG;
    }

    public Double  getPer90MinutesnpxG() {
        return per90MinutesnpxG;
    }

    public void setPer90MinutesnpxG(Double  per90MinutesnpxG) {
        this.per90MinutesnpxG = per90MinutesnpxG;
    }

    public Double  getPer90MinutesnpxGxAG() {
        return per90MinutesnpxGxAG;
    }

    public void setPer90MinutesnpxGxAG(Double  per90MinutesnpxGxAG) {
        this.per90MinutesnpxGxAG = per90MinutesnpxGxAG;
    }
}
