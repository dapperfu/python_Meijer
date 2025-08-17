package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class FieldError {

    @InterfaceC15617c(alternate = {"code"}, value = "Code")
    private String code;
    private transient SubmissionErrorCode errorCode;

    @InterfaceC15617c(alternate = {"field"}, value = "Field")
    private String field;
    private transient FormField formField;

    @InterfaceC15617c(alternate = {"message"}, value = "Message")
    private String message;

    public FieldError() {
    }

    public FieldError(String str, String str2, String str3) {
        this.field = str;
        this.message = str2;
        this.code = str3;
    }

    public String getCode() {
        return this.code;
    }

    public SubmissionErrorCode getErrorCode() {
        if (this.errorCode == null) {
            try {
                this.errorCode = SubmissionErrorCode.valueOf(getCode());
            } catch (IllegalArgumentException unused) {
                this.errorCode = SubmissionErrorCode.ERROR_UNKNOWN;
            }
        }
        return this.errorCode;
    }

    public String getField() {
        return this.field;
    }

    public FormField getFormField() {
        return this.formField;
    }

    public String getMessage() {
        return this.message;
    }

    void setFormField(FormField formField) {
        this.formField = formField;
    }
}
