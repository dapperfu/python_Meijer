package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public abstract class ConversationsSubmissionResponse extends ConversationsResponse {

    @InterfaceC16127c("AuthorSubmissionToken")
    private String authorSubmissionToken;

    @InterfaceC16127c("Data")
    private FormData formData;

    @InterfaceC16127c("FormErrors")
    private FormError formErrors;

    @InterfaceC16127c("SubmissionId")
    private String submissionId;

    @InterfaceC16127c("TypicalHoursToPost")
    private Integer typicalHoursToPost;

    public String getAuthorSubmissionToken() {
        return this.authorSubmissionToken;
    }

    public List<FieldError> getFieldErrors() {
        FormError formError = this.formErrors;
        return (formError == null || formError.getFieldErrorMap() == null) ? Collections.EMPTY_LIST : new ArrayList(this.formErrors.getFieldErrorMap().values());
    }

    public FormData getFormData() {
        return this.formData;
    }

    public FormError getFormErrors() {
        return this.formErrors;
    }

    public List<FormField> getFormFields() {
        FormData formData = this.formData;
        return (formData == null || formData.getFormFieldMap() == null) ? Collections.EMPTY_LIST : new ArrayList(this.formData.getFormFieldMap().values());
    }

    public String getSubmissionId() {
        return this.submissionId;
    }

    public Integer getTypicalHoursToPost() {
        return this.typicalHoursToPost;
    }
}
