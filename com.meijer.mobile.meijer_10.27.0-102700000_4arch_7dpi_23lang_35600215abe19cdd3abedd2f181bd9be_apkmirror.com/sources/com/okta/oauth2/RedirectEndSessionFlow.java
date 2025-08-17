package com.okta.oauth2;

import Us.i;
import android.net.Uri;
import com.okta.authfoundation.client.OAuth2ClientResult;
import com.okta.authfoundation.client.h;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0004\u0015\f\u0018\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/okta/oauth2/RedirectEndSessionFlow;", "", "Lcom/okta/authfoundation/client/h;", "client", "<init>", "(Lcom/okta/authfoundation/client/h;)V", "()V", "", "redirectUrl", "idToken", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lcom/okta/oauth2/RedirectEndSessionFlow$b;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "flowContext", "", "a", "(Landroid/net/Uri;Lcom/okta/oauth2/RedirectEndSessionFlow$b;)Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lcom/okta/authfoundation/client/h;", "ResumeException", "RedirectSchemeMismatchException", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RedirectEndSessionFlow {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h client;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/okta/oauth2/RedirectEndSessionFlow$RedirectSchemeMismatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RedirectSchemeMismatchException extends Exception {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/okta/oauth2/RedirectEndSessionFlow$ResumeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResumeException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeException(String message) {
            super(message);
            Intrinsics.j(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/okta/oauth2/RedirectEndSessionFlow$b;", "", "Lokhttp3/HttpUrl;", "url", "", "redirectUrl", "state", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lokhttp3/HttpUrl;", "c", "()Lokhttp3/HttpUrl;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String redirectUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String state;

        public b(HttpUrl url, String redirectUrl, String state) {
            Intrinsics.j(url, "url");
            Intrinsics.j(redirectUrl, "redirectUrl");
            Intrinsics.j(state, "state");
            this.url = url;
            this.redirectUrl = redirectUrl;
            this.state = state;
        }

        /* renamed from: a, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* renamed from: b, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* renamed from: c, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.oauth2.RedirectEndSessionFlow", f = "RedirectEndSessionFlow.kt", l = {94}, m = "start$oauth2_release")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f119829a;

        /* renamed from: b, reason: collision with root package name */
        Object f119830b;

        /* renamed from: c, reason: collision with root package name */
        Object f119831c;

        /* renamed from: d, reason: collision with root package name */
        Object f119832d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f119833e;

        /* renamed from: g, reason: collision with root package name */
        int f119835g;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f119833e = obj;
            this.f119835g |= Integer.MIN_VALUE;
            return RedirectEndSessionFlow.this.c(null, null, null, this);
        }
    }

    public RedirectEndSessionFlow(h client) {
        Intrinsics.j(client, "client");
        this.client = client;
    }

    static {
        i.f36312a.c("okta-oauth2-kotlin/2.0.3");
    }

    public final OAuth2ClientResult<Unit> a(Uri uri, b flowContext) {
        Intrinsics.j(uri, "uri");
        Intrinsics.j(flowContext, "flowContext");
        String string = uri.toString();
        Intrinsics.i(string, "toString(...)");
        if (!StringsKt.W(string, flowContext.getRedirectUrl(), false, 2, null)) {
            return new OAuth2ClientResult.Error(new RedirectSchemeMismatchException());
        }
        if (uri.getQueryParameter("error") == null) {
            return !Intrinsics.e(flowContext.getState(), uri.getQueryParameter("state")) ? new OAuth2ClientResult.Error(new ResumeException("Failed due to state mismatch.")) : new OAuth2ClientResult.a(Unit.f142422a);
        }
        String queryParameter = uri.getQueryParameter("error_description");
        if (queryParameter == null) {
            queryParameter = "An error occurred.";
        }
        return new OAuth2ClientResult.Error(new ResumeException(queryParameter));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<com.okta.oauth2.RedirectEndSessionFlow.b>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.okta.oauth2.RedirectEndSessionFlow.c
            if (r0 == 0) goto L13
            r0 = r8
            com.okta.oauth2.RedirectEndSessionFlow$c r0 = (com.okta.oauth2.RedirectEndSessionFlow.c) r0
            int r1 = r0.f119835g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f119835g = r1
            goto L18
        L13:
            com.okta.oauth2.RedirectEndSessionFlow$c r0 = new com.okta.oauth2.RedirectEndSessionFlow$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f119833e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f119835g
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.f119832d
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.f119831c
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f119830b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f119829a
            com.okta.oauth2.RedirectEndSessionFlow r0 = (com.okta.oauth2.RedirectEndSessionFlow) r0
            kotlin.ResultKt.b(r8)
            goto L5a
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.ResultKt.b(r8)
            com.okta.authfoundation.client.h r8 = r4.client
            r0.f119829a = r4
            r0.f119830b = r5
            r0.f119831c = r6
            r0.f119832d = r7
            r0.f119835g = r3
            java.lang.Object r8 = r8.j(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r0 = r4
        L5a:
            Ss.q r8 = (Ss.q) r8
            if (r8 == 0) goto L87
            okhttp3.HttpUrl r8 = r8.getEndSessionEndpoint()
            if (r8 != 0) goto L65
            goto L87
        L65:
            okhttp3.HttpUrl$a r8 = r8.k()
            java.lang.String r0 = "id_token_hint"
            r8.f(r0, r6)
            java.lang.String r6 = "post_logout_redirect_uri"
            r8.f(r6, r5)
            java.lang.String r6 = "state"
            r8.f(r6, r7)
            com.okta.authfoundation.client.OAuth2ClientResult$a r6 = new com.okta.authfoundation.client.OAuth2ClientResult$a
            com.okta.oauth2.RedirectEndSessionFlow$b r0 = new com.okta.oauth2.RedirectEndSessionFlow$b
            okhttp3.HttpUrl r8 = r8.g()
            r0.<init>(r8, r5, r7)
            r6.<init>(r0)
            return r6
        L87:
            com.okta.authfoundation.client.h r5 = r0.client
            com.okta.authfoundation.client.OAuth2ClientResult$Error r5 = r5.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.oauth2.RedirectEndSessionFlow.c(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public RedirectEndSessionFlow() {
        this(h.INSTANCE.d());
    }

    public final Object b(String str, String str2, Continuation<? super OAuth2ClientResult<b>> continuation) {
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "toString(...)");
        return c(str, str2, string, continuation);
    }
}
