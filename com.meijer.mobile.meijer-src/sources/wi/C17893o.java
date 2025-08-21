package wi;

import P0.e;
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
import j0.C14889J;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y1;
import kotlin.z1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi/m;", "", "b", "(Lwi/m;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: wi.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17893o {
    public static final void b(final InterfaceC17891m interfaceC17891m, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(interfaceC17891m, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1886934386);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC17891m) : composerStartRestartGroup.D(interfaceC17891m) ? 4 : 2) | i10;
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
            C5800d.f fVarB = C5800d.f48779a.b();
            Modifier modifierI = D.i(Modifier.INSTANCE, interfaceC17891m.c().getAdsSpacing().getTwo().getDp());
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarI, composerStartRestartGroup, 54);
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
            interfaceC17891m.getTemplate().getColors();
            composerStartRestartGroup.startReplaceGroup(-2142149441);
            if (interfaceC17891m.getShowHelperText()) {
                N1.b(interfaceC17891m.getChecked() ? "on" : "off", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 0, 0, 131070);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.P();
            z1.a(interfaceC17891m.getChecked(), interfaceC17891m.S(), interfaceC17891m.getTemplate().getModifier(), interfaceC17891m.getEnabled(), null, y1.f169980a.a(interfaceC17891m.getTemplate().getColors().getCheckedEnabledColor().getColor(), interfaceC17891m.getTemplate().getColors().getTrackCheckedEnabled().getColor(), 0.0f, interfaceC17891m.getTemplate().getColors().getUncheckedEnabledColor().getColor(), interfaceC17891m.getTemplate().getColors().getTrackUncheckedEnabled().getColor(), 0.0f, interfaceC17891m.getTemplate().getColors().getCheckedDisabledColor().getColor(), interfaceC17891m.getTemplate().getColors().getTrackCheckedDisabled().getColor(), interfaceC17891m.getTemplate().getColors().getDisabledColor().getColor(), interfaceC17891m.getTemplate().getColors().getTrackUncheckedDisabled().getColor(), composer2, 0, y1.f169981b, 36), composer2, 0, 16);
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wi.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17893o.c(interfaceC17891m, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(InterfaceC17891m interfaceC17891m, int i10, Composer composer, int i11) {
        b(interfaceC17891m, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
