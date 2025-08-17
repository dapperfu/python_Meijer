package vi;

import Ji.C;
import P0.e;
import V0.C5347r0;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import d0.BorderStroke;
import d0.C13439f;
import d0.C13442i;
import d0.C13443j;
import d0.C13457y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import r0.C16692i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "LV0/D1;", "shape", "LV0/q0;", "backgroundColor", "Ld0/h;", "border", "LH1/h;", "elevation", "i", "(Landroidx/compose/ui/Modifier;LV0/D1;JLd0/h;F)Landroidx/compose/ui/Modifier;", "Lvi/a;", "", "d", "(Lvi/a;Landroidx/compose/runtime/Composer;I)V", "", "isPressed", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vi.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C17575e {
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    public static final void d(final InterfaceC17571a interfaceC17571a, Composer composer, final int i10) {
        int i11;
        ?? r32;
        Modifier modifierI;
        Intrinsics.j(interfaceC17571a, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2141570175);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(interfaceC17571a) : composerStartRestartGroup.D(interfaceC17571a) ? 4 : 2) | i10;
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
                objB = interfaceC17571a.getTemplate().getInteractionSource();
                if (objB == null) {
                    objB = h0.k.a();
                }
                composerStartRestartGroup.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composerStartRestartGroup.P();
            final z1<Boolean> z1VarA = h0.o.a(lVar, composerStartRestartGroup, 6);
            final long color = e(z1VarA) ? interfaceC17571a.c().getAdsColors().getAdsColorActiveTransparent().getColor() : interfaceC17571a.c().getAdsColors().getAdsColorUIBackground01().getColor();
            composerStartRestartGroup.startReplaceGroup(759619175);
            if (interfaceC17571a.getEnabled()) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zT = interfaceC17571a.getChecked();
                int iC = Role.INSTANCE.c();
                boolean zH = interfaceC17571a.getEnabled();
                Role roleJ = Role.j(iC);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(interfaceC17571a));
                Object objB2 = composerStartRestartGroup.B();
                if (z10 || objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: vi.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C17575e.f(interfaceC17571a, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                r32 = 0;
                modifierI = D.i(ToggleableKt.a(companion2, zT, lVar, null, zH, roleJ, (Function1) objB2), interfaceC17571a.c().getAdsSpacing().getOne().getDp());
            } else {
                r32 = 0;
                modifierI = D.i(Modifier.INSTANCE, interfaceC17571a.c().getAdsSpacing().getOne().getDp());
            }
            composerStartRestartGroup.P();
            Modifier modifierThen = interfaceC17571a.getTemplate().getModifier().then(modifierI);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion3.e(), r32);
            int iA = C5717f.a(composerStartRestartGroup, r32);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyG, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C5664j c5664j = C5664j.f48612a;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(z1VarA) | composerStartRestartGroup.e(color);
            Object objB3 = composerStartRestartGroup.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: vi.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17575e.g(color, z1VarA, (X0.f) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            C13443j.a(companion5, (Function1) objB3, composerStartRestartGroup, 6);
            float f10 = 20;
            Modifier modifierI2 = i(J.y(companion5, H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), C16692i.c(interfaceC17571a.c().getAdsCornerRadii().getRadius02().getDp()), (interfaceC17571a.getEnabled() || !interfaceC17571a.getChecked()) ? interfaceC17571a.getChecked() ? interfaceC17571a.getTemplate().getColors().getCheckedEnabledColor().getColor() : interfaceC17571a.getTemplate().getColors().getCheckmarkColor().getColor() : interfaceC17571a.getTemplate().getColors().getDisabledColor().getColor(), C13442i.a(H1.h.p(1), !interfaceC17571a.getEnabled() ? interfaceC17571a.getTemplate().getColors().getDisabledColor().getColor() : interfaceC17571a.getChecked() ? interfaceC17571a.getTemplate().getColors().getCheckedEnabledColor().getColor() : interfaceC17571a.getTemplate().getColors().getUncheckedEnabledColor().getColor()), H1.h.p(0));
            MeasurePolicy measurePolicyG2 = C5662h.g(companion3.o(), false);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI2);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyG2, companion4.e());
            D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            composerStartRestartGroup.startReplaceGroup(239353608);
            if (interfaceC17571a.getChecked()) {
                C13457y.a(C16190d.c(C.f.n.f15521e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composerStartRestartGroup, 0), "", J.v(androidx.compose.foundation.b.d(companion5, interfaceC17571a.c().getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), H1.h.p(f10)), null, InterfaceC5784k.INSTANCE.g(), 0.0f, C5347r0.Companion.c(C5347r0.INSTANCE, interfaceC17571a.getTemplate().getColors().getCheckmarkColor().getColor(), 0, 2, null), composerStartRestartGroup, 24624, 40);
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
            t0L.a(new Function2() { // from class: vi.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17575e.h(interfaceC17571a, i10, (Composer) obj, ((Integer) obj2).intValue());
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(InterfaceC17571a interfaceC17571a, int i10, Composer composer, int i11) {
        d(interfaceC17571a, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final Modifier i(Modifier modifier, V0.D1 d12, long j10, BorderStroke borderStroke, float f10) {
        Modifier modifierB = T0.l.b(modifier, f10, d12, false, 0L, 0L, 24, null);
        Modifier modifierE = Modifier.INSTANCE;
        if (borderStroke != null) {
            modifierE = C13439f.e(modifierE, borderStroke, d12);
        }
        return T0.e.a(androidx.compose.foundation.b.c(modifierB.then(modifierE), j10, d12), d12);
    }

    private static final boolean e(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC17571a interfaceC17571a, boolean z10) {
        Function1<Boolean, Unit> function1P;
        if (interfaceC17571a.P() != null && interfaceC17571a.getEnabled() && (function1P = interfaceC17571a.P()) != null) {
            function1P.invoke(Boolean.valueOf(!interfaceC17571a.getChecked()));
        }
        return Unit.f142422a;
    }
}
