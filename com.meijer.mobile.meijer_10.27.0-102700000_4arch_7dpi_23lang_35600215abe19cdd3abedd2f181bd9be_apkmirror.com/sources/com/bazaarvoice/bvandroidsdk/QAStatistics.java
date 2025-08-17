package com.bazaarvoice.bvandroidsdk;

import L6.b;
import java.util.Date;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class QAStatistics {

    @InterfaceC15617c("AnswerHelpfulVoteCount")
    private Integer answerHelpfulVoteCount;

    @InterfaceC15617c("AnswerNotHelpfulVoteCount")
    private Integer answerNotHelpfulVoteCount;

    @InterfaceC15617c("BestAnswerCount")
    private Integer bestAnswerCount;

    @InterfaceC15617c("ContextDataDistribution")
    DistributionElement contextDataDistribution;

    @InterfaceC15617c("FeaturedAnswerCount")
    private Integer featuredAnswerCount;

    @InterfaceC15617c("FeaturedQuestionCount")
    private Integer featuredQuestionCount;
    private transient Date firstAnswerDate;

    @InterfaceC15617c("FirstAnswerTime")
    private String firstAnswerTime;
    private transient Date firstQuestionDate;

    @InterfaceC15617c("FirstQuestionTime")
    private String firstQuestionTime;

    @InterfaceC15617c("HelpfulVoteCount")
    private Integer helpfulVoteCount;
    private transient Date lastAnswerDate;

    @InterfaceC15617c("LastAnswerTime")
    private String lastAnswerTime;
    private transient Date lastQuestionAnswerDate;

    @InterfaceC15617c("LastQuestionAnswerTime")
    private String lastQuestionAnswerTime;
    private transient Date lastQuestionDate;

    @InterfaceC15617c("LastQuestionTime")
    private String lastQuestionTime;

    @InterfaceC15617c("QuestionHelpfulVoteCount")
    private Integer questionHelpfulVoteCount;

    @InterfaceC15617c("QuestionNotHelpfulVoteCount")
    private Integer questionNotHelpfulVoteCount;

    @InterfaceC15617c("TagDistribution")
    DistributionElement tagDistribution;

    @InterfaceC15617c("TotalAnswerCount")
    private Integer totalAnswerCount;

    @InterfaceC15617c("TotalQuestionCount")
    private Integer totalQuestionCount;

    public Integer getAnswerHelpfulVoteCount() {
        return b.f(this.answerHelpfulVoteCount);
    }

    public Integer getAnswerNotHelpfulVoteCount() {
        return b.f(this.answerNotHelpfulVoteCount);
    }

    public Integer getBestAnswerCount() {
        return b.f(this.bestAnswerCount);
    }

    public DistributionElement getContextDataDistribution() {
        return this.contextDataDistribution;
    }

    public Integer getFeaturedAnswerCount() {
        return b.f(this.featuredAnswerCount);
    }

    public Integer getFeaturedQuestionCount() {
        return b.f(this.featuredQuestionCount);
    }

    public Date getFirstAnswerDate() {
        if (this.firstAnswerDate == null) {
            this.firstAnswerDate = DateUtil.dateFromString(this.firstAnswerTime);
        }
        return this.firstAnswerDate;
    }

    public Date getFirstQuestionDate() {
        if (this.firstQuestionDate == null) {
            this.firstAnswerDate = DateUtil.dateFromString(this.firstQuestionTime);
        }
        return this.firstQuestionDate;
    }

    public Integer getHelpfulVoteCount() {
        return b.f(this.helpfulVoteCount);
    }

    public Date getLastAnswerDate() {
        if (this.lastAnswerDate == null) {
            this.lastAnswerDate = DateUtil.dateFromString(this.lastAnswerTime);
        }
        return this.lastAnswerDate;
    }

    public Date getLastQuestionAnswerDate() {
        if (this.lastQuestionAnswerDate == null) {
            this.lastQuestionAnswerDate = DateUtil.dateFromString(this.lastQuestionAnswerTime);
        }
        return this.lastQuestionAnswerDate;
    }

    public Date getLastQuestionDate() {
        if (this.lastQuestionDate == null) {
            this.lastQuestionDate = DateUtil.dateFromString(this.lastQuestionTime);
        }
        return this.lastQuestionDate;
    }

    public Integer getQuestionHelpfulVoteCount() {
        return b.f(this.questionHelpfulVoteCount);
    }

    public Integer getQuestionNotHelpfulVoteCount() {
        return b.f(this.questionNotHelpfulVoteCount);
    }

    public DistributionElement getTagDistribution() {
        return this.tagDistribution;
    }

    public Integer getTotalAnswerCount() {
        return b.f(this.totalAnswerCount);
    }

    public Integer getTotalQuestionCount() {
        return b.f(this.totalQuestionCount);
    }
}
