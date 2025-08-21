package Ri;

import Ki.LocalThemeScope;
import Ki.S;
import P0.e;
import Ri.C5274o;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import r0.C16806i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LRi/o;", "LOi/c;", "LOi/l;", "state", "<init>", "(LOi/l;)V", "LKi/M;", "LKi/S;", "meijerCornerRadius", "", "radiusName", "dpValue", "", "j", "(LKi/M;LKi/S;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "a", "LOi/l;", "getState", "()LOi/l;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ri.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5274o implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Oi.l state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ri.o$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ri.o$a$a, reason: collision with other inner class name */
        static final class C0748a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33333a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5274o f33334b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Ri.o$a$a$a, reason: collision with other inner class name */
            static final class C0749a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5274o f33335a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33336b;

                C0749a(C5274o c5274o, LocalThemeScope localThemeScope) {
                    this.f33335a = c5274o;
                    this.f33336b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1155860251, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CornerRadiiShowcase.kt:49)");
                    }
                    C5274o c5274o = this.f33335a;
                    LocalThemeScope localThemeScope = this.f33336b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14903g c14903g = C14903g.f139698a;
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius01(), "adsCornerRadii.radius01", "2.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius02(), "adsCornerRadii.radius02", "4.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius03(), "adsCornerRadii.radius03", "8.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius04(), "adsCornerRadii.radius04", "12.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius05(), "adsCornerRadii.radius05", "16.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius06(), "adsCornerRadii.radius06", "20.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    c5274o.j(localThemeScope, localThemeScope.getAdsCornerRadii().getRadius07(), "adsCornerRadii.radius07", "24.dp", composer, 3456);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    composer.v();
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

            C0748a(LocalThemeScope localThemeScope, C5274o c5274o) {
                this.f33333a = localThemeScope;
                this.f33334b = c5274o;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-640186994, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.CornerRadiiShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CornerRadiiShowcase.kt:45)");
                }
                Si.b.b(this.f33333a, null, this.f33334b.c("Tokens"), "1.0", null, ComposableLambdaKt.c(1155860251, true, new C0749a(this.f33334b, this.f33333a), composer, 54), composer, 199680, 9);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
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
            boolean zV = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme))) | composer.V(C5274o.this);
            final C5274o c5274o = C5274o.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ri.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5274o.a.c(AdsTheme, c5274o, (l0.w) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, C5274o c5274o, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-640186994, true, new C0748a(localThemeScope, c5274o)), 3, null);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public C5274o(Oi.l state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(C5274o c5274o, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5274o.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            N1.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composerStartRestartGroup, (i11 >> 6) & 14, 0, 65534);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            N1.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(localThemeScope.getAdsTypography().getBody().getOne().getStyle(), C5489q0.INSTANCE.a(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composerStartRestartGroup, (i11 >> 9) & 14, 0, 65534);
            composer2 = composerStartRestartGroup;
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(16)), composer2, 6);
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(androidx.compose.foundation.layout.J.v(companion, H1.h.p(50)), C16806i.c(s11.getDp())), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA3 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierD);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A3);
            } else {
                composer2.s();
            }
            Composer composerA3 = D1.a(composer2);
            D1.c(composerA3, measurePolicyG, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C5806j c5806j = C5806j.f48836a;
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
            t0L.a(new Function2() { // from class: Ri.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5274o.k(this.f33323a, localThemeScope, s12, str, str2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C5274o c5274o, LocalThemeScope localThemeScope, S s10, String str, String str2, int i10, Composer composer, int i11) {
        c5274o.j(localThemeScope, s10, str, str2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            Ki.K.b(null, ComposableLambdaKt.c(-1781916615, true, new a(), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5274o.i(this.f33320a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Corner Radii";
    }

    @Override // Oi.c
    public Oi.l getState() {
        return this.state;
    }
}
