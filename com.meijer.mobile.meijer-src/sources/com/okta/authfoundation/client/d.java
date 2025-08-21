package com.okta.authfoundation.client;

import Ss.q;
import com.okta.authfoundation.client.OAuth2ClientResult;
import gw.InterfaceC14418g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import okhttp3.Response;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/okta/authfoundation/client/d;", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "LSs/b;", "cacheFactory", "g", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/okta/authfoundation/client/j;", "configuration", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "LSs/q;", "d", "(Lcom/okta/authfoundation/client/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwv/a;", "b", "Lwv/a;", "cacheMutex", "c", "LSs/b;", "cacheInstance", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f120618a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC17929a cacheMutex = wv.g.b(false, 1, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Ss.b cacheInstance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.EndpointsFactory", f = "EndpointsFactory.kt", l = {36, 38, 55}, m = "get")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120621a;

        /* renamed from: b, reason: collision with root package name */
        Object f120622b;

        /* renamed from: c, reason: collision with root package name */
        Object f120623c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f120624d;

        /* renamed from: f, reason: collision with root package name */
        int f120626f;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120624d = obj;
            this.f120626f |= Integer.MIN_VALUE;
            return d.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lcom/okta/authfoundation/client/OAuth2ClientResult$a;", "LSs/q;", "<anonymous>", "(Lmv/O;)Lcom/okta/authfoundation/client/OAuth2ClientResult$a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.client.EndpointsFactory$get$endpoints$1", f = "EndpointsFactory.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OAuth2ClientResult.a<q>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f120627a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ss.b f120628b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f120629c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f120630d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f120628b, this.f120629c, this.f120630d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ss.b bVar, String str, j jVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f120628b = bVar;
            this.f120629c = str;
            this.f120630d = jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OAuth2ClientResult.a<q>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f120627a == 0) {
                ResultKt.b(obj);
                String strA = this.f120628b.a(this.f120629c);
                if (strA == null) {
                    return null;
                }
                try {
                    return new OAuth2ClientResult.a(((k) this.f120630d.getJson().b(k.INSTANCE.serializer(), strA)).a());
                } catch (Exception unused) {
                    return null;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.EndpointsFactory", f = "EndpointsFactory.kt", l = {84, 68}, m = "getOrCreateCache")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120631a;

        /* renamed from: b, reason: collision with root package name */
        Object f120632b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f120633c;

        /* renamed from: e, reason: collision with root package name */
        int f120635e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120633c = obj;
            this.f120635e |= Integer.MIN_VALUE;
            return d.this.g(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Response it) {
        Intrinsics.j(it, "it");
        return it.getIsSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q f(j jVar, Ss.b bVar, String str, InterfaceC14418g responseBody) {
        Intrinsics.j(responseBody, "responseBody");
        k kVar = (k) Gv.a.a(jVar.getJson(), k.INSTANCE.serializer(), responseBody.peek());
        bVar.b(str, responseBody.n3());
        return kVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super Ss.b>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super Ss.b> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.okta.authfoundation.client.d.c
            if (r0 == 0) goto L13
            r0 = r9
            com.okta.authfoundation.client.d$c r0 = (com.okta.authfoundation.client.d.c) r0
            int r1 = r0.f120635e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120635e = r1
            goto L18
        L13:
            com.okta.authfoundation.client.d$c r0 = new com.okta.authfoundation.client.d$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f120633c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f120635e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.f120632b
            com.okta.authfoundation.client.d r8 = (com.okta.authfoundation.client.d) r8
            java.lang.Object r8 = r0.f120631a
            wv.a r8 = (wv.InterfaceC17929a) r8
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L35
            goto L75
        L35:
            r9 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.Object r8 = r0.f120632b
            wv.a r8 = (wv.InterfaceC17929a) r8
            java.lang.Object r2 = r0.f120631a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r2
            goto L5f
        L4d:
            kotlin.ResultKt.b(r9)
            wv.a r9 = com.okta.authfoundation.client.d.cacheMutex
            r0.f120631a = r8
            r0.f120632b = r9
            r0.f120635e = r4
            java.lang.Object r2 = r9.g(r5, r0)
            if (r2 != r1) goto L5f
            goto L71
        L5f:
            Ss.b r2 = com.okta.authfoundation.client.d.cacheInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L81
            com.okta.authfoundation.client.d r2 = com.okta.authfoundation.client.d.f120618a     // Catch: java.lang.Throwable -> L7c
            r0.f120631a = r9     // Catch: java.lang.Throwable -> L7c
            r0.f120632b = r2     // Catch: java.lang.Throwable -> L7c
            r0.f120635e = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7c
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            r2 = r9
            Ss.b r2 = (Ss.b) r2     // Catch: java.lang.Throwable -> L35
            com.okta.authfoundation.client.d.cacheInstance = r2     // Catch: java.lang.Throwable -> L35
            r9 = r8
            goto L81
        L7c:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L85
        L81:
            r9.h(r5)
            return r2
        L85:
            r8.h(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.d.g(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.okta.authfoundation.client.j r10, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<Ss.q>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.okta.authfoundation.client.d.a
            if (r0 == 0) goto L13
            r0 = r11
            com.okta.authfoundation.client.d$a r0 = (com.okta.authfoundation.client.d.a) r0
            int r1 = r0.f120626f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120626f = r1
            goto L18
        L13:
            com.okta.authfoundation.client.d$a r0 = new com.okta.authfoundation.client.d$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f120624d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f120626f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.b(r11)
            return r11
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r0.f120623c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f120622b
            Ss.b r2 = (Ss.b) r2
            java.lang.Object r4 = r0.f120621a
            com.okta.authfoundation.client.j r4 = (com.okta.authfoundation.client.j) r4
            kotlin.ResultKt.b(r11)
            goto L96
        L48:
            java.lang.Object r10 = r0.f120621a
            com.okta.authfoundation.client.j r10 = (com.okta.authfoundation.client.j) r10
            kotlin.ResultKt.b(r11)
            goto L62
        L50:
            kotlin.ResultKt.b(r11)
            kotlin.jvm.functions.Function1 r11 = r10.h()
            r0.f120621a = r10
            r0.f120626f = r5
            java.lang.Object r11 = r9.g(r11, r0)
            if (r11 != r1) goto L62
            goto Lca
        L62:
            r2 = r11
            Ss.b r2 = (Ss.b) r2
            java.lang.String r11 = r10.getDiscoveryUrl()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "endpoints:"
            r5.append(r7)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            kotlin.coroutines.CoroutineContext r5 = r10.getComputeDispatcher()
            com.okta.authfoundation.client.d$b r7 = new com.okta.authfoundation.client.d$b
            r7.<init>(r2, r11, r10, r6)
            r0.f120621a = r10
            r0.f120622b = r2
            r0.f120623c = r11
            r0.f120626f = r4
            java.lang.Object r4 = mv.C15805i.g(r5, r7, r0)
            if (r4 != r1) goto L92
            goto Lca
        L92:
            r8 = r4
            r4 = r10
            r10 = r11
            r11 = r8
        L96:
            com.okta.authfoundation.client.OAuth2ClientResult$a r11 = (com.okta.authfoundation.client.OAuth2ClientResult.a) r11
            if (r11 == 0) goto L9b
            return r11
        L9b:
            okhttp3.Request$a r11 = new okhttp3.Request$a
            r11.<init>()
            okhttp3.HttpUrl$b r5 = okhttp3.HttpUrl.INSTANCE
            java.lang.String r7 = r4.getDiscoveryUrl()
            okhttp3.HttpUrl r5 = r5.c(r7)
            okhttp3.Request$a r11 = r11.v(r5)
            okhttp3.Request r11 = r11.b()
            Ss.f r5 = new Ss.f
            r5.<init>()
            Ss.g r7 = new Ss.g
            r7.<init>()
            r0.f120621a = r6
            r0.f120622b = r6
            r0.f120623c = r6
            r0.f120626f = r3
            java.lang.Object r10 = Us.h.k(r4, r11, r5, r7, r0)
            if (r10 != r1) goto Lcb
        Lca:
            return r1
        Lcb:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.d.d(com.okta.authfoundation.client.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private d() {
    }
}
