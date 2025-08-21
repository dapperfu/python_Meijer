package com.meijer.mobile.meijer.activity.checkout.termsandconditions;

import androidx.view.c0;
import androidx.view.d0;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002\u000f\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f;", "Landroidx/lifecycle/c0;", "Lhi/a;", "analyticsEngine", "<init>", "(Lhi/a;)V", "", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a;", "action", "p", "(Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a;)V", "a", "Lhi/a;", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b;", "b", "Lpv/A;", "_viewEvent", "Lpv/F;", "o", "()Lpv/F;", "viewEvent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<b> _viewEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1547a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1547a f106189a = new C1547a();

            private C1547a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1547a);
            }

            public int hashCode() {
                return 1907800489;
            }

            public String toString() {
                return "EnteredScreenTrackState";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a$b;", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f106190a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -2009164636;
            }

            public String toString() {
                return "TermsAcceptedAction";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b$a;", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f106191a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -829319540;
            }

            public String toString() {
                return "TermsAcceptedProceedToNextStepEvent";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsViewModel$onAction$1", f = "TermsAndConditionsViewModel.kt", l = {42}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106192a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106192a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                f fVar = f.this;
                this.f106192a = 1;
                if (fVar.q(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public f(InterfaceC14523a analyticsEngine) {
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.analyticsEngine = analyticsEngine;
        this._viewEvent = C16555H.b(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEvent.emit(b.a.f106191a, continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    private final void r() {
        this.analyticsEngine.b(C14756c.h("Meijer: Contact Information Terms and Conditions"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.termsandconditions.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.s((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout contact info terms and conditions");
        return Unit.f143329a;
    }

    public final InterfaceC16553F<b> o() {
        return C16563h.b(this._viewEvent);
    }

    public final void p(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.b) {
            C15809k.d(d0.a(this), null, null, new c(null), 3, null);
        } else {
            if (!(action instanceof a.C1547a)) {
                throw new NoWhenBranchMatchedException();
            }
            r();
        }
    }
}
