package com.tottstats.Spurs_Stats.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "possession", schema = "tott_stats")
public class Possession {

    @Id
    @Column(name = "Player", unique = true, nullable = false)
    private String player;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Pos")
    private String pos;

    @Column(name = "Age")
    private String age;

    @Column(name = "90s")
    private Double ninetyMinutes;

    @Column(name = "TouchesTouches")
    private Integer touchesTotal;

    @Column(name = "TouchesDefPen")
    private Integer touchesDefPen;

    @Column(name = "TouchesDef3rd")
    private Integer touchesDef3rd;

    @Column(name = "TouchesMid3rd")
    private Integer touchesMid3rd;

    @Column(name = "TouchesAtt3rd")
    private Integer touchesAtt3rd;

    @Column(name = "TouchesAttPen")
    private Integer touchesAttPen;

    @Column(name = "TouchesLive")
    private Integer touchesLive;

    @Column(name = "TakeOnsAtt")
    private Integer takeOnsAtt;

    @Column(name = "TakeOnsSucc")
    private Integer takeOnsSucc;

    @Column(name = "TakeOnsSuccPercentage")
    private Double takeOnsSuccPercentage;

    @Column(name = "TakeOnsTkld")
    private Integer takeOnsTkld;

    @Column(name = "TakeOnsTkldPercentage")
    private Double takeOnsTkldPercentage;

    @Column(name = "CarriesCarries")
    private Integer carriesTotal;

    @Column(name = "CarriesTotDist")
    private Integer carriesTotalDistance;

    @Column(name = "CarriesPrgDist")
    private Integer carriesProgressiveDistance;

    @Column(name = "CarriesPrgC")
    private Integer carriesProgressiveC;

    @Column(name = "Carries1/3")
    private Integer carriesIn1stThird;

    @Column(name = "CarriesCPA")
    private Integer carriesThroughCPA;

    @Column(name = "CarriesMis")
    private Integer carriesMiscontrols;

    @Column(name = "CarriesDis")
    private Integer carriesDispossessed;

    @Column(name = "ReceivingRec")
    private Integer receivingTotal;

    @Column(name = "ReceivingPrgR")
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

