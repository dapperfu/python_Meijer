package ni;

import B0.RippleAlpha;
import Ji.LocalThemeScope;
import V0.C5346q0;
import V0.C5349s0;
import X0.Stroke;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import d0.BorderStroke;
import d0.C13443j;
import j0.InterfaceC14794C;
import java.util.List;
import ji.q1;
import kotlin.C17871B0;
import kotlin.C17877E0;
import kotlin.C17916Y0;
import kotlin.C17979v;
import kotlin.C17983x;
import kotlin.InterfaceC17977u;
import kotlin.InterfaceC17981w;
import kotlin.Metadata;
import kotlin.RippleConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15825f;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LV0/q0;", "contentColor", "", "lightTheme", "g", "(JZ)J", "Lni/i;", "", "c", "(Lni/i;Landroidx/compose/runtime/Composer;I)V", "e", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ni.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15825f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ni.f$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15834i f151701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.d f151702b;

        a(InterfaceC15834i interfaceC15834i, q1.d dVar) {
            this.f151701a = interfaceC15834i;
            this.f151702b = dVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1021872318, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ButtonFromTemplate.<anonymous>.<anonymous> (ButtonComposables.kt:59)");
            }
            Function0<Unit> function0L = this.f151701a.l();
            Modifier modifier = this.f151701a.getTemplate().getModifier();
            boolean enabled = this.f151702b.getEnabled();
            h0.l interactionSource = this.f151702b.getInteractionSource();
            composer.startReplaceGroup(-1528207302);
            if (interactionSource == null) {
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = h0.k.a();
                    composer.t(objB);
                }
                interactionSource = (h0.l) objB;
                composer.P();
            }
            h0.l lVar = interactionSource;
            composer.P();
            InterfaceC17981w elevation = this.f151702b.getElevation();
            composer.startReplaceGroup(-1528204443);
            if (elevation == null) {
                elevation = C17979v.f168713a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, C17979v.f168724l << 15, 31);
            }
            InterfaceC17981w interfaceC17981w = elevation;
            composer.P();
            V0.D1 shape = this.f151702b.getShape();
            composer.startReplaceGroup(-1528202367);
            if (shape == null) {
                shape = C17877E0.f166879a.b(composer, C17877E0.f166880b).getSmall();
            }
            V0.D1 d12 = shape;
            composer.P();
            BorderStroke border = this.f151702b.getBorder();
            InterfaceC17977u colors = this.f151702b.getColors();
            composer.startReplaceGroup(-1528199323);
            if (colors == null) {
                colors = C17979v.f168713a.a(0L, 0L, 0L, 0L, composer, C17979v.f168724l << 12, 15);
            }
            InterfaceC17977u interfaceC17977u = colors;
            composer.P();
            InterfaceC14794C contentPadding = this.f151702b.getContentPadding();
            if (contentPadding == null) {
                contentPadding = C17979v.f168713a.c();
            }
            C17983x.c(function0L, modifier, enabled, lVar, interfaceC17981w, d12, border, interfaceC17977u, contentPadding, this.f151701a.getContent(), composer, 0, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ni.f$b */
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stroke f151703a;

        b(Stroke stroke) {
            this.f151703a = stroke;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, Stroke stroke, X0.f Canvas) {
            Intrinsics.j(Canvas, "$this$Canvas");
            X0.f.U0(Canvas, localThemeScope.getAdsColors().getAdsColorEnabled01().getColor(), 0L, 0L, U0.a.b((Float.floatToRawIntBits(6.0f) << 32) | (Float.floatToRawIntBits(6.0f) & 4294967295L)), stroke, 0.0f, null, 0, 230, null);
            return Unit.f142422a;
        }

        public final void b(final LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-575945277, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ClippableCouponVersion.<anonymous>.<anonymous> (ButtonComposables.kt:90)");
            }
            boolean z10 = true;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !composer.D(AdsTheme))) {
                z10 = false;
            }
            boolean zD = composer.D(this.f151703a) | z10;
            final Stroke stroke = this.f151703a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ni.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15825f.b.c(AdsTheme, stroke, (X0.f) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13443j.a(modifierF, (Function1) objB, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ni.f$c */
    static final class c implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15834i f151704a;

        c(InterfaceC15834i interfaceC15834i) {
            this.f151704a = interfaceC15834i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(androidx.compose.ui.layout.f0 f0Var, androidx.compose.ui.layout.f0 f0Var2, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            f0.a.l(layout, f0Var, 0, 0, 0.0f, 4, null);
            f0.a.l(layout, f0Var2, 0, 0, 0.0f, 4, null);
            return Unit.f142422a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K Layout, List<? extends androidx.compose.ui.layout.I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            final androidx.compose.ui.layout.f0 f0VarK0 = measurables.get(0).k0(j10);
            final androidx.compose.ui.layout.f0 f0VarK02 = measurables.get(1).k0(H1.b.INSTANCE.c(f0VarK0.getWidth(), f0VarK0.getHeight()));
            Intrinsics.h(this.f151704a.getTemplate(), "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.assemblies.Template.Button.ClippableCouponButton");
            return androidx.compose.ui.layout.K.G0(Layout, f0VarK0.getWidth(), f0VarK0.getHeight() + ((int) Layout.I1(H1.h.p(((q1.d.ClippableCouponButton) r11).getStrokeWidth()))), null, new Function1() { // from class: ni.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C15825f.c.b(f0VarK0, f0VarK02, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void c(final InterfaceC15834i interfaceC15834i, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(interfaceC15834i, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(180954139);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC15834i) : composerStartRestartGroup.D(interfaceC15834i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(180954139, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ButtonFromTemplate (ButtonComposables.kt:42)");
            }
            q1.d dVarB = interfaceC15834i.getTemplate();
            Ji.T rippleColor = dVarB.getRippleColor();
            androidx.compose.runtime.r.b(new androidx.compose.runtime.G0[]{C17916Y0.d().d(new RippleConfiguration(g(rippleColor != null ? rippleColor.getColor() : C5346q0.INSTANCE.j(), true), new RippleAlpha(1.0f, 1.0f, 1.0f, 1.0f), null)), C17871B0.c().d(Boolean.valueOf(dVarB.getLocalMinimumTouchTargetEnforcement()))}, ComposableLambdaKt.c(1021872318, true, new a(interfaceC15834i, dVarB), composerStartRestartGroup, 54), composerStartRestartGroup, androidx.compose.runtime.G0.f49976i | 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ni.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15825f.d(interfaceC15834i, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(InterfaceC15834i interfaceC15834i, int i10, Composer composer, int i11) {
        c(interfaceC15834i, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void e(final InterfaceC15834i interfaceC15834i, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(interfaceC15834i, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(627426557);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC15834i) : composerStartRestartGroup.D(interfaceC15834i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(627426557, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ClippableCouponVersion (ButtonComposables.kt:76)");
            }
            Stroke stroke = new Stroke(6.0f, 0.0f, 0, 0, V0.r1.INSTANCE.a(new float[]{20.0f, 20.0f}, 0.0f), 14, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i12 = i11 & 14;
            boolean z10 = i12 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(interfaceC15834i));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new c(interfaceC15834i);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicy, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            c(interfaceC15834i, composerStartRestartGroup, i12);
            Ji.K.b(null, ComposableLambdaKt.c(-575945277, true, new b(stroke), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ni.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15825f.f(interfaceC15834i, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC15834i interfaceC15834i, int i10, Composer composer, int i11) {
        e(interfaceC15834i, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final long g(long j10, boolean z10) {
        float fI = C5349s0.i(j10);
        if (!z10 && fI < 0.5d) {
            return C5346q0.INSTANCE.k();
        }
        return j10;
    }
}
