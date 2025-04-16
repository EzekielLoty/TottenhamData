package com.tottstats.spursstats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "possession", schema = "tott_stats")
public class Possession {

    @Id
    @Column(name = "player", unique = true, nullable = false)
    private String player;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String pos;

    @Column(name = "age")
    private String age;

    @Column(name = "minutes_played")
    private Double ninetyMinutes;

    @Column(name = "touches")
    private Integer touchesTotal;

    @Column(name = "touches_def_pen")
    private Integer touchesDefPen;

    @Column(name = "touches_def_3rd")
    private Integer touchesDef3rd;

    @Column(name = "touches_mid_3rd")
    private Integer touchesMid3rd;

    @Column(name = "touches_att_3rd")
    private Integer touchesAtt3rd;

    @Column(name = "touches_att_pen")
    private Integer touchesAttPen;

    @Column(name = "touches_live")
    private Integer touchesLive;

    @Column(name = "take_ons_attempted")
    private Integer takeOnsAtt;

    @Column(name = "take_ons_successful")
    private Integer takeOnsSucc;

    @Column(name = "take_ons_success_rate")
    private Double takeOnsSuccPercentage;

    @Column(name = "take_ons_tackled")
    private Integer takeOnsTkld;

    @Column(name = "take_ons_tackled_rate")
    private Double takeOnsTkldPercentage;

    @Column(name = "carries")
    private Integer carriesTotal;

    @Column(name = "carries_total_distance")
    private Integer carriesTotalDistance;

    @Column(name = "carries_progressive_distance")
    private Integer carriesProgressiveDistance;

    @Column(name = "carries_progressive_carries")
    private Integer carriesProgressiveC;

    @Column(name = "carries_into_final_third")
    private Integer carriesIn1stThird;

    @Column(name = "carries_into_penalty_area")
    private Integer carriesThroughCPA;

    @Column(name = "carries_miscontrolled")
    private Integer carriesMiscontrols;

    @Column(name = "carries_dispossessed")
    private Integer carriesDispossessed;

    @Column(name = "passes_received")
    private Integer receivingTotal;

    @Column(name = "progressive_passes_received")
    private Integer receivingProgressiveR;


    // Default constructor
    public Possession() {
    }

    // Constructor with parameters
    public Possession(String player, String nation, String pos, String age, Double ninetyMinutes, Integer touchesTotal,
                      Integer touchesDefPen, Integer touchesDef3rd, Integer touchesMid3rd, Integer touchesAtt3rd,
                      Integer touchesAttPen, Integer touchesLive, Integer takeOnsAtt, Integer takeOnsSucc,
                      Double takeOnsSuccPercentage, Integer takeOnsTkld, Double takeOnsTkldPercentage, Integer carriesTotal,
                      Integer carriesTotalDistance, Integer carriesProgressiveDistance, Integer carriesProgressiveC,
                      Integer carriesIn1stThird, Integer carriesThroughCPA, Integer carriesMiscontrols,
                      Integer carriesDispossessed, Integer receivingTotal, Integer receivingProgressiveR) {
        this.player = player;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.ninetyMinutes = ninetyMinutes;
        this.touchesTotal = touchesTotal;
        this.touchesDefPen = touchesDefPen;
        this.touchesDef3rd = touchesDef3rd;
        this.touchesMid3rd = touchesMid3rd;
        this.touchesAtt3rd = touchesAtt3rd;
        this.touchesAttPen = touchesAttPen;
        this.touchesLive = touchesLive;
        this.takeOnsAtt = takeOnsAtt;
        this.takeOnsSucc = takeOnsSucc;
        this.takeOnsSuccPercentage = takeOnsSuccPercentage;
        this.takeOnsTkld = takeOnsTkld;
        this.takeOnsTkldPercentage = takeOnsTkldPercentage;
        this.carriesTotal = carriesTotal;
        this.carriesTotalDistance = carriesTotalDistance;
        this.carriesProgressiveDistance = carriesProgressiveDistance;
        this.carriesProgressiveC = carriesProgressiveC;
        this.carriesIn1stThird = carriesIn1stThird;
        this.carriesThroughCPA = carriesThroughCPA;
        this.carriesMiscontrols = carriesMiscontrols;
        this.carriesDispossessed = carriesDispossessed;
        this.receivingTotal = receivingTotal;
        this.receivingProgressiveR = receivingProgressiveR;
    }

    public String getPlayer() {
        return player;
    }

    public String getNation() {
        return nation;
    }

    public String getPos() {
        return pos;
    }

    public String getAge() {
        return age;
    }

    public Double getNinetyMinutes() {
        return ninetyMinutes;
    }

    public Integer getTouchesTotal() {
        return touchesTotal;
    }

    public Integer getTouchesDefPen() {
        return touchesDefPen;
    }

    public Integer getTouchesDef3rd() {
        return touchesDef3rd;
    }

    public Integer getTouchesMid3rd() {
        return touchesMid3rd;
    }

    public Integer getTouchesAtt3rd() {
        return touchesAtt3rd;
    }

    public Integer getTouchesAttPen() {
        return touchesAttPen;
    }

    public Integer getTouchesLive() {
        return touchesLive;
    }

    public Integer getTakeOnsAtt() {
        return takeOnsAtt;
    }

    public Integer getTakeOnsSucc() {
        return takeOnsSucc;
    }

    public Double getTakeOnsSuccPercentage() {
        return takeOnsSuccPercentage;
    }

    public Integer getTakeOnsTkld() {
        return takeOnsTkld;
    }

    public Double getTakeOnsTkldPercentage() {
        return takeOnsTkldPercentage;
    }

    public Integer getCarriesTotal() {
        return carriesTotal;
    }

    public Integer getCarriesTotalDistance() {
        return carriesTotalDistance;
    }

    public Integer getCarriesProgressiveDistance() {
        return carriesProgressiveDistance;
    }

    public Integer getCarriesProgressiveC() {
        return carriesProgressiveC;
    }

    public Integer getCarriesIn1stThird() {
        return carriesIn1stThird;
    }

    public Integer getCarriesThroughCPA() {
        return carriesThroughCPA;
    }

    public Integer getCarriesMiscontrols() {
        return carriesMiscontrols;
    }

    public Integer getCarriesDispossessed() {
        return carriesDispossessed;
    }

    public Integer getReceivingTotal() {
        return receivingTotal;
    }

    public Integer getReceivingProgressiveR() {
        return receivingProgressiveR;
    }
}

