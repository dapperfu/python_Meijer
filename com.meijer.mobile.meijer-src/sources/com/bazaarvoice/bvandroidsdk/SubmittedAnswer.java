package com.bazaarvoice.bvandroidsdk;

import java.util.Date;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class SubmittedAnswer {

    @InterfaceC16127c("AnswerId")
    private String answerId;

    @InterfaceC16127c("AnswerText")
    private String answerText;

    @InterfaceC16127c("SendEmailAlertWhenAnswered")
    private Boolean sendEmailAlertWhenAnswered;
    private Date submissionDate;

    @InterfaceC16127c("SubmissionId")
    private String submissionId;

    @InterfaceC16127c("SubmissionTime")
    private String submissionTime;

    @InterfaceC16127c("TypicalHoursToPost")
    private Integer typicalHoursToPost;

    public String getAnswerId() {
        return this.answerId;
    }

    public String getAnswerText() {
        return this.answerText;
    }

    public Boolean getSendEmailAlertWhenAnswered() {
        return this.sendEmailAlertWhenAnswered;
    }

    public Date getSubmissionDate() {
        String str;
        if (this.submissionDate == null && (str = this.submissionTime) != null) {
            this.submissionDate = DateUtil.dateFromString(str);
        }
        return this.submissionDate;
    }

    public String getSubmissionId() {
        return this.submissionId;
    }

    public Integer getTypicalHoursToPost() {
        return this.typicalHoursToPost;
    }
}
