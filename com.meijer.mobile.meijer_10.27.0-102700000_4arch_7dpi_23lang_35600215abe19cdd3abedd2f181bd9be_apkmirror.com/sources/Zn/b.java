package Zn;

import ao.MCCOptInOutResponse;
import com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsResponse;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"LZn/b;", "", "LWn/a;", "mccRewardsClubApi", "LXi/a;", "userTokenGateway", "Lqv/K;", "ioDispatcher", "<init>", "(LWn/a;LXi/a;Lqv/K;)V", "", "firstName", "lastName", "", "termsID", "j$/time/LocalDate", "birthDate", "lastFourOfCard", "Lao/a;", "d", "(Ljava/lang/String;Ljava/lang/String;JLj$/time/LocalDate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clubID", "", "newTerms", "Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "c", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LWn/a;", "b", "LXi/a;", "Lqv/K;", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Wn.a mccRewardsClubApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenGateway;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.creditcard.domain.RewardsService$getClubTerms$2", f = "RewardsService.kt", l = {54, 54}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super RewardClubTermsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f43126a;

        /* renamed from: b, reason: collision with root package name */
        Object f43127b;

        /* renamed from: c, reason: collision with root package name */
        int f43128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f43130e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f43131f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, boolean z10, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43129d = i10;
            this.f43130e = z10;
            this.f43131f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f43129d, this.f43130e, this.f43131f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super RewardClubTermsResponse> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            if (r7 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f43128c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f43126a
                com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest r0 = (com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest) r0
                kotlin.ResultKt.b(r7)
                goto L62
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f43127b
                Wn.a r1 = (Wn.a) r1
                java.lang.Object r3 = r6.f43126a
                com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest r3 = (com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest) r3
                kotlin.ResultKt.b(r7)
                goto L52
            L2a:
                kotlin.ResultKt.b(r7)
                com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest r7 = new com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest
                int r1 = r6.f43129d
                boolean r4 = r6.f43130e
                r7.<init>(r1, r4)
                Zn.b r1 = r6.f43131f
                Wn.a r1 = Zn.b.a(r1)
                Zn.b r4 = r6.f43131f
                Xi.a r4 = Zn.b.b(r4)
                r6.f43126a = r7
                r6.f43127b = r1
                r6.f43128c = r3
                java.lang.Object r3 = r4.c(r6)
                if (r3 != r0) goto L4f
                goto L61
            L4f:
                r5 = r3
                r3 = r7
                r7 = r5
            L52:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                r6.f43126a = r3
                r4 = 0
                r6.f43127b = r4
                r6.f43128c = r2
                java.lang.Object r7 = r1.c(r7, r3, r6)
                if (r7 != r0) goto L62
            L61:
                return r0
            L62:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L72
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                return r7
            L72:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zn.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lao/a;", "<anonymous>", "(Lqv/O;)Lao/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.creditcard.domain.RewardsService$optIntoMeijerCreditCardRewards$2", f = "RewardsService.kt", l = {39, 39}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Zn.b$b, reason: collision with other inner class name */
    static final class C0928b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MCCOptInOutResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f43132a;

        /* renamed from: b, reason: collision with root package name */
        Object f43133b;

        /* renamed from: c, reason: collision with root package name */
        int f43134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f43135d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f43136e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f43137f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f43138g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalDate f43139h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ b f43140i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0928b(String str, String str2, String str3, long j10, LocalDate localDate, b bVar, Continuation<? super C0928b> continuation) {
            super(2, continuation);
            this.f43135d = str;
            this.f43136e = str2;
            this.f43137f = str3;
            this.f43138g = j10;
            this.f43139h = localDate;
            this.f43140i = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0928b(this.f43135d, this.f43136e, this.f43137f, this.f43138g, this.f43139h, this.f43140i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MCCOptInOutResponse> continuation) {
            return ((C0928b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        
            if (r12 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f43134c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r11.f43132a
                com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest r0 = (com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest) r0
                kotlin.ResultKt.b(r12)
                goto L71
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                java.lang.Object r1 = r11.f43133b
                Wn.a r1 = (Wn.a) r1
                java.lang.Object r3 = r11.f43132a
                com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest r3 = (com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest) r3
                kotlin.ResultKt.b(r12)
                goto L61
            L2a:
                kotlin.ResultKt.b(r12)
                com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest r4 = new com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest
                java.lang.String r5 = r11.f43135d
                java.lang.String r6 = r11.f43136e
                java.lang.String r7 = r11.f43137f
                long r8 = r11.f43138g
                j$.time.LocalDate r12 = r11.f43139h
                j$.time.format.DateTimeFormatter r1 = vk.C17590a.ISO_LOCAL_DATE
                java.lang.String r10 = r12.format(r1)
                java.lang.String r12 = "format(...)"
                kotlin.jvm.internal.Intrinsics.i(r10, r12)
                r4.<init>(r5, r6, r7, r8, r10)
                Zn.b r12 = r11.f43140i
                Wn.a r1 = Zn.b.a(r12)
                Zn.b r12 = r11.f43140i
                Xi.a r12 = Zn.b.b(r12)
                r11.f43132a = r4
                r11.f43133b = r1
                r11.f43134c = r3
                java.lang.Object r12 = r12.c(r11)
                if (r12 != r0) goto L60
                goto L70
            L60:
                r3 = r4
            L61:
                com.meijer.mobile.authentication.core.model.BearerToken r12 = (com.meijer.mobile.authentication.core.model.BearerToken) r12
                r11.f43132a = r3
                r4 = 0
                r11.f43133b = r4
                r11.f43134c = r2
                java.lang.Object r12 = r1.a(r12, r3, r11)
                if (r12 != r0) goto L71
            L70:
                return r0
            L71:
                retrofit2.Response r12 = (retrofit2.Response) r12
                boolean r0 = r12.isSuccessful()
                if (r0 == 0) goto L87
                java.lang.Object r12 = r12.body()
                kotlin.jvm.internal.Intrinsics.g(r12)
                com.meijer.mobile.mperks.creditcard.api.models.MCCOptInOutResponseJson r12 = (com.meijer.mobile.mperks.creditcard.api.models.MCCOptInOutResponseJson) r12
                ao.a r12 = Xn.a.a(r12)
                return r12
            L87:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zn.b.C0928b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lao/a;", "<anonymous>", "(Lqv/O;)Lao/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.creditcard.domain.RewardsService$optOutOfMeijerCreditCardRewards$2", f = "RewardsService.kt", l = {46, 46}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MCCOptInOutResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f43141a;

        /* renamed from: b, reason: collision with root package name */
        int f43142b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MCCOptInOutResponse> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f43142b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f43141a
                Wn.a r1 = (Wn.a) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Zn.b r5 = Zn.b.this
                Wn.a r1 = Zn.b.a(r5)
                Zn.b r5 = Zn.b.this
                Xi.a r5 = Zn.b.b(r5)
                r4.f43141a = r1
                r4.f43142b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f43141a = r3
                r4.f43142b = r2
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L60
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                com.meijer.mobile.mperks.creditcard.api.models.MCCOptInOutResponseJson r5 = (com.meijer.mobile.mperks.creditcard.api.models.MCCOptInOutResponseJson) r5
                ao.a r5 = Xn.a.a(r5)
                return r5
            L60:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zn.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Wn.a mccRewardsClubApi, Xi.a userTokenGateway, AbstractC16618K ioDispatcher) {
        Intrinsics.j(mccRewardsClubApi, "mccRewardsClubApi");
        Intrinsics.j(userTokenGateway, "userTokenGateway");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.mccRewardsClubApi = mccRewardsClubApi;
        this.userTokenGateway = userTokenGateway;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object c(int i10, boolean z10, Continuation<? super RewardClubTermsResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new a(i10, z10, this, null), continuation);
    }

    public final Object d(String str, String str2, long j10, LocalDate localDate, String str3, Continuation<? super MCCOptInOutResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new C0928b(str, str2, str3, j10, localDate, this, null), continuation);
    }

    public final Object e(Continuation<? super MCCOptInOutResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new c(null), continuation);
    }
}
