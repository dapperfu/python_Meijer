package dl;

import Pk.Coupon;
import Sk.CouponOptions;
import al.C5698a;
import bl.EnumC6394a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.coupons.api.models.Category;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.coupons.api.models.GetAdsResponse;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import el.CouponsResponse;
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
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.C16574t;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import retrofit2.Response;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u001e2\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J;\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&H\u0007¢\u0006\u0004\b,\u0010-J6\u0010.\u001a\u00020+2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&H\u0086@¢\u0006\u0004\b.\u0010/J'\u00102\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00101\u001a\u0002002\b\b\u0002\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u0002042\u0006\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u0002042\u0006\u0010!\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b<\u00108J\u0018\u0010=\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b=\u0010:J#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120>0*2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b?\u00106J\u0018\u0010@\u001a\u00020&2\u0006\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b@\u00108J#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\b0*2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\b2\u0006\u0010B\u001a\u00020AH\u0086@¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020H0*H\u0007¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020M0*H\u0007¢\u0006\u0004\bN\u0010JJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\bH\u0086@¢\u0006\u0004\bP\u0010LJ*\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\b2\u0006\u0010R\u001a\u00020Q2\n\u0010U\u001a\u00060Sj\u0002`TH\u0086@¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R&\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u001e0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR#\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u001a8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR&\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010aR)\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e0j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR&\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010s\u001a\u0004\bp\u0010qR,\u0010w\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e0\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010s\u001a\u0004\bu\u0010q¨\u0006x"}, d2 = {"Ldl/d;", "", "Lal/a;", "couponsDataSource", "LTq/j;", "storeProvider", "Lmv/K;", "ioDispatcher", "", "LPk/a;", "initialCoupons", "<init>", "(Lal/a;LTq/j;Lmv/K;Ljava/util/List;)V", "(Lal/a;LTq/j;Lmv/K;)V", "", "couponId", "LQk/b;", "couponActionLoadingState", "", "K", "(Ljava/lang/String;LQk/b;)V", "LPk/c;", "couponIdentity", "Lio/reactivex/l;", "k", "(LPk/c;)Lio/reactivex/l;", "Lpv/f;", "j", "(LPk/c;)Lpv/f;", "coupons", "", "J", "(Ljava/util/List;)Ljava/util/Map;", "coupon", "I", "(LPk/a;)Ljava/util/Map;", "LSk/a;", "couponOptions", "", "requireSpecialOffers", "showOnlySpecialOffers", "isShowClippedCouponOnly", "Lio/reactivex/u;", "Lel/a;", "z", "(LSk/a;ZZZ)Lio/reactivex/u;", "D", "(LSk/a;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "couponsRequest", "A", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Z)Lio/reactivex/u;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "h", "(LPk/a;)Lio/reactivex/u;", "i", "(LPk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H", "(LPk/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "G", "y", "Lretrofit2/Response;", "w", "x", "Lbl/a;", "categoryFilter", "Lcom/meijer/mobile/coupons/api/models/Category;", "p", "(Lbl/a;)Lio/reactivex/u;", "q", "(Lbl/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "u", "()Lio/reactivex/u;", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;", "n", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "o", "j$/time/LocalDate", "weeklyAdStartDate", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "s", "(Lj$/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lal/a;", "b", "LTq/j;", "c", "Lmv/K;", "Lpv/B;", "d", "Lpv/B;", "couponsStore", "e", "Lpv/f;", "r", "()Lpv/f;", "couponsFlow", "f", "couponActionLoadingStatesStore", "Lpv/P;", "g", "Lpv/P;", "l", "()Lpv/P;", "couponActionLoadingStateFlow", "t", "()Lio/reactivex/l;", "getCouponsStream$annotations", "()V", "couponsStream", "m", "getCouponActionLoadingStatesStream$annotations", "couponActionLoadingStatesStream", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dl.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13702d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5698a couponsDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Map<String, Coupon>> couponsStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<List<Coupon>> couponsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Map<String, Qk.b>> couponActionLoadingStatesStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<Map<String, Qk.b>> couponActionLoadingStateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$clipCoupon$2", f = "CouponsRepository.kt", l = {313}, m = "invokeSuspend")
    /* renamed from: dl.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128589a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f128591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Coupon coupon, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f128591c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new a(this.f128591c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128589a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C13702d c13702d = C13702d.this;
            Coupon coupon = this.f128591c;
            this.f128589a = 1;
            Object objI = c13702d.i(coupon, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {333}, m = "clipCouponCRT")
    /* renamed from: dl.d$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f128592a;

        /* renamed from: b, reason: collision with root package name */
        Object f128593b;

        /* renamed from: c, reason: collision with root package name */
        Object f128594c;

        /* renamed from: d, reason: collision with root package name */
        Object f128595d;

        /* renamed from: e, reason: collision with root package name */
        Object f128596e;

        /* renamed from: f, reason: collision with root package name */
        int f128597f;

        /* renamed from: g, reason: collision with root package name */
        int f128598g;

        /* renamed from: h, reason: collision with root package name */
        int f128599h;

        /* renamed from: i, reason: collision with root package name */
        int f128600i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f128601j;

        /* renamed from: l, reason: collision with root package name */
        int f128603l;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128601j = obj;
            this.f128603l |= Integer.MIN_VALUE;
            return C13702d.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: dl.d$c */
    public static final class c implements InterfaceC16561f<Coupon> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f128604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Pk.c f128605b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: dl.d$c$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f128606a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Pk.c f128607b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$couponFlow$$inlined$map$1$2", f = "CouponsRepository.kt", l = {50}, m = "emit")
            /* renamed from: dl.d$c$a$a, reason: collision with other inner class name */
            public static final class C2023a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f128608a;

                /* renamed from: b, reason: collision with root package name */
                int f128609b;

                /* renamed from: c, reason: collision with root package name */
                Object f128610c;

                /* renamed from: e, reason: collision with root package name */
                Object f128612e;

                /* renamed from: f, reason: collision with root package name */
                Object f128613f;

                /* renamed from: g, reason: collision with root package name */
                Object f128614g;

                /* renamed from: h, reason: collision with root package name */
                int f128615h;

                public C2023a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f128608a = obj;
                    this.f128609b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, Pk.c cVar) {
                this.f128606a = interfaceC16562g;
                this.f128607b = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof dl.C13702d.c.a.C2023a
                    if (r0 == 0) goto L13
                    r0 = r8
                    dl.d$c$a$a r0 = (dl.C13702d.c.a.C2023a) r0
                    int r1 = r0.f128609b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128609b = r1
                    goto L18
                L13:
                    dl.d$c$a$a r0 = new dl.d$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f128608a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f128609b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.f128614g
                    pv.g r7 = (pv.InterfaceC16562g) r7
                    java.lang.Object r7 = r0.f128612e
                    dl.d$c$a$a r7 = (dl.C13702d.c.a.C2023a) r7
                    kotlin.ResultKt.b(r8)
                    goto L63
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.ResultKt.b(r8)
                    pv.g r8 = r6.f128606a
                    r2 = r7
                    java.util.Map r2 = (java.util.Map) r2
                    Pk.c r4 = r6.f128607b
                    long r4 = r4.getOfferId()
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    java.lang.Object r2 = kotlin.collections.MapsKt.l(r2, r4)
                    r0.f128610c = r7
                    r0.f128612e = r0
                    r0.f128613f = r7
                    r0.f128614g = r8
                    r7 = 0
                    r0.f128615h = r7
                    r0.f128609b = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r7 = kotlin.Unit.f143329a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC16561f interfaceC16561f, Pk.c cVar) {
            this.f128604a = interfaceC16561f;
            this.f128605b = cVar;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Coupon> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f128604a.collect(new a(interfaceC16562g, this.f128605b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cause", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$couponFlow$2", f = "CouponsRepository.kt", l = {125}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: dl.d$d, reason: collision with other inner class name */
    static final class C2024d extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128616a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f128617b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Pk.c f128619d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2024d(Pk.c cVar, Continuation<? super C2024d> continuation) {
            super(2, continuation);
            this.f128619d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2024d c2024d = C13702d.this.new C2024d(this.f128619d, continuation);
            c2024d.f128617b = obj;
            return c2024d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128616a;
            boolean z10 = false;
            if (i10 == 0) {
                ResultKt.b(obj);
                Throwable th2 = (Throwable) this.f128617b;
                if (th2 instanceof NoSuchElementException) {
                    C13702d c13702d = C13702d.this;
                    CouponOptions aVar = new CouponOptions(null, null, null, false, true, 0L, null, null, false, CollectionsKt.s(Boxing.e(this.f128619d.getOfferId())), null, false, true, 3567, null);
                    this.f128617b = th2;
                    this.f128616a = 1;
                    objE = C13702d.E(c13702d, aVar, false, false, false, this, 12, null);
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
            Pk.c cVar = this.f128619d;
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
            return ((C2024d) create(th2, continuation)).invokeSuspend(Unit.f143329a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$getCouponAds$1", f = "CouponsRepository.kt", l = {575}, m = "invokeSuspend")
    /* renamed from: dl.d$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super GetAdsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128620a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super GetAdsResponse> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128620a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13702d c13702d = C13702d.this;
                this.f128620a = 1;
                obj = c13702d.o(this);
                if (obj == objF) {
                    return objF;
                }
            }
            return new GetAdsResponse((List) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$getCouponCategories$1", f = "CouponsRepository.kt", l = {539}, m = "invokeSuspend")
    /* renamed from: dl.d$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends Category>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128622a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC6394a f128624c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends Category>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<Category>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(EnumC6394a enumC6394a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f128624c = enumC6394a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new f(this.f128624c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<Category>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128622a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C13702d c13702d = C13702d.this;
            EnumC6394a enumC6394a = this.f128624c;
            this.f128622a = 1;
            Object objQ = c13702d.q(enumC6394a, this);
            if (objQ == objF) {
                return objF;
            }
            return objQ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$getSpecialOffers$1", f = "CouponsRepository.kt", l = {557}, m = "invokeSuspend")
    /* renamed from: dl.d$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super SpecialOffersUrlResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128625a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super SpecialOffersUrlResponse> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128625a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13702d c13702d = C13702d.this;
                this.f128625a = 1;
                obj = c13702d.v(this);
                if (obj == objF) {
                    return objF;
                }
            }
            return new SpecialOffersUrlResponse((String) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$hideCoupon$2", f = "CouponsRepository.kt", l = {497}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: dl.d$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128627a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f128629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Coupon coupon, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f128629c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new h(this.f128629c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128627a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13702d c13702d = C13702d.this;
                Coupon coupon = this.f128629c;
                this.f128627a = 1;
                obj = c13702d.x(coupon, this);
                if (obj == objF) {
                    return objF;
                }
            }
            ((Boolean) obj).getClass();
            Response responseSuccess = Response.success(Unit.f143329a);
            Intrinsics.i(responseSuccess, "let(...)");
            return responseSuccess;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: dl.d$i */
    public static final class i implements InterfaceC16561f<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f128630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13702d f128631b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: dl.d$i$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f128632a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C13702d f128633b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$hideCouponCRT$$inlined$map$1$2", f = "CouponsRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: dl.d$i$a$a, reason: collision with other inner class name */
            public static final class C2025a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f128634a;

                /* renamed from: b, reason: collision with root package name */
                int f128635b;

                /* renamed from: c, reason: collision with root package name */
                Object f128636c;

                /* renamed from: e, reason: collision with root package name */
                Object f128638e;

                /* renamed from: f, reason: collision with root package name */
                Object f128639f;

                /* renamed from: g, reason: collision with root package name */
                Object f128640g;

                /* renamed from: h, reason: collision with root package name */
                Object f128641h;

                /* renamed from: i, reason: collision with root package name */
                Object f128642i;

                /* renamed from: j, reason: collision with root package name */
                Object f128643j;

                /* renamed from: k, reason: collision with root package name */
                int f128644k;

                /* renamed from: l, reason: collision with root package name */
                int f128645l;

                public C2025a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f128634a = obj;
                    this.f128635b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, C13702d c13702d) {
                this.f128632a = interfaceC16562g;
                this.f128633b = c13702d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof dl.C13702d.i.a.C2025a
                    if (r0 == 0) goto L13
                    r0 = r11
                    dl.d$i$a$a r0 = (dl.C13702d.i.a.C2025a) r0
                    int r1 = r0.f128635b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128635b = r1
                    goto L18
                L13:
                    dl.d$i$a$a r0 = new dl.d$i$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f128634a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f128635b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f128640g
                    pv.g r10 = (pv.InterfaceC16562g) r10
                    java.lang.Object r10 = r0.f128638e
                    dl.d$i$a$a r10 = (dl.C13702d.i.a.C2025a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f128644k
                    java.lang.Object r2 = r0.f128643j
                    Pk.a r2 = (Pk.Coupon) r2
                    java.lang.Object r2 = r0.f128642i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f128641h
                    pv.g r2 = (pv.InterfaceC16562g) r2
                    java.lang.Object r4 = r0.f128640g
                    pv.g r4 = (pv.InterfaceC16562g) r4
                    java.lang.Object r5 = r0.f128639f
                    java.lang.Object r6 = r0.f128638e
                    dl.d$i$a$a r6 = (dl.C13702d.i.a.C2025a) r6
                    java.lang.Object r7 = r0.f128636c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    pv.g r2 = r9.f128632a
                    r11 = r10
                    Pk.a r11 = (Pk.Coupon) r11
                    dl.d r5 = r9.f128633b
                    r0.f128636c = r10
                    r0.f128638e = r0
                    r0.f128639f = r10
                    r0.f128640g = r2
                    r0.f128641h = r2
                    r0.f128642i = r0
                    r0.f128643j = r11
                    r6 = 0
                    r0.f128644k = r6
                    r0.f128645l = r6
                    r0.f128635b = r4
                    java.lang.Object r11 = r5.x(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f128636c = r10
                    r0.f128638e = r7
                    r0.f128639f = r5
                    r0.f128640g = r4
                    r10 = 0
                    r0.f128641h = r10
                    r0.f128642i = r10
                    r0.f128643j = r10
                    r0.f128644k = r6
                    r0.f128635b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f143329a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.i.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public i(InterfaceC16561f interfaceC16561f, C13702d c13702d) {
            this.f128630a = interfaceC16561f;
            this.f128631b = c13702d;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Boolean> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f128630a.collect(new a(interfaceC16562g, this.f128631b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {513}, m = "hideCouponCRT")
    /* renamed from: dl.d$j */
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f128646a;

        /* renamed from: b, reason: collision with root package name */
        Object f128647b;

        /* renamed from: c, reason: collision with root package name */
        Object f128648c;

        /* renamed from: d, reason: collision with root package name */
        Object f128649d;

        /* renamed from: e, reason: collision with root package name */
        Object f128650e;

        /* renamed from: f, reason: collision with root package name */
        int f128651f;

        /* renamed from: g, reason: collision with root package name */
        int f128652g;

        /* renamed from: h, reason: collision with root package name */
        int f128653h;

        /* renamed from: i, reason: collision with root package name */
        int f128654i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f128655j;

        /* renamed from: l, reason: collision with root package name */
        int f128657l;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128655j = obj;
            this.f128657l |= Integer.MIN_VALUE;
            return C13702d.this.x(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lel/a;", "<anonymous>", "(Lmv/O;)Lel/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$loadCoupons$1", f = "CouponsRepository.kt", l = {175}, m = "invokeSuspend")
    /* renamed from: dl.d$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128658a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponOptions f128660c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f128661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f128662e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f128663f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(CouponOptions aVar, boolean z10, boolean z11, boolean z12, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f128660c = aVar;
            this.f128661d = z10;
            this.f128662e = z11;
            this.f128663f = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new k(this.f128660c, this.f128661d, this.f128662e, this.f128663f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CouponsResponse> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128658a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C13702d c13702d = C13702d.this;
            CouponOptions aVar = this.f128660c;
            boolean z10 = this.f128661d;
            boolean z11 = this.f128662e;
            boolean z12 = this.f128663f;
            this.f128658a = 1;
            Object objD = c13702d.D(aVar, z10, z11, z12, this);
            if (objD == objF) {
                return objF;
            }
            return objD;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lel/a;", "<anonymous>", "(Lmv/O;)Lel/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$loadCoupons$2", f = "CouponsRepository.kt", l = {252}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: dl.d$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128664a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponsRequest f128666c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f128667d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(CouponsRequest couponsRequest, boolean z10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f128666c = couponsRequest;
            this.f128667d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new l(this.f128666c, this.f128667d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CouponsResponse> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128664a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C5698a c5698a = C13702d.this.couponsDataSource;
                CouponsRequest couponsRequest = this.f128666c;
                boolean z10 = this.f128667d;
                this.f128664a = 1;
                obj = c5698a.h(couponsRequest, z10, this);
                if (obj == objF) {
                    return objF;
                }
            }
            C13702d c13702d = C13702d.this;
            List<Coupon> listF = ((CouponsResponse) obj).f();
            if (listF == null) {
                listF = CollectionsKt.m();
            }
            c13702d.J(listF);
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 225, 230}, m = "loadCouponsCRT")
    /* renamed from: dl.d$m */
    static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f128668a;

        /* renamed from: b, reason: collision with root package name */
        Object f128669b;

        /* renamed from: c, reason: collision with root package name */
        Object f128670c;

        /* renamed from: d, reason: collision with root package name */
        Object f128671d;

        /* renamed from: e, reason: collision with root package name */
        boolean f128672e;

        /* renamed from: f, reason: collision with root package name */
        boolean f128673f;

        /* renamed from: g, reason: collision with root package name */
        boolean f128674g;

        /* renamed from: h, reason: collision with root package name */
        int f128675h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f128676i;

        /* renamed from: k, reason: collision with root package name */
        int f128678k;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128676i = obj;
            this.f128678k |= Integer.MIN_VALUE;
            return C13702d.this.D(null, false, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: dl.d$n */
    public static final class n implements InterfaceC16561f<List<? extends Coupon>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f128679a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: dl.d$n$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f128680a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$special$$inlined$map$1$2", f = "CouponsRepository.kt", l = {50}, m = "emit")
            /* renamed from: dl.d$n$a$a, reason: collision with other inner class name */
            public static final class C2026a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f128681a;

                /* renamed from: b, reason: collision with root package name */
                int f128682b;

                /* renamed from: c, reason: collision with root package name */
                Object f128683c;

                /* renamed from: e, reason: collision with root package name */
                Object f128685e;

                /* renamed from: f, reason: collision with root package name */
                Object f128686f;

                /* renamed from: g, reason: collision with root package name */
                Object f128687g;

                /* renamed from: h, reason: collision with root package name */
                int f128688h;

                public C2026a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f128681a = obj;
                    this.f128682b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f128680a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof dl.C13702d.n.a.C2026a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dl.d$n$a$a r0 = (dl.C13702d.n.a.C2026a) r0
                    int r1 = r0.f128682b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128682b = r1
                    goto L18
                L13:
                    dl.d$n$a$a r0 = new dl.d$n$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f128681a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f128682b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f128687g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f128685e
                    dl.d$n$a$a r5 = (dl.C13702d.n.a.C2026a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5f
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f128680a
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    java.util.Collection r2 = r2.values()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.List r2 = kotlin.collections.CollectionsKt.j1(r2)
                    r0.f128683c = r5
                    r0.f128685e = r0
                    r0.f128686f = r5
                    r0.f128687g = r6
                    r5 = 0
                    r0.f128688h = r5
                    r0.f128682b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public n(InterfaceC16561f interfaceC16561f) {
            this.f128679a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super List<? extends Coupon>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f128679a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$unclipCoupon$2", f = "CouponsRepository.kt", l = {HttpResponseStatus.ERROR_REQUEST_TIMEOUT}, m = "invokeSuspend")
    /* renamed from: dl.d$o */
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f128689a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f128691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Coupon coupon, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f128691c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13702d.this.new o(this.f128691c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f128689a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C13702d c13702d = C13702d.this;
            Coupon coupon = this.f128691c;
            this.f128689a = 1;
            Object objG = c13702d.G(coupon, this);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: dl.d$p */
    public static final class p implements InterfaceC16561f<ClipUnclipCouponResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f128692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13702d f128693b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: dl.d$p$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f128694a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C13702d f128695b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository$unclipCouponCRT$$inlined$map$1$2", f = "CouponsRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: dl.d$p$a$a, reason: collision with other inner class name */
            public static final class C2027a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f128696a;

                /* renamed from: b, reason: collision with root package name */
                int f128697b;

                /* renamed from: c, reason: collision with root package name */
                Object f128698c;

                /* renamed from: e, reason: collision with root package name */
                Object f128700e;

                /* renamed from: f, reason: collision with root package name */
                Object f128701f;

                /* renamed from: g, reason: collision with root package name */
                Object f128702g;

                /* renamed from: h, reason: collision with root package name */
                Object f128703h;

                /* renamed from: i, reason: collision with root package name */
                Object f128704i;

                /* renamed from: j, reason: collision with root package name */
                Object f128705j;

                /* renamed from: k, reason: collision with root package name */
                int f128706k;

                /* renamed from: l, reason: collision with root package name */
                int f128707l;

                public C2027a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f128696a = obj;
                    this.f128697b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, C13702d c13702d) {
                this.f128694a = interfaceC16562g;
                this.f128695b = c13702d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof dl.C13702d.p.a.C2027a
                    if (r0 == 0) goto L13
                    r0 = r11
                    dl.d$p$a$a r0 = (dl.C13702d.p.a.C2027a) r0
                    int r1 = r0.f128697b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128697b = r1
                    goto L18
                L13:
                    dl.d$p$a$a r0 = new dl.d$p$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f128696a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f128697b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f128702g
                    pv.g r10 = (pv.InterfaceC16562g) r10
                    java.lang.Object r10 = r0.f128700e
                    dl.d$p$a$a r10 = (dl.C13702d.p.a.C2027a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f128706k
                    java.lang.Object r2 = r0.f128705j
                    Pk.a r2 = (Pk.Coupon) r2
                    java.lang.Object r2 = r0.f128704i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f128703h
                    pv.g r2 = (pv.InterfaceC16562g) r2
                    java.lang.Object r4 = r0.f128702g
                    pv.g r4 = (pv.InterfaceC16562g) r4
                    java.lang.Object r5 = r0.f128701f
                    java.lang.Object r6 = r0.f128700e
                    dl.d$p$a$a r6 = (dl.C13702d.p.a.C2027a) r6
                    java.lang.Object r7 = r0.f128698c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    pv.g r2 = r9.f128694a
                    r11 = r10
                    Pk.a r11 = (Pk.Coupon) r11
                    dl.d r5 = r9.f128695b
                    r0.f128698c = r10
                    r0.f128700e = r0
                    r0.f128701f = r10
                    r0.f128702g = r2
                    r0.f128703h = r2
                    r0.f128704i = r0
                    r0.f128705j = r11
                    r6 = 0
                    r0.f128706k = r6
                    r0.f128707l = r6
                    r0.f128697b = r4
                    java.lang.Object r11 = r5.G(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f128698c = r10
                    r0.f128700e = r7
                    r0.f128701f = r5
                    r0.f128702g = r4
                    r10 = 0
                    r0.f128703h = r10
                    r0.f128704i = r10
                    r0.f128705j = r10
                    r0.f128706k = r6
                    r0.f128697b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f143329a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.p.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public p(InterfaceC16561f interfaceC16561f, C13702d c13702d) {
            this.f128692a = interfaceC16561f;
            this.f128693b = c13702d;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super ClipUnclipCouponResponse> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f128692a.collect(new a(interfaceC16562g, this.f128693b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.domain.CouponsRepository", f = "CouponsRepository.kt", l = {428}, m = "unclipCouponCRT")
    /* renamed from: dl.d$q */
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f128708a;

        /* renamed from: b, reason: collision with root package name */
        Object f128709b;

        /* renamed from: c, reason: collision with root package name */
        Object f128710c;

        /* renamed from: d, reason: collision with root package name */
        Object f128711d;

        /* renamed from: e, reason: collision with root package name */
        Object f128712e;

        /* renamed from: f, reason: collision with root package name */
        int f128713f;

        /* renamed from: g, reason: collision with root package name */
        int f128714g;

        /* renamed from: h, reason: collision with root package name */
        int f128715h;

        /* renamed from: i, reason: collision with root package name */
        int f128716i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f128717j;

        /* renamed from: l, reason: collision with root package name */
        int f128719l;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128717j = obj;
            this.f128719l |= Integer.MIN_VALUE;
            return C13702d.this.G(null, this);
        }
    }

    public C13702d(C5698a couponsDataSource, Tq.j storeProvider, AbstractC15779K ioDispatcher, List<Coupon> initialCoupons) {
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
        InterfaceC16549B<Map<String, Coupon>> interfaceC16549BA = S.a(linkedHashMap);
        this.couponsStore = interfaceC16549BA;
        this.couponsFlow = C16563h.r(new n(C16563h.c(interfaceC16549BA)));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pairA = TuplesKt.a(String.valueOf(((Coupon) it.next()).getOfferId()), Qk.b.f31033b);
            linkedHashMap2.put(pairA.c(), pairA.d());
        }
        InterfaceC16549B<Map<String, Qk.b>> interfaceC16549BA2 = S.a(linkedHashMap2);
        this.couponActionLoadingStatesStore = interfaceC16549BA2;
        this.couponActionLoadingStateFlow = C16563h.c(interfaceC16549BA2);
    }

    public static /* synthetic */ u B(C13702d c13702d, CouponOptions aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        return c13702d.z(aVar, z10, z11, z12);
    }

    public static /* synthetic */ u C(C13702d c13702d, CouponsRequest couponsRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c13702d.A(couponsRequest, z10);
    }

    public static /* synthetic */ Object E(C13702d c13702d, CouponOptions aVar, boolean z10, boolean z11, boolean z12, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c13702d.D(aVar, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String couponId, Qk.b couponActionLoadingState) {
        Map<String, Qk.b> value;
        InterfaceC16549B<Map<String, Qk.b>> interfaceC16549B = this.couponActionLoadingStatesStore;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, MapsKt.v(value, TuplesKt.a(couponId, couponActionLoadingState))));
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
        return tv.n.b(this.ioDispatcher, new l(couponsRequest, requireSpecialOffers, null));
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
    public final java.lang.Object D(Sk.CouponOptions r26, boolean r27, boolean r28, boolean r29, kotlin.coroutines.Continuation<? super el.CouponsResponse> r30) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.D(Sk.a, boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated
    public final u<ClipUnclipCouponResponse> F(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return tv.n.b(this.ioDispatcher, new o(coupon, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(Pk.Coupon r37, kotlin.coroutines.Continuation<? super com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse> r38) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.G(Pk.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Map<String, Coupon> I(Coupon coupon) {
        Map<String, Coupon> value;
        Map<String, Coupon> mapV;
        Intrinsics.j(coupon, "coupon");
        InterfaceC16549B<Map<String, Coupon>> interfaceC16549B = this.couponsStore;
        do {
            value = interfaceC16549B.getValue();
            mapV = MapsKt.v(value, TuplesKt.a(String.valueOf(coupon.getOfferId()), coupon));
        } while (!interfaceC16549B.e(value, mapV));
        return mapV;
    }

    public final Map<String, Coupon> J(List<Coupon> coupons) {
        Map<String, Coupon> value;
        Map<String, Coupon> mapU;
        Intrinsics.j(coupons, "coupons");
        InterfaceC16549B<Map<String, Coupon>> interfaceC16549B = this.couponsStore;
        do {
            value = interfaceC16549B.getValue();
            Map<String, Coupon> map = value;
            List<Coupon> list = coupons;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(String.valueOf(((Coupon) obj).getOfferId()), obj);
            }
            mapU = MapsKt.u(map, linkedHashMap);
        } while (!interfaceC16549B.e(value, mapU));
        return mapU;
    }

    @Deprecated
    public final u<ClipUnclipCouponResponse> h(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return tv.n.b(this.ioDispatcher, new a(coupon, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(Pk.Coupon r37, kotlin.coroutines.Continuation<? super com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse> r38) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.i(Pk.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC16561f<Coupon> j(Pk.c couponIdentity) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        return C16563h.r(C16574t.f(new c(this.couponsStore, couponIdentity), 0L, new C2024d(couponIdentity, null), 1, null));
    }

    @Deprecated
    public final io.reactivex.l<Coupon> k(Pk.c couponIdentity) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        return tv.h.d(j(couponIdentity), null, 1, null);
    }

    public final P<Map<String, Qk.b>> l() {
        return this.couponActionLoadingStateFlow;
    }

    public final io.reactivex.l<Map<String, Qk.b>> m() {
        return tv.h.d(this.couponActionLoadingStatesStore, null, 1, null);
    }

    @Deprecated
    public final u<GetAdsResponse> n() {
        return tv.n.b(this.ioDispatcher, new e(null));
    }

    public final Object o(Continuation<? super List<CouponAd>> continuation) {
        return this.couponsDataSource.e(continuation);
    }

    @Deprecated
    public final u<List<Category>> p(EnumC6394a categoryFilter) {
        Intrinsics.j(categoryFilter, "categoryFilter");
        return tv.n.b(this.ioDispatcher, new f(categoryFilter, null));
    }

    public final Object q(EnumC6394a enumC6394a, Continuation<? super List<Category>> continuation) {
        return this.couponsDataSource.f(enumC6394a, continuation);
    }

    public final InterfaceC16561f<List<Coupon>> r() {
        return this.couponsFlow;
    }

    public final Object s(LocalDate localDate, int i10, Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
        return this.couponsDataSource.i(localDate, i10, continuation);
    }

    public final io.reactivex.l<List<Coupon>> t() {
        io.reactivex.l lVarD = tv.h.d(this.couponsStore, null, 1, null);
        final Function1 function1 = new Function1() { // from class: dl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13702d.c((Map) obj);
            }
        };
        io.reactivex.l<List<Coupon>> map = lVarD.map(new Lu.o() { // from class: dl.c
            @Override // Lu.o
            public final Object apply(Object obj) {
                return C13702d.d(function1, obj);
            }
        });
        Intrinsics.i(map, "map(...)");
        return map;
    }

    @Deprecated
    public final u<SpecialOffersUrlResponse> u() {
        return tv.n.b(this.ioDispatcher, new g(null));
    }

    public final Object v(Continuation<? super String> continuation) {
        return this.couponsDataSource.j(continuation);
    }

    @Deprecated
    public final u<Response<Unit>> w(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return tv.n.b(this.ioDispatcher, new h(coupon, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(Pk.Coupon r37, kotlin.coroutines.Continuation<? super java.lang.Boolean> r38) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.C13702d.x(Pk.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated
    public final u<CouponsResponse> z(CouponOptions couponOptions, boolean requireSpecialOffers, boolean showOnlySpecialOffers, boolean isShowClippedCouponOnly) {
        Intrinsics.j(couponOptions, "couponOptions");
        return tv.n.b(this.ioDispatcher, new k(couponOptions, requireSpecialOffers, showOnlySpecialOffers, isShowClippedCouponOnly, null));
    }

    public final Object H(Pk.c cVar, Continuation<? super ClipUnclipCouponResponse> continuation) {
        return C16563h.A(new p(j(cVar), this), continuation);
    }

    public final Object y(Pk.c cVar, Continuation<? super Boolean> continuation) {
        return C16563h.A(new i(j(cVar), this), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13702d(C5698a couponsDataSource, Tq.j storeProvider, AbstractC15779K ioDispatcher) {
        this(couponsDataSource, storeProvider, ioDispatcher, CollectionsKt.m());
        Intrinsics.j(couponsDataSource, "couponsDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
    }
}
