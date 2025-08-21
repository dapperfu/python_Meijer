package com.okta.authfoundation.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult;", "T", "", "<init>", "()V", "Error", "a", "Lcom/okta/authfoundation/client/OAuth2ClientResult$Error;", "Lcom/okta/authfoundation/client/OAuth2ClientResult$a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OAuth2ClientResult<T> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0002\u000b\fB\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult$Error;", "T", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "HttpResponseException", "OidcEndpointsNotAvailableException", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error<T> extends OAuth2ClientResult<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Exception exception;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00060\u0001j\u0002`\u0002B%\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult$Error$HttpResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "responseCode", "", "error", "errorDescription", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "I", "getResponseCode", "()I", "b", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "c", "getErrorDescription", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HttpResponseException extends Exception {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int responseCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String error;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String errorDescription;

            /* JADX WARN: Illegal instructions before constructor call */
            public HttpResponseException(int i10, String str, String str2) {
                String str3;
                if (str2 != null) {
                    str3 = str2;
                } else if (str == null) {
                    str3 = "HTTP Error: status code - " + i10;
                } else {
                    str3 = str;
                }
                super(str3);
                this.responseCode = i10;
                this.error = str;
                this.errorDescription = str2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult$Error$OidcEndpointsNotAvailableException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OidcEndpointsNotAvailableException extends Exception {
            public OidcEndpointsNotAvailableException() {
                super("OIDC Endpoints not available.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception) {
            super(null);
            Intrinsics.j(exception, "exception");
            this.exception = exception;
        }

        /* renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult$a;", "T", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "result", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> extends OAuth2ClientResult<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T result;

        public a(T t10) {
            super(null);
            this.result = t10;
        }

        public final T a() {
            return this.result;
        }
    }

    public /* synthetic */ OAuth2ClientResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OAuth2ClientResult() {
    }
}
