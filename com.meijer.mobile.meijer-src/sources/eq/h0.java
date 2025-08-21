package eq;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import iq.ShopAndScanCartViewState;
import j0.C14889J;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKi/M;", "", "isRefreshing", "Liq/E$a;", "message", "", "b", "(LKi/M;ZLiq/E$a;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h0 {
    public static final void b(LocalThemeScope localThemeScope, final boolean z10, final ShopAndScanCartViewState.a message, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(885825444);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(message) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(885825444, i11, -1, "com.meijer.mobile.shopandscan.presentation.component.RefreshStatus (RefreshStatusBar.kt:31)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1348391571);
                c(localThemeScope2, C16338g.c(com.meijer.mobile.shopandscan.e.f117944p, composerStartRestartGroup, 0), null, androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope2.getAdsColors().getAdsColorText02().getColor(), null, 2, null), composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.P();
                localThemeScope2 = localThemeScope;
            } else {
                composerStartRestartGroup.startReplaceGroup(1348648530);
                if (message instanceof ShopAndScanCartViewState.a.b) {
                    composerStartRestartGroup.startReplaceGroup(1348700052);
                    localThemeScope2 = localThemeScope;
                    c(localThemeScope2, C16338g.c(com.meijer.mobile.shopandscan.e.f117941o, composerStartRestartGroup, 0), null, androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorSupportSuccess().getColor(), null, 2, null), composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.P();
                } else {
                    localThemeScope2 = localThemeScope;
                    composerStartRestartGroup.startReplaceGroup(1349387043);
                    composerStartRestartGroup.P();
                }
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h0.d(localThemeScope2, z10, message, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void c(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(665794108);
        String str3 = (i11 & 2) != 0 ? null : str2;
        if (ComposerKt.M()) {
            ComposerKt.U(665794108, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.RefreshStatus.StatusContent (RefreshStatusBar.kt:37)");
        }
        float f10 = 18;
        Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f10)), 0.0f, 1, null);
        C5800d c5800d = C5800d.f48779a;
        C5800d.f fVarE = c5800d.e();
        e.Companion companion = P0.e.INSTANCE;
        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, companion.i(), composer, 54);
        int iA = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
        D1.c(composerA, measurePolicyB, companion2.e());
        D1.c(composerA, interfaceC5884sR, companion2.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
            composerA.t(Integer.valueOf(iA));
            composerA.n(Integer.valueOf(iA), function2B);
        }
        D1.c(composerA, modifierE, companion2.f());
        C14889J c14889j = C14889J.f139620a;
        Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f10)), 0.0f, 1, null);
        MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion.i(), composer, 54);
        int iA2 = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR2 = composer.r();
        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH2);
        Function0<InterfaceC5953g> function0A2 = companion2.a();
        if (composer.k() == null) {
            C5859f.c();
        }
        composer.F();
        if (composer.getInserting()) {
            composer.I(function0A2);
        } else {
            composer.s();
        }
        Composer composerA2 = D1.a(composer);
        D1.c(composerA2, measurePolicyB2, companion2.e());
        D1.c(composerA2, interfaceC5884sR2, companion2.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
            composerA2.t(Integer.valueOf(iA2));
            composerA2.n(Integer.valueOf(iA2), function2B2);
        }
        D1.c(composerA2, modifierE2, companion2.f());
        Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
        Ki.T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        float f11 = 8;
        q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion3, H1.h.p(f11), 0.0f, 0.0f, 0.0f, 14, null), adsColorInverse, null, null, 0, false, 0, eight, null, 380, null);
        int i12 = LocalThemeScope.f17314g;
        int i13 = q1.Label.f142335j;
        si.j.h(localThemeScope, label, str, null, composer, (i13 << 3) | i12 | ((i10 << 6) & 896), 4);
        composer.startReplaceGroup(126742822);
        if (str3 != null) {
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, H1.h.p(f11), 0.0f, 11, null), localThemeScope.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 380, null), str3, null, composer, i12 | (i13 << 3), 4);
        }
        composer.P();
        composer.v();
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, boolean z10, ShopAndScanCartViewState.a aVar, int i10, Composer composer, int i11) {
        b(localThemeScope, z10, aVar, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
