package gn;

import H1.h;
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
import bk.AbstractC6392a;
import dk.C13698b;
import hn.TransactionDecorator;
import j0.C14889J;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import si.j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhn/s;", "decorator", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/s;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gn.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14394f {
    public static final void b(LocalThemeScope localThemeScope, final Modifier modifier, final TransactionDecorator decorator, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-392860655);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-392860655, i11, -1, "com.meijer.mobile.meijer.activity.orders.compose.TransactionItem (TransactionItem.kt:30)");
            }
            Modifier modifierJ = D.j(modifier, h.p(8), h.p(16));
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierJ);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), companion.l(), composerStartRestartGroup, 6);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
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
            AbstractC6392a date = decorator.getDate();
            int i12 = AbstractC6392a.f60445b;
            String strA = C13698b.a(date, composerStartRestartGroup, i12);
            q1.Label label = new q1.Label(companion3, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 382, null);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i11 & 14;
            int i15 = q1.Label.f142335j;
            j.h(localThemeScope2, label, strA, null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            j.h(localThemeScope, decorator.getIsRefund() ? new q1.Label(companion3, localThemeScope.getAdsColors().getAdsColorSupportSuccess(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 380, null) : new q1.Label(companion3, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), C13698b.a(decorator.getAmount(), composerStartRestartGroup, i12), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            composerStartRestartGroup.v();
            localThemeScope2 = localThemeScope;
            j.h(localThemeScope2, new q1.Label(D.m(companion3, 0.0f, h.p(4), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 382, null), C13698b.a(decorator.getTransactionId(), composerStartRestartGroup, i12), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: gn.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14394f.c(localThemeScope2, modifier, decorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, TransactionDecorator transactionDecorator, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, transactionDecorator, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
