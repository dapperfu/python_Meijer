package com.bazaarvoice.bvandroidsdk;

import M6.b;
import java.util.Date;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class QAStatistics {

    @InterfaceC16127c("AnswerHelpfulVoteCount")
    private Integer answerHelpfulVoteCount;

    @InterfaceC16127c("AnswerNotHelpfulVoteCount")
    private Integer answerNotHelpfulVoteCount;

    @InterfaceC16127c("BestAnswerCount")
    private Integer bestAnswerCount;

    @InterfaceC16127c("ContextDataDistribution")
    DistributionElement contextDataDistribution;

    @InterfaceC16127c("FeaturedAnswerCount")
    private Integer featuredAnswerCount;

    @InterfaceC16127c("FeaturedQuestionCount")
    private Integer featuredQuestionCount;
    private transient Date firstAnswerDate;

    @InterfaceC16127c("FirstAnswerTime")
    private String firstAnswerTime;
    private transient Date firstQuestionDate;

    @InterfaceC16127c("FirstQuestionTime")
    private String firstQuestionTime;

    @InterfaceC16127c("HelpfulVoteCount")
    private Integer helpfulVoteCount;
    private transient Date lastAnswerDate;

    @InterfaceC16127c("LastAnswerTime")
    private String lastAnswerTime;
    private transient Date lastQuestionAnswerDate;

    @InterfaceC16127c("LastQuestionAnswerTime")
    private String lastQuestionAnswerTime;
    private transient Date lastQuestionDate;

    @InterfaceC16127c("LastQuestionTime")
    private String lastQuestionTime;

    @InterfaceC16127c("QuestionHelpfulVoteCount")
    private Integer questionHelpfulVoteCount;

    @InterfaceC16127c("QuestionNotHelpfulVoteCount")
    private Integer questionNotHelpfulVoteCount;

    @InterfaceC16127c("TagDistribution")
    DistributionElement tagDistribution;

    @InterfaceC16127c("TotalAnswerCount")
    private Integer totalAnswerCount;

    @InterfaceC16127c("TotalQuestionCount")
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
