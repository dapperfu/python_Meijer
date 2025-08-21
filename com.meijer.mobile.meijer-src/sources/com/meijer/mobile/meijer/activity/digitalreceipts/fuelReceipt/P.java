package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import Pj.a;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W;
import hi.InterfaceC14523a;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import zp.TransactionDetails;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\n\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P;", "Landroidx/lifecycle/c0;", "LEp/i;", "submitTransactionDataSource", "Lhi/a;", "analyticsEngine", "<init>", "(LEp/i;Lhi/a;)V", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "fuelReceiptDecorator", "", "w", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;)V", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "T", "formField", "x", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;)V", "", "s", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;)Z", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/W;", "action", "t", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/W;)V", "a", "LEp/i;", "b", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;", "c", "Lpv/B;", "_fuelReceiptViewState", "Lpv/P;", "d", "Lpv/P;", "r", "()Lpv/P;", "fuelReceiptViewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class P extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ep.i submitTransactionDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<FuelReceiptViewState> _fuelReceiptViewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pv.P<FuelReceiptViewState> fuelReceiptViewState;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;", "", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "fuelReceiptDecorator", "LPj/a;", "loadingState", "", "isSubmitButtonEnabled", "showReceiptLoading", "<init>", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;LPj/a;ZZ)V", "a", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;LPj/a;ZZ)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "c", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "b", "LPj/a;", "d", "()LPj/a;", "Z", "f", "()Z", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, reason: from toString */
    public static final /* data */ class FuelReceiptViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FuelReceiptDecorator fuelReceiptDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a loadingState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSubmitButtonEnabled;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showReceiptLoading;

        public FuelReceiptViewState() {
            this(null, null, false, false, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FuelReceiptViewState)) {
                return false;
            }
            FuelReceiptViewState fuelReceiptViewState = (FuelReceiptViewState) other;
            return Intrinsics.e(this.fuelReceiptDecorator, fuelReceiptViewState.fuelReceiptDecorator) && Intrinsics.e(this.loadingState, fuelReceiptViewState.loadingState) && this.isSubmitButtonEnabled == fuelReceiptViewState.isSubmitButtonEnabled && this.showReceiptLoading == fuelReceiptViewState.showReceiptLoading;
        }

        public int hashCode() {
            return (((((this.fuelReceiptDecorator.hashCode() * 31) + this.loadingState.hashCode()) * 31) + Boolean.hashCode(this.isSubmitButtonEnabled)) * 31) + Boolean.hashCode(this.showReceiptLoading);
        }

        public String toString() {
            return "FuelReceiptViewState(fuelReceiptDecorator=" + this.fuelReceiptDecorator + ", loadingState=" + this.loadingState + ", isSubmitButtonEnabled=" + this.isSubmitButtonEnabled + ", showReceiptLoading=" + this.showReceiptLoading + ')';
        }

        public FuelReceiptViewState(FuelReceiptDecorator fuelReceiptDecorator, Pj.a loadingState, boolean z10, boolean z11) {
            Intrinsics.j(fuelReceiptDecorator, "fuelReceiptDecorator");
            Intrinsics.j(loadingState, "loadingState");
            this.fuelReceiptDecorator = fuelReceiptDecorator;
            this.loadingState = loadingState;
            this.isSubmitButtonEnabled = z10;
            this.showReceiptLoading = z11;
        }

        public static /* synthetic */ FuelReceiptViewState b(FuelReceiptViewState fuelReceiptViewState, FuelReceiptDecorator fuelReceiptDecorator, Pj.a aVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fuelReceiptDecorator = fuelReceiptViewState.fuelReceiptDecorator;
            }
            if ((i10 & 2) != 0) {
                aVar = fuelReceiptViewState.loadingState;
            }
            if ((i10 & 4) != 0) {
                z10 = fuelReceiptViewState.isSubmitButtonEnabled;
            }
            if ((i10 & 8) != 0) {
                z11 = fuelReceiptViewState.showReceiptLoading;
            }
            return fuelReceiptViewState.a(fuelReceiptDecorator, aVar, z10, z11);
        }

        public final FuelReceiptViewState a(FuelReceiptDecorator fuelReceiptDecorator, Pj.a loadingState, boolean isSubmitButtonEnabled, boolean showReceiptLoading) {
            Intrinsics.j(fuelReceiptDecorator, "fuelReceiptDecorator");
            Intrinsics.j(loadingState, "loadingState");
            return new FuelReceiptViewState(fuelReceiptDecorator, loadingState, isSubmitButtonEnabled, showReceiptLoading);
        }

        /* renamed from: c, reason: from getter */
        public final FuelReceiptDecorator getFuelReceiptDecorator() {
            return this.fuelReceiptDecorator;
        }

        /* renamed from: d, reason: from getter */
        public final Pj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getShowReceiptLoading() {
            return this.showReceiptLoading;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsSubmitButtonEnabled() {
            return this.isSubmitButtonEnabled;
        }

        public /* synthetic */ FuelReceiptViewState(FuelReceiptDecorator fuelReceiptDecorator, Pj.a aVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new FuelReceiptDecorator(null, null, null, null, null, 31, null) : fuelReceiptDecorator, (i10 & 2) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormViewModel$submitFuelReceipt$1", f = "FuelReceiptFormViewModel.kt", l = {88}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f106541a;

        /* renamed from: b, reason: collision with root package name */
        Object f106542b;

        /* renamed from: c, reason: collision with root package name */
        Object f106543c;

        /* renamed from: d, reason: collision with root package name */
        Object f106544d;

        /* renamed from: e, reason: collision with root package name */
        int f106545e;

        /* renamed from: f, reason: collision with root package name */
        int f106546f;

        /* renamed from: g, reason: collision with root package name */
        int f106547g;

        /* renamed from: h, reason: collision with root package name */
        int f106548h;

        /* renamed from: i, reason: collision with root package name */
        int f106549i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f106550j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ FuelReceiptDecorator f106552l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FuelReceiptDecorator fuelReceiptDecorator, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f106552l = fuelReceiptDecorator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = P.this.new b(this.f106552l, continuation);
            bVar.f106550j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Throwable th2, TrackingData trackingData) {
            trackingData.h("errorMessage", String.valueOf(th2.getMessage()));
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object value3;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106549i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f106550j;
                    InterfaceC16549B interfaceC16549B = P.this._fuelReceiptViewState;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, FuelReceiptViewState.b((FuelReceiptViewState) value3, null, new a.Loading(null, AbstractC6392a.INSTANCE.d(Y.f100927fg, new Object[0]), 1, null), false, true, 5, null)));
                    P p10 = P.this;
                    FuelReceiptDecorator fuelReceiptDecorator = this.f106552l;
                    Result.Companion companion = Result.INSTANCE;
                    Ep.i iVar = p10.submitTransactionDataSource;
                    TransactionDetails iVarA = C12150c.a(fuelReceiptDecorator);
                    this.f106550j = interfaceC15783O;
                    this.f106541a = interfaceC15783O;
                    this.f106542b = this;
                    this.f106543c = this;
                    this.f106544d = interfaceC15783O;
                    this.f106545e = 0;
                    this.f106546f = 0;
                    this.f106547g = 0;
                    this.f106548h = 0;
                    this.f106549i = 1;
                    if (iVar.d(iVarA, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            P p11 = P.this;
            if (Result.h(objB)) {
                p11.analyticsEngine.h(C14756c.h("Fuel Receipt Submission Successful"), new AbstractC14762i[0]);
                InterfaceC16549B interfaceC16549B2 = p11._fuelReceiptViewState;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, FuelReceiptViewState.b((FuelReceiptViewState) value2, null, new a.NotLoading(null, 1, null), false, false, 13, null)));
            }
            P p12 = P.this;
            final Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.d(thE.getMessage(), "Fuel receipt submission failed");
                p12.analyticsEngine.b(C14756c.h("Fuel Receipt Submission Failed"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return P.b.g(thE, (TrackingData) obj2);
                    }
                });
                InterfaceC16549B interfaceC16549B3 = p12._fuelReceiptViewState;
                do {
                    value = interfaceC16549B3.getValue();
                } while (!interfaceC16549B3.e(value, FuelReceiptViewState.b((FuelReceiptViewState) value, null, new a.Failed(null, AbstractC6392a.INSTANCE.d(Y.f100887dg, new Object[0]), 1, null), false, false, 13, null)));
            }
            return Unit.f143329a;
        }
    }

    public P(Ep.i submitTransactionDataSource, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(submitTransactionDataSource, "submitTransactionDataSource");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.submitTransactionDataSource = submitTransactionDataSource;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<FuelReceiptViewState> interfaceC16549BA = pv.S.a(new FuelReceiptViewState(null, null, false, false, 15, null));
        this._fuelReceiptViewState = interfaceC16549BA;
        this.fuelReceiptViewState = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Add Fuel Receipt");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Add Fuel Receipt");
        return Unit.f143329a;
    }

    private final <T extends M<?>> void x(T formField) {
        FuelReceiptViewState value;
        FuelReceiptDecorator fuelReceiptDecoratorL = this._fuelReceiptViewState.getValue().getFuelReceiptDecorator().l(formField);
        InterfaceC16549B<FuelReceiptViewState> interfaceC16549B = this._fuelReceiptViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FuelReceiptViewState.b(value, fuelReceiptDecoratorL, null, s(fuelReceiptDecoratorL), false, 10, null)));
    }

    public final pv.P<FuelReceiptViewState> r() {
        return this.fuelReceiptViewState;
    }

    public final void t(W action) {
        FuelReceiptViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof W.OnFuelFormFieldChange) {
            x(((W.OnFuelFormFieldChange) action).a());
            return;
        }
        if (action instanceof W.SubmitFuelReceipt) {
            this.analyticsEngine.b(C14756c.a("Submit Fuel Receipt"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.N
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.u((TrackingData) obj);
                }
            });
            w(((W.SubmitFuelReceipt) action).getFuelReceiptDecorator());
        } else {
            if (!Intrinsics.e(action, W.a.f106564a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.b(C14756c.a("Review Info"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.O
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.v((TrackingData) obj);
                }
            });
            InterfaceC16549B<FuelReceiptViewState> interfaceC16549B = this._fuelReceiptViewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, FuelReceiptViewState.b(value, null, null, false, false, 7, null)));
        }
    }

    private final boolean s(FuelReceiptDecorator fuelReceiptDecorator) {
        if (fuelReceiptDecorator.getDate().f().isValid() && fuelReceiptDecorator.getTxNumber().f().isValid() && fuelReceiptDecorator.getTmNumber().f().isValid() && fuelReceiptDecorator.getStNumber().f().isValid() && fuelReceiptDecorator.getTime().f().isValid()) {
            return true;
        }
        return false;
    }

    private final void w(FuelReceiptDecorator fuelReceiptDecorator) {
        C15809k.d(d0.a(this), null, null, new b(fuelReceiptDecorator, null), 3, null);
    }
}
