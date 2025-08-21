package com.okta.authfoundation.client;

import Vs.p;
import bt.C6409a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/okta/authfoundation/client/l;", "", "Lcom/okta/authfoundation/client/h;", "client", "LVs/p;", "token", "", "nonce", "", "maxAge", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lbt/a;", "jwksResult", "<init>", "(Lcom/okta/authfoundation/client/h;LVs/p;Ljava/lang/String;Ljava/lang/Integer;Lcom/okta/authfoundation/client/OAuth2ClientResult;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/okta/authfoundation/client/h;", "b", "LVs/p;", "c", "Ljava/lang/String;", "d", "Ljava/lang/Integer;", "e", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lbt/d;", "f", "Lbt/d;", "parser", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p token;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String nonce;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer maxAge;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final OAuth2ClientResult<C6409a> jwksResult;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bt.d parser;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.TokenValidator", f = "TokenValidator.kt", l = {35, 47, 57, 64}, m = "validate")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120729a;

        /* renamed from: b, reason: collision with root package name */
        Object f120730b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f120731c;

        /* renamed from: e, reason: collision with root package name */
        int f120733e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120731c = obj;
            this.f120733e |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    public l(h client, p token, String str, Integer num, OAuth2ClientResult<C6409a> oAuth2ClientResult) {
        Intrinsics.j(client, "client");
        Intrinsics.j(token, "token");
        this.client = client;
        this.token = token;
        this.nonce = str;
        this.maxAge = num;
        this.jwksResult = oAuth2ClientResult;
        this.parser = new bt.d(client.getConfiguration().getJson(), client.getConfiguration().getComputeDispatcher());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (r5.a(r4, r12, r2, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.l.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
