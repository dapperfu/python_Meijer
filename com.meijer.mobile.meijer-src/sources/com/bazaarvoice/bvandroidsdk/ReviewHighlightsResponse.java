package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class ReviewHighlightsResponse extends ConversationsDisplayResponse {

    @InterfaceC16127c("error")
    private String error;
    private transient List<Error> errors;

    @InterfaceC16127c("subjects")
    private ReviewHighlights reviewHighlights;

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsResponse
    public List<Error> getErrors() {
        if (this.errors == null) {
            this.errors = new ArrayList(Arrays.asList(new Error(this.error, null)));
        }
        return this.errors;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsResponse
    public Boolean getHasErrors() {
        return Boolean.valueOf(this.error != null);
    }

    public ReviewHighlights getReviewHighlights() {
        return this.reviewHighlights;
    }
}
