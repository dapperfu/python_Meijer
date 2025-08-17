package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class InitiateSubmitResponse extends ConversationsSubmissionResponse {

    @InterfaceC15617c("response")
    InitiateSubmitFormData data;

    public class InitiateSubmitFormData {
        private Map<String, InitiateSubmitResponseData> productFormData;
        private String userId;

        public InitiateSubmitFormData() {
        }

        public Map<String, InitiateSubmitResponseData> getProductFormData() {
            return this.productFormData;
        }

        public String getUserId() {
            return this.userId;
        }
    }

    public class InitiateSubmitResponseData {
        private Map<String, FormField> fields;
        private List<String> fieldsOrder;
        private Review review;
        private String submissionSessionToken;

        public InitiateSubmitResponseData() {
        }

        public Map<String, FormField> getFields() {
            return this.fields;
        }

        public List<String> getFieldsOrder() {
            return this.fieldsOrder;
        }

        public List<FormField> getFormFields() {
            Map<String, FormField> map = this.fields;
            return (map == null || map.isEmpty()) ? Collections.EMPTY_LIST : new ArrayList(this.fields.values());
        }

        public Review getReview() {
            return this.review;
        }

        public String getSubmissionSessionToken() {
            return this.submissionSessionToken;
        }
    }

    public InitiateSubmitFormData getData() {
        return this.data;
    }
}
