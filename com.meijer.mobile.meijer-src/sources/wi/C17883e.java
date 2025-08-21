package wi;

import Ki.C;
import P0.e;
import V0.C5490r0;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import d0.BorderStroke;
import d0.C13572f;
import d0.C13575i;
import d0.C13576j;
import d0.C13590y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import r0.C16806i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "LV0/D1;", "shape", "LV0/q0;", "backgroundColor", "Ld0/h;", "border", "LH1/h;", "elevation", "i", "(Landroidx/compose/ui/Modifier;LV0/D1;JLd0/h;F)Landroidx/compose/ui/Modifier;", "Lwi/a;", "", "d", "(Lwi/a;Landroidx/compose/runtime/Composer;I)V", "", "isPressed", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: wi.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17883e {
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    public static final void d(final InterfaceC17879a interfaceC17879a, Composer composer, final int i10) {
        int i11;
        ?? r32;
        Modifier modifierI;
        Intrinsics.j(interfaceC17879a, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2141570175);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC17879a) : composerStartRestartGroup.D(interfaceC17879a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2141570175, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.toggle_button.CheckboxFromScope (Checkbox.kt:61)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = interfaceC17879a.getTemplate().getInteractionSource();
                if (objB == null) {
                    objB = h0.k.a();
                }
                composerStartRestartGroup.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composerStartRestartGroup.P();
            final z1<Boolean> z1VarA = h0.o.a(lVar, composerStartRestartGroup, 6);
            final long color = e(z1VarA) ? interfaceC17879a.c().getAdsColors().getAdsColorActiveTransparent().getColor() : interfaceC17879a.c().getAdsColors().getAdsColorUIBackground01().getColor();
            composerStartRestartGroup.startReplaceGroup(759619175);
            if (interfaceC17879a.getEnabled()) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zU = interfaceC17879a.getChecked();
                int iC = Role.INSTANCE.c();
                boolean zH = interfaceC17879a.getEnabled();
                Role roleJ = Role.j(iC);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(interfaceC17879a));
                Object objB2 = composerStartRestartGroup.B();
                if (z10 || objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: wi.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C17883e.f(interfaceC17879a, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                r32 = 0;
                modifierI = D.i(ToggleableKt.a(companion2, zU, lVar, null, zH, roleJ, (Function1) objB2), interfaceC17879a.c().getAdsSpacing().getOne().getDp());
            } else {
                r32 = 0;
                modifierI = D.i(Modifier.INSTANCE, interfaceC17879a.c().getAdsSpacing().getOne().getDp());
            }
            composerStartRestartGroup.P();
            Modifier modifierThen = interfaceC17879a.getTemplate().getModifier().then(modifierI);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion3.e(), r32);
            int iA = C5859f.a(composerStartRestartGroup, r32);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyG, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C5806j c5806j = C5806j.f48836a;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(z1VarA) | composerStartRestartGroup.e(color);
            Object objB3 = composerStartRestartGroup.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: wi.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17883e.g(color, z1VarA, (X0.f) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            C13576j.a(companion5, (Function1) objB3, composerStartRestartGroup, 6);
            float f10 = 20;
            Modifier modifierI2 = i(J.y(companion5, H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), C16806i.c(interfaceC17879a.c().getAdsCornerRadii().getRadius02().getDp()), (interfaceC17879a.getEnabled() || !interfaceC17879a.getChecked()) ? interfaceC17879a.getChecked() ? interfaceC17879a.getTemplate().getColors().getCheckedEnabledColor().getColor() : interfaceC17879a.getTemplate().getColors().getCheckmarkColor().getColor() : interfaceC17879a.getTemplate().getColors().getDisabledColor().getColor(), C13575i.a(H1.h.p(1), !interfaceC17879a.getEnabled() ? interfaceC17879a.getTemplate().getColors().getDisabledColor().getColor() : interfaceC17879a.getChecked() ? interfaceC17879a.getTemplate().getColors().getCheckedEnabledColor().getColor() : interfaceC17879a.getTemplate().getColors().getUncheckedEnabledColor().getColor()), H1.h.p(0));
            MeasurePolicy measurePolicyG2 = C5804h.g(companion3.o(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI2);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
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
            D1.c(composerA2, measurePolicyG2, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            composerStartRestartGroup.startReplaceGroup(239353608);
            if (interfaceC17879a.getChecked()) {
                C13590y.a(C16335d.c(C.f.n.f17065e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composerStartRestartGroup, 0), "", J.v(androidx.compose.foundation.b.d(companion5, interfaceC17879a.c().getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), H1.h.p(f10)), null, InterfaceC5926k.INSTANCE.g(), 0.0f, C5490r0.Companion.c(C5490r0.INSTANCE, interfaceC17879a.getTemplate().getColors().getCheckmarkColor().getColor(), 0, 2, null), composerStartRestartGroup, 24624, 40);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wi.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17883e.h(interfaceC17879a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(long j10, z1 z1Var, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        if (e(z1Var)) {
            X0.f.f1(Canvas, j10, Canvas.I1(H1.h.p(24)), 0L, 0.0f, null, null, 0, 124, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(InterfaceC17879a interfaceC17879a, int i10, Composer composer, int i11) {
        d(interfaceC17879a, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final Modifier i(Modifier modifier, V0.D1 d12, long j10, BorderStroke borderStroke, float f10) {
        Modifier modifierB = T0.l.b(modifier, f10, d12, false, 0L, 0L, 24, null);
        Modifier modifierE = Modifier.INSTANCE;
        if (borderStroke != null) {
            modifierE = C13572f.e(modifierE, borderStroke, d12);
        }
        return T0.e.a(androidx.compose.foundation.b.c(modifierB.then(modifierE), j10, d12), d12);
    }

    private static final boolean e(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC17879a interfaceC17879a, boolean z10) {
        Function1<Boolean, Unit> function1S;
        if (interfaceC17879a.S() != null && interfaceC17879a.getEnabled() && (function1S = interfaceC17879a.S()) != null) {
            function1S.invoke(Boolean.valueOf(!interfaceC17879a.getChecked()));
        }
        return Unit.f143329a;
    }
}
