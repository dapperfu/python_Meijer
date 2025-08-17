package Xk;

import Fq.ShoppingListStore;
import Ok.Coupon;
import Qo.l;
import cl.C6412d;
import ej.ShoppingCart;
import io.reactivex.y;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C17342j;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import np.C15917b;
import qv.AbstractC16618K;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\u00150\u00172\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R'\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R1\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\u00150\u0017028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<0;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010?R&\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0\u00170D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001a0;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010?R \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001a0;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010?R&\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001a0O8FX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010QR\u001d\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001a0;8F¢\u0006\u0006\u001a\u0004\bU\u0010?¨\u0006W"}, d2 = {"LXk/u;", "", "LCs/b;", "userProvider", "LTq/j;", "storeProvider", "Lcl/d;", "couponsRepository", "LEq/b;", "shoppingListRepository", "Lnp/b;", "productQueryDataSource", "Lhl/m;", "cartRepository", "Lqv/K;", "ioDispatcher", "<init>", "(LCs/b;LTq/j;Lcl/d;LEq/b;Lnp/b;Lhl/m;Lqv/K;)V", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "LXk/b;", "associatedProductsState", "", "T", "(JLXk/b;)Ljava/util/Map;", "", "LOk/c;", "list", "", "S", "(Ljava/util/List;)V", "R", "LNu/b;", "t", "()LNu/b;", "a", "LCs/b;", "b", "LTq/j;", "c", "Lcl/d;", "d", "LEq/b;", "e", "Lnp/b;", "f", "Lhl/m;", "g", "Lqv/K;", "Ltv/B;", "h", "Lkotlin/Lazy;", "N", "()Ltv/B;", "couponsStore", "i", "I", "associatedProductsStore", "Ltv/f;", "Ltk/c;", "Lej/C;", "K", "()Ltv/f;", "cartFlow", "LFq/e;", "P", "shoppingListFlow", "Ltv/P;", "", "LPk/b;", "L", "()Ltv/P;", "couponLoadingStatesFlow", "LXk/c;", "J", "authenticatedCouponsFlow", "Q", "unauthenticatedCouponsFlow", "Lio/reactivex/l;", "O", "()Lio/reactivex/l;", "getCouponsStream$annotations", "()V", "couponsStream", "M", "couponsFlow", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C15917b productQueryDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponsStore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy associatedProductsStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LQo/l$c;", "<anonymous>", "(Lqv/O;)LQo/l$c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.state.CouponStateRepository$enableAssociatedProducts$5$1", f = "CouponStateRepository.kt", l = {130}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super l.Coupon>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39453a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ok.c f39455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ok.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f39455c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return u.this.new a(this.f39455c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super l.Coupon> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f39453a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C15917b c15917b = u.this.productQueryDataSource;
            Ok.c cVar = this.f39455c;
            Intrinsics.g(cVar);
            l.Coupon coupon = new l.Coupon(cVar, 0, 0, null, false, null, 62, null);
            this.f39453a = 1;
            Object objA = c15917b.a(coupon, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements InterfaceC17152f<List<? extends CouponState>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f[] f39456a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<Object[]> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f[] f39457a;

            public a(InterfaceC17152f[] interfaceC17152fArr) {
                this.f39457a = interfaceC17152fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f39457a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Ltv/g;", "", "it", "", "<anonymous>", "(Ltv/g;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.state.CouponStateRepository$special$$inlined$combine$1$3", f = "CouponStateRepository.kt", l = {234}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: Xk.u$b$b, reason: collision with other inner class name */
        public static final class C0847b extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends CouponState>>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f39458a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f39459b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f39460c;

            public C0847b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super List<? extends CouponState>> interfaceC17153g, Object[] objArr, Continuation<? super Unit> continuation) {
                C0847b c0847b = new C0847b(continuation);
                c0847b.f39459b = interfaceC17153g;
                c0847b.f39460c = objArr;
                return c0847b.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f39458a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f39459b;
                    Object[] objArr = (Object[]) this.f39460c;
                    Object obj2 = objArr[0];
                    Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.coupon.model.common.Coupon>");
                    List list = (List) obj2;
                    Object obj3 = objArr[1];
                    Intrinsics.h(obj3, "null cannot be cast to non-null type com.meijer.mobile.store.model.common.StoreSummary");
                    Tq.k kVar = (Tq.k) obj3;
                    Object obj4 = objArr[2];
                    Intrinsics.h(obj4, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.coupon.model.common.CouponIdentity>");
                    Object obj5 = objArr[3];
                    Intrinsics.h(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, com.meijer.mobile.coupon.state.AssociatedProductsState>");
                    Map map = (Map) obj5;
                    Object obj6 = objArr[4];
                    Intrinsics.h(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.meijer.mobile.coupon.model.common.action.CouponActionLoadingState>");
                    Map map2 = (Map) obj6;
                    Object obj7 = objArr[5];
                    Intrinsics.h(obj7, "null cannot be cast to non-null type com.meijer.mobile.shoppinglist.domain.models.ShoppingListStore");
                    ShoppingListStore shoppingListStore = (ShoppingListStore) obj7;
                    Object obj8 = objArr[6];
                    Intrinsics.h(obj8, "null cannot be cast to non-null type com.meijer.mobile.core.util.content.Resource<com.meijer.mobile.cart.model.common.ShoppingCart>");
                    tk.c cVar = (tk.c) obj8;
                    List list2 = (List) obj4;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.e(((Ok.c) it.next()).getOfferId()));
                    }
                    List<CouponState> listB = d.b(Ok.e.b(list, arrayList), shoppingListStore, (ShoppingCart) cVar.a(), kVar, map, map2);
                    this.f39459b = interfaceC17153g;
                    this.f39460c = objArr;
                    this.f39458a = 1;
                    if (interfaceC17153g.emit(listB, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        public b(InterfaceC17152f[] interfaceC17152fArr) {
            this.f39456a = interfaceC17152fArr;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super List<? extends CouponState>> interfaceC17153g, Continuation continuation) {
            InterfaceC17152f[] interfaceC17152fArr = this.f39456a;
            Object objA = C17342j.a(interfaceC17153g, interfaceC17152fArr, new a(interfaceC17152fArr), new C0847b(null), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0005H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "LOk/a;", "availableCoupons", "LOk/c;", "couponIds", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "LXk/b;", "associatedProducts", "", "LPk/b;", "couponActionLoadingStates", "LXk/c;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.state.CouponStateRepository$unauthenticatedCouponsFlow$1", f = "CouponStateRepository.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function5<List<? extends Coupon>, List<? extends Ok.c>, Map<Long, ? extends AssociatedProductsState>, Map<String, ? extends Pk.b>, Continuation<? super List<? extends CouponState>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39461a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39462b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f39463c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f39464d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f39465e;

        c(Continuation<? super c> continuation) {
            super(5, continuation);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object m(List<Coupon> list, List<? extends Ok.c> list2, Map<Long, AssociatedProductsState> map, Map<String, ? extends Pk.b> map2, Continuation<? super List<CouponState>> continuation) {
            c cVar = new c(continuation);
            cVar.f39462b = list;
            cVar.f39463c = list2;
            cVar.f39464d = map;
            cVar.f39465e = map2;
            return cVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f39461a == 0) {
                ResultKt.b(obj);
                List list = (List) this.f39462b;
                List list2 = (List) this.f39463c;
                Map map = (Map) this.f39464d;
                Map map2 = (Map) this.f39465e;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boxing.e(((Ok.c) it.next()).getOfferId()));
                }
                return d.c(Ok.e.b(list, arrayList), null, null, null, map, map2, 7, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        return ((AssociatedProductsState) pair.b()) == null;
    }

    public u(Cs.b userProvider, Tq.j storeProvider, C6412d couponsRepository, Eq.b shoppingListRepository, C15917b productQueryDataSource, hl.m cartRepository, AbstractC16618K ioDispatcher) {
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(productQueryDataSource, "productQueryDataSource");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userProvider = userProvider;
        this.storeProvider = storeProvider;
        this.couponsRepository = couponsRepository;
        this.shoppingListRepository = shoppingListRepository;
        this.productQueryDataSource = productQueryDataSource;
        this.cartRepository = cartRepository;
        this.ioDispatcher = ioDispatcher;
        this.couponsStore = LazyKt.b(new Function0() { // from class: Xk.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.s();
            }
        });
        this.associatedProductsStore = LazyKt.b(new Function0() { // from class: Xk.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Throwable th2) {
        uw.a.INSTANCE.f(th2, "Unexpected error while monitoring associated products", new Object[0]);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable D(List it) {
        Intrinsics.j(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable E(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (Iterable) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair F(Ok.c coupon, Map productStore) {
        Intrinsics.j(coupon, "coupon");
        Intrinsics.j(productStore, "productStore");
        return TuplesKt.a(coupon, productStore.get(Long.valueOf(coupon.getOfferId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair G(Function2 function2, Object p02, Object p12) {
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        return (Pair) function2.invoke(p02, p12);
    }

    private final InterfaceC17140B<Map<Long, AssociatedProductsState>> I() {
        return (InterfaceC17140B) this.associatedProductsStore.getValue();
    }

    private final InterfaceC17152f<List<CouponState>> J() {
        return C17154h.r(new b(new InterfaceC17152f[]{C17154h.r(this.couponsRepository.r()), this.storeProvider.c(), N(), I(), L(), C17154h.r(P()), C17154h.r(K())}));
    }

    private final InterfaceC17152f<tk.c<ShoppingCart>> K() {
        return this.cartRepository.d();
    }

    private final P<Map<String, Pk.b>> L() {
        return this.couponsRepository.l();
    }

    private final InterfaceC17140B<List<Ok.c>> N() {
        return (InterfaceC17140B) this.couponsStore.getValue();
    }

    private final InterfaceC17152f<ShoppingListStore> P() {
        return this.shoppingListRepository.h();
    }

    private final InterfaceC17152f<List<CouponState>> Q() {
        return C17154h.r(C17154h.n(C17154h.r(this.couponsRepository.r()), N(), I(), L(), new c(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y v(u uVar, Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        Object objA = pair.a();
        Intrinsics.i(objA, "component1(...)");
        Ok.c cVar = (Ok.c) objA;
        uVar.T(cVar.getOfferId(), new AssociatedProductsState(Xk.a.f39413e, CollectionsKt.m()));
        return io.reactivex.u.i(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y w(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (y) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y x(u uVar, Ok.c coupon) {
        Intrinsics.j(coupon, "coupon");
        return xv.n.b(uVar.ioDispatcher, uVar.new a(coupon, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y y(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (y) function1.invoke(p02);
    }

    public final InterfaceC17152f<List<CouponState>> M() {
        boolean zB = this.userProvider.b();
        if (zB) {
            return J();
        }
        if (zB) {
            throw new NoWhenBranchMatchedException();
        }
        return Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(List<? extends Ok.c> list) {
        Intrinsics.j(list, "list");
        InterfaceC17140B<List<Ok.c>> interfaceC17140BN = N();
        while (!interfaceC17140BN.e(interfaceC17140BN.getValue(), list)) {
        }
    }

    public final void S(List<? extends Ok.c> list) {
        List<Ok.c> value;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Intrinsics.j(list, "list");
        InterfaceC17140B<List<Ok.c>> interfaceC17140BN = N();
        do {
            value = interfaceC17140BN.getValue();
            List<Ok.c> list2 = value;
            linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list2, 10)), 16));
            for (Object obj : list2) {
                linkedHashMap.put(Long.valueOf(((Ok.c) obj).getOfferId()), obj);
            }
            List<? extends Ok.c> list3 = list;
            linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list3, 10)), 16));
            for (Object obj2 : list3) {
                linkedHashMap2.put(Long.valueOf(((Ok.c) obj2).getOfferId()), obj2);
            }
        } while (!interfaceC17140BN.e(value, CollectionsKt.j1(MapsKt.u(linkedHashMap, linkedHashMap2).values())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final Map<Long, AssociatedProductsState> T(long offerId, AssociatedProductsState associatedProductsState) {
        Map<Long, AssociatedProductsState> value;
        Map<Long, AssociatedProductsState> mapU;
        InterfaceC17140B<Map<Long, AssociatedProductsState>> interfaceC17140BI = I();
        do {
            value = interfaceC17140BI.getValue();
            mapU = MapsKt.u(value, MapsKt.g(TuplesKt.a(Long.valueOf(offerId), associatedProductsState)));
        } while (!interfaceC17140BI.e(value, mapU));
        return mapU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17140B r() {
        return S.a(MapsKt.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17140B s() {
        return S.a(CollectionsKt.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(u uVar, l.Coupon coupon) {
        Xk.a aVar;
        if (coupon.getError() != null) {
            uw.a.INSTANCE.f(coupon.getError(), "Failed to load related products for coupon " + coupon.getCoupon().getOfferId(), new Object[0]);
        }
        long offerId = coupon.getCoupon().getOfferId();
        if (coupon.j()) {
            aVar = Xk.a.f39412d;
        } else {
            aVar = Xk.a.f39411c;
        }
        uVar.T(offerId, new AssociatedProductsState(aVar, coupon.f()));
        return Unit.f142422a;
    }

    public final io.reactivex.l<List<CouponState>> O() {
        return xv.h.d(M(), null, 1, null);
    }

    @Deprecated
    public final Nu.b t() {
        io.reactivex.l lVarDistinctUntilChanged = xv.h.d(N(), null, 1, null).distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: Xk.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.D((List) obj);
            }
        };
        io.reactivex.l lVarFlatMapIterable = lVarDistinctUntilChanged.flatMapIterable(new Pu.o() { // from class: Xk.r
            @Override // Pu.o
            public final Object apply(Object obj) {
                return u.E(function1, obj);
            }
        });
        io.reactivex.l lVarD = xv.h.d(I(), null, 1, null);
        final Function2 function2 = new Function2() { // from class: Xk.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return u.F((Ok.c) obj, (Map) obj2);
            }
        };
        io.reactivex.l lVarWithLatestFrom = lVarFlatMapIterable.withLatestFrom(lVarD, new Pu.c() { // from class: Xk.t
            @Override // Pu.c
            public final Object apply(Object obj, Object obj2) {
                return u.G(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: Xk.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u.H((Pair) obj));
            }
        };
        io.reactivex.l lVarFilter = lVarWithLatestFrom.filter(new Pu.q() { // from class: Xk.g
            @Override // Pu.q
            public final boolean test(Object obj) {
                return u.u(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: Xk.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.v(this.f39435a, (Pair) obj);
            }
        };
        io.reactivex.l lVarFlatMapSingle = lVarFilter.flatMapSingle(new Pu.o() { // from class: Xk.i
            @Override // Pu.o
            public final Object apply(Object obj) {
                return u.w(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: Xk.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.x(this.f39437a, (Ok.c) obj);
            }
        };
        io.reactivex.l lVarSubscribeOn = lVarFlatMapSingle.flatMapSingle(new Pu.o() { // from class: Xk.k
            @Override // Pu.o
            public final Object apply(Object obj) {
                return u.y(function14, obj);
            }
        }).subscribeOn(C14764a.b());
        final Function1 function15 = new Function1() { // from class: Xk.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.z(this.f39439a, (l.Coupon) obj);
            }
        };
        Pu.g gVar = new Pu.g() { // from class: Xk.o
            @Override // Pu.g
            public final void accept(Object obj) {
                u.A(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: Xk.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.B((Throwable) obj);
            }
        };
        Nu.b bVarSubscribe = lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: Xk.q
            @Override // Pu.g
            public final void accept(Object obj) {
                u.C(function16, obj);
            }
        });
        Intrinsics.i(bVarSubscribe, "subscribe(...)");
        return bVarSubscribe;
    }
}
