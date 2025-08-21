package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class ReviewSummaryResponse extends ConversationsDisplayResponse {

    @InterfaceC16127c("detail")
    private String detail;

    @InterfaceC16127c("disclaimer")
    private String disclaimer;

    @InterfaceC16127c("error")
    private String error;
    private transient List<Error> errors;

    @InterfaceC16127c("status")
    private Integer status;

    @InterfaceC16127c("summary")
    private String summary;

    @InterfaceC16127c("title")
    private String title;

    @InterfaceC16127c("type")
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
