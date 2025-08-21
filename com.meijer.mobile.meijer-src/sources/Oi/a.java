package Oi;

import Ci.o;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Oi.a;
import Oi.l;
import P0.e;
import Pi.C4604p;
import Pi.Q;
import Qi.A9;
import Qi.C2;
import Qi.C4769b0;
import Qi.C4794cb;
import Qi.C4843g7;
import Qi.C4887k;
import Qi.C4960p7;
import Qi.C4989rb;
import Qi.C5037v7;
import Qi.C5049w6;
import Qi.C5071y2;
import Qi.C5081z;
import Qi.Eb;
import Qi.I0;
import Qi.Ib;
import Qi.K5;
import Qi.Lb;
import Qi.M;
import Qi.O1;
import Qi.O5;
import Qi.Oa;
import Qi.S9;
import Qi.W1;
import Qi.W7;
import Ri.A;
import Ri.C5263d;
import Ri.C5268i;
import Ri.C5274o;
import Ri.O;
import Ri.w;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.Y0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.n1;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14903g;
import java.util.List;
import ki.OnSale;
import ki.OutOfStock;
import ki.RegularPrice;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.InterfaceC15639n;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24121a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f24122b = ComposableLambdaKt.composableLambdaInstance(1280664070, false, f.f24136a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f24123c = ComposableLambdaKt.composableLambdaInstance(437765301, false, i.f24147a);

    /* renamed from: d, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f24124d = ComposableLambdaKt.composableLambdaInstance(1987774393, false, g.f24139a);

    /* renamed from: e, reason: collision with root package name */
    private static Function3<InterfaceC15639n, Composer, Integer, Unit> f24125e = ComposableLambdaKt.composableLambdaInstance(-1910596595, false, C0388a.f24131a);

    /* renamed from: f, reason: collision with root package name */
    private static Function3<InterfaceC15639n, Composer, Integer, Unit> f24126f = ComposableLambdaKt.composableLambdaInstance(1222828593, false, e.f24135a);

    /* renamed from: g, reason: collision with root package name */
    private static Function3<InterfaceC15639n, Composer, Integer, Unit> f24127g = ComposableLambdaKt.composableLambdaInstance(-2001906801, false, b.f24132a);

    /* renamed from: h, reason: collision with root package name */
    private static Function3<InterfaceC15639n, Composer, Integer, Unit> f24128h = ComposableLambdaKt.composableLambdaInstance(1025875496, false, d.f24134a);

    /* renamed from: i, reason: collision with root package name */
    private static Function3<InterfaceC15639n, Composer, Integer, Unit> f24129i = ComposableLambdaKt.composableLambdaInstance(-2093217007, false, c.f24133a);

    /* renamed from: j, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f24130j = ComposableLambdaKt.composableLambdaInstance(2065849112, false, h.f24140a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Oi.a$a, reason: collision with other inner class name */
    static final class C0388a implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0388a f24131a = new C0388a();

        public final void a(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1910596595, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$-1910596595.<anonymous> (ShowcaseActivity.kt:329)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            a(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        C0388a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24132a = new b();

        public final void a(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2001906801, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$-2001906801.<anonymous> (ShowcaseActivity.kt:361)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            a(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f24133a = new c();

        public final void a(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2093217007, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$-2093217007.<anonymous> (ShowcaseActivity.kt:393)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            a(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f24134a = new d();

        public final void a(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1025875496, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$1025875496.<anonymous> (ShowcaseActivity.kt:378)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            a(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f24135a = new e();

        public final void a(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1222828593, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$1222828593.<anonymous> (ShowcaseActivity.kt:346)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            a(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f24136a = new f();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oi.a$f$a, reason: collision with other inner class name */
        static final class C0389a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24137a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Oi.c> f24138b;

            C0389a(LocalThemeScope localThemeScope, InterfaceC5872l0<Oi.c> interfaceC5872l0) {
                this.f24137a = localThemeScope;
                this.f24138b = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2031663818, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$1280664070.<anonymous>.<anonymous> (ShowcaseActivity.kt:262)");
                }
                j.l(this.f24137a, f.o(this.f24138b), false, composer, 0, 2);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5872l0 interfaceC5872l0, Oi.c showcase) {
            Intrinsics.j(showcase, "showcase");
            p(interfaceC5872l0, showcase);
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v2 */
        public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            InterfaceC5872l0 interfaceC5872l0;
            Composer.Companion companion;
            InterfaceC5872l0 interfaceC5872l02;
            int i14;
            n1 n1Var;
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
                ComposerKt.U(1280664070, i11, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$1280664070.<anonymous> (ShowcaseActivity.kt:119)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = t1.e(new l.TypographyState(null, 1, null), null, 2, null);
                composer.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = t1.e(new O(d(interfaceC5872l03)), null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l04 = (InterfaceC5872l0) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = t1.e(new K5(l.q.f24284b), null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l05 = (InterfaceC5872l0) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = t1.e(new Eb(l.A.f24250b), null, 2, null);
                composer.t(objB4);
            }
            InterfaceC5872l0 interfaceC5872l06 = (InterfaceC5872l0) objB4;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion2.a()) {
                objB5 = t1.e(new Ib(l.B.f24251b), null, 2, null);
                composer.t(objB5);
            }
            InterfaceC5872l0 interfaceC5872l07 = (InterfaceC5872l0) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion2.a()) {
                objB6 = t1.e(l.w.f24302b, null, 2, null);
                composer.t(objB6);
            }
            InterfaceC5872l0 interfaceC5872l08 = (InterfaceC5872l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion2.a()) {
                objB7 = t1.e(new Oa(e(interfaceC5872l08)), null, 2, null);
                composer.t(objB7);
            }
            InterfaceC5872l0 interfaceC5872l09 = (InterfaceC5872l0) objB7;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB8 = composer.B();
            if (objB8 == companion2.a()) {
                i12 = 3;
                z10 = 1;
                objB8 = t1.e(CollectionsKt.p(r(interfaceC5872l04), new w(new l.IconsState(null, 1, null)), new C5268i(l.j.f24276b), new C5263d(l.i.f24275b), new C5274o(l.k.f24277b)), null, 2, null);
                composer.t(objB8);
            } else {
                z10 = 1;
                i12 = 3;
            }
            InterfaceC5872l0 interfaceC5872l010 = (InterfaceC5872l0) objB8;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB9 = composer.B();
            if (objB9 == companion2.a()) {
                A a10 = new A(new l.TagState(t1.e(C5489q0.m(AdsTheme.getAdsColors().getAdsColorActive01().getColor()), null, 2, null), t1.e("Test", null, 2, null), t1.e(C5489q0.m(AdsTheme.getAdsColors().getAdsColorText01().getColor()), null, 2, null), t1.e(C.b.g.d.f16999e, null, 2, null), t1.e(AdsTheme.getAdsTypography().getBodyCompact().getTwo().getStyle(), null, 2, null)));
                InterfaceC5868j0 interfaceC5868j0A = C5844c1.a(5);
                i13 = i11;
                Boolean bool = Boolean.TRUE;
                interfaceC5872l0 = interfaceC5872l010;
                M m10 = new M(new l.BadgeState(interfaceC5868j0A, t1.e(bool, null, 2, null)));
                InterfaceC5872l0 interfaceC5872l0E = t1.e(0, null, 2, null);
                Boolean bool2 = Boolean.FALSE;
                C5037v7 c5037v7 = new C5037v7(new l.ProgressTrackerState(interfaceC5872l0E, t1.e(bool2, null, 2, null), t1.e(bool2, null, 2, null), t1.e(bool2, null, 2, null), t1.e(null, null, 2, null), t1.e(bool2, null, 2, null), o1.g("This is a long text to show that the text can wrap to the next line and maintain a responsive design", "This is a long text to show that the text can wrap to the next line and maintain a responsive design", "This is a long text to show that the text can wrap to the next line and maintain a responsive design", "This is a long text to show that the text can wrap to the next line and maintain a responsive design", "This is a long text to show that the text can wrap to the next line and maintain a responsive design")));
                W1 w12 = new W1(l.f.f24270b);
                A9 a92 = new A9(l.u.f24297b);
                C4794cb c4794cb = new C4794cb(l.x.f24303b);
                companion = companion2;
                interfaceC5872l02 = interfaceC5872l04;
                O1 o12 = new O1(new l.ButtonState(t1.e(bool, null, 2, null), t1.e(bool, null, 2, null), t1.e(bool, null, 2, null), t1.e(bool, null, 2, null)));
                I0 i02 = new I0(new l.ButtonState(t1.e(bool, null, 2, null), t1.e(bool, null, 2, null), t1.e(bool, null, 2, null), t1.e(bool, null, 2, null)));
                Oa oaF = f(interfaceC5872l09);
                C5081z c5081z = new C5081z(l.C4504b.f24262b);
                C2 c22 = new C2(new l.ClippedCoupon(t1.e(bool2, null, 2, null), C5844c1.a(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR), t1.e(bool, null, 2, null)));
                Ib ibU = u(interfaceC5872l07);
                W7 w72 = new W7(l.t.f24296b);
                C4960p7 c4960p7 = new C4960p7(new l.ProgressIndicator(Y0.a(9.6d), Y0.a(2.6d), C5844c1.a(9), C5844c1.a(i12)));
                C4843g7 c4843g7 = new C4843g7(new l.LoadingState(t1.e(bool, null, 2, null), t1.e(o.f4629a, null, 2, null)));
                K5 k5S = s(interfaceC5872l05);
                C4887k c4887k = new C4887k(l.C4503a.f24261b);
                C4604p c4604p = new C4604p(l.o.f24282b);
                S9 s92 = new S9(new l.SearchState(t1.e("", null, 2, null), t1.e("", null, 2, null), t1.e("", null, 2, null), t1.e("", null, 2, null)));
                Eb ebT = t(interfaceC5872l06);
                l.p pVar = l.p.f24283b;
                Lb lb2 = new Lb(pVar);
                O5 o52 = new O5(pVar);
                C5071y2 c5071y2 = new C5071y2(l.g.f24271b);
                C4769b0 c4769b0 = new C4769b0(l.d.f24265b);
                Oi.c[] cVarArr = new Oi.c[24];
                cVarArr[0] = a10;
                cVarArr[z10] = m10;
                cVarArr[2] = c5037v7;
                cVarArr[i12] = w12;
                cVarArr[4] = a92;
                cVarArr[5] = c4794cb;
                cVarArr[6] = o12;
                cVarArr[7] = i02;
                cVarArr[8] = oaF;
                cVarArr[9] = c5081z;
                cVarArr[10] = c22;
                cVarArr[11] = ibU;
                cVarArr[12] = w72;
                cVarArr[13] = c4960p7;
                cVarArr[14] = c4843g7;
                cVarArr[15] = k5S;
                cVarArr[16] = c4887k;
                cVarArr[17] = c4604p;
                cVarArr[18] = s92;
                cVarArr[19] = ebT;
                cVarArr[20] = lb2;
                cVarArr[21] = o52;
                cVarArr[22] = c5071y2;
                cVarArr[23] = c4769b0;
                objB9 = t1.e(CollectionsKt.p(cVarArr), null, 2, null);
                composer.t(objB9);
            } else {
                i13 = i11;
                interfaceC5872l0 = interfaceC5872l010;
                companion = companion2;
                interfaceC5872l02 = interfaceC5872l04;
            }
            InterfaceC5872l0 interfaceC5872l011 = (InterfaceC5872l0) objB9;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB10 = composer.B();
            if (objB10 == companion.a()) {
                Q q10 = new Q(l.q.f24284b);
                C5049w6 c5049w6 = new C5049w6(l.m.f24279b);
                C4989rb c4989rb = new C4989rb(l.y.f24304b);
                Oi.c[] cVarArr2 = new Oi.c[i12];
                cVarArr2[0] = q10;
                cVarArr2[z10] = c5049w6;
                i14 = 2;
                cVarArr2[2] = c4989rb;
                n1Var = null;
                objB10 = t1.e(CollectionsKt.p(cVarArr2), null, 2, null);
                composer.t(objB10);
            } else {
                i14 = 2;
                n1Var = null;
            }
            InterfaceC5872l0 interfaceC5872l012 = (InterfaceC5872l0) objB10;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB11 = composer.B();
            if (objB11 == companion.a()) {
                objB11 = t1.e(r(interfaceC5872l02), n1Var, i14, n1Var);
                composer.t(objB11);
            }
            final InterfaceC5872l0 interfaceC5872l013 = (InterfaceC5872l0) objB11;
            composer.P();
            List listP0 = CollectionsKt.P0(CollectionsKt.P0(g(interfaceC5872l0), k(interfaceC5872l011)), l(interfaceC5872l012));
            Oi.c cVarO = o(interfaceC5872l013);
            composer.startReplaceGroup(5004770);
            Object objB12 = composer.B();
            if (objB12 == companion.a()) {
                objB12 = new Function1() { // from class: Oi.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a.f.q(interfaceC5872l013, (c) obj);
                    }
                };
                composer.t(objB12);
            }
            composer.P();
            j.i(AdsTheme, listP0, cVarO, (Function1) objB12, ComposableLambdaKt.c(2031663818, z10, new C0389a(AdsTheme, interfaceC5872l013), composer, 54), composer, (i13 & 14) | 27648);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            c(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        f() {
        }

        private static final l.TypographyState d(InterfaceC5872l0<l.TypographyState> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final l.w e(InterfaceC5872l0<l.w> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final Oa f(InterfaceC5872l0<Oa> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final List<Oi.c> g(InterfaceC5872l0<List<Oi.c>> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final List<Oi.c> k(InterfaceC5872l0<List<Oi.c>> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final List<Oi.c> l(InterfaceC5872l0<List<Oi.c>> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Oi.c o(InterfaceC5872l0<Oi.c> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void p(InterfaceC5872l0<Oi.c> interfaceC5872l0, Oi.c cVar) {
            interfaceC5872l0.setValue(cVar);
        }

        private static final O r(InterfaceC5872l0<O> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final K5 s(InterfaceC5872l0<K5> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final Eb t(InterfaceC5872l0<Eb> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final Ib u(InterfaceC5872l0<Ib> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f24139a = new g();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1987774393, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$1987774393.<anonymous> (ShowcaseActivity.kt:292)");
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

        g() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f24140a = new h();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oi.a$h$a, reason: collision with other inner class name */
        /* synthetic */ class C0390a extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

            /* renamed from: h, reason: collision with root package name */
            public static final C0390a f24141h = new C0390a();

            C0390a() {
                super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RegularPrice invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new RegularPrice(p02, null, null, null, 14, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<RegularPrice, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24142a;

            b(LocalThemeScope localThemeScope) {
                this.f24142a = localThemeScope;
            }

            public final void a(RegularPrice Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(80345617, i11, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$2065849112.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:546)");
                }
                si.j.h(this.f24142a, new q1.Label(null, null, null, null, 0, false, 0, this.f24142a.getAdsTypography().getHeadings().getSeven(), null, 383, null), "Price Per Unit - RegularPrice", null, composer, 384, 4);
                si.j.h(this.f24142a, Assemble.getLabels().getPricePerUnit(), "$64.22 /lb, Approx 500 lb /pkg", null, composer, 384, 4);
                si.j.h(this.f24142a, new q1.Label(null, null, null, null, 0, false, 0, this.f24142a.getAdsTypography().getDetail().getOne(), null, 383, null), "Final Cort by Weight", null, composer, 384, 4);
                C17983Z.a(D.k(Modifier.INSTANCE, 0.0f, H1.h.p(4), 1, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
                a(regularPrice, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends AdaptedFunctionReference implements Function1<LocalThemeScope, OutOfStock> {

            /* renamed from: h, reason: collision with root package name */
            public static final c f24143h = new c();

            c() {
                super(1, OutOfStock.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OutOfStock invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new OutOfStock(p02, null, null, null, 14, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<OutOfStock, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24144a;

            d(LocalThemeScope localThemeScope) {
                this.f24144a = localThemeScope;
            }

            public final void a(OutOfStock Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1511829878, i11, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$2065849112.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:564)");
                }
                si.j.h(this.f24144a, new q1.Label(null, null, null, null, 0, false, 0, this.f24144a.getAdsTypography().getHeadings().getSeven(), null, 383, null), "Price Per Unit - OutOfStock", null, composer, 384, 4);
                si.j.h(this.f24144a, Assemble.getLabels().getPricePerUnit(), "$64.22 /lb, Approx 500 lb /pkg", null, composer, 384, 4);
                si.j.h(this.f24144a, new q1.Label(null, null, null, null, 0, false, 0, this.f24144a.getAdsTypography().getDetail().getOne(), null, 383, null), "Final Cort by Weight", null, composer, 384, 4);
                C17983Z.a(D.k(Modifier.INSTANCE, 0.0f, H1.h.p(4), 1, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(OutOfStock outOfStock, Composer composer, Integer num) {
                a(outOfStock, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class e extends AdaptedFunctionReference implements Function1<LocalThemeScope, OnSale> {

            /* renamed from: h, reason: collision with root package name */
            public static final e f24145h = new e();

            e() {
                super(1, OnSale.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OnSale invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new OnSale(p02, null, null, null, 14, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function3<OnSale, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24146a;

            f(LocalThemeScope localThemeScope) {
                this.f24146a = localThemeScope;
            }

            public final void a(OnSale Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1418829760, i11, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$2065849112.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:582)");
                }
                si.j.h(this.f24146a, new q1.Label(null, null, null, null, 0, false, 0, this.f24146a.getAdsTypography().getHeadings().getSeven(), null, 383, null), "Price Per Unit - OnSale", null, composer, 384, 4);
                si.j.h(this.f24146a, Assemble.getLabels().getPricePerUnit(), "$64.22 /lb, Approx 500 lb /pkg", null, composer, 384, 4);
                si.j.h(this.f24146a, new q1.Label(null, null, null, null, 0, false, 0, this.f24146a.getAdsTypography().getDetail().getOne(), null, 383, null), "Final Cort by Weight", null, composer, 384, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(OnSale onSale, Composer composer, Integer num) {
                a(onSale, composer, num.intValue());
                return Unit.f143329a;
            }
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
                ComposerKt.U(2065849112, i11, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$2065849112.<anonymous> (ShowcaseActivity.kt:543)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, H1.h.p(8));
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA2, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = C0390a.f24141h;
                composer.t(objB);
            }
            composer.P();
            int i12 = (i11 & 14) | 432;
            Ki.Q.f(AdsTheme, (Function1) objB, ComposableLambdaKt.c(80345617, true, new b(AdsTheme), composer, 54), composer, i12);
            composer.v();
            MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA3, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion4.a()) {
                objB2 = c.f24143h;
                composer.t(objB2);
            }
            composer.P();
            Ki.Q.f(AdsTheme, (Function1) objB2, ComposableLambdaKt.c(1511829878, true, new d(AdsTheme), composer, 54), composer, i12);
            composer.v();
            MeasurePolicy measurePolicyA4 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyA4, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion4.a()) {
                objB3 = e.f24145h;
                composer.t(objB3);
            }
            composer.P();
            Ki.Q.f(AdsTheme, (Function1) objB3, ComposableLambdaKt.c(-1418829760, true, new f(AdsTheme), composer, 54), composer, i12);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        h() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f24147a = new i();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(437765301, i10, -1, "com.meijer.mobile.androidacres.showcase.ComposableSingletons$ShowcaseActivityKt.lambda$437765301.<anonymous> (ShowcaseActivity.kt:118)");
            }
            K.b(null, a.f24121a.f(), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        i() {
        }
    }

    public final Function3<InterfaceC15639n, Composer, Integer, Unit> a() {
        return f24125e;
    }

    public final Function3<InterfaceC15639n, Composer, Integer, Unit> b() {
        return f24127g;
    }

    public final Function3<InterfaceC15639n, Composer, Integer, Unit> c() {
        return f24129i;
    }

    public final Function3<InterfaceC15639n, Composer, Integer, Unit> d() {
        return f24128h;
    }

    public final Function3<InterfaceC15639n, Composer, Integer, Unit> e() {
        return f24126f;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> f() {
        return f24122b;
    }

    public final Function2<Composer, Integer, Unit> g() {
        return f24124d;
    }

    public final Function2<Composer, Integer, Unit> h() {
        return f24123c;
    }
}
