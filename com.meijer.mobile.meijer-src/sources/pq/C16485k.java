package pq;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
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
import eq.C13853t;
import eq.C13856w;
import eq.k0;
import hq.ShopAndScanCartTotalsDecorator;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/c;", "decorator", "", "cartIsEmpty", "Lkotlin/Function0;", "", "scannerEvent", "checkoutEvent", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/c;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pq.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16485k {
    public static final void b(final LocalThemeScope localThemeScope, final Modifier modifier, final ShopAndScanCartTotalsDecorator decorator, final boolean z10, final Function0<Unit> scannerEvent, final Function0<Unit> checkoutEvent, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(scannerEvent, "scannerEvent");
        Intrinsics.j(checkoutEvent, "checkoutEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(99600918);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(scannerEvent) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(checkoutEvent) ? 131072 : 65536;
        }
        int i14 = i11;
        if ((74899 & i14) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(99600918, i14, -1, "com.meijer.mobile.shopandscan.presentation.widget.CartTotalsWidget (CartTotalsWidget.kt:35)");
            }
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceGroup(1733728058);
            if (z10) {
                i12 = i14;
                i13 = 0;
            } else {
                AbstractC6392a itemCount = decorator.getItemCount();
                AbstractC6392a subtotal = decorator.getSubtotal();
                int i15 = LocalThemeScope.f17314g | (i14 & 14) | (i14 & 112);
                int i16 = AbstractC6392a.f60445b;
                C13853t.b(localThemeScope, modifier, itemCount, subtotal, composerStartRestartGroup, i15 | (i16 << 6) | (i16 << 9));
                i12 = i14;
                i13 = 0;
                C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.P();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), companion.l(), composerStartRestartGroup, 6);
            int iA2 = C5859f.a(composerStartRestartGroup, i13);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
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
            D1.c(composerA2, measurePolicyB, companion2.e());
            D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            float f10 = 12;
            float f11 = 18;
            float f12 = 50;
            Modifier modifierB = InterfaceC14888I.b(c14889j, J.i(D.l(companion3, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f11)), H1.h.p(f12)), 2.0f, false, 2, null);
            int i17 = LocalThemeScope.f17314g;
            int i18 = i12 & 14;
            int i19 = i12 >> 6;
            k0.c(localThemeScope, modifierB, scannerEvent, composerStartRestartGroup, (i19 & 896) | i17 | i18, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            C13856w.c(localThemeScope, InterfaceC14888I.b(c14889j, J.i(D.m(companion3, 0.0f, H1.h.p(f10), H1.h.p(f10), H1.h.p(f11), 1, null), H1.h.p(f12)), 1.0f, false, 2, null), !z10, checkoutEvent, composerStartRestartGroup, i17 | i18 | (i19 & 7168), 0);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pq.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16485k.c(localThemeScope, modifier, decorator, z10, scannerEvent, checkoutEvent, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator, boolean z10, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, shopAndScanCartTotalsDecorator, z10, function0, function02, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
