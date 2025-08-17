package com.meijer.mobile.meijer.activity.checkout.substitutionpreference;

import Dh.CustomerPreference;
import Dh.UpdateConfirmationResponse;
import androidx.view.InterfaceC6015f;
import androidx.view.c0;
import androidx.view.d0;
import ej.SubstitutePreference;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import java.util.List;
import jl.CheckoutState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17153g;
import tv.S;
import uw.a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u00037,1B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R#\u00105\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u0002000/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Ljl/t;", "checkoutRepository", "LBh/e;", "profileRepository", "Lyo/k;", "userManager", "Lgi/a;", "analyticsEngine", "<init>", "(Ljl/t;LBh/e;Lyo/k;Lgi/a;)V", "Lej/D;", "substitutionPreference", "", "G", "(Lej/D;)V", "I", "()V", "", "isLoading", "H", "(Z)V", "Q", "Ljl/v;", "checkoutState", "F", "(Ljl/v;)V", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e;", "action", "E", "(Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e;)V", "onCleared", "a", "Ljl/t;", "b", "LBh/e;", "c", "Lyo/k;", "d", "Lgi/a;", "Ltv/B;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$g;", "e", "Ltv/B;", "viewStateStore", "LLk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f;", "f", "LLk/b;", "D", "()LLk/b;", "flow", "LNu/a;", "g", "LNu/a;", "disposables", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class v extends c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jl.t checkoutRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bh.e profileRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> viewStateStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lk.b<ViewState, f> flow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, v.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((v) this.receiver).F(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
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
    /* synthetic */ class c extends AdaptedFunctionReference implements Function2<ViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        c(Object obj) {
            super(2, obj, Lk.b.class, "update", "update(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ViewState viewState, Continuation<? super Unit> continuation) {
            return v.y((Lk.b) this.f142801a, viewState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$g;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormViewModel$4", f = "SubstitutionPreferenceFormViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super ViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105293a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f105294b;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super ViewState> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f105294b = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f105293a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.e((Throwable) this.f105294b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e$a;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e$a;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e;", "Lej/D;", "substitutionPreference", "<init>", "(Lej/D;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lej/D;", "()Lej/D;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.v$e$a, reason: from toString */
        public static final /* data */ class SelectSubstitutionPreference extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SubstitutePreference substitutionPreference;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectSubstitutionPreference) && Intrinsics.e(this.substitutionPreference, ((SelectSubstitutionPreference) other).substitutionPreference);
            }

            public int hashCode() {
                return this.substitutionPreference.hashCode();
            }

            public String toString() {
                return "SelectSubstitutionPreference(substitutionPreference=" + this.substitutionPreference + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectSubstitutionPreference(SubstitutePreference substitutionPreference) {
                super(null);
                Intrinsics.j(substitutionPreference, "substitutionPreference");
                this.substitutionPreference = substitutionPreference;
            }

            /* renamed from: a, reason: from getter */
            public final SubstitutePreference getSubstitutionPreference() {
                return this.substitutionPreference;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e$b;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f105296a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 998981950;
            }

            public String toString() {
                return "SetSubstitutionPreference";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f$a;", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f105297a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 2054584003;
            }

            public String toString() {
                return "ProceedToCheckoutReviewEvent";
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$g;", "", "", "Lej/D;", "substitutionPreferences", "selectedOption", "", "isLoading", "<init>", "(Ljava/util/List;Lej/D;Z)V", "a", "(Ljava/util/List;Lej/D;Z)Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lej/D;", "c", "()Lej/D;", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.v$g, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SubstitutePreference> substitutionPreferences;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubstitutePreference selectedOption;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public ViewState() {
            this(null, null, false, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.substitutionPreferences, viewState.substitutionPreferences) && Intrinsics.e(this.selectedOption, viewState.selectedOption) && this.isLoading == viewState.isLoading;
        }

        public int hashCode() {
            int iHashCode = this.substitutionPreferences.hashCode() * 31;
            SubstitutePreference substitutePreference = this.selectedOption;
            return ((iHashCode + (substitutePreference == null ? 0 : substitutePreference.hashCode())) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "ViewState(substitutionPreferences=" + this.substitutionPreferences + ", selectedOption=" + this.selectedOption + ", isLoading=" + this.isLoading + ')';
        }

        public ViewState(List<SubstitutePreference> substitutionPreferences, SubstitutePreference substitutePreference, boolean z10) {
            Intrinsics.j(substitutionPreferences, "substitutionPreferences");
            this.substitutionPreferences = substitutionPreferences;
            this.selectedOption = substitutePreference;
            this.isLoading = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, SubstitutePreference substitutePreference, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.substitutionPreferences;
            }
            if ((i10 & 2) != 0) {
                substitutePreference = viewState.selectedOption;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.isLoading;
            }
            return viewState.a(list, substitutePreference, z10);
        }

        public final ViewState a(List<SubstitutePreference> substitutionPreferences, SubstitutePreference selectedOption, boolean isLoading) {
            Intrinsics.j(substitutionPreferences, "substitutionPreferences");
            return new ViewState(substitutionPreferences, selectedOption, isLoading);
        }

        /* renamed from: c, reason: from getter */
        public final SubstitutePreference getSelectedOption() {
            return this.selectedOption;
        }

        public final List<SubstitutePreference> d() {
            return this.substitutionPreferences;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ ViewState(List list, SubstitutePreference substitutePreference, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? SubstitutePreference.INSTANCE.a() : substitutePreference, (i10 & 4) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/C;", "<anonymous>", "(Lqv/O;)LDh/C;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormViewModel$setSubstitutePreference$1", f = "SubstitutionPreferenceFormViewModel.kt", l = {88}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105301a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String name;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105301a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Bh.e eVar = v.this.profileRepository;
            Dh.r rVar = Dh.r.f6569e;
            String preferenceTypeName = rVar.getPreferenceTypeName();
            String owningProgramName = rVar.getOwningProgramName();
            SubstitutePreference selectedOption = v.this.D().c().getValue().getSelectedOption();
            if (selectedOption != null) {
                name = selectedOption.getName();
            } else {
                name = null;
            }
            Intrinsics.g(name);
            CustomerPreference customerPreference = new CustomerPreference(preferenceTypeName, owningProgramName, name);
            this.f105301a = 1;
            Object objS = eVar.s(customerPreference, this);
            if (objS == objF) {
                return objF;
            }
            return objS;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(v vVar, Nu.b bVar) {
        vVar.H(true);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(v vVar) {
        vVar.H(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(jl.t checkoutRepository, Bh.e profileRepository, yo.k userManager, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.checkoutRepository = checkoutRepository;
        this.profileRepository = profileRepository;
        this.userManager = userManager;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, true, 3, null));
        this.viewStateStore = interfaceC17140BA;
        Object[] objArr = 0 == true ? 1 : 0;
        Lk.b<ViewState, f> bVar = new Lk.b<>(new ViewState(null, objArr, false, 7, null));
        this.flow = bVar;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        io.reactivex.l<CheckoutState> lVarS = checkoutRepository.s();
        final a aVar2 = new a(this);
        Pu.g<? super CheckoutState> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.t
            @Override // Pu.g
            public final void accept(Object obj) {
                v.w(aVar2, obj);
            }
        };
        final b bVar2 = new b(uw.a.INSTANCE);
        Ck.a.a(lVarS.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.u
            @Override // Pu.g
            public final void accept(Object obj) {
                v.x(bVar2, obj);
            }
        }), aVar);
        C17154h.J(C17154h.g(C17154h.O(C17154h.c(interfaceC17140BA), new c(bVar)), new d(null)), d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(CheckoutState checkoutState) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this.viewStateStore;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, value.a(checkoutState.h(), checkoutState.w().e(), false)));
        if (Intrinsics.e(checkoutState.w().e(), this.flow.c().getValue().getSelectedOption())) {
            this.flow.a(f.a.f105297a);
        }
    }

    private final void G(SubstitutePreference substitutionPreference) {
        InterfaceC17140B<ViewState> interfaceC17140B = this.viewStateStore;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            SubstitutePreference substitutePreference = substitutionPreference;
            if (interfaceC17140B.e(value, ViewState.b(value, null, substitutePreference, false, 5, null))) {
                return;
            } else {
                substitutionPreference = substitutePreference;
            }
        }
    }

    private final void H(boolean isLoading) {
        InterfaceC17140B<ViewState> interfaceC17140B = this.viewStateStore;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            boolean z10 = isLoading;
            if (interfaceC17140B.e(value, ViewState.b(value, null, null, z10, 3, null))) {
                return;
            } else {
                isLoading = z10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(v vVar, UpdateConfirmationResponse updateConfirmationResponse) {
        uw.a.INSTANCE.a("Successfully updated account grocery substitution preference to match checkout substitution preference", new Object[0]);
        if (vVar.flow.c().getValue().getSelectedOption() != null) {
            yo.k kVar = vVar.userManager;
            SubstitutePreference selectedOption = vVar.flow.c().getValue().getSelectedOption();
            String name = selectedOption != null ? selectedOption.getName() : null;
            Intrinsics.g(name);
            kVar.U(name);
            vVar.checkoutRepository.C(vVar.flow.c().getValue().getSelectedOption());
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Throwable th2) {
        uw.a.INSTANCE.f(th2, "Failed to update grocery substitution preference", new Object[0]);
        return Unit.f142422a;
    }

    private final void Q() {
        this.analyticsEngine.h(C14476c.a("substitution preference form edited"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.R(this.f105283a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(v vVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        SubstitutePreference selectedOption = vVar.flow.c().getValue().getSelectedOption();
        track.h("editSubstitution", selectedOption != null ? selectedOption.getCode() : null);
        return Unit.f142422a;
    }

    public final Lk.b<ViewState, f> D() {
        return this.flow;
    }

    public final void E(e action) {
        Intrinsics.j(action, "action");
        if (action instanceof e.SelectSubstitutionPreference) {
            G(((e.SelectSubstitutionPreference) action).getSubstitutionPreference());
        } else {
            if (!(action instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            I();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final void I() {
        Q();
        io.reactivex.u uVarC = xv.n.c(null, new h(null), 1, null);
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.J(this.f105277a, (Nu.b) obj);
            }
        };
        io.reactivex.u uVarK = uVarC.f(new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.m
            @Override // Pu.g
            public final void accept(Object obj) {
                v.K(function1, obj);
            }
        }).e(new Pu.a() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.n
            @Override // Pu.a
            public final void run() {
                v.L(this.f105279a);
            }
        }).q(C14764a.b()).k(Mu.a.a());
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.M(this.f105280a, (UpdateConfirmationResponse) obj);
            }
        };
        Pu.g gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.p
            @Override // Pu.g
            public final void accept(Object obj) {
                v.N(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.O((Throwable) obj);
            }
        };
        Ck.a.a(uVarK.o(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.r
            @Override // Pu.g
            public final void accept(Object obj) {
                v.P(function13, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object y(Lk.b bVar, ViewState viewState, Continuation continuation) {
        bVar.d(viewState);
        return Unit.f142422a;
    }
}
