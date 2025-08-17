package Ps;

import Fq.ShoppingListItem;
import Fq.ShoppingListStore;
import Gs.WeeklyAdDetailsCouponState;
import Js.WeeklyAdItem;
import Oj.a;
import Ok.Coupon;
import Pk.a;
import Rk.CouponOptions;
import Xk.CouponState;
import ak.AbstractC5607a;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import cl.C6412d;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.CouponsResponse;
import iv.C14764a;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;
import uw.a;
import vk.C17590a;
import zs.C18570a;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006kmo!hfBC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00172\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0014H\u0002¢\u0006\u0004\b&\u0010\u0019J\u0019\u0010'\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b'\u0010\u001fJ\u0019\u0010(\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b(\u0010\u001fJ\u001d\u0010+\u001a\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014H\u0002¢\u0006\u0004\b+\u0010\u0019J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00103J\u0017\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u00172\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0014H\u0002¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\b@\u0010\u001bJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00172\u0006\u00106\u001a\u00020 H\u0002¢\u0006\u0004\bE\u0010#J3\u0010L\u001a\u00020\u00172\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010J\u001a\u00020I2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002090\u0014¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00172\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010S\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u00172\u0006\u0010S\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\\\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010G\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010H\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020w0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020w0\u0080\u00018\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020|0\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"LPs/e;", "Landroidx/lifecycle/c0;", "", "Landroidx/lifecycle/f;", "LEq/b;", "shoppingListRepository", "LLs/b;", "getFlippWeeklyAdProductDetailsCall", "Lcl/d;", "couponsRepository", "LXk/u;", "couponStateRepository", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lqv/K;", "ioDispatcher", "<init>", "(LEq/b;LLs/b;Lcl/d;LXk/u;Lyo/k;LTq/j;Lqv/K;)V", "", "LOj/a;", "loadingStates", "", "onLoadingStates", "(Ljava/util/List;)V", "i0", "()V", "LJs/b;", "weeklyAdItem", "b0", "(LJs/b;)V", "", "e", "c0", "(Ljava/lang/Throwable;)V", "LFq/c;", "shoppingList", "g0", "Y", "h0", "LXk/c;", "couponStateList", "onCouponState", "LOk/c;", "couponIdentity", "j0", "(LOk/c;)V", "LOk/a;", "coupon", "O", "(LOk/a;)V", "a0", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "exception", "Z", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;)V", "", "relatedOfferIds", "P", "Ldl/a;", "couponsResponse", "f0", "(Ldl/a;)V", "S", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "response", "d0", "(Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;)V", "e0", "", "weeklyAdItemId", "publicationId", "", "isFromShoppingList", "relatedOffersIds", "V", "(IIZLjava/util/List;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "LPs/e$i;", "action", "X", "(LPs/e$i;)V", "LPk/a;", "onAction", "(LPk/a;)V", "LPs/e$e;", "W", "(LPs/e$e;)V", "onCleared", "a", "LEq/b;", "b", "LLs/b;", "c", "Lcl/d;", "d", "LXk/u;", "Lyo/k;", "f", "LTq/j;", "g", "Lqv/K;", "LPs/e$h;", "h", "LPs/e$h;", "i", "LOj/c;", "j", "LOj/c;", "loadingStateManager", "LNu/a;", "k", "LNu/a;", "disposables", "Ltv/B;", "LPs/e$j;", "l", "Ltv/B;", "_viewState", "Ltv/A;", "LPs/e$g;", "m", "Ltv/A;", "_effectsFlow", "Ltv/P;", "n", "Ltv/P;", "U", "()Ltv/P;", "viewState", "Ltv/F;", "T", "()Ltv/F;", "effectFlow", "o", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e extends c0 implements InterfaceC6015f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f29025p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ls.b getFlippWeeklyAdProductDetailsCall;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Xk.u couponStateRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private LockedInt weeklyAdItemId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private LockedInt publicationId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Oj.c loadingStateManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<g> _effectsFlow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onResume$1", f = "WeeklyAdDetailViewModel.kt", l = {152}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class A extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29040a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFq/e;", "it", "", "<anonymous>", "(LFq/e;)Z"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onResume$1$1", f = "WeeklyAdDetailViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<ShoppingListStore, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29042a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f29043b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29043b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f29043b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ShoppingListStore shoppingListStore, Continuation<? super Boolean> continuation) {
                return ((a) create(shoppingListStore, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f29042a == 0) {
                    ResultKt.b(obj);
                    if (this.f29043b.U().getValue().getWeeklyAdItem() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boxing.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        A(Continuation<? super A> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new A(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29040a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<ShoppingListStore> interfaceC17152fH = e.this.shoppingListRepository.h();
                a aVar = new a(e.this, null);
                this.f29040a = 1;
                obj = C17154h.D(interfaceC17152fH, aVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            ShoppingListStore shoppingListStore = (ShoppingListStore) obj;
            if (shoppingListStore != null) {
                e.this.g0(shoppingListStore.c());
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onResume$2", f = "WeeklyAdDetailViewModel.kt", l = {159}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29044a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29044a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Eq.b bVar = e.this.shoppingListRepository;
                this.f29044a = 1;
                if (bVar.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$refreshData$2", f = "WeeklyAdDetailViewModel.kt", l = {178}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class C extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29046a;

        /* renamed from: b, reason: collision with root package name */
        Object f29047b;

        /* renamed from: c, reason: collision with root package name */
        Object f29048c;

        /* renamed from: d, reason: collision with root package name */
        Object f29049d;

        /* renamed from: e, reason: collision with root package name */
        int f29050e;

        /* renamed from: f, reason: collision with root package name */
        int f29051f;

        /* renamed from: g, reason: collision with root package name */
        int f29052g;

        /* renamed from: h, reason: collision with root package name */
        int f29053h;

        /* renamed from: i, reason: collision with root package name */
        int f29054i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29055j;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C c10 = e.this.new C(continuation);
            c10.f29055j = obj;
            return c10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29054i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29055j;
                    e eVar = e.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ls.b bVar = eVar.getFlippWeeklyAdProductDetailsCall;
                    LockedInt lockedInt = eVar.weeklyAdItemId;
                    LockedInt lockedInt2 = null;
                    if (lockedInt == null) {
                        Intrinsics.y("weeklyAdItemId");
                        lockedInt = null;
                    }
                    int value = lockedInt.getValue();
                    LockedInt lockedInt3 = eVar.publicationId;
                    if (lockedInt3 == null) {
                        Intrinsics.y("publicationId");
                    } else {
                        lockedInt2 = lockedInt3;
                    }
                    int value2 = lockedInt2.getValue();
                    this.f29055j = interfaceC16622O;
                    this.f29046a = interfaceC16622O;
                    this.f29047b = this;
                    this.f29048c = this;
                    this.f29049d = interfaceC16622O;
                    this.f29050e = 0;
                    this.f29051f = 0;
                    this.f29052g = 0;
                    this.f29053h = 0;
                    this.f29054i = 1;
                    obj = bVar.c(value, value2, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e eVar2 = e.this;
            if (Result.h(objB)) {
                eVar2.b0((WeeklyAdItem) objB);
            }
            e eVar3 = e.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                eVar3.c0(thE);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$safeClipCoupon$1", f = "WeeklyAdDetailViewModel.kt", l = {343}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class D extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29057a;

        /* renamed from: b, reason: collision with root package name */
        Object f29058b;

        /* renamed from: c, reason: collision with root package name */
        Object f29059c;

        /* renamed from: d, reason: collision with root package name */
        Object f29060d;

        /* renamed from: e, reason: collision with root package name */
        int f29061e;

        /* renamed from: f, reason: collision with root package name */
        int f29062f;

        /* renamed from: g, reason: collision with root package name */
        int f29063g;

        /* renamed from: h, reason: collision with root package name */
        int f29064h;

        /* renamed from: i, reason: collision with root package name */
        int f29065i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29066j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Ok.c f29068l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(Ok.c cVar, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f29068l = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            D d10 = e.this.new D(this.f29068l, continuation);
            d10.f29066j = obj;
            return d10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29065i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29066j;
                    e eVar = e.this;
                    Ok.c cVar = this.f29068l;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.l<Coupon> lVarTake = eVar.couponsRepository.k(cVar).take(1L);
                    Intrinsics.i(lVarTake, "take(...)");
                    this.f29066j = interfaceC16622O;
                    this.f29057a = interfaceC16622O;
                    this.f29058b = this;
                    this.f29059c = this;
                    this.f29060d = interfaceC16622O;
                    this.f29061e = 0;
                    this.f29062f = 0;
                    this.f29063g = 0;
                    this.f29064h = 0;
                    this.f29065i = 1;
                    obj = xv.c.c(lVarTake, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e eVar2 = e.this;
            if (Result.h(objB)) {
                Coupon coupon = (Coupon) objB;
                Intrinsics.g(coupon);
                eVar2.O(coupon);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "safe Clip coupon failed from WeeklyAdDetailViewModel", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$a, reason: case insensitive filesystem */
    /* synthetic */ class C5042a extends FunctionReferenceImpl implements Function1<List<? extends CouponState>, Unit> {
        C5042a(Object obj) {
            super(1, obj, e.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 0);
        }

        public final void a(List<CouponState> p02) {
            Intrinsics.j(p02, "p0");
            ((e) this.receiver).onCouponState(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CouponState> list) {
            a(list);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$b, reason: case insensitive filesystem */
    /* synthetic */ class C5043b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C5043b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$c, reason: case insensitive filesystem */
    /* synthetic */ class C5044c extends AdaptedFunctionReference implements Function2<List<? extends Oj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C5044c(Object obj) {
            super(2, obj, e.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Oj.a> list, Continuation<? super Unit> continuation) {
            return e.s((e) this.f142801a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "LOj/a;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$4", f = "WeeklyAdDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ps.e$d, reason: case insensitive filesystem */
    static final class C5045d extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends Oj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29069a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29070b;

        C5045d(Continuation<? super C5045d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super List<? extends Oj.a>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            C5045d c5045d = new C5045d(continuation);
            c5045d.f29070b = th2;
            return c5045d.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f29069a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f29070b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LPs/e$e;", "", "<init>", "()V", "a", "b", "c", "LPs/e$e$a;", "LPs/e$e$b;", "LPs/e$e$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0675e {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LPs/e$e$a;", "LPs/e$e;", "", "", "relatedOfferIds", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$e$a, reason: from toString */
        public static final /* data */ class RefreshCoupons extends AbstractC0675e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Long> relatedOfferIds;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RefreshCoupons) && Intrinsics.e(this.relatedOfferIds, ((RefreshCoupons) other).relatedOfferIds);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshCoupons(List<Long> relatedOfferIds) {
                super(null);
                Intrinsics.j(relatedOfferIds, "relatedOfferIds");
                this.relatedOfferIds = relatedOfferIds;
            }

            public final List<Long> a() {
                return this.relatedOfferIds;
            }

            public int hashCode() {
                return this.relatedOfferIds.hashCode();
            }

            public String toString() {
                return "RefreshCoupons(relatedOfferIds=" + this.relatedOfferIds + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/e$e$b;", "LPs/e$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$e$b */
        public static final /* data */ class b extends AbstractC0675e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f29072a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "RetryClicked";
            }

            public int hashCode() {
                return 721282453;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/e$e$c;", "LPs/e$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$e$c */
        public static final /* data */ class c extends AbstractC0675e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f29073a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "VideoClicked";
            }

            public int hashCode() {
                return -1032138654;
            }
        }

        public /* synthetic */ AbstractC0675e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0675e() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LPs/e$g;", "", "<init>", "()V", "f", "e", "g", "c", "b", "h", "d", "a", "LPs/e$g$a;", "LPs/e$g$b;", "LPs/e$g$c;", "LPs/e$g$d;", "LPs/e$g$e;", "LPs/e$g$f;", "LPs/e$g$g;", "LPs/e$g$h;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPs/e$g$a;", "LPs/e$g;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$g$a, reason: from toString */
        public static final /* data */ class ActionRequiresLogin extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public ActionRequiresLogin(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActionRequiresLogin) && this.messageResId == ((ActionRequiresLogin) other).messageResId;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ActionRequiresLogin(messageResId=" + this.messageResId + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/e$g$b;", "LPs/e$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final b f29075a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "AddedToShoppingListFailure";
            }

            public int hashCode() {
                return 2062021476;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/e$g$c;", "LPs/e$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final c f29076a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "AddedToShoppingListSuccess";
            }

            public int hashCode() {
                return 1281425885;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/e$g$d;", "LPs/e$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final d f29077a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "DeleteFromShoppingListFailure";
            }

            public int hashCode() {
                return 675851764;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/e$g$e;", "LPs/e$g;", "LOk/a;", "coupon", "<init>", "(LOk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOk/a;", "()LOk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$g$e, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowCouponClippedSnackBar extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowCouponClippedSnackBar) && Intrinsics.e(this.coupon, ((ShowCouponClippedSnackBar) other).coupon);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowCouponClippedSnackBar(Coupon coupon) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
            }

            /* renamed from: a, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }

            public int hashCode() {
                return this.coupon.hashCode();
            }

            public String toString() {
                return "ShowCouponClippedSnackBar(coupon=" + this.coupon + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LPs/e$g$f;", "LPs/e$g;", "", "titleResId", "messageResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$g$f, reason: from toString */
        public static final /* data */ class ShowErrorAlert extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public ShowErrorAlert(int i10, int i11) {
                super(null);
                this.titleResId = i10;
                this.messageResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowErrorAlert)) {
                    return false;
                }
                ShowErrorAlert showErrorAlert = (ShowErrorAlert) other;
                return this.titleResId == showErrorAlert.titleResId && this.messageResId == showErrorAlert.messageResId;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ShowErrorAlert(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LPs/e$g$g;", "LPs/e$g;", "", "isYoutube", "", "url", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$g$g, reason: collision with other inner class name and from toString */
        public static final /* data */ class VideoTapped extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isYoutube;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoTapped)) {
                    return false;
                }
                VideoTapped videoTapped = (VideoTapped) other;
                return this.isYoutube == videoTapped.isYoutube && Intrinsics.e(this.url, videoTapped.url);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoTapped(boolean z10, String url) {
                super(null);
                Intrinsics.j(url, "url");
                this.isYoutube = z10;
                this.url = url;
            }

            /* renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsYoutube() {
                return this.isYoutube;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isYoutube) * 31) + this.url.hashCode();
            }

            public String toString() {
                return "VideoTapped(isYoutube=" + this.isYoutube + ", url=" + this.url + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/e$g$h;", "LPs/e$g;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$g$h, reason: from toString */
        public static final /* data */ class ViewInShoppingList extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewInShoppingList) && Intrinsics.e(this.weeklyAdItem, ((ViewInShoppingList) other).weeklyAdItem);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewInShoppingList(WeeklyAdItem weeklyAdItem) {
                super(null);
                Intrinsics.j(weeklyAdItem, "weeklyAdItem");
                this.weeklyAdItem = weeklyAdItem;
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                return this.weeklyAdItem.hashCode();
            }

            public String toString() {
                return "ViewInShoppingList(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"LPs/e$h;", "", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$h, reason: from toString */
    public static final /* data */ class LockedInt {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LockedInt) && this.value == ((LockedInt) other).value;
        }

        /* renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "LockedInt(value=" + this.value + ')';
        }

        public LockedInt(int i10) {
            this.value = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LPs/e$i;", "", "<init>", "()V", "a", "b", "c", "LPs/e$i$a;", "LPs/e$i$b;", "LPs/e$i$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class i {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/e$i$a;", "LPs/e$i;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$i$a, reason: from toString */
        public static final /* data */ class Add extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public Add(WeeklyAdItem weeklyAdItem) {
                super(null);
                this.weeklyAdItem = weeklyAdItem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Add) && Intrinsics.e(this.weeklyAdItem, ((Add) other).weeklyAdItem);
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
                if (weeklyAdItem == null) {
                    return 0;
                }
                return weeklyAdItem.hashCode();
            }

            public String toString() {
                return "Add(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/e$i$b;", "LPs/e$i;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$i$b, reason: from toString */
        public static final /* data */ class Remove extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public Remove(WeeklyAdItem weeklyAdItem) {
                super(null);
                this.weeklyAdItem = weeklyAdItem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Remove) && Intrinsics.e(this.weeklyAdItem, ((Remove) other).weeklyAdItem);
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
                if (weeklyAdItem == null) {
                    return 0;
                }
                return weeklyAdItem.hashCode();
            }

            public String toString() {
                return "Remove(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/e$i$c;", "LPs/e$i;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$i$c, reason: from toString */
        public static final /* data */ class View extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public View(WeeklyAdItem weeklyAdItem) {
                super(null);
                this.weeklyAdItem = weeklyAdItem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof View) && Intrinsics.e(this.weeklyAdItem, ((View) other).weeklyAdItem);
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
                if (weeklyAdItem == null) {
                    return 0;
                }
                return weeklyAdItem.hashCode();
            }

            public String toString() {
                return "View(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private i() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012Jx\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b\u0007\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b)\u00100R\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b3\u0010$R\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b%\u0010$R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010;\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0011\u0010<\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b-\u0010\u001aR\u0011\u0010>\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010$¨\u0006A"}, d2 = {"LPs/e$j;", "", "LGs/m;", "couponState", "", "showAd", "showVideo", "isYoutube", "isOnShoppingList", "LJs/b;", "weeklyAdItem", "", "", "relatedOfferIds", "isFromShoppingList", "LOj/a;", "loadingStates", "<init>", "(LGs/m;ZZZZLJs/b;Ljava/util/List;ZLjava/util/List;)V", "a", "(LGs/m;ZZZZLJs/b;Ljava/util/List;ZLjava/util/List;)LPs/e$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LGs/m;", "e", "()LGs/m;", "b", "Z", "j", "()Z", "c", "getShowVideo", "d", "q", "f", "LJs/b;", "o", "()LJs/b;", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "h", "p", "k", "showBottomBar", "actionButtonEnabled", "Lak/a;", "n", "()Lak/a;", "validThruDate", "actionButtonText", "relatedCouponsCount", "playButton", "l", "showError", "m", "showLoadingSpinner", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ps.e$j, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WeeklyAdDetailsCouponState couponState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showAd;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showVideo;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isYoutube;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOnShoppingList;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final WeeklyAdItem weeklyAdItem;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Long> relatedOfferIds;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromShoppingList;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Oj.a> loadingStates;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final boolean showBottomBar;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final boolean actionButtonEnabled;

        public ViewState() {
            this(null, false, false, false, false, null, null, false, null, 511, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.couponState, viewState.couponState) && this.showAd == viewState.showAd && this.showVideo == viewState.showVideo && this.isYoutube == viewState.isYoutube && this.isOnShoppingList == viewState.isOnShoppingList && Intrinsics.e(this.weeklyAdItem, viewState.weeklyAdItem) && Intrinsics.e(this.relatedOfferIds, viewState.relatedOfferIds) && this.isFromShoppingList == viewState.isFromShoppingList && Intrinsics.e(this.loadingStates, viewState.loadingStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(WeeklyAdDetailsCouponState couponState, boolean z10, boolean z11, boolean z12, boolean z13, WeeklyAdItem weeklyAdItem, List<Long> relatedOfferIds, boolean z14, List<? extends Oj.a> loadingStates) {
            Intrinsics.j(couponState, "couponState");
            Intrinsics.j(relatedOfferIds, "relatedOfferIds");
            Intrinsics.j(loadingStates, "loadingStates");
            this.couponState = couponState;
            this.showAd = z10;
            this.showVideo = z11;
            this.isYoutube = z12;
            this.isOnShoppingList = z13;
            this.weeklyAdItem = weeklyAdItem;
            this.relatedOfferIds = relatedOfferIds;
            this.isFromShoppingList = z14;
            this.loadingStates = loadingStates;
            boolean z15 = false;
            this.showBottomBar = (Oj.b.d(loadingStates, "weeklyAdDetail Ad") || z14) ? false : true;
            List<? extends Oj.a> list = loadingStates;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Oj.a) it.next()) instanceof a.Loading) {
                        z15 = true;
                        break;
                    }
                }
            }
            this.actionButtonEnabled = !z15;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, boolean z10, boolean z11, boolean z12, boolean z13, WeeklyAdItem weeklyAdItem, List list, boolean z14, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weeklyAdDetailsCouponState = viewState.couponState;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.showAd;
            }
            if ((i10 & 4) != 0) {
                z11 = viewState.showVideo;
            }
            if ((i10 & 8) != 0) {
                z12 = viewState.isYoutube;
            }
            if ((i10 & 16) != 0) {
                z13 = viewState.isOnShoppingList;
            }
            if ((i10 & 32) != 0) {
                weeklyAdItem = viewState.weeklyAdItem;
            }
            if ((i10 & 64) != 0) {
                list = viewState.relatedOfferIds;
            }
            if ((i10 & 128) != 0) {
                z14 = viewState.isFromShoppingList;
            }
            if ((i10 & 256) != 0) {
                list2 = viewState.loadingStates;
            }
            boolean z15 = z14;
            List list3 = list2;
            WeeklyAdItem weeklyAdItem2 = weeklyAdItem;
            List list4 = list;
            boolean z16 = z13;
            boolean z17 = z11;
            return viewState.a(weeklyAdDetailsCouponState, z10, z17, z12, z16, weeklyAdItem2, list4, z15, list3);
        }

        public final ViewState a(WeeklyAdDetailsCouponState couponState, boolean showAd, boolean showVideo, boolean isYoutube, boolean isOnShoppingList, WeeklyAdItem weeklyAdItem, List<Long> relatedOfferIds, boolean isFromShoppingList, List<? extends Oj.a> loadingStates) {
            Intrinsics.j(couponState, "couponState");
            Intrinsics.j(relatedOfferIds, "relatedOfferIds");
            Intrinsics.j(loadingStates, "loadingStates");
            return new ViewState(couponState, showAd, showVideo, isYoutube, isOnShoppingList, weeklyAdItem, relatedOfferIds, isFromShoppingList, loadingStates);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getActionButtonEnabled() {
            return this.actionButtonEnabled;
        }

        public final int d() {
            return this.isOnShoppingList ? com.meijer.mobile.weeklyad.c.f119285j : com.meijer.mobile.weeklyad.c.f119276a;
        }

        /* renamed from: e, reason: from getter */
        public final WeeklyAdDetailsCouponState getCouponState() {
            return this.couponState;
        }

        public final List<Oj.a> f() {
            return this.loadingStates;
        }

        public final int g() {
            WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
            return (weeklyAdItem != null ? weeklyAdItem.getVideoType() : null) == Js.f.f16125b ? com.meijer.mobile.weeklyad.b.f119275b : com.meijer.mobile.weeklyad.b.f119274a;
        }

        public final String h() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
            String str = String.format(Locale.US, "(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(this.relatedOfferIds.size())}, 1));
            Intrinsics.i(str, "format(...)");
            return str;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.couponState.hashCode() * 31) + Boolean.hashCode(this.showAd)) * 31) + Boolean.hashCode(this.showVideo)) * 31) + Boolean.hashCode(this.isYoutube)) * 31) + Boolean.hashCode(this.isOnShoppingList)) * 31;
            WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
            return ((((((iHashCode + (weeklyAdItem == null ? 0 : weeklyAdItem.hashCode())) * 31) + this.relatedOfferIds.hashCode()) * 31) + Boolean.hashCode(this.isFromShoppingList)) * 31) + this.loadingStates.hashCode();
        }

        public final List<Long> i() {
            return this.relatedOfferIds;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getShowAd() {
            return this.showAd;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getShowBottomBar() {
            return this.showBottomBar;
        }

        public final boolean l() {
            return Oj.b.c(this.loadingStates, "weeklyAdDetail Ad");
        }

        public final boolean m() {
            return Oj.b.d(this.loadingStates, "weeklyAdDetail Ad");
        }

        public final AbstractC5607a n() {
            WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
            if (weeklyAdItem != null) {
                if (weeklyAdItem.getEndDate() == null || weeklyAdItem.getStartDate() == null) {
                    weeklyAdItem = null;
                }
                if (weeklyAdItem != null) {
                    AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                    int i10 = com.meijer.mobile.weeklyad.c.f119291p;
                    LocalDate startDate = weeklyAdItem.getStartDate();
                    String str = startDate != null ? startDate.format(C17590a.DATE_SLASHES_SHORT) : null;
                    if (str == null) {
                        str = "";
                    }
                    LocalDate endDate = weeklyAdItem.getEndDate();
                    String str2 = endDate != null ? endDate.format(C17590a.DATE_SLASHES_SHORT) : null;
                    AbstractC5607a abstractC5607aD = companion.d(i10, str, str2 != null ? str2 : "");
                    if (abstractC5607aD != null) {
                        return abstractC5607aD;
                    }
                }
            }
            return AbstractC5607a.INSTANCE.a();
        }

        /* renamed from: o, reason: from getter */
        public final WeeklyAdItem getWeeklyAdItem() {
            return this.weeklyAdItem;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getIsFromShoppingList() {
            return this.isFromShoppingList;
        }

        /* renamed from: q, reason: from getter */
        public final boolean getIsOnShoppingList() {
            return this.isOnShoppingList;
        }

        public String toString() {
            return "ViewState(couponState=" + this.couponState + ", showAd=" + this.showAd + ", showVideo=" + this.showVideo + ", isYoutube=" + this.isYoutube + ", isOnShoppingList=" + this.isOnShoppingList + ", weeklyAdItem=" + this.weeklyAdItem + ", relatedOfferIds=" + this.relatedOfferIds + ", isFromShoppingList=" + this.isFromShoppingList + ", loadingStates=" + this.loadingStates + ')';
        }

        public /* synthetic */ ViewState(WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, boolean z10, boolean z11, boolean z12, boolean z13, WeeklyAdItem weeklyAdItem, List list, boolean z14, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new WeeklyAdDetailsCouponState(null, null, false, null, 15, null) : weeklyAdDetailsCouponState, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? null : weeklyAdItem, (i10 & 64) != 0 ? CollectionsKt.m() : list, (i10 & 128) == 0 ? z14 : false, (i10 & 256) != 0 ? CollectionsKt.m() : list2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$clipCoupon$1", f = "WeeklyAdDetailViewModel.kt", l = {352}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29099a;

        /* renamed from: b, reason: collision with root package name */
        Object f29100b;

        /* renamed from: c, reason: collision with root package name */
        Object f29101c;

        /* renamed from: d, reason: collision with root package name */
        Object f29102d;

        /* renamed from: e, reason: collision with root package name */
        int f29103e;

        /* renamed from: f, reason: collision with root package name */
        int f29104f;

        /* renamed from: g, reason: collision with root package name */
        int f29105g;

        /* renamed from: h, reason: collision with root package name */
        int f29106h;

        /* renamed from: i, reason: collision with root package name */
        int f29107i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29108j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Coupon f29110l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Coupon coupon, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f29110l = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = e.this.new k(this.f29110l, continuation);
            kVar.f29108j = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29107i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29108j;
                    e eVar = e.this;
                    Coupon coupon = this.f29110l;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.u<ClipUnclipCouponResponse> uVarH = eVar.couponsRepository.h(coupon);
                    this.f29108j = interfaceC16622O;
                    this.f29099a = interfaceC16622O;
                    this.f29100b = this;
                    this.f29101c = this;
                    this.f29102d = interfaceC16622O;
                    this.f29103e = 0;
                    this.f29104f = 0;
                    this.f29105g = 0;
                    this.f29106h = 0;
                    this.f29107i = 1;
                    obj = xv.c.b(uVarH, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e eVar2 = e.this;
            Coupon coupon2 = this.f29110l;
            if (Result.h(objB)) {
                eVar2.a0(coupon2);
            }
            e eVar3 = e.this;
            Coupon coupon3 = this.f29110l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                eVar3.Z(new CouponException(thE, coupon3));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends FunctionReferenceImpl implements Function1<CouponsResponse, Unit> {
        l(Object obj) {
            super(1, obj, e.class, "onGetCouponsSuccess", "onGetCouponsSuccess(Lcom/meijer/mobile/coupons/domain/models/CouponsResponse;)V", 0);
        }

        public final void a(CouponsResponse p02) {
            Intrinsics.j(p02, "p0");
            ((e) this.receiver).f0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CouponsResponse couponsResponse) {
            a(couponsResponse);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        m(Object obj) {
            super(1, obj, e.class, "onGetCouponsFailed", "onGetCouponsFailed(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable p02) {
            Intrinsics.j(p02, "p0");
            ((e) this.receiver).e0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$fetchSpecialOffersBannerUrl$1", f = "WeeklyAdDetailViewModel.kt", l = {453}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29111a;

        /* renamed from: b, reason: collision with root package name */
        Object f29112b;

        /* renamed from: c, reason: collision with root package name */
        Object f29113c;

        /* renamed from: d, reason: collision with root package name */
        Object f29114d;

        /* renamed from: e, reason: collision with root package name */
        int f29115e;

        /* renamed from: f, reason: collision with root package name */
        int f29116f;

        /* renamed from: g, reason: collision with root package name */
        int f29117g;

        /* renamed from: h, reason: collision with root package name */
        int f29118h;

        /* renamed from: i, reason: collision with root package name */
        int f29119i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29120j;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = e.this.new n(continuation);
            nVar.f29120j = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29119i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29120j;
                    e eVar = e.this;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.u<SpecialOffersUrlResponse> uVarU = eVar.couponsRepository.u();
                    this.f29120j = interfaceC16622O;
                    this.f29111a = interfaceC16622O;
                    this.f29112b = this;
                    this.f29113c = this;
                    this.f29114d = interfaceC16622O;
                    this.f29115e = 0;
                    this.f29116f = 0;
                    this.f29117g = 0;
                    this.f29118h = 0;
                    this.f29119i = 1;
                    obj = xv.c.b(uVarU, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e eVar2 = e.this;
            if (Result.h(objB)) {
                SpecialOffersUrlResponse specialOffersUrlResponse = (SpecialOffersUrlResponse) objB;
                Intrinsics.g(specialOffersUrlResponse);
                eVar2.d0(specialOffersUrlResponse);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "fetchSpecialOffersBannerUrl Failed from WeeklyAdDetailViewModel", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAction$1$1", f = "WeeklyAdDetailViewModel.kt", l = {226}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29122a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(WeeklyAdItem weeklyAdItem, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f29124c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new o(this.f29124c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29122a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ViewInShoppingList viewInShoppingList = new g.ViewInShoppingList(this.f29124c);
                this.f29122a = 1;
                if (interfaceC17139A.emit(viewInShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAction$2$1", f = "WeeklyAdDetailViewModel.kt", l = {521}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29125a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29127c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(WeeklyAdItem weeklyAdItem, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f29127c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new p(this.f29127c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29125a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                if (this.f29127c.getVideoType() == Js.f.f16125b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String videoUrl = this.f29127c.getVideoUrl();
                if (videoUrl == null) {
                    videoUrl = "";
                }
                g.VideoTapped videoTapped = new g.VideoTapped(z10, videoUrl);
                this.f29125a = 1;
                if (interfaceC17139A.emit(videoTapped, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$1", f = "WeeklyAdDetailViewModel.kt", l = {246}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29128a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29128a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ActionRequiresLogin actionRequiresLogin = new g.ActionRequiresLogin(C18570a.f173237e);
                this.f29128a = 1;
                if (interfaceC17139A.emit(actionRequiresLogin, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$2$1", f = "WeeklyAdDetailViewModel.kt", l = {250}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29130a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(WeeklyAdItem weeklyAdItem, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f29132c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new r(this.f29132c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29130a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ViewInShoppingList viewInShoppingList = new g.ViewInShoppingList(this.f29132c);
                this.f29130a = 1;
                if (interfaceC17139A.emit(viewInShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$4$1", f = "WeeklyAdDetailViewModel.kt", l = {265}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29133a;

        /* renamed from: b, reason: collision with root package name */
        Object f29134b;

        /* renamed from: c, reason: collision with root package name */
        Object f29135c;

        /* renamed from: d, reason: collision with root package name */
        Object f29136d;

        /* renamed from: e, reason: collision with root package name */
        int f29137e;

        /* renamed from: f, reason: collision with root package name */
        int f29138f;

        /* renamed from: g, reason: collision with root package name */
        int f29139g;

        /* renamed from: h, reason: collision with root package name */
        int f29140h;

        /* renamed from: i, reason: collision with root package name */
        int f29141i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29142j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29144l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$4$1$2$2", f = "WeeklyAdDetailViewModel.kt", l = {281}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29145a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f29146b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29146b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f29146b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f29145a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f29146b._effectsFlow;
                    g.b bVar = g.b.f29075a;
                    this.f29145a = 1;
                    if (interfaceC17139A.emit(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$4$1$3$1", f = "WeeklyAdDetailViewModel.kt", l = {286}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29147a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f29148b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f29148b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f29148b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f29147a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f29148b._effectsFlow;
                    g.c cVar = g.c.f29076a;
                    this.f29147a = 1;
                    if (interfaceC17139A.emit(cVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(WeeklyAdItem weeklyAdItem, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f29144l = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = e.this.new s(this.f29144l, continuation);
            sVar.f29142j = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object value;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29141i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29142j;
                    e eVar = e.this;
                    WeeklyAdItem weeklyAdItem = this.f29144l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = eVar.shoppingListRepository;
                    ShoppingListItem shoppingListItemE = Fq.d.e(weeklyAdItem, eVar.storeProvider.b());
                    this.f29142j = interfaceC16622O;
                    this.f29133a = interfaceC16622O;
                    this.f29134b = this;
                    this.f29135c = this;
                    this.f29136d = interfaceC16622O;
                    this.f29137e = 0;
                    this.f29138f = 0;
                    this.f29139g = 0;
                    this.f29140h = 0;
                    this.f29141i = 1;
                    objD = bVar.d(shoppingListItemE, this);
                    if (objD == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objD = obj;
                }
                objB = Result.b(objD);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e eVar2 = e.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "AddShoppingListItem failed from WeeklyAdDetailViewModel", new Object[0]);
                eVar2.loadingStateManager.b(new a.Failed("weeklyAdDetail ShoppingList", null, 2, null));
                InterfaceC17140B interfaceC17140B = eVar2._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, false, false, false, null, null, false, null, 495, null)));
                C16648k.d(d0.a(eVar2), null, null, new a(eVar2, null), 3, null);
            }
            e eVar3 = e.this;
            if (Result.h(objB)) {
                eVar3.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
                C16648k.d(d0.a(eVar3), null, null, new b(eVar3, null), 3, null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponCallFailure$1", f = "WeeklyAdDetailViewModel.kt", l = {378}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29149a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29149a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(0, pk.f.f155797k);
                this.f29149a = 1;
                if (interfaceC17139A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponCallFailure$2", f = "WeeklyAdDetailViewModel.kt", l = {389}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29151a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponException f29153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(CouponException couponException, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f29153c = couponException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new u(this.f29153c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f29151a;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                if (this.f29153c.getErrorType() == AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR) {
                    i10 = Nr.g.f22700G;
                } else {
                    i10 = 0;
                }
                rk.b errorType = this.f29153c.getErrorType();
                Intrinsics.g(errorType);
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(i10, errorType.getErrorResourceId());
                this.f29151a = 1;
                if (interfaceC17139A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponCallFailure$3", f = "WeeklyAdDetailViewModel.kt", l = {HttpResponseStatus.ERROR_NOT_FOUND}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29154a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29154a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(0, Nr.g.f22756s);
                this.f29154a = 1;
                if (interfaceC17139A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponSuccess$1", f = "WeeklyAdDetailViewModel.kt", l = {367}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29156a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f29158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Coupon coupon, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f29158c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new w(this.f29158c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29156a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ShowCouponClippedSnackBar showCouponClippedSnackBar = new g.ShowCouponClippedSnackBar(this.f29158c);
                this.f29156a = 1;
                if (interfaceC17139A.emit(showCouponClippedSnackBar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onDataRetrieved$2", f = "WeeklyAdDetailViewModel.kt", l = {199}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29159a;

        x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new x(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29159a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Eq.b bVar = e.this.shoppingListRepository;
                this.f29159a = 1;
                if (bVar.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onGetCouponsFailed$2", f = "WeeklyAdDetailViewModel.kt", l = {490}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29161a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ rk.b f29163c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(rk.b bVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f29163c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new y(this.f29163c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29161a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e.this._effectsFlow;
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(0, ((CouponsResponse.EnumC2006a) this.f29163c).getErrorResourceId());
                this.f29161a = 1;
                if (interfaceC17139A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onRemoveFromShoppingList$2", f = "WeeklyAdDetailViewModel.kt", l = {HttpResponseStatus.REDIRECTION_SEE_OTHER}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class z extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29164a;

        /* renamed from: b, reason: collision with root package name */
        Object f29165b;

        /* renamed from: c, reason: collision with root package name */
        Object f29166c;

        /* renamed from: d, reason: collision with root package name */
        Object f29167d;

        /* renamed from: e, reason: collision with root package name */
        int f29168e;

        /* renamed from: f, reason: collision with root package name */
        int f29169f;

        /* renamed from: g, reason: collision with root package name */
        int f29170g;

        /* renamed from: h, reason: collision with root package name */
        int f29171h;

        /* renamed from: i, reason: collision with root package name */
        int f29172i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29173j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29175l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onRemoveFromShoppingList$2$2$2", f = "WeeklyAdDetailViewModel.kt", l = {316}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29176a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f29177b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29177b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f29177b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f29176a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f29177b._effectsFlow;
                    g.d dVar = g.d.f29077a;
                    this.f29176a = 1;
                    if (interfaceC17139A.emit(dVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(WeeklyAdItem weeklyAdItem, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f29175l = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            z zVar = e.this.new z(this.f29175l, continuation);
            zVar.f29173j = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object value;
            Object objO;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29172i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29173j;
                    e eVar = e.this;
                    WeeklyAdItem weeklyAdItem = this.f29175l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = eVar.shoppingListRepository;
                    Intrinsics.g(weeklyAdItem);
                    this.f29173j = interfaceC16622O;
                    this.f29164a = interfaceC16622O;
                    this.f29165b = this;
                    this.f29166c = this;
                    this.f29167d = interfaceC16622O;
                    this.f29168e = 0;
                    this.f29169f = 0;
                    this.f29170g = 0;
                    this.f29171h = 0;
                    this.f29172i = 1;
                    objO = bVar.o(weeklyAdItem, this);
                    if (objO == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objO = obj;
                }
                objB = Result.b(objO);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e eVar2 = e.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Error removing from ShoppingList WeeklyAdDetailViewmodel", new Object[0]);
                InterfaceC17140B interfaceC17140B = eVar2._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, false, false, true, null, null, false, null, 495, null)));
                eVar2.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
                C16648k.d(d0.a(eVar2), null, null, new a(eVar2, null), 3, null);
            }
            e eVar3 = e.this;
            if (Result.h(objB)) {
                eVar3.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
            }
            return Unit.f142422a;
        }
    }

    public e(Eq.b shoppingListRepository, Ls.b getFlippWeeklyAdProductDetailsCall, C6412d couponsRepository, Xk.u couponStateRepository, yo.k userManager, Tq.j storeProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(getFlippWeeklyAdProductDetailsCall, "getFlippWeeklyAdProductDetailsCall");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(couponStateRepository, "couponStateRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.shoppingListRepository = shoppingListRepository;
        this.getFlippWeeklyAdProductDetailsCall = getFlippWeeklyAdProductDetailsCall;
        this.couponsRepository = couponsRepository;
        this.couponStateRepository = couponStateRepository;
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.ioDispatcher = ioDispatcher;
        Oj.c cVar = new Oj.c();
        this.loadingStateManager = cVar;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, false, false, false, false, null, null, false, null, 511, null));
        this._viewState = interfaceC17140BA;
        this._effectsFlow = C17146H.b(0, 1, null, 5, null);
        this.viewState = C17154h.c(interfaceC17140BA);
        io.reactivex.l<List<CouponState>> lVarSubscribeOn = couponStateRepository.O().subscribeOn(C14764a.b());
        final C5042a c5042a = new C5042a(this);
        Pu.g<? super List<CouponState>> gVar = new Pu.g() { // from class: Ps.c
            @Override // Pu.g
            public final void accept(Object obj) {
                e.q(c5042a, obj);
            }
        };
        final C5043b c5043b = new C5043b(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: Ps.d
            @Override // Pu.g
            public final void accept(Object obj) {
                e.r(c5043b, obj);
            }
        }), aVar);
        C17154h.J(C17154h.g(C17154h.O(cVar.a(), new C5044c(this)), new C5045d(null)), d0.a(this));
    }

    private final void P(List<Long> relatedOfferIds) {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(viewState.getCouponState(), null, null, false, new a.Loading(null, null, 3, null), 7, null), false, false, false, false, null, null, false, null, 510, null)));
        io.reactivex.u uVarK = C6412d.B(this.couponsRepository, new CouponOptions(null, null, CouponsSortType.EXPIRING, false, false, 0L, null, null, false, CollectionsKt.m1(relatedOfferIds), null, false, false, 7675, null), false, false, false, 14, null).k(Mu.a.a());
        final l lVar = new l(this);
        Pu.g gVar = new Pu.g() { // from class: Ps.a
            @Override // Pu.g
            public final void accept(Object obj) {
                e.Q(lVar, obj);
            }
        };
        final m mVar = new m(this);
        Ck.a.a(uVarK.o(gVar, new Pu.g() { // from class: Ps.b
            @Override // Pu.g
            public final void accept(Object obj) {
                e.R(mVar, obj);
            }
        }), this.disposables);
    }

    private final void Y(WeeklyAdItem weeklyAdItem) {
        ViewState value;
        ViewState value2 = this.viewState.getValue();
        if (!this.userManager.b()) {
            C16648k.d(d0.a(this), null, null, new q(null), 3, null);
            return;
        }
        if (value2.getIsOnShoppingList()) {
            WeeklyAdItem weeklyAdItem2 = value2.getWeeklyAdItem();
            if (weeklyAdItem2 != null) {
                C16648k.d(d0.a(this), null, null, new r(weeklyAdItem2, null), 3, null);
                return;
            }
            return;
        }
        this.loadingStateManager.b(new a.Loading("weeklyAdDetail ShoppingList", null, 2, null));
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, false, false, false, true, null, null, false, null, 495, null)));
        if (weeklyAdItem != null) {
            C16648k.d(d0.a(this), this.ioDispatcher, null, new s(weeklyAdItem, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(CouponException exception) {
        if (exception.getErrorType() != null) {
            rk.b errorType = exception.getErrorType();
            Intrinsics.g(errorType);
            if (errorType.getResultCode() > 30) {
                return;
            }
        }
        if (exception.getExceptionKind() == RetrofitException.b.f96142b) {
            C16648k.d(d0.a(this), null, null, new t(null), 3, null);
        } else if (exception.getErrorType() != null) {
            C16648k.d(d0.a(this), null, null, new u(exception, null), 3, null);
        } else {
            C16648k.d(d0.a(this), null, null, new v(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(Coupon coupon) {
        this.couponStateRepository.S(CollectionsKt.e(Coupon.e(coupon, 0L, false, false, null, null, true, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741791, null)));
        C16648k.d(d0.a(this), null, null, new w(coupon, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(WeeklyAdItem weeklyAdItem) {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, true, false, false, false, weeklyAdItem != null ? WeeklyAdItem.b(weeklyAdItem, 0, 0, null, null, null, 0, 0, null, null, null, 0L, null, CollectionsKt.m1(CollectionsKt.P0(weeklyAdItem.o(), viewState.i())), null, null, null, null, null, false, null, null, null, 4190207, null) : null, null, false, null, 477, null)));
        this.loadingStateManager.b(new a.NotLoading("weeklyAdDetail Ad"));
        C16648k.d(d0.a(this), null, null, new x(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(Throwable e10) {
        ViewState value;
        uw.a.INSTANCE.f(e10, "WeeklyAdProductDetailCall failed in WeeklyAdDetailViewModel", new Object[0]);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, null, 509, null)));
        this.loadingStateManager.b(new a.Failed("weeklyAdDetail Ad", null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(SpecialOffersUrlResponse response) {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(viewState.getCouponState(), null, response.getSpecialOffersBannerURL(), false, new a.NotLoading(null, 1, null), 5, null), false, false, false, false, null, null, false, null, 510, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(Throwable exception) {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, viewState.getCouponState().a(CollectionsKt.m(), null, false, new a.Failed(null, null, 3, null)), false, false, false, false, null, null, false, null, 510, null)));
        rk.b errorType = com.meijer.mobile.core.networking.exceptions.a.a(exception).getErrorType();
        if (errorType instanceof CouponsResponse.EnumC2006a) {
            C16648k.d(d0.a(this), null, null, new y(errorType, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(CouponsResponse couponsResponse) {
        ViewState value;
        ViewState viewState;
        Xk.u uVar = this.couponStateRepository;
        List<Coupon> listF = couponsResponse.f();
        Intrinsics.g(listF);
        uVar.R(listF);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(viewState.getCouponState(), null, couponsResponse.getSpecialOffersUrl(), couponsResponse.getHasSpecialOffers(), new a.NotLoading(null, 1, null), 1, null), false, false, false, false, null, null, false, null, 510, null)));
        if (couponsResponse.getHasSpecialOffers()) {
            String specialOffersUrl = couponsResponse.getSpecialOffersUrl();
            if (specialOffersUrl == null || specialOffersUrl.length() == 0) {
                S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(List<ShoppingListItem> shoppingList) {
        ViewState value;
        ViewState viewState;
        boolean z10;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            z10 = false;
            if (shoppingList != null) {
                List<ShoppingListItem> list = shoppingList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Fq.d.a((ShoppingListItem) it.next(), viewState.getWeeklyAdItem())) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, false, false, z10, null, null, false, null, 495, null)));
        this.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
    }

    private final void h0(WeeklyAdItem weeklyAdItem) {
        ViewState value;
        this.loadingStateManager.b(new a.Loading("weeklyAdDetail ShoppingList", null, 2, null));
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, null, 495, null)));
        C16648k.d(d0.a(this), this.ioDispatcher, null, new z(weeklyAdItem, null), 2, null);
    }

    private final void i0() {
        ViewState value;
        this.loadingStateManager.b(new a.Loading("weeklyAdDetail Ad", null, 2, null));
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, null, 509, null)));
        P(this.viewState.getValue().i());
        C16648k.d(d0.a(this), this.ioDispatcher, null, new C(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponState(List<CouponState> couponStateList) {
        ViewState value;
        ViewState viewState;
        WeeklyAdDetailsCouponState couponState;
        ArrayList arrayList;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            couponState = viewState.getCouponState();
            List<CouponState> list = couponStateList;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Qr.a.n(((CouponState) it.next()).getCoupon()));
            }
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(couponState, arrayList, null, false, null, 14, null), false, false, false, false, null, null, false, null, 510, null)));
    }

    private final void onLoadingStates(List<? extends Oj.a> loadingStates) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            List<? extends Oj.a> list = loadingStates;
            if (interfaceC17140B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, list, l3.f92484c, null))) {
                return;
            } else {
                loadingStates = list;
            }
        }
    }

    public final InterfaceC17144F<g> T() {
        return C17154h.b(this._effectsFlow);
    }

    public final P<ViewState> U() {
        return this.viewState;
    }

    public final void V(int weeklyAdItemId, int publicationId, boolean isFromShoppingList, List<Long> relatedOffersIds) {
        List<Long> relatedOffersIds2 = relatedOffersIds;
        Intrinsics.j(relatedOffersIds2, "relatedOffersIds");
        this.weeklyAdItemId = new LockedInt(weeklyAdItemId);
        this.publicationId = new LockedInt(publicationId);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, ViewState.b(value, null, false, false, false, false, null, relatedOffersIds2, isFromShoppingList, null, 319, null))) {
                i0();
                return;
            }
            relatedOffersIds2 = relatedOffersIds;
        }
    }

    public final void W(AbstractC0675e action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC0675e.RefreshCoupons) {
            P(((AbstractC0675e.RefreshCoupons) action).a());
            return;
        }
        if (action instanceof AbstractC0675e.b) {
            i0();
        } else {
            if (!(action instanceof AbstractC0675e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            WeeklyAdItem weeklyAdItem = this.viewState.getValue().getWeeklyAdItem();
            if (weeklyAdItem != null) {
                C16648k.d(d0.a(this), null, null, new p(weeklyAdItem, null), 3, null);
            }
        }
    }

    public final void X(i action) {
        Intrinsics.j(action, "action");
        if (action instanceof i.Add) {
            Y(((i.Add) action).getWeeklyAdItem());
            return;
        }
        if (action instanceof i.Remove) {
            h0(((i.Remove) action).getWeeklyAdItem());
        } else {
            if (!(action instanceof i.View)) {
                throw new NoWhenBranchMatchedException();
            }
            WeeklyAdItem weeklyAdItem = ((i.View) action).getWeeklyAdItem();
            if (weeklyAdItem != null) {
                C16648k.d(d0.a(this), null, null, new o(weeklyAdItem, null), 3, null);
            }
        }
    }

    public void onAction(Pk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            j0(((a.Clip) action).getCoupon());
            return;
        }
        if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip)) {
            if (!(action instanceof a.ViewCouponDetails) && !(action instanceof a.ViewCouponList)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            uw.a.INSTANCE.s("Requested unsupported action: " + action, new Object[0]);
        }
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        C16648k.d(d0.a(this), null, null, new A(null), 3, null);
        if (Oj.b.c(this.viewState.getValue().f(), "weeklyAdDetail Ad")) {
            i0();
        } else {
            C16648k.d(d0.a(this), null, null, new B(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Coupon coupon) {
        C16648k.d(d0.a(this), this.ioDispatcher, null, new k(coupon, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void S() {
        C16648k.d(d0.a(this), this.ioDispatcher, null, new n(null), 2, null);
    }

    private final void j0(Ok.c couponIdentity) {
        C16648k.d(d0.a(this), this.ioDispatcher, null, new D(couponIdentity, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object s(e eVar, List list, Continuation continuation) {
        eVar.onLoadingStates(list);
        return Unit.f142422a;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
