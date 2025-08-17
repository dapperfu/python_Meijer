package Qi;

import Ji.LocalThemeScope;
import Ji.S;
import P0.e;
import Qi.C5136o;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import r0.C16692i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LQi/o;", "LNi/c;", "LNi/l;", "state", "<init>", "(LNi/l;)V", "LJi/M;", "LJi/S;", "meijerCornerRadius", "", "radiusName", "dpValue", "", "j", "(LJi/M;LJi/S;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "LNi/l;", "getState", "()LNi/l;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5136o implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ni.l state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qi.o$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.o$a$a, reason: collision with other inner class name */
        static final class C0697a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30746a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5136o f30747b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.o$a$a$a, reason: collision with other inner class name */
            static final class C0698a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5136o f30748a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30749b;

                C0698a(C5136o c5136o, LocalThemeScope localThemeScope) {
                    this.f30748a = c5136o;
                    this.f30749b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1155860251, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CornerRadiiShowcase.kt:49)");
                    }
                    C5136o c5136o = this.f30748a;
                    LocalThemeScope localThemeScope = this.f30749b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14815g c14815g = C14815g.f139108a;
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius01(), "adsCornerRadii.radius01", "2.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius02(), "adsCornerRadii.radius02", "4.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius03(), "adsCornerRadii.radius03", "8.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius04(), "adsCornerRadii.radius04", "12.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius05(), "adsCornerRadii.radius05", "16.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius06(), "adsCornerRadii.radius06", "20.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5136o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius07(), "adsCornerRadii.radius07", "24.dp", composer, 3456);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0697a(LocalThemeScope localThemeScope, C5136o c5136o) {
                this.f30746a = localThemeScope;
                this.f30747b = c5136o;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-640186994, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CornerRadiiShowcase.kt:45)");
                }
                Ri.b.b(this.f30746a, null, this.f30747b.d("Tokens"), "1.0", null, ComposableLambdaKt.c(1155860251, true, new C0698a(this.f30747b, this.f30746a), composer, 54), composer, 199680, 9);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void b(final LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                ComposerKt.U(-1781916615, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.Content.<anonymous> (CornerRadiiShowcase.kt:42)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme))) | composer.V(C5136o.this);
            final C5136o c5136o = C5136o.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5136o.a.c(AdsTheme, c5136o, (l0.w) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, C5136o c5136o, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-640186994, true, new C0697a(localThemeScope, c5136o)), 3, null);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public C5136o(Ni.l state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(C5136o c5136o, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5136o.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final LocalThemeScope localThemeScope, S s10, final String str, final String str2, Composer composer, final int i10) {
        int i11;
        S s11;
        String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-729819689);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            s11 = s10;
            i11 |= composerStartRestartGroup.V(s11) ? 32 : 16;
        } else {
            s11 = s10;
        }
        if ((i10 & 384) == 0) {
            str3 = str;
            i11 |= composerStartRestartGroup.V(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(str2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-729819689, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.CornerRadiusRow (CornerRadiiShowcase.kt:104)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10));
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            N1.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composerStartRestartGroup, (i11 >> 6) & 14, 0, 65534);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            N1.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(localThemeScope.getAdsTypography().getBody().getOne().getStyle(), C5346q0.INSTANCE.a(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composerStartRestartGroup, (i11 >> 9) & 14, 0, 65534);
            composer2 = composerStartRestartGroup;
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(16)), composer2, 6);
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(androidx.compose.foundation.layout.J.v(companion, H1.h.p(50)), C16692i.c(s11.getDp())), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA3 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierD);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A3);
            } else {
                composer2.s();
            }
            Composer composerA3 = D1.a(composer2);
            D1.c(composerA3, measurePolicyG, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            composer2.v();
            composer2.v();
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            final S s12 = s11;
            t0L.a(new Function2() { // from class: Qi.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5136o.k(this.f30736a, localThemeScope, s12, str, str2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C5136o c5136o, LocalThemeScope localThemeScope, S s10, String str, String str2, int i10, Composer composer, int i11) {
        c5136o.j(localThemeScope, s10, str, str2, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-861394518);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.V(this) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-861394518, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.Content (CornerRadiiShowcase.kt:40)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1781916615, true, new a(), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5136o.i(this.f30733a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Corner Radii";
    }

    @Override // Ni.c
    public Ni.l getState() {
        return this.state;
    }
}
