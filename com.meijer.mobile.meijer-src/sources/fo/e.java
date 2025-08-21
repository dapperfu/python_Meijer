package fo;

import co.AbstractC6530b;
import co.AutoClaimReward;
import co.EarnReward;
import co.EnumC6541m;
import com.meijer.mobile.mperks.networking.domain.models.AutoClaimAccountInfo;
import com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon;
import com.meijer.mobile.mperks.networking.domain.models.ExpiringPoints;
import com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedDetail;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import com.meijer.mobile.mperks.networking.domain.models.PaginatedResult;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.W;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u0001>B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\nJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0086@¢\u0006\u0004\b\u0015\u0010\nJ.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010!\u001a\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0086@¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000eH\u0086@¢\u0006\u0004\b$\u0010\nJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u000eH\u0086@¢\u0006\u0004\b%\u0010\nJ1\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u000eH\u0007¢\u0006\u0004\b(\u0010)J4\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0086@¢\u0006\u0004\b1\u00102J.\u00104\u001a\u00020 2\b\b\u0002\u00103\u001a\u00020-2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206H\u0086@¢\u0006\u0004\b7\u0010\nJ8\u0010<\u001a\f\u0012\b\u0012\u00060+j\u0002`;0/2\b\u00108\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010+2\u0006\u0010:\u001a\u00020+H\u0086@¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010BR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0D8\u0006¢\u0006\f\n\u0004\b(\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lfo/e;", "", "Lfo/a;", "mperksDataSource", "Lmv/K;", "ioDispatcher", "<init>", "(Lfo/a;Lmv/K;)V", "", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "j", "days", "", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "o", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "k", "Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "g", "Lco/b;", "autoClaimType", "", "autoClaimAmount", "Lco/a;", "f", "(Lco/b;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lco/g;", "h", "i", "availableRewards", "inProgressRewards", "d", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "maxItemCount", "", "xContinuationToken", "", "includeAdjustmentDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "m", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enroll", "c", "(ZLjava/lang/Double;Lco/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "e", "perPageCount", "continuationToken", "rewardId", "Lcom/meijer/mobile/core/models/products/ProductCode;", "q", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lfo/a;", "Lmv/K;", "Lpv/B;", "Lpv/B;", "_pointBalanceFlow", "Lpv/P;", "Lpv/P;", "n", "()Lpv/P;", "pointBalanceFlow", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C14045a mperksDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Integer> _pointBalanceFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<Integer> pointBalanceFlow;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lco/g;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository$getInProgressRewards$2", f = "RewardsRepository.kt", l = {122, 122}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends EarnReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132495a;

        /* renamed from: b, reason: collision with root package name */
        Object f132496b;

        /* renamed from: c, reason: collision with root package name */
        Object f132497c;

        /* renamed from: d, reason: collision with root package name */
        Object f132498d;

        /* renamed from: e, reason: collision with root package name */
        int f132499e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f132500f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lco/g;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository$getInProgressRewards$2$availableReward$1", f = "RewardsRepository.kt", l = {119}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends EarnReward>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f132502a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f132503b;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends EarnReward>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super List<EarnReward>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f132503b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f132503b, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<EarnReward>> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f132502a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                C14045a c14045a = this.f132503b.mperksDataSource;
                this.f132502a = 1;
                Object objJ = c14045a.j(this);
                if (objJ == objF) {
                    return objF;
                }
                return objJ;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lco/g;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository$getInProgressRewards$2$inProgressReward$1", f = "RewardsRepository.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
        /* renamed from: fo.e$b$b, reason: collision with other inner class name */
        static final class C2107b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends EarnReward>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f132504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f132505b;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends EarnReward>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super List<EarnReward>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2107b(e eVar, Continuation<? super C2107b> continuation) {
                super(2, continuation);
                this.f132505b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2107b(this.f132505b, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<EarnReward>> continuation) {
                return ((C2107b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f132504a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                C14045a c14045a = this.f132505b.mperksDataSource;
                this.f132504a = 1;
                Object objM = c14045a.m(this);
                if (objM == objF) {
                    return objF;
                }
                return objM;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends EarnReward>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<EarnReward>>) continuation);
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = e.this.new b(continuation);
            bVar.f132500f = obj;
            return bVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<EarnReward>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            W w10;
            W w11;
            e eVar;
            InterfaceC15783O interfaceC15783O;
            List<EarnReward> list;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f132499e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        list = (List) this.f132498d;
                        eVar = (e) this.f132497c;
                        ResultKt.b(obj);
                        return eVar.d(list, (List) obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (e) this.f132497c;
                w11 = (W) this.f132496b;
                w10 = (W) this.f132495a;
                interfaceC15783O = (InterfaceC15783O) this.f132500f;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O2 = (InterfaceC15783O) this.f132500f;
                W wB = C15809k.b(interfaceC15783O2, null, null, new a(e.this, null), 3, null);
                W wB2 = C15809k.b(interfaceC15783O2, null, null, new C2107b(e.this, null), 3, null);
                e eVar2 = e.this;
                this.f132500f = interfaceC15783O2;
                this.f132495a = wB;
                this.f132496b = wB2;
                this.f132497c = eVar2;
                this.f132499e = 1;
                Object objH = wB.H(this);
                if (objH != objF) {
                    w10 = wB;
                    obj = objH;
                    w11 = wB2;
                    eVar = eVar2;
                    interfaceC15783O = interfaceC15783O2;
                }
                return objF;
            }
            List<EarnReward> list2 = (List) obj;
            this.f132500f = interfaceC15783O;
            this.f132495a = w10;
            this.f132496b = w11;
            this.f132497c = eVar;
            this.f132498d = list2;
            this.f132499e = 2;
            Object objH2 = w11.H(this);
            if (objH2 != objF) {
                list = list2;
                obj = objH2;
                return eVar.d(list, (List) obj);
            }
            return objF;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardsRepository", f = "RewardsRepository.kt", l = {44}, m = "getMperksPointsBalance")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132506a;

        /* renamed from: b, reason: collision with root package name */
        Object f132507b;

        /* renamed from: c, reason: collision with root package name */
        Object f132508c;

        /* renamed from: d, reason: collision with root package name */
        Object f132509d;

        /* renamed from: e, reason: collision with root package name */
        int f132510e;

        /* renamed from: f, reason: collision with root package name */
        int f132511f;

        /* renamed from: g, reason: collision with root package name */
        int f132512g;

        /* renamed from: h, reason: collision with root package name */
        int f132513h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f132514i;

        /* renamed from: k, reason: collision with root package name */
        int f132516k;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132514i = obj;
            this.f132516k |= Integer.MIN_VALUE;
            return e.this.l(this);
        }
    }

    public e(C14045a mperksDataSource, AbstractC15779K ioDispatcher) {
        Intrinsics.j(mperksDataSource, "mperksDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.mperksDataSource = mperksDataSource;
        this.ioDispatcher = ioDispatcher;
        InterfaceC16549B<Integer> interfaceC16549BA = S.a(0);
        this._pointBalanceFlow = interfaceC16549BA;
        this.pointBalanceFlow = C16563h.c(interfaceC16549BA);
    }

    public static /* synthetic */ Object p(e eVar, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 30;
        }
        return eVar.o(i10, continuation);
    }

    public final Object b(long j10, Continuation<? super Unit> continuation) {
        Object objF = this.mperksDataSource.f(j10, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    public final Object c(boolean z10, Double d10, AbstractC6530b abstractC6530b, Continuation<? super Unit> continuation) {
        Object objG = this.mperksDataSource.g(z10, d10, abstractC6530b, continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final List<EarnReward> d(List<EarnReward> availableRewards, List<EarnReward> inProgressRewards) {
        Intrinsics.j(availableRewards, "availableRewards");
        Intrinsics.j(inProgressRewards, "inProgressRewards");
        List<EarnReward> list = inProgressRewards;
        ArrayList arrayList = new ArrayList();
        for (Object obj : availableRewards) {
            if (((EarnReward) obj).getRewardProgram() == EnumC6541m.f62801a) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.P0(list, arrayList);
    }

    public final Object e(Continuation<? super AutoClaimAccountInfo> continuation) {
        return this.mperksDataSource.h(continuation);
    }

    public final Object f(AbstractC6530b abstractC6530b, Double d10, Continuation<? super List<AutoClaimReward>> continuation) {
        return this.mperksDataSource.i(abstractC6530b, d10, continuation);
    }

    public final Object g(Continuation<? super List<AvailableRewardCoupon>> continuation) {
        return this.mperksDataSource.k(continuation);
    }

    public final Object h(Continuation<? super List<EarnReward>> continuation) {
        return this.mperksDataSource.j(continuation);
    }

    public final Object i(Continuation<? super List<EarnReward>> continuation) {
        return C15805i.g(this.ioDispatcher, new b(null), continuation);
    }

    public final Object j(Continuation<? super MperksCreditCardInfo> continuation) {
        return this.mperksDataSource.n(continuation);
    }

    public final Object k(Continuation<? super MperksRewardEarnedDetail> continuation) {
        return this.mperksDataSource.l(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fo.e.c
            if (r0 == 0) goto L13
            r0 = r6
            fo.e$c r0 = (fo.e.c) r0
            int r1 = r0.f132516k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132516k = r1
            goto L18
        L13:
            fo.e$c r0 = new fo.e$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f132514i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f132516k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f132509d
            fo.e r1 = (fo.e) r1
            java.lang.Object r1 = r0.f132508c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f132507b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f132506a
            fo.e r1 = (fo.e) r1
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
            fo.a r6 = a(r5)     // Catch: java.lang.Exception -> L3a
            r0.f132506a = r5     // Catch: java.lang.Exception -> L3a
            r0.f132507b = r0     // Catch: java.lang.Exception -> L3a
            r0.f132508c = r0     // Catch: java.lang.Exception -> L3a
            r0.f132509d = r5     // Catch: java.lang.Exception -> L3a
            r0.f132510e = r4     // Catch: java.lang.Exception -> L3a
            r0.f132511f = r4     // Catch: java.lang.Exception -> L3a
            r0.f132512g = r4     // Catch: java.lang.Exception -> L3a
            r0.f132513h = r4     // Catch: java.lang.Exception -> L3a
            r0.f132516k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.o(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L7c:
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto L92
            r0 = r6
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            pv.B<java.lang.Integer> r1 = r5._pointBalanceFlow
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.d(r0)
            r1.setValue(r0)
        L92:
            java.lang.Throwable r0 = kotlin.Result.e(r6)
            if (r0 == 0) goto La1
            pv.B<java.lang.Integer> r0 = r5._pointBalanceFlow
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.d(r4)
            r0.setValue(r1)
        La1:
            kotlin.ResultKt.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.e.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object m(Integer num, String str, Boolean bool, Continuation<? super PaginatedResult<MperksTransaction>> continuation) {
        return this.mperksDataSource.p(num, str, bool, continuation);
    }

    public final P<Integer> n() {
        return this.pointBalanceFlow;
    }

    public final Object o(int i10, Continuation<? super List<ExpiringPoints>> continuation) {
        return this.mperksDataSource.q(i10, continuation);
    }

    public final Object q(Integer num, String str, String str2, Continuation<? super PaginatedResult<String>> continuation) {
        return this.mperksDataSource.r(num, str, str2, continuation);
    }
}
