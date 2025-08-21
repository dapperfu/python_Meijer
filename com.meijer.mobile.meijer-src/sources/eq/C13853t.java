package eq;

import Ki.LocalThemeScope;
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
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14889J;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lbk/a;", "itemCount", "subtotalPrice", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lbk/a;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: eq.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13853t {
    public static final void b(final LocalThemeScope localThemeScope, final Modifier modifier, final AbstractC6392a itemCount, final AbstractC6392a subtotalPrice, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(itemCount, "itemCount");
        Intrinsics.j(subtotalPrice, "subtotalPrice");
        Composer composerStartRestartGroup = composer.startRestartGroup(1507033521);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(itemCount) : composerStartRestartGroup.D(itemCount) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(subtotalPrice) : composerStartRestartGroup.D(subtotalPrice) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1507033521, i12, -1, "com.meijer.mobile.shopandscan.presentation.component.CartTotalsComponent (CartTotalsComponent.kt:31)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), H1.h.p(50)), H1.h.p(12));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.i(), composerStartRestartGroup, 54);
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            int i13 = AbstractC6392a.f60445b;
            String strA = C13698b.a(itemCount, composerStartRestartGroup, ((i12 >> 6) & 14) | i13);
            int i14 = LocalThemeScope.f17314g;
            int i15 = i12 & 14;
            int i16 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composerStartRestartGroup, i14 | i15 | (i16 << 3), 4);
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getTwo(), null, 383, null), C13698b.a(subtotalPrice, composerStartRestartGroup, ((i12 >> 9) & 14) | i13), null, composerStartRestartGroup, i14 | i15 | (i16 << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C13853t.c(localThemeScope, modifier, itemCount, subtotalPrice, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, abstractC6392a, abstractC6392a2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
