package eo;

import bo.AutoClaimReward;
import bo.EarnReward;
import bo.k;
import com.meijer.mobile.mperks.networking.domain.models.EnrolledAutoClaimReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksAvailableReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksAvailableRewardCouponsResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksClaimRewardResponseJson;
import com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfoResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksInProgressReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedResponse;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransactionHistoryResponse;
import com.meijer.mobile.mperks.networking.domain.models.RewardIncludedUpcsResponse;
import com.squareup.moshi.h;
import io.MperksClaimReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u0001>B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\nJ.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\rH\u0086@¢\u0006\u0004\b\"\u0010\nJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\rH\u0086@¢\u0006\u0004\b$\u0010\nJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\rH\u0086@¢\u0006\u0004\b&\u0010\nJ/\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\r¢\u0006\u0004\b)\u0010*J.\u00101\u001a\u0002002\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010.H\u0086@¢\u0006\u0004\b1\u00102J.\u00104\u001a\u00020\u001e2\b\b\u0002\u00103\u001a\u00020.2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b4\u00105J\u0012\u00107\u001a\u0004\u0018\u000106H\u0086@¢\u0006\u0004\b7\u0010\nJ.\u0010<\u001a\u00020;2\b\u00108\u001a\u0004\u0018\u00010+2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00142\u0006\u0010:\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR?\u0010I\u001a&\u0012\f\u0012\n D*\u0004\u0018\u00010C0C D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00010C0C\u0018\u00010B0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020+0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010KR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020+0M8\u0006¢\u0006\f\n\u0004\b\u001f\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Leo/g;", "", "Leo/a;", "mperksDataSource", "Lqv/K;", "ioDispatcher", "<init>", "(Leo/a;Lqv/K;)V", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksGetBalanceResponse;", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;", "n", "", "Lio/a;", "t", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedResponse;", "o", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableRewardCouponsResponse;", "i", "", "autoClaimType", "", "autoClaimAmount", "Lbo/a;", "h", "(Ljava/lang/String;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "Lio/b;", "e", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksInProgressReward;", "k", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableReward;", "j", "Lbo/f;", "l", "availableRewardsResponse", "inProgressRewardsResponse", "g", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "", "maxItemCount", "xContinuationToken", "", "includeAdjustmentDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransactionHistoryResponse;", "r", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enroll", "f", "(ZLjava/lang/Double;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;", "d", "perPageCount", "continuationToken", "rewardId", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardIncludedUpcsResponse;", "u", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Leo/a;", "b", "Lqv/K;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksClaimRewardResponseJson;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "m", "()Lcom/squareup/moshi/h;", "mperksClaimRewardErrorMoshi", "Ltv/B;", "Ltv/B;", "_pointBalanceFlow", "Ltv/P;", "Ltv/P;", "s", "()Ltv/P;", "pointBalanceFlow", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: eo.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13719g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C13713a mperksDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy mperksClaimRewardErrorMoshi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Integer> _pointBalanceFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<Integer> pointBalanceFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository", f = "RewardsRepository.kt", l = {119, 121}, m = "claimCoupon")
    /* renamed from: eo.g$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f129376a;

        /* renamed from: b, reason: collision with root package name */
        Object f129377b;

        /* renamed from: c, reason: collision with root package name */
        Object f129378c;

        /* renamed from: d, reason: collision with root package name */
        Object f129379d;

        /* renamed from: e, reason: collision with root package name */
        Object f129380e;

        /* renamed from: f, reason: collision with root package name */
        int f129381f;

        /* renamed from: g, reason: collision with root package name */
        int f129382g;

        /* renamed from: h, reason: collision with root package name */
        int f129383h;

        /* renamed from: i, reason: collision with root package name */
        int f129384i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f129385j;

        /* renamed from: l, reason: collision with root package name */
        int f129387l;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f129385j = obj;
            this.f129387l |= Integer.MIN_VALUE;
            return C13719g.this.e(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lbo/f;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository$getInProgressRewardsData$2", f = "RewardsRepository.kt", l = {160, 162, 162}, m = "invokeSuspend")
    /* renamed from: eo.g$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends EarnReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f129388a;

        /* renamed from: b, reason: collision with root package name */
        Object f129389b;

        /* renamed from: c, reason: collision with root package name */
        Object f129390c;

        /* renamed from: d, reason: collision with root package name */
        Object f129391d;

        /* renamed from: e, reason: collision with root package name */
        int f129392e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f129393f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableReward;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository$getInProgressRewardsData$2$availableReward$1", f = "RewardsRepository.kt", l = {157}, m = "invokeSuspend")
        /* renamed from: eo.g$c$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends MperksAvailableReward>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f129395a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C13719g f129396b;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends MperksAvailableReward>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super List<MperksAvailableReward>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C13719g c13719g, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f129396b = c13719g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f129396b, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<MperksAvailableReward>> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f129395a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                C13719g c13719g = this.f129396b;
                this.f129395a = 1;
                Object objJ = c13719g.j(this);
                if (objJ == objF) {
                    return objF;
                }
                return objJ;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksInProgressReward;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository$getInProgressRewardsData$2$inProgressReward$1", f = "RewardsRepository.kt", l = {158}, m = "invokeSuspend")
        /* renamed from: eo.g$c$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends MperksInProgressReward>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f129397a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C13719g f129398b;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends MperksInProgressReward>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super List<MperksInProgressReward>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C13719g c13719g, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f129398b = c13719g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f129398b, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<MperksInProgressReward>> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f129397a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                C13719g c13719g = this.f129398b;
                this.f129397a = 1;
                Object objK = c13719g.k(this);
                if (objK == objF) {
                    return objF;
                }
                return objK;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends EarnReward>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<EarnReward>>) continuation);
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C13719g.this.new c(continuation);
            cVar.f129393f = obj;
            return cVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<EarnReward>> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 198
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.C13719g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository", f = "RewardsRepository.kt", l = {55}, m = "getMperksPointsBalance")
    /* renamed from: eo.g$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f129399a;

        /* renamed from: b, reason: collision with root package name */
        Object f129400b;

        /* renamed from: c, reason: collision with root package name */
        Object f129401c;

        /* renamed from: d, reason: collision with root package name */
        Object f129402d;

        /* renamed from: e, reason: collision with root package name */
        int f129403e;

        /* renamed from: f, reason: collision with root package name */
        int f129404f;

        /* renamed from: g, reason: collision with root package name */
        int f129405g;

        /* renamed from: h, reason: collision with root package name */
        int f129406h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f129407i;

        /* renamed from: k, reason: collision with root package name */
        int f129409k;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f129407i = obj;
            this.f129409k |= Integer.MIN_VALUE;
            return C13719g.this.p(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository", f = "RewardsRepository.kt", l = {71}, m = "getPointsExpirySummary")
    /* renamed from: eo.g$e */
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f129410a;

        /* renamed from: b, reason: collision with root package name */
        Object f129411b;

        /* renamed from: c, reason: collision with root package name */
        Object f129412c;

        /* renamed from: d, reason: collision with root package name */
        Object f129413d;

        /* renamed from: e, reason: collision with root package name */
        int f129414e;

        /* renamed from: f, reason: collision with root package name */
        int f129415f;

        /* renamed from: g, reason: collision with root package name */
        int f129416g;

        /* renamed from: h, reason: collision with root package name */
        int f129417h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f129418i;

        /* renamed from: k, reason: collision with root package name */
        int f129420k;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f129418i = obj;
            this.f129420k |= Integer.MIN_VALUE;
            return C13719g.this.t(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q() {
        return 0;
    }

    public C13719g(C13713a mperksDataSource, AbstractC16618K ioDispatcher) {
        Intrinsics.j(mperksDataSource, "mperksDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.mperksDataSource = mperksDataSource;
        this.ioDispatcher = ioDispatcher;
        this.mperksClaimRewardErrorMoshi = LazyKt.b(new Function0() { // from class: eo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13719g.v();
            }
        });
        InterfaceC17140B<Integer> interfaceC17140BA = S.a(0);
        this._pointBalanceFlow = interfaceC17140BA;
        this.pointBalanceFlow = C17154h.c(interfaceC17140BA);
    }

    private final h<MperksClaimRewardResponseJson> m() {
        return (h) this.mperksClaimRewardErrorMoshi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h v() {
        return ho.g.f136154a.a().c(MperksClaimRewardResponseJson.class);
    }

    public final Object d(Continuation<? super EnrolledAutoClaimReward> continuation) {
        return this.mperksDataSource.h(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (p(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r10, kotlin.coroutines.Continuation<? super io.MperksClaimReward> r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C13719g.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(boolean z10, Double d10, String str, Continuation<? super MperksClaimReward> continuation) {
        return this.mperksDataSource.j(z10, d10, str, continuation);
    }

    public final List<EarnReward> g(List<MperksAvailableReward> availableRewardsResponse, List<MperksInProgressReward> inProgressRewardsResponse) {
        Intrinsics.j(availableRewardsResponse, "availableRewardsResponse");
        Intrinsics.j(inProgressRewardsResponse, "inProgressRewardsResponse");
        List<MperksInProgressReward> list = inProgressRewardsResponse;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MperksInProgressReward) it.next()).toEarnReward());
        }
        List<MperksAvailableReward> list2 = availableRewardsResponse;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MperksAvailableReward) it2.next()).toEarnReward());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((EarnReward) obj).getRewardProgramType() == k.f60600a) {
                arrayList3.add(obj);
            }
        }
        return CollectionsKt.P0(arrayList, arrayList3);
    }

    public final Object h(String str, Double d10, Continuation<? super List<AutoClaimReward>> continuation) {
        return this.mperksDataSource.k(str, d10, continuation);
    }

    public final Object i(Continuation<? super MperksAvailableRewardCouponsResponse> continuation) {
        return this.mperksDataSource.l(continuation);
    }

    public final Object j(Continuation<? super List<MperksAvailableReward>> continuation) {
        return this.mperksDataSource.m(continuation);
    }

    public final Object k(Continuation<? super List<MperksInProgressReward>> continuation) {
        return this.mperksDataSource.o(continuation);
    }

    public final Object l(Continuation<? super List<EarnReward>> continuation) {
        return C16644i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object n(Continuation<? super MperksCreditCardInfoResponse> continuation) {
        return this.mperksDataSource.p(continuation);
    }

    public final Object o(Continuation<? super MperksRewardEarnedResponse> continuation) {
        return this.mperksDataSource.n(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlin.coroutines.Continuation<? super com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eo.C13719g.d
            if (r0 == 0) goto L13
            r0 = r6
            eo.g$d r0 = (eo.C13719g.d) r0
            int r1 = r0.f129409k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129409k = r1
            goto L18
        L13:
            eo.g$d r0 = new eo.g$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f129407i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f129409k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f129402d
            eo.g r1 = (eo.C13719g) r1
            java.lang.Object r1 = r0.f129401c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f129400b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f129399a
            eo.g r1 = (eo.C13719g) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L66
        L3a:
            r6 = move-exception
            goto L6b
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L44:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            eo.a r6 = c(r5)     // Catch: java.lang.Exception -> L3a
            r0.f129399a = r5     // Catch: java.lang.Exception -> L3a
            r0.f129400b = r0     // Catch: java.lang.Exception -> L3a
            r0.f129401c = r0     // Catch: java.lang.Exception -> L3a
            r0.f129402d = r5     // Catch: java.lang.Exception -> L3a
            r0.f129403e = r4     // Catch: java.lang.Exception -> L3a
            r0.f129404f = r4     // Catch: java.lang.Exception -> L3a
            r0.f129405g = r4     // Catch: java.lang.Exception -> L3a
            r0.f129406h = r4     // Catch: java.lang.Exception -> L3a
            r0.f129409k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.q(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L7c:
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto La7
            r0 = r6
            com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse r0 = (com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse) r0
            tv.B<java.lang.Integer> r1 = r5._pointBalanceFlow
            com.meijer.mobile.mperks.networking.domain.models.GetBalancePayload r0 = r0.getPayload()
            if (r0 == 0) goto L96
            int r0 = r0.getTotalPoints()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.d(r0)
            goto L97
        L96:
            r0 = 0
        L97:
            eo.e r2 = new eo.e
            r2.<init>()
            int r0 = xk.C18066d.b(r0, r2)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.d(r0)
            r1.setValue(r0)
        La7:
            java.lang.Throwable r0 = kotlin.Result.e(r6)
            if (r0 == 0) goto Lb6
            tv.B<java.lang.Integer> r0 = r5._pointBalanceFlow
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.d(r4)
            r0.setValue(r1)
        Lb6:
            kotlin.ResultKt.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C13719g.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object r(Integer num, String str, Boolean bool, Continuation<? super MperksTransactionHistoryResponse> continuation) {
        return this.mperksDataSource.r(num, str, bool, continuation);
    }

    public final P<Integer> s() {
        return this.pointBalanceFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation<? super java.util.List<io.ExpiringPoints>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eo.C13719g.e
            if (r0 == 0) goto L13
            r0 = r6
            eo.g$e r0 = (eo.C13719g.e) r0
            int r1 = r0.f129420k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129420k = r1
            goto L18
        L13:
            eo.g$e r0 = new eo.g$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f129418i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f129420k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f129413d
            eo.g r1 = (eo.C13719g) r1
            java.lang.Object r1 = r0.f129412c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f129411b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f129410a
            eo.g r1 = (eo.C13719g) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L68
        L3a:
            r6 = move-exception
            goto La2
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L44:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            eo.a r6 = c(r5)     // Catch: java.lang.Exception -> L3a
            r0.f129410a = r5     // Catch: java.lang.Exception -> L3a
            r0.f129411b = r0     // Catch: java.lang.Exception -> L3a
            r0.f129412c = r0     // Catch: java.lang.Exception -> L3a
            r0.f129413d = r5     // Catch: java.lang.Exception -> L3a
            r0.f129414e = r4     // Catch: java.lang.Exception -> L3a
            r0.f129415f = r4     // Catch: java.lang.Exception -> L3a
            r0.f129416g = r4     // Catch: java.lang.Exception -> L3a
            r0.f129417h = r4     // Catch: java.lang.Exception -> L3a
            r0.f129420k = r3     // Catch: java.lang.Exception -> L3a
            r2 = 30
            java.lang.Object r6 = r6.s(r2, r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L68
            return r1
        L68:
            io.c r6 = (io.MperksPointsExpiry) r6     // Catch: java.lang.Exception -> L3a
            boolean r1 = r6.getSuccess()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "mPerks_get_points_balance_summary_response"
            if (r1 == 0) goto L8c
            uw.a$a r1 = uw.a.INSTANCE     // Catch: java.lang.Exception -> L3a
            uw.a$b r1 = r1.x(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L3a
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3a
            r1.q(r2, r3)     // Catch: java.lang.Exception -> L3a
            java.util.List r6 = r6.a()     // Catch: java.lang.Exception -> L3a
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L3a
            java.util.List r6 = kotlin.collections.CollectionsKt.p0(r6)     // Catch: java.lang.Exception -> L3a
            goto L9d
        L8c:
            uw.a$a r6 = uw.a.INSTANCE     // Catch: java.lang.Exception -> L3a
            uw.a$b r6 = r6.x(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "No points expiring."
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3a
            r6.q(r1, r2)     // Catch: java.lang.Exception -> L3a
            java.util.List r6 = kotlin.collections.CollectionsKt.m()     // Catch: java.lang.Exception -> L3a
        L9d:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto Lb3
        La2:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        Lb3:
            java.lang.Throwable r0 = kotlin.Result.e(r6)
            if (r0 != 0) goto Lba
            goto Lcb
        Lba:
            boolean r6 = r0 instanceof java.lang.Error
            if (r6 != 0) goto Lcc
            uw.a$a r6 = uw.a.INSTANCE
            java.lang.String r1 = "Failed to fetch expiring mperks points"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r6.f(r0, r1, r2)
            java.util.List r6 = kotlin.collections.CollectionsKt.m()
        Lcb:
            return r6
        Lcc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C13719g.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object u(Integer num, String str, String str2, Continuation<? super RewardIncludedUpcsResponse> continuation) {
        return this.mperksDataSource.t(num, str, str2, continuation);
    }
}
