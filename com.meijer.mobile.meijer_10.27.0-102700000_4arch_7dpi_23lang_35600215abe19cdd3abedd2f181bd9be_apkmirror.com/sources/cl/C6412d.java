package cl;

import Ok.Coupon;
import Rk.CouponOptions;
import al.EnumC5609a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.coupons.api.models.Category;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.coupons.api.models.GetAdsResponse;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.CouponsResponse;
import io.reactivex.u;
import j$.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import qv.AbstractC16618K;
import qv.InterfaceC16622O;
import retrofit2.Response;
import tv.C17154h;
import tv.C17165t;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u001e2\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J;\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&H\u0007¢\u0006\u0004\b,\u0010-J6\u0010.\u001a\u00020+2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&H\u0086@¢\u0006\u0004\b.\u0010/J'\u00102\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00101\u001a\u0002002\b\b\u0002\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u0002042\u0006\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u0002042\u0006\u0010!\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b<\u00108J\u0018\u0010=\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b=\u0010:J#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120>0*2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b?\u00106J\u0018\u0010@\u001a\u00020&2\u0006\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b@\u00108J#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\b0*2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\b2\u0006\u0010B\u001a\u00020AH\u0086@¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020H0*H\u0007¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020M0*H\u0007¢\u0006\u0004\bN\u0010JJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\bH\u0086@¢\u0006\u0004\bP\u0010LJ*\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\b2\u0006\u0010R\u001a\u00020Q2\n\u0010U\u001a\u00060Sj\u0002`TH\u0086@¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R&\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u001e0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR#\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u001a8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR&\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010aR)\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e0j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR&\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010s\u001a\u0004\bp\u0010qR,\u0010w\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e0\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010s\u001a\u0004\bu\u0010q¨\u0006x"}, d2 = {"Lcl/d;", "", "LZk/a;", "couponsDataSource", "LTq/j;", "storeProvider", "Lqv/K;", "ioDispatcher", "", "LOk/a;", "initialCoupons", "<init>", "(LZk/a;LTq/j;Lqv/K;Ljava/util/List;)V", "(LZk/a;LTq/j;Lqv/K;)V", "", "couponId", "LPk/b;", "couponActionLoadingState", "", "K", "(Ljava/lang/String;LPk/b;)V", "LOk/c;", "couponIdentity", "Lio/reactivex/l;", "k", "(LOk/c;)Lio/reactivex/l;", "Ltv/f;", "j", "(LOk/c;)Ltv/f;", "coupons", "", "J", "(Ljava/util/List;)Ljava/util/Map;", "coupon", "I", "(LOk/a;)Ljava/util/Map;", "LRk/a;", "couponOptions", "", "requireSpecialOffers", "showOnlySpecialOffers", "isShowClippedCouponOnly", "Lio/reactivex/u;", "Ldl/a;", "z", "(LRk/a;ZZZ)Lio/reactivex/u;", "D", "(LRk/a;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "couponsRequest", "A", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Z)Lio/reactivex/u;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "h", "(LOk/a;)Lio/reactivex/u;", "i", "(LOk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H", "(LOk/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "G", "y", "Lretrofit2/Response;", "w", "x", "Lal/a;", "categoryFilter", "Lcom/meijer/mobile/coupons/api/models/Category;", "p", "(Lal/a;)Lio/reactivex/u;", "q", "(Lal/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "u", "()Lio/reactivex/u;", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;", "n", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "o", "j$/time/LocalDate", "weeklyAdStartDate", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "s", "(Lj$/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LZk/a;", "b", "LTq/j;", "c", "Lqv/K;", "Ltv/B;", "d", "Ltv/B;", "couponsStore", "e", "Ltv/f;", "r", "()Ltv/f;", "couponsFlow", "f", "couponActionLoadingStatesStore", "Ltv/P;", "g", "Ltv/P;", "l", "()Ltv/P;", "couponActionLoadingStateFlow", "t", "()Lio/reactivex/l;", "getCouponsStream$annotations", "()V", "couponsStream", "m", "getCouponActionLoadingStatesStream$annotations", "couponActionLoadingStatesStream", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cl.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6412d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zk.a couponsDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Map<String, Coupon>> couponsStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<List<Coupon>> couponsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Map<String, Pk.b>> couponActionLoadingStatesStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<Map<String, Pk.b>> couponActionLoadingStateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$clipCoupon$2", f = "CouponsRepository.kt", l = {313}, m = "invokeSuspend")
    /* renamed from: cl.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61826a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f61828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Coupon coupon, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f61828c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new a(this.f61828c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61826a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C6412d c6412d = C6412d.this;
            Coupon coupon = this.f61828c;
            this.f61826a = 1;
            Object objI = c6412d.i(coupon, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {333}, m = "clipCouponCRT")
    /* renamed from: cl.d$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f61829a;

        /* renamed from: b, reason: collision with root package name */
        Object f61830b;

        /* renamed from: c, reason: collision with root package name */
        Object f61831c;

        /* renamed from: d, reason: collision with root package name */
        Object f61832d;

        /* renamed from: e, reason: collision with root package name */
        Object f61833e;

        /* renamed from: f, reason: collision with root package name */
        int f61834f;

        /* renamed from: g, reason: collision with root package name */
        int f61835g;

        /* renamed from: h, reason: collision with root package name */
        int f61836h;

        /* renamed from: i, reason: collision with root package name */
        int f61837i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f61838j;

        /* renamed from: l, reason: collision with root package name */
        int f61840l;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61838j = obj;
            this.f61840l |= Integer.MIN_VALUE;
            return C6412d.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cl.d$c */
    public static final class c implements InterfaceC17152f<Coupon> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f61841a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ok.c f61842b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: cl.d$c$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f61843a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ok.c f61844b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$couponFlow$$inlined$map$1$2", f = "CouponsRepository.kt", l = {50}, m = "emit")
            /* renamed from: cl.d$c$a$a, reason: collision with other inner class name */
            public static final class C1221a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f61845a;

                /* renamed from: b, reason: collision with root package name */
                int f61846b;

                /* renamed from: c, reason: collision with root package name */
                Object f61847c;

                /* renamed from: e, reason: collision with root package name */
                Object f61849e;

                /* renamed from: f, reason: collision with root package name */
                Object f61850f;

                /* renamed from: g, reason: collision with root package name */
                Object f61851g;

                /* renamed from: h, reason: collision with root package name */
                int f61852h;

                public C1221a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f61845a = obj;
                    this.f61846b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, Ok.c cVar) {
                this.f61843a = interfaceC17153g;
                this.f61844b = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof cl.C6412d.c.a.C1221a
                    if (r0 == 0) goto L13
                    r0 = r8
                    cl.d$c$a$a r0 = (cl.C6412d.c.a.C1221a) r0
                    int r1 = r0.f61846b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f61846b = r1
                    goto L18
                L13:
                    cl.d$c$a$a r0 = new cl.d$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f61845a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f61846b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.f61851g
                    tv.g r7 = (tv.InterfaceC17153g) r7
                    java.lang.Object r7 = r0.f61849e
                    cl.d$c$a$a r7 = (cl.C6412d.c.a.C1221a) r7
                    kotlin.ResultKt.b(r8)
                    goto L63
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.ResultKt.b(r8)
                    tv.g r8 = r6.f61843a
                    r2 = r7
                    java.util.Map r2 = (java.util.Map) r2
                    Ok.c r4 = r6.f61844b
                    long r4 = r4.getOfferId()
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    java.lang.Object r2 = kotlin.collections.MapsKt.l(r2, r4)
                    r0.f61847c = r7
                    r0.f61849e = r0
                    r0.f61850f = r7
                    r0.f61851g = r8
                    r7 = 0
                    r0.f61852h = r7
                    r0.f61846b = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC17152f interfaceC17152f, Ok.c cVar) {
            this.f61841a = interfaceC17152f;
            this.f61842b = cVar;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Coupon> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f61841a.collect(new a(interfaceC17153g, this.f61842b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cause", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$couponFlow$2", f = "CouponsRepository.kt", l = {125}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: cl.d$d, reason: collision with other inner class name */
    static final class C1222d extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61853a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f61854b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ok.c f61856d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1222d(Ok.c cVar, Continuation<? super C1222d> continuation) {
            super(2, continuation);
            this.f61856d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1222d c1222d = C6412d.this.new C1222d(this.f61856d, continuation);
            c1222d.f61854b = obj;
            return c1222d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61853a;
            boolean z10 = false;
            if (i10 == 0) {
                ResultKt.b(obj);
                Throwable th2 = (Throwable) this.f61854b;
                if (th2 instanceof NoSuchElementException) {
                    C6412d c6412d = C6412d.this;
                    CouponOptions aVar = new CouponOptions(null, null, null, false, true, 0L, null, null, false, CollectionsKt.s(Boxing.e(this.f61856d.getOfferId())), null, false, true, 3567, null);
                    this.f61854b = th2;
                    this.f61853a = 1;
                    objE = C6412d.E(c6412d, aVar, false, false, false, this, 12, null);
                    if (objE == objF) {
                        return objF;
                    }
                }
                return Boxing.a(z10);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objE = obj;
            List<Coupon> listF = ((CouponsResponse) objE).f();
            if (listF == null) {
                listF = CollectionsKt.m();
            }
            List<Coupon> list = listF;
            Ok.c cVar = this.f61856d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Coupon) it.next()).getOfferId() == cVar.getOfferId()) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boxing.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((C1222d) create(th2, continuation)).invokeSuspend(Unit.f142422a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$getCouponAds$1", f = "CouponsRepository.kt", l = {575}, m = "invokeSuspend")
    /* renamed from: cl.d$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super GetAdsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61857a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super GetAdsResponse> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61857a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6412d c6412d = C6412d.this;
                this.f61857a = 1;
                obj = c6412d.o(this);
                if (obj == objF) {
                    return objF;
                }
            }
            return new GetAdsResponse((List) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$getCouponCategories$1", f = "CouponsRepository.kt", l = {539}, m = "invokeSuspend")
    /* renamed from: cl.d$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends Category>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61859a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC5609a f61861c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends Category>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<Category>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(EnumC5609a enumC5609a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f61861c = enumC5609a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new f(this.f61861c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<Category>> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61859a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C6412d c6412d = C6412d.this;
            EnumC5609a enumC5609a = this.f61861c;
            this.f61859a = 1;
            Object objQ = c6412d.q(enumC5609a, this);
            if (objQ == objF) {
                return objF;
            }
            return objQ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$getSpecialOffers$1", f = "CouponsRepository.kt", l = {557}, m = "invokeSuspend")
    /* renamed from: cl.d$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SpecialOffersUrlResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61862a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SpecialOffersUrlResponse> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61862a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6412d c6412d = C6412d.this;
                this.f61862a = 1;
                obj = c6412d.v(this);
                if (obj == objF) {
                    return objF;
                }
            }
            return new SpecialOffersUrlResponse((String) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lqv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$hideCoupon$2", f = "CouponsRepository.kt", l = {497}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: cl.d$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61864a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f61866c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Coupon coupon, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f61866c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new h(this.f61866c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Response<Unit>> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61864a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6412d c6412d = C6412d.this;
                Coupon coupon = this.f61866c;
                this.f61864a = 1;
                obj = c6412d.x(coupon, this);
                if (obj == objF) {
                    return objF;
                }
            }
            ((Boolean) obj).getClass();
            Response responseSuccess = Response.success(Unit.f142422a);
            Intrinsics.i(responseSuccess, "let(...)");
            return responseSuccess;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cl.d$i */
    public static final class i implements InterfaceC17152f<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f61867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6412d f61868b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: cl.d$i$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f61869a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6412d f61870b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$hideCouponCRT$$inlined$map$1$2", f = "CouponsRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: cl.d$i$a$a, reason: collision with other inner class name */
            public static final class C1223a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f61871a;

                /* renamed from: b, reason: collision with root package name */
                int f61872b;

                /* renamed from: c, reason: collision with root package name */
                Object f61873c;

                /* renamed from: e, reason: collision with root package name */
                Object f61875e;

                /* renamed from: f, reason: collision with root package name */
                Object f61876f;

                /* renamed from: g, reason: collision with root package name */
                Object f61877g;

                /* renamed from: h, reason: collision with root package name */
                Object f61878h;

                /* renamed from: i, reason: collision with root package name */
                Object f61879i;

                /* renamed from: j, reason: collision with root package name */
                Object f61880j;

                /* renamed from: k, reason: collision with root package name */
                int f61881k;

                /* renamed from: l, reason: collision with root package name */
                int f61882l;

                public C1223a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f61871a = obj;
                    this.f61872b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, C6412d c6412d) {
                this.f61869a = interfaceC17153g;
                this.f61870b = c6412d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof cl.C6412d.i.a.C1223a
                    if (r0 == 0) goto L13
                    r0 = r11
                    cl.d$i$a$a r0 = (cl.C6412d.i.a.C1223a) r0
                    int r1 = r0.f61872b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f61872b = r1
                    goto L18
                L13:
                    cl.d$i$a$a r0 = new cl.d$i$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f61871a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f61872b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f61877g
                    tv.g r10 = (tv.InterfaceC17153g) r10
                    java.lang.Object r10 = r0.f61875e
                    cl.d$i$a$a r10 = (cl.C6412d.i.a.C1223a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f61881k
                    java.lang.Object r2 = r0.f61880j
                    Ok.a r2 = (Ok.Coupon) r2
                    java.lang.Object r2 = r0.f61879i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f61878h
                    tv.g r2 = (tv.InterfaceC17153g) r2
                    java.lang.Object r4 = r0.f61877g
                    tv.g r4 = (tv.InterfaceC17153g) r4
                    java.lang.Object r5 = r0.f61876f
                    java.lang.Object r6 = r0.f61875e
                    cl.d$i$a$a r6 = (cl.C6412d.i.a.C1223a) r6
                    java.lang.Object r7 = r0.f61873c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    tv.g r2 = r9.f61869a
                    r11 = r10
                    Ok.a r11 = (Ok.Coupon) r11
                    cl.d r5 = r9.f61870b
                    r0.f61873c = r10
                    r0.f61875e = r0
                    r0.f61876f = r10
                    r0.f61877g = r2
                    r0.f61878h = r2
                    r0.f61879i = r0
                    r0.f61880j = r11
                    r6 = 0
                    r0.f61881k = r6
                    r0.f61882l = r6
                    r0.f61872b = r4
                    java.lang.Object r11 = r5.x(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f61873c = r10
                    r0.f61875e = r7
                    r0.f61876f = r5
                    r0.f61877g = r4
                    r10 = 0
                    r0.f61878h = r10
                    r0.f61879i = r10
                    r0.f61880j = r10
                    r0.f61881k = r6
                    r0.f61872b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f142422a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.i.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public i(InterfaceC17152f interfaceC17152f, C6412d c6412d) {
            this.f61867a = interfaceC17152f;
            this.f61868b = c6412d;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Boolean> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f61867a.collect(new a(interfaceC17153g, this.f61868b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {513}, m = "hideCouponCRT")
    /* renamed from: cl.d$j */
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f61883a;

        /* renamed from: b, reason: collision with root package name */
        Object f61884b;

        /* renamed from: c, reason: collision with root package name */
        Object f61885c;

        /* renamed from: d, reason: collision with root package name */
        Object f61886d;

        /* renamed from: e, reason: collision with root package name */
        Object f61887e;

        /* renamed from: f, reason: collision with root package name */
        int f61888f;

        /* renamed from: g, reason: collision with root package name */
        int f61889g;

        /* renamed from: h, reason: collision with root package name */
        int f61890h;

        /* renamed from: i, reason: collision with root package name */
        int f61891i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f61892j;

        /* renamed from: l, reason: collision with root package name */
        int f61894l;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61892j = obj;
            this.f61894l |= Integer.MIN_VALUE;
            return C6412d.this.x(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ldl/a;", "<anonymous>", "(Lqv/O;)Ldl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$loadCoupons$1", f = "CouponsRepository.kt", l = {175}, m = "invokeSuspend")
    /* renamed from: cl.d$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61895a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponOptions f61897c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f61898d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61899e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61900f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(CouponOptions aVar, boolean z10, boolean z11, boolean z12, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f61897c = aVar;
            this.f61898d = z10;
            this.f61899e = z11;
            this.f61900f = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new k(this.f61897c, this.f61898d, this.f61899e, this.f61900f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CouponsResponse> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61895a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C6412d c6412d = C6412d.this;
            CouponOptions aVar = this.f61897c;
            boolean z10 = this.f61898d;
            boolean z11 = this.f61899e;
            boolean z12 = this.f61900f;
            this.f61895a = 1;
            Object objD = c6412d.D(aVar, z10, z11, z12, this);
            if (objD == objF) {
                return objF;
            }
            return objD;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ldl/a;", "<anonymous>", "(Lqv/O;)Ldl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$loadCoupons$2", f = "CouponsRepository.kt", l = {252}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: cl.d$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61901a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponsRequest f61903c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f61904d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(CouponsRequest couponsRequest, boolean z10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f61903c = couponsRequest;
            this.f61904d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new l(this.f61903c, this.f61904d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CouponsResponse> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61901a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Zk.a aVar = C6412d.this.couponsDataSource;
                CouponsRequest couponsRequest = this.f61903c;
                boolean z10 = this.f61904d;
                this.f61901a = 1;
                obj = aVar.h(couponsRequest, z10, this);
                if (obj == objF) {
                    return objF;
                }
            }
            C6412d c6412d = C6412d.this;
            List<Coupon> listF = ((CouponsResponse) obj).f();
            if (listF == null) {
                listF = CollectionsKt.m();
            }
            c6412d.J(listF);
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 225, 230}, m = "loadCouponsCRT")
    /* renamed from: cl.d$m */
    static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f61905a;

        /* renamed from: b, reason: collision with root package name */
        Object f61906b;

        /* renamed from: c, reason: collision with root package name */
        Object f61907c;

        /* renamed from: d, reason: collision with root package name */
        Object f61908d;

        /* renamed from: e, reason: collision with root package name */
        boolean f61909e;

        /* renamed from: f, reason: collision with root package name */
        boolean f61910f;

        /* renamed from: g, reason: collision with root package name */
        boolean f61911g;

        /* renamed from: h, reason: collision with root package name */
        int f61912h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f61913i;

        /* renamed from: k, reason: collision with root package name */
        int f61915k;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61913i = obj;
            this.f61915k |= Integer.MIN_VALUE;
            return C6412d.this.D(null, false, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cl.d$n */
    public static final class n implements InterfaceC17152f<List<? extends Coupon>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f61916a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: cl.d$n$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f61917a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$special$$inlined$map$1$2", f = "CouponsRepository.kt", l = {50}, m = "emit")
            /* renamed from: cl.d$n$a$a, reason: collision with other inner class name */
            public static final class C1224a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f61918a;

                /* renamed from: b, reason: collision with root package name */
                int f61919b;

                /* renamed from: c, reason: collision with root package name */
                Object f61920c;

                /* renamed from: e, reason: collision with root package name */
                Object f61922e;

                /* renamed from: f, reason: collision with root package name */
                Object f61923f;

                /* renamed from: g, reason: collision with root package name */
                Object f61924g;

                /* renamed from: h, reason: collision with root package name */
                int f61925h;

                public C1224a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f61918a = obj;
                    this.f61919b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f61917a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof cl.C6412d.n.a.C1224a
                    if (r0 == 0) goto L13
                    r0 = r6
                    cl.d$n$a$a r0 = (cl.C6412d.n.a.C1224a) r0
                    int r1 = r0.f61919b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f61919b = r1
                    goto L18
                L13:
                    cl.d$n$a$a r0 = new cl.d$n$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f61918a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f61919b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f61924g
                    tv.g r5 = (tv.InterfaceC17153g) r5
                    java.lang.Object r5 = r0.f61922e
                    cl.d$n$a$a r5 = (cl.C6412d.n.a.C1224a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5f
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f61917a
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    java.util.Collection r2 = r2.values()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.List r2 = kotlin.collections.CollectionsKt.j1(r2)
                    r0.f61920c = r5
                    r0.f61922e = r0
                    r0.f61923f = r5
                    r0.f61924g = r6
                    r5 = 0
                    r0.f61925h = r5
                    r0.f61919b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public n(InterfaceC17152f interfaceC17152f) {
            this.f61916a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super List<? extends Coupon>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f61916a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$unclipCoupon$2", f = "CouponsRepository.kt", l = {HttpResponseStatus.ERROR_REQUEST_TIMEOUT}, m = "invokeSuspend")
    /* renamed from: cl.d$o */
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61926a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f61928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Coupon coupon, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f61928c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6412d.this.new o(this.f61928c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61926a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C6412d c6412d = C6412d.this;
            Coupon coupon = this.f61928c;
            this.f61926a = 1;
            Object objG = c6412d.G(coupon, this);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cl.d$p */
    public static final class p implements InterfaceC17152f<ClipUnclipCouponResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f61929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6412d f61930b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: cl.d$p$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f61931a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6412d f61932b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$unclipCouponCRT$$inlined$map$1$2", f = "CouponsRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: cl.d$p$a$a, reason: collision with other inner class name */
            public static final class C1225a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f61933a;

                /* renamed from: b, reason: collision with root package name */
                int f61934b;

                /* renamed from: c, reason: collision with root package name */
                Object f61935c;

                /* renamed from: e, reason: collision with root package name */
                Object f61937e;

                /* renamed from: f, reason: collision with root package name */
                Object f61938f;

                /* renamed from: g, reason: collision with root package name */
                Object f61939g;

                /* renamed from: h, reason: collision with root package name */
                Object f61940h;

                /* renamed from: i, reason: collision with root package name */
                Object f61941i;

                /* renamed from: j, reason: collision with root package name */
                Object f61942j;

                /* renamed from: k, reason: collision with root package name */
                int f61943k;

                /* renamed from: l, reason: collision with root package name */
                int f61944l;

                public C1225a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f61933a = obj;
                    this.f61934b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, C6412d c6412d) {
                this.f61931a = interfaceC17153g;
                this.f61932b = c6412d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof cl.C6412d.p.a.C1225a
                    if (r0 == 0) goto L13
                    r0 = r11
                    cl.d$p$a$a r0 = (cl.C6412d.p.a.C1225a) r0
                    int r1 = r0.f61934b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f61934b = r1
                    goto L18
                L13:
                    cl.d$p$a$a r0 = new cl.d$p$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f61933a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f61934b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f61939g
                    tv.g r10 = (tv.InterfaceC17153g) r10
                    java.lang.Object r10 = r0.f61937e
                    cl.d$p$a$a r10 = (cl.C6412d.p.a.C1225a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f61943k
                    java.lang.Object r2 = r0.f61942j
                    Ok.a r2 = (Ok.Coupon) r2
                    java.lang.Object r2 = r0.f61941i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f61940h
                    tv.g r2 = (tv.InterfaceC17153g) r2
                    java.lang.Object r4 = r0.f61939g
                    tv.g r4 = (tv.InterfaceC17153g) r4
                    java.lang.Object r5 = r0.f61938f
                    java.lang.Object r6 = r0.f61937e
                    cl.d$p$a$a r6 = (cl.C6412d.p.a.C1225a) r6
                    java.lang.Object r7 = r0.f61935c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    tv.g r2 = r9.f61931a
                    r11 = r10
                    Ok.a r11 = (Ok.Coupon) r11
                    cl.d r5 = r9.f61932b
                    r0.f61935c = r10
                    r0.f61937e = r0
                    r0.f61938f = r10
                    r0.f61939g = r2
                    r0.f61940h = r2
                    r0.f61941i = r0
                    r0.f61942j = r11
                    r6 = 0
                    r0.f61943k = r6
                    r0.f61944l = r6
                    r0.f61934b = r4
                    java.lang.Object r11 = r5.G(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f61935c = r10
                    r0.f61937e = r7
                    r0.f61938f = r5
                    r0.f61939g = r4
                    r10 = 0
                    r0.f61940h = r10
                    r0.f61941i = r10
                    r0.f61942j = r10
                    r0.f61943k = r6
                    r0.f61934b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f142422a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.p.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public p(InterfaceC17152f interfaceC17152f, C6412d c6412d) {
            this.f61929a = interfaceC17152f;
            this.f61930b = c6412d;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super ClipUnclipCouponResponse> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f61929a.collect(new a(interfaceC17153g, this.f61930b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {428}, m = "unclipCouponCRT")
    /* renamed from: cl.d$q */
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f61945a;

        /* renamed from: b, reason: collision with root package name */
        Object f61946b;

        /* renamed from: c, reason: collision with root package name */
        Object f61947c;

        /* renamed from: d, reason: collision with root package name */
        Object f61948d;

        /* renamed from: e, reason: collision with root package name */
        Object f61949e;

        /* renamed from: f, reason: collision with root package name */
        int f61950f;

        /* renamed from: g, reason: collision with root package name */
        int f61951g;

        /* renamed from: h, reason: collision with root package name */
        int f61952h;

        /* renamed from: i, reason: collision with root package name */
        int f61953i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f61954j;

        /* renamed from: l, reason: collision with root package name */
        int f61956l;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61954j = obj;
            this.f61956l |= Integer.MIN_VALUE;
            return C6412d.this.G(null, this);
        }
    }

    public C6412d(Zk.a couponsDataSource, Tq.j storeProvider, AbstractC16618K ioDispatcher, List<Coupon> initialCoupons) {
        Intrinsics.j(couponsDataSource, "couponsDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        Intrinsics.j(initialCoupons, "initialCoupons");
        this.couponsDataSource = couponsDataSource;
        this.storeProvider = storeProvider;
        this.ioDispatcher = ioDispatcher;
        List<Coupon> list = initialCoupons;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(String.valueOf(((Coupon) obj).getOfferId()), obj);
        }
        InterfaceC17140B<Map<String, Coupon>> interfaceC17140BA = S.a(linkedHashMap);
        this.couponsStore = interfaceC17140BA;
        this.couponsFlow = C17154h.r(new n(C17154h.c(interfaceC17140BA)));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pairA = TuplesKt.a(String.valueOf(((Coupon) it.next()).getOfferId()), Pk.b.f28321b);
            linkedHashMap2.put(pairA.c(), pairA.d());
        }
        InterfaceC17140B<Map<String, Pk.b>> interfaceC17140BA2 = S.a(linkedHashMap2);
        this.couponActionLoadingStatesStore = interfaceC17140BA2;
        this.couponActionLoadingStateFlow = C17154h.c(interfaceC17140BA2);
    }

    public static /* synthetic */ u B(C6412d c6412d, CouponOptions aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        return c6412d.z(aVar, z10, z11, z12);
    }

    public static /* synthetic */ u C(C6412d c6412d, CouponsRequest couponsRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c6412d.A(couponsRequest, z10);
    }

    public static /* synthetic */ Object E(C6412d c6412d, CouponOptions aVar, boolean z10, boolean z11, boolean z12, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c6412d.D(aVar, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String couponId, Pk.b couponActionLoadingState) {
        Map<String, Pk.b> value;
        InterfaceC17140B<Map<String, Pk.b>> interfaceC17140B = this.couponActionLoadingStatesStore;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, MapsKt.v(value, TuplesKt.a(couponId, couponActionLoadingState))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(Map it) {
        Intrinsics.j(it, "it");
        return CollectionsKt.j1(it.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (List) function1.invoke(p02);
    }

    @Deprecated
    public final u<CouponsResponse> A(CouponsRequest couponsRequest, boolean requireSpecialOffers) {
        Intrinsics.j(couponsRequest, "couponsRequest");
        return xv.n.b(this.ioDispatcher, new l(couponsRequest, requireSpecialOffers, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r5 == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(Rk.CouponOptions r26, boolean r27, boolean r28, boolean r29, kotlin.coroutines.Continuation<? super dl.CouponsResponse> r30) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.D(Rk.a, boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated
    public final u<ClipUnclipCouponResponse> F(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return xv.n.b(this.ioDispatcher, new o(coupon, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(Ok.Coupon r37, kotlin.coroutines.Continuation<? super com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse> r38) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.G(Ok.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Map<String, Coupon> I(Coupon coupon) {
        Map<String, Coupon> value;
        Map<String, Coupon> mapV;
        Intrinsics.j(coupon, "coupon");
        InterfaceC17140B<Map<String, Coupon>> interfaceC17140B = this.couponsStore;
        do {
            value = interfaceC17140B.getValue();
            mapV = MapsKt.v(value, TuplesKt.a(String.valueOf(coupon.getOfferId()), coupon));
        } while (!interfaceC17140B.e(value, mapV));
        return mapV;
    }

    public final Map<String, Coupon> J(List<Coupon> coupons) {
        Map<String, Coupon> value;
        Map<String, Coupon> mapU;
        Intrinsics.j(coupons, "coupons");
        InterfaceC17140B<Map<String, Coupon>> interfaceC17140B = this.couponsStore;
        do {
            value = interfaceC17140B.getValue();
            Map<String, Coupon> map = value;
            List<Coupon> list = coupons;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(String.valueOf(((Coupon) obj).getOfferId()), obj);
            }
            mapU = MapsKt.u(map, linkedHashMap);
        } while (!interfaceC17140B.e(value, mapU));
        return mapU;
    }

    @Deprecated
    public final u<ClipUnclipCouponResponse> h(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return xv.n.b(this.ioDispatcher, new a(coupon, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(Ok.Coupon r37, kotlin.coroutines.Continuation<? super com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse> r38) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.i(Ok.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC17152f<Coupon> j(Ok.c couponIdentity) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        return C17154h.r(C17165t.f(new c(this.couponsStore, couponIdentity), 0L, new C1222d(couponIdentity, null), 1, null));
    }

    @Deprecated
    public final io.reactivex.l<Coupon> k(Ok.c couponIdentity) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        return xv.h.d(j(couponIdentity), null, 1, null);
    }

    public final P<Map<String, Pk.b>> l() {
        return this.couponActionLoadingStateFlow;
    }

    public final io.reactivex.l<Map<String, Pk.b>> m() {
        return xv.h.d(this.couponActionLoadingStatesStore, null, 1, null);
    }

    @Deprecated
    public final u<GetAdsResponse> n() {
        return xv.n.b(this.ioDispatcher, new e(null));
    }

    public final Object o(Continuation<? super List<CouponAd>> continuation) {
        return this.couponsDataSource.e(continuation);
    }

    @Deprecated
    public final u<List<Category>> p(EnumC5609a categoryFilter) {
        Intrinsics.j(categoryFilter, "categoryFilter");
        return xv.n.b(this.ioDispatcher, new f(categoryFilter, null));
    }

    public final Object q(EnumC5609a enumC5609a, Continuation<? super List<Category>> continuation) {
        return this.couponsDataSource.f(enumC5609a, continuation);
    }

    public final InterfaceC17152f<List<Coupon>> r() {
        return this.couponsFlow;
    }

    public final Object s(LocalDate localDate, int i10, Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
        return this.couponsDataSource.i(localDate, i10, continuation);
    }

    public final io.reactivex.l<List<Coupon>> t() {
        io.reactivex.l lVarD = xv.h.d(this.couponsStore, null, 1, null);
        final Function1 function1 = new Function1() { // from class: cl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6412d.c((Map) obj);
            }
        };
        io.reactivex.l<List<Coupon>> map = lVarD.map(new Pu.o() { // from class: cl.c
            @Override // Pu.o
            public final Object apply(Object obj) {
                return C6412d.d(function1, obj);
            }
        });
        Intrinsics.i(map, "map(...)");
        return map;
    }

    @Deprecated
    public final u<SpecialOffersUrlResponse> u() {
        return xv.n.b(this.ioDispatcher, new g(null));
    }

    public final Object v(Continuation<? super String> continuation) {
        return this.couponsDataSource.j(continuation);
    }

    @Deprecated
    public final u<Response<Unit>> w(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return xv.n.b(this.ioDispatcher, new h(coupon, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(Ok.Coupon r37, kotlin.coroutines.Continuation<? super java.lang.Boolean> r38) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C6412d.x(Ok.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated
    public final u<CouponsResponse> z(CouponOptions couponOptions, boolean requireSpecialOffers, boolean showOnlySpecialOffers, boolean isShowClippedCouponOnly) {
        Intrinsics.j(couponOptions, "couponOptions");
        return xv.n.b(this.ioDispatcher, new k(couponOptions, requireSpecialOffers, showOnlySpecialOffers, isShowClippedCouponOnly, null));
    }

    public final Object H(Ok.c cVar, Continuation<? super ClipUnclipCouponResponse> continuation) {
        return C17154h.A(new p(j(cVar), this), continuation);
    }

    public final Object y(Ok.c cVar, Continuation<? super Boolean> continuation) {
        return C17154h.A(new i(j(cVar), this), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6412d(Zk.a couponsDataSource, Tq.j storeProvider, AbstractC16618K ioDispatcher) {
        this(couponsDataSource, storeProvider, ioDispatcher, CollectionsKt.m());
        Intrinsics.j(couponsDataSource, "couponsDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
    }
}
