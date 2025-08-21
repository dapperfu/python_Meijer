package com.bazaarvoice.bvandroidsdk;

import M6.b;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class ReviewStatistics {

    @InterfaceC16127c("AverageOverallRating")
    private Float averageOverallRating;

    @InterfaceC16127c("ContextDataDistribution")
    private Map<String, DistributionElement> contextDataDistribution;

    @InterfaceC16127c("FeaturedReviewCount")
    private Integer featuredReviewCount;
    private transient Date firstSubmissionDate;

    @InterfaceC16127c("FirstSubmissionTime")
    private String firstSubmissionTime;

    @InterfaceC16127c("HelpfulVoteCount")
    private Integer helpfulVoteCount;

    @InterfaceC16127c("IncentivizedReviewCount")
    private Integer incentivizedReviewCount;
    private transient Date lastSubmissionDate;

    @InterfaceC16127c("LastSubmissionTime")
    private String lastSubmissionTime;

    @InterfaceC16127c("NotHelpfulVoteCount")
    private Integer notHelpfulVoteCount;

    @InterfaceC16127c("NotRecommendedCount")
    private Integer notRecommendedCount;

    @InterfaceC16127c("OverallRatingRange")
    private Integer overallRatingRange;
    private transient RatingDistribution ratingDistribution;

    @InterfaceC16127c("RatingDistribution")
    private List<RatingDistributionContainer> ratingDistributions;

    @InterfaceC16127c("RatingsOnlyReviewCount")
    private Integer ratingsOnlyReviewCount;

    @InterfaceC16127c("RecommendedCount")
    private Integer recommendedCount;

    @InterfaceC16127c("SecondaryRatingsAverages")
    private Map<String, SecondaryRatingsAverages> secondaryRatingsAverages;

    @InterfaceC16127c("SecondaryRatingsDistribution")
    private Map<String, SecondaryDistributionElement> secondaryRatingsDistribution;

    @InterfaceC16127c("TagDistribution")
    private Map<String, DistributionElement> tagDistribution;

    @InterfaceC16127c("TotalReviewCount")
    private Integer totalReviewCount;

    public Float getAverageOverallRating() {
        return b.e(this.averageOverallRating);
    }

    public Map<String, DistributionElement> getContextDataDistribution() {
        return this.contextDataDistribution;
    }

    public Integer getFeaturedReviewCount() {
        return b.f(this.featuredReviewCount);
    }

    public Date getFirstSubmissionDate() {
        if (this.firstSubmissionDate == null) {
            this.firstSubmissionDate = DateUtil.dateFromString(this.firstSubmissionTime);
        }
        return this.firstSubmissionDate;
    }

    public Integer getHelpfulVoteCount() {
        return b.f(this.helpfulVoteCount);
    }

    public Integer getIncentivizedReviewCount() {
        return b.f(this.incentivizedReviewCount);
    }

    public Date getLastSubmissionDate() {
        if (this.lastSubmissionDate == null) {
            this.lastSubmissionDate = DateUtil.dateFromString(this.lastSubmissionTime);
        }
        return this.lastSubmissionDate;
    }

    public Integer getNotHelpfulVoteCount() {
        return b.f(this.notHelpfulVoteCount);
    }

    public Integer getNotRecommendedCount() {
        return b.f(this.notRecommendedCount);
    }

    public Integer getOverallRatingRange() {
        return b.f(this.overallRatingRange);
    }

    public RatingDistribution getRatingDistribution() {
        if (this.ratingDistributions != null && this.ratingDistribution == null) {
            this.ratingDistribution = new RatingDistribution();
            for (RatingDistributionContainer ratingDistributionContainer : this.ratingDistributions) {
                if (ratingDistributionContainer != null && ratingDistributionContainer.getRatingValue() != null && ratingDistributionContainer.getCount() != null) {
                    updateRatingDistributionCounts(ratingDistributionContainer.getRatingValue(), ratingDistributionContainer.getCount());
                }
            }
        }
        return this.ratingDistribution;
    }

    public Map<Integer, Integer> getRatingDistributionMap() {
        HashMap map = new HashMap();
        List<RatingDistributionContainer> list = this.ratingDistributions;
        if (list != null) {
            for (RatingDistributionContainer ratingDistributionContainer : list) {
                if (ratingDistributionContainer != null && ratingDistributionContainer.getRatingValue() != null && ratingDistributionContainer.getCount() != null) {
                    map.put(ratingDistributionContainer.getRatingValue(), ratingDistributionContainer.getCount());
                }
            }
        }
        return map;
    }

    public Integer getRatingsOnlyReviewCount() {
        return b.f(this.ratingsOnlyReviewCount);
    }

    public Integer getRecommendedCount() {
        return b.f(this.recommendedCount);
    }

    public Map<String, SecondaryRatingsAverages> getSecondaryRatingsAverages() {
        return this.secondaryRatingsAverages;
    }

    public Map<String, SecondaryDistributionElement> getSecondaryRatingsDistribution() {
        return this.secondaryRatingsDistribution;
    }

    public Map<String, DistributionElement> getTagDistribution() {
        return this.tagDistribution;
    }

    public Integer getTotalReviewCount() {
        return b.f(this.totalReviewCount);
    }

    private void updateRatingDistributionCounts(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue != 4) {
                        if (iIntValue != 5) {
                            return;
                        }
                        this.ratingDistribution.setFiveStarCount(num2);
                        return;
                    }
                    this.ratingDistribution.setFourStarCount(num2);
                    return;
                }
                this.ratingDistribution.setThreeStarCount(num2);
                return;
            }
            this.ratingDistribution.setTwoStarCount(num2);
            return;
        }
        this.ratingDistribution.setOneStarCount(num2);
    }
}
