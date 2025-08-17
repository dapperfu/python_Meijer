package vi;

import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y1;
import kotlin.z1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvi/m;", "", "b", "(Lvi/m;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vi.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C17585o {
    public static final void b(final InterfaceC17583m interfaceC17583m, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(interfaceC17583m, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1886934386);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC17583m) : composerStartRestartGroup.D(interfaceC17583m) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1886934386, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.toggle_button.SwitchFromScope (Switch.kt:30)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            C5658d.f fVarB = C5658d.f48555a.b();
            Modifier modifierI = D.i(Modifier.INSTANCE, interfaceC17583m.c().getAdsSpacing().getTwo().getDp());
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarI, composerStartRestartGroup, 54);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            interfaceC17583m.getTemplate().getColors();
            composerStartRestartGroup.startReplaceGroup(-2142149441);
            if (interfaceC17583m.getShowHelperText()) {
                N1.b(interfaceC17583m.getChecked() ? "on" : "off", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 0, 0, 131070);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.P();
            z1.a(interfaceC17583m.getChecked(), interfaceC17583m.P(), interfaceC17583m.getTemplate().getModifier(), interfaceC17583m.getEnabled(), null, y1.f168892a.a(interfaceC17583m.getTemplate().getColors().getCheckedEnabledColor().getColor(), interfaceC17583m.getTemplate().getColors().getTrackCheckedEnabled().getColor(), 0.0f, interfaceC17583m.getTemplate().getColors().getUncheckedEnabledColor().getColor(), interfaceC17583m.getTemplate().getColors().getTrackUncheckedEnabled().getColor(), 0.0f, interfaceC17583m.getTemplate().getColors().getCheckedDisabledColor().getColor(), interfaceC17583m.getTemplate().getColors().getTrackCheckedDisabled().getColor(), interfaceC17583m.getTemplate().getColors().getDisabledColor().getColor(), interfaceC17583m.getTemplate().getColors().getTrackUncheckedDisabled().getColor(), composer2, 0, y1.f168893b, 36), composer2, 0, 16);
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: vi.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17585o.c(interfaceC17583m, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(InterfaceC17583m interfaceC17583m, int i10, Composer composer, int i11) {
        b(interfaceC17583m, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
