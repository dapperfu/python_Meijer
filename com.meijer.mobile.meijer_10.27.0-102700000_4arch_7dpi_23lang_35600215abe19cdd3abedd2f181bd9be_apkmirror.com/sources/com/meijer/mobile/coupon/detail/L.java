package com.meijer.mobile.coupon.detail;

import Ao.C2930u;
import Co.ProductFullDetails;
import Ir.UserActionDialogInfo;
import Ok.Coupon;
import Pk.a;
import Tr.C5283b;
import Tr.CouponsListChange;
import Wr.CouponSavingsCountdownDecorator;
import Xk.CouponState;
import Yr.CouponsProductDecorator;
import ak.AbstractC5607a;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import cl.C6412d;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ej.Entry;
import ej.EntryChange;
import ej.ShoppingCart;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import retrofit2.Response;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.S;
import ur.AbstractC17302a;
import uw.a;
import vl.ProductEligibility;
import vr.AbstractC17604a;
import wr.InterfaceC17847a;
import yl.AbstractC18227f;
import yr.Q;
import zs.C18570a;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005jdhbfBY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010!\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010\u001cJ\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b6\u00105J!\u0010;\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010\u001cJ\u0017\u0010>\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b>\u0010/J!\u0010?\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u0002092\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001aH\u0014¢\u0006\u0004\bG\u0010\u001cJ-\u0010L\u001a\u00020J2\u0006\u0010'\u001a\u00020&2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001e2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001aH\u0000¢\u0006\u0004\bN\u0010\u001cJ\u001b\u0010Q\u001a\u0002022\n\u0010P\u001a\u000609j\u0002`OH\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020V¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b]\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020x0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020x0|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u0002020\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020s0\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lyo/k;", "userManager", "LTr/b;", "couponChangeManager", "LEq/b;", "shoppingListRepository", "Lhl/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lgi/a;", "analyticsEngine", "Lcl/d;", "couponsRepository", "LXk/u;", "couponStateRepository", "Lyo/f;", "storeManager", "Lyl/k;", "featureManager", "<init>", "(Lyo/k;LTr/b;LEq/b;Lhl/m;Lwr/f;Lgi/a;Lcl/d;LXk/u;Lyo/f;Lyl/k;)V", "", "h0", "()V", "d0", "", "LXk/c;", "couponStateList", "onCouponState", "(Ljava/util/List;)V", "X", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z0", "LOk/a;", "coupon", "p0", "(LOk/a;)V", "o0", "B0", "Lcom/meijer/mobile/coupon/detail/L$d;", "action", "r0", "(Lcom/meijer/mobile/coupon/detail/L$d;)V", "LCo/h;", "product", "", "quantityToUpdate", "q0", "(LCo/h;D)V", "O0", "LOk/c;", "couponIdentity", "", "previousTrackAction", "i0", "(LOk/c;Ljava/lang/String;)V", "K0", "I0", "M0", "(LOk/a;Ljava/lang/String;)V", "c0", "(LOk/a;)Ljava/lang/String;", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "Lej/i;", "matchingProducts", "LWr/a;", "oldState", "b0", "(LOk/a;Ljava/util/List;LWr/a;)LWr/a;", "A0", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "Y", "(Ljava/lang/String;)D", "LPk/a;", "onAction", "(LPk/a;)V", "Lcom/meijer/mobile/coupon/detail/L$c;", "n0", "(Lcom/meijer/mobile/coupon/detail/L$c;)V", "Lej/j;", "entryChange", "G0", "(Lej/j;)V", "H0", "a", "Lyo/k;", "b", "LTr/b;", "c", "LEq/b;", "d", "Lhl/m;", "e", "Lwr/f;", "f", "Lgi/a;", "g", "Lcl/d;", "h", "LXk/u;", "i", "Lyo/f;", "j", "Lyl/k;", "Ltv/B;", "Lcom/meijer/mobile/coupon/detail/L$g;", "k", "Ltv/B;", "_couponDetailStateFlow", "Ltv/A;", "Lcom/meijer/mobile/coupon/detail/L$f;", "l", "Ltv/A;", "_eventFlow", "Ltv/F;", "m", "Ltv/F;", "a0", "()Ltv/F;", "eventFlow", "LNu/a;", "n", "LNu/a;", "disposables", "", "o", "Ljava/util/Map;", "lastKnownCartQuantities", "Lej/C;", "p", "Lej/C;", "cart", "Ltv/P;", "Z", "()Ltv/P;", "couponDetailStateFlow", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class L extends c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5283b couponChangeManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Xk.u couponStateRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _couponDetailStateFlow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<f> _eventFlow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<f> eventFlow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Double> lastKnownCartQuantities;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ShoppingCart cart;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$removeCouponFromShoppingList$2$4$1", f = "CouponDetailViewModel.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class A extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96249a;

        A(Continuation<? super A> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new A(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96249a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(C18570a.f173242j, C18570a.f173241i, false, 4, null);
                this.f96249a = 1;
                if (interfaceC17139A.emit(simpleOkAlertDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$resetQuantitySteppers$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class B extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96251a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            ArrayList arrayList;
            CouponsProductDecorator couponDetailProductDecoratorSingleItem;
            IntrinsicsKt.f();
            if (this.f96251a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
            L l10 = L.this;
            do {
                value = interfaceC17140B.getValue();
                viewState = (ViewState) value;
                List<CouponsProductDecorator> listF = viewState.f();
                if (listF != null) {
                    List<CouponsProductDecorator> list = listF;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                    for (CouponsProductDecorator couponsProductDecorator : list) {
                        arrayList2.add(CouponsProductDecorator.v(couponsProductDecorator, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, l10.Y(couponsProductDecorator.getProduct().getCode()), false, true, null, null, null, null, null, false, null, 33325055, null));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                couponDetailProductDecoratorSingleItem = viewState.getCouponDetailProductDecoratorSingleItem();
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, l10.Y(viewState.getCouponDetailProductDecoratorSingleItem().getProduct().getCode()), false, true, null, null, null, null, null, false, null, 33325055, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$setNotInterested$3", f = "CouponDetailViewModel.kt", l = {344}, m = "invokeSuspend")
    static final class C extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96253a;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96253a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.RequiresLoginEvent requiresLoginEvent = new f.RequiresLoginEvent(Mk.a.f19676d);
                this.f96253a = 1;
                if (interfaceC17139A.emit(requiresLoginEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$a, reason: case insensitive filesystem */
    /* synthetic */ class C11590a extends FunctionReferenceImpl implements Function1<List<? extends CouponState>, Unit> {
        C11590a(Object obj) {
            super(1, obj, L.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 0);
        }

        public final void a(List<CouponState> p02) {
            Intrinsics.j(p02, "p0");
            ((L) this.receiver).onCouponState(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CouponState> list) {
            a(list);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$b, reason: case insensitive filesystem */
    /* synthetic */ class C11591b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C11591b(Object obj) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c;", "", "<init>", "()V", "a", "c", "d", "b", "e", "f", "g", "Lcom/meijer/mobile/coupon/detail/L$c$a;", "Lcom/meijer/mobile/coupon/detail/L$c$b;", "Lcom/meijer/mobile/coupon/detail/L$c$c;", "Lcom/meijer/mobile/coupon/detail/L$c$d;", "Lcom/meijer/mobile/coupon/detail/L$c$e;", "Lcom/meijer/mobile/coupon/detail/L$c$f;", "Lcom/meijer/mobile/coupon/detail/L$c$g;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$c, reason: case insensitive filesystem */
    public static abstract class AbstractC11592c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$a;", "Lcom/meijer/mobile/coupon/detail/L$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$a */
        public static final /* data */ class a extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f96255a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1909955095;
            }

            public String toString() {
                return "AddCouponToShoppingList";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$b;", "Lcom/meijer/mobile/coupon/detail/L$c;", "LOk/c;", "coupon", "", "previousTrackAction", "<init>", "(LOk/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOk/c;", "()LOk/c;", "b", "Ljava/lang/String;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$b, reason: from toString */
        public static final /* data */ class Initialize extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ok.c coupon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String previousTrackAction;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialize)) {
                    return false;
                }
                Initialize initialize = (Initialize) other;
                return Intrinsics.e(this.coupon, initialize.coupon) && Intrinsics.e(this.previousTrackAction, initialize.previousTrackAction);
            }

            public int hashCode() {
                int iHashCode = this.coupon.hashCode() * 31;
                String str = this.previousTrackAction;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Initialize(coupon=" + this.coupon + ", previousTrackAction=" + this.previousTrackAction + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initialize(Ok.c coupon, String str) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
                this.previousTrackAction = str;
            }

            /* renamed from: a, reason: from getter */
            public final Ok.c getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$c;", "Lcom/meijer/mobile/coupon/detail/L$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$c, reason: collision with other inner class name */
        public static final /* data */ class C1365c extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1365c f96258a = new C1365c();

            private C1365c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1365c);
            }

            public int hashCode() {
                return -2122815381;
            }

            public String toString() {
                return "RemoveCouponFromShoppingList";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$d;", "Lcom/meijer/mobile/coupon/detail/L$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$d */
        public static final /* data */ class d extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f96259a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 890151786;
            }

            public String toString() {
                return "RetryFetchProductList";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$e;", "Lcom/meijer/mobile/coupon/detail/L$c;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$e, reason: from toString */
        public static final /* data */ class StepperChange extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double quantityToUpdate;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepperChange)) {
                    return false;
                }
                StepperChange stepperChange = (StepperChange) other;
                return Intrinsics.e(this.product, stepperChange.product) && Double.compare(this.quantityToUpdate, stepperChange.quantityToUpdate) == 0;
            }

            public int hashCode() {
                return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
            }

            public String toString() {
                return "StepperChange(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StepperChange(ProductFullDetails product, double d10) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
                this.quantityToUpdate = d10;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            /* renamed from: b, reason: from getter */
            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$f;", "Lcom/meijer/mobile/coupon/detail/L$c;", "Lur/a;", "cartUpdateRequest", "<init>", "(Lur/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lur/a;", "()Lur/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$f, reason: from toString */
        public static final /* data */ class UserAcceptAddToCartAction extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17302a cartUpdateRequest;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserAcceptAddToCartAction) && Intrinsics.e(this.cartUpdateRequest, ((UserAcceptAddToCartAction) other).cartUpdateRequest);
            }

            public int hashCode() {
                return this.cartUpdateRequest.hashCode();
            }

            public String toString() {
                return "UserAcceptAddToCartAction(cartUpdateRequest=" + this.cartUpdateRequest + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserAcceptAddToCartAction(AbstractC17302a cartUpdateRequest) {
                super(null);
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                this.cartUpdateRequest = cartUpdateRequest;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC17302a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$g;", "Lcom/meijer/mobile/coupon/detail/L$c;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$g, reason: from toString */
        public static final /* data */ class UserDeclineAddToCartAction extends AbstractC11592c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String code;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserDeclineAddToCartAction) && Intrinsics.e(this.code, ((UserDeclineAddToCartAction) other).code);
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            public String toString() {
                return "UserDeclineAddToCartAction(code=" + this.code + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserDeclineAddToCartAction(String code) {
                super(null);
                Intrinsics.j(code, "code");
                this.code = code;
            }
        }

        public /* synthetic */ AbstractC11592c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11592c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f96264a = new d("CLIP", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f96265b = new d("UNCLIP", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ d[] f96266c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f96267d;

        private static final /* synthetic */ d[] a() {
            return new d[]{f96264a, f96265b};
        }

        static {
            d[] dVarArrA = a();
            f96266c = dVarArrA;
            f96267d = EnumEntriesKt.a(dVarArrA);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f96266c.clone();
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\tJ%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$e;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/coupon/detail/L;)V", "Ltk/c;", "Lej/j;", "entryChange", "", "a", "(Ltk/c;)V", "d", "b", "", "Lej/i;", "entries", "c", "(Ljava/util/List;)V", "Lej/C;", "cartResource", "observeCart", "Lur/a;", "processedRequest", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "LNu/a;", "getDisposable", "()LNu/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private final class e implements InterfaceC17847a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f128931b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f128933d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f128932c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f128934e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EntryChange.c.f128935f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EntryChange.c.f128936g.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EntryChange.c.f128937h.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$2", f = "CouponDetailViewModel.kt", l = {829}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96270b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L l10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f96270b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f96270b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96269a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96270b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96402a, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96270b._eventFlow;
                    f.UpdateCartSuccessEvent updateCartSuccessEvent = new f.UpdateCartSuccessEvent(C17135b.f162019f, C17135b.f162001T0);
                    this.f96269a = 1;
                    if (interfaceC17139A.emit(updateCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$3", f = "CouponDetailViewModel.kt", l = {843}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96271a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96272b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l10, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f96272b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f96272b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96271a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96272b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96272b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161979I0);
                    this.f96271a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f96272b.A0();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$4", f = "CouponDetailViewModel.kt", l = {855}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96273a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96274b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(L l10, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f96274b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f96274b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96273a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96274b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96274b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161981J0);
                    this.f96273a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f96274b.A0();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$5", f = "CouponDetailViewModel.kt", l = {877}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.coupon.detail.L$e$e, reason: collision with other inner class name */
        static final class C1366e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96275a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96276b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1366e(L l10, Continuation<? super C1366e> continuation) {
                super(2, continuation);
                this.f96276b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1366e(this.f96276b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1366e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96275a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96276b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96276b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161993P0);
                    this.f96275a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f96276b.A0();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$observeCart$1", f = "CouponDetailViewModel.kt", l = {726}, m = "invokeSuspend")
        static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96278b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(L l10, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f96278b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f96278b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96277a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f96278b._eventFlow;
                    f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(Q.f170963F, Q.f170962E, true);
                    this.f96277a = 1;
                    if (interfaceC17139A.emit(simpleOkAlertDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$observeCart$2$1$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CouponState f96281c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ShoppingCart f96282d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f96280b, this.f96281c, this.f96282d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(L l10, CouponState couponState, ShoppingCart shoppingCart, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f96280b = l10;
                this.f96281c = couponState;
                this.f96282d = shoppingCart;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ViewState viewState;
                Coupon couponE;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f96279a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f96280b._couponDetailStateFlow;
                L l10 = this.f96280b;
                CouponState couponState = this.f96281c;
                ShoppingCart shoppingCart = this.f96282d;
                do {
                    value = interfaceC17140B.getValue();
                    viewState = (ViewState) value;
                    couponE = Coupon.e(couponState.getCoupon(), 0L, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741823, null);
                    List<Entry> listP = shoppingCart.p();
                    arrayList = new ArrayList();
                    for (Object obj2 : listP) {
                        List<Long> listO = ((Entry) obj2).m().o();
                        if (listO == null) {
                            listO = CollectionsKt.m();
                        }
                        if (listO.contains(Boxing.e(couponState.getOfferId()))) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, 0, null, null, false, l10.b0(couponE, arrayList, viewState.getCountdownDecorator()), null, null, false, 959, null)));
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$processedRequest$1", f = "CouponDetailViewModel.kt", l = {765}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f96283a;

            /* renamed from: b, reason: collision with root package name */
            int f96284b;

            /* renamed from: c, reason: collision with root package name */
            int f96285c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f96286d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ L f96287e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(L l10, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f96287e = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                h hVar = new h(this.f96287e, continuation);
                hVar.f96286d = obj;
                return hVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qv.O] */
            /* JADX WARN: Type inference failed for: r1v8, types: [qv.O] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objB;
                ?? r12;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96285c;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ?? r13 = (InterfaceC16622O) this.f96286d;
                            ResultKt.b(obj);
                            i10 = r13;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        ?? r14 = (InterfaceC16622O) this.f96286d;
                        L l10 = this.f96287e;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = l10.cartInteractor;
                        this.f96286d = r14;
                        this.f96283a = r14;
                        this.f96284b = 0;
                        this.f96285c = 1;
                        i10 = r14;
                        if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b(Unit.f142422a);
                    r12 = i10;
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(th2));
                    r12 = i10;
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    E0.i(r12.getCoroutineContext());
                    if (!(thE instanceof Error)) {
                        uw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
                    } else {
                        throw thE;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$processedRequest$2", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96288a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96289b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17302a f96290c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f96289b, this.f96290c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(L l10, AbstractC17302a abstractC17302a, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f96289b = l10;
                this.f96290c = abstractC17302a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ViewState viewState;
                ArrayList arrayList;
                CouponsProductDecorator couponDetailProductDecoratorSingleItem;
                IntrinsicsKt.f();
                if (this.f96288a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f96289b._couponDetailStateFlow;
                AbstractC17302a abstractC17302a = this.f96290c;
                do {
                    value = interfaceC17140B.getValue();
                    viewState = (ViewState) value;
                    List<CouponsProductDecorator> listF = viewState.f();
                    if (listF != null) {
                        List<CouponsProductDecorator> list = listF;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                        for (CouponsProductDecorator couponsProductDecoratorV : list) {
                            if (Intrinsics.e(couponsProductDecoratorV.getProduct().getCode(), abstractC17302a.getProductCode())) {
                                couponsProductDecoratorV = CouponsProductDecorator.v(couponsProductDecoratorV, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33488895, null);
                            }
                            arrayList2.add(couponsProductDecoratorV);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    couponDetailProductDecoratorSingleItem = viewState.getCouponDetailProductDecoratorSingleItem();
                } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33488895, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$removeCartEntry$2", f = "CouponDetailViewModel.kt", l = {966}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96291a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96292b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(L l10, Continuation<? super j> continuation) {
                super(2, continuation);
                this.f96292b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new j(this.f96292b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96291a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96292b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96402a, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96292b._eventFlow;
                    f.UpdateCartSuccessEvent updateCartSuccessEvent = new f.UpdateCartSuccessEvent(C17135b.f161988N, C17135b.f162001T0);
                    this.f96291a = 1;
                    if (interfaceC17139A.emit(updateCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$removeCartEntry$3", f = "CouponDetailViewModel.kt", l = {978}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96293a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96294b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(L l10, Continuation<? super k> continuation) {
                super(2, continuation);
                this.f96294b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new k(this.f96294b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96293a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96294b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96294b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161993P0);
                    this.f96293a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f96294b.A0();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$syncSteppersWithCartData$3", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96295a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96296b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f96297c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(L l10, List<String> list, Continuation<? super l> continuation) {
                super(2, continuation);
                this.f96296b = l10;
                this.f96297c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new l(this.f96296b, this.f96297c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ViewState viewState;
                ArrayList arrayList;
                CouponsProductDecorator couponDetailProductDecoratorSingleItem;
                IntrinsicsKt.f();
                if (this.f96295a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f96296b._couponDetailStateFlow;
                L l10 = this.f96296b;
                List<String> list = this.f96297c;
                do {
                    value = interfaceC17140B.getValue();
                    viewState = (ViewState) value;
                    List<CouponsProductDecorator> listF = viewState.f();
                    if (listF != null) {
                        List<CouponsProductDecorator> list2 = listF;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                        for (CouponsProductDecorator couponsProductDecoratorV : list2) {
                            if (list.contains(couponsProductDecoratorV.getProduct().getCode())) {
                                couponsProductDecoratorV = CouponsProductDecorator.v(couponsProductDecoratorV, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, l10.Y(couponsProductDecoratorV.getProduct().getCode()), false, false, null, null, null, null, null, false, null, 33521663, null);
                            }
                            arrayList2.add(couponsProductDecoratorV);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    couponDetailProductDecoratorSingleItem = viewState.getCouponDetailProductDecoratorSingleItem();
                } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, l10.Y(viewState.getCouponDetailProductDecoratorSingleItem().getProduct().getCode()), false, false, null, null, null, null, null, false, null, 33521663, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$throwChallenge$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96299b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17604a.ChokingHazardChallenge f96300c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new m(this.f96299b, this.f96300c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(L l10, AbstractC17604a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super m> continuation) {
                super(2, continuation);
                this.f96299b = l10;
                this.f96300c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.f();
                if (this.f96298a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f96299b._couponDetailStateFlow;
                AbstractC17604a.ChokingHazardChallenge chokingHazardChallenge = this.f96300c;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, chokingHazardChallenge.a(), null, false, 895, null)));
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$2", f = "CouponDetailViewModel.kt", l = {902}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96301a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96302b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(L l10, Continuation<? super n> continuation) {
                super(2, continuation);
                this.f96302b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new n(this.f96302b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96301a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96302b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96402a, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96302b._eventFlow;
                    f.UpdateCartSuccessEvent updateCartSuccessEvent = new f.UpdateCartSuccessEvent(C17135b.f162057y, C17135b.f162001T0);
                    this.f96301a = 1;
                    if (interfaceC17139A.emit(updateCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$3", f = "CouponDetailViewModel.kt", l = {916}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96303a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96304b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(L l10, Continuation<? super o> continuation) {
                super(2, continuation);
                this.f96304b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new o(this.f96304b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96303a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96304b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96304b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161979I0);
                    this.f96303a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f96304b.A0();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$4", f = "CouponDetailViewModel.kt", l = {928}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96305a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96306b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(L l10, Continuation<? super p> continuation) {
                super(2, continuation);
                this.f96306b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new p(this.f96306b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96305a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96306b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96306b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161981J0);
                    this.f96305a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f96306b.A0();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$5", f = "CouponDetailViewModel.kt", l = {949}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f96307a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f96308b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(L l10, Continuation<? super q> continuation) {
                super(2, continuation);
                this.f96308b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new q(this.f96308b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f96307a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f96308b._couponDetailStateFlow;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96403b, false, 767, null)));
                    InterfaceC17139A interfaceC17139A = this.f96308b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17135b.f161993P0);
                    this.f96307a = 1;
                    if (interfaceC17139A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f142422a;
            }
        }

        public e() {
        }

        private final void a(tk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                if (entryChange instanceof c.Failure) {
                    uw.a.INSTANCE.f(((c.Failure) entryChange).getError(), "Resource.Failure<EntryChange>", new Object[0]);
                    C16648k.d(d0.a(L.this), null, null, new C1366e(L.this, null), 3, null);
                    return;
                }
                return;
            }
            c.Success success = (c.Success) entryChange;
            EntryChange entryChange2 = (EntryChange) success.a();
            EntryChange.c statusCode = entryChange2 != null ? entryChange2.getStatusCode() : null;
            switch (statusCode == null ? -1 : a.$EnumSwitchMapping$0[statusCode.ordinal()]) {
                case -1:
                case 5:
                    L.this.A0();
                    Unit unit = Unit.f142422a;
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        L.this.G0(entryChange3);
                    }
                    C16648k.d(d0.a(L.this), null, null, new b(L.this, null), 3, null);
                    return;
                case 3:
                    C16648k.d(d0.a(L.this), null, null, new c(L.this, null), 3, null);
                    return;
                case 4:
                    C16648k.d(d0.a(L.this), null, null, new d(L.this, null), 3, null);
                    return;
                case 6:
                case 7:
                    Unit unit2 = Unit.f142422a;
                    return;
            }
        }

        private final void b(tk.c<EntryChange> entryChange) {
            if (entryChange instanceof c.Success) {
                c.Success success = (c.Success) entryChange;
                EntryChange entryChange2 = (EntryChange) success.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f128935f) {
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        L.this.H0(entryChange3);
                    }
                    C16648k.d(d0.a(L.this), null, null, new j(L.this, null), 3, null);
                    return;
                }
            }
            C16648k.d(d0.a(L.this), null, null, new k(L.this, null), 3, null);
        }

        private final void c(List<Entry> entries) {
            Map mapK;
            List listM;
            L.this.lastKnownCartQuantities.clear();
            Map map = L.this.lastKnownCartQuantities;
            if (entries != null) {
                List<Entry> list = entries;
                mapK = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
                for (Entry entry : list) {
                    Pair pairA = TuplesKt.a(entry.m().getCode(), Double.valueOf(entry.getActualQuantity()));
                    mapK.put(pairA.c(), pairA.d());
                }
            } else {
                mapK = MapsKt.k();
            }
            map.putAll(mapK);
            List<CouponsProductDecorator> listF = ((ViewState) L.this._couponDetailStateFlow.getValue()).f();
            if (listF != null) {
                L l10 = L.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    CouponsProductDecorator couponsProductDecorator = (CouponsProductDecorator) obj;
                    if (!couponsProductDecorator.getInQtyStepperTransition() && couponsProductDecorator.getActualQuantity() != l10.Y(couponsProductDecorator.getProduct().getCode())) {
                        arrayList.add(obj);
                    }
                }
                listM = new ArrayList(CollectionsKt.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listM.add(((CouponsProductDecorator) it.next()).getProduct().getCode());
                }
            } else {
                listM = null;
            }
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            List listM1 = CollectionsKt.m1(listM);
            CouponsProductDecorator couponDetailProductDecoratorSingleItem = ((ViewState) L.this._couponDetailStateFlow.getValue()).getCouponDetailProductDecoratorSingleItem();
            if (couponDetailProductDecoratorSingleItem != null) {
                L l11 = L.this;
                if (!couponDetailProductDecoratorSingleItem.getInQtyStepperTransition() && couponDetailProductDecoratorSingleItem.getActualQuantity() != l11.Y(couponDetailProductDecoratorSingleItem.getProduct().getCode())) {
                    listM1.add(couponDetailProductDecoratorSingleItem.getProduct().getCode());
                }
            }
            if (listM1.isEmpty()) {
                return;
            }
            C16648k.d(d0.a(L.this), null, null, new l(L.this, listM1, null), 3, null);
        }

        private final void d(tk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                C16648k.d(d0.a(L.this), null, null, new q(L.this, null), 3, null);
                return;
            }
            c.Success success = (c.Success) entryChange;
            EntryChange entryChange2 = (EntryChange) success.a();
            EntryChange.c statusCode = entryChange2 != null ? entryChange2.getStatusCode() : null;
            switch (statusCode == null ? -1 : a.$EnumSwitchMapping$0[statusCode.ordinal()]) {
                case -1:
                case 5:
                    L.this.A0();
                    Unit unit = Unit.f142422a;
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        L l10 = L.this;
                        if (entryChange3.getActualQuantityChange() > 0.0d) {
                            l10.G0(entryChange3);
                        } else if (entryChange3.getActualQuantityChange() < 0.0d) {
                            l10.H0(entryChange3);
                        }
                    }
                    C16648k.d(d0.a(L.this), null, null, new n(L.this, null), 3, null);
                    return;
                case 3:
                    C16648k.d(d0.a(L.this), null, null, new o(L.this, null), 3, null);
                    return;
                case 4:
                    C16648k.d(d0.a(L.this), null, null, new p(L.this, null), 3, null);
                    return;
                case 6:
                case 7:
                    Unit unit2 = Unit.f142422a;
                    return;
            }
        }

        @Override // wr.InterfaceC17847a
        /* renamed from: getDisposable */
        public Nu.a getDisposables() {
            return L.this.disposables;
        }

        @Override // wr.InterfaceC17847a
        public void observeCart(tk.c<ShoppingCart> cartResource) {
            ShoppingCart shoppingCartA;
            if (L.this.userManager.b()) {
                L.this.cart = cartResource != null ? cartResource.a() : null;
                if (cartResource instanceof c.Failure) {
                    Throwable error = ((c.Failure) cartResource).getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException != null && httpException.code() == 503) {
                        C16648k.d(d0.a(L.this), null, null, new f(L.this, null), 3, null);
                    }
                }
                if (cartResource == null || (shoppingCartA = cartResource.a()) == null) {
                    return;
                }
                L l10 = L.this;
                c(shoppingCartA.p());
                C16648k.d(d0.a(l10), null, null, new g(l10, ((ViewState) l10._couponDetailStateFlow.getValue()).getCouponState(), shoppingCartA, null), 3, null);
            }
        }

        @Override // wr.InterfaceC17847a
        public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                L.this.A0();
                C16648k.d(d0.a(L.this), null, null, new h(L.this, null), 3, null);
            } else {
                C16648k.d(d0.a(L.this), null, null, new i(L.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17302a.Add) {
                a(entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17302a.Update) {
                d(entryChange);
            } else if (processedRequest instanceof AbstractC17302a.Remove) {
                b(entryChange);
            } else {
                if (!(processedRequest instanceof AbstractC17302a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                L.this.A0();
            }
        }

        @Override // wr.InterfaceC17847a
        public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17604a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17604a abstractC17604aF = challenge.f();
            Intrinsics.h(abstractC17604aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            C16648k.d(d0.a(L.this), null, null, new m(L.this, (AbstractC17604a.ChokingHazardChallenge) abstractC17604aF, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f;", "", "<init>", "()V", "c", "b", "e", "a", "d", "g", "f", "Lcom/meijer/mobile/coupon/detail/L$f$a;", "Lcom/meijer/mobile/coupon/detail/L$f$b;", "Lcom/meijer/mobile/coupon/detail/L$f$c;", "Lcom/meijer/mobile/coupon/detail/L$f$d;", "Lcom/meijer/mobile/coupon/detail/L$f$e;", "Lcom/meijer/mobile/coupon/detail/L$f$f;", "Lcom/meijer/mobile/coupon/detail/L$f$g;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$a;", "Lcom/meijer/mobile/coupon/detail/L$f;", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "couponException", "Lcom/meijer/mobile/coupon/detail/L$d;", "couponActionType", "<init>", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;Lcom/meijer/mobile/coupon/detail/L$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "b", "()Lcom/meijer/mobile/coupons/domain/models/CouponException;", "Lcom/meijer/mobile/coupon/detail/L$d;", "()Lcom/meijer/mobile/coupon/detail/L$d;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$f$a, reason: from toString */
        public static final /* data */ class ClipUnclipCouponFailureEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CouponException couponException;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final d couponActionType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClipUnclipCouponFailureEvent)) {
                    return false;
                }
                ClipUnclipCouponFailureEvent clipUnclipCouponFailureEvent = (ClipUnclipCouponFailureEvent) other;
                return Intrinsics.e(this.couponException, clipUnclipCouponFailureEvent.couponException) && this.couponActionType == clipUnclipCouponFailureEvent.couponActionType;
            }

            public int hashCode() {
                return (this.couponException.hashCode() * 31) + this.couponActionType.hashCode();
            }

            public String toString() {
                return "ClipUnclipCouponFailureEvent(couponException=" + this.couponException + ", couponActionType=" + this.couponActionType + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClipUnclipCouponFailureEvent(CouponException couponException, d couponActionType) {
                super(null);
                Intrinsics.j(couponException, "couponException");
                Intrinsics.j(couponActionType, "couponActionType");
                this.couponException = couponException;
                this.couponActionType = couponActionType;
            }

            /* renamed from: a, reason: from getter */
            public final d getCouponActionType() {
                return this.couponActionType;
            }

            /* renamed from: b, reason: from getter */
            public final CouponException getCouponException() {
                return this.couponException;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$b;", "Lcom/meijer/mobile/coupon/detail/L$f;", "", "messageResId", "actionResId", "LOk/a;", "coupon", "", "newShoppingListEnabled", "<init>", "(IILOk/a;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "LOk/a;", "()LOk/a;", "d", "Z", "()Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$f$b, reason: from toString */
        public static final /* data */ class CouponAddedToShoppingListEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean newShoppingListEnabled;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CouponAddedToShoppingListEvent)) {
                    return false;
                }
                CouponAddedToShoppingListEvent couponAddedToShoppingListEvent = (CouponAddedToShoppingListEvent) other;
                return this.messageResId == couponAddedToShoppingListEvent.messageResId && this.actionResId == couponAddedToShoppingListEvent.actionResId && Intrinsics.e(this.coupon, couponAddedToShoppingListEvent.coupon) && this.newShoppingListEnabled == couponAddedToShoppingListEvent.newShoppingListEnabled;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId)) * 31) + this.coupon.hashCode()) * 31) + Boolean.hashCode(this.newShoppingListEnabled);
            }

            public String toString() {
                return "CouponAddedToShoppingListEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", coupon=" + this.coupon + ", newShoppingListEnabled=" + this.newShoppingListEnabled + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CouponAddedToShoppingListEvent(int i10, int i11, Coupon coupon, boolean z10) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.messageResId = i10;
                this.actionResId = i11;
                this.coupon = coupon;
                this.newShoppingListEnabled = z10;
            }

            /* renamed from: a, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            /* renamed from: b, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }

            /* renamed from: c, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getNewShoppingListEnabled() {
                return this.newShoppingListEnabled;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$c;", "Lcom/meijer/mobile/coupon/detail/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f96315a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -822812532;
            }

            public String toString() {
                return "DismissCouponSuccessEvent";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$d;", "Lcom/meijer/mobile/coupon/detail/L$f;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$f$d, reason: from toString */
        public static final /* data */ class RequiresLoginEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public RequiresLoginEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequiresLoginEvent) && this.messageResId == ((RequiresLoginEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "RequiresLoginEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$e;", "Lcom/meijer/mobile/coupon/detail/L$f;", "", "titleResId", "messageResId", "", "requireAcknowledgement", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Z", "()Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$f$e, reason: from toString */
        public static final /* data */ class SimpleOkAlertDialogEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean requireAcknowledgement;

            public /* synthetic */ SimpleOkAlertDialogEvent(int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, (i12 & 4) != 0 ? false : z10);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SimpleOkAlertDialogEvent)) {
                    return false;
                }
                SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = (SimpleOkAlertDialogEvent) other;
                return this.titleResId == simpleOkAlertDialogEvent.titleResId && this.messageResId == simpleOkAlertDialogEvent.messageResId && this.requireAcknowledgement == simpleOkAlertDialogEvent.requireAcknowledgement;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId)) * 31) + Boolean.hashCode(this.requireAcknowledgement);
            }

            public String toString() {
                return "SimpleOkAlertDialogEvent(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", requireAcknowledgement=" + this.requireAcknowledgement + ')';
            }

            public SimpleOkAlertDialogEvent(int i10, int i11, boolean z10) {
                super(null);
                this.titleResId = i10;
                this.messageResId = i11;
                this.requireAcknowledgement = z10;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getRequireAcknowledgement() {
                return this.requireAcknowledgement;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$f;", "Lcom/meijer/mobile/coupon/detail/L$f;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$f$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class UpdateCartFailedEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public UpdateCartFailedEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateCartFailedEvent) && this.messageResId == ((UpdateCartFailedEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "UpdateCartFailedEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$g;", "Lcom/meijer/mobile/coupon/detail/L$f;", "", "messageResId", "actionResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$f$g, reason: from toString */
        public static final /* data */ class UpdateCartSuccessEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            public UpdateCartSuccessEvent(int i10, int i11) {
                super(null);
                this.messageResId = i10;
                this.actionResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCartSuccessEvent)) {
                    return false;
                }
                UpdateCartSuccessEvent updateCartSuccessEvent = (UpdateCartSuccessEvent) other;
                return this.messageResId == updateCartSuccessEvent.messageResId && this.actionResId == updateCartSuccessEvent.actionResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId);
            }

            public String toString() {
                return "UpdateCartSuccessEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0088\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b2\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b.\u00104R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b*\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\"\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b:\u0010'¨\u0006;"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$g;", "", "LXk/c;", "couponState", "", "couponIsLoaded", "", "cartItemCount", "", "LYr/a;", "couponDetailProductDecoratorList", "couponDetailProductDecoratorSingleItem", "shouldShowHeader", "LWr/a;", "countdownDecorator", "LIr/a;", "Lur/a;", "chokingDialog", "Lcom/meijer/mobile/coupon/detail/P;", "snackbarType", "newShoppingListEnabled", "<init>", "(LXk/c;ZILjava/util/List;LYr/a;ZLWr/a;LIr/a;Lcom/meijer/mobile/coupon/detail/P;Z)V", "a", "(LXk/c;ZILjava/util/List;LYr/a;ZLWr/a;LIr/a;Lcom/meijer/mobile/coupon/detail/P;Z)Lcom/meijer/mobile/coupon/detail/L$g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LXk/c;", "i", "()LXk/c;", "b", "Z", "h", "()Z", "c", "I", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "LYr/a;", "g", "()LYr/a;", "k", "LWr/a;", "()LWr/a;", "LIr/a;", "()LIr/a;", "Lcom/meijer/mobile/coupon/detail/P;", "getSnackbarType", "()Lcom/meijer/mobile/coupon/detail/P;", "j", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$g, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponState couponState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean couponIsLoaded;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cartItemCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CouponsProductDecorator> couponDetailProductDecoratorList;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponsProductDecorator couponDetailProductDecoratorSingleItem;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowHeader;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponSavingsCountdownDecorator countdownDecorator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final UserActionDialogInfo<AbstractC17302a> chokingDialog;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final P snackbarType;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean newShoppingListEnabled;

        public ViewState() {
            this(null, false, 0, null, null, false, null, null, null, false, 1023, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.couponState, viewState.couponState) && this.couponIsLoaded == viewState.couponIsLoaded && this.cartItemCount == viewState.cartItemCount && Intrinsics.e(this.couponDetailProductDecoratorList, viewState.couponDetailProductDecoratorList) && Intrinsics.e(this.couponDetailProductDecoratorSingleItem, viewState.couponDetailProductDecoratorSingleItem) && this.shouldShowHeader == viewState.shouldShowHeader && Intrinsics.e(this.countdownDecorator, viewState.countdownDecorator) && Intrinsics.e(this.chokingDialog, viewState.chokingDialog) && this.snackbarType == viewState.snackbarType && this.newShoppingListEnabled == viewState.newShoppingListEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((this.couponState.hashCode() * 31) + Boolean.hashCode(this.couponIsLoaded)) * 31) + Integer.hashCode(this.cartItemCount)) * 31;
            List<CouponsProductDecorator> list = this.couponDetailProductDecoratorList;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            CouponsProductDecorator couponsProductDecorator = this.couponDetailProductDecoratorSingleItem;
            int iHashCode3 = (((((iHashCode2 + (couponsProductDecorator == null ? 0 : couponsProductDecorator.hashCode())) * 31) + Boolean.hashCode(this.shouldShowHeader)) * 31) + this.countdownDecorator.hashCode()) * 31;
            UserActionDialogInfo<AbstractC17302a> userActionDialogInfo = this.chokingDialog;
            int iHashCode4 = (iHashCode3 + (userActionDialogInfo == null ? 0 : userActionDialogInfo.hashCode())) * 31;
            P p10 = this.snackbarType;
            return ((iHashCode4 + (p10 != null ? p10.hashCode() : 0)) * 31) + Boolean.hashCode(this.newShoppingListEnabled);
        }

        public String toString() {
            return "ViewState(couponState=" + this.couponState + ", couponIsLoaded=" + this.couponIsLoaded + ", cartItemCount=" + this.cartItemCount + ", couponDetailProductDecoratorList=" + this.couponDetailProductDecoratorList + ", couponDetailProductDecoratorSingleItem=" + this.couponDetailProductDecoratorSingleItem + ", shouldShowHeader=" + this.shouldShowHeader + ", countdownDecorator=" + this.countdownDecorator + ", chokingDialog=" + this.chokingDialog + ", snackbarType=" + this.snackbarType + ", newShoppingListEnabled=" + this.newShoppingListEnabled + ')';
        }

        public ViewState(CouponState couponState, boolean z10, int i10, List<CouponsProductDecorator> list, CouponsProductDecorator couponsProductDecorator, boolean z11, CouponSavingsCountdownDecorator countdownDecorator, UserActionDialogInfo<AbstractC17302a> userActionDialogInfo, P p10, boolean z12) {
            Intrinsics.j(couponState, "couponState");
            Intrinsics.j(countdownDecorator, "countdownDecorator");
            this.couponState = couponState;
            this.couponIsLoaded = z10;
            this.cartItemCount = i10;
            this.couponDetailProductDecoratorList = list;
            this.couponDetailProductDecoratorSingleItem = couponsProductDecorator;
            this.shouldShowHeader = z11;
            this.countdownDecorator = countdownDecorator;
            this.chokingDialog = userActionDialogInfo;
            this.snackbarType = p10;
            this.newShoppingListEnabled = z12;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, CouponState couponState, boolean z10, int i10, List list, CouponsProductDecorator couponsProductDecorator, boolean z11, CouponSavingsCountdownDecorator couponSavingsCountdownDecorator, UserActionDialogInfo userActionDialogInfo, P p10, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                couponState = viewState.couponState;
            }
            if ((i11 & 2) != 0) {
                z10 = viewState.couponIsLoaded;
            }
            if ((i11 & 4) != 0) {
                i10 = viewState.cartItemCount;
            }
            if ((i11 & 8) != 0) {
                list = viewState.couponDetailProductDecoratorList;
            }
            if ((i11 & 16) != 0) {
                couponsProductDecorator = viewState.couponDetailProductDecoratorSingleItem;
            }
            if ((i11 & 32) != 0) {
                z11 = viewState.shouldShowHeader;
            }
            if ((i11 & 64) != 0) {
                couponSavingsCountdownDecorator = viewState.countdownDecorator;
            }
            if ((i11 & 128) != 0) {
                userActionDialogInfo = viewState.chokingDialog;
            }
            if ((i11 & 256) != 0) {
                p10 = viewState.snackbarType;
            }
            if ((i11 & 512) != 0) {
                z12 = viewState.newShoppingListEnabled;
            }
            P p11 = p10;
            boolean z13 = z12;
            CouponSavingsCountdownDecorator couponSavingsCountdownDecorator2 = couponSavingsCountdownDecorator;
            UserActionDialogInfo userActionDialogInfo2 = userActionDialogInfo;
            CouponsProductDecorator couponsProductDecorator2 = couponsProductDecorator;
            boolean z14 = z11;
            return viewState.a(couponState, z10, i10, list, couponsProductDecorator2, z14, couponSavingsCountdownDecorator2, userActionDialogInfo2, p11, z13);
        }

        public final ViewState a(CouponState couponState, boolean couponIsLoaded, int cartItemCount, List<CouponsProductDecorator> couponDetailProductDecoratorList, CouponsProductDecorator couponDetailProductDecoratorSingleItem, boolean shouldShowHeader, CouponSavingsCountdownDecorator countdownDecorator, UserActionDialogInfo<AbstractC17302a> chokingDialog, P snackbarType, boolean newShoppingListEnabled) {
            Intrinsics.j(couponState, "couponState");
            Intrinsics.j(countdownDecorator, "countdownDecorator");
            return new ViewState(couponState, couponIsLoaded, cartItemCount, couponDetailProductDecoratorList, couponDetailProductDecoratorSingleItem, shouldShowHeader, countdownDecorator, chokingDialog, snackbarType, newShoppingListEnabled);
        }

        /* renamed from: c, reason: from getter */
        public final int getCartItemCount() {
            return this.cartItemCount;
        }

        public final UserActionDialogInfo<AbstractC17302a> d() {
            return this.chokingDialog;
        }

        /* renamed from: e, reason: from getter */
        public final CouponSavingsCountdownDecorator getCountdownDecorator() {
            return this.countdownDecorator;
        }

        public final List<CouponsProductDecorator> f() {
            return this.couponDetailProductDecoratorList;
        }

        /* renamed from: g, reason: from getter */
        public final CouponsProductDecorator getCouponDetailProductDecoratorSingleItem() {
            return this.couponDetailProductDecoratorSingleItem;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getCouponIsLoaded() {
            return this.couponIsLoaded;
        }

        /* renamed from: i, reason: from getter */
        public final CouponState getCouponState() {
            return this.couponState;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getNewShoppingListEnabled() {
            return this.newShoppingListEnabled;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getShouldShowHeader() {
            return this.shouldShowHeader;
        }

        public /* synthetic */ ViewState(CouponState couponState, boolean z10, int i10, List list, CouponsProductDecorator couponsProductDecorator, boolean z11, CouponSavingsCountdownDecorator couponSavingsCountdownDecorator, UserActionDialogInfo userActionDialogInfo, P p10, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new CouponState(new Coupon(-1L, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741822, null), null, null, null, null, null, 62, null) : couponState, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : couponsProductDecorator, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? new CouponSavingsCountdownDecorator(false, null, null, 0.0d, 0.0d, 31, null) : couponSavingsCountdownDecorator, (i11 & 128) != 0 ? null : userActionDialogInfo, (i11 & 256) == 0 ? p10 : null, (i11 & 512) != 0 ? false : z12);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f96264a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f96265b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel", f = "CouponDetailViewModel.kt", l = {249}, m = "addCouponToShoppingList")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96333a;

        /* renamed from: b, reason: collision with root package name */
        Object f96334b;

        /* renamed from: c, reason: collision with root package name */
        Object f96335c;

        /* renamed from: d, reason: collision with root package name */
        Object f96336d;

        /* renamed from: e, reason: collision with root package name */
        Object f96337e;

        /* renamed from: f, reason: collision with root package name */
        Object f96338f;

        /* renamed from: g, reason: collision with root package name */
        int f96339g;

        /* renamed from: h, reason: collision with root package name */
        int f96340h;

        /* renamed from: i, reason: collision with root package name */
        int f96341i;

        /* renamed from: j, reason: collision with root package name */
        int f96342j;

        /* renamed from: k, reason: collision with root package name */
        int f96343k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f96344l;

        /* renamed from: n, reason: collision with root package name */
        int f96346n;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96344l = obj;
            this.f96346n |= Integer.MIN_VALUE;
            return L.this.X(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$addCouponToShoppingList$2$3$1", f = "CouponDetailViewModel.kt", l = {257}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96347a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f96349c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new j(this.f96349c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Coupon coupon, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f96349c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96347a;
            if (i10 == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f96402a, false, 767, null)));
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.CouponAddedToShoppingListEvent couponAddedToShoppingListEvent = new f.CouponAddedToShoppingListEvent(Mk.a.f19673a, Mk.a.f19677e, this.f96349c, L.this.featureManager.e(AbstractC18227f.O.f170554h));
                this.f96347a = 1;
                if (interfaceC17139A.emit(couponAddedToShoppingListEvent, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$addCouponToShoppingList$2$4$1", f = "CouponDetailViewModel.kt", l = {269}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96350a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96350a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(C18570a.f173236d, C18570a.f173235c, false, 4, null);
                this.f96350a = 1;
                if (interfaceC17139A.emit(simpleOkAlertDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$observeCartCount$1$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96352a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f96354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Integer num, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f96354c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new l(this.f96354c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f96352a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
            Integer num = this.f96354c;
            do {
                value = interfaceC17140B.getValue();
                Intrinsics.g(num);
            } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, num.intValue(), null, null, false, null, null, null, false, 1019, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        m(Object obj) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$observeCartInteractor$1", f = "CouponDetailViewModel.kt", l = {164}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f96355a;

        /* renamed from: b, reason: collision with root package name */
        int f96356b;

        /* renamed from: c, reason: collision with root package name */
        int f96357c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f96358d;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = L.this.new n(continuation);
            nVar.f96358d = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96357c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f96358d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f96358d;
                    L l10 = L.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = l10.cartInteractor;
                    this.f96358d = r14;
                    this.f96355a = r14;
                    this.f96356b = 0;
                    this.f96357c = 1;
                    i10 = r14;
                    if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    uw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$1", f = "CouponDetailViewModel.kt", l = {552}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96360a;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96360a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                L l10 = L.this;
                this.f96360a = 1;
                if (l10.X(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$2", f = "CouponDetailViewModel.kt", l = {553}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96362a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96362a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                L l10 = L.this;
                this.f96362a = 1;
                if (l10.z0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$3", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96364a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f96364a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, null, false, 895, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$4", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96366a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f96366a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, null, false, 895, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onCouponState$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96368a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponState f96370c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new s(this.f96370c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(CouponState couponState, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f96370c = couponState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            ArrayList arrayList;
            CouponsProductDecorator couponsProductDecorator;
            boolean z10;
            boolean z11;
            IntrinsicsKt.f();
            if (this.f96368a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
            CouponState couponState = this.f96370c;
            L l10 = L.this;
            do {
                value = interfaceC17140B.getValue();
                viewState = (ViewState) value;
                List<ProductFullDetails> listB1 = CollectionsKt.b1(couponState.getAssociatedProductsState().b(), 5);
                arrayList = new ArrayList(CollectionsKt.x(listB1, 10));
                for (ProductFullDetails productFullDetails : listB1) {
                    arrayList.add(CouponsProductDecorator.INSTANCE.a(productFullDetails, l10.Y(productFullDetails.getCode()), new ProductEligibility(productFullDetails, l10.storeManager.a(), l10.cart).k()));
                }
                couponsProductDecorator = null;
                z10 = true;
                if (!couponState.getAssociatedProductsState().getLoadingState().getIsSuccess() || couponState.getAssociatedProductsState().b().size() <= 1) {
                    arrayList = null;
                }
                ProductFullDetails productFullDetails2 = (ProductFullDetails) CollectionsKt.u0(couponState.getAssociatedProductsState().b());
                if (productFullDetails2 != null) {
                    CouponsProductDecorator couponsProductDecoratorA = CouponsProductDecorator.INSTANCE.a(productFullDetails2, l10.Y(productFullDetails2.getCode()), new ProductEligibility(productFullDetails2, l10.storeManager.a(), l10.cart).k());
                    if (couponState.getAssociatedProductsState().getLoadingState().getIsSuccess() && couponState.getAssociatedProductsState().b().size() == 1) {
                        couponsProductDecorator = couponsProductDecoratorA;
                    }
                }
                if (couponState.getAssociatedProductsState().getLoadingState().getIsSuccess() && couponState.getAssociatedProductsState().b().isEmpty()) {
                    z11 = true;
                    z10 = false;
                } else {
                    z11 = true;
                }
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, couponState, true, 0, arrayList, couponsProductDecorator, z10, CouponSavingsCountdownDecorator.b(viewState.getCountdownDecorator(), (couponState.getAssociatedProductsState().b().isEmpty() || !couponState.getCoupon().x()) ? false : z11, null, null, 0.0d, 0.0d, 30, null), null, null, false, 900, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onDismissCouponFailure$1", f = "CouponDetailViewModel.kt", l = {315}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96371a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96371a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(Nr.g.f22766x, Mk.a.f19674b, false, 4, null);
                this.f96371a = 1;
                if (interfaceC17139A.emit(simpleOkAlertDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onDismissCouponSuccess$1", f = "CouponDetailViewModel.kt", l = {308}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96373a;

        u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96373a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.c cVar = f.c.f96315a;
                this.f96373a = 1;
                if (interfaceC17139A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onStepperChange$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96375a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            ArrayList arrayList;
            CouponsProductDecorator couponDetailProductDecoratorSingleItem;
            IntrinsicsKt.f();
            if (this.f96375a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
            do {
                value = interfaceC17140B.getValue();
                viewState = (ViewState) value;
                List<CouponsProductDecorator> listF = viewState.f();
                if (listF != null) {
                    List<CouponsProductDecorator> list = listF;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(CouponsProductDecorator.v((CouponsProductDecorator) it.next(), null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33423359, null));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                couponDetailProductDecoratorSingleItem = viewState.getCouponDetailProductDecoratorSingleItem();
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33423359, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$performAction$2", f = "CouponDetailViewModel.kt", l = {HttpResponseStatus.ERROR_LENGTH_REQUIRED}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96377a;

        w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96377a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.RequiresLoginEvent requiresLoginEvent = new f.RequiresLoginEvent(Nr.g.f22750p);
                this.f96377a = 1;
                if (interfaceC17139A.emit(requiresLoginEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$performAction$onCallFailure$1", f = "CouponDetailViewModel.kt", l = {381}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96379a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f96381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f96382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Throwable th2, d dVar, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f96381c = th2;
            this.f96382d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new x(this.f96381c, this.f96382d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96379a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = L.this._eventFlow;
                f.ClipUnclipCouponFailureEvent clipUnclipCouponFailureEvent = new f.ClipUnclipCouponFailureEvent(new CouponException(this.f96381c, ((ViewState) L.this._couponDetailStateFlow.getValue()).getCouponState().getCoupon()), this.f96382d);
                this.f96379a = 1;
                if (interfaceC17139A.emit(clipUnclipCouponFailureEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$performAction$onCallSuccess$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class y extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96383a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f96385c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.f96264a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.f96265b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(d dVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f96385c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new y(this.f96385c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            CouponSavingsCountdownDecorator countdownDecorator;
            boolean z10;
            IntrinsicsKt.f();
            if (this.f96383a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = L.this._couponDetailStateFlow;
            d dVar = this.f96385c;
            do {
                value = interfaceC17140B.getValue();
                viewState = (ViewState) value;
                countdownDecorator = viewState.getCountdownDecorator();
                int i10 = a.$EnumSwitchMapping$0[dVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!viewState.getCouponState().getAssociatedProductsState().b().isEmpty()) {
                    z10 = true;
                }
                z10 = false;
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, 0, null, null, false, CouponSavingsCountdownDecorator.b(countdownDecorator, z10, null, null, 0.0d, 0.0d, 30, null), null, null, false, 959, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel", f = "CouponDetailViewModel.kt", l = {282}, m = "removeCouponFromShoppingList")
    static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96386a;

        /* renamed from: b, reason: collision with root package name */
        Object f96387b;

        /* renamed from: c, reason: collision with root package name */
        Object f96388c;

        /* renamed from: d, reason: collision with root package name */
        Object f96389d;

        /* renamed from: e, reason: collision with root package name */
        Object f96390e;

        /* renamed from: f, reason: collision with root package name */
        Object f96391f;

        /* renamed from: g, reason: collision with root package name */
        int f96392g;

        /* renamed from: h, reason: collision with root package name */
        int f96393h;

        /* renamed from: i, reason: collision with root package name */
        int f96394i;

        /* renamed from: j, reason: collision with root package name */
        int f96395j;

        /* renamed from: k, reason: collision with root package name */
        int f96396k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f96397l;

        /* renamed from: n, reason: collision with root package name */
        int f96399n;

        z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96397l = obj;
            this.f96399n |= Integer.MIN_VALUE;
            return L.this.z0(this);
        }
    }

    public L(yo.k userManager, C5283b couponChangeManager, Eq.b shoppingListRepository, hl.m cartRepository, wr.f cartInteractor, InterfaceC14261a analyticsEngine, C6412d couponsRepository, Xk.u couponStateRepository, yo.f storeManager, yl.k featureManager) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(couponChangeManager, "couponChangeManager");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(couponStateRepository, "couponStateRepository");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(featureManager, "featureManager");
        this.userManager = userManager;
        this.couponChangeManager = couponChangeManager;
        this.shoppingListRepository = shoppingListRepository;
        this.cartRepository = cartRepository;
        this.cartInteractor = cartInteractor;
        this.analyticsEngine = analyticsEngine;
        this.couponsRepository = couponsRepository;
        this.couponStateRepository = couponStateRepository;
        this.storeManager = storeManager;
        this.featureManager = featureManager;
        this._couponDetailStateFlow = S.a(new ViewState(null, false, 0, null, null, false, null, null, null, featureManager.e(AbstractC18227f.O.f170554h), 511, null));
        InterfaceC17139A<f> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC17139AB;
        this.eventFlow = C17154h.b(interfaceC17139AB);
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        this.lastKnownCartQuantities = new LinkedHashMap();
        Ck.a.a(couponStateRepository.t(), aVar);
        io.reactivex.l<List<CouponState>> lVarO = couponStateRepository.O();
        final C11590a c11590a = new C11590a(this);
        Pu.g<? super List<CouponState>> gVar = new Pu.g() { // from class: com.meijer.mobile.coupon.detail.A
            @Override // Pu.g
            public final void accept(Object obj) {
                L.H(c11590a, obj);
            }
        };
        final C11591b c11591b = new C11591b(uw.a.INSTANCE);
        Ck.a.a(lVarO.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.coupon.detail.B
            @Override // Pu.g
            public final void accept(Object obj) {
                L.I(c11591b, obj);
            }
        }), aVar);
        if (userManager.b()) {
            wr.f.r(cartInteractor, false, new e(), 1, null);
        }
    }

    private final void B0() {
        K0();
        if (!this.userManager.b()) {
            C16648k.d(d0.a(this), null, null, new C(null), 3, null);
            return;
        }
        final Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        io.reactivex.u<Response<Unit>> uVarK = this.couponsRepository.w(Coupon.e(coupon, 0L, false, true, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null)).k(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.C0(this.f96449a, coupon, (Response) obj);
            }
        };
        Pu.g<? super Response<Unit>> gVar = new Pu.g() { // from class: com.meijer.mobile.coupon.detail.v
            @Override // Pu.g
            public final void accept(Object obj) {
                L.D0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.coupon.detail.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.E0(this.f96452a, coupon, (Throwable) obj);
            }
        };
        Intrinsics.g(Ck.a.a(uVarK.o(gVar, new Pu.g() { // from class: com.meijer.mobile.coupon.detail.x
            @Override // Pu.g
            public final void accept(Object obj) {
                L.F0(function12, obj);
            }
        }), this.disposables));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(L l10, Coupon coupon, Response response) {
        if (response.isSuccessful()) {
            l10.p0(Coupon.e(coupon, 0L, false, true, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null));
        } else {
            l10.o0(Coupon.e(coupon, 0L, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null));
        }
        return Unit.f142422a;
    }

    private final void I0(d action) {
        String str;
        final Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        int i10 = h.$EnumSwitchMapping$0[action.ordinal()];
        if (i10 == 1) {
            str = "coupon clip";
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "coupon unclip";
        }
        interfaceC14261a.h(C14476c.a(str), new Function1() { // from class: com.meijer.mobile.coupon.detail.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.J0(this.f96455a, coupon, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(L l10, Coupon coupon, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.n(l10.c0(coupon));
        Qk.b bVar = Qk.b.f30831a;
        track.c(bVar.h(l10.c0(coupon)));
        track.c(bVar.e(coupon));
        return Unit.f142422a;
    }

    private final void K0() {
        final Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        this.analyticsEngine.h(C14476c.a("event: Coupon not interested"), new Function1() { // from class: com.meijer.mobile.coupon.detail.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.L0(this.f96457a, coupon, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(L l10, Coupon coupon, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.n(l10.c0(coupon));
        track.c(Qk.b.f30831a.e(coupon));
        return Unit.f142422a;
    }

    private final void M0(final Coupon coupon, final String previousTrackAction) {
        this.analyticsEngine.h(C14476c.h(c0(coupon)), new Function1() { // from class: com.meijer.mobile.coupon.detail.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.N0(coupon, previousTrackAction, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(Coupon coupon, String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.c(Qk.b.f30831a.e(coupon));
        track.p(str);
        return Unit.f142422a;
    }

    private final void O0(ProductFullDetails product, double quantityToUpdate) {
        wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.L.X(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void d0() {
        if (this.userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C14764a.b());
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return L.e0(this.f96445a, (Integer) obj);
                }
            };
            Pu.g<? super Integer> gVar = new Pu.g() { // from class: com.meijer.mobile.coupon.detail.C
                @Override // Pu.g
                public final void accept(Object obj) {
                    L.f0(function1, obj);
                }
            };
            final m mVar = new m(uw.a.INSTANCE);
            Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.coupon.detail.D
                @Override // Pu.g
                public final void accept(Object obj) {
                    L.g0(mVar, obj);
                }
            }), this.disposables);
        }
    }

    private final void h0() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, new e(), 1, null);
            this.cartInteractor.p();
            C16648k.d(d0.a(this), null, null, new n(null), 3, null);
        }
    }

    private final void i0(Ok.c couponIdentity, final String previousTrackAction) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C14764a.b()).observeOn(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.j0(this.f96222a, previousTrackAction, (Coupon) obj);
            }
        };
        Pu.g<? super Coupon> gVar = new Pu.g() { // from class: com.meijer.mobile.coupon.detail.F
            @Override // Pu.g
            public final void accept(Object obj) {
                L.k0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.coupon.detail.G
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.l0((Throwable) obj);
            }
        };
        Ck.a.a(lVarObserveOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.coupon.detail.H
            @Override // Pu.g
            public final void accept(Object obj) {
                L.m0(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(L l10, String str, Coupon coupon) {
        l10.couponStateRepository.S(CollectionsKt.e(coupon));
        Intrinsics.g(coupon);
        l10.M0(coupon, str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(Throwable th2) {
        uw.a.INSTANCE.e(th2);
        return Unit.f142422a;
    }

    private final void o0(Coupon coupon) {
        this.couponStateRepository.S(CollectionsKt.e(coupon));
        C16648k.d(d0.a(this), null, null, new t(null), 3, null);
    }

    private final void p0(Coupon coupon) {
        this.couponStateRepository.S(CollectionsKt.e(coupon));
        this.couponChangeManager.a(new CouponsListChange(CouponsListChange.a.f35396c, coupon));
        C16648k.d(d0.a(this), null, null, new u(null), 3, null);
    }

    private final void r0(final d action) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarH;
        if (!this.userManager.b()) {
            C16648k.d(d0.a(this), null, null, new w(null), 3, null);
            return;
        }
        Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        int i10 = h.$EnumSwitchMapping$0[action.ordinal()];
        if (i10 == 1) {
            uVarH = this.couponsRepository.h(coupon);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uVarH = this.couponsRepository.F(coupon);
        }
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = uVarH.k(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.s0(this.f96230a, action, (ClipUnclipCouponResponse) obj);
            }
        };
        Pu.g<? super ClipUnclipCouponResponse> gVar = new Pu.g() { // from class: com.meijer.mobile.coupon.detail.K
            @Override // Pu.g
            public final void accept(Object obj) {
                L.t0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.coupon.detail.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.u0(action, this, (Throwable) obj);
            }
        };
        Intrinsics.g(uVarK.o(gVar, new Pu.g() { // from class: com.meijer.mobile.coupon.detail.t
            @Override // Pu.g
            public final void accept(Object obj) {
                L.v0(function12, obj);
            }
        }));
    }

    private static final void y0(L l10, d dVar) {
        l10.I0(dVar);
        C16648k.d(d0.a(l10), null, null, l10.new y(dVar, null), 3, null);
        C5283b c5283b = l10.couponChangeManager;
        d dVar2 = d.f96264a;
        c5283b.a(new CouponsListChange(dVar == dVar2 ? CouponsListChange.a.f35394a : CouponsListChange.a.f35395b, l10._couponDetailStateFlow.getValue().getCouponState().getCoupon()));
        l10.couponStateRepository.S(CollectionsKt.e(Coupon.e(l10._couponDetailStateFlow.getValue().getCouponState().getCoupon(), 0L, false, false, null, null, dVar == dVar2, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741791, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.L.z0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G0(EntryChange entryChange) {
        Intrinsics.j(entryChange, "entryChange");
        Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        C2930u c2930u = C2930u.f1407a;
        String strC0 = c0(coupon);
        ShoppingCart shoppingCart = this.cart;
        interfaceC14261a.e(c2930u.D(strC0, shoppingCart != null ? shoppingCart.getCode() : null, entryChange, coupon));
    }

    public final void H0(EntryChange entryChange) {
        Intrinsics.j(entryChange, "entryChange");
        Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        Entry entry = entryChange.getEntry();
        EntryChange entryChangeB = entry != null ? EntryChange.b(entryChange, Entry.b(entry, 0, ProductFullDetails.b(entry.m(), null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -17, 268435455, null), 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32765, null), null, null, 0.0d, 0.0d, 30, null) : null;
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        C2930u c2930u = C2930u.f1407a;
        String strC0 = c0(coupon);
        ShoppingCart shoppingCart = this.cart;
        interfaceC14261a.e(c2930u.F(strC0, shoppingCart != null ? shoppingCart.getCode() : null, entryChangeB, coupon));
    }

    public final double Y(String code) {
        Intrinsics.j(code, "code");
        Double d10 = this.lastKnownCartQuantities.get(code);
        if (d10 != null) {
            return d10.doubleValue();
        }
        return 0.0d;
    }

    public final tv.P<ViewState> Z() {
        return C17154h.c(this._couponDetailStateFlow);
    }

    public final InterfaceC17144F<f> a0() {
        return this.eventFlow;
    }

    public final CouponSavingsCountdownDecorator b0(Coupon coupon, List<Entry> matchingProducts, CouponSavingsCountdownDecorator oldState) {
        Intrinsics.j(coupon, "coupon");
        Intrinsics.j(matchingProducts, "matchingProducts");
        Intrinsics.j(oldState, "oldState");
        Coupon.c earnCondition = coupon.getEarnCondition();
        if (earnCondition instanceof Coupon.c.Spend) {
            Iterator<T> it = matchingProducts.iterator();
            double value = 0.0d;
            while (it.hasNext()) {
                value += ((Entry) it.next()).getTotalPrice().getValue();
            }
            return oldState.a(coupon.x() && !this._couponDetailStateFlow.getValue().getCouponState().getAssociatedProductsState().b().isEmpty(), Qr.a.k(coupon, value, false, 2, null), Wr.b.f39002b, value, coupon.getEarnCondition().getGoal());
        }
        if (!(earnCondition instanceof Coupon.c.Buy)) {
            if (Intrinsics.e(earnCondition, Coupon.c.b.f24019b)) {
                return CouponSavingsCountdownDecorator.b(oldState, coupon.x() && !this._couponDetailStateFlow.getValue().getCouponState().getAssociatedProductsState().b().isEmpty(), AbstractC5607a.INSTANCE.d(Nr.g.f22727d0, new Object[0]), Wr.b.f39001a, 0.0d, 0.0d, 24, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it2 = matchingProducts.iterator();
        double actualQuantity = 0.0d;
        while (it2.hasNext()) {
            actualQuantity += ((Entry) it2.next()).getActualQuantity();
        }
        return oldState.a(coupon.x() && !this._couponDetailStateFlow.getValue().getCouponState().getAssociatedProductsState().b().isEmpty(), Qr.a.b(coupon, actualQuantity, false, 2, null), Wr.b.f39001a, actualQuantity, coupon.getEarnCondition().getGoal());
    }

    public final void n0(AbstractC11592c action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC11592c.Initialize) {
            AbstractC11592c.Initialize initialize = (AbstractC11592c.Initialize) action;
            i0(initialize.getCoupon(), initialize.getPreviousTrackAction());
            return;
        }
        if (action instanceof AbstractC11592c.a) {
            C16648k.d(d0.a(this), null, null, new o(null), 3, null);
            return;
        }
        if (action instanceof AbstractC11592c.C1365c) {
            C16648k.d(d0.a(this), null, null, new p(null), 3, null);
            return;
        }
        if (action instanceof AbstractC11592c.UserAcceptAddToCartAction) {
            C16648k.d(d0.a(this), null, null, new q(null), 3, null);
            wr.f.B(this.cartInteractor, new AbstractC17116a.Accept(((AbstractC11592c.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null), false, null, 6, null);
            return;
        }
        if (action instanceof AbstractC11592c.UserDeclineAddToCartAction) {
            C16648k.d(d0.a(this), null, null, new r(null), 3, null);
            A0();
        } else if (action instanceof AbstractC11592c.StepperChange) {
            AbstractC11592c.StepperChange stepperChange = (AbstractC11592c.StepperChange) action;
            q0(stepperChange.getProduct(), stepperChange.getQuantityToUpdate());
        } else {
            if (!(action instanceof AbstractC11592c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.couponStateRepository.S(CollectionsKt.e(this._couponDetailStateFlow.getValue().getCouponState().getCoupon()));
        }
    }

    public void onAction(Pk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            r0(d.f96264a);
            return;
        }
        if (action instanceof a.Unclip) {
            r0(d.f96265b);
        } else if (action instanceof a.NotInterested) {
            B0();
        } else if (!(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        d0();
        h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(L l10, Coupon coupon, Throwable th2) {
        l10.o0(Coupon.e(coupon, 0L, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final String c0(Coupon coupon) {
        if (coupon.getIsSpecialOffer()) {
            return "Hand Picked Offer";
        }
        return "Coupon Details Page";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(L l10, Integer num) {
        C16648k.d(d0.a(l10), null, null, l10.new l(num, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponState(List<CouponState> couponStateList) {
        CouponState couponState = (CouponState) CollectionsKt.u0(couponStateList);
        if (couponState != null) {
            C16648k.d(d0.a(this), null, null, new s(couponState, null), 3, null);
        }
    }

    private final void q0(ProductFullDetails product, double quantityToUpdate) {
        C16648k.d(d0.a(this), null, null, new v(null), 3, null);
        O0(product, quantityToUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(L l10, d dVar, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        y0(l10, dVar);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(d dVar, L l10, Throwable th2) {
        Intrinsics.g(th2);
        x0(l10, th2, dVar);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private static final void x0(L l10, Throwable th2, d dVar) {
        C16648k.d(d0.a(l10), null, null, l10.new x(th2, dVar, null), 3, null);
    }

    public final void A0() {
        C16648k.d(d0.a(this), null, null, new B(null), 3, null);
    }
}
