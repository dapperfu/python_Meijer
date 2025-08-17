package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class ProgressiveSubmitResponse extends ConversationsResponse {

    @InterfaceC15617c("response")
    private ProgressiveSubmitResponseData data;

    public class ProgressiveSubmitResponseData {
        List<FieldError> formValidationErrors;
        private Boolean isFormComplete;
        private Review review;
        private String submissionId;
        private String submissionSessionToken;

        public ProgressiveSubmitResponseData() {
        }

        public List<FieldError> getFormValidationErrors() {
            return this.formValidationErrors;
        }

        public Review getReview() {
            return this.review;
        }

        public String getSubmissionId() {
            return this.submissionId;
        }

        public String getSubmissionSessionToken() {
            return this.submissionSessionToken;
        }

        public Boolean isFormComplete() {
            return this.isFormComplete;
        }
    }

    public ProgressiveSubmitResponseData getData() {
        return this.data;
    }
}
