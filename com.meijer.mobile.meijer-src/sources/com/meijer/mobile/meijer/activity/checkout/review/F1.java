package com.meijer.mobile.meijer.activity.checkout.review;

import Fo.Savings;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.F1;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import fj.DeliveryMode;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public static final F1 f105372a = new F1();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f105373b = ComposableLambdaKt.composableLambdaInstance(-274389668, false, b.f105380a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f105374c = ComposableLambdaKt.composableLambdaInstance(1363701852, false, c.f105381a);

    /* renamed from: d, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f105375d = ComposableLambdaKt.composableLambdaInstance(986598463, false, f.f105384a);

    /* renamed from: e, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f105376e = ComposableLambdaKt.composableLambdaInstance(973553599, false, e.f105383a);

    /* renamed from: f, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f105377f = ComposableLambdaKt.composableLambdaInstance(-1763155812, false, a.f105379a);

    /* renamed from: g, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f105378g = ComposableLambdaKt.composableLambdaInstance(569953809, false, d.f105382a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f105379a = new a();

        a() {
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                ComposerKt.U(-1763155812, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.ComposableSingletons$CheckoutScreenKt.lambda$-1763155812.<anonymous> (CheckoutScreen.kt:1669)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion3.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.E1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F1.a.e(interfaceC5872l0);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            Z0.D0(AdsTheme, modifierH, (Function0) objB2, composer, i12 | 432 | i13, 0);
            composer.startReplaceGroup(-486508381);
            if (c(interfaceC5872l0)) {
                si.j.h(AdsTheme, new q1.Label(null, null, null, null, 0, false, 0, AdsTheme.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "URL launched", null, composer, i12 | 384 | i13 | (q1.Label.f142335j << 3), 4);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final boolean c(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        private static final void d(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0) {
            d(interfaceC5872l0, !c(interfaceC5872l0));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f105380a = new b();

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-274389668, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ComposableSingletons$CheckoutScreenKt.lambda$-274389668.<anonymous> (CheckoutScreen.kt:225)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f105381a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g() {
            return Unit.f143329a;
        }

        public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                ComposerKt.U(1363701852, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.ComposableSingletons$CheckoutScreenKt.lambda$1363701852.<anonymous> (CheckoutScreen.kt:863)");
            }
            CheckoutViewState checkoutViewState = new CheckoutViewState(null, null, new CartOrderSummaryDecorator(Co.l.f(null, null, 3.99d, "$3.99", 0.0d, null, 51, null), new DeliveryMode("delivery", null, "ezcd", "delivery", 2, null), null, Co.l.f(null, null, 0.0d, "FREE", 0.0d, null, 51, null), null, Co.l.f(null, null, 2.99d, "4.99", 0.0d, null, 51, null), null, Co.l.f(null, null, 1.99d, "1.99", 0.0d, null, 51, null), Co.l.f(null, null, 1.99d, "1.99", 0.0d, null, 51, null), Co.l.f(null, null, 1.99d, "1.99", 0.0d, null, 51, null), new Savings(null, 199.9d, 1, null), null, null, new Savings(null, 12.3d, 1, null), Co.l.f(null, null, 7.99d, "7.99", 0.0d, null, 51, null), null, null, null, false, null, false, false, null, true, false, null, null, 125802580, null), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, null, -5, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.G1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F1.c.e();
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.H1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F1.c.f();
                    }
                };
                composer.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.I1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F1.c.g();
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Z0.M0(AdsTheme, null, checkoutViewState, function0, function02, (Function0) objB3, composer, (i11 & 14) | 224256 | LocalThemeScope.f17314g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            d(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f105382a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(z1.h it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(569953809, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ComposableSingletons$CheckoutScreenKt.lambda$569953809.<anonymous> (CheckoutScreen.kt:1693)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.J1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return F1.d.c((z1.h) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Z0.J0(AdsTheme, true, (Function1) objB, composer, LocalThemeScope.f17314g | 432 | (i10 & 14), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f105383a = new e();

        e() {
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                ComposerKt.U(973553599, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.ComposableSingletons$CheckoutScreenKt.lambda$973553599.<anonymous> (CheckoutScreen.kt:1659)");
            }
            Z0.i0(AdsTheme, null, new CheckoutViewState(null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, null, -1, null), false, null, null, null, null, null, null, null, null, null, null, composer, (i11 & 14) | LocalThemeScope.f17314g, 0, 8189);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f105384a = new f();

        f() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(986598463, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ComposableSingletons$CheckoutScreenKt.lambda$986598463.<anonymous> (CheckoutScreen.kt:1640)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f105373b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f105375d;
    }
}
