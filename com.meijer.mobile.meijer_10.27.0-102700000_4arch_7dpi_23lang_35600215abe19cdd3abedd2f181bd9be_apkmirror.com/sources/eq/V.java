package eq;

import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
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
import androidx.recyclerview.widget.RecyclerView;
import j0.C14801J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a7\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onSyncItem", "onRemoveItem", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class V {
    public static final void d(final LocalThemeScope localThemeScope, final Modifier modifier, final Function0<Unit> onSyncItem, final Function0<Unit> onRemoveItem, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onSyncItem, "onSyncItem");
        Intrinsics.j(onRemoveItem, "onRemoveItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(613002679);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onSyncItem) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onRemoveItem) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(613002679, i12, -1, "com.meijer.mobile.shopandscan.presentation.component.ItemActionsComponent (ItemActionsComponent.kt:29)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(35)), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 100;
            Modifier modifierZ = androidx.compose.foundation.layout.J.z(companion2, H1.h.p(f10));
            String strC = C16193g.c(com.meijer.mobile.shopandscan.e.f116975h, composerStartRestartGroup, 0);
            Z0.c cVarC = C16190d.c(com.meijer.mobile.shopandscan.b.f116768n, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 896) == 256;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: eq.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return V.e(onSyncItem);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i13 = LocalThemeScope.f15770g;
            int i14 = i12 & 14;
            Q.b(localThemeScope, modifierZ, strC, cVarC, (Function0) objB, composerStartRestartGroup, i13 | 48 | i14, 0);
            Modifier modifierZ2 = androidx.compose.foundation.layout.J.z(companion2, H1.h.p(f10));
            String strC2 = C16193g.c(com.meijer.mobile.shopandscan.e.f116972g, composerStartRestartGroup, 0);
            Z0.c cVarC2 = C16190d.c(com.meijer.mobile.shopandscan.b.f116767m, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = (i12 & 7168) == 2048;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: eq.T
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return V.f(onRemoveItem);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Q.b(localThemeScope, modifierZ2, strC2, cVarC2, (Function0) objB2, composerStartRestartGroup, i13 | 48 | i14, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.U
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.g(localThemeScope, modifier, onSyncItem, onRemoveItem, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        d(localThemeScope, modifier, function0, function02, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
