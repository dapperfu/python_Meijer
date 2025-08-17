package eo;

import android.security.keystore.UserNotAuthenticatedException;
import bo.AutoClaimReward;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.api.models.AutoClaimEnrollRequest;
import com.meijer.mobile.mperks.networking.api.models.GetRewardsRequest;
import com.meijer.mobile.mperks.networking.domain.models.EnrolledAutoClaimReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksAvailableReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksAvailableRewardCouponsResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksClaimRewardResponseJson;
import com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfoResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksInProgressReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransactionHistoryResponse;
import com.meijer.mobile.mperks.networking.domain.models.RewardIncludedUpcsResponse;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import go.InterfaceC14299a;
import go.InterfaceC14300b;
import go.InterfaceC14301c;
import go.InterfaceC14302d;
import io.MperksClaimReward;
import io.MperksPointsExpiry;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0086@¢\u0006\u0004\b\"\u0010\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 H\u0086@¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010&\u001a\u00020%H\u0086@¢\u0006\u0004\b&\u0010\u0016J*\u0010+\u001a\b\u0012\u0004\u0012\u00020*0 2\b\u0010'\u001a\u0004\u0018\u00010\u00192\b\u0010)\u001a\u0004\u0018\u00010(H\u0086@¢\u0006\u0004\b+\u0010,J,\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0004\b/\u00100J\u0012\u00102\u001a\u0004\u0018\u000101H\u0086@¢\u0006\u0004\b2\u0010\u0016J.\u00107\u001a\u0002062\b\u00103\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00192\u0006\u00105\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b;\u0010<J\u001c\u0010@\u001a\u00020.2\n\u0010?\u001a\u00060=j\u0002`>H\u0086@¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BH\u0086@¢\u0006\u0004\bC\u0010\u0016J\u0010\u0010E\u001a\u00020DH\u0086@¢\u0006\u0004\bE\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010T¨\u0006U"}, d2 = {"Leo/a;", "", "Lgo/c;", "mperksCustomerApi", "Lgo/b;", "mperksCreditCardApi", "Lgo/a;", "mperksBuyCouponApi", "Lgo/d;", "mperksPointsExpiryApi", "Lgo/e;", "mperksRewardEarnedApi", "LTq/j;", "storeProvider", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "<init>", "(Lgo/c;Lgo/b;Lgo/a;Lgo/d;Lgo/e;LTq/j;LXi/a;Lqv/K;)V", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksGetBalanceResponse;", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "maxItemCount", "", "xContinuationToken", "", "includeAdjustmentDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransactionHistoryResponse;", "r", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksInProgressReward;", "o", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableReward;", "m", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableRewardCouponsResponse;", "l", "autoClaimType", "", "autoClaimAmount", "Lbo/a;", "k", "(Ljava/lang/String;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enroll", "Lio/b;", "j", "(ZLjava/lang/Double;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;", "h", "perPageCount", "continuationToken", "rewardId", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;", "t", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "days", "Lio/c;", "s", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "i", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedResponse;", "n", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;", "p", "a", "Lgo/c;", "b", "Lgo/b;", "c", "Lgo/a;", "d", "Lgo/d;", "e", "Lgo/e;", "f", "LTq/j;", "g", "LXi/a;", "Lqv/K;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eo.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13713a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14301c mperksCustomerApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14300b mperksCreditCardApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14299a mperksBuyCouponApi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14302d mperksPointsExpiryApi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final go.e mperksRewardEarnedApi;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Xi.a authTokenProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$autoClaimGetAccountInfo$2", f = "MperksDataSource.kt", l = {169, 169}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$a, reason: collision with other inner class name */
    static final class C2041a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super EnrolledAutoClaimReward>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129301a;

        /* renamed from: b, reason: collision with root package name */
        int f129302b;

        C2041a(Continuation<? super C2041a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new C2041a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super EnrolledAutoClaimReward> continuation) {
            return ((C2041a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r4.f129302b
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
                java.lang.Object r1 = r4.f129301a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                eo.a r5 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r5)
                eo.a r5 = eo.C13713a.this
                Xi.a r5 = eo.C13713a.a(r5)
                r4.f129301a = r1
                r4.f129302b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f129301a = r3
                r4.f129302b = r2
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
                com.meijer.mobile.mperks.networking.domain.models.MperksAccountInfoResponse r5 = (com.meijer.mobile.mperks.networking.domain.models.MperksAccountInfoResponse) r5
                com.meijer.mobile.mperks.networking.domain.models.EnrolledAutoClaimReward r5 = r5.toAutoClaimReward$networking_release()
                return r5
            L60:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.C2041a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lio/b;", "<anonymous>", "(Lqv/O;)Lio/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$buyCoupon$2", f = "MperksDataSource.kt", l = {220, 219}, m = "invokeSuspend")
    /* renamed from: eo.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksClaimReward>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129304a;

        /* renamed from: b, reason: collision with root package name */
        int f129305b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f129307d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f129307d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new b(this.f129307d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksClaimReward> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (r11 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f129305b
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L23
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.b(r11)
                goto L5f
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                java.lang.Object r1 = r10.f129304a
                go.a r1 = (go.InterfaceC14299a) r1
                kotlin.ResultKt.b(r11)
            L21:
                r4 = r1
                goto L3d
            L23:
                kotlin.ResultKt.b(r11)
                eo.a r11 = eo.C13713a.this
                go.a r1 = eo.C13713a.b(r11)
                eo.a r11 = eo.C13713a.this
                Xi.a r11 = eo.C13713a.a(r11)
                r10.f129304a = r1
                r10.f129305b = r2
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L21
                goto L5e
            L3d:
                r5 = r11
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                long r6 = r10.f129307d
                com.meijer.mobile.mperks.networking.api.models.BuyRewardCouponRequest r8 = new com.meijer.mobile.mperks.networking.api.models.BuyRewardCouponRequest
                eo.a r11 = eo.C13713a.this
                Tq.j r11 = eo.C13713a.g(r11)
                int r11 = r11.g()
                r1 = 0
                r2 = 0
                r8.<init>(r11, r1, r3, r2)
                r10.f129304a = r2
                r10.f129305b = r3
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r6, r8, r9)
                if (r11 != r0) goto L5f
            L5e:
                return r0
            L5f:
                com.meijer.mobile.mperks.networking.domain.models.MperksClaimRewardResponseJson r11 = (com.meijer.mobile.mperks.networking.domain.models.MperksClaimRewardResponseJson) r11
                io.b r11 = com.meijer.mobile.mperks.networking.domain.b.c(r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lio/b;", "<anonymous>", "(Lqv/O;)Lio/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$enrollInAutoClaim$2", f = "MperksDataSource.kt", l = {152}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksClaimReward>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f129308a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f129310c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Double f129311d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f129312e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, Double d10, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f129310c = z10;
            this.f129311d = d10;
            this.f129312e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new c(this.f129310c, this.f129311d, this.f129312e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksClaimReward> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f129308a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC14301c interfaceC14301c = C13713a.this.mperksCustomerApi;
                BearerToken bearerTokenBlockingFirst = C13713a.this.authTokenProvider.a().blockingFirst();
                Intrinsics.i(bearerTokenBlockingFirst, "blockingFirst(...)");
                AutoClaimEnrollRequest autoClaimEnrollRequest = new AutoClaimEnrollRequest(this.f129310c, this.f129311d, this.f129312e);
                this.f129308a = 1;
                obj = interfaceC14301c.c(bearerTokenBlockingFirst, autoClaimEnrollRequest, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                return com.meijer.mobile.mperks.networking.domain.b.c((MperksClaimRewardResponseJson) objBody);
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lbo/a;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAvailableAutoClaimOptions$2", f = "MperksDataSource.kt", l = {128, l3.f92485d}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends AutoClaimReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129313a;

        /* renamed from: b, reason: collision with root package name */
        int f129314b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f129316d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Double f129317e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends AutoClaimReward>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<AutoClaimReward>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Double d10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f129316d = str;
            this.f129317e = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new d(this.f129316d, this.f129317e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<AutoClaimReward>> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r7 == r0) goto L15;
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
                int r1 = r6.f129314b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L4e
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f129313a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r7)
                goto L3c
            L22:
                kotlin.ResultKt.b(r7)
                eo.a r7 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r7)
                eo.a r7 = eo.C13713a.this
                Xi.a r7 = eo.C13713a.a(r7)
                r6.f129313a = r1
                r6.f129314b = r3
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3c
                goto L4d
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                java.lang.String r3 = r6.f129316d
                java.lang.Double r4 = r6.f129317e
                r5 = 0
                r6.f129313a = r5
                r6.f129314b = r2
                java.lang.Object r7 = r1.d(r7, r3, r4, r6)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L83
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.x(r7, r1)
                r0.<init>(r1)
                java.util.Iterator r7 = r7.iterator()
            L6e:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L82
                java.lang.Object r1 = r7.next()
                com.meijer.mobile.mperks.networking.domain.models.AvailableAutoClaimOption r1 = (com.meijer.mobile.mperks.networking.domain.models.AvailableAutoClaimOption) r1
                bo.a r1 = r1.toAutoClaimReward$networking_release()
                r0.add(r1)
                goto L6e
            L82:
                return r0
            L83:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableRewardCouponsResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableRewardCouponsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAvailableClaimRewards$2", f = "MperksDataSource.kt", l = {110, 110}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksAvailableRewardCouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129318a;

        /* renamed from: b, reason: collision with root package name */
        int f129319b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksAvailableRewardCouponsResponse> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r4.f129319b
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
                java.lang.Object r1 = r4.f129318a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                eo.a r5 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r5)
                eo.a r5 = eo.C13713a.this
                Xi.a r5 = eo.C13713a.a(r5)
                r4.f129318a = r1
                r4.f129319b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f129318a = r3
                r4.f129319b = r2
                java.lang.Object r5 = r1.h(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L5a
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                return r5
            L5a:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableReward;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAvailableEarnRewards$2", f = "MperksDataSource.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE, HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends MperksAvailableReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129321a;

        /* renamed from: b, reason: collision with root package name */
        int f129322b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends MperksAvailableReward>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<MperksAvailableReward>>) continuation);
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new f(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<MperksAvailableReward>> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r4.f129322b
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
                java.lang.Object r1 = r4.f129321a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                eo.a r5 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r5)
                eo.a r5 = eo.C13713a.this
                Xi.a r5 = eo.C13713a.a(r5)
                r4.f129321a = r1
                r4.f129322b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f129321a = r3
                r4.f129322b = r2
                java.lang.Object r5 = r1.e(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L5a
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                return r5
            L5a:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getEarnedRewards$2", f = "MperksDataSource.kt", l = {232, 231}, m = "invokeSuspend")
    /* renamed from: eo.a$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksRewardEarnedResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129324a;

        /* renamed from: b, reason: collision with root package name */
        Object f129325b;

        /* renamed from: c, reason: collision with root package name */
        int f129326c;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksRewardEarnedResponse> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            go.e eVar;
            GetRewardsRequest getRewardsRequest;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f129326c;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (go.e) this.f129325b;
                getRewardsRequest = (GetRewardsRequest) this.f129324a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                GetRewardsRequest getRewardsRequestA = GetRewardsRequest.INSTANCE.a(C13713a.this.storeProvider);
                eVar = C13713a.this.mperksRewardEarnedApi;
                Xi.a aVar = C13713a.this.authTokenProvider;
                this.f129324a = getRewardsRequestA;
                this.f129325b = eVar;
                this.f129326c = 1;
                Object objC = aVar.c(this);
                if (objC != objF) {
                    getRewardsRequest = getRewardsRequestA;
                    obj = objC;
                }
                return objF;
            }
            this.f129324a = getRewardsRequest;
            this.f129325b = null;
            this.f129326c = 2;
            Object objA = eVar.a((BearerToken) obj, getRewardsRequest, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksInProgressReward;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getInProgressEarnRewards$2", f = "MperksDataSource.kt", l = {90, 90}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends MperksInProgressReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129328a;

        /* renamed from: b, reason: collision with root package name */
        int f129329b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends MperksInProgressReward>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<MperksInProgressReward>>) continuation);
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new h(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<MperksInProgressReward>> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r4.f129329b
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
                java.lang.Object r1 = r4.f129328a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                eo.a r5 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r5)
                eo.a r5 = eo.C13713a.this
                Xi.a r5 = eo.C13713a.a(r5)
                r4.f129328a = r1
                r4.f129329b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f129328a = r3
                r4.f129329b = r2
                java.lang.Object r5 = r1.i(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L5a
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                return r5
            L5a:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getMperksCreditCardInfo$2", f = "MperksDataSource.kt", l = {242, 242}, m = "invokeSuspend")
    /* renamed from: eo.a$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksCreditCardInfoResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129331a;

        /* renamed from: b, reason: collision with root package name */
        int f129332b;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksCreditCardInfoResponse> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            InterfaceC14300b interfaceC14300b;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f129332b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC14300b = (InterfaceC14300b) this.f129331a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                interfaceC14300b = C13713a.this.mperksCreditCardApi;
                Xi.a aVar = C13713a.this.authTokenProvider;
                this.f129331a = interfaceC14300b;
                this.f129332b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            this.f129331a = null;
            this.f129332b = 2;
            Object objA = interfaceC14300b.a((BearerToken) obj, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksGetBalanceResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksGetBalanceResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getMperksPointBalance$2", f = "MperksDataSource.kt", l = {58, 59}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksGetBalanceResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129334a;

        /* renamed from: b, reason: collision with root package name */
        int f129335b;

        /* renamed from: c, reason: collision with root package name */
        int f129336c;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksGetBalanceResponse> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f129336c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r5.f129334a
                com.meijer.mobile.authentication.core.model.BearerToken r0 = (com.meijer.mobile.authentication.core.model.BearerToken) r0
                kotlin.ResultKt.b(r6)
                goto L4c
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                kotlin.ResultKt.b(r6)
                goto L35
            L23:
                kotlin.ResultKt.b(r6)
                eo.a r6 = eo.C13713a.this
                Xi.a r6 = eo.C13713a.a(r6)
                r5.f129336c = r4
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L35
                goto L4b
            L35:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                if (r6 == 0) goto L66
                eo.a r1 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r1)
                r5.f129334a = r6
                r5.f129335b = r2
                r5.f129336c = r3
                java.lang.Object r6 = r1.g(r6, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L60
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse r6 = (com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse) r6
                if (r6 == 0) goto L66
                return r6
            L60:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            L66:
                com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse r6 = new com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse
                r0 = 0
                r6.<init>(r2, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransactionHistoryResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransactionHistoryResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getMperksTransactionHistory$2", f = "MperksDataSource.kt", l = {77, 76}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksTransactionHistoryResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129338a;

        /* renamed from: b, reason: collision with root package name */
        int f129339b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f129341d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f129342e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Boolean f129343f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Integer num, Boolean bool, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f129341d = str;
            this.f129342e = num;
            this.f129343f = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new k(this.f129341d, this.f129342e, this.f129343f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksTransactionHistoryResponse> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            if (r10 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f129339b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r10)
                goto L53
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.f129338a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r10)
            L21:
                r3 = r1
                goto L3d
            L23:
                kotlin.ResultKt.b(r10)
                eo.a r10 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r10)
                eo.a r10 = eo.C13713a.this
                Xi.a r10 = eo.C13713a.a(r10)
                r9.f129338a = r1
                r9.f129339b = r3
                java.lang.Object r10 = r10.c(r9)
                if (r10 != r0) goto L21
                goto L52
            L3d:
                r4 = r10
                com.meijer.mobile.authentication.core.model.BearerToken r4 = (com.meijer.mobile.authentication.core.model.BearerToken) r4
                java.lang.String r5 = r9.f129341d
                java.lang.Integer r6 = r9.f129342e
                java.lang.Boolean r7 = r9.f129343f
                r10 = 0
                r9.f129338a = r10
                r9.f129339b = r2
                r8 = r9
                java.lang.Object r10 = r3.a(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L53
            L52:
                return r0
            L53:
                retrofit2.Response r10 = (retrofit2.Response) r10
                boolean r0 = r10.isSuccessful()
                if (r0 == 0) goto L63
                java.lang.Object r10 = r10.body()
                kotlin.jvm.internal.Intrinsics.g(r10)
                return r10
            L63:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lio/c;", "<anonymous>", "(Lqv/O;)Lio/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getPointsExpirySummary$2", f = "MperksDataSource.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MperksPointsExpiry>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129344a;

        /* renamed from: b, reason: collision with root package name */
        int f129345b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f129347d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f129347d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new l(this.f129347d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MperksPointsExpiry> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f129345b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f129344a
                go.d r1 = (go.InterfaceC14302d) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                eo.a r6 = eo.C13713a.this
                go.d r1 = eo.C13713a.e(r6)
                eo.a r6 = eo.C13713a.this
                Xi.a r6 = eo.C13713a.a(r6)
                r5.f129344a = r1
                r5.f129345b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                int r3 = r5.f129347d
                r4 = 0
                r5.f129344a = r4
                r5.f129345b = r2
                java.lang.Object r6 = r1.a(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L62
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                com.meijer.mobile.mperks.networking.domain.models.MperksPointsExpiryResponse r6 = (com.meijer.mobile.mperks.networking.domain.models.MperksPointsExpiryResponse) r6
                io.c r6 = com.meijer.mobile.mperks.networking.domain.models.MperksPointsExpiryResponseKt.toDomain(r6)
                return r6
            L62:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getRewardIncludedUpcs$2", f = "MperksDataSource.kt", l = {188, 187}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: eo.a$m */
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super RewardIncludedUpcsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129348a;

        /* renamed from: b, reason: collision with root package name */
        int f129349b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f129351d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f129352e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f129353f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2, Integer num, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f129351d = str;
            this.f129352e = str2;
            this.f129353f = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13713a.this.new m(this.f129351d, this.f129352e, this.f129353f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super RewardIncludedUpcsResponse> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            if (r10 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f129349b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r10)
                goto L53
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.f129348a
                go.c r1 = (go.InterfaceC14301c) r1
                kotlin.ResultKt.b(r10)
            L21:
                r3 = r1
                goto L3d
            L23:
                kotlin.ResultKt.b(r10)
                eo.a r10 = eo.C13713a.this
                go.c r1 = eo.C13713a.d(r10)
                eo.a r10 = eo.C13713a.this
                Xi.a r10 = eo.C13713a.a(r10)
                r9.f129348a = r1
                r9.f129349b = r3
                java.lang.Object r10 = r10.c(r9)
                if (r10 != r0) goto L21
                goto L52
            L3d:
                r4 = r10
                com.meijer.mobile.authentication.core.model.BearerToken r4 = (com.meijer.mobile.authentication.core.model.BearerToken) r4
                java.lang.String r5 = r9.f129351d
                java.lang.String r6 = r9.f129352e
                java.lang.Integer r7 = r9.f129353f
                r10 = 0
                r9.f129348a = r10
                r9.f129349b = r2
                r8 = r9
                java.lang.Object r10 = r3.f(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L53
            L52:
                return r0
            L53:
                retrofit2.Response r10 = (retrofit2.Response) r10
                boolean r0 = r10.isSuccessful()
                if (r0 == 0) goto L69
                java.lang.Object r10 = r10.body()
                kotlin.jvm.internal.Intrinsics.g(r10)
                com.meijer.mobile.mperks.networking.api.models.RewardIncludedUpcsResponseJson r10 = (com.meijer.mobile.mperks.networking.api.models.RewardIncludedUpcsResponseJson) r10
                com.meijer.mobile.mperks.networking.domain.models.RewardIncludedUpcsResponse r10 = fo.C13922a.a(r10)
                return r10
            L69:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13713a.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13713a(InterfaceC14301c mperksCustomerApi, InterfaceC14300b mperksCreditCardApi, InterfaceC14299a mperksBuyCouponApi, InterfaceC14302d mperksPointsExpiryApi, go.e mperksRewardEarnedApi, Tq.j storeProvider, Xi.a authTokenProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(mperksCustomerApi, "mperksCustomerApi");
        Intrinsics.j(mperksCreditCardApi, "mperksCreditCardApi");
        Intrinsics.j(mperksBuyCouponApi, "mperksBuyCouponApi");
        Intrinsics.j(mperksPointsExpiryApi, "mperksPointsExpiryApi");
        Intrinsics.j(mperksRewardEarnedApi, "mperksRewardEarnedApi");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.mperksCustomerApi = mperksCustomerApi;
        this.mperksCreditCardApi = mperksCreditCardApi;
        this.mperksBuyCouponApi = mperksBuyCouponApi;
        this.mperksPointsExpiryApi = mperksPointsExpiryApi;
        this.mperksRewardEarnedApi = mperksRewardEarnedApi;
        this.storeProvider = storeProvider;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object h(Continuation<? super EnrolledAutoClaimReward> continuation) {
        return C16644i.g(this.ioDispatcher, new C2041a(null), continuation);
    }

    public final Object i(long j10, Continuation<? super MperksClaimReward> continuation) {
        return C16644i.g(this.ioDispatcher, new b(j10, null), continuation);
    }

    public final Object j(boolean z10, Double d10, String str, Continuation<? super MperksClaimReward> continuation) {
        return C16644i.g(this.ioDispatcher, new c(z10, d10, str, null), continuation);
    }

    public final Object k(String str, Double d10, Continuation<? super List<AutoClaimReward>> continuation) {
        return C16644i.g(this.ioDispatcher, new d(str, d10, null), continuation);
    }

    public final Object l(Continuation<? super MperksAvailableRewardCouponsResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new e(null), continuation);
    }

    public final Object m(Continuation<? super List<MperksAvailableReward>> continuation) {
        return C16644i.g(this.ioDispatcher, new f(null), continuation);
    }

    public final Object n(Continuation<? super MperksRewardEarnedResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new g(null), continuation);
    }

    public final Object o(Continuation<? super List<MperksInProgressReward>> continuation) {
        return C16644i.g(this.ioDispatcher, new h(null), continuation);
    }

    public final Object p(Continuation<? super MperksCreditCardInfoResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new i(null), continuation);
    }

    public final Object q(Continuation<? super MperksGetBalanceResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new j(null), continuation);
    }

    public final Object r(Integer num, String str, Boolean bool, Continuation<? super MperksTransactionHistoryResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new k(str, num, bool, null), continuation);
    }

    public final Object s(int i10, Continuation<? super MperksPointsExpiry> continuation) {
        return C16644i.g(this.ioDispatcher, new l(i10, null), continuation);
    }

    public final Object t(Integer num, String str, String str2, Continuation<? super RewardIncludedUpcsResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new m(str, str2, num, null), continuation);
    }
}
