package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class ReviewSummaryResponse extends ConversationsDisplayResponse {

    @InterfaceC15617c("detail")
    private String detail;

    @InterfaceC15617c("disclaimer")
    private String disclaimer;

    @InterfaceC15617c("error")
    private String error;
    private transient List<Error> errors;

    @InterfaceC15617c("status")
    private Integer status;

    @InterfaceC15617c("summary")
    private String summary;

    @InterfaceC15617c("title")
    private String title;

    @InterfaceC15617c("type")
    private String type;

    public String getDetail() {
        return this.detail;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsResponse
    public List<Error> getErrors() {
        if (this.errors == null) {
            this.errors = new ArrayList(Collections.singletonList(new Error(this.error, null)));
        }
        return this.errors;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsResponse
    public Boolean getHasErrors() {
        return Boolean.valueOf(this.error != null);
    }

    public ReviewSummary getReviewSummary() {
        ReviewSummary reviewSummary = new ReviewSummary();
        reviewSummary.setStatus(this.status);
        reviewSummary.setSummary(this.summary);
        reviewSummary.setType(this.type);
        reviewSummary.setTitle(this.title);
        reviewSummary.setDetail(this.detail);
        reviewSummary.setDisclaimer(this.disclaimer);
        return reviewSummary;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }
}
