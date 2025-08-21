package com.meijer.mobile.meijer.activity.checkout.payment;

import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\r\u0012B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/c;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onCleared", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b;", "a", "Lpv/A;", "_viewEvent", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/c$a;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "o", "()Lpv/P;", "viewState", "LJu/a;", "d", "LJu/a;", "disposables", "Lpv/F;", "n", "()Lpv/F;", "viewEvent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12019c extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<b> _viewEvent = C16555H.b(0, 0, null, 7, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<CheckoutPaymentHostViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pv.P<CheckoutPaymentHostViewState> viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/c$a;", "", "", "isLoading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.c$a, reason: from toString */
    public static final /* data */ class CheckoutPaymentHostViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public CheckoutPaymentHostViewState() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckoutPaymentHostViewState) && this.isLoading == ((CheckoutPaymentHostViewState) other).isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "CheckoutPaymentHostViewState(isLoading=" + this.isLoading + ')';
        }

        public CheckoutPaymentHostViewState(boolean z10) {
            this.isLoading = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ CheckoutPaymentHostViewState(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.c$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b;", "", "isPaymentOptionsAvailable", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.c$b$a, reason: from toString */
        public static final /* data */ class LaunchPaymentScreen extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPaymentOptionsAvailable;

            public LaunchPaymentScreen() {
                this(false, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LaunchPaymentScreen) && this.isPaymentOptionsAvailable == ((LaunchPaymentScreen) other).isPaymentOptionsAvailable;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isPaymentOptionsAvailable);
            }

            public String toString() {
                return "LaunchPaymentScreen(isPaymentOptionsAvailable=" + this.isPaymentOptionsAvailable + ')';
            }

            public LaunchPaymentScreen(boolean z10) {
                super(null);
                this.isPaymentOptionsAvailable = z10;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsPaymentOptionsAvailable() {
                return this.isPaymentOptionsAvailable;
            }

            public /* synthetic */ LaunchPaymentScreen(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? true : z10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostViewModel$onCreate$1", f = "CheckoutPaymentHostViewModel.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.c$c, reason: collision with other inner class name */
    static final class C1504c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104730a;

        C1504c(Continuation<? super C1504c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12019c.this.new C1504c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1504c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f104730a;
            int i11 = 1;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12019c.this._viewEvent;
                b.LaunchPaymentScreen launchPaymentScreen = new b.LaunchPaymentScreen(false, i11, null);
                this.f104730a = 1;
                if (interfaceC16548A.emit(launchPaymentScreen, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public final InterfaceC16553F<b> n() {
        return C16563h.b(this._viewEvent);
    }

    public final pv.P<CheckoutPaymentHostViewState> o() {
        return this.viewState;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        C15809k.d(androidx.view.d0.a(this), null, null, new C1504c(null), 3, null);
    }

    public C12019c() {
        InterfaceC16549B<CheckoutPaymentHostViewState> interfaceC16549BA = pv.S.a(new CheckoutPaymentHostViewState(false, 1, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this.disposables = new Ju.a();
    }
}
