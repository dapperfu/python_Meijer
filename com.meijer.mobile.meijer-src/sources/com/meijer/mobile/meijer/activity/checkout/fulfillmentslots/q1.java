package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Cm.FulfillmentPartnerDecorator;
import Cm.FulfillmentSlotDayDecorator;
import Cm.FulfillmentSlotErrorDecorator;
import Ik.Validation;
import Ik.d;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import com.meijer.mobile.core.models.store.StoreDeliveryPrice;
import com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11978l;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.t;
import di.CustomerAddress;
import ev.C13889a;
import fj.CartChanges;
import fj.EntryChange;
import fj.ShoppingCart;
import fj.n;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jj.FulfillmentSlot;
import kl.CheckoutFlowState;
import kl.CheckoutState;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16562g;
import qw.a;
import uk.AbstractC17440a;
import uk.c;
import ul.FulfillmentDay;
import ul.FulfillmentSchedule;
import wk.C17898a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002rxBA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b,\u0010+J+\u0010/\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u0002012\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u00020\u00162\n\u00106\u001a\u00060-j\u0002`5H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0002¢\u0006\u0004\b9\u0010'J\u000f\u0010:\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010'J\u000f\u0010;\u001a\u00020\u0016H\u0002¢\u0006\u0004\b;\u0010'J+\u0010A\u001a\u00020\u00162\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<2\u0006\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\bA\u0010BJ1\u0010G\u001a\u00020\u00162\b\b\u0002\u0010D\u001a\u00020C2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\bG\u0010HJ#\u0010L\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0016H\u0002¢\u0006\u0004\bN\u0010'J\u0017\u0010O\u001a\u00020\u00162\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020\"H\u0002¢\u0006\u0004\bR\u0010%J\u0017\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\"H\u0002¢\u0006\u0004\bT\u0010%J\u0017\u0010U\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\"H\u0002¢\u0006\u0004\bU\u0010%J\u000f\u0010V\u001a\u00020\u0016H\u0014¢\u0006\u0004\bV\u0010'J\u0017\u0010Y\u001a\u00020\u00162\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020[H\u0007¢\u0006\u0004\b]\u0010^J\u0015\u0010a\u001a\u00020\u00162\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR8\u0010t\u001a&\u0012\f\u0012\n q*\u0004\u0018\u00010p0p q*\u0012\u0012\f\u0012\n q*\u0004\u0018\u00010p0p\u0018\u00010o0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR#\u0010|\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020w0u8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0018\u0010@\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020v0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u001cR\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u008b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lyo/f;", "storeManager", "Ltl/h;", "timeSlotRepository", "Lkl/t;", "checkoutRepository", "Lil/m;", "cartRepository", "Lzl/k;", "featureManager", "Lkl/d;", "checkoutFlowRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lyo/f;Ltl/h;Lkl/t;Lil/m;Lzl/k;Lkl/d;Lhi/a;)V", "Lfj/o;", "partner", "", "u0", "(Lfj/o;)V", "Lfj/C;", "cart", "", "Z", "(Lfj/C;)Ljava/lang/Double;", "Lkl/f;", "checkoutFlowState", "l0", "(Lkl/f;)V", "", "isTimeslotSelected", "x0", "(Z)V", "Y", "()V", "Lkl/v;", "checkoutState", "s0", "(Lkl/v;)V", "m0", "", "selectedDeliveryPartner", "b0", "(Lfj/C;Lkl/v;Ljava/lang/String;)V", "Lul/d;", "fulfillmentSchedule", "n0", "(Lul/d;Lkl/v;)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "fulfillmentSlotId", "v0", "(Ljava/lang/String;)V", "z0", "X", "A0", "Luk/a;", "Lfj/n;", "Lfj/e;", "challenge", "selectedPartner", "L0", "(Luk/a;Lfj/o;)V", "", "storeId", "storeName", "storeZip", "J0", "(ILjava/lang/String;Ljava/lang/String;)V", "Ljj/c;", "selectedSlot", "isExpressPickUp", "I0", "(Ljj/c;Ljava/lang/Boolean;)V", "B0", "G0", "(Lul/d;)V", "isLoading", "y0", "isEarlyDelivery", "w0", "E0", "onCleared", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "LCm/m;", "fulfillmentSlotDayDecorator", "t0", "(LCm/m;)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "action", "e0", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;)V", "a", "Lyo/f;", "b", "Ltl/h;", "c", "Lkl/t;", "d", "Lil/m;", "e", "Lzl/k;", "f", "Lhi/a;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/core/models/store/StoreDeliveryPrice;", "kotlin.jvm.PlatformType", "g", "Lcom/squareup/moshi/h;", "moshiBuilder", "LMk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;", "h", "LMk/b;", "a0", "()LMk/b;", "flow", "i", "Lfj/o;", "Lpv/B;", "j", "Lpv/B;", "_isValid", "k", "viewStateStore", "LJu/a;", "l", "LJu/a;", "disposables", "m", "isSetTimeSlotEvent", "Lpv/P;", "d0", "()Lpv/P;", "isValid", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class q1 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tl.h timeSlotRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kl.t checkoutRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.h<StoreDeliveryPrice> moshiBuilder;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Mk.b<FulfillmentSlotsViewState, h> flow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private fj.o selectedPartner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Boolean> _isValid;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<FulfillmentSlotsViewState> viewStateStore;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isSetTimeSlotEvent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, q1.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((q1) this.receiver).m0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
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
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        c(Object obj) {
            super(1, obj, q1.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((q1) this.receiver).l0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState checkoutFlowState) {
            a(checkoutFlowState);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        d(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$6", f = "FulfillmentSlotsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function3<InterfaceC16562g<? super FulfillmentSlotsViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103927a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f103928b;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super FulfillmentSlotsViewState> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.f103928b = th2;
            return fVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103927a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.e((Throwable) this.f103928b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "<init>", "()V", "k", "d", "i", "j", "h", "f", "a", "g", "e", "b", "c", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "Lfj/o;", "partnerEligibility", "<init>", "(Lfj/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfj/o;", "()Lfj/o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$g$a, reason: from toString */
        public static final /* data */ class DeliveryFulfillmentPartnerSelected extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final fj.o partnerEligibility;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeliveryFulfillmentPartnerSelected) && this.partnerEligibility == ((DeliveryFulfillmentPartnerSelected) other).partnerEligibility;
            }

            public int hashCode() {
                return this.partnerEligibility.hashCode();
            }

            public String toString() {
                return "DeliveryFulfillmentPartnerSelected(partnerEligibility=" + this.partnerEligibility + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeliveryFulfillmentPartnerSelected(fj.o partnerEligibility) {
                super(null);
                Intrinsics.j(partnerEligibility, "partnerEligibility");
                this.partnerEligibility = partnerEligibility;
            }

            /* renamed from: a, reason: from getter */
            public final fj.o getPartnerEligibility() {
                return this.partnerEligibility;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final b f103930a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1215402749;
            }

            public String toString() {
                return "EditTimeslotInfo";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final c f103931a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1590162816;
            }

            public String toString() {
                return "EditTimeslotInfoWithExpiredWarning";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final d f103932a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1952289202;
            }

            public String toString() {
                return "RefetchSlots";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final e f103933a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -156446558;
            }

            public String toString() {
                return "RemoveItemsAndContinue";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "LCm/m;", "fulfillmentSlotDayDecorator", "<init>", "(LCm/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCm/m;", "()LCm/m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$g$f, reason: from toString */
        public static final /* data */ class SelectDay extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectDay) && Intrinsics.e(this.fulfillmentSlotDayDecorator, ((SelectDay) other).fulfillmentSlotDayDecorator);
            }

            public int hashCode() {
                return this.fulfillmentSlotDayDecorator.hashCode();
            }

            public String toString() {
                return "SelectDay(fulfillmentSlotDayDecorator=" + this.fulfillmentSlotDayDecorator + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectDay(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
                super(null);
                Intrinsics.j(fulfillmentSlotDayDecorator, "fulfillmentSlotDayDecorator");
                this.fulfillmentSlotDayDecorator = fulfillmentSlotDayDecorator;
            }

            /* renamed from: a, reason: from getter */
            public final FulfillmentSlotDayDecorator getFulfillmentSlotDayDecorator() {
                return this.fulfillmentSlotDayDecorator;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$g$g, reason: collision with other inner class name */
        public static final /* data */ class C1466g extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final C1466g f103935a = new C1466g();

            private C1466g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1466g);
            }

            public int hashCode() {
                return -1534764960;
            }

            public String toString() {
                return "SelectOtherDeliveryPartner";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "fulfillmentSlotId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$g$h, reason: from toString */
        public static final /* data */ class SelectTimeSlot extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fulfillmentSlotId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectTimeSlot) && Intrinsics.e(this.fulfillmentSlotId, ((SelectTimeSlot) other).fulfillmentSlotId);
            }

            public int hashCode() {
                return this.fulfillmentSlotId.hashCode();
            }

            public String toString() {
                return "SelectTimeSlot(fulfillmentSlotId=" + this.fulfillmentSlotId + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectTimeSlot(String fulfillmentSlotId) {
                super(null);
                Intrinsics.j(fulfillmentSlotId, "fulfillmentSlotId");
                this.fulfillmentSlotId = fulfillmentSlotId;
            }

            /* renamed from: a, reason: from getter */
            public final String getFulfillmentSlotId() {
                return this.fulfillmentSlotId;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "isEarlyDelivery", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$g$i, reason: from toString */
        public static final /* data */ class SetEarlyDeliveryAction extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEarlyDelivery;

            public SetEarlyDeliveryAction(boolean z10) {
                super(null);
                this.isEarlyDelivery = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetEarlyDeliveryAction) && this.isEarlyDelivery == ((SetEarlyDeliveryAction) other).isEarlyDelivery;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEarlyDelivery);
            }

            public String toString() {
                return "SetEarlyDeliveryAction(isEarlyDelivery=" + this.isEarlyDelivery + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsEarlyDelivery() {
                return this.isEarlyDelivery;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "pickupOption", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$g$j, reason: from toString */
        public static final /* data */ class SetPickupOption extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final G1 pickupOption;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPickupOption) && Intrinsics.e(this.pickupOption, ((SetPickupOption) other).pickupOption);
            }

            public int hashCode() {
                return this.pickupOption.hashCode();
            }

            public String toString() {
                return "SetPickupOption(pickupOption=" + this.pickupOption + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPickupOption(G1 pickupOption) {
                super(null);
                Intrinsics.j(pickupOption, "pickupOption");
                this.pickupOption = pickupOption;
            }

            /* renamed from: a, reason: from getter */
            public final G1 getPickupOption() {
                return this.pickupOption;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g$k;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final k f103939a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public int hashCode() {
                return -2123671379;
            }

            public String toString() {
                return "SetTimeSlot";
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class h {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103940a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1132793450;
            }

            public String toString() {
                return "ShowOosItems";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;", "", "isBopasTimeSlot", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$h$b, reason: from toString */
        public static final /* data */ class TimeSlotSetCanProceedToNextStepInCheckout extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isBopasTimeSlot;

            public TimeSlotSetCanProceedToNextStepInCheckout(boolean z10) {
                super(null);
                this.isBopasTimeSlot = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TimeSlotSetCanProceedToNextStepInCheckout) && this.isBopasTimeSlot == ((TimeSlotSetCanProceedToNextStepInCheckout) other).isBopasTimeSlot;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isBopasTimeSlot);
            }

            public String toString() {
                return "TimeSlotSetCanProceedToNextStepInCheckout(isBopasTimeSlot=" + this.isBopasTimeSlot + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsBopasTimeSlot() {
                return this.isBopasTimeSlot;
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$changeDeliveryPartner$1$2$1", f = "FulfillmentSlotsViewModel.kt", l = {389}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103942a;

        /* renamed from: b, reason: collision with root package name */
        Object f103943b;

        /* renamed from: c, reason: collision with root package name */
        Object f103944c;

        /* renamed from: d, reason: collision with root package name */
        Object f103945d;

        /* renamed from: e, reason: collision with root package name */
        Object f103946e;

        /* renamed from: f, reason: collision with root package name */
        Object f103947f;

        /* renamed from: g, reason: collision with root package name */
        int f103948g;

        /* renamed from: h, reason: collision with root package name */
        int f103949h;

        /* renamed from: i, reason: collision with root package name */
        int f103950i;

        /* renamed from: j, reason: collision with root package name */
        int f103951j;

        /* renamed from: k, reason: collision with root package name */
        int f103952k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f103953l;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ FulfillmentPartnerDecorator f103955n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = q1.this.new i(this.f103955n, continuation);
            iVar.f103953l = obj;
            return iVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(FulfillmentPartnerDecorator fulfillmentPartnerDecorator, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f103955n = fulfillmentPartnerDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            List<EntryChange> listC;
            List<EntryChange> listC2;
            Object value3;
            Integer storeId;
            Object value4;
            Object objB2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103952k;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f103953l;
                    q1.this.y0(true);
                    InterfaceC16549B interfaceC16549B = q1.this.viewStateStore;
                    do {
                        value4 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value4, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value4, true, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131070, null)));
                    ShoppingCart shoppingCartE = ((FulfillmentSlotsViewState) q1.this.viewStateStore.getValue()).getCheckoutState().i().e();
                    CustomerAddress deliveryAddress = shoppingCartE != null ? shoppingCartE.getDeliveryAddress() : null;
                    Intrinsics.g(deliveryAddress);
                    FulfillmentPartnerDecorator fulfillmentPartnerDecorator = this.f103955n;
                    q1 q1Var = q1.this;
                    Result.Companion companion = Result.INSTANCE;
                    Integer numV = StringsKt.v(fulfillmentPartnerDecorator.getStoreId());
                    n.Delivery delivery = new n.Delivery(Boxing.d(numV != null ? numV.intValue() : 0), deliveryAddress, false, 4, null);
                    il.m mVar = q1Var.cartRepository;
                    AbstractC17440a.Accept accept = new AbstractC17440a.Accept(delivery, new CartChanges(Boxing.d(Integer.parseInt(fulfillmentPartnerDecorator.getStoreId())), null, null, 6, null), null, 4, null);
                    fj.o fulfillmentPartner = fulfillmentPartnerDecorator.getFulfillmentPartner();
                    this.f103953l = interfaceC15783O;
                    this.f103942a = deliveryAddress;
                    this.f103943b = interfaceC15783O;
                    this.f103944c = this;
                    this.f103945d = this;
                    this.f103946e = interfaceC15783O;
                    this.f103947f = delivery;
                    this.f103948g = 0;
                    this.f103949h = 0;
                    this.f103950i = 0;
                    this.f103951j = 0;
                    this.f103952k = 1;
                    objB2 = mVar.B(accept, fulfillmentPartner, this);
                    if (objB2 == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objB2 = obj;
                }
                objB = Result.b(objB2);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            q1 q1Var2 = q1.this;
            FulfillmentPartnerDecorator fulfillmentPartnerDecorator2 = this.f103955n;
            if (Result.h(objB)) {
                uk.c cVar = (uk.c) objB;
                if (cVar instanceof c.Success) {
                    CartChanges cartChanges = (CartChanges) ((c.Success) cVar).a();
                    q1.K0(q1Var2, (cartChanges == null || (storeId = cartChanges.getStoreId()) == null) ? 0 : storeId.intValue(), null, null, 6, null);
                    q1Var2.z0();
                } else if (cVar instanceof c.Failure) {
                    InterfaceC16549B interfaceC16549B2 = q1Var2.viewStateStore;
                    do {
                        value2 = interfaceC16549B2.getValue();
                    } while (!interfaceC16549B2.e(value2, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value2, false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131070, null)));
                    c.Failure failure = (c.Failure) cVar;
                    Throwable error = failure.getError();
                    if (error instanceof ChangeFulfillmentModeChallenge) {
                        CartChanges cartChanges2 = (CartChanges) failure.a();
                        if (cartChanges2 == null || (listC = cartChanges2.c()) == null || !(!listC.isEmpty())) {
                            Throwable error2 = failure.getError();
                            Intrinsics.h(error2, "null cannot be cast to non-null type com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge");
                            q1Var2.L0(((ChangeFulfillmentModeChallenge) error2).a(), fulfillmentPartnerDecorator2.getFulfillmentPartner());
                        } else {
                            a.Companion companion3 = qw.a.INSTANCE;
                            CartChanges cartChanges3 = (CartChanges) failure.a();
                            companion3.a(String.valueOf(cartChanges3 != null ? cartChanges3.c() : null), new Object[0]);
                            CartChanges cartChanges4 = (CartChanges) failure.a();
                            if (cartChanges4 != null && (listC2 = cartChanges4.c()) != null) {
                                InterfaceC16549B interfaceC16549B3 = q1Var2.viewStateStore;
                                do {
                                    value3 = interfaceC16549B3.getValue();
                                } while (!interfaceC16549B3.e(value3, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value3, false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, listC2, null, 98303, null)));
                            }
                            q1Var2.y0(false);
                            q1Var2.a0().a(h.a.f103940a);
                        }
                    } else if ((error instanceof DigitalShoppingApiException) || (error instanceof JsonEncodingException)) {
                        q1Var2.A0();
                    }
                } else if (!(cVar instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            q1 q1Var3 = q1.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC16549B interfaceC16549B4 = q1Var3.viewStateStore;
                do {
                    value = interfaceC16549B4.getValue();
                } while (!interfaceC16549B4.e(value, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value, false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131070, null)));
                qw.a.INSTANCE.f(thE, "Change delivery partner failed.", new Object[0]);
                q1Var3.A0();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$editTimeslotAndShowExpiredWarning$2", f = "FulfillmentSlotsViewModel.kt", l = {176}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103956a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q1.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103956a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = q1.this._isValid;
                Boolean boolA = Boxing.a(false);
                this.f103956a = 1;
                if (interfaceC16549B.emit(boolA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$getFulfillmentSchedule$1", f = "FulfillmentSlotsViewModel.kt", l = {247}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103958a;

        /* renamed from: b, reason: collision with root package name */
        int f103959b;

        /* renamed from: c, reason: collision with root package name */
        int f103960c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f103961d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f103963f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f103964g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CheckoutState f103965h;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = q1.this.new k(this.f103963f, this.f103964g, this.f103965h, continuation);
            kVar.f103961d = obj;
            return kVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ShoppingCart shoppingCart, String str, CheckoutState checkoutState, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f103963f = shoppingCart;
            this.f103964g = str;
            this.f103965h = checkoutState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103960c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f103961d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f103961d;
                    q1.this.y0(true);
                    q1 q1Var = q1.this;
                    ShoppingCart shoppingCart = this.f103963f;
                    String str = this.f103964g;
                    Result.Companion companion = Result.INSTANCE;
                    tl.h hVar = q1Var.timeSlotRepository;
                    this.f103961d = r14;
                    this.f103958a = r14;
                    this.f103959b = 0;
                    this.f103960c = 1;
                    obj = hVar.m(shoppingCart, str, this);
                    i10 = r14;
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((FulfillmentSchedule) obj);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            q1 q1Var2 = q1.this;
            CheckoutState checkoutState = this.f103965h;
            if (Result.h(objB)) {
                q1Var2.n0((FulfillmentSchedule) objB, checkoutState);
            }
            q1 q1Var3 = q1.this;
            ShoppingCart shoppingCart2 = this.f103963f;
            CheckoutState checkoutState2 = this.f103965h;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                mv.E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    qw.a.INSTANCE.f(thE, "Unable to retrieve fulfillment schedule", new Object[0]);
                    q1Var3.n0(new FulfillmentSchedule(shoppingCart2.u(), CollectionsKt.m(), null, 4, null), checkoutState2);
                } else {
                    throw thE;
                }
            }
            q1.this.y0(false);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$onAction$10$1", f = "FulfillmentSlotsViewModel.kt", l = {723}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103966a;

        /* renamed from: b, reason: collision with root package name */
        Object f103967b;

        /* renamed from: c, reason: collision with root package name */
        Object f103968c;

        /* renamed from: d, reason: collision with root package name */
        Object f103969d;

        /* renamed from: e, reason: collision with root package name */
        Object f103970e;

        /* renamed from: f, reason: collision with root package name */
        int f103971f;

        /* renamed from: g, reason: collision with root package name */
        int f103972g;

        /* renamed from: h, reason: collision with root package name */
        int f103973h;

        /* renamed from: i, reason: collision with root package name */
        int f103974i;

        /* renamed from: j, reason: collision with root package name */
        int f103975j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f103976k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ n.Delivery f103978m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ FulfillmentPartnerDecorator f103979n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = q1.this.new l(this.f103978m, this.f103979n, continuation);
            lVar.f103976k = obj;
            return lVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n.Delivery delivery, FulfillmentPartnerDecorator fulfillmentPartnerDecorator, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f103978m = delivery;
            this.f103979n = fulfillmentPartnerDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            q1 q1Var;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103975j;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        q1Var = (q1) this.f103967b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f103976k;
                    q1 q1Var2 = q1.this;
                    n.Delivery delivery = this.f103978m;
                    FulfillmentPartnerDecorator fulfillmentPartnerDecorator = this.f103979n;
                    Result.Companion companion = Result.INSTANCE;
                    il.m mVar = q1Var2.cartRepository;
                    fj.o fulfillmentPartner = fulfillmentPartnerDecorator.getFulfillmentPartner();
                    this.f103976k = interfaceC15783O;
                    this.f103966a = interfaceC15783O;
                    this.f103967b = q1Var2;
                    this.f103968c = this;
                    this.f103969d = this;
                    this.f103970e = interfaceC15783O;
                    this.f103971f = 0;
                    this.f103972g = 0;
                    this.f103973h = 0;
                    this.f103974i = 0;
                    this.f103975j = 1;
                    if (mVar.C(delivery, fulfillmentPartner, this) == objF) {
                        return objF;
                    }
                    q1Var = q1Var2;
                }
                q1Var.z0();
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            q1 q1Var3 = q1.this;
            if (Result.e(objB) != null) {
                q1Var3.A0();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$onAction$9", f = "FulfillmentSlotsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103980a;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q1.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103980a == 0) {
                ResultKt.b(obj);
                q1.this.y0(true);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        n(Object obj) {
            super(1, obj, q1.class, "refreshTimeSlots", "refreshTimeSlots(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((q1) this.receiver).s0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        o(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$setIsTimeslotSelected$2", f = "FulfillmentSlotsViewModel.kt", l = {160}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103982a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f103984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(boolean z10, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f103984c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q1.this.new p(this.f103984c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103982a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = q1.this._isValid;
                Boolean boolA = Boxing.a(this.f103984c);
                this.f103982a = 1;
                if (interfaceC16549B.emit(boolA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$setTimeSlot$2", f = "FulfillmentSlotsViewModel.kt", l = {330}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103985a;

        /* renamed from: b, reason: collision with root package name */
        Object f103986b;

        /* renamed from: c, reason: collision with root package name */
        Object f103987c;

        /* renamed from: d, reason: collision with root package name */
        Object f103988d;

        /* renamed from: e, reason: collision with root package name */
        int f103989e;

        /* renamed from: f, reason: collision with root package name */
        int f103990f;

        /* renamed from: g, reason: collision with root package name */
        int f103991g;

        /* renamed from: h, reason: collision with root package name */
        int f103992h;

        /* renamed from: i, reason: collision with root package name */
        int f103993i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f103994j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<FulfillmentSlot> f103996l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Boolean> f103997m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Z"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$setTimeSlot$2$2$1", f = "FulfillmentSlotsViewModel.kt", l = {334}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103998a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1 f103999b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q1 q1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f103999b = q1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f103999b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Boolean> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f103998a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                il.m mVar = this.f103999b.cartRepository;
                this.f103998a = 1;
                Object objR = mVar.R(true, this);
                if (objR == objF) {
                    return objF;
                }
                return objR;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Ref.ObjectRef<FulfillmentSlot> objectRef, Ref.ObjectRef<Boolean> objectRef2, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f103996l = objectRef;
            this.f103997m = objectRef2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void p(q1 q1Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            q1Var.isSetTimeSlotEvent = true;
            q1Var.I0((FulfillmentSlot) objectRef.f143742a, (Boolean) objectRef2.f143742a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = q1.this.new q(this.f103996l, this.f103997m, continuation);
            qVar.f103994j = obj;
            return qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Boolean bool) {
            qw.a.INSTANCE.a("Cart refreshed", new Object[0]);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Throwable th2) {
            qw.a.INSTANCE.f(th2, "Cart refresh failed", new Object[0]);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103993i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f103994j;
                    q1 q1Var = q1.this;
                    Ref.ObjectRef<FulfillmentSlot> objectRef = this.f103996l;
                    Result.Companion companion = Result.INSTANCE;
                    il.m mVar = q1Var.cartRepository;
                    FulfillmentSlot fulfillmentSlot = objectRef.f143742a;
                    Intrinsics.g(fulfillmentSlot);
                    this.f103994j = interfaceC15783O;
                    this.f103985a = interfaceC15783O;
                    this.f103986b = this;
                    this.f103987c = this;
                    this.f103988d = interfaceC15783O;
                    this.f103989e = 0;
                    this.f103990f = 0;
                    this.f103991g = 0;
                    this.f103992h = 0;
                    this.f103993i = 1;
                    obj = mVar.c0(fulfillmentSlot, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            final q1 q1Var2 = q1.this;
            final Ref.ObjectRef<FulfillmentSlot> objectRef2 = this.f103996l;
            final Ref.ObjectRef<Boolean> objectRef3 = this.f103997m;
            if (Result.h(objB)) {
                io.reactivex.u uVarE = tv.n.c(null, new a(q1Var2, null), 1, null).q(C13889a.b()).e(new Lu.a() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.r1
                    @Override // Lu.a
                    public final void run() {
                        q1.q.p(q1Var2, objectRef2, objectRef3);
                    }
                });
                final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.s1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return q1.q.q((Boolean) obj2);
                    }
                };
                Lu.g gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.t1
                    @Override // Lu.g
                    public final void accept(Object obj2) {
                        q1.q.r(function1, obj2);
                    }
                };
                final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.u1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return q1.q.s((Throwable) obj2);
                    }
                };
                Dk.a.a(uVarE.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.v1
                    @Override // Lu.g
                    public final void accept(Object obj2) {
                        q1.q.t(function12, obj2);
                    }
                }), q1Var2.disposables);
            }
            q1 q1Var3 = q1.this;
            Ref.ObjectRef<FulfillmentSlot> objectRef4 = this.f103996l;
            Ref.ObjectRef<Boolean> objectRef5 = this.f103997m;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "set pickupSlot to cart failed", new Object[0]);
                q1Var3.isSetTimeSlotEvent = true;
                q1Var3.I0(objectRef4.f143742a, objectRef5.f143742a);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$updateStoreForCart$1", f = "FulfillmentSlotsViewModel.kt", l = {490}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f104000a;

        /* renamed from: b, reason: collision with root package name */
        Object f104001b;

        /* renamed from: c, reason: collision with root package name */
        Object f104002c;

        /* renamed from: d, reason: collision with root package name */
        Object f104003d;

        /* renamed from: e, reason: collision with root package name */
        Object f104004e;

        /* renamed from: f, reason: collision with root package name */
        int f104005f;

        /* renamed from: g, reason: collision with root package name */
        int f104006g;

        /* renamed from: h, reason: collision with root package name */
        int f104007h;

        /* renamed from: i, reason: collision with root package name */
        int f104008i;

        /* renamed from: j, reason: collision with root package name */
        int f104009j;

        /* renamed from: k, reason: collision with root package name */
        int f104010k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f104011l;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ AbstractC17440a<fj.n, CartChanges> f104013n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ fj.o f104014o;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            r rVar = q1.this.new r(this.f104013n, this.f104014o, continuation);
            rVar.f104011l = obj;
            return rVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(AbstractC17440a<fj.n, CartChanges> abstractC17440a, fj.o oVar, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f104013n = abstractC17440a;
            this.f104014o = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            AbstractC6392a.Companion companion;
            Object value2;
            int i10;
            int iIntValue;
            Integer storeId;
            Object value3;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f104010k;
            try {
                if (i11 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f104011l;
                    q1.this.y0(true);
                    InterfaceC16549B interfaceC16549B = q1.this.viewStateStore;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value3, true, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131070, null)));
                    AbstractC17440a<fj.n, CartChanges> abstractC17440a = this.f104013n;
                    q1 q1Var = q1.this;
                    fj.o oVar = this.f104014o;
                    Result.Companion companion2 = Result.INSTANCE;
                    fj.n nVarC = abstractC17440a.c();
                    il.m mVar = q1Var.cartRepository;
                    Intrinsics.h(nVarC, "null cannot be cast to non-null type com.meijer.mobile.cart.model.common.FulfillmentMode.Delivery");
                    this.f104011l = interfaceC15783O;
                    this.f104000a = interfaceC15783O;
                    this.f104001b = this;
                    this.f104002c = this;
                    this.f104003d = interfaceC15783O;
                    this.f104004e = nVarC;
                    this.f104005f = 0;
                    this.f104006g = 0;
                    this.f104007h = 0;
                    this.f104008i = 0;
                    this.f104009j = 0;
                    this.f104010k = 1;
                    objC = mVar.C((n.Delivery) nVarC, oVar, this);
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objC = obj;
                }
                objB = Result.b((uk.c) objC);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion3 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            q1 q1Var2 = q1.this;
            AbstractC17440a<fj.n, CartChanges> abstractC17440a2 = this.f104013n;
            if (Result.h(objB)) {
                uk.c cVar = (uk.c) objB;
                if (cVar instanceof c.Success) {
                    CartChanges cartChanges = (CartChanges) ((c.Success) cVar).a();
                    if (cartChanges == null || (storeId = cartChanges.getStoreId()) == null) {
                        Integer storeId2 = abstractC17440a2.f().getStoreId();
                        if (storeId2 != null) {
                            iIntValue = storeId2.intValue();
                        } else {
                            i10 = 0;
                            q1.K0(q1Var2, i10, null, null, 6, null);
                            q1Var2.z0();
                        }
                    } else {
                        iIntValue = storeId.intValue();
                    }
                    i10 = iIntValue;
                    q1.K0(q1Var2, i10, null, null, 6, null);
                    q1Var2.z0();
                } else if (cVar instanceof c.Failure) {
                    InterfaceC16549B interfaceC16549B2 = q1Var2.viewStateStore;
                    do {
                        value2 = interfaceC16549B2.getValue();
                    } while (!interfaceC16549B2.e(value2, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value2, false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131070, null)));
                    c.Failure failure = (c.Failure) cVar;
                    Throwable error = failure.getError();
                    if (error instanceof ChangeFulfillmentModeChallenge) {
                        q1Var2.A0();
                    } else if (error instanceof DigitalShoppingApiException) {
                        qw.a.INSTANCE.f(com.meijer.mobile.core.networking.exceptions.a.a(failure.getError()), "Error accepting Challenge", new Object[0]);
                        q1Var2.y0(false);
                        q1Var2.A0();
                    }
                } else if (!(cVar instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            q1 q1Var3 = q1.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.e(thE);
                InterfaceC16549B interfaceC16549B3 = q1Var3.viewStateStore;
                do {
                    value = interfaceC16549B3.getValue();
                    companion = AbstractC6392a.INSTANCE;
                } while (!interfaceC16549B3.e(value, FulfillmentSlotsViewState.m((FulfillmentSlotsViewState) value, false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, new AbstractC11978l.Error(companion.d(com.meijer.mobile.meijer.Y.f100960h9, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100940g9, new Object[0])), 65534, null)));
            }
            q1.this.y0(false);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Double Z(fj.ShoppingCart r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L34
            java.util.List r6 = r6.c()
            if (r6 == 0) goto L34
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r6.next()
            r2 = r1
            fj.b r2 = (fj.AvailableFulfillmentEligibility) r2
            java.lang.String r2 = r2.getFulfillmentEligibility()
            java.lang.String r3 = "BUNCHAELIGIBLE"
            r4 = 1
            boolean r2 = kotlin.text.StringsKt.H(r2, r3, r4)
            if (r2 == 0) goto Lf
            goto L2b
        L2a:
            r1 = r0
        L2b:
            fj.b r1 = (fj.AvailableFulfillmentEligibility) r1
            if (r1 == 0) goto L34
            java.lang.String r6 = r1.getStoreId()
            goto L35
        L34:
            r6 = r0
        L35:
            if (r6 != 0) goto L39
            java.lang.String r6 = ""
        L39:
            zl.k r1 = r5.featureManager
            zl.f$r r2 = zl.AbstractC18503f.C18520r.f172898h
            com.launchdarkly.sdk.LDValue r1 = r1.b(r2)
            boolean r2 = zl.C18502e.a(r1)
            if (r2 == 0) goto L48
            return r0
        L48:
            com.squareup.moshi.h<com.meijer.mobile.core.models.store.StoreDeliveryPrice> r2 = r5.moshiBuilder
            java.lang.String r1 = r1.y()
            java.lang.Object r1 = r2.fromJson(r1)
            com.meijer.mobile.core.models.store.StoreDeliveryPrice r1 = (com.meijer.mobile.core.models.store.StoreDeliveryPrice) r1
            if (r1 == 0) goto L88
            java.util.List r1 = r1.a()
            if (r1 == 0) goto L88
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.meijer.mobile.core.models.store.BunchaItem r3 = (com.meijer.mobile.core.models.store.BunchaItem) r3
            java.lang.String r3 = r3.getStore()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r3, r6)
            if (r3 == 0) goto L62
            goto L7b
        L7a:
            r2 = r0
        L7b:
            com.meijer.mobile.core.models.store.BunchaItem r2 = (com.meijer.mobile.core.models.store.BunchaItem) r2
            if (r2 == 0) goto L88
            double r0 = r2.getFee()
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.Z(fj.C):java.lang.Double");
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewModel$5", f = "FulfillmentSlotsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<FulfillmentSlotsViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103924a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f103925b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = q1.this.new e(continuation);
            eVar.f103925b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FulfillmentSlotsViewState fulfillmentSlotsViewState, Continuation<? super Unit> continuation) {
            return ((e) create(fulfillmentSlotsViewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103924a == 0) {
                ResultKt.b(obj);
                q1.this.a0().d(((FulfillmentSlotsViewState) this.f103925b).S());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public q1(yo.f storeManager, tl.h timeSlotRepository, kl.t checkoutRepository, il.m cartRepository, zl.k featureManager, kl.d checkoutFlowRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(checkoutFlowRepository, "checkoutFlowRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.storeManager = storeManager;
        this.timeSlotRepository = timeSlotRepository;
        this.checkoutRepository = checkoutRepository;
        this.cartRepository = cartRepository;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.moshiBuilder = new t.a().d().c(StoreDeliveryPrice.class);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z10 = false;
        FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecorator = null;
        Validation validation = null;
        boolean z11 = false;
        String str = null;
        CheckoutState checkoutState = null;
        CheckoutFlowState checkoutFlowState = null;
        boolean z12 = false;
        boolean z13 = false;
        FulfillmentSlot fulfillmentSlot = null;
        boolean z14 = false;
        boolean z15 = false;
        G1 g12 = null;
        List list = null;
        List list2 = null;
        AbstractC11978l abstractC11978l = null;
        this.flow = new Mk.b<>(new FulfillmentSlotsViewState(z10, fulfillmentSlotErrorDecorator, validation, false, z11, str, checkoutState, checkoutFlowState, z12, z13, fulfillmentSlot, z14, z15, g12, list, list2, abstractC11978l, 131071, defaultConstructorMarker));
        this._isValid = pv.S.a(Boolean.FALSE);
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549BA = pv.S.a(new FulfillmentSlotsViewState(z10, fulfillmentSlotErrorDecorator, validation, true, z11, str, checkoutState, checkoutFlowState, z12, z13, fulfillmentSlot, z14, z15, g12, list, list2, abstractC11978l, 131047, defaultConstructorMarker));
        this.viewStateStore = interfaceC16549BA;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        io.reactivex.l<CheckoutState> lVarS = checkoutRepository.s();
        final a aVar2 = new a(this);
        Lu.g<? super CheckoutState> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.d1
            @Override // Lu.g
            public final void accept(Object obj) {
                q1.E(aVar2, obj);
            }
        };
        a.Companion companion = qw.a.INSTANCE;
        final b bVar = new b(companion);
        Dk.a.a(lVarS.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e1
            @Override // Lu.g
            public final void accept(Object obj) {
                q1.F(bVar, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final c cVar = new c(this);
        Lu.g<? super CheckoutFlowState> gVar2 = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.f1
            @Override // Lu.g
            public final void accept(Object obj) {
                q1.G(cVar, obj);
            }
        };
        final d dVar = new d(companion);
        Dk.a.a(lVarG.subscribe(gVar2, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.g1
            @Override // Lu.g
            public final void accept(Object obj) {
                q1.H(dVar, obj);
            }
        }), aVar);
        C16563h.J(C16563h.g(C16563h.O(C16563h.c(interfaceC16549BA), new e(null)), new f(null)), androidx.view.d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        FulfillmentSlotsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, new AbstractC11978l.Error(companion.d(yr.Q.f171738F, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100940g9, new Object[0])), 65535, null)));
    }

    private final void B0() {
        final FulfillmentSlotsViewState value = this.flow.c().getValue();
        this.analyticsEngine.b(C14756c.a("Time slot selection"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q1.C0(value, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit C0(com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r8, ii.TrackingData r9) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.C0(com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, ii.f):kotlin.Unit");
    }

    private final void E0(boolean isEarlyDelivery) {
        final String str = isEarlyDelivery ? "yes" : "no";
        this.analyticsEngine.b(C14756c.a("Meijer: Timeslot selection: Early Delivery Prompt"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q1.F0(str, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("earlyDeliveryPromptAlert", "yes");
        track.h("earlyDeliveryPromptAlertAction", str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(FulfillmentSlot fulfillmentSlot, String str, String str2, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout timeslot selection");
        track.h("firstAvailableTimeslotDate", String.valueOf(fulfillmentSlot != null ? fulfillmentSlot.getDate() : null));
        track.h("firstAvailableTimeslotTime", str + " - " + str2);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(FulfillmentSlot selectedSlot, Boolean isExpressPickUp) {
        this.checkoutRepository.y(selectedSlot, isExpressPickUp);
    }

    private final void J0(int storeId, String storeName, String storeZip) {
        yo.f.q(this.storeManager, yo.d.f171589b, storeId, storeName, null, storeZip, 8, null);
    }

    static /* synthetic */ void K0(q1 q1Var, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        q1Var.J0(i10, str, str2);
    }

    private final void X() {
        Object next;
        Iterator<T> it = this.viewStateStore.getValue().E().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((FulfillmentPartnerDecorator) next).getIsPartnerSelected()) {
                    break;
                }
            }
        }
        FulfillmentPartnerDecorator fulfillmentPartnerDecorator = (FulfillmentPartnerDecorator) next;
        if (fulfillmentPartnerDecorator == null || C15809k.d(androidx.view.d0.a(this), null, null, new i(fulfillmentPartnerDecorator, null), 3, null) == null) {
            qw.a.INSTANCE.d("Selected fulfillment partner is null. This should not happen!!", new Object[0]);
        }
    }

    private final void Y() {
        FulfillmentSlotsViewState value;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, false, false, null, null, null, false, false, null, false, true, null, null, null, null, 124919, null)));
        C15809k.d(androidx.view.d0.a(this), null, null, new j(null), 3, null);
    }

    static /* synthetic */ void c0(q1 q1Var, ShoppingCart shoppingCart, CheckoutState checkoutState, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        q1Var.b0(shoppingCart, checkoutState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(CheckoutFlowState checkoutFlowState) {
        FulfillmentSlotsViewState value;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, false, false, null, null, checkoutFlowState, false, false, null, false, false, null, null, null, null, 130943, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(FulfillmentSchedule fulfillmentSchedule, CheckoutState checkoutState) {
        FulfillmentSlotsViewState value;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, new V(fulfillmentSchedule, checkoutState, this.featureManager.e(AbstractC18503f.C18511i.f172882h), this.featureManager.e(AbstractC18503f.q0.f172897h)).b(value)));
        G0(fulfillmentSchedule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r0(CheckoutState it) {
        Intrinsics.j(it, "it");
        return it.i().getIsValid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(CheckoutState checkoutState) {
        FulfillmentSlotsViewState value;
        if (checkoutState.getMultipleFulfillmentPartnersAvailable() && this.featureManager.e(AbstractC18503f.C18513k.f172886h)) {
            List<FulfillmentPartnerDecorator> listA = FulfillmentPartnerDecorator.INSTANCE.a(checkoutState.i().e(), Z(checkoutState.i().e()), this.featureManager.e(AbstractC18503f.j0.f172885h), this.selectedPartner, this.featureManager.e(AbstractC18503f.i0.f172883h));
            InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, false, false, null, null, null, false, false, null, false, false, null, listA, null, null, 114687, null)));
        }
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            b0(shoppingCartE, checkoutState, shoppingCartE.getPartnerEligibility());
        } else {
            y0(false);
        }
    }

    private final void u0(fj.o partner) {
        this.selectedPartner = partner;
    }

    private final void v0(String fulfillmentSlotId) {
        FulfillmentSlotsViewState value;
        FulfillmentSlotsViewState fulfillmentSlotsViewState;
        ArrayList arrayList;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
            fulfillmentSlotsViewState = value;
            List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewState.F().e();
            arrayList = new ArrayList(CollectionsKt.x(listE, 10));
            for (FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator : listE) {
                FulfillmentDay timeSlotDay = fulfillmentSlotDayDecorator.getTimeSlotDay();
                List<FulfillmentSlot> listD = fulfillmentSlotDayDecorator.getTimeSlotDay().d();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listD, 10));
                for (FulfillmentSlot fulfillmentSlot : listD) {
                    arrayList2.add(Intrinsics.e(fulfillmentSlot.getId(), fulfillmentSlotId) ? FulfillmentSlot.d(fulfillmentSlot, null, null, 0, null, null, null, null, false, null, null, null, true, null, 6143, null) : FulfillmentSlot.d(fulfillmentSlot, null, null, 0, null, null, null, null, false, null, null, null, false, null, 6143, null));
                }
                arrayList.add(FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecorator, FulfillmentDay.b(timeSlotDay, null, arrayList2, 1, null), false, 2, null));
            }
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(fulfillmentSlotsViewState, false, null, new Validation(arrayList, null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131067, null)));
    }

    private final void x0(boolean isTimeslotSelected) {
        FulfillmentSlotsViewState value;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, false, false, null, null, null, false, false, null, isTimeslotSelected, false, null, null, null, null, 124919, null)));
        C15809k.d(androidx.view.d0.a(this), null, null, new p(isTimeslotSelected, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean isLoading) {
        FulfillmentSlotsViewState value;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, isLoading, false, null, null, null, false, false, null, false, false, null, null, null, null, 131063, null)));
    }

    public final Mk.b<FulfillmentSlotsViewState, h> a0() {
        return this.flow;
    }

    public pv.P<Boolean> d0() {
        return this._isValid;
    }

    public final void e0(final g action) {
        Object next;
        Object next2;
        FulfillmentSlotsViewState value;
        FulfillmentSlotsViewState fulfillmentSlotsViewState;
        ArrayList arrayList;
        FulfillmentSlotsViewState value2;
        FulfillmentSlotsViewState fulfillmentSlotsViewState2;
        ArrayList arrayList2;
        FulfillmentSlotsViewState value3;
        FulfillmentSlotsViewState value4;
        Intrinsics.j(action, "action");
        if (action instanceof g.SelectTimeSlot) {
            v0(((g.SelectTimeSlot) action).getFulfillmentSlotId());
            return;
        }
        if (action instanceof g.SelectDay) {
            t0(((g.SelectDay) action).getFulfillmentSlotDayDecorator());
            return;
        }
        if (action instanceof g.k) {
            FulfillmentSlotsViewState value5 = this.viewStateStore.getValue();
            ShoppingCart shoppingCartE = value5.getCheckoutState().i().e();
            if (shoppingCartE != null && shoppingCartE.getEarlyDeliveryAvailable()) {
                w0(value5.getIsEarlyDeliveryChecked());
            }
            if (this.featureManager.e(AbstractC18503f.C18513k.f172886h) && Intrinsics.e(value5.getFulfillmentMode(), "delivery") && value5.E().size() > 1) {
                X();
                return;
            } else {
                z0();
                return;
            }
        }
        if (action instanceof g.d) {
            io.reactivex.l<CheckoutState> lVarS = this.checkoutRepository.s();
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q1.f0(this.f103876a, (CheckoutState) obj);
                }
            };
            Dk.a.a(lVarS.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m1
                @Override // Lu.g
                public final void accept(Object obj) {
                    q1.g0(function1, obj);
                }
            }), this.disposables);
            return;
        }
        if (action instanceof g.SetEarlyDeliveryAction) {
            InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
            do {
                value4 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value4, FulfillmentSlotsViewState.m(value4, false, null, null, false, ((g.SetEarlyDeliveryAction) action).getIsEarlyDelivery(), null, null, null, false, false, null, false, false, null, null, null, null, 131055, null)));
            return;
        }
        if (action instanceof g.SetPickupOption) {
            InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B2 = this.viewStateStore;
            do {
                value3 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value3, FulfillmentSlotsViewState.m(value3, false, null, null, false, false, null, null, null, false, false, null, false, false, ((g.SetPickupOption) action).getPickupOption(), null, null, null, 122879, null)));
            return;
        }
        if (action instanceof g.DeliveryFulfillmentPartnerSelected) {
            if (this.featureManager.e(AbstractC18503f.i0.f172883h)) {
                u0(((g.DeliveryFulfillmentPartnerSelected) action).getPartnerEligibility());
            }
            InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B3 = this.viewStateStore;
            do {
                value2 = interfaceC16549B3.getValue();
                fulfillmentSlotsViewState2 = value2;
                List<FulfillmentPartnerDecorator> listE = fulfillmentSlotsViewState2.E();
                arrayList2 = new ArrayList(CollectionsKt.x(listE, 10));
                for (FulfillmentPartnerDecorator fulfillmentPartnerDecorator : listE) {
                    arrayList2.add(FulfillmentPartnerDecorator.b(fulfillmentPartnerDecorator, fulfillmentPartnerDecorator.getFulfillmentPartner() == ((g.DeliveryFulfillmentPartnerSelected) action).getPartnerEligibility(), 0, null, null, null, null, null, null, false, 510, null));
                }
            } while (!interfaceC16549B3.e(value2, FulfillmentSlotsViewState.m(fulfillmentSlotsViewState2, false, null, null, false, false, null, null, null, false, false, null, false, false, null, arrayList2, null, null, 114687, null)));
            io.reactivex.l<CheckoutState> lVarTake = this.checkoutRepository.s().take(1L);
            final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q1.h0(this.f103886a, action, (CheckoutState) obj);
                }
            };
            Dk.a.a(lVarTake.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.o1
                @Override // Lu.g
                public final void accept(Object obj) {
                    q1.i0(function12, obj);
                }
            }), this.disposables);
            return;
        }
        if (action instanceof g.C1466g) {
            Iterator<T> it = this.viewStateStore.getValue().E().iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (!((FulfillmentPartnerDecorator) next2).getIsPartnerSelected()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            FulfillmentPartnerDecorator fulfillmentPartnerDecorator2 = (FulfillmentPartnerDecorator) next2;
            InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B4 = this.viewStateStore;
            do {
                value = interfaceC16549B4.getValue();
                fulfillmentSlotsViewState = value;
                List<FulfillmentPartnerDecorator> listE2 = fulfillmentSlotsViewState.E();
                arrayList = new ArrayList(CollectionsKt.x(listE2, 10));
                for (FulfillmentPartnerDecorator fulfillmentPartnerDecorator3 : listE2) {
                    arrayList.add(FulfillmentPartnerDecorator.b(fulfillmentPartnerDecorator3, fulfillmentPartnerDecorator3.getFulfillmentPartner() == (fulfillmentPartnerDecorator2 != null ? fulfillmentPartnerDecorator2.getFulfillmentPartner() : null), 0, null, null, null, null, null, null, false, 510, null));
                }
            } while (!interfaceC16549B4.e(value, FulfillmentSlotsViewState.m(fulfillmentSlotsViewState, false, null, null, false, false, null, null, null, false, false, null, false, false, null, arrayList, null, null, 114687, null)));
            io.reactivex.l<CheckoutState> lVarTake2 = this.checkoutRepository.s().take(1L);
            final Function1 function13 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q1.j0(this.f103899a, (CheckoutState) obj);
                }
            };
            Dk.a.a(lVarTake2.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.a1
                @Override // Lu.g
                public final void accept(Object obj) {
                    q1.k0(function13, obj);
                }
            }), this.disposables);
            return;
        }
        if (!Intrinsics.e(action, g.e.f103933a)) {
            if (Intrinsics.e(action, g.b.f103930a)) {
                x0(false);
                return;
            } else {
                if (!Intrinsics.e(action, g.c.f103931a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Y();
                return;
            }
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new m(null), 3, null);
        Iterator<T> it2 = this.viewStateStore.getValue().E().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((FulfillmentPartnerDecorator) next).getIsPartnerSelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FulfillmentPartnerDecorator fulfillmentPartnerDecorator4 = (FulfillmentPartnerDecorator) next;
        if (fulfillmentPartnerDecorator4 != null) {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(fulfillmentPartnerDecorator4.getStoreId()));
            ShoppingCart shoppingCartE2 = this.viewStateStore.getValue().getCheckoutState().i().e();
            CustomerAddress deliveryAddress = shoppingCartE2 != null ? shoppingCartE2.getDeliveryAddress() : null;
            Intrinsics.g(deliveryAddress);
            C15809k.d(androidx.view.d0.a(this), null, null, new l(new n.Delivery(numValueOf, deliveryAddress, fulfillmentPartnerDecorator4.getIsAlcoholEligible()), fulfillmentPartnerDecorator4, null), 3, null);
        }
        y0(false);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        io.reactivex.l<CheckoutState> lVarS = this.checkoutRepository.s();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(q1.r0((CheckoutState) obj));
            }
        };
        io.reactivex.l<CheckoutState> lVarTake = lVarS.filter(new Lu.q() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.h1
            @Override // Lu.q
            public final boolean test(Object obj) {
                return q1.o0(function1, obj);
            }
        }).take(1L);
        final n nVar = new n(this);
        Lu.g<? super CheckoutState> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.i1
            @Override // Lu.g
            public final void accept(Object obj) {
                q1.p0(nVar, obj);
            }
        };
        final o oVar = new o(qw.a.INSTANCE);
        Dk.a.a(lVarTake.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.j1
            @Override // Lu.g
            public final void accept(Object obj) {
                q1.q0(oVar, obj);
            }
        }), this.disposables);
    }

    public final void t0(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        FulfillmentSlotsViewState value;
        FulfillmentSlotsViewState fulfillmentSlotsViewState;
        ArrayList arrayList;
        Intrinsics.j(fulfillmentSlotDayDecorator, "fulfillmentSlotDayDecorator");
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this.viewStateStore;
        do {
            value = interfaceC16549B.getValue();
            fulfillmentSlotsViewState = value;
            List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewState.F().e();
            arrayList = new ArrayList(CollectionsKt.x(listE, 10));
            for (FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator2 : listE) {
                arrayList.add(Intrinsics.e(fulfillmentSlotDayDecorator2, fulfillmentSlotDayDecorator) ? FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecorator2, null, true, 1, null) : FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecorator2, null, false, 1, null));
            }
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(fulfillmentSlotsViewState, false, null, new Validation(arrayList, null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131067, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void G0(FulfillmentSchedule fulfillmentSchedule) {
        final String lowerCase;
        Object next;
        final FulfillmentSlot fulfillmentSlot;
        final String lowerCase2;
        LocalTime endTime;
        String str;
        LocalTime startTime;
        String str2;
        List<FulfillmentSlot> listD;
        Object next2;
        Iterator<T> it = fulfillmentSchedule.c().iterator();
        while (true) {
            lowerCase = null;
            if (it.hasNext()) {
                next = it.next();
                if (((FulfillmentDay) next).e()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FulfillmentDay fulfillmentDay = (FulfillmentDay) next;
        if (fulfillmentDay != null && (listD = fulfillmentDay.d()) != null) {
            Iterator<T> it2 = listD.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (((FulfillmentSlot) next2).s()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            fulfillmentSlot = (FulfillmentSlot) next2;
        } else {
            fulfillmentSlot = null;
        }
        if (fulfillmentSlot != null && (startTime = fulfillmentSlot.getStartTime()) != null && (str2 = startTime.format(C17898a.f167225a.r())) != null) {
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            lowerCase2 = str2.toLowerCase(US);
            Intrinsics.i(lowerCase2, "toLowerCase(...)");
        } else {
            lowerCase2 = null;
        }
        if (fulfillmentSlot != null && (endTime = fulfillmentSlot.getEndTime()) != null && (str = endTime.format(C17898a.f167225a.r())) != null) {
            Locale US2 = Locale.US;
            Intrinsics.i(US2, "US");
            lowerCase = str.toLowerCase(US2);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
        }
        this.analyticsEngine.b(C14756c.h("Meijer: Timeslot selection"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q1.H0(fulfillmentSlot, lowerCase2, lowerCase, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(AbstractC17440a<fj.n, CartChanges> challenge, fj.o selectedPartner) {
        C15809k.d(androidx.view.d0.a(this), null, null, new r(challenge, selectedPartner, null), 3, null);
    }

    private final void b0(ShoppingCart cart, CheckoutState checkoutState, String selectedDeliveryPartner) {
        C15809k.d(androidx.view.d0.a(this), null, null, new k(cart, selectedDeliveryPartner, checkoutState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(q1 q1Var, CheckoutState checkoutState) {
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            Intrinsics.g(checkoutState);
            c0(q1Var, shoppingCartE, checkoutState, null, 4, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(q1 q1Var, g gVar, CheckoutState checkoutState) {
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            Intrinsics.g(checkoutState);
            q1Var.b0(shoppingCartE, checkoutState, ((g.DeliveryFulfillmentPartnerSelected) gVar).getPartnerEligibility().getPartnerName());
        } else {
            q1Var.y0(false);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(q1 q1Var, CheckoutState checkoutState) {
        String partnerName;
        Object next;
        fj.o fulfillmentPartner;
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            Intrinsics.g(checkoutState);
            Iterator<T> it = q1Var.viewStateStore.getValue().E().iterator();
            while (true) {
                partnerName = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (((FulfillmentPartnerDecorator) next).getIsPartnerSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            FulfillmentPartnerDecorator fulfillmentPartnerDecorator = (FulfillmentPartnerDecorator) next;
            if (fulfillmentPartnerDecorator != null && (fulfillmentPartner = fulfillmentPartnerDecorator.getFulfillmentPartner()) != null) {
                partnerName = fulfillmentPartner.getPartnerName();
            }
            q1Var.b0(shoppingCartE, checkoutState, partnerName);
        } else {
            q1Var.y0(false);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(CheckoutState checkoutState) {
        Validation<FulfillmentSlot> validationX = checkoutState.x();
        if ((validationX.getResult() instanceof d.c) && validationX.e() != null && this.isSetTimeSlotEvent) {
            boolean z10 = false;
            this.isSetTimeSlotEvent = false;
            if (this.featureManager.e(AbstractC18503f.i0.f172883h)) {
                x0(true);
                return;
            }
            Mk.b<FulfillmentSlotsViewState, h> bVar = this.flow;
            FulfillmentSlot fulfillmentSlotE = validationX.e();
            if (fulfillmentSlotE != null && fulfillmentSlotE.q()) {
                z10 = true;
            }
            bVar.a(new h.TimeSlotSetCanProceedToNextStepInCheckout(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void w0(boolean isEarlyDelivery) {
        E0(isEarlyDelivery);
        this.checkoutRepository.v(isEarlyDelivery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [jj.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            r12 = this;
            r12.B0()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            Mk.b<com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$h> r2 = r12.flow
            pv.P r2 = r2.c()
            java.lang.Object r2 = r2.getValue()
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1 r2 = (com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState) r2
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1 r3 = r2.getPickupOption()
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1$a r4 = com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1.a.f103503a
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.f143742a = r3
            jj.c r3 = r2.getBopasSlot()
            r5 = 0
            if (r3 == 0) goto L3e
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1 r6 = r2.getPickupOption()
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r6, r4)
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r3 = r5
        L3c:
            if (r3 != 0) goto L6b
        L3e:
            Ik.b r3 = r2.F()
            java.lang.Object r3 = r3.e()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r3.next()
            r6 = r4
            Cm.m r6 = (Cm.FulfillmentSlotDayDecorator) r6
            jj.c r6 = r6.H()
            if (r6 == 0) goto L4c
            goto L61
        L60:
            r4 = r5
        L61:
            Cm.m r4 = (Cm.FulfillmentSlotDayDecorator) r4
            if (r4 == 0) goto L6a
            jj.c r3 = r4.H()
            goto L6b
        L6a:
            r3 = r5
        L6b:
            r1.f143742a = r3
            java.lang.String r2 = r2.getFulfillmentMode()
            java.lang.String r3 = "pickup"
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            r3 = 1
            if (r2 == 0) goto L98
            zl.k r2 = r12.featureManager
            zl.f$i r4 = zl.AbstractC18503f.C18511i.f172882h
            boolean r2 = r2.e(r4)
            if (r2 == 0) goto L98
            r12.y0(r3)
            mv.O r6 = androidx.view.d0.a(r12)
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$q r9 = new com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1$q
            r9.<init>(r1, r0, r5)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            mv.C15805i.d(r6, r7, r8, r9, r10, r11)
            return
        L98:
            r12.isSetTimeSlotEvent = r3
            T r1 = r1.f143742a
            jj.c r1 = (jj.FulfillmentSlot) r1
            T r0 = r0.f143742a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r12.I0(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.z0():void");
    }
}
