package com.bazaarvoice.bvandroidsdk;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class ConversationsSubmissionException extends ConversationsException {
    private final List<FieldError> fieldErrors;

    public ConversationsSubmissionException(String str, List<Error> list, List<FieldError> list2) {
        super(str, list);
        this.fieldErrors = list2;
    }

    public static ConversationsSubmissionException withNoRequestErrors(String str) {
        List list = Collections.EMPTY_LIST;
        return new ConversationsSubmissionException(str, list, list);
    }

    private String createFieldErrorString(FieldError fieldError) {
        return " Error: " + fieldError.getMessage() + " Field: " + fieldError.getField() + " Code: " + fieldError.getCode();
    }

    public static ConversationsSubmissionException withCallOnMainThread() {
        List list = Collections.EMPTY_LIST;
        return new ConversationsSubmissionException("Method call should not happen from the main thread.", list, list);
    }

    public static ConversationsSubmissionException withNoRequestErrors(String str, Throwable th2) {
        List list = Collections.EMPTY_LIST;
        return new ConversationsSubmissionException(str, th2, list, list);
    }

    public static ConversationsSubmissionException withRequestErrors(List<Error> list, List<FieldError> list2) {
        return new ConversationsSubmissionException("Request has errors", list, list2);
    }

    public List<FieldError> getFieldErrors() {
        return this.fieldErrors;
    }

    public ConversationsSubmissionException(String str, Throwable th2, List<Error> list, List<FieldError> list2) {
        super(str, th2, list);
        this.fieldErrors = list2;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsException
    public String getErrorListMessages() {
        StringBuilder sb2 = new StringBuilder(super.getErrorListMessages());
        List<FieldError> list = this.fieldErrors;
        if (list != null) {
            for (FieldError fieldError : list) {
                if (fieldError != null) {
                    sb2.append(createFieldErrorString(fieldError));
                }
            }
        }
        return sb2.toString();
    }
}
