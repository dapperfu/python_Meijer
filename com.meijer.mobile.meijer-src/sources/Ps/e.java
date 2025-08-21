package Ps;

import Fq.ShoppingListItem;
import Fq.ShoppingListStore;
import Gs.WeeklyAdDetailsCouponState;
import Js.WeeklyAdItem;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Sk.CouponOptions;
import Yk.CouponState;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import el.CouponsResponse;
import ev.C13889a;
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
import mv.AbstractC15779K;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import qw.a;
import wk.C17898a;
import zs.C18546a;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006kmo!hfBC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00172\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0014H\u0002¢\u0006\u0004\b&\u0010\u0019J\u0019\u0010'\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b'\u0010\u001fJ\u0019\u0010(\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b(\u0010\u001fJ\u001d\u0010+\u001a\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014H\u0002¢\u0006\u0004\b+\u0010\u0019J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00103J\u0017\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u00172\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0014H\u0002¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\b@\u0010\u001bJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00172\u0006\u00106\u001a\u00020 H\u0002¢\u0006\u0004\bE\u0010#J3\u0010L\u001a\u00020\u00172\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010J\u001a\u00020I2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002090\u0014¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00172\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010S\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u00172\u0006\u0010S\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\\\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010G\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010H\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020w0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020w0\u0080\u00018\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020|0\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"LPs/e;", "Landroidx/lifecycle/c0;", "", "Landroidx/lifecycle/f;", "LEq/b;", "shoppingListRepository", "LLs/b;", "getFlippWeeklyAdProductDetailsCall", "Ldl/d;", "couponsRepository", "LYk/u;", "couponStateRepository", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lmv/K;", "ioDispatcher", "<init>", "(LEq/b;LLs/b;Ldl/d;LYk/u;Lyo/k;LTq/j;Lmv/K;)V", "", "LPj/a;", "loadingStates", "", "onLoadingStates", "(Ljava/util/List;)V", "i0", "()V", "LJs/b;", "weeklyAdItem", "b0", "(LJs/b;)V", "", "e", "c0", "(Ljava/lang/Throwable;)V", "LFq/c;", "shoppingList", "g0", "Y", "h0", "LYk/c;", "couponStateList", "onCouponState", "LPk/c;", "couponIdentity", "j0", "(LPk/c;)V", "LPk/a;", "coupon", "O", "(LPk/a;)V", "a0", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "exception", "Z", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;)V", "", "relatedOfferIds", "P", "Lel/a;", "couponsResponse", "f0", "(Lel/a;)V", "S", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "response", "d0", "(Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;)V", "e0", "", "weeklyAdItemId", "publicationId", "", "isFromShoppingList", "relatedOffersIds", "V", "(IIZLjava/util/List;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "LPs/e$i;", "action", "X", "(LPs/e$i;)V", "LQk/a;", "onAction", "(LQk/a;)V", "LPs/e$e;", "W", "(LPs/e$e;)V", "onCleared", "a", "LEq/b;", "b", "LLs/b;", "c", "Ldl/d;", "d", "LYk/u;", "Lyo/k;", "f", "LTq/j;", "g", "Lmv/K;", "LPs/e$h;", "h", "LPs/e$h;", "i", "LPj/c;", "j", "LPj/c;", "loadingStateManager", "LJu/a;", "k", "LJu/a;", "disposables", "Lpv/B;", "LPs/e$j;", "l", "Lpv/B;", "_viewState", "Lpv/A;", "LPs/e$g;", "m", "Lpv/A;", "_effectsFlow", "Lpv/P;", "n", "Lpv/P;", "U", "()Lpv/P;", "viewState", "Lpv/F;", "T", "()Lpv/F;", "effectFlow", "o", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e extends c0 implements InterfaceC6157f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f26907p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ls.b getFlippWeeklyAdProductDetailsCall;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Yk.u couponStateRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private LockedInt weeklyAdItemId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private LockedInt publicationId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStateManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<g> _effectsFlow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onResume$1", f = "WeeklyAdDetailViewModel.kt", l = {152}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26922a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFq/e;", "it", "", "<anonymous>", "(LFq/e;)Z"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onResume$1$1", f = "WeeklyAdDetailViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<ShoppingListStore, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f26924a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f26925b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f26925b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f26925b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ShoppingListStore shoppingListStore, Continuation<? super Boolean> continuation) {
                return ((a) create(shoppingListStore, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f26924a == 0) {
                    ResultKt.b(obj);
                    if (this.f26925b.U().getValue().getWeeklyAdItem() != null) {
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26922a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<ShoppingListStore> interfaceC16561fH = e.this.shoppingListRepository.h();
                a aVar = new a(e.this, null);
                this.f26922a = 1;
                obj = C16563h.D(interfaceC16561fH, aVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            ShoppingListStore shoppingListStore = (ShoppingListStore) obj;
            if (shoppingListStore != null) {
                e.this.g0(shoppingListStore.c());
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onResume$2", f = "WeeklyAdDetailViewModel.kt", l = {159}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26926a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26926a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Eq.b bVar = e.this.shoppingListRepository;
                this.f26926a = 1;
                if (bVar.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$refreshData$2", f = "WeeklyAdDetailViewModel.kt", l = {178}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26928a;

        /* renamed from: b, reason: collision with root package name */
        Object f26929b;

        /* renamed from: c, reason: collision with root package name */
        Object f26930c;

        /* renamed from: d, reason: collision with root package name */
        Object f26931d;

        /* renamed from: e, reason: collision with root package name */
        int f26932e;

        /* renamed from: f, reason: collision with root package name */
        int f26933f;

        /* renamed from: g, reason: collision with root package name */
        int f26934g;

        /* renamed from: h, reason: collision with root package name */
        int f26935h;

        /* renamed from: i, reason: collision with root package name */
        int f26936i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f26937j;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C c10 = e.this.new C(continuation);
            c10.f26937j = obj;
            return c10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26936i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f26937j;
                    e eVar = e.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ls.b bVar = eVar.getFlippWeeklyAdProductDetailsCall;
                    LockedInt lockedInt = eVar.weeklyAdItemId;
                    LockedInt lockedInt2 = null;
                    if (lockedInt == null) {
                        Intrinsics.x("weeklyAdItemId");
                        lockedInt = null;
                    }
                    int value = lockedInt.getValue();
                    LockedInt lockedInt3 = eVar.publicationId;
                    if (lockedInt3 == null) {
                        Intrinsics.x("publicationId");
                    } else {
                        lockedInt2 = lockedInt3;
                    }
                    int value2 = lockedInt2.getValue();
                    this.f26937j = interfaceC15783O;
                    this.f26928a = interfaceC15783O;
                    this.f26929b = this;
                    this.f26930c = this;
                    this.f26931d = interfaceC15783O;
                    this.f26932e = 0;
                    this.f26933f = 0;
                    this.f26934g = 0;
                    this.f26935h = 0;
                    this.f26936i = 1;
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$safeClipCoupon$1", f = "WeeklyAdDetailViewModel.kt", l = {343}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26939a;

        /* renamed from: b, reason: collision with root package name */
        Object f26940b;

        /* renamed from: c, reason: collision with root package name */
        Object f26941c;

        /* renamed from: d, reason: collision with root package name */
        Object f26942d;

        /* renamed from: e, reason: collision with root package name */
        int f26943e;

        /* renamed from: f, reason: collision with root package name */
        int f26944f;

        /* renamed from: g, reason: collision with root package name */
        int f26945g;

        /* renamed from: h, reason: collision with root package name */
        int f26946h;

        /* renamed from: i, reason: collision with root package name */
        int f26947i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f26948j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Pk.c f26950l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(Pk.c cVar, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f26950l = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            D d10 = e.this.new D(this.f26950l, continuation);
            d10.f26948j = obj;
            return d10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26947i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f26948j;
                    e eVar = e.this;
                    Pk.c cVar = this.f26950l;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.l<Coupon> lVarTake = eVar.couponsRepository.k(cVar).take(1L);
                    Intrinsics.i(lVarTake, "take(...)");
                    this.f26948j = interfaceC15783O;
                    this.f26939a = interfaceC15783O;
                    this.f26940b = this;
                    this.f26941c = this;
                    this.f26942d = interfaceC15783O;
                    this.f26943e = 0;
                    this.f26944f = 0;
                    this.f26945g = 0;
                    this.f26946h = 0;
                    this.f26947i = 1;
                    obj = tv.c.c(lVarTake, this);
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
                qw.a.INSTANCE.f(thE, "safe Clip coupon failed from WeeklyAdDetailViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$a, reason: case insensitive filesystem */
    /* synthetic */ class C4640a extends FunctionReferenceImpl implements Function1<List<? extends CouponState>, Unit> {
        C4640a(Object obj) {
            super(1, obj, e.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 0);
        }

        public final void a(List<CouponState> p02) {
            Intrinsics.j(p02, "p0");
            ((e) this.receiver).onCouponState(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CouponState> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$b, reason: case insensitive filesystem */
    /* synthetic */ class C4641b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C4641b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$c, reason: case insensitive filesystem */
    /* synthetic */ class C4642c extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C4642c(Object obj) {
            super(2, obj, e.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return e.s((e) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$4", f = "WeeklyAdDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ps.e$d, reason: case insensitive filesystem */
    static final class C4643d extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26951a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26952b;

        C4643d(Continuation<? super C4643d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C4643d c4643d = new C4643d(continuation);
            c4643d.f26952b = th2;
            return c4643d.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f26951a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f26952b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LPs/e$e;", "", "<init>", "()V", "a", "b", "c", "LPs/e$e$a;", "LPs/e$e$b;", "LPs/e$e$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0495e {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LPs/e$e$a;", "LPs/e$e;", "", "", "relatedOfferIds", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.e$e$a, reason: from toString */
        public static final /* data */ class RefreshCoupons extends AbstractC0495e {

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
        public static final /* data */ class b extends AbstractC0495e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f26954a = new b();

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
        public static final /* data */ class c extends AbstractC0495e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f26955a = new c();

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

        public /* synthetic */ AbstractC0495e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0495e() {
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
            public static final b f26957a = new b();

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
            public static final c f26958a = new c();

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
            public static final d f26959a = new d();

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/e$g$e;", "LPs/e$g;", "LPk/a;", "coupon", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012Jx\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b\u0007\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b)\u00100R\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b3\u0010$R\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b%\u0010$R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010;\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0011\u0010<\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b-\u0010\u001aR\u0011\u0010>\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010$¨\u0006A"}, d2 = {"LPs/e$j;", "", "LGs/m;", "couponState", "", "showAd", "showVideo", "isYoutube", "isOnShoppingList", "LJs/b;", "weeklyAdItem", "", "", "relatedOfferIds", "isFromShoppingList", "LPj/a;", "loadingStates", "<init>", "(LGs/m;ZZZZLJs/b;Ljava/util/List;ZLjava/util/List;)V", "a", "(LGs/m;ZZZZLJs/b;Ljava/util/List;ZLjava/util/List;)LPs/e$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LGs/m;", "e", "()LGs/m;", "b", "Z", "j", "()Z", "c", "getShowVideo", "d", "q", "f", "LJs/b;", "o", "()LJs/b;", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "h", "p", "k", "showBottomBar", "actionButtonEnabled", "Lbk/a;", "n", "()Lbk/a;", "validThruDate", "actionButtonText", "relatedCouponsCount", "playButton", "l", "showError", "m", "showLoadingSpinner", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        private final List<Pj.a> loadingStates;

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
        public ViewState(WeeklyAdDetailsCouponState couponState, boolean z10, boolean z11, boolean z12, boolean z13, WeeklyAdItem weeklyAdItem, List<Long> relatedOfferIds, boolean z14, List<? extends Pj.a> loadingStates) {
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
            this.showBottomBar = (Pj.b.d(loadingStates, "weeklyAdDetail Ad") || z14) ? false : true;
            List<? extends Pj.a> list = loadingStates;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Pj.a) it.next()) instanceof a.Loading) {
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

        public final ViewState a(WeeklyAdDetailsCouponState couponState, boolean showAd, boolean showVideo, boolean isYoutube, boolean isOnShoppingList, WeeklyAdItem weeklyAdItem, List<Long> relatedOfferIds, boolean isFromShoppingList, List<? extends Pj.a> loadingStates) {
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
            return this.isOnShoppingList ? com.meijer.mobile.weeklyad.c.f120258j : com.meijer.mobile.weeklyad.c.f120249a;
        }

        /* renamed from: e, reason: from getter */
        public final WeeklyAdDetailsCouponState getCouponState() {
            return this.couponState;
        }

        public final List<Pj.a> f() {
            return this.loadingStates;
        }

        public final int g() {
            WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
            return (weeklyAdItem != null ? weeklyAdItem.getVideoType() : null) == Js.f.f16223b ? com.meijer.mobile.weeklyad.b.f120248b : com.meijer.mobile.weeklyad.b.f120247a;
        }

        public final String h() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
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
            return Pj.b.c(this.loadingStates, "weeklyAdDetail Ad");
        }

        public final boolean m() {
            return Pj.b.d(this.loadingStates, "weeklyAdDetail Ad");
        }

        public final AbstractC6392a n() {
            WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
            if (weeklyAdItem != null) {
                if (weeklyAdItem.getEndDate() == null || weeklyAdItem.getStartDate() == null) {
                    weeklyAdItem = null;
                }
                if (weeklyAdItem != null) {
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    int i10 = com.meijer.mobile.weeklyad.c.f120264p;
                    LocalDate startDate = weeklyAdItem.getStartDate();
                    String str = startDate != null ? startDate.format(C17898a.DATE_SLASHES_SHORT) : null;
                    if (str == null) {
                        str = "";
                    }
                    LocalDate endDate = weeklyAdItem.getEndDate();
                    String str2 = endDate != null ? endDate.format(C17898a.DATE_SLASHES_SHORT) : null;
                    AbstractC6392a abstractC6392aD = companion.d(i10, str, str2 != null ? str2 : "");
                    if (abstractC6392aD != null) {
                        return abstractC6392aD;
                    }
                }
            }
            return AbstractC6392a.INSTANCE.a();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$clipCoupon$1", f = "WeeklyAdDetailViewModel.kt", l = {352}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26981a;

        /* renamed from: b, reason: collision with root package name */
        Object f26982b;

        /* renamed from: c, reason: collision with root package name */
        Object f26983c;

        /* renamed from: d, reason: collision with root package name */
        Object f26984d;

        /* renamed from: e, reason: collision with root package name */
        int f26985e;

        /* renamed from: f, reason: collision with root package name */
        int f26986f;

        /* renamed from: g, reason: collision with root package name */
        int f26987g;

        /* renamed from: h, reason: collision with root package name */
        int f26988h;

        /* renamed from: i, reason: collision with root package name */
        int f26989i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f26990j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Coupon f26992l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Coupon coupon, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f26992l = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = e.this.new k(this.f26992l, continuation);
            kVar.f26990j = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26989i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f26990j;
                    e eVar = e.this;
                    Coupon coupon = this.f26992l;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.u<ClipUnclipCouponResponse> uVarH = eVar.couponsRepository.h(coupon);
                    this.f26990j = interfaceC15783O;
                    this.f26981a = interfaceC15783O;
                    this.f26982b = this;
                    this.f26983c = this;
                    this.f26984d = interfaceC15783O;
                    this.f26985e = 0;
                    this.f26986f = 0;
                    this.f26987g = 0;
                    this.f26988h = 0;
                    this.f26989i = 1;
                    obj = tv.c.b(uVarH, this);
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
            Coupon coupon2 = this.f26992l;
            if (Result.h(objB)) {
                eVar2.a0(coupon2);
            }
            e eVar3 = e.this;
            Coupon coupon3 = this.f26992l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                eVar3.Z(new CouponException(thE, coupon3));
            }
            return Unit.f143329a;
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
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$fetchSpecialOffersBannerUrl$1", f = "WeeklyAdDetailViewModel.kt", l = {453}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26993a;

        /* renamed from: b, reason: collision with root package name */
        Object f26994b;

        /* renamed from: c, reason: collision with root package name */
        Object f26995c;

        /* renamed from: d, reason: collision with root package name */
        Object f26996d;

        /* renamed from: e, reason: collision with root package name */
        int f26997e;

        /* renamed from: f, reason: collision with root package name */
        int f26998f;

        /* renamed from: g, reason: collision with root package name */
        int f26999g;

        /* renamed from: h, reason: collision with root package name */
        int f27000h;

        /* renamed from: i, reason: collision with root package name */
        int f27001i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f27002j;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = e.this.new n(continuation);
            nVar.f27002j = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27001i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f27002j;
                    e eVar = e.this;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.u<SpecialOffersUrlResponse> uVarU = eVar.couponsRepository.u();
                    this.f27002j = interfaceC15783O;
                    this.f26993a = interfaceC15783O;
                    this.f26994b = this;
                    this.f26995c = this;
                    this.f26996d = interfaceC15783O;
                    this.f26997e = 0;
                    this.f26998f = 0;
                    this.f26999g = 0;
                    this.f27000h = 0;
                    this.f27001i = 1;
                    obj = tv.c.b(uVarU, this);
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
                qw.a.INSTANCE.f(thE, "fetchSpecialOffersBannerUrl Failed from WeeklyAdDetailViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAction$1$1", f = "WeeklyAdDetailViewModel.kt", l = {226}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27004a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f27006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(WeeklyAdItem weeklyAdItem, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f27006c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new o(this.f27006c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27004a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ViewInShoppingList viewInShoppingList = new g.ViewInShoppingList(this.f27006c);
                this.f27004a = 1;
                if (interfaceC16548A.emit(viewInShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAction$2$1", f = "WeeklyAdDetailViewModel.kt", l = {521}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27007a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f27009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(WeeklyAdItem weeklyAdItem, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f27009c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new p(this.f27009c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27007a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                if (this.f27009c.getVideoType() == Js.f.f16223b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String videoUrl = this.f27009c.getVideoUrl();
                if (videoUrl == null) {
                    videoUrl = "";
                }
                g.VideoTapped videoTapped = new g.VideoTapped(z10, videoUrl);
                this.f27007a = 1;
                if (interfaceC16548A.emit(videoTapped, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$1", f = "WeeklyAdDetailViewModel.kt", l = {246}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27010a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27010a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ActionRequiresLogin actionRequiresLogin = new g.ActionRequiresLogin(C18546a.f173198e);
                this.f27010a = 1;
                if (interfaceC16548A.emit(actionRequiresLogin, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$2$1", f = "WeeklyAdDetailViewModel.kt", l = {250}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27012a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f27014c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(WeeklyAdItem weeklyAdItem, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f27014c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new r(this.f27014c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27012a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ViewInShoppingList viewInShoppingList = new g.ViewInShoppingList(this.f27014c);
                this.f27012a = 1;
                if (interfaceC16548A.emit(viewInShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$4$1", f = "WeeklyAdDetailViewModel.kt", l = {265}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f27015a;

        /* renamed from: b, reason: collision with root package name */
        Object f27016b;

        /* renamed from: c, reason: collision with root package name */
        Object f27017c;

        /* renamed from: d, reason: collision with root package name */
        Object f27018d;

        /* renamed from: e, reason: collision with root package name */
        int f27019e;

        /* renamed from: f, reason: collision with root package name */
        int f27020f;

        /* renamed from: g, reason: collision with root package name */
        int f27021g;

        /* renamed from: h, reason: collision with root package name */
        int f27022h;

        /* renamed from: i, reason: collision with root package name */
        int f27023i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f27024j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f27026l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$4$1$2$2", f = "WeeklyAdDetailViewModel.kt", l = {281}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f27027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f27028b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27028b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f27028b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f27027a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f27028b._effectsFlow;
                    g.b bVar = g.b.f26957a;
                    this.f27027a = 1;
                    if (interfaceC16548A.emit(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onAddToShoppingListClicked$1$4$1$3$1", f = "WeeklyAdDetailViewModel.kt", l = {286}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f27029a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f27030b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f27030b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f27030b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f27029a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f27030b._effectsFlow;
                    g.c cVar = g.c.f26958a;
                    this.f27029a = 1;
                    if (interfaceC16548A.emit(cVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(WeeklyAdItem weeklyAdItem, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f27026l = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = e.this.new s(this.f27026l, continuation);
            sVar.f27024j = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object value;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27023i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f27024j;
                    e eVar = e.this;
                    WeeklyAdItem weeklyAdItem = this.f27026l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = eVar.shoppingListRepository;
                    ShoppingListItem shoppingListItemE = Fq.d.e(weeklyAdItem, eVar.storeProvider.b());
                    this.f27024j = interfaceC15783O;
                    this.f27015a = interfaceC15783O;
                    this.f27016b = this;
                    this.f27017c = this;
                    this.f27018d = interfaceC15783O;
                    this.f27019e = 0;
                    this.f27020f = 0;
                    this.f27021g = 0;
                    this.f27022h = 0;
                    this.f27023i = 1;
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
                qw.a.INSTANCE.f(thE, "AddShoppingListItem failed from WeeklyAdDetailViewModel", new Object[0]);
                eVar2.loadingStateManager.b(new a.Failed("weeklyAdDetail ShoppingList", null, 2, null));
                InterfaceC16549B interfaceC16549B = eVar2._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, false, false, false, null, null, false, null, 495, null)));
                C15809k.d(d0.a(eVar2), null, null, new a(eVar2, null), 3, null);
            }
            e eVar3 = e.this;
            if (Result.h(objB)) {
                eVar3.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
                C15809k.d(d0.a(eVar3), null, null, new b(eVar3, null), 3, null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponCallFailure$1", f = "WeeklyAdDetailViewModel.kt", l = {378}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27031a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27031a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(0, qk.f.f158513k);
                this.f27031a = 1;
                if (interfaceC16548A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponCallFailure$2", f = "WeeklyAdDetailViewModel.kt", l = {389}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27033a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponException f27035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(CouponException couponException, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f27035c = couponException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new u(this.f27035c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f27033a;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                if (this.f27035c.getErrorType() == AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR) {
                    i10 = Nr.g.f22656G;
                } else {
                    i10 = 0;
                }
                sk.b errorType = this.f27035c.getErrorType();
                Intrinsics.g(errorType);
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(i10, errorType.getErrorResourceId());
                this.f27033a = 1;
                if (interfaceC16548A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponCallFailure$3", f = "WeeklyAdDetailViewModel.kt", l = {HttpResponseStatus.ERROR_NOT_FOUND}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27036a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27036a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(0, Nr.g.f22712s);
                this.f27036a = 1;
                if (interfaceC16548A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onClipCouponSuccess$1", f = "WeeklyAdDetailViewModel.kt", l = {367}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27038a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f27040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Coupon coupon, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f27040c = coupon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new w(this.f27040c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27038a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ShowCouponClippedSnackBar showCouponClippedSnackBar = new g.ShowCouponClippedSnackBar(this.f27040c);
                this.f27038a = 1;
                if (interfaceC16548A.emit(showCouponClippedSnackBar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onDataRetrieved$2", f = "WeeklyAdDetailViewModel.kt", l = {199}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27041a;

        x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new x(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27041a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Eq.b bVar = e.this.shoppingListRepository;
                this.f27041a = 1;
                if (bVar.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onGetCouponsFailed$2", f = "WeeklyAdDetailViewModel.kt", l = {490}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f27043a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ sk.b f27045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(sk.b bVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f27045c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new y(this.f27045c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27043a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e.this._effectsFlow;
                g.ShowErrorAlert showErrorAlert = new g.ShowErrorAlert(0, ((CouponsResponse.EnumC2049a) this.f27045c).getErrorResourceId());
                this.f27043a = 1;
                if (interfaceC16548A.emit(showErrorAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onRemoveFromShoppingList$2", f = "WeeklyAdDetailViewModel.kt", l = {HttpResponseStatus.REDIRECTION_SEE_OTHER}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f27046a;

        /* renamed from: b, reason: collision with root package name */
        Object f27047b;

        /* renamed from: c, reason: collision with root package name */
        Object f27048c;

        /* renamed from: d, reason: collision with root package name */
        Object f27049d;

        /* renamed from: e, reason: collision with root package name */
        int f27050e;

        /* renamed from: f, reason: collision with root package name */
        int f27051f;

        /* renamed from: g, reason: collision with root package name */
        int f27052g;

        /* renamed from: h, reason: collision with root package name */
        int f27053h;

        /* renamed from: i, reason: collision with root package name */
        int f27054i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f27055j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f27057l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdDetailViewModel$onRemoveFromShoppingList$2$2$2", f = "WeeklyAdDetailViewModel.kt", l = {316}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f27058a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f27059b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27059b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f27059b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f27058a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f27059b._effectsFlow;
                    g.d dVar = g.d.f26959a;
                    this.f27058a = 1;
                    if (interfaceC16548A.emit(dVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(WeeklyAdItem weeklyAdItem, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f27057l = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            z zVar = e.this.new z(this.f27057l, continuation);
            zVar.f27055j = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object value;
            Object objO;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f27054i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f27055j;
                    e eVar = e.this;
                    WeeklyAdItem weeklyAdItem = this.f27057l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = eVar.shoppingListRepository;
                    Intrinsics.g(weeklyAdItem);
                    this.f27055j = interfaceC15783O;
                    this.f27046a = interfaceC15783O;
                    this.f27047b = this;
                    this.f27048c = this;
                    this.f27049d = interfaceC15783O;
                    this.f27050e = 0;
                    this.f27051f = 0;
                    this.f27052g = 0;
                    this.f27053h = 0;
                    this.f27054i = 1;
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
                qw.a.INSTANCE.f(thE, "Error removing from ShoppingList WeeklyAdDetailViewmodel", new Object[0]);
                InterfaceC16549B interfaceC16549B = eVar2._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, false, false, true, null, null, false, null, 495, null)));
                eVar2.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
                C15809k.d(d0.a(eVar2), null, null, new a(eVar2, null), 3, null);
            }
            e eVar3 = e.this;
            if (Result.h(objB)) {
                eVar3.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
            }
            return Unit.f143329a;
        }
    }

    public e(Eq.b shoppingListRepository, Ls.b getFlippWeeklyAdProductDetailsCall, C13702d couponsRepository, Yk.u couponStateRepository, yo.k userManager, Tq.j storeProvider, AbstractC15779K ioDispatcher) {
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
        Pj.c cVar = new Pj.c();
        this.loadingStateManager = cVar;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(null, false, false, false, false, null, null, false, null, 511, null));
        this._viewState = interfaceC16549BA;
        this._effectsFlow = C16555H.b(0, 1, null, 5, null);
        this.viewState = C16563h.c(interfaceC16549BA);
        io.reactivex.l<List<CouponState>> lVarSubscribeOn = couponStateRepository.O().subscribeOn(C13889a.b());
        final C4640a c4640a = new C4640a(this);
        Lu.g<? super List<CouponState>> gVar = new Lu.g() { // from class: Ps.c
            @Override // Lu.g
            public final void accept(Object obj) {
                e.q(c4640a, obj);
            }
        };
        final C4641b c4641b = new C4641b(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: Ps.d
            @Override // Lu.g
            public final void accept(Object obj) {
                e.r(c4641b, obj);
            }
        }), aVar);
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new C4642c(this)), new C4643d(null)), d0.a(this));
    }

    private final void P(List<Long> relatedOfferIds) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(viewState.getCouponState(), null, null, false, new a.Loading(null, null, 3, null), 7, null), false, false, false, false, null, null, false, null, 510, null)));
        io.reactivex.u uVarK = C13702d.B(this.couponsRepository, new CouponOptions(null, null, CouponsSortType.EXPIRING, false, false, 0L, null, null, false, CollectionsKt.m1(relatedOfferIds), null, false, false, 7675, null), false, false, false, 14, null).k(Iu.a.a());
        final l lVar = new l(this);
        Lu.g gVar = new Lu.g() { // from class: Ps.a
            @Override // Lu.g
            public final void accept(Object obj) {
                e.Q(lVar, obj);
            }
        };
        final m mVar = new m(this);
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Ps.b
            @Override // Lu.g
            public final void accept(Object obj) {
                e.R(mVar, obj);
            }
        }), this.disposables);
    }

    private final void Y(WeeklyAdItem weeklyAdItem) {
        ViewState value;
        ViewState value2 = this.viewState.getValue();
        if (!this.userManager.b()) {
            C15809k.d(d0.a(this), null, null, new q(null), 3, null);
            return;
        }
        if (value2.getIsOnShoppingList()) {
            WeeklyAdItem weeklyAdItem2 = value2.getWeeklyAdItem();
            if (weeklyAdItem2 != null) {
                C15809k.d(d0.a(this), null, null, new r(weeklyAdItem2, null), 3, null);
                return;
            }
            return;
        }
        this.loadingStateManager.b(new a.Loading("weeklyAdDetail ShoppingList", null, 2, null));
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, true, null, null, false, null, 495, null)));
        if (weeklyAdItem != null) {
            C15809k.d(d0.a(this), this.ioDispatcher, null, new s(weeklyAdItem, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(CouponException exception) {
        if (exception.getErrorType() != null) {
            sk.b errorType = exception.getErrorType();
            Intrinsics.g(errorType);
            if (errorType.getResultCode() > 30) {
                return;
            }
        }
        if (exception.getExceptionKind() == RetrofitException.b.f97000b) {
            C15809k.d(d0.a(this), null, null, new t(null), 3, null);
        } else if (exception.getErrorType() != null) {
            C15809k.d(d0.a(this), null, null, new u(exception, null), 3, null);
        } else {
            C15809k.d(d0.a(this), null, null, new v(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(Coupon coupon) {
        this.couponStateRepository.S(CollectionsKt.e(Coupon.e(coupon, 0L, false, false, null, null, true, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741791, null)));
        C15809k.d(d0.a(this), null, null, new w(coupon, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(WeeklyAdItem weeklyAdItem) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, true, false, false, false, weeklyAdItem != null ? WeeklyAdItem.b(weeklyAdItem, 0, 0, null, null, null, 0, 0, null, null, null, 0L, null, CollectionsKt.m1(CollectionsKt.P0(weeklyAdItem.o(), viewState.i())), null, null, null, null, null, false, null, null, null, 4190207, null) : null, null, false, null, 477, null)));
        this.loadingStateManager.b(new a.NotLoading("weeklyAdDetail Ad"));
        C15809k.d(d0.a(this), null, null, new x(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(Throwable e10) {
        ViewState value;
        qw.a.INSTANCE.f(e10, "WeeklyAdProductDetailCall failed in WeeklyAdDetailViewModel", new Object[0]);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, null, 509, null)));
        this.loadingStateManager.b(new a.Failed("weeklyAdDetail Ad", null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(SpecialOffersUrlResponse response) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(viewState.getCouponState(), null, response.getSpecialOffersBannerURL(), false, new a.NotLoading(null, 1, null), 5, null), false, false, false, false, null, null, false, null, 510, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(Throwable exception) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, viewState.getCouponState().a(CollectionsKt.m(), null, false, new a.Failed(null, null, 3, null)), false, false, false, false, null, null, false, null, 510, null)));
        sk.b errorType = com.meijer.mobile.core.networking.exceptions.a.a(exception).getErrorType();
        if (errorType instanceof CouponsResponse.EnumC2049a) {
            C15809k.d(d0.a(this), null, null, new y(errorType, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(CouponsResponse couponsResponse) {
        ViewState value;
        ViewState viewState;
        Yk.u uVar = this.couponStateRepository;
        List<Coupon> listF = couponsResponse.f();
        Intrinsics.g(listF);
        uVar.R(listF);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(viewState.getCouponState(), null, couponsResponse.getSpecialOffersUrl(), couponsResponse.getHasSpecialOffers(), new a.NotLoading(null, 1, null), 1, null), false, false, false, false, null, null, false, null, 510, null)));
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
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
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
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, false, false, z10, null, null, false, null, 495, null)));
        this.loadingStateManager.b(new a.NotLoading("weeklyAdDetail ShoppingList"));
    }

    private final void h0(WeeklyAdItem weeklyAdItem) {
        ViewState value;
        this.loadingStateManager.b(new a.Loading("weeklyAdDetail ShoppingList", null, 2, null));
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, null, 495, null)));
        C15809k.d(d0.a(this), this.ioDispatcher, null, new z(weeklyAdItem, null), 2, null);
    }

    private final void i0() {
        ViewState value;
        this.loadingStateManager.b(new a.Loading("weeklyAdDetail Ad", null, 2, null));
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, null, 509, null)));
        P(this.viewState.getValue().i());
        C15809k.d(d0.a(this), this.ioDispatcher, null, new C(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponState(List<CouponState> couponStateList) {
        ViewState value;
        ViewState viewState;
        WeeklyAdDetailsCouponState couponState;
        ArrayList arrayList;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            couponState = viewState.getCouponState();
            List<CouponState> list = couponStateList;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Qr.a.n(((CouponState) it.next()).getCoupon()));
            }
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, WeeklyAdDetailsCouponState.b(couponState, arrayList, null, false, null, 14, null), false, false, false, false, null, null, false, null, 510, null)));
    }

    private final void onLoadingStates(List<? extends Pj.a> loadingStates) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            List<? extends Pj.a> list = loadingStates;
            if (interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, false, null, null, false, list, l3.f93323c, null))) {
                return;
            } else {
                loadingStates = list;
            }
        }
    }

    public final InterfaceC16553F<g> T() {
        return C16563h.b(this._effectsFlow);
    }

    public final P<ViewState> U() {
        return this.viewState;
    }

    public final void V(int weeklyAdItemId, int publicationId, boolean isFromShoppingList, List<Long> relatedOffersIds) {
        List<Long> relatedOffersIds2 = relatedOffersIds;
        Intrinsics.j(relatedOffersIds2, "relatedOffersIds");
        this.weeklyAdItemId = new LockedInt(weeklyAdItemId);
        this.publicationId = new LockedInt(publicationId);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            if (interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, false, null, relatedOffersIds2, isFromShoppingList, null, 319, null))) {
                i0();
                return;
            }
            relatedOffersIds2 = relatedOffersIds;
        }
    }

    public final void W(AbstractC0495e action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC0495e.RefreshCoupons) {
            P(((AbstractC0495e.RefreshCoupons) action).a());
            return;
        }
        if (action instanceof AbstractC0495e.b) {
            i0();
        } else {
            if (!(action instanceof AbstractC0495e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            WeeklyAdItem weeklyAdItem = this.viewState.getValue().getWeeklyAdItem();
            if (weeklyAdItem != null) {
                C15809k.d(d0.a(this), null, null, new p(weeklyAdItem, null), 3, null);
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
                C15809k.d(d0.a(this), null, null, new o(weeklyAdItem, null), 3, null);
            }
        }
    }

    public void onAction(Qk.a action) {
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
            qw.a.INSTANCE.s("Requested unsupported action: " + action, new Object[0]);
        }
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        C15809k.d(d0.a(this), null, null, new A(null), 3, null);
        if (Pj.b.c(this.viewState.getValue().f(), "weeklyAdDetail Ad")) {
            i0();
        } else {
            C15809k.d(d0.a(this), null, null, new B(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Coupon coupon) {
        C15809k.d(d0.a(this), this.ioDispatcher, null, new k(coupon, null), 2, null);
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
        C15809k.d(d0.a(this), this.ioDispatcher, null, new n(null), 2, null);
    }

    private final void j0(Pk.c couponIdentity) {
        C15809k.d(d0.a(this), this.ioDispatcher, null, new D(couponIdentity, null), 2, null);
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
        return Unit.f143329a;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
