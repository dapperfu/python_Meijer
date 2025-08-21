package up;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ll.Tip;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import vp.RateShopperRequest;
import vp.RateShopperResponse;
import vp.TipShopperResponse;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0014\u001a\u00020\u00132\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u00020\u00182\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006%"}, d2 = {"Lup/d;", "", "LYi/a;", "tokenProvider", "Lup/f;", "tipShopperApi", "Lup/e;", "rateShopperApi", "Lmv/K;", "ioDispatcher", "<init>", "(LYi/a;Lup/f;Lup/e;Lmv/K;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "storeId", "Lll/a;", "tipShopperRequest", "Lvp/d;", "e", "(Ljava/lang/String;ILll/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvp/a;", "rateShopperRequest", "Lvp/c;", "d", "(Ljava/lang/String;Lvp/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYi/a;", "b", "Lup/f;", "c", "Lup/e;", "Lmv/K;", "Lcom/squareup/moshi/t;", "Lcom/squareup/moshi/t;", "rateAndTipMoshi", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f tipShopperApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e rateShopperApi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t rateAndTipMoshi;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.service.di.RateAndTipRepository", f = "RateAndTipRepository.kt", l = {90}, m = "rateShopper")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f164305a;

        /* renamed from: b, reason: collision with root package name */
        Object f164306b;

        /* renamed from: c, reason: collision with root package name */
        Object f164307c;

        /* renamed from: d, reason: collision with root package name */
        int f164308d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f164309e;

        /* renamed from: g, reason: collision with root package name */
        int f164311g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f164309e = obj;
            this.f164311g |= Integer.MIN_VALUE;
            return d.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lvp/c;", "<anonymous>", "(Lmv/O;)Lvp/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.service.di.RateAndTipRepository$rateShopper$2$1", f = "RateAndTipRepository.kt", l = {92, 91}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super RateShopperResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f164312a;

        /* renamed from: b, reason: collision with root package name */
        int f164313b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f164315d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ RateShopperRequest f164316e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, RateShopperRequest rateShopperRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f164315d = str;
            this.f164316e = rateShopperRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new b(this.f164315d, this.f164316e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super RateShopperResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            if (r13 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r12.f164313b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r13)
                r9 = r12
                goto L5a
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                java.lang.Object r1 = r12.f164312a
                up.e r1 = (up.e) r1
                kotlin.ResultKt.b(r13)
            L22:
                r4 = r1
                goto L3f
            L24:
                kotlin.ResultKt.b(r13)
                up.d r13 = up.d.this
                up.e r1 = up.d.a(r13)
                up.d r13 = up.d.this
                Yi.a r13 = up.d.c(r13)
                r12.f164312a = r1
                r12.f164313b = r3
                java.lang.Object r13 = r13.c(r12)
                if (r13 != r0) goto L22
                r9 = r12
                goto L59
            L3f:
                r5 = r13
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                java.lang.String r6 = r12.f164315d
                vp.a r13 = r12.f164316e
                com.meijer.mobile.rateandtip.service.models.RateShopperRequestJson r8 = vp.C17714b.a(r13)
                r13 = 0
                r12.f164312a = r13
                r12.f164313b = r2
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = up.e.b(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L5a
            L59:
                return r0
            L5a:
                retrofit2.Response r13 = (retrofit2.Response) r13
                boolean r0 = r13.isSuccessful()
                if (r0 == 0) goto L70
                java.lang.Object r13 = r13.body()
                vp.a r0 = r9.f164316e
                java.lang.Void r13 = (java.lang.Void) r13
                vp.c r13 = new vp.c
                r13.<init>(r3, r0)
                return r13
            L70:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: up.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.service.di.RateAndTipRepository", f = "RateAndTipRepository.kt", l = {53}, m = "tipShopper")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f164317a;

        /* renamed from: b, reason: collision with root package name */
        Object f164318b;

        /* renamed from: c, reason: collision with root package name */
        Object f164319c;

        /* renamed from: d, reason: collision with root package name */
        int f164320d;

        /* renamed from: e, reason: collision with root package name */
        int f164321e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164322f;

        /* renamed from: h, reason: collision with root package name */
        int f164324h;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f164322f = obj;
            this.f164324h |= Integer.MIN_VALUE;
            return d.this.e(null, 0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lvp/d;", "<anonymous>", "(Lmv/O;)Lvp/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.service.di.RateAndTipRepository$tipShopper$2$1", f = "RateAndTipRepository.kt", l = {55, 54}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: up.d$d, reason: collision with other inner class name */
    static final class C2608d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TipShopperResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f164325a;

        /* renamed from: b, reason: collision with root package name */
        int f164326b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f164328d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f164329e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Tip f164330f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2608d(String str, int i10, Tip tip, Continuation<? super C2608d> continuation) {
            super(2, continuation);
            this.f164328d = str;
            this.f164329e = i10;
            this.f164330f = tip;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new C2608d(this.f164328d, this.f164329e, this.f164330f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TipShopperResponse> continuation) {
            return ((C2608d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r14 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f164326b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r14)
                r10 = r13
                goto L5d
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                java.lang.Object r1 = r13.f164325a
                up.f r1 = (up.f) r1
                kotlin.ResultKt.b(r14)
            L22:
                r4 = r1
                goto L3f
            L24:
                kotlin.ResultKt.b(r14)
                up.d r14 = up.d.this
                up.f r1 = up.d.b(r14)
                up.d r14 = up.d.this
                Yi.a r14 = up.d.c(r14)
                r13.f164325a = r1
                r13.f164326b = r3
                java.lang.Object r14 = r14.c(r13)
                if (r14 != r0) goto L22
                r10 = r13
                goto L5c
            L3f:
                r5 = r14
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                java.lang.String r6 = r13.f164328d
                int r7 = r13.f164329e
                ll.a r14 = r13.f164330f
                com.meijer.mobile.cart.model.hybris.checkout.TipJson r9 = ll.C15519b.a(r14)
                r14 = 0
                r13.f164325a = r14
                r13.f164326b = r2
                r8 = 0
                r11 = 8
                r12 = 0
                r10 = r13
                java.lang.Object r14 = up.f.b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L5d
            L5c:
                return r0
            L5d:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto L73
                java.lang.Object r14 = r14.body()
                ll.a r0 = r10.f164330f
                java.lang.Void r14 = (java.lang.Void) r14
                vp.d r14 = new vp.d
                r14.<init>(r3, r0)
                return r14
            L73:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: up.d.C2608d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(Yi.a tokenProvider, f tipShopperApi, e rateShopperApi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(tipShopperApi, "tipShopperApi");
        Intrinsics.j(rateShopperApi, "rateShopperApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.tipShopperApi = tipShopperApi;
        this.rateShopperApi = rateShopperApi;
        this.ioDispatcher = ioDispatcher;
        t tVarD = new t.a().d();
        Intrinsics.i(tVarD, "build(...)");
        this.rateAndTipMoshi = tVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, vp.RateShopperRequest r7, kotlin.coroutines.Continuation<? super vp.RateShopperResponse> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof up.d.a
            if (r0 == 0) goto L13
            r0 = r8
            up.d$a r0 = (up.d.a) r0
            int r1 = r0.f164311g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164311g = r1
            goto L18
        L13:
            up.d$a r0 = new up.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f164309e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f164311g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f164307c
            up.d r6 = (up.d) r6
            java.lang.Object r6 = r0.f164306b
            vp.a r6 = (vp.RateShopperRequest) r6
            java.lang.Object r6 = r0.f164305a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L36
            goto L5e
        L36:
            r6 = move-exception
            goto L65
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L36
            mv.K r8 = r5.ioDispatcher     // Catch: java.lang.Throwable -> L36
            up.d$b r2 = new up.d$b     // Catch: java.lang.Throwable -> L36
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L36
            r0.f164305a = r6     // Catch: java.lang.Throwable -> L36
            r0.f164306b = r7     // Catch: java.lang.Throwable -> L36
            r0.f164307c = r5     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r0.f164308d = r6     // Catch: java.lang.Throwable -> L36
            r0.f164311g = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = mv.C15805i.g(r8, r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r8 != r1) goto L5e
            return r1
        L5e:
            vp.c r8 = (vp.RateShopperResponse) r8     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L36
            goto L6f
        L65:
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L6f:
            java.lang.Throwable r7 = kotlin.Result.e(r6)
            if (r7 != 0) goto L76
            return r6
        L76:
            boolean r6 = r7 instanceof retrofit2.HttpException
            if (r6 == 0) goto L7e
            r6 = r7
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6
            goto L7f
        L7e:
            r6 = r4
        L7f:
            if (r6 == 0) goto Lcb
            retrofit2.Response r6 = r6.response()     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L94
            okhttp3.ResponseBody r6 = r6.errorBody()     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L94
            java.lang.String r6 = r6.string()     // Catch: java.lang.Throwable -> L92
            goto L95
        L92:
            r6 = move-exception
            goto L9a
        L94:
            r6 = r4
        L95:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L92
            goto La4
        L9a:
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        La4:
            boolean r8 = kotlin.Result.g(r6)
            if (r8 == 0) goto Lab
            r6 = r4
        Lab:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lcb
            com.squareup.moshi.t r8 = r5.rateAndTipMoshi
            java.lang.Class<com.meijer.mobile.rateandtip.service.models.RateAndTipShopperErrorResponseJson> r0 = com.meijer.mobile.rateandtip.service.models.RateAndTipShopperErrorResponseJson.class
            com.squareup.moshi.h r8 = r8.c(r0)
            java.lang.Object r6 = r8.fromJson(r6)
            com.meijer.mobile.rateandtip.service.models.RateAndTipShopperErrorResponseJson r6 = (com.meijer.mobile.rateandtip.service.models.RateAndTipShopperErrorResponseJson) r6
            if (r6 == 0) goto Lc3
            java.lang.String r4 = r6.getMessage()
        Lc3:
            if (r4 == 0) goto Lcb
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r4, r7)
            r7 = r6
        Lcb:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: up.d.d(java.lang.String, vp.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, int r12, ll.Tip r13, kotlin.coroutines.Continuation<? super vp.TipShopperResponse> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: up.d.e(java.lang.String, int, ll.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
