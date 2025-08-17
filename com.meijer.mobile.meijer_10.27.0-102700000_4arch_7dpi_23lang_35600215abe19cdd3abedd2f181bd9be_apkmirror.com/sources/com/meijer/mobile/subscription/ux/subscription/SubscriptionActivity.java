package com.meijer.mobile.subscription.ux.subscription;

import Co.ProductFullDetails;
import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.meijer.mobile.subscription.ux.subscription.B;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity;
import com.meijer.mobile.subscription.ux.subscription.j;
import cr.SubscriptionDetails;
import e.C13588d;
import e.C13589e;
import j0.InterfaceC14812d;
import kotlin.AbstractC14653B;
import kotlin.C14656E;
import kotlin.C14675s;
import kotlin.C14677u;
import kotlin.C14680x;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.EnumC17895N0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15307d;
import li.C15417h;
import mr.C15689a;
import mr.DeliveryAddressesViewState;
import mr.TimeSlotsViewState;
import ni.N1;
import or.C16145c;
import p1.C16193g;
import pr.AbstractC16364a;
import pr.C16367d;
import pr.EnumC16365b;
import pr.SubscriptionSummaryDecorator;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006-²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/SubscriptionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LCl/e;", "v", "LCl/e;", "s1", "()LCl/e;", "setMeijerIntent$ux_release", "(LCl/e;)V", "meijerIntent", "Lcom/meijer/mobile/subscription/ux/subscription/D;", "w", "Lkotlin/Lazy;", "u1", "()Lcom/meijer/mobile/subscription/ux/subscription/D;", "subscriptionVM", "Lmr/a;", "x", "r1", "()Lmr/a;", "checkoutSubscriptionVM", "Lpr/d;", "y", "t1", "()Lpr/d;", "subscriptionSummaryVM", "Lqv/O;", "z", "Lqv/O;", "coroutineScope", "A", "a", "Lcom/meijer/mobile/subscription/ux/subscription/H;", "viewState", "Lmr/n;", "deliveryAddressesViewState", "Lmr/P;", "timeSlotsViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SubscriptionActivity extends Hilt_SubscriptionActivity {

    /* renamed from: B, reason: collision with root package name */
    public static final int f118951B = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionVM = new e0(Reflection.b(D.class), new d(this), new c(this), new e(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy checkoutSubscriptionVM = new e0(Reflection.b(C15689a.class), new g(this), new f(this), new h(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionSummaryVM = new e0(Reflection.b(C16367d.class), new j(this), new i(this), new k(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16622O coroutineScope;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f118958b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.f f118959c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$1$1", f = "SubscriptionActivity.kt", l = {123}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118960a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionActivity f118961b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C14677u f118962c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/B;", "screen", "", "<anonymous>", "(Lcom/meijer/mobile/subscription/ux/subscription/B;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$1$1$1", f = "SubscriptionActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$b$a$a, reason: collision with other inner class name */
            static final class C1929a extends SuspendLambda implements Function2<B, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118963a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f118964b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SubscriptionActivity f118965c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C14677u f118966d;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(B b10, C14680x c14680x) {
                    c14680x.f(true);
                    c14680x.d(b10.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SubscriptionActivity.b.a.C1929a.o((C14656E) obj);
                        }
                    });
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(C14656E c14656e) {
                    c14656e.c(false);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1929a c1929a = new C1929a(this.f118965c, this.f118966d, continuation);
                    c1929a.f118964b = obj;
                    return c1929a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(B b10, Continuation<? super Unit> continuation) {
                    return ((C1929a) create(b10, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1929a(SubscriptionActivity subscriptionActivity, C14677u c14677u, Continuation<? super C1929a> continuation) {
                    super(2, continuation);
                    this.f118965c = subscriptionActivity;
                    this.f118966d = c14677u;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f118963a == 0) {
                        ResultKt.b(obj);
                        final B b10 = (B) this.f118964b;
                        if (b10 instanceof B.d) {
                            this.f118965c.finish();
                        } else {
                            this.f118966d.S(b10.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SubscriptionActivity.b.a.C1929a.l(b10, (C14680x) obj2);
                                }
                            });
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f118961b, this.f118962c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SubscriptionActivity subscriptionActivity, C14677u c14677u, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118961b = subscriptionActivity;
                this.f118962c = c14677u;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118960a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<B> interfaceC17144FS = this.f118961b.u1().s();
                    C1929a c1929a = new C1929a(this.f118961b, this.f118962c, null);
                    this.f118960a = 1;
                    if (C17154h.k(interfaceC17144FS, c1929a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$2$1", f = "SubscriptionActivity.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$b$b, reason: collision with other inner class name */
        static final class C1930b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118967a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f118968b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SubscriptionActivity f118969c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<SubscriptionViewState> f118970d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1930b(this.f118968b, this.f118969c, this.f118970d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1930b(C17893M0 c17893m0, SubscriptionActivity subscriptionActivity, z1<SubscriptionViewState> z1Var, Continuation<? super C1930b> continuation) {
                super(2, continuation);
                this.f118968b = c17893m0;
                this.f118969c = subscriptionActivity;
                this.f118970d = z1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1930b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118967a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    if (b.f(this.f118970d).getDisplayHowItWorks()) {
                        C17893M0 c17893m0 = this.f118968b;
                        this.f118967a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
                SubscriptionActivity subscriptionActivity = this.f118969c;
                subscriptionActivity.startActivity(subscriptionActivity.s1().u());
                this.f118969c.u1().y();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C14677u f118971a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionActivity f118972b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17893M0 f118973c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<C0> f118974d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ SubscriptionNavConfig f118975e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<C0> f118976f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118977a;

                a(LocalThemeScope localThemeScope) {
                    this.f118977a = localThemeScope;
                }

                public final void a(InterfaceC14812d AcresBottomSheet, Composer composer, int i10) {
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1508153338, i10, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubscriptionActivity.kt:161)");
                    }
                    C16145c.c(this.f118977a, null, composer, LocalThemeScope.f15770g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
                    a(interfaceC14812d, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$b$c$b, reason: collision with other inner class name */
            static final class C1931b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C14677u f118978a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118979b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SubscriptionNavConfig f118980c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ SubscriptionActivity f118981d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f118982e;

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-404071959, i10, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubscriptionActivity.kt:164)");
                    }
                    C14677u c14677u = this.f118978a;
                    composer.startReplaceGroup(-1224400529);
                    boolean zD = composer.D(this.f118979b) | composer.D(this.f118980c) | composer.D(this.f118981d) | composer.V(this.f118982e);
                    final LocalThemeScope localThemeScope = this.f118979b;
                    final SubscriptionNavConfig subscriptionNavConfig = this.f118980c;
                    final SubscriptionActivity subscriptionActivity = this.f118981d;
                    final Function0<C0> function0 = this.f118982e;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SubscriptionActivity.b.c.C1931b.d(localThemeScope, subscriptionNavConfig, subscriptionActivity, function0, (C14675s) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    j4.k.b(c14677u, "SubscriptionRoute", null, null, null, null, null, null, null, (Function1) objB, composer, 48, 508);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1931b(C14677u c14677u, LocalThemeScope localThemeScope, SubscriptionNavConfig subscriptionNavConfig, SubscriptionActivity subscriptionActivity, Function0<? extends C0> function0) {
                    this.f118978a = c14677u;
                    this.f118979b = localThemeScope;
                    this.f118980c = subscriptionNavConfig;
                    this.f118981d = subscriptionActivity;
                    this.f118982e = function0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(LocalThemeScope localThemeScope, SubscriptionNavConfig subscriptionNavConfig, SubscriptionActivity subscriptionActivity, final Function0 function0, C14675s NavHost) {
                    Intrinsics.j(NavHost, "$this$NavHost");
                    A.a(NavHost, localThemeScope, subscriptionNavConfig, subscriptionActivity.u1(), subscriptionActivity.r1(), new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.C1931b.e(function0);
                        }
                    });
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function0 function0) {
                    function0.invoke();
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            c(C14677u c14677u, SubscriptionActivity subscriptionActivity, C17893M0 c17893m0, Function0<? extends C0> function0, SubscriptionNavConfig subscriptionNavConfig, Function0<? extends C0> function02) {
                this.f118971a = c14677u;
                this.f118972b = subscriptionActivity;
                this.f118973c = c17893m0;
                this.f118974d = function0;
                this.f118975e = subscriptionNavConfig;
                this.f118976f = function02;
            }

            public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-709450775, i11, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous>.<anonymous> (SubscriptionActivity.kt:149)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f118971a) | composer.D(this.f118972b);
                final C14677u c14677u = this.f118971a;
                final SubscriptionActivity subscriptionActivity = this.f118972b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.f(c14677u, subscriptionActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13588d.a(false, (Function0) objB, composer, 0, 1);
                C17893M0 c17893m0 = this.f118973c;
                String strC = C16193g.c(C15307d.f147849P, composer, 0);
                String strC2 = C16193g.c(C15307d.f147852S, composer, 0);
                String strC3 = C16193g.c(C15307d.f147846M, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f118974d);
                final Function0<C0> function0 = this.f118974d;
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.g(function0);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118972b);
                final SubscriptionActivity subscriptionActivity2 = this.f118972b;
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.k(subscriptionActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function03 = (Function0) objB3;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f118974d);
                final Function0<C0> function04 = this.f118974d;
                Object objB4 = composer.B();
                if (zV2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.l(function04);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C15417h.j(AdsTheme, null, c17893m0, strC, null, strC2, strC3, function02, function03, null, (Function0) objB4, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(-1508153338, true, new a(AdsTheme), composer, 54), false, ComposableLambdaKt.c(-404071959, true, new C1931b(this.f118971a, AdsTheme, this.f118975e, this.f118972b, this.f118976f), composer, 54), composer, LocalThemeScope.f15770g | (i11 & 14) | (C17893M0.f167209e << 6), 12779520, 48393);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(C14677u c14677u, SubscriptionActivity subscriptionActivity) {
                if (!c14677u.V()) {
                    subscriptionActivity.finish();
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(SubscriptionActivity subscriptionActivity) {
                subscriptionActivity.u1().v(j.C1933j.f119051a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$closeIspSheet$1$1$1", f = "SubscriptionActivity.kt", l = {104}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118983a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f118984b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f118984b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17893M0 c17893m0, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f118984b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118983a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f118984b;
                    this.f118983a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$openIspSheet$1$1$1", f = "SubscriptionActivity.kt", l = {101}, m = "invokeSuspend")
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118985a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f118986b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f118986b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C17893M0 c17893m0, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f118986b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118985a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f118986b;
                    this.f118985a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        b(ProductFullDetails productFullDetails, mk.f fVar) {
            this.f118958b = productFullDetails;
            this.f118959c = fVar;
        }

        public final void e(Composer composer, int i10) {
            EnumC16365b enumC16365b;
            N1 n12;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1789219494, i10, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous> (SubscriptionActivity.kt:76)");
            }
            SubscriptionActivity subscriptionActivity = SubscriptionActivity.this;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            subscriptionActivity.coroutineScope = (InterfaceC16622O) objB;
            C14677u c14677uE = j4.j.e(new AbstractC14653B[0], composer, 0);
            z1 z1VarC = S2.a.c(SubscriptionActivity.this.u1().t(), null, null, null, composer, 0, 7);
            z1 z1VarC2 = S2.a.c(SubscriptionActivity.this.r1().s(), null, null, null, composer, 0, 7);
            z1 z1VarC3 = S2.a.c(SubscriptionActivity.this.r1().v(), null, null, null, composer, 0, 7);
            SubscriptionSummaryDecorator subscriptionSummaryDecorator = (SubscriptionSummaryDecorator) S2.a.c(SubscriptionActivity.this.t1().p(), null, null, null, composer, 0, 7).getValue();
            ProductFullDetails productFullDetails = this.f118958b;
            AbstractC16364a.CreateSubscription createSubscription = new AbstractC16364a.CreateSubscription(this.f118959c);
            SubscriptionDetails subscriptionDetails = subscriptionSummaryDecorator != null ? subscriptionSummaryDecorator.getSubscriptionDetails() : null;
            if (subscriptionSummaryDecorator == null || subscriptionSummaryDecorator.getSubscriptionDetails() == null || (enumC16365b = EnumC16365b.f156295c) == null) {
                enumC16365b = EnumC16365b.f156294b;
            }
            SubscriptionSummaryDecorator subscriptionSummaryDecorator2 = new SubscriptionSummaryDecorator(productFullDetails, createSubscription, subscriptionDetails, enumC16365b);
            final C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(SubscriptionActivity.this) | composer.D(c17893m0J);
            final SubscriptionActivity subscriptionActivity2 = SubscriptionActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubscriptionActivity.b.l(subscriptionActivity2, c17893m0J);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(SubscriptionActivity.this) | composer.D(c17893m0J);
            final SubscriptionActivity subscriptionActivity3 = SubscriptionActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubscriptionActivity.b.o(subscriptionActivity3, c17893m0J);
                    }
                };
                composer.t(objB3);
            }
            Function0 function02 = (Function0) objB3;
            composer.P();
            Object objF = f(z1VarC);
            Object objG = g(z1VarC2);
            Object objK = k(z1VarC3);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(objF) | composer.V(objG) | composer.V(objK) | composer.V(subscriptionSummaryDecorator2);
            final SubscriptionActivity subscriptionActivity4 = SubscriptionActivity.this;
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                Object subscriptionNavConfig = new SubscriptionNavConfig(f(z1VarC), g(z1VarC2), k(z1VarC3), subscriptionSummaryDecorator2, new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubscriptionActivity.b.p(subscriptionActivity4);
                    }
                });
                composer.t(subscriptionNavConfig);
                objB4 = subscriptionNavConfig;
            }
            SubscriptionNavConfig subscriptionNavConfig2 = (SubscriptionNavConfig) objB4;
            composer.P();
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(-1633490746);
            boolean zD3 = composer.D(SubscriptionActivity.this) | composer.D(c14677uE);
            SubscriptionActivity subscriptionActivity5 = SubscriptionActivity.this;
            Object objB5 = composer.B();
            if (zD3 || objB5 == companion.a()) {
                objB5 = new a(subscriptionActivity5, c14677uE, null);
                composer.t(objB5);
            }
            composer.P();
            J.g(unit, (Function2) objB5, composer, 6);
            Boolean boolValueOf = Boolean.valueOf(f(z1VarC).getDisplayHowItWorks());
            composer.startReplaceGroup(-1746271574);
            boolean zV2 = composer.V(z1VarC) | composer.D(c17893m0J) | composer.D(SubscriptionActivity.this);
            SubscriptionActivity subscriptionActivity6 = SubscriptionActivity.this;
            Object objB6 = composer.B();
            if (zV2 || objB6 == companion.a()) {
                n12 = null;
                objB6 = new C1930b(c17893m0J, subscriptionActivity6, z1VarC, null);
                composer.t(objB6);
            } else {
                n12 = null;
            }
            composer.P();
            J.g(boolValueOf, (Function2) objB6, composer, 0);
            K.b(n12, ComposableLambdaKt.c(-709450775, true, new c(c14677uE, SubscriptionActivity.this, c17893m0J, function02, subscriptionNavConfig2, function0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SubscriptionViewState f(z1<SubscriptionViewState> z1Var) {
            return z1Var.getValue();
        }

        private static final DeliveryAddressesViewState g(z1<DeliveryAddressesViewState> z1Var) {
            return z1Var.getValue();
        }

        private static final TimeSlotsViewState k(z1<TimeSlotsViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0 l(SubscriptionActivity subscriptionActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = subscriptionActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new e(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0 o(SubscriptionActivity subscriptionActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = subscriptionActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new d(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(SubscriptionActivity subscriptionActivity) {
            subscriptionActivity.finish();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118987f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f118987f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118987f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118988f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f118988f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f118988f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118989f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118990g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118989f = function0;
            this.f118990g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118989f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118990g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118991f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f118991f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118991f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118992f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f118992f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f118992f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118993f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118994g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118993f = function0;
            this.f118994g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118993f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118994g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118995f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f118995f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118995f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118996f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f118996f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f118996f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118997f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118998g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118997f = function0;
            this.f118998g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118997f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118998g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C15689a r1() {
        return (C15689a) this.checkoutSubscriptionVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16367d t1() {
        return (C16367d) this.subscriptionSummaryVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D u1() {
        return (D) this.subscriptionVM.getValue();
    }

    public final Cl.e s1() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    @Override // com.meijer.mobile.subscription.ux.subscription.Hilt_SubscriptionActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT", mk.f.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT");
            if (!(parcelableExtra instanceof mk.f)) {
                parcelableExtra = null;
            }
            obj = (mk.f) parcelableExtra;
        }
        Intrinsics.g(obj);
        mk.f fVar = (mk.f) obj;
        ProductFullDetails productFullDetailsA = Co.l.a(fVar);
        t1().r(productFullDetailsA);
        u1().B(productFullDetailsA);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1789219494, true, new b(productFullDetailsA, fVar)), 1, null);
    }
}
