package Qi;

import Ki.LocalThemeScope;
import P0.e;
import Qi.C5035v5;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.C15144M;
import ki.q1;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16671b;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qi.v5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5035v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final C5035v5 f30610a = new C5035v5();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f30611b = ComposableLambdaKt.composableLambdaInstance(1241677236, false, d.f30623a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f30612c = ComposableLambdaKt.composableLambdaInstance(-1606410395, false, a.f30615a);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f30613d = ComposableLambdaKt.composableLambdaInstance(-955521955, false, c.f30617a);

    /* renamed from: e, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f30614e = ComposableLambdaKt.composableLambdaInstance(-2073567794, false, b.f30616a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.v5$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30615a = new a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1606410395, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$-1606410395.<anonymous> (ClippedCoupon.kt:40)");
            }
            Ki.K.b(null, C5035v5.f30610a.d(), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.v5$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30616a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2073567794, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$-2073567794.<anonymous> (ClippedCoupon.kt:110)");
            }
            Ki.K.b(null, C5035v5.f30610a.c(), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.v5$c */
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f30617a = new c();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.v5$c$a */
        static final class a implements Function3<C15144M, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30618a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.v5$c$a$a, reason: collision with other inner class name */
            static final class C0633a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30619a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C15144M f30620b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.v5$c$a$a$a, reason: collision with other inner class name */
                static final class C0634a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30621a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C15144M f30622b;

                    C0634a(LocalThemeScope localThemeScope, C15144M c15144m) {
                        this.f30621a = localThemeScope;
                        this.f30622b = c15144m;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2104304950, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$-955521955.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClippedCoupon.kt:125)");
                        }
                        C16671b.b(this.f30621a, this.f30622b.y().getUnclipped(), null, null, composer, 0, 6);
                        C14890K.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, H1.h.p(8), 0.0f, 11, null), composer, 6);
                        si.j.h(this.f30621a, this.f30622b.z().getButtonLabel(), "Buy $25,\nget 1 free", null, composer, 384, 4);
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

                C0633a(LocalThemeScope localThemeScope, C15144M c15144m) {
                    this.f30619a = localThemeScope;
                    this.f30620b = c15144m;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1845379146, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$-955521955.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClippedCoupon.kt:124)");
                    }
                    C4107g.e(null, 0.0f, ComposableLambdaKt.c(-2104304950, true, new C0634a(this.f30619a, this.f30620b), composer, 54), composer, 384, 3);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30618a = localThemeScope;
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

            public final void d(C15144M Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-303358161, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$-955521955.<anonymous>.<anonymous> (ClippedCoupon.kt:112)");
                }
                LocalThemeScope localThemeScope = this.f30618a;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion3.a();
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                float f10 = 4;
                Modifier modifierZ = androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null), H1.h.p(HttpResponseStatus.SUCCESS_OK));
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierZ);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                q1.d.ClippableCouponButton unclipped = Assemble.x().getUnclipped();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB == companion4.a()) {
                    objB = new Function0() { // from class: Qi.w5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5035v5.c.a.e();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, unclipped, (Function0) objB, ComposableLambdaKt.c(-1845379146, true, new C0633a(localThemeScope, Assemble), composer, 54), composer, 3456);
                composer.v();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                q1.Tag clipped = Assemble.A().getClipped();
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Qi.x5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5035v5.c.a.f();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Ii.h.h(localThemeScope, clipped, "Spend $25, Get\nFree Delivery", (Function0) objB2, composer, 3456, 0);
                composer.v();
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
                int iA4 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierH2);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion3.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
                q1.Tag incentive = Assemble.A().getIncentive();
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion4.a()) {
                    objB3 = new Function0() { // from class: Qi.y5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5035v5.c.a.g();
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                Ii.h.h(localThemeScope, incentive, "Spend $25\nMore, Save $5", (Function0) objB3, composer, 3456, 0);
                composer.v();
                Modifier modifierH3 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
                int iA5 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierH3);
                Function0<InterfaceC5953g> function0A5 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A5);
                } else {
                    composer.s();
                }
                Composer composerA5 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA5, measurePolicyB4, companion3.e());
                androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getSuccess(), "Coupon Applied!\nClaim your free item.", null, composer, 384, 4);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C15144M c15144m, Composer composer, Integer num) {
                d(c15144m, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-955521955, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$-955521955.<anonymous> (ClippedCoupon.kt:111)");
            }
            Ki.Q.d(AdsTheme, C15144M.f141932a, ComposableLambdaKt.c(-303358161, true, new a(AdsTheme), composer, 54), composer, (i10 & 14) | 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.v5$d */
    static final class d implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f30623a = new d();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.v5$d$a */
        static final class a implements Function3<C15144M, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30624a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.v5$d$a$a, reason: collision with other inner class name */
            static final class C0635a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30625a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C15144M f30626b;

                C0635a(LocalThemeScope localThemeScope, C15144M c15144m) {
                    this.f30625a = localThemeScope;
                    this.f30626b = c15144m;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2026284211, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$1241677236.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClippedCoupon.kt:48)");
                    }
                    C16671b.b(this.f30625a, this.f30626b.y().getUnclipped(), null, null, composer, 0, 6);
                    C14890K.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, H1.h.p(8), 0.0f, 11, null), composer, 6);
                    si.j.h(this.f30625a, this.f30626b.z().getButtonLabel(), "Buy 2, Save $5", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30624a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(C15144M Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-826915578, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$1241677236.<anonymous>.<anonymous> (ClippedCoupon.kt:42)");
                }
                LocalThemeScope localThemeScope = this.f30624a;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion3.a();
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                float f10 = 4;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                q1.d.ClippableCouponButton unclipped = Assemble.x().getUnclipped();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.z5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5035v5.d.a.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, unclipped, (Function0) objB, ComposableLambdaKt.c(-2026284211, true, new C0635a(localThemeScope, Assemble), composer, 54), composer, 3456);
                composer.v();
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK2);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getClipped(), "Buy 2, Save $5", null, composer, 384, 4);
                composer.v();
                Modifier modifierK3 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA4 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierK3);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion3.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getIncentive(), "Spend $25 More, Save $5", null, composer, 384, 4);
                composer.v();
                Modifier modifierK4 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA5 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierK4);
                Function0<InterfaceC5953g> function0A5 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A5);
                } else {
                    composer.s();
                }
                Composer composerA5 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA5, measurePolicyB4, companion3.e());
                androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getLoading(), "Updating...", null, composer, 384, 4);
                composer.v();
                Modifier modifierK5 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB5 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA6 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR6 = composer.r();
                Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierK5);
                Function0<InterfaceC5953g> function0A6 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A6);
                } else {
                    composer.s();
                }
                Composer composerA6 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA6, measurePolicyB5, companion3.e());
                androidx.compose.runtime.D1.c(composerA6, interfaceC5884sR6, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
                if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                    composerA6.t(Integer.valueOf(iA6));
                    composerA6.n(Integer.valueOf(iA6), function2B6);
                }
                androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getSuccess(), "Coupon Applied!", null, composer, 384, 4);
                composer.v();
                Modifier modifierK6 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB6 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA7 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR7 = composer.r();
                Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierK6);
                Function0<InterfaceC5953g> function0A7 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A7);
                } else {
                    composer.s();
                }
                Composer composerA7 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA7, measurePolicyB6, companion3.e());
                androidx.compose.runtime.D1.c(composerA7, interfaceC5884sR7, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B7 = companion3.b();
                if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                    composerA7.t(Integer.valueOf(iA7));
                    composerA7.n(Integer.valueOf(iA7), function2B7);
                }
                androidx.compose.runtime.D1.c(composerA7, modifierE7, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getError(), "Error", null, composer, 384, 4);
                composer.v();
                Modifier modifierK7 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB7 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA8 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR8 = composer.r();
                Modifier modifierE8 = androidx.compose.ui.b.e(composer, modifierK7);
                Function0<InterfaceC5953g> function0A8 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A8);
                } else {
                    composer.s();
                }
                Composer composerA8 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA8, measurePolicyB7, companion3.e());
                androidx.compose.runtime.D1.c(composerA8, interfaceC5884sR8, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B8 = companion3.b();
                if (composerA8.getInserting() || !Intrinsics.e(composerA8.B(), Integer.valueOf(iA8))) {
                    composerA8.t(Integer.valueOf(iA8));
                    composerA8.n(Integer.valueOf(iA8), function2B8);
                }
                androidx.compose.runtime.D1.c(composerA8, modifierE8, companion3.f());
                Ii.h.h(localThemeScope, Assemble.A().getClipped(), "Averylongtagthatisprobablygoingtocollidewiththelimitsofthescreenontheright", null, composer, 384, 4);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C15144M c15144m, Composer composer, Integer num) {
                b(c15144m, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1241677236, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ClippedCouponKt.lambda$1241677236.<anonymous> (ClippedCoupon.kt:41)");
            }
            Ki.Q.d(AdsTheme, C15144M.f141932a, ComposableLambdaKt.c(-826915578, true, new a(AdsTheme), composer, 54), composer, (i10 & 14) | 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        d() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f30612c;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f30614e;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> c() {
        return f30613d;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> d() {
        return f30611b;
    }
}
