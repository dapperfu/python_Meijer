package com.bazaarvoice.bvandroidsdk;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class ConversationsException extends BazaarException {
    protected static final String CALL_ON_MAIN_THREAD = "Method call should not happen from the main thread.";
    protected static final String REQUEST_ERROR_MESSAGE = "Request has errors";
    private final List<Error> errors;

    public ConversationsException(String str, List<Error> list) {
        super(str);
        this.errors = list;
    }

    public static ConversationsException withNoRequestErrors(String str) {
        return new ConversationsException(str, Collections.EMPTY_LIST);
    }

    public static ConversationsException withCallOnMainThread() {
        return new ConversationsException(CALL_ON_MAIN_THREAD, Collections.EMPTY_LIST);
    }

    public static ConversationsException withNoRequestErrors(String str, Throwable th2) {
        return new ConversationsException(str, th2, Collections.EMPTY_LIST);
    }

    public static ConversationsException withRequestErrors(List<Error> list) {
        return new ConversationsException(REQUEST_ERROR_MESSAGE, list);
    }

    public String getErrorListMessages() {
        StringBuilder sb2 = new StringBuilder("Conversations Exception\n");
        List<Error> list = this.errors;
        if (list != null) {
            for (Error error : list) {
                if (error != null) {
                    sb2.append("Error: ");
                    sb2.append(error.getMessage());
                    sb2.append(" Code: ");
                    sb2.append(error.getCode());
                }
            }
        }
        return sb2.toString();
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public ConversationsException(String str, Throwable th2, List<Error> list) {
        super(str, th2);
        this.errors = list;
    }
}
