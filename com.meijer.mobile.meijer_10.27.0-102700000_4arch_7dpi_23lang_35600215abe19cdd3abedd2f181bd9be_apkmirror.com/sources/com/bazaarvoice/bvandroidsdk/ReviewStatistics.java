package com.bazaarvoice.bvandroidsdk;

import L6.b;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class ReviewStatistics {

    @InterfaceC15617c("AverageOverallRating")
    private Float averageOverallRating;

    @InterfaceC15617c("ContextDataDistribution")
    private Map<String, DistributionElement> contextDataDistribution;

    @InterfaceC15617c("FeaturedReviewCount")
    private Integer featuredReviewCount;
    private transient Date firstSubmissionDate;

    @InterfaceC15617c("FirstSubmissionTime")
    private String firstSubmissionTime;

    @InterfaceC15617c("HelpfulVoteCount")
    private Integer helpfulVoteCount;

    @InterfaceC15617c("IncentivizedReviewCount")
    private Integer incentivizedReviewCount;
    private transient Date lastSubmissionDate;

    @InterfaceC15617c("LastSubmissionTime")
    private String lastSubmissionTime;

    @InterfaceC15617c("NotHelpfulVoteCount")
    private Integer notHelpfulVoteCount;

    @InterfaceC15617c("NotRecommendedCount")
    private Integer notRecommendedCount;

    @InterfaceC15617c("OverallRatingRange")
    private Integer overallRatingRange;
    private transient RatingDistribution ratingDistribution;

    @InterfaceC15617c("RatingDistribution")
    private List<RatingDistributionContainer> ratingDistributions;

    @InterfaceC15617c("RatingsOnlyReviewCount")
    private Integer ratingsOnlyReviewCount;

    @InterfaceC15617c("RecommendedCount")
    private Integer recommendedCount;

    @InterfaceC15617c("SecondaryRatingsAverages")
    private Map<String, SecondaryRatingsAverages> secondaryRatingsAverages;

    @InterfaceC15617c("SecondaryRatingsDistribution")
    private Map<String, SecondaryDistributionElement> secondaryRatingsDistribution;

    @InterfaceC15617c("TagDistribution")
    private Map<String, DistributionElement> tagDistribution;

    @InterfaceC15617c("TotalReviewCount")
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
