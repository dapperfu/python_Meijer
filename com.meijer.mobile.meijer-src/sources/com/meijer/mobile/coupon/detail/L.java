package com.meijer.mobile.coupon.detail;

import Ao.C2898u;
import Co.ProductFullDetails;
import Ir.UserActionDialogInfo;
import Pk.Coupon;
import Qk.a;
import Tr.C5371b;
import Tr.CouponsListChange;
import Wr.CouponSavingsCountdownDecorator;
import Yk.CouponState;
import Yr.CouponsProductDecorator;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.S;
import qw.a;
import retrofit2.HttpException;
import retrofit2.Response;
import tr.C17284b;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import wl.ProductEligibility;
import wr.InterfaceC17909a;
import yr.Q;
import zl.AbstractC18503f;
import zs.C18546a;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005jdhbfBY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010!\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010\u001cJ\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b6\u00105J!\u0010;\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010\u001cJ\u0017\u0010>\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b>\u0010/J!\u0010?\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u0002092\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001aH\u0014¢\u0006\u0004\bG\u0010\u001cJ-\u0010L\u001a\u00020J2\u0006\u0010'\u001a\u00020&2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001e2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001aH\u0000¢\u0006\u0004\bN\u0010\u001cJ\u001b\u0010Q\u001a\u0002022\n\u0010P\u001a\u000609j\u0002`OH\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020V¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b]\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020x0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020x0|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u0002020\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020s0\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lyo/k;", "userManager", "LTr/b;", "couponChangeManager", "LEq/b;", "shoppingListRepository", "Lil/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lhi/a;", "analyticsEngine", "Ldl/d;", "couponsRepository", "LYk/u;", "couponStateRepository", "Lyo/f;", "storeManager", "Lzl/k;", "featureManager", "<init>", "(Lyo/k;LTr/b;LEq/b;Lil/m;Lwr/f;Lhi/a;Ldl/d;LYk/u;Lyo/f;Lzl/k;)V", "", "h0", "()V", "d0", "", "LYk/c;", "couponStateList", "onCouponState", "(Ljava/util/List;)V", "X", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y0", "LPk/a;", "coupon", "p0", "(LPk/a;)V", "o0", "A0", "Lcom/meijer/mobile/coupon/detail/L$d;", "action", "r0", "(Lcom/meijer/mobile/coupon/detail/L$d;)V", "LCo/h;", "product", "", "quantityToUpdate", "q0", "(LCo/h;D)V", "O0", "LPk/c;", "couponIdentity", "", "previousTrackAction", "i0", "(LPk/c;Ljava/lang/String;)V", "K0", "I0", "M0", "(LPk/a;Ljava/lang/String;)V", "c0", "(LPk/a;)Ljava/lang/String;", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "Lfj/i;", "matchingProducts", "LWr/a;", "oldState", "b0", "(LPk/a;Ljava/util/List;LWr/a;)LWr/a;", "z0", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "Y", "(Ljava/lang/String;)D", "LQk/a;", "onAction", "(LQk/a;)V", "Lcom/meijer/mobile/coupon/detail/L$c;", "n0", "(Lcom/meijer/mobile/coupon/detail/L$c;)V", "Lfj/j;", "entryChange", "G0", "(Lfj/j;)V", "H0", "a", "Lyo/k;", "b", "LTr/b;", "c", "LEq/b;", "d", "Lil/m;", "e", "Lwr/f;", "f", "Lhi/a;", "g", "Ldl/d;", "h", "LYk/u;", "i", "Lyo/f;", "j", "Lzl/k;", "Lpv/B;", "Lcom/meijer/mobile/coupon/detail/L$g;", "k", "Lpv/B;", "_couponDetailStateFlow", "Lpv/A;", "Lcom/meijer/mobile/coupon/detail/L$f;", "l", "Lpv/A;", "_eventFlow", "Lpv/F;", "m", "Lpv/F;", "a0", "()Lpv/F;", "eventFlow", "LJu/a;", "n", "LJu/a;", "disposables", "", "o", "Ljava/util/Map;", "lastKnownCartQuantities", "Lfj/C;", "p", "Lfj/C;", "cart", "Lpv/P;", "Z", "()Lpv/P;", "couponDetailStateFlow", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class L extends c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5371b couponChangeManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Yk.u couponStateRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _couponDetailStateFlow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<f> _eventFlow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<f> eventFlow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Double> lastKnownCartQuantities;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ShoppingCart cart;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$removeCouponFromShoppingList$2$4$1", f = "CouponDetailViewModel.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97107a;

        A(Continuation<? super A> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new A(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97107a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(C18546a.f173203j, C18546a.f173202i, false, 4, null);
                this.f97107a = 1;
                if (interfaceC16548A.emit(simpleOkAlertDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$resetQuantitySteppers$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97109a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            ArrayList arrayList;
            CouponsProductDecorator couponDetailProductDecoratorSingleItem;
            IntrinsicsKt.f();
            if (this.f97109a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
            L l10 = L.this;
            do {
                value = interfaceC16549B.getValue();
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
            } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, l10.Y(viewState.getCouponDetailProductDecoratorSingleItem().getProduct().getCode()), false, true, null, null, null, null, null, false, null, 33325055, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$setNotInterested$3", f = "CouponDetailViewModel.kt", l = {344}, m = "invokeSuspend")
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97111a;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97111a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.RequiresLoginEvent requiresLoginEvent = new f.RequiresLoginEvent(Nk.a.f21008d);
                this.f97111a = 1;
                if (interfaceC16548A.emit(requiresLoginEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$a, reason: case insensitive filesystem */
    /* synthetic */ class C11715a extends FunctionReferenceImpl implements Function1<List<? extends CouponState>, Unit> {
        C11715a(Object obj) {
            super(1, obj, L.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 0);
        }

        public final void a(List<CouponState> p02) {
            Intrinsics.j(p02, "p0");
            ((L) this.receiver).onCouponState(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CouponState> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$b, reason: case insensitive filesystem */
    /* synthetic */ class C11716b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C11716b(Object obj) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c;", "", "<init>", "()V", "a", "c", "d", "b", "e", "f", "g", "Lcom/meijer/mobile/coupon/detail/L$c$a;", "Lcom/meijer/mobile/coupon/detail/L$c$b;", "Lcom/meijer/mobile/coupon/detail/L$c$c;", "Lcom/meijer/mobile/coupon/detail/L$c$d;", "Lcom/meijer/mobile/coupon/detail/L$c$e;", "Lcom/meijer/mobile/coupon/detail/L$c$f;", "Lcom/meijer/mobile/coupon/detail/L$c$g;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.detail.L$c, reason: case insensitive filesystem */
    public static abstract class AbstractC11717c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$a;", "Lcom/meijer/mobile/coupon/detail/L$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$a */
        public static final /* data */ class a extends AbstractC11717c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f97113a = new a();

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

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$b;", "Lcom/meijer/mobile/coupon/detail/L$c;", "LPk/c;", "coupon", "", "previousTrackAction", "<init>", "(LPk/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "b", "Ljava/lang/String;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$b, reason: from toString */
        public static final /* data */ class Initialize extends AbstractC11717c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Pk.c coupon;

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
            public Initialize(Pk.c coupon, String str) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
                this.previousTrackAction = str;
            }

            /* renamed from: a, reason: from getter */
            public final Pk.c getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$c;", "Lcom/meijer/mobile/coupon/detail/L$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$c, reason: collision with other inner class name */
        public static final /* data */ class C1374c extends AbstractC11717c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1374c f97116a = new C1374c();

            private C1374c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1374c);
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
        public static final /* data */ class d extends AbstractC11717c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f97117a = new d();

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
        public static final /* data */ class StepperChange extends AbstractC11717c {

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
        public static final /* data */ class UserAcceptAddToCartAction extends AbstractC11717c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17454a cartUpdateRequest;

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
            public UserAcceptAddToCartAction(AbstractC17454a cartUpdateRequest) {
                super(null);
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                this.cartUpdateRequest = cartUpdateRequest;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC17454a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$c$g;", "Lcom/meijer/mobile/coupon/detail/L$c;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.detail.L$c$g, reason: from toString */
        public static final /* data */ class UserDeclineAddToCartAction extends AbstractC11717c {

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

        public /* synthetic */ AbstractC11717c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11717c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f97122a = new d("CLIP", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f97123b = new d("UNCLIP", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ d[] f97124c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f97125d;

        private static final /* synthetic */ d[] a() {
            return new d[]{f97122a, f97123b};
        }

        static {
            d[] dVarArrA = a();
            f97124c = dVarArrA;
            f97125d = EnumEntriesKt.a(dVarArrA);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f97124c.clone();
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\tJ%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$e;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/coupon/detail/L;)V", "Luk/c;", "Lfj/j;", "entryChange", "", "a", "(Luk/c;)V", "d", "b", "", "Lfj/i;", "entries", "c", "(Ljava/util/List;)V", "Lfj/C;", "cartResource", "observeCart", "Lur/a;", "processedRequest", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "LJu/a;", "getDisposable", "()LJu/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private final class e implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f131920b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f131922d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f131921c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f131923e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EntryChange.c.f131924f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EntryChange.c.f131925g.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EntryChange.c.f131926h.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$2", f = "CouponDetailViewModel.kt", l = {829}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97127a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97128b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L l10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f97128b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f97128b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97127a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97128b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97260a, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97128b._eventFlow;
                    f.UpdateCartSuccessEvent updateCartSuccessEvent = new f.UpdateCartSuccessEvent(C17284b.f163319f, C17284b.f163301T0);
                    this.f97127a = 1;
                    if (interfaceC16548A.emit(updateCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$3", f = "CouponDetailViewModel.kt", l = {843}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97130b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l10, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f97130b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f97130b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97129a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97130b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97130b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163279I0);
                    this.f97129a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f97130b.z0();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$4", f = "CouponDetailViewModel.kt", l = {855}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97131a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97132b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(L l10, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f97132b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f97132b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97131a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97132b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97132b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163281J0);
                    this.f97131a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f97132b.z0();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$addCartEntry$5", f = "CouponDetailViewModel.kt", l = {877}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.coupon.detail.L$e$e, reason: collision with other inner class name */
        static final class C1375e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97133a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97134b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1375e(L l10, Continuation<? super C1375e> continuation) {
                super(2, continuation);
                this.f97134b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1375e(this.f97134b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1375e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97133a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97134b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97134b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163293P0);
                    this.f97133a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f97134b.z0();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$observeCart$1", f = "CouponDetailViewModel.kt", l = {726}, m = "invokeSuspend")
        static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97135a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97136b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(L l10, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f97136b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f97136b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97135a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f97136b._eventFlow;
                    f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(Q.f171738F, Q.f171737E, true);
                    this.f97135a = 1;
                    if (interfaceC16548A.emit(simpleOkAlertDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$observeCart$2$1$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97137a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97138b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CouponState f97139c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ShoppingCart f97140d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f97138b, this.f97139c, this.f97140d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(L l10, CouponState couponState, ShoppingCart shoppingCart, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f97138b = l10;
                this.f97139c = couponState;
                this.f97140d = shoppingCart;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ViewState viewState;
                Coupon couponE;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f97137a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f97138b._couponDetailStateFlow;
                L l10 = this.f97138b;
                CouponState couponState = this.f97139c;
                ShoppingCart shoppingCart = this.f97140d;
                do {
                    value = interfaceC16549B.getValue();
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
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, 0, null, null, false, l10.b0(couponE, arrayList, viewState.getCountdownDecorator()), null, null, false, 959, null)));
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$processedRequest$1", f = "CouponDetailViewModel.kt", l = {765}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f97141a;

            /* renamed from: b, reason: collision with root package name */
            int f97142b;

            /* renamed from: c, reason: collision with root package name */
            int f97143c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f97144d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ L f97145e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(L l10, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f97145e = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                h hVar = new h(this.f97145e, continuation);
                hVar.f97144d = obj;
                return hVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mv.O] */
            /* JADX WARN: Type inference failed for: r1v8, types: [mv.O] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objB;
                ?? r12;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97143c;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ?? r13 = (InterfaceC15783O) this.f97144d;
                            ResultKt.b(obj);
                            i10 = r13;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        ?? r14 = (InterfaceC15783O) this.f97144d;
                        L l10 = this.f97145e;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = l10.cartInteractor;
                        this.f97144d = r14;
                        this.f97141a = r14;
                        this.f97142b = 0;
                        this.f97143c = 1;
                        i10 = r14;
                        if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b(Unit.f143329a);
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
                        qw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
                    } else {
                        throw thE;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$processedRequest$2", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97146a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97147b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17454a f97148c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f97147b, this.f97148c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(L l10, AbstractC17454a abstractC17454a, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f97147b = l10;
                this.f97148c = abstractC17454a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ViewState viewState;
                ArrayList arrayList;
                CouponsProductDecorator couponDetailProductDecoratorSingleItem;
                IntrinsicsKt.f();
                if (this.f97146a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f97147b._couponDetailStateFlow;
                AbstractC17454a abstractC17454a = this.f97148c;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = (ViewState) value;
                    List<CouponsProductDecorator> listF = viewState.f();
                    if (listF != null) {
                        List<CouponsProductDecorator> list = listF;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                        for (CouponsProductDecorator couponsProductDecoratorV : list) {
                            if (Intrinsics.e(couponsProductDecoratorV.getProduct().getCode(), abstractC17454a.getProductCode())) {
                                couponsProductDecoratorV = CouponsProductDecorator.v(couponsProductDecoratorV, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33488895, null);
                            }
                            arrayList2.add(couponsProductDecoratorV);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    couponDetailProductDecoratorSingleItem = viewState.getCouponDetailProductDecoratorSingleItem();
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33488895, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$removeCartEntry$2", f = "CouponDetailViewModel.kt", l = {966}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97149a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97150b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(L l10, Continuation<? super j> continuation) {
                super(2, continuation);
                this.f97150b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new j(this.f97150b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97149a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97150b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97260a, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97150b._eventFlow;
                    f.UpdateCartSuccessEvent updateCartSuccessEvent = new f.UpdateCartSuccessEvent(C17284b.f163288N, C17284b.f163301T0);
                    this.f97149a = 1;
                    if (interfaceC16548A.emit(updateCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$removeCartEntry$3", f = "CouponDetailViewModel.kt", l = {978}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97151a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97152b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(L l10, Continuation<? super k> continuation) {
                super(2, continuation);
                this.f97152b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new k(this.f97152b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97151a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97152b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97152b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163293P0);
                    this.f97151a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f97152b.z0();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$syncSteppersWithCartData$3", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97153a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97154b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f97155c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(L l10, List<String> list, Continuation<? super l> continuation) {
                super(2, continuation);
                this.f97154b = l10;
                this.f97155c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new l(this.f97154b, this.f97155c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ViewState viewState;
                ArrayList arrayList;
                CouponsProductDecorator couponDetailProductDecoratorSingleItem;
                IntrinsicsKt.f();
                if (this.f97153a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f97154b._couponDetailStateFlow;
                L l10 = this.f97154b;
                List<String> list = this.f97155c;
                do {
                    value = interfaceC16549B.getValue();
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
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, l10.Y(viewState.getCouponDetailProductDecoratorSingleItem().getProduct().getCode()), false, false, null, null, null, null, null, false, null, 33521663, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$throwChallenge$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97156a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97157b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17720a.ChokingHazardChallenge f97158c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new m(this.f97157b, this.f97158c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(L l10, AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super m> continuation) {
                super(2, continuation);
                this.f97157b = l10;
                this.f97158c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.f();
                if (this.f97156a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f97157b._couponDetailStateFlow;
                AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge = this.f97158c;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, chokingHazardChallenge.a(), null, false, 895, null)));
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$2", f = "CouponDetailViewModel.kt", l = {902}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97159a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97160b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(L l10, Continuation<? super n> continuation) {
                super(2, continuation);
                this.f97160b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new n(this.f97160b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97159a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97160b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97260a, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97160b._eventFlow;
                    f.UpdateCartSuccessEvent updateCartSuccessEvent = new f.UpdateCartSuccessEvent(C17284b.f163357y, C17284b.f163301T0);
                    this.f97159a = 1;
                    if (interfaceC16548A.emit(updateCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$3", f = "CouponDetailViewModel.kt", l = {916}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97162b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(L l10, Continuation<? super o> continuation) {
                super(2, continuation);
                this.f97162b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new o(this.f97162b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97161a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97162b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97162b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163279I0);
                    this.f97161a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f97162b.z0();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$4", f = "CouponDetailViewModel.kt", l = {928}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97163a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97164b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(L l10, Continuation<? super p> continuation) {
                super(2, continuation);
                this.f97164b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new p(this.f97164b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97163a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97164b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97164b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163281J0);
                    this.f97163a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.f97164b.z0();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$CouponDetailCartInteractionListener$updateCartEntry$5", f = "CouponDetailViewModel.kt", l = {949}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97165a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f97166b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(L l10, Continuation<? super q> continuation) {
                super(2, continuation);
                this.f97166b = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new q(this.f97166b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f97165a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f97166b._couponDetailStateFlow;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97261b, false, 767, null)));
                    InterfaceC16548A interfaceC16548A = this.f97166b._eventFlow;
                    f.UpdateCartFailedEvent updateCartFailedEvent = new f.UpdateCartFailedEvent(C17284b.f163293P0);
                    this.f97165a = 1;
                    if (interfaceC16548A.emit(updateCartFailedEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f143329a;
            }
        }

        public e() {
        }

        private final void a(uk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                if (entryChange instanceof c.Failure) {
                    qw.a.INSTANCE.f(((c.Failure) entryChange).getError(), "Resource.Failure<EntryChange>", new Object[0]);
                    C15809k.d(d0.a(L.this), null, null, new C1375e(L.this, null), 3, null);
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
                    L.this.z0();
                    Unit unit = Unit.f143329a;
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
                    C15809k.d(d0.a(L.this), null, null, new b(L.this, null), 3, null);
                    return;
                case 3:
                    C15809k.d(d0.a(L.this), null, null, new c(L.this, null), 3, null);
                    return;
                case 4:
                    C15809k.d(d0.a(L.this), null, null, new d(L.this, null), 3, null);
                    return;
                case 6:
                case 7:
                    Unit unit2 = Unit.f143329a;
                    return;
            }
        }

        private final void b(uk.c<EntryChange> entryChange) {
            if (entryChange instanceof c.Success) {
                c.Success success = (c.Success) entryChange;
                EntryChange entryChange2 = (EntryChange) success.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f131924f) {
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        L.this.H0(entryChange3);
                    }
                    C15809k.d(d0.a(L.this), null, null, new j(L.this, null), 3, null);
                    return;
                }
            }
            C15809k.d(d0.a(L.this), null, null, new k(L.this, null), 3, null);
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
            C15809k.d(d0.a(L.this), null, null, new l(L.this, listM1, null), 3, null);
        }

        private final void d(uk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                C15809k.d(d0.a(L.this), null, null, new q(L.this, null), 3, null);
                return;
            }
            c.Success success = (c.Success) entryChange;
            EntryChange entryChange2 = (EntryChange) success.a();
            EntryChange.c statusCode = entryChange2 != null ? entryChange2.getStatusCode() : null;
            switch (statusCode == null ? -1 : a.$EnumSwitchMapping$0[statusCode.ordinal()]) {
                case -1:
                case 5:
                    L.this.z0();
                    Unit unit = Unit.f143329a;
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
                    C15809k.d(d0.a(L.this), null, null, new n(L.this, null), 3, null);
                    return;
                case 3:
                    C15809k.d(d0.a(L.this), null, null, new o(L.this, null), 3, null);
                    return;
                case 4:
                    C15809k.d(d0.a(L.this), null, null, new p(L.this, null), 3, null);
                    return;
                case 6:
                case 7:
                    Unit unit2 = Unit.f143329a;
                    return;
            }
        }

        @Override // wr.InterfaceC17909a
        /* renamed from: getDisposable */
        public Ju.a getDisposables() {
            return L.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            ShoppingCart shoppingCartA;
            if (L.this.userManager.b()) {
                L.this.cart = cartResource != null ? cartResource.a() : null;
                if (cartResource instanceof c.Failure) {
                    Throwable error = ((c.Failure) cartResource).getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException != null && httpException.code() == 503) {
                        C15809k.d(d0.a(L.this), null, null, new f(L.this, null), 3, null);
                    }
                }
                if (cartResource == null || (shoppingCartA = cartResource.a()) == null) {
                    return;
                }
                L l10 = L.this;
                c(shoppingCartA.p());
                C15809k.d(d0.a(l10), null, null, new g(l10, ((ViewState) l10._couponDetailStateFlow.getValue()).getCouponState(), shoppingCartA, null), 3, null);
            }
        }

        @Override // wr.InterfaceC17909a
        public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                L.this.z0();
                C15809k.d(d0.a(L.this), null, null, new h(L.this, null), 3, null);
            } else {
                C15809k.d(d0.a(L.this), null, null, new i(L.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17454a.Add) {
                a(entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17454a.Update) {
                d(entryChange);
            } else if (processedRequest instanceof AbstractC17454a.Remove) {
                b(entryChange);
            } else {
                if (!(processedRequest instanceof AbstractC17454a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                L.this.z0();
            }
        }

        @Override // wr.InterfaceC17909a
        public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17720a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17720a abstractC17720aF = challenge.f();
            Intrinsics.h(abstractC17720aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            C15809k.d(d0.a(L.this), null, null, new m(L.this, (AbstractC17720a.ChokingHazardChallenge) abstractC17720aF, null), 3, null);
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$f$b;", "Lcom/meijer/mobile/coupon/detail/L$f;", "", "messageResId", "actionResId", "LPk/a;", "coupon", "", "newShoppingListEnabled", "<init>", "(IILPk/a;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "LPk/a;", "()LPk/a;", "d", "Z", "()Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            public static final c f97173a = new c();

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

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0088\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b2\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b.\u00104R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b*\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\"\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b:\u0010'¨\u0006;"}, d2 = {"Lcom/meijer/mobile/coupon/detail/L$g;", "", "LYk/c;", "couponState", "", "couponIsLoaded", "", "cartItemCount", "", "LYr/a;", "couponDetailProductDecoratorList", "couponDetailProductDecoratorSingleItem", "shouldShowHeader", "LWr/a;", "countdownDecorator", "LIr/a;", "Lur/a;", "chokingDialog", "Lcom/meijer/mobile/coupon/detail/P;", "snackbarType", "newShoppingListEnabled", "<init>", "(LYk/c;ZILjava/util/List;LYr/a;ZLWr/a;LIr/a;Lcom/meijer/mobile/coupon/detail/P;Z)V", "a", "(LYk/c;ZILjava/util/List;LYr/a;ZLWr/a;LIr/a;Lcom/meijer/mobile/coupon/detail/P;Z)Lcom/meijer/mobile/coupon/detail/L$g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LYk/c;", "i", "()LYk/c;", "b", "Z", "h", "()Z", "c", "I", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "LYr/a;", "g", "()LYr/a;", "k", "LWr/a;", "()LWr/a;", "LIr/a;", "()LIr/a;", "Lcom/meijer/mobile/coupon/detail/P;", "getSnackbarType", "()Lcom/meijer/mobile/coupon/detail/P;", "j", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        private final UserActionDialogInfo<AbstractC17454a> chokingDialog;

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
            UserActionDialogInfo<AbstractC17454a> userActionDialogInfo = this.chokingDialog;
            int iHashCode4 = (iHashCode3 + (userActionDialogInfo == null ? 0 : userActionDialogInfo.hashCode())) * 31;
            P p10 = this.snackbarType;
            return ((iHashCode4 + (p10 != null ? p10.hashCode() : 0)) * 31) + Boolean.hashCode(this.newShoppingListEnabled);
        }

        public String toString() {
            return "ViewState(couponState=" + this.couponState + ", couponIsLoaded=" + this.couponIsLoaded + ", cartItemCount=" + this.cartItemCount + ", couponDetailProductDecoratorList=" + this.couponDetailProductDecoratorList + ", couponDetailProductDecoratorSingleItem=" + this.couponDetailProductDecoratorSingleItem + ", shouldShowHeader=" + this.shouldShowHeader + ", countdownDecorator=" + this.countdownDecorator + ", chokingDialog=" + this.chokingDialog + ", snackbarType=" + this.snackbarType + ", newShoppingListEnabled=" + this.newShoppingListEnabled + ')';
        }

        public ViewState(CouponState couponState, boolean z10, int i10, List<CouponsProductDecorator> list, CouponsProductDecorator couponsProductDecorator, boolean z11, CouponSavingsCountdownDecorator countdownDecorator, UserActionDialogInfo<AbstractC17454a> userActionDialogInfo, P p10, boolean z12) {
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

        public final ViewState a(CouponState couponState, boolean couponIsLoaded, int cartItemCount, List<CouponsProductDecorator> couponDetailProductDecoratorList, CouponsProductDecorator couponDetailProductDecoratorSingleItem, boolean shouldShowHeader, CouponSavingsCountdownDecorator countdownDecorator, UserActionDialogInfo<AbstractC17454a> chokingDialog, P snackbarType, boolean newShoppingListEnabled) {
            Intrinsics.j(couponState, "couponState");
            Intrinsics.j(countdownDecorator, "countdownDecorator");
            return new ViewState(couponState, couponIsLoaded, cartItemCount, couponDetailProductDecoratorList, couponDetailProductDecoratorSingleItem, shouldShowHeader, countdownDecorator, chokingDialog, snackbarType, newShoppingListEnabled);
        }

        /* renamed from: c, reason: from getter */
        public final int getCartItemCount() {
            return this.cartItemCount;
        }

        public final UserActionDialogInfo<AbstractC17454a> d() {
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
                iArr[d.f97122a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f97123b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel", f = "CouponDetailViewModel.kt", l = {249}, m = "addCouponToShoppingList")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97191a;

        /* renamed from: b, reason: collision with root package name */
        Object f97192b;

        /* renamed from: c, reason: collision with root package name */
        Object f97193c;

        /* renamed from: d, reason: collision with root package name */
        Object f97194d;

        /* renamed from: e, reason: collision with root package name */
        Object f97195e;

        /* renamed from: f, reason: collision with root package name */
        Object f97196f;

        /* renamed from: g, reason: collision with root package name */
        int f97197g;

        /* renamed from: h, reason: collision with root package name */
        int f97198h;

        /* renamed from: i, reason: collision with root package name */
        int f97199i;

        /* renamed from: j, reason: collision with root package name */
        int f97200j;

        /* renamed from: k, reason: collision with root package name */
        int f97201k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f97202l;

        /* renamed from: n, reason: collision with root package name */
        int f97204n;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97202l = obj;
            this.f97204n |= Integer.MIN_VALUE;
            return L.this.X(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$addCouponToShoppingList$2$3$1", f = "CouponDetailViewModel.kt", l = {257}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97205a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f97207c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new j(this.f97207c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Coupon coupon, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f97207c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97205a;
            if (i10 == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, P.f97260a, false, 767, null)));
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.CouponAddedToShoppingListEvent couponAddedToShoppingListEvent = new f.CouponAddedToShoppingListEvent(Nk.a.f21005a, Nk.a.f21009e, this.f97207c, L.this.featureManager.e(AbstractC18503f.O.f172854h));
                this.f97205a = 1;
                if (interfaceC16548A.emit(couponAddedToShoppingListEvent, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$addCouponToShoppingList$2$4$1", f = "CouponDetailViewModel.kt", l = {269}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97208a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97208a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(C18546a.f173197d, C18546a.f173196c, false, 4, null);
                this.f97208a = 1;
                if (interfaceC16548A.emit(simpleOkAlertDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$observeCartCount$1$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97210a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f97212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Integer num, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f97212c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new l(this.f97212c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f97210a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
            Integer num = this.f97212c;
            do {
                value = interfaceC16549B.getValue();
                Intrinsics.g(num);
            } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, num.intValue(), null, null, false, null, null, null, false, 1019, null)));
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$observeCartInteractor$1", f = "CouponDetailViewModel.kt", l = {164}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97213a;

        /* renamed from: b, reason: collision with root package name */
        int f97214b;

        /* renamed from: c, reason: collision with root package name */
        int f97215c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f97216d;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = L.this.new n(continuation);
            nVar.f97216d = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97215c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f97216d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f97216d;
                    L l10 = L.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = l10.cartInteractor;
                    this.f97216d = r14;
                    this.f97213a = r14;
                    this.f97214b = 0;
                    this.f97215c = 1;
                    i10 = r14;
                    if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
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
                    qw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$1", f = "CouponDetailViewModel.kt", l = {552}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97218a;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97218a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                L l10 = L.this;
                this.f97218a = 1;
                if (l10.X(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$2", f = "CouponDetailViewModel.kt", l = {553}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97220a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97220a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                L l10 = L.this;
                this.f97220a = 1;
                if (l10.y0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$3", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97222a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f97222a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, null, false, 895, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onAction$4", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97224a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f97224a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 0, null, null, false, null, null, null, false, 895, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onCouponState$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97226a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponState f97228c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new s(this.f97228c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(CouponState couponState, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f97228c = couponState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            if (this.f97226a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
            CouponState couponState = this.f97228c;
            L l10 = L.this;
            do {
                value = interfaceC16549B.getValue();
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
            } while (!interfaceC16549B.e(value, ViewState.b(viewState, couponState, true, 0, arrayList, couponsProductDecorator, z10, CouponSavingsCountdownDecorator.b(viewState.getCountdownDecorator(), (couponState.getAssociatedProductsState().b().isEmpty() || !couponState.getCoupon().x()) ? false : z11, null, null, 0.0d, 0.0d, 30, null), null, null, false, 900, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onDismissCouponFailure$1", f = "CouponDetailViewModel.kt", l = {315}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97229a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97229a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new f.SimpleOkAlertDialogEvent(Nr.g.f22722x, Nk.a.f21006b, false, 4, null);
                this.f97229a = 1;
                if (interfaceC16548A.emit(simpleOkAlertDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onDismissCouponSuccess$1", f = "CouponDetailViewModel.kt", l = {308}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97231a;

        u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97231a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.c cVar = f.c.f97173a;
                this.f97231a = 1;
                if (interfaceC16548A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$onStepperChange$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97233a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            ArrayList arrayList;
            CouponsProductDecorator couponDetailProductDecoratorSingleItem;
            IntrinsicsKt.f();
            if (this.f97233a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
            do {
                value = interfaceC16549B.getValue();
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
            } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, 0, arrayList, couponDetailProductDecoratorSingleItem != null ? CouponsProductDecorator.v(couponDetailProductDecoratorSingleItem, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33423359, null) : null, false, null, null, null, false, androidx.room.G.MAX_BIND_PARAMETER_CNT, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$performAction$2", f = "CouponDetailViewModel.kt", l = {HttpResponseStatus.ERROR_LENGTH_REQUIRED}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97235a;

        w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97235a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.RequiresLoginEvent requiresLoginEvent = new f.RequiresLoginEvent(Nr.g.f22706p);
                this.f97235a = 1;
                if (interfaceC16548A.emit(requiresLoginEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$performAction$onCallFailure$1", f = "CouponDetailViewModel.kt", l = {381}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97237a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f97239c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f97240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Throwable th2, d dVar, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f97239c = th2;
            this.f97240d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new x(this.f97239c, this.f97240d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97237a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = L.this._eventFlow;
                f.ClipUnclipCouponFailureEvent clipUnclipCouponFailureEvent = new f.ClipUnclipCouponFailureEvent(new CouponException(this.f97239c, ((ViewState) L.this._couponDetailStateFlow.getValue()).getCouponState().getCoupon()), this.f97240d);
                this.f97237a = 1;
                if (interfaceC16548A.emit(clipUnclipCouponFailureEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel$performAction$onCallSuccess$1", f = "CouponDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97241a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f97243c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.f97122a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.f97123b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(d dVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f97243c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new y(this.f97243c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            CouponSavingsCountdownDecorator countdownDecorator;
            boolean z10;
            IntrinsicsKt.f();
            if (this.f97241a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = L.this._couponDetailStateFlow;
            d dVar = this.f97243c;
            do {
                value = interfaceC16549B.getValue();
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
            } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, 0, null, null, false, CouponSavingsCountdownDecorator.b(countdownDecorator, z10, null, null, 0.0d, 0.0d, 30, null), null, null, false, 959, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.detail.CouponDetailViewModel", f = "CouponDetailViewModel.kt", l = {282}, m = "removeCouponFromShoppingList")
    static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97244a;

        /* renamed from: b, reason: collision with root package name */
        Object f97245b;

        /* renamed from: c, reason: collision with root package name */
        Object f97246c;

        /* renamed from: d, reason: collision with root package name */
        Object f97247d;

        /* renamed from: e, reason: collision with root package name */
        Object f97248e;

        /* renamed from: f, reason: collision with root package name */
        Object f97249f;

        /* renamed from: g, reason: collision with root package name */
        int f97250g;

        /* renamed from: h, reason: collision with root package name */
        int f97251h;

        /* renamed from: i, reason: collision with root package name */
        int f97252i;

        /* renamed from: j, reason: collision with root package name */
        int f97253j;

        /* renamed from: k, reason: collision with root package name */
        int f97254k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f97255l;

        /* renamed from: n, reason: collision with root package name */
        int f97257n;

        z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97255l = obj;
            this.f97257n |= Integer.MIN_VALUE;
            return L.this.y0(this);
        }
    }

    public L(yo.k userManager, C5371b couponChangeManager, Eq.b shoppingListRepository, il.m cartRepository, wr.f cartInteractor, InterfaceC14523a analyticsEngine, C13702d couponsRepository, Yk.u couponStateRepository, yo.f storeManager, zl.k featureManager) {
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
        this._couponDetailStateFlow = S.a(new ViewState(null, false, 0, null, null, false, null, null, null, featureManager.e(AbstractC18503f.O.f172854h), 511, null));
        InterfaceC16548A<f> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        this.lastKnownCartQuantities = new LinkedHashMap();
        Dk.a.a(couponStateRepository.t(), aVar);
        io.reactivex.l<List<CouponState>> lVarO = couponStateRepository.O();
        final C11715a c11715a = new C11715a(this);
        Lu.g<? super List<CouponState>> gVar = new Lu.g() { // from class: com.meijer.mobile.coupon.detail.A
            @Override // Lu.g
            public final void accept(Object obj) {
                L.H(c11715a, obj);
            }
        };
        final C11716b c11716b = new C11716b(qw.a.INSTANCE);
        Dk.a.a(lVarO.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.coupon.detail.B
            @Override // Lu.g
            public final void accept(Object obj) {
                L.I(c11716b, obj);
            }
        }), aVar);
        if (userManager.b()) {
            wr.f.r(cartInteractor, false, new e(), 1, null);
        }
    }

    private final void A0() {
        K0();
        if (!this.userManager.b()) {
            C15809k.d(d0.a(this), null, null, new C(null), 3, null);
            return;
        }
        final Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        io.reactivex.u<Response<Unit>> uVarK = this.couponsRepository.w(Coupon.e(coupon, 0L, false, true, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null)).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.B0(this.f97307a, coupon, (Response) obj);
            }
        };
        Lu.g<? super Response<Unit>> gVar = new Lu.g() { // from class: com.meijer.mobile.coupon.detail.v
            @Override // Lu.g
            public final void accept(Object obj) {
                L.C0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.coupon.detail.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.E0(this.f97310a, coupon, (Throwable) obj);
            }
        };
        Intrinsics.g(Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.coupon.detail.x
            @Override // Lu.g
            public final void accept(Object obj) {
                L.F0(function12, obj);
            }
        }), this.disposables));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(L l10, Coupon coupon, Response response) {
        if (response.isSuccessful()) {
            l10.p0(Coupon.e(coupon, 0L, false, true, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null));
        } else {
            l10.o0(Coupon.e(coupon, 0L, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null));
        }
        return Unit.f143329a;
    }

    private final void I0(d action) {
        String str;
        final Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        int i10 = h.$EnumSwitchMapping$0[action.ordinal()];
        if (i10 == 1) {
            str = "coupon clip";
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "coupon unclip";
        }
        interfaceC14523a.b(C14756c.a(str), new Function1() { // from class: com.meijer.mobile.coupon.detail.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.J0(this.f97313a, coupon, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(L l10, Coupon coupon, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.n(l10.c0(coupon));
        Rk.b bVar = Rk.b.f33418a;
        track.c(bVar.h(l10.c0(coupon)));
        track.c(bVar.e(coupon));
        return Unit.f143329a;
    }

    private final void K0() {
        final Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        this.analyticsEngine.b(C14756c.a("event: Coupon not interested"), new Function1() { // from class: com.meijer.mobile.coupon.detail.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.L0(this.f97315a, coupon, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(L l10, Coupon coupon, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("coupons");
        track.n(l10.c0(coupon));
        track.c(Rk.b.f33418a.e(coupon));
        return Unit.f143329a;
    }

    private final void M0(final Coupon coupon, final String previousTrackAction) {
        this.analyticsEngine.b(C14756c.h(c0(coupon)), new Function1() { // from class: com.meijer.mobile.coupon.detail.I
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
        track.c(Rk.b.f33418a.e(coupon));
        track.p(str);
        return Unit.f143329a;
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
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C13889a.b());
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return L.e0(this.f97303a, (Integer) obj);
                }
            };
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.coupon.detail.C
                @Override // Lu.g
                public final void accept(Object obj) {
                    L.f0(function1, obj);
                }
            };
            final m mVar = new m(qw.a.INSTANCE);
            Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.coupon.detail.D
                @Override // Lu.g
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
            C15809k.d(d0.a(this), null, null, new n(null), 3, null);
        }
    }

    private final void i0(Pk.c couponIdentity, final String previousTrackAction) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.j0(this.f97080a, previousTrackAction, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.coupon.detail.F
            @Override // Lu.g
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
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.coupon.detail.H
            @Override // Lu.g
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(Throwable th2) {
        qw.a.INSTANCE.e(th2);
        return Unit.f143329a;
    }

    private final void o0(Coupon coupon) {
        this.couponStateRepository.S(CollectionsKt.e(coupon));
        C15809k.d(d0.a(this), null, null, new t(null), 3, null);
    }

    private final void p0(Coupon coupon) {
        this.couponStateRepository.S(CollectionsKt.e(coupon));
        this.couponChangeManager.a(new CouponsListChange(CouponsListChange.a.f36746c, coupon));
        C15809k.d(d0.a(this), null, null, new u(null), 3, null);
    }

    private final void r0(final d action) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarH;
        if (!this.userManager.b()) {
            C15809k.d(d0.a(this), null, null, new w(null), 3, null);
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
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = uVarH.k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.coupon.detail.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.s0(this.f97088a, action, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.coupon.detail.K
            @Override // Lu.g
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
        Intrinsics.g(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.coupon.detail.t
            @Override // Lu.g
            public final void accept(Object obj) {
                L.v0(function12, obj);
            }
        }));
    }

    private static final void x0(L l10, d dVar) {
        l10.I0(dVar);
        C15809k.d(d0.a(l10), null, null, l10.new y(dVar, null), 3, null);
        C5371b c5371b = l10.couponChangeManager;
        d dVar2 = d.f97122a;
        c5371b.a(new CouponsListChange(dVar == dVar2 ? CouponsListChange.a.f36744a : CouponsListChange.a.f36745b, l10._couponDetailStateFlow.getValue().getCouponState().getCoupon()));
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
    public final java.lang.Object y0(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.detail.L.y0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G0(EntryChange entryChange) {
        Intrinsics.j(entryChange, "entryChange");
        Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        C2898u c2898u = C2898u.f1904a;
        String strC0 = c0(coupon);
        ShoppingCart shoppingCart = this.cart;
        interfaceC14523a.k(c2898u.D(strC0, shoppingCart != null ? shoppingCart.getCode() : null, entryChange, coupon));
    }

    public final void H0(EntryChange entryChange) {
        Intrinsics.j(entryChange, "entryChange");
        Coupon coupon = this._couponDetailStateFlow.getValue().getCouponState().getCoupon();
        Entry entry = entryChange.getEntry();
        EntryChange entryChangeB = entry != null ? EntryChange.b(entryChange, Entry.b(entry, 0, ProductFullDetails.b(entry.m(), null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -17, 268435455, null), 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32765, null), null, null, 0.0d, 0.0d, 30, null) : null;
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        C2898u c2898u = C2898u.f1904a;
        String strC0 = c0(coupon);
        ShoppingCart shoppingCart = this.cart;
        interfaceC14523a.k(c2898u.F(strC0, shoppingCart != null ? shoppingCart.getCode() : null, entryChangeB, coupon));
    }

    public final double Y(String code) {
        Intrinsics.j(code, "code");
        Double d10 = this.lastKnownCartQuantities.get(code);
        if (d10 != null) {
            return d10.doubleValue();
        }
        return 0.0d;
    }

    public final pv.P<ViewState> Z() {
        return C16563h.c(this._couponDetailStateFlow);
    }

    public final InterfaceC16553F<f> a0() {
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
            return oldState.a(coupon.x() && !this._couponDetailStateFlow.getValue().getCouponState().getAssociatedProductsState().b().isEmpty(), Qr.a.k(coupon, value, false, 2, null), Wr.b.f41428b, value, coupon.getEarnCondition().getGoal());
        }
        if (!(earnCondition instanceof Coupon.c.Buy)) {
            if (Intrinsics.e(earnCondition, Coupon.c.b.f26149b)) {
                return CouponSavingsCountdownDecorator.b(oldState, coupon.x() && !this._couponDetailStateFlow.getValue().getCouponState().getAssociatedProductsState().b().isEmpty(), AbstractC6392a.INSTANCE.d(Nr.g.f22683d0, new Object[0]), Wr.b.f41427a, 0.0d, 0.0d, 24, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it2 = matchingProducts.iterator();
        double actualQuantity = 0.0d;
        while (it2.hasNext()) {
            actualQuantity += ((Entry) it2.next()).getActualQuantity();
        }
        return oldState.a(coupon.x() && !this._couponDetailStateFlow.getValue().getCouponState().getAssociatedProductsState().b().isEmpty(), Qr.a.b(coupon, actualQuantity, false, 2, null), Wr.b.f41427a, actualQuantity, coupon.getEarnCondition().getGoal());
    }

    public final void n0(AbstractC11717c action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC11717c.Initialize) {
            AbstractC11717c.Initialize initialize = (AbstractC11717c.Initialize) action;
            i0(initialize.getCoupon(), initialize.getPreviousTrackAction());
            return;
        }
        if (action instanceof AbstractC11717c.a) {
            C15809k.d(d0.a(this), null, null, new o(null), 3, null);
            return;
        }
        if (action instanceof AbstractC11717c.C1374c) {
            C15809k.d(d0.a(this), null, null, new p(null), 3, null);
            return;
        }
        if (action instanceof AbstractC11717c.UserAcceptAddToCartAction) {
            C15809k.d(d0.a(this), null, null, new q(null), 3, null);
            wr.f.B(this.cartInteractor, new AbstractC17440a.Accept(((AbstractC11717c.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null), false, null, 6, null);
            return;
        }
        if (action instanceof AbstractC11717c.UserDeclineAddToCartAction) {
            C15809k.d(d0.a(this), null, null, new r(null), 3, null);
            z0();
        } else if (action instanceof AbstractC11717c.StepperChange) {
            AbstractC11717c.StepperChange stepperChange = (AbstractC11717c.StepperChange) action;
            q0(stepperChange.getProduct(), stepperChange.getQuantityToUpdate());
        } else {
            if (!(action instanceof AbstractC11717c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.couponStateRepository.S(CollectionsKt.e(this._couponDetailStateFlow.getValue().getCouponState().getCoupon()));
        }
    }

    public void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            r0(d.f97122a);
            return;
        }
        if (action instanceof a.Unclip) {
            r0(d.f97123b);
        } else if (action instanceof a.NotInterested) {
            A0();
        } else if (!(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        d0();
        h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(L l10, Coupon coupon, Throwable th2) {
        l10.o0(Coupon.e(coupon, 0L, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741819, null));
        return Unit.f143329a;
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
        C15809k.d(d0.a(l10), null, null, l10.new l(num, null), 3, null);
        return Unit.f143329a;
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
            C15809k.d(d0.a(this), null, null, new s(couponState, null), 3, null);
        }
    }

    private final void q0(ProductFullDetails product, double quantityToUpdate) {
        C15809k.d(d0.a(this), null, null, new v(null), 3, null);
        O0(product, quantityToUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(L l10, d dVar, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        x0(l10, dVar);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(d dVar, L l10, Throwable th2) {
        Intrinsics.g(th2);
        w0(l10, th2, dVar);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private static final void w0(L l10, Throwable th2, d dVar) {
        C15809k.d(d0.a(l10), null, null, l10.new x(th2, dVar, null), 3, null);
    }

    public final void z0() {
        C15809k.d(d0.a(this), null, null, new B(null), 3, null);
    }
}
