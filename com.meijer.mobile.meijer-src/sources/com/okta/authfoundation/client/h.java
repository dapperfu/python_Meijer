package com.okta.authfoundation.client;

import Ss.q;
import Vs.p;
import Vs.t;
import bt.C6409a;
import com.okta.authfoundation.client.OAuth2ClientResult;
import com.okta.authfoundation.client.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.C15784P;
import mv.InterfaceC15783O;
import okhttp3.Request;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 72\u00020\u0001:\u0001-B=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0017\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0086@¢\u0006\u0004\b\u001f\u0010\u000fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u0087@¢\u0006\u0004\b \u0010\u000fJ\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010!H\u0007¢\u0006\u0004\b#\u0010$JB\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0010H\u0087@¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\rR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104¨\u00068"}, d2 = {"Lcom/okta/authfoundation/client/h;", "", "Lcom/okta/authfoundation/client/j;", "configuration", "Lct/e;", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "LSs/q;", "endpoints", "Lbt/a;", "jwks", "<init>", "(Lcom/okta/authfoundation/client/j;Lct/e;Lct/e;)V", "n", "()Lct/e;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/p;", "LVs/t;", "tokenType", "Lkotlin/Result;", "", "l", "(LVs/p;LVs/t;)Ljava/lang/Object;", "token", "p", "(LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/i;", "revokeTokenType", "", "q", "(LVs/i;LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "j", "T", "Lcom/okta/authfoundation/client/OAuth2ClientResult$Error;", "i", "()Lcom/okta/authfoundation/client/OAuth2ClientResult$Error;", "Lokhttp3/Request;", "request", "nonce", "", "maxAge", "requestToken", "r", "(Lokhttp3/Request;Ljava/lang/String;Ljava/lang/Integer;LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/okta/authfoundation/client/j;", "k", "()Lcom/okta/authfoundation/client/j;", "getConfiguration$annotations", "()V", "b", "Lct/e;", "getEndpoints$auth_foundation_release", "c", "d", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Lazy<h> f120649e = LazyKt.b(new Function0() { // from class: Ss.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return com.okta.authfoundation.client.h.h();
        }
    });

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j configuration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ct.e<OAuth2ClientResult<q>> endpoints;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ct.e<OAuth2ClientResult<C6409a>> jwks;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/okta/authfoundation/client/h$a;", "", "<init>", "()V", "Lcom/okta/authfoundation/client/j;", "configuration", "Lcom/okta/authfoundation/client/h;", "b", "(Lcom/okta/authfoundation/client/j;)Lcom/okta/authfoundation/client/h;", "default$delegate", "Lkotlin/Lazy;", "d", "()Lcom/okta/authfoundation/client/h;", "default", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.client.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult;", "LSs/q;", "<anonymous>", "()Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client$Companion$createFromConfiguration$1", f = "OAuth2Client.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: com.okta.authfoundation.client.h$a$a, reason: collision with other inner class name */
        static final class C1972a extends SuspendLambda implements Function1<Continuation<? super OAuth2ClientResult<q>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f120653a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f120654b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1972a(j jVar, Continuation<? super C1972a> continuation) {
                super(1, continuation);
                this.f120654b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C1972a(this.f120654b, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super OAuth2ClientResult<q>> continuation) {
                return ((C1972a) create(continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f120653a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.okta.authfoundation.client.d dVar = com.okta.authfoundation.client.d.f120618a;
                j jVar = this.f120654b;
                this.f120653a = 1;
                Object objD = dVar.d(jVar, this);
                if (objD == objF) {
                    return objF;
                }
                return objD;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(OAuth2ClientResult result) {
            Intrinsics.j(result, "result");
            return result instanceof OAuth2ClientResult.a;
        }

        public final h b(j configuration) {
            Intrinsics.j(configuration, "configuration");
            return new h(configuration, new ct.e(new C1972a(configuration, null), new Function1() { // from class: Ss.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(h.Companion.c((OAuth2ClientResult) obj));
                }
            }, null, 4, null), null, 4, null);
        }

        public final h d() {
            return (h) h.f120649e.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f40447b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f40446a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f40448c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.f40449d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client", f = "OAuth2Client.kt", l = {228, 238}, m = "actualJwks")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120655a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f120656b;

        /* renamed from: d, reason: collision with root package name */
        int f120658d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120656b = obj;
            this.f120658d |= Integer.MIN_VALUE;
            return h.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client", f = "OAuth2Client.kt", l = {245}, m = "endpointsOrNull")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f120659a;

        /* renamed from: c, reason: collision with root package name */
        int f120661c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120659a = obj;
            this.f120661c |= Integer.MIN_VALUE;
            return h.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client", f = "OAuth2Client.kt", l = {129, 146}, m = "refreshToken")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120664a;

        /* renamed from: b, reason: collision with root package name */
        Object f120665b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f120666c;

        /* renamed from: e, reason: collision with root package name */
        int f120668e;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120666c = obj;
            this.f120668e |= Integer.MIN_VALUE;
            return h.this.p(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client", f = "OAuth2Client.kt", l = {158, 174}, m = "revokeToken")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120669a;

        /* renamed from: b, reason: collision with root package name */
        Object f120670b;

        /* renamed from: c, reason: collision with root package name */
        Object f120671c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f120672d;

        /* renamed from: f, reason: collision with root package name */
        int f120674f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120672d = obj;
            this.f120674f |= Integer.MIN_VALUE;
            return h.this.q(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "LVs/p;", "<anonymous>", "(Lmv/O;)Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client$tokenRequest$2", f = "OAuth2Client.kt", l = {279, 284, 284, 287, 287}, m = "invokeSuspend")
    /* renamed from: com.okta.authfoundation.client.h$h, reason: collision with other inner class name */
    static final class C1973h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OAuth2ClientResult<p>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f120675a;

        /* renamed from: b, reason: collision with root package name */
        Object f120676b;

        /* renamed from: c, reason: collision with root package name */
        Object f120677c;

        /* renamed from: d, reason: collision with root package name */
        Object f120678d;

        /* renamed from: e, reason: collision with root package name */
        Object f120679e;

        /* renamed from: f, reason: collision with root package name */
        int f120680f;

        /* renamed from: g, reason: collision with root package name */
        int f120681g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f120682h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f120683i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f120684j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f120685k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Integer f120686l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Request f120687m;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lbt/a;", "<anonymous>", "(Lmv/O;)Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client$tokenRequest$2$jwksDeferred$1", f = "OAuth2Client.kt", l = {276, 277}, m = "invokeSuspend")
        /* renamed from: com.okta.authfoundation.client.h$h$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OAuth2ClientResult<C6409a>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f120688a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f120689b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f120689b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f120689b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OAuth2ClientResult<C6409a>> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f120688a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    h hVar = this.f120689b;
                    this.f120688a = 1;
                    obj = hVar.j(this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                q qVar = (q) obj;
                if (qVar != null && qVar.getJwksUri() != null) {
                    h hVar2 = this.f120689b;
                    this.f120688a = 2;
                    Object objM = hVar2.m(this);
                    if (objM == objF) {
                        return objF;
                    }
                    return objM;
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "LVs/p;", "<anonymous>", "(Lmv/O;)Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client$tokenRequest$2$tokenDeferred$1", f = "OAuth2Client.kt", l = {271}, m = "invokeSuspend")
        /* renamed from: com.okta.authfoundation.client.h$h$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OAuth2ClientResult<p>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f120690a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f120691b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Request f120692c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f120693d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, Request request, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f120691b = hVar;
                this.f120692c = request;
                this.f120693d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f120691b, this.f120692c, this.f120693d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OAuth2ClientResult<p>> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p g(String str, h hVar, Vs.k kVar) {
                return kVar.a(str, hVar.getConfiguration());
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f120690a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                h hVar = this.f120691b;
                zv.b<Vs.k> bVarSerializer = Vs.k.INSTANCE.serializer();
                Request request = this.f120692c;
                final String str = this.f120693d;
                final h hVar2 = this.f120691b;
                Function1 function1 = new Function1() { // from class: com.okta.authfoundation.client.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return h.C1973h.b.g(str, hVar2, (Vs.k) obj2);
                    }
                };
                this.f120690a = 1;
                Object objP = Us.h.p(hVar, bVarSerializer, request, null, function1, this, 4, null);
                if (objP == objF) {
                    return objF;
                }
                return objP;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1973h c1973h = new C1973h(this.f120683i, this.f120684j, this.f120685k, this.f120686l, this.f120687m, continuation);
            c1973h.f120682h = obj;
            return c1973h;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1973h(p pVar, h hVar, String str, Integer num, Request request, Continuation<? super C1973h> continuation) {
            super(2, continuation);
            this.f120683i = pVar;
            this.f120684j = hVar;
            this.f120685k = str;
            this.f120686l = num;
            this.f120687m = request;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OAuth2ClientResult<p>> continuation) {
            return ((C1973h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:10:0x001c, B:17:0x0034, B:55:0x0143, B:20:0x0043, B:49:0x011f, B:51:0x0133, B:23:0x0064, B:45:0x00fd, B:41:0x00da), top: B:63:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0151 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0152 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0153 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.h.C1973h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private h(j jVar, ct.e<OAuth2ClientResult<q>> eVar, ct.e<OAuth2ClientResult<C6409a>> eVar2) {
        this.configuration = jVar;
        this.endpoints = eVar;
        this.jwks = eVar2 == null ? n() : eVar2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lbt/a;", "<anonymous>", "()Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.client.OAuth2Client$jwksCoalescingOrchestrator$1", f = "OAuth2Client.kt", l = {219}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function1<Continuation<? super OAuth2ClientResult<C6409a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f120662a;

        e(Continuation<? super e> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return h.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super OAuth2ClientResult<C6409a>> continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f120662a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            h hVar = h.this;
            this.f120662a = 1;
            Object objF2 = hVar.f(this);
            if (objF2 == objF) {
                return objF;
            }
            return objF2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<bt.C6409a>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.okta.authfoundation.client.h.c
            if (r0 == 0) goto L14
            r0 = r10
            com.okta.authfoundation.client.h$c r0 = (com.okta.authfoundation.client.h.c) r0
            int r1 = r0.f120658d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f120658d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.okta.authfoundation.client.h$c r0 = new com.okta.authfoundation.client.h$c
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f120656b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f120658d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.ResultKt.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.Object r1 = r6.f120655a
            com.okta.authfoundation.client.h r1 = (com.okta.authfoundation.client.h) r1
            kotlin.ResultKt.b(r10)
            goto L4d
        L3e:
            kotlin.ResultKt.b(r10)
            r6.f120655a = r9
            r6.f120658d = r3
            java.lang.Object r10 = r9.j(r6)
            if (r10 != r0) goto L4c
            goto L92
        L4c:
            r1 = r9
        L4d:
            Ss.q r10 = (Ss.q) r10
            if (r10 == 0) goto L94
            okhttp3.HttpUrl r10 = r10.getJwksUri()
            if (r10 != 0) goto L58
            goto L94
        L58:
            okhttp3.HttpUrl$a r10 = r10.k()
            com.okta.authfoundation.client.j r3 = r1.configuration
            java.lang.String r3 = r3.getClientId()
            java.lang.String r4 = "client_id"
            okhttp3.HttpUrl$a r10 = r10.f(r4, r3)
            okhttp3.HttpUrl r10 = r10.g()
            okhttp3.Request$a r3 = new okhttp3.Request$a
            r3.<init>()
            okhttp3.Request$a r10 = r3.v(r10)
            okhttp3.Request r3 = r10.b()
            bt.e$b r10 = bt.e.INSTANCE
            zv.b r10 = r10.serializer()
            Ss.k r5 = new Ss.k
            r5.<init>()
            r4 = 0
            r6.f120655a = r4
            r6.f120658d = r2
            r7 = 4
            r8 = 0
            r2 = r10
            java.lang.Object r10 = Us.h.p(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L93
        L92:
            return r0
        L93:
            return r10
        L94:
            com.okta.authfoundation.client.OAuth2ClientResult$Error r10 = r1.i()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.h.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6409a g(bt.e serializableJwks) {
        Intrinsics.j(serializableJwks, "serializableJwks");
        return serializableJwks.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h h() {
        return INSTANCE.b(j.INSTANCE.d());
    }

    private final Object l(p pVar, t tVar) {
        int i10 = b.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 == 1) {
            Result.Companion companion = Result.INSTANCE;
            return Result.b(pVar.getAccessToken());
        }
        if (i10 == 2) {
            String refreshToken = pVar.getRefreshToken();
            if (refreshToken != null) {
                return Result.b(refreshToken);
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.b(ResultKt.a(new IllegalStateException("No refresh token.")));
        }
        if (i10 == 3) {
            String idToken = pVar.getIdToken();
            if (idToken != null) {
                return Result.b(idToken);
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.b(ResultKt.a(new IllegalStateException("No id token.")));
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String deviceSecret = pVar.getDeviceSecret();
        if (deviceSecret != null) {
            return Result.b(deviceSecret);
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.b(ResultKt.a(new IllegalStateException("No device secret.")));
    }

    private final ct.e<OAuth2ClientResult<C6409a>> n() {
        return new ct.e<>(new e(null), new Function1() { // from class: Ss.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(com.okta.authfoundation.client.h.o((OAuth2ClientResult) obj));
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(OAuth2ClientResult result) {
        Intrinsics.j(result, "result");
        return result instanceof OAuth2ClientResult.a;
    }

    public static /* synthetic */ Object s(h hVar, Request request, String str, Integer num, p pVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            pVar = null;
        }
        return hVar.r(request, str, num, pVar, continuation);
    }

    public final <T> OAuth2ClientResult.Error<T> i() {
        return new OAuth2ClientResult.Error<>(new OAuth2ClientResult.Error.OidcEndpointsNotAvailableException());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super Ss.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.okta.authfoundation.client.h.d
            if (r0 == 0) goto L13
            r0 = r5
            com.okta.authfoundation.client.h$d r0 = (com.okta.authfoundation.client.h.d) r0
            int r1 = r0.f120661c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120661c = r1
            goto L18
        L13:
            com.okta.authfoundation.client.h$d r0 = new com.okta.authfoundation.client.h$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f120659a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f120661c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            ct.e<com.okta.authfoundation.client.OAuth2ClientResult<Ss.q>> r5 = r4.endpoints
            r0.f120661c = r3
            java.lang.Object r5 = r5.l(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.okta.authfoundation.client.OAuth2ClientResult r5 = (com.okta.authfoundation.client.OAuth2ClientResult) r5
            boolean r0 = r5 instanceof com.okta.authfoundation.client.OAuth2ClientResult.Error
            if (r0 == 0) goto L47
            r5 = 0
            return r5
        L47:
            boolean r0 = r5 instanceof com.okta.authfoundation.client.OAuth2ClientResult.a
            if (r0 == 0) goto L54
            com.okta.authfoundation.client.OAuth2ClientResult$a r5 = (com.okta.authfoundation.client.OAuth2ClientResult.a) r5
            java.lang.Object r5 = r5.a()
            Ss.q r5 = (Ss.q) r5
            return r5
        L54:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.h.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: k, reason: from getter */
    public final j getConfiguration() {
        return this.configuration;
    }

    public final Object m(Continuation<? super OAuth2ClientResult<C6409a>> continuation) {
        return this.jwks.l(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(Vs.p r10, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<Vs.p>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.okta.authfoundation.client.h.f
            if (r0 == 0) goto L14
            r0 = r11
            com.okta.authfoundation.client.h$f r0 = (com.okta.authfoundation.client.h.f) r0
            int r1 = r0.f120668e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f120668e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.okta.authfoundation.client.h$f r0 = new com.okta.authfoundation.client.h$f
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f120666c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f120668e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.ResultKt.b(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r6.f120665b
            Vs.p r10 = (Vs.p) r10
            java.lang.Object r1 = r6.f120664a
            com.okta.authfoundation.client.h r1 = (com.okta.authfoundation.client.h) r1
            kotlin.ResultKt.b(r11)
        L41:
            r5 = r10
            goto L55
        L43:
            kotlin.ResultKt.b(r11)
            r6.f120664a = r9
            r6.f120665b = r10
            r6.f120668e = r3
            java.lang.Object r11 = r9.j(r6)
            if (r11 != r0) goto L53
            goto Lb4
        L53:
            r1 = r9
            goto L41
        L55:
            Ss.q r11 = (Ss.q) r11
            if (r11 != 0) goto L5e
            com.okta.authfoundation.client.OAuth2ClientResult$Error r10 = r1.i()
            return r10
        L5e:
            Vs.t r10 = Vs.t.f40446a
            java.lang.Object r10 = r1.l(r5, r10)
            java.lang.Throwable r4 = kotlin.Result.e(r10)
            if (r4 != 0) goto Lb6
            java.lang.String r10 = (java.lang.String) r10
            okhttp3.h$a r4 = new okhttp3.h$a
            r7 = 0
            r4.<init>(r7, r3, r7)
            com.okta.authfoundation.client.j r3 = r1.configuration
            java.lang.String r3 = r3.getClientId()
            java.lang.String r8 = "client_id"
            okhttp3.h$a r3 = r4.a(r8, r3)
            java.lang.String r4 = "grant_type"
            java.lang.String r8 = "refresh_token"
            okhttp3.h$a r3 = r3.a(r4, r8)
            okhttp3.h$a r10 = r3.a(r8, r10)
            okhttp3.h r10 = r10.c()
            okhttp3.Request$a r3 = new okhttp3.Request$a
            r3.<init>()
            okhttp3.HttpUrl r11 = r11.getTokenEndpoint()
            okhttp3.Request$a r11 = r3.v(r11)
            okhttp3.Request$a r10 = r11.p(r10)
            okhttp3.Request r10 = r10.b()
            r6.f120664a = r7
            r6.f120665b = r7
            r6.f120668e = r2
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            r2 = r10
            java.lang.Object r10 = s(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto Lb5
        Lb4:
            return r0
        Lb5:
            return r10
        Lb6:
            com.okta.authfoundation.client.OAuth2ClientResult$Error r10 = new com.okta.authfoundation.client.OAuth2ClientResult$Error
            java.lang.String r11 = "null cannot be cast to non-null type java.lang.Exception"
            kotlin.jvm.internal.Intrinsics.h(r4, r11)
            java.lang.Exception r4 = (java.lang.Exception) r4
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.h.p(Vs.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(Vs.i r8, Vs.p r9, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<kotlin.Unit>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.okta.authfoundation.client.h.g
            if (r0 == 0) goto L13
            r0 = r10
            com.okta.authfoundation.client.h$g r0 = (com.okta.authfoundation.client.h.g) r0
            int r1 = r0.f120674f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120674f = r1
            goto L18
        L13:
            com.okta.authfoundation.client.h$g r0 = new com.okta.authfoundation.client.h$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f120672d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f120674f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f120671c
            r9 = r8
            Vs.p r9 = (Vs.p) r9
            java.lang.Object r8 = r0.f120670b
            Vs.i r8 = (Vs.i) r8
            java.lang.Object r2 = r0.f120669a
            com.okta.authfoundation.client.h r2 = (com.okta.authfoundation.client.h) r2
            kotlin.ResultKt.b(r10)
            goto L58
        L45:
            kotlin.ResultKt.b(r10)
            r0.f120669a = r7
            r0.f120670b = r8
            r0.f120671c = r9
            r0.f120674f = r4
            java.lang.Object r10 = r7.j(r0)
            if (r10 != r1) goto L57
            goto Lae
        L57:
            r2 = r7
        L58:
            Ss.q r10 = (Ss.q) r10
            if (r10 == 0) goto Lbd
            okhttp3.HttpUrl r10 = r10.getRevocationEndpoint()
            if (r10 != 0) goto L63
            goto Lbd
        L63:
            Vs.t r8 = r8.b()
            java.lang.Object r8 = r2.l(r9, r8)
            java.lang.Throwable r9 = kotlin.Result.e(r8)
            if (r9 != 0) goto Lb0
            java.lang.String r8 = (java.lang.String) r8
            okhttp3.h$a r9 = new okhttp3.h$a
            r5 = 0
            r9.<init>(r5, r4, r5)
            com.okta.authfoundation.client.j r4 = r2.configuration
            java.lang.String r4 = r4.getClientId()
            java.lang.String r6 = "client_id"
            okhttp3.h$a r9 = r9.a(r6, r4)
            java.lang.String r4 = "token"
            okhttp3.h$a r8 = r9.a(r4, r8)
            okhttp3.h r8 = r8.c()
            okhttp3.Request$a r9 = new okhttp3.Request$a
            r9.<init>()
            okhttp3.Request$a r9 = r9.v(r10)
            okhttp3.Request$a r8 = r9.p(r8)
            okhttp3.Request r8 = r8.b()
            r0.f120669a = r5
            r0.f120670b = r5
            r0.f120671c = r5
            r0.f120674f = r3
            java.lang.Object r8 = Us.h.s(r2, r8, r0)
            if (r8 != r1) goto Laf
        Lae:
            return r1
        Laf:
            return r8
        Lb0:
            com.okta.authfoundation.client.OAuth2ClientResult$Error r8 = new com.okta.authfoundation.client.OAuth2ClientResult$Error
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.Exception"
            kotlin.jvm.internal.Intrinsics.h(r9, r10)
            java.lang.Exception r9 = (java.lang.Exception) r9
            r8.<init>(r9)
            return r8
        Lbd:
            com.okta.authfoundation.client.OAuth2ClientResult$Error r8 = r2.i()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.h.q(Vs.i, Vs.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object r(Request request, String str, Integer num, p pVar, Continuation<? super OAuth2ClientResult<p>> continuation) {
        return C15784P.g(new C1973h(pVar, this, str, num, request, null), continuation);
    }

    /* synthetic */ h(j jVar, ct.e eVar, ct.e eVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, eVar, (i10 & 4) != 0 ? null : eVar2);
    }
}
