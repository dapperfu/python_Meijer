package Ym;

import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.meijer.mobile.meijer.activity.find.filter.s;
import j0.C14889J;
import kotlin.C17943E0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/s$b;", "item", "", "c", "(Lcom/meijer/mobile/meijer/activity/find/filter/s$b;Landroidx/compose/runtime/Composer;I)V", "", "text", "e", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class h {
    public static final void c(final s.HeaderItem item, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(856008117);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(item) : composerStartRestartGroup.D(item) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(856008117, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.HeaderItem (HeaderItem.kt:23)");
            }
            e(ck.d.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()), item.getTextItem()), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.d(item, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(s.HeaderItem headerItem, int i10, Composer composer, int i11) {
        c(headerItem, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void e(final String text, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1365504744);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.V(text) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1365504744, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessHeaderItem (HeaderItem.kt:36)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer2 = composerStartRestartGroup;
            N1.b(text, D.i(companion, H1.h.p(16)), 0L, 0L, null, FontWeight.INSTANCE.f(), null, 0L, null, null, 0L, 0, false, 0, 0, null, C17943E0.f167967a.c(composerStartRestartGroup, C17943E0.f167968b).getH6(), composer2, (i11 & 14) | 196656, 0, 65500);
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.f(text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, int i10, Composer composer, int i11) {
        e(str, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
