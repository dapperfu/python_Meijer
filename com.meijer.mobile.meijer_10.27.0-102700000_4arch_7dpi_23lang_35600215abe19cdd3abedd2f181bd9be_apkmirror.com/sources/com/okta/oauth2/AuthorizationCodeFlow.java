package com.okta.oauth2;

import Us.i;
import com.okta.authfoundation.client.OAuth2ClientResult;
import com.okta.authfoundation.client.h;
import dt.C13572a;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0005\u0019\u000f\u001c\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006JH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/okta/oauth2/AuthorizationCodeFlow;", "", "Lcom/okta/authfoundation/client/h;", "client", "<init>", "(Lcom/okta/authfoundation/client/h;)V", "()V", "", "redirectUrl", "", "extraRequestParameters", "scope", "state", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lcom/okta/oauth2/AuthorizationCodeFlow$b;", "b", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "codeVerifier", "nonce", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "flowContext", "LVs/p;", "a", "(Landroid/net/Uri;Lcom/okta/oauth2/AuthorizationCodeFlow$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/okta/authfoundation/client/h;", "ResumeException", "RedirectSchemeMismatchException", "MissingResultCodeException", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthorizationCodeFlow {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h client;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/okta/oauth2/AuthorizationCodeFlow$MissingResultCodeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingResultCodeException extends Exception {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/okta/oauth2/AuthorizationCodeFlow$RedirectSchemeMismatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RedirectSchemeMismatchException extends Exception {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/okta/oauth2/AuthorizationCodeFlow$ResumeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "errorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getErrorId", "()Ljava/lang/String;", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResumeException extends Exception {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String errorId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeException(String message, String errorId) {
            super(message);
            Intrinsics.j(message, "message");
            Intrinsics.j(errorId, "errorId");
            this.errorId = errorId;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\r\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/okta/oauth2/AuthorizationCodeFlow$b;", "", "Lokhttp3/HttpUrl;", "url", "", "redirectUrl", "codeVerifier", "state", "nonce", "", "maxAge", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Lokhttp3/HttpUrl;", "f", "()Lokhttp3/HttpUrl;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "oauth2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String redirectUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String codeVerifier;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String state;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String nonce;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Integer maxAge;

        public b(HttpUrl url, String redirectUrl, String codeVerifier, String state, String nonce, Integer num) {
            Intrinsics.j(url, "url");
            Intrinsics.j(redirectUrl, "redirectUrl");
            Intrinsics.j(codeVerifier, "codeVerifier");
            Intrinsics.j(state, "state");
            Intrinsics.j(nonce, "nonce");
            this.url = url;
            this.redirectUrl = redirectUrl;
            this.codeVerifier = codeVerifier;
            this.state = state;
            this.nonce = nonce;
            this.maxAge = num;
        }

        /* renamed from: a, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getMaxAge() {
            return this.maxAge;
        }

        /* renamed from: c, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: d, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* renamed from: e, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* renamed from: f, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.oauth2.AuthorizationCodeFlow", f = "AuthorizationCodeFlow.kt", l = {181, 195}, m = "resume")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f119808a;

        /* renamed from: b, reason: collision with root package name */
        Object f119809b;

        /* renamed from: c, reason: collision with root package name */
        Object f119810c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f119811d;

        /* renamed from: f, reason: collision with root package name */
        int f119813f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f119811d = obj;
            this.f119813f |= Integer.MIN_VALUE;
            return AuthorizationCodeFlow.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.oauth2.AuthorizationCodeFlow", f = "AuthorizationCodeFlow.kt", l = {133}, m = "start$oauth2_release")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f119814a;

        /* renamed from: b, reason: collision with root package name */
        Object f119815b;

        /* renamed from: c, reason: collision with root package name */
        Object f119816c;

        /* renamed from: d, reason: collision with root package name */
        Object f119817d;

        /* renamed from: e, reason: collision with root package name */
        Object f119818e;

        /* renamed from: f, reason: collision with root package name */
        Object f119819f;

        /* renamed from: g, reason: collision with root package name */
        Object f119820g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f119821h;

        /* renamed from: j, reason: collision with root package name */
        int f119823j;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f119821h = obj;
            this.f119823j |= Integer.MIN_VALUE;
            return AuthorizationCodeFlow.this.d(null, null, null, null, null, null, this);
        }
    }

    public AuthorizationCodeFlow(h client) {
        Intrinsics.j(client, "client");
        this.client = client;
    }

    static {
        i.f36312a.c("okta-oauth2-kotlin/2.0.3");
    }

    public static /* synthetic */ Object c(AuthorizationCodeFlow authorizationCodeFlow, String str, Map map, String str2, String str3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.k();
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            str2 = authorizationCodeFlow.client.getConfiguration().getDefaultScope();
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return authorizationCodeFlow.b(str, map2, str4, str3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r10, com.okta.oauth2.AuthorizationCodeFlow.b r11, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<Vs.p>> r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.oauth2.AuthorizationCodeFlow.a(android.net.Uri, com.okta.oauth2.AuthorizationCodeFlow$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(String str, Map<String, String> map, String str2, String str3, Continuation<? super OAuth2ClientResult<b>> continuation) {
        String strC = C13572a.f127628a.c();
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "toString(...)");
        return d(str, strC, str3, string, map, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<com.okta.oauth2.AuthorizationCodeFlow.b>> r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.oauth2.AuthorizationCodeFlow.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public AuthorizationCodeFlow() {
        this(h.INSTANCE.d());
    }
}
