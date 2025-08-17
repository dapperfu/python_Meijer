package Qi;

import Ji.LocalThemeScope;
import Ni.l;
import androidx.compose.foundation.layout.C5658d;
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
import j0.C14802K;
import j0.C14815g;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LQi/d;", "LNi/c;", "LNi/l$i;", "state", "<init>", "(LNi/l$i;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$i;", "m", "()LNi/l$i;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5125d implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.i state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.d$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30681a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5125d f30682b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.d$a$a, reason: collision with other inner class name */
        static final class C0694a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30683a;

            C0694a(LocalThemeScope localThemeScope) {
                this.f30683a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-709040294, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorAliasShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ColorAliasShowcase.kt:45)");
                }
                LocalThemeScope localThemeScope = this.f30683a;
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
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorActive01(), "adsColorActive01", "Blue700 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorInteractiveEnabled04(), "adsColorInteractiveEnabled04", "BaseWhite in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsInteractiveSelected(), "adsInteractiveSelected", "Blue100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorsActive02(), "adsColorsActive02", "Blue200 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorActiveDanger(), "adsColorActiveDanger", "Red700 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorActiveInverse(), "adsColorActiveInverse", "Gray300 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorActiveTransparent(), "adsColorActiveTransparent", "Gray200 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), "adsColorBrandPrimary", "Blue500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorBrandSecondary(), "adsColorBrandSecondary", "Red500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorDanger(), "adsColorDanger", "Red500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorsDisabled(), "adsColorsDisabled", "Transparent black 600 (all themes)", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorEnabled01(), "adsColorEnabled01", "Blue500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorsEnabled02(), "adsColorsEnabled02", "Transparent in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorFocus(), "adsColorFocus", "Cyan500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorHover01(), "adsColorHover01", "Blue600 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorHover02(), "adsColorHover02", "Gray200 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorHoverDanger(), "adsColorHoverDanger", "Red600 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorHoverInverse(), "adsColorHoverInverse", "Gray200 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorHoverTransparent(), "adsColorHoverTransparent", "Gray100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorIcon01(), "adsColorIcon01", "Gray900 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorIcon02(), "adsColorIcon02", "Gray800 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorIcon03(), "adsColorIcon03", "Blue500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorIconSubtle(), "adsColorIconSubtle", "Gray600 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorInverse(), "adsColorInverse", "BaseWhite in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorLink(), "adsColorLink", "Blue500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorPlaceholder(), "adsColorPlaceholder", "Gray600 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSavings(), "adsColorSavings", "Red500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportError(), "adsColorSupportError", "Red500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportErrorBg(), "adsColorSupportErrorBg", "Red100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportInformational(), "adsColorSupportInformational", "Blue500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportInformationalBg(), "adsColorSupportInformationalBg", "Blue100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportSuccess(), "adsColorSupportSuccess", "Green700 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportSuccessBg(), "adsColorSupportSuccessBg", "Green100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportWarning(), "adsColorSupportWarning", "Yellow400 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorSupportWarningBg(), "adsColorSupportWarningBg", "Yellow100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorText01(), "adsColorText01", "Gray900 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorText02(), "adsColorText02", "Gray800 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorText03(), "adsColorText03", "Blue500 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorTextHighlight(), "adsColorTextHighlight", "Yellow300 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorTransparent(), "adsColorTransparent", "BaseTransparent in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorUIBackground01(), "adsColorUIBackground01", "BaseWhite in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorUIBackground02(), "adsColorUIBackground02", "Gray100 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorUIBorder01(), "adsColorUIBorder01", "Gray600 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorUIBorder02(), "adsColorUIBorder02", "Gray300 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorUIDivider(), "adsColorUIDivider", "Gray300 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAdsColorUIOverlay(), "adsColorUIOverlay", "TBlack300 in all themes", 0L, composer, 3456, 8);
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

        a(LocalThemeScope localThemeScope, C5125d c5125d) {
            this.f30681a = localThemeScope;
            this.f30682b = c5125d;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(636881997, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorAliasShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ColorAliasShowcase.kt:41)");
            }
            Ri.b.b(this.f30681a, null, this.f30682b.d("Global"), "1.0", null, ComposableLambdaKt.c(-709040294, true, new C0694a(this.f30681a), composer, 54), composer, 199680, 9);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.d$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5125d f30685b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.d$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30686a;

            a(LocalThemeScope localThemeScope) {
                this.f30686a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2101074863, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorAliasShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ColorAliasShowcase.kt:285)");
                }
                LocalThemeScope localThemeScope = this.f30686a;
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
                N1.b("Use the 'start' and 'end' pairs of each color to mark the lower and upper bounds for a gradient", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getBodyCompact().getTwo().getStyle(), composer, 6, 0, 65534);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(8)), composer, 6);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAcresGradientBlueStart(), "acresGradientBlueStart", "Blue300 in all themes", 0L, composer, 3456, 8);
                C5127f.b(localThemeScope, localThemeScope.getAdsColors().getAcresGradientBlueEnd(), "acresGradientBlueEnd", "Blue500 in all themes", 0L, composer, 3456, 8);
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

        b(LocalThemeScope localThemeScope, C5125d c5125d) {
            this.f30684a = localThemeScope;
            this.f30685b = c5125d;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1454909308, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorAliasShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ColorAliasShowcase.kt:281)");
            }
            Ri.b.b(this.f30684a, null, this.f30685b.d("Gradients"), "1.0", null, ComposableLambdaKt.c(-2101074863, true, new a(this.f30684a), composer, 54), composer, 199680, 9);
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

    public C5125d(l.i state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, C5125d c5125d, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(636881997, true, new a(localThemeScope, c5125d)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1454909308, true, new b(localThemeScope, c5125d)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C5125d c5125d, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5125d.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C5125d c5125d, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5125d.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(645279096);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(645279096, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorAliasShowcase.Content (ColorAliasShowcase.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5125d.j(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5125d.k(this.f30674a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(461074433);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(461074433, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorAliasShowcase.Controls (ColorAliasShowcase.kt:308)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5125d.l(this.f30677a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Alias Colors";
    }

    @Override // Ni.c
    /* renamed from: m, reason: from getter */
    public l.i getState() {
        return this.state;
    }
}
