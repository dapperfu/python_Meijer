package ro;

import H1.h;
import Ki.LocalThemeScope;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.meijer.mobile.mperks.ux.i0;
import h6.C14478i;
import j0.C14903g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.C15457a;
import l6.C15461e;
import l6.InterfaceC15464h;
import l6.InterfaceC15467k;
import l6.InterfaceC15469m;
import l6.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "", "c", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "Lh6/i;", "composition", "", "progress", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class e {
    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void c(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-688122475);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-688122475, i10, -1, "com.meijer.mobile.mperks.ux.utils.AnimationTruncatedView (LottieAnimationPointsTruncatedView.kt:29)");
            }
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composerStartRestartGroup, 48);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            InterfaceC15467k interfaceC15467kR = q.r(InterfaceC15469m.e.a(InterfaceC15469m.e.b(i0.f115050b)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final InterfaceC15464h interfaceC15464hC = C15457a.c(d(interfaceC15467kR), true, false, false, null, 0.0f, 0, null, false, false, composerStartRestartGroup, 48, 1020);
            C14478i c14478iD = d(interfaceC15467kR);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zV = composerStartRestartGroup.V(interfaceC15464hC);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: ro.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(e.f(interfaceC15464hC));
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            float f10 = 40;
            C15461e.a(c14478iD, (Function0) objB, J.i(J.z(companion, h.p(f10)), h.p(f10)), false, false, false, false, null, false, null, null, InterfaceC5926k.INSTANCE.a(), false, false, null, null, false, composerStartRestartGroup, 384, 48, 129016);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ro.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.g(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final C14478i d(InterfaceC15467k interfaceC15467k) {
        return interfaceC15467k.getValue();
    }

    private static final float e(InterfaceC15464h interfaceC15464h) {
        return interfaceC15464h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(InterfaceC15464h interfaceC15464h) {
        return e(interfaceC15464h);
    }
}
