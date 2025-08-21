package eq;

import F1.j;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
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
import j0.C14903g;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class K {
    public static final void b(LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(2115398575);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2115398575, i11, -1, "com.meijer.mobile.shopandscan.presentation.component.EmptyCartComponent (EmptyCartComponent.kt:30)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(modifier, H1.h.p(40));
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            C18054z0.a(C16335d.c(com.meijer.mobile.shopandscan.b.f117717r, composerStartRestartGroup, 0), null, null, 0L, composerStartRestartGroup, 48, 12);
            Ki.I six = localThemeScope2.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 4;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 374, null);
            String strC = C16338g.c(com.meijer.mobile.shopandscan.e.f117965w, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            int i14 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, (i14 << 3) | i12 | i13, 4);
            localThemeScope2 = localThemeScope;
            si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), null, null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 374, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117962v, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.J
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.c(localThemeScope2, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
