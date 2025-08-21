package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class RatingDistribution {
    private Integer fiveStarCount;
    private Integer fourStarCount;
    private Integer oneStarCount;
    private Integer threeStarCount;
    private Integer twoStarCount;

    RatingDistribution(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.oneStarCount = 0;
        this.twoStarCount = 0;
        this.threeStarCount = 0;
        this.fourStarCount = 0;
        this.oneStarCount = num;
        this.twoStarCount = num2;
        this.threeStarCount = num3;
        this.fourStarCount = num4;
        this.fiveStarCount = num5;
    }

    public Integer getFiveStarCount() {
        return this.fiveStarCount;
    }

    public Integer getFourStarCount() {
        return this.fourStarCount;
    }

    public Integer getOneStarCount() {
        return this.oneStarCount;
    }

    public Integer getThreeStarCount() {
        return this.threeStarCount;
    }

    public Integer getTwoStarCount() {
        return this.twoStarCount;
    }

    void setFiveStarCount(Integer num) {
        this.fiveStarCount = num;
    }

    void setFourStarCount(Integer num) {
        this.fourStarCount = num;
    }

    void setOneStarCount(Integer num) {
        this.oneStarCount = num;
    }

    void setThreeStarCount(Integer num) {
        this.threeStarCount = num;
    }

    void setTwoStarCount(Integer num) {
        this.twoStarCount = num;
    }

    RatingDistribution() {
        this.oneStarCount = 0;
        this.twoStarCount = 0;
        this.threeStarCount = 0;
        this.fourStarCount = 0;
        this.fiveStarCount = 0;
    }
}
