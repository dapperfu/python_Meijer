package com.bazaarvoice.bvandroidsdk;

import java.util.Date;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class SubmittedAnswer {

    @InterfaceC15617c("AnswerId")
    private String answerId;

    @InterfaceC15617c("AnswerText")
    private String answerText;

    @InterfaceC15617c("SendEmailAlertWhenAnswered")
    private Boolean sendEmailAlertWhenAnswered;
    private Date submissionDate;

    @InterfaceC15617c("SubmissionId")
    private String submissionId;

    @InterfaceC15617c("SubmissionTime")
    private String submissionTime;

    @InterfaceC15617c("TypicalHoursToPost")
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
