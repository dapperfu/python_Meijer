package com.meijer.mobile.meijer.activity.checkout.payment.ebt;

import Fm.EbtBalance;
import Tq.PointOfService;
import androidx.view.c0;
import ci.CustomerAddress;
import ci.InterfaceC6393a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkDeliveryAddress;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtAcculynkResponse;
import ej.DeliveryMode;
import jl.CheckoutFlowState;
import jl.CheckoutState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.P;
import uw.a;
import vj.C17588a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003KLMB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b'\u0010\u0019J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0014¢\u0006\u0004\b*\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R#\u0010@\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;098\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020:0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "Landroidx/lifecycle/c0;", "Ljl/d;", "checkoutFlowRepository", "Ljl/t;", "checkoutRepository", "Lyo/k;", "userManager", "Lhl/m;", "cartRepository", "<init>", "(Ljl/d;Ljl/t;Lyo/k;Lhl/m;)V", "Ljl/v;", "checkoutState", "", "O", "(Ljl/v;)V", "Ljl/f;", "checkoutFlowState", "M", "(Ljl/f;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "K", "(Ljava/lang/String;)V", "acculynkPostBody", "Q", "", "isLoading", "S", "(Z)V", "timerData", "V", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g;", "action", "J", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g;)V", "results", "I", "U", "()V", "onCleared", "a", "Ljl/d;", "getCheckoutFlowRepository", "()Ljl/d;", "b", "Ljl/t;", "getCheckoutRepository", "()Ljl/t;", "c", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "Lvj/a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$i;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "d", "Lvj/a;", "G", "()Lvj/a;", "stateModelStore", "Ltv/P;", "e", "Ltv/P;", "H", "()Ltv/P;", "uiState", "LNu/a;", "f", "LNu/a;", "disposables", "i", "h", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class r extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jl.d checkoutFlowRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jl.t checkoutRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17588a<ViewState, h> stateModelStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> uiState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {
        a(Object obj) {
            super(1, obj, r.class, "onGetCartId", "onGetCartId(Ljava/lang/String;)V", 0);
        }

        public final void a(String str) {
            ((r) this.receiver).K(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        c(Object obj) {
            super(1, obj, r.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((r) this.receiver).M(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState fVar) {
            a(fVar);
            return Unit.f142422a;
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        e(Object obj) {
            super(1, obj, r.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((r) this.receiver).O(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        f(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103922a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1696499795;
            }

            public String toString() {
                return "CloseLoadingIndicator";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$g;", "", "acculynkPostBody", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.r$g$b, reason: from toString */
        public static final /* data */ class SetAcculynkPostBody extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String acculynkPostBody;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetAcculynkPostBody) && Intrinsics.e(this.acculynkPostBody, ((SetAcculynkPostBody) other).acculynkPostBody);
            }

            public int hashCode() {
                return this.acculynkPostBody.hashCode();
            }

            public String toString() {
                return "SetAcculynkPostBody(acculynkPostBody=" + this.acculynkPostBody + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetAcculynkPostBody(String acculynkPostBody) {
                super(null);
                Intrinsics.j(acculynkPostBody, "acculynkPostBody");
                this.acculynkPostBody = acculynkPostBody;
            }

            /* renamed from: a, reason: from getter */
            public final String getAcculynkPostBody() {
                return this.acculynkPostBody;
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "", "<init>", "()V", "c", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class h {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103924a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1530779704;
            }

            public String toString() {
                return "CancelResults";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "LFm/a;", "ebtBalance", "<init>", "(LFm/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFm/a;", "()LFm/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.r$h$b, reason: from toString */
        public static final /* data */ class HandlePinPadSuccess extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final EbtBalance ebtBalance;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandlePinPadSuccess) && Intrinsics.e(this.ebtBalance, ((HandlePinPadSuccess) other).ebtBalance);
            }

            public int hashCode() {
                return this.ebtBalance.hashCode();
            }

            public String toString() {
                return "HandlePinPadSuccess(ebtBalance=" + this.ebtBalance + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandlePinPadSuccess(EbtBalance ebtBalance) {
                super(null);
                Intrinsics.j(ebtBalance, "ebtBalance");
                this.ebtBalance = ebtBalance;
            }

            /* renamed from: a, reason: from getter */
            public final EbtBalance getEbtBalance() {
                return this.ebtBalance;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "", "errorCode", "errorMessage", "ebtBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.r$h$c, reason: from toString */
        public static final /* data */ class ShowErrorState extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorMessage;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ebtBalance;

            public ShowErrorState(String str, String str2, String str3) {
                super(null);
                this.errorCode = str;
                this.errorMessage = str2;
                this.ebtBalance = str3;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowErrorState)) {
                    return false;
                }
                ShowErrorState showErrorState = (ShowErrorState) other;
                return Intrinsics.e(this.errorCode, showErrorState.errorCode) && Intrinsics.e(this.errorMessage, showErrorState.errorMessage) && Intrinsics.e(this.ebtBalance, showErrorState.ebtBalance);
            }

            public int hashCode() {
                String str = this.errorCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorMessage;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.ebtBalance;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "ShowErrorState(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", ebtBalance=" + this.ebtBalance + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEbtBalance() {
                return this.ebtBalance;
            }

            /* renamed from: b, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* renamed from: c, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012Jr\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b\"\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b&\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b*\u0010\u0016¨\u00062"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$i;", "", "Ljl/f;", "checkoutFlowState", "", "cartId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "deliveryAddress", "acculynkPostBody", "LFm/a;", "ebtBalance", "", "isWebPageLoading", "ebtTimerData", "<init>", "(Ljl/f;Ljava/lang/String;Ljava/lang/Integer;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;Ljava/lang/String;LFm/a;ZLjava/lang/String;)V", "a", "(Ljl/f;Ljava/lang/String;Ljava/lang/Integer;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;Ljava/lang/String;LFm/a;ZLjava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$i;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljl/f;", "getCheckoutFlowState", "()Ljl/f;", "b", "Ljava/lang/String;", "getCartId", "c", "Ljava/lang/Integer;", "getStoreId", "()Ljava/lang/Integer;", "d", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "getDeliveryAddress", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "e", "f", "LFm/a;", "()LFm/a;", "g", "Z", "()Z", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.r$i, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckoutFlowState checkoutFlowState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer storeId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AcculynkDeliveryAddress deliveryAddress;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acculynkPostBody;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final EbtBalance ebtBalance;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isWebPageLoading;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtTimerData;

        public ViewState() {
            this(null, null, null, null, null, null, false, null, l3.f92484c, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.checkoutFlowState, viewState.checkoutFlowState) && Intrinsics.e(this.cartId, viewState.cartId) && Intrinsics.e(this.storeId, viewState.storeId) && Intrinsics.e(this.deliveryAddress, viewState.deliveryAddress) && Intrinsics.e(this.acculynkPostBody, viewState.acculynkPostBody) && Intrinsics.e(this.ebtBalance, viewState.ebtBalance) && this.isWebPageLoading == viewState.isWebPageLoading && Intrinsics.e(this.ebtTimerData, viewState.ebtTimerData);
        }

        public int hashCode() {
            int iHashCode = this.checkoutFlowState.hashCode() * 31;
            String str = this.cartId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.storeId;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            AcculynkDeliveryAddress acculynkDeliveryAddress = this.deliveryAddress;
            int iHashCode4 = (iHashCode3 + (acculynkDeliveryAddress == null ? 0 : acculynkDeliveryAddress.hashCode())) * 31;
            String str2 = this.acculynkPostBody;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EbtBalance ebtBalance = this.ebtBalance;
            int iHashCode6 = (((iHashCode5 + (ebtBalance == null ? 0 : ebtBalance.hashCode())) * 31) + Boolean.hashCode(this.isWebPageLoading)) * 31;
            String str3 = this.ebtTimerData;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(checkoutFlowState=" + this.checkoutFlowState + ", cartId=" + this.cartId + ", storeId=" + this.storeId + ", deliveryAddress=" + this.deliveryAddress + ", acculynkPostBody=" + this.acculynkPostBody + ", ebtBalance=" + this.ebtBalance + ", isWebPageLoading=" + this.isWebPageLoading + ", ebtTimerData=" + this.ebtTimerData + ')';
        }

        public ViewState(CheckoutFlowState checkoutFlowState, String str, Integer num, AcculynkDeliveryAddress acculynkDeliveryAddress, String str2, EbtBalance ebtBalance, boolean z10, String str3) {
            Intrinsics.j(checkoutFlowState, "checkoutFlowState");
            this.checkoutFlowState = checkoutFlowState;
            this.cartId = str;
            this.storeId = num;
            this.deliveryAddress = acculynkDeliveryAddress;
            this.acculynkPostBody = str2;
            this.ebtBalance = ebtBalance;
            this.isWebPageLoading = z10;
            this.ebtTimerData = str3;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, CheckoutFlowState fVar, String str, Integer num, AcculynkDeliveryAddress acculynkDeliveryAddress, String str2, EbtBalance ebtBalance, boolean z10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fVar = viewState.checkoutFlowState;
            }
            if ((i10 & 2) != 0) {
                str = viewState.cartId;
            }
            if ((i10 & 4) != 0) {
                num = viewState.storeId;
            }
            if ((i10 & 8) != 0) {
                acculynkDeliveryAddress = viewState.deliveryAddress;
            }
            if ((i10 & 16) != 0) {
                str2 = viewState.acculynkPostBody;
            }
            if ((i10 & 32) != 0) {
                ebtBalance = viewState.ebtBalance;
            }
            if ((i10 & 64) != 0) {
                z10 = viewState.isWebPageLoading;
            }
            if ((i10 & 128) != 0) {
                str3 = viewState.ebtTimerData;
            }
            boolean z11 = z10;
            String str4 = str3;
            String str5 = str2;
            EbtBalance ebtBalance2 = ebtBalance;
            return viewState.a(fVar, str, num, acculynkDeliveryAddress, str5, ebtBalance2, z11, str4);
        }

        public final ViewState a(CheckoutFlowState checkoutFlowState, String cartId, Integer storeId, AcculynkDeliveryAddress deliveryAddress, String acculynkPostBody, EbtBalance ebtBalance, boolean isWebPageLoading, String ebtTimerData) {
            Intrinsics.j(checkoutFlowState, "checkoutFlowState");
            return new ViewState(checkoutFlowState, cartId, storeId, deliveryAddress, acculynkPostBody, ebtBalance, isWebPageLoading, ebtTimerData);
        }

        /* renamed from: c, reason: from getter */
        public final String getAcculynkPostBody() {
            return this.acculynkPostBody;
        }

        /* renamed from: d, reason: from getter */
        public final EbtBalance getEbtBalance() {
            return this.ebtBalance;
        }

        /* renamed from: e, reason: from getter */
        public final String getEbtTimerData() {
            return this.ebtTimerData;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsWebPageLoading() {
            return this.isWebPageLoading;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ViewState(CheckoutFlowState fVar, String str, Integer num, AcculynkDeliveryAddress acculynkDeliveryAddress, String str2, EbtBalance ebtBalance, boolean z10, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            String str4;
            String str5;
            boolean z11;
            Integer num2;
            EbtBalance ebtBalance2;
            CheckoutFlowState fVar2;
            AcculynkDeliveryAddress acculynkDeliveryAddress2;
            fVar = (i10 & 1) != 0 ? new CheckoutFlowState(0, null, 3, 0 == true ? 1 : 0) : fVar;
            str = (i10 & 2) != 0 ? null : str;
            num = (i10 & 4) != 0 ? null : num;
            acculynkDeliveryAddress = (i10 & 8) != 0 ? null : acculynkDeliveryAddress;
            str2 = (i10 & 16) != 0 ? null : str2;
            ebtBalance = (i10 & 32) != 0 ? null : ebtBalance;
            boolean z12 = (i10 & 64) != 0 ? true : z10;
            if ((i10 & 128) != 0) {
                str4 = null;
                str5 = str2;
                ebtBalance2 = ebtBalance;
                z11 = z12;
                num2 = num;
                acculynkDeliveryAddress2 = acculynkDeliveryAddress;
                fVar2 = fVar;
            } else {
                str4 = str3;
                str5 = str2;
                z11 = z12;
                num2 = num;
                ebtBalance2 = ebtBalance;
                fVar2 = fVar;
                acculynkDeliveryAddress2 = acculynkDeliveryAddress;
            }
            this(fVar2, str, num2, acculynkDeliveryAddress2, str5, ebtBalance2, z11, str4);
        }
    }

    public r(jl.d checkoutFlowRepository, jl.t checkoutRepository, yo.k userManager, hl.m cartRepository) {
        Intrinsics.j(checkoutFlowRepository, "checkoutFlowRepository");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartRepository, "cartRepository");
        this.checkoutFlowRepository = checkoutFlowRepository;
        this.checkoutRepository = checkoutRepository;
        this.userManager = userManager;
        C17588a<ViewState, h> c17588a = new C17588a<>(new ViewState(null, null, null, null, null, null, false, null, l3.f92484c, null));
        this.stateModelStore = c17588a;
        this.uiState = c17588a.b();
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        io.reactivex.l<String> lVarN = cartRepository.N();
        final a aVar2 = new a(this);
        Pu.g<? super String> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.k
            @Override // Pu.g
            public final void accept(Object obj) {
                r.y(aVar2, obj);
            }
        };
        a.Companion companion = uw.a.INSTANCE;
        final b bVar = new b(companion);
        Ck.a.a(lVarN.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.l
            @Override // Pu.g
            public final void accept(Object obj) {
                r.A(bVar, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final c cVar = new c(this);
        Pu.g<? super CheckoutFlowState> gVar2 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.m
            @Override // Pu.g
            public final void accept(Object obj) {
                r.B(cVar, obj);
            }
        };
        final d dVar = new d(companion);
        Ck.a.a(lVarG.subscribe(gVar2, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.n
            @Override // Pu.g
            public final void accept(Object obj) {
                r.C(dVar, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutState> lVarTake = checkoutRepository.s().take(1L);
        final e eVar = new e(this);
        Pu.g<? super CheckoutState> gVar3 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.o
            @Override // Pu.g
            public final void accept(Object obj) {
                eVar.invoke(obj);
            }
        };
        final f fVar = new f(companion);
        Ck.a.a(lVarTake.subscribe(gVar3, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.p
            @Override // Pu.g
            public final void accept(Object obj) {
                fVar.invoke(obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(final String cartId) {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.L(cartId, (r.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState L(String str, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, str, null, null, null, null, false, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(final CheckoutFlowState checkoutFlowState) {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.N(checkoutFlowState, (r.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState N(CheckoutFlowState fVar, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, fVar, null, null, null, null, null, false, null, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState P(InterfaceC6393a interfaceC6393a, CheckoutState checkoutState, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        AcculynkDeliveryAddress acculynkDeliveryAddressB = interfaceC6393a != null ? Gm.b.b(interfaceC6393a) : null;
        PointOfService pointOfServiceE = checkoutState.v().e();
        return ViewState.b(oldState, null, null, pointOfServiceE != null ? Integer.valueOf(pointOfServiceE.getStoreId()) : null, acculynkDeliveryAddressB, null, null, false, null, 243, null);
    }

    private final void Q(final String acculynkPostBody) {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.R(acculynkPostBody, (r.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState R(String str, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, null, null, null, str, null, false, null, 239, null);
    }

    private final void S(final boolean isLoading) {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.T(isLoading, (r.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState T(boolean z10, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, null, null, null, null, null, z10, null, 191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState W(String str, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, null, null, null, null, null, false, str, l3.f92485d, null);
    }

    public final C17588a<ViewState, h> G() {
        return this.stateModelStore;
    }

    public final P<ViewState> H() {
        return this.uiState;
    }

    public final void I(String results) {
        if (results != null) {
            EbtAcculynkResponse ebtAcculynkResponseJ = Gm.e.f11650a.j(results);
            if (ebtAcculynkResponseJ == null) {
                this.stateModelStore.c(h.a.f103924a);
                return;
            }
            if (Intrinsics.e(String.valueOf(ebtAcculynkResponseJ.getErrorMessage()), "SUCCESS")) {
                this.stateModelStore.c(new h.HandlePinPadSuccess(Gm.b.a(ebtAcculynkResponseJ)));
            } else {
                if (Intrinsics.e(String.valueOf(ebtAcculynkResponseJ.getErrorMessage()), "PinPad Cancelled")) {
                    this.stateModelStore.c(h.a.f103924a);
                    return;
                }
                String strA = Gm.c.f11649a.a(Gm.b.a(ebtAcculynkResponseJ).getRemainingBalanceSnap());
                if (!Intrinsics.e(ebtAcculynkResponseJ.getResponseCode(), Gm.a.f11638i.getValue())) {
                    strA = null;
                }
                this.stateModelStore.c(new h.ShowErrorState(ebtAcculynkResponseJ.getResponseCode(), ebtAcculynkResponseJ.getErrorMessage(), strA));
            }
        }
    }

    public final void J(g action) {
        Intrinsics.j(action, "action");
        if (action instanceof g.a) {
            S(false);
        } else {
            if (!(action instanceof g.SetAcculynkPostBody)) {
                throw new NoWhenBranchMatchedException();
            }
            Q(((g.SetAcculynkPostBody) action).getAcculynkPostBody());
        }
    }

    public final void U() {
        this.stateModelStore.c(h.a.f103924a);
    }

    public final void V(final String timerData) {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.W(timerData, (r.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(final CheckoutState checkoutState) {
        final CustomerAddress address;
        DeliveryMode deliveryModeE = checkoutState.m().e();
        if (deliveryModeE != null && deliveryModeE.c()) {
            address = checkoutState.k().e();
        } else {
            PointOfService pointOfServiceE = checkoutState.v().e();
            if (pointOfServiceE != null) {
                address = pointOfServiceE.getAddress();
            } else {
                address = null;
            }
        }
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.P(address, checkoutState, (r.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
