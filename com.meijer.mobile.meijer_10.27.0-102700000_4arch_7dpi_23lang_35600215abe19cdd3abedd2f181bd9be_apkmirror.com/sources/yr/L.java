package yr;

import Ji.LocalThemeScope;
import android.content.Context;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14801J;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.A0;
import ni.P0;
import p1.C16193g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isProductCarouselTitleVisible", "isViewAllLinkVisible", "Lkotlin/Function0;", "", "onViewAllProductsClicked", "c", "(LJi/M;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class L {
    public static final void c(final LocalThemeScope localThemeScope, final Modifier modifier, final boolean z10, final boolean z11, final Function0<Unit> onViewAllProductsClicked, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        int i12;
        String str;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onViewAllProductsClicked, "onViewAllProductsClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1185121129);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onViewAllProductsClicked) ? 16384 : 8192;
        }
        int i13 = i11;
        if ((i13 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1185121129, i13, -1, "com.meijer.mobile.ui.common.ProductCarouselHeaderContainer (ProductCarouselHeaderContainer.kt:41)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), H1.h.p(14), 0.0f, H1.h.p(8), 0.0f, 10, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
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
            composerStartRestartGroup.startReplaceGroup(1013477752);
            if (z10) {
                float f10 = 3;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(c14801j, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null), null, null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getHeadings().getSix(), null, HttpResponseStatus.REDIRECTION_FOUND, null);
                String string = ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getString(Q.f170984a);
                Intrinsics.i(string, "getString(...)");
                composer2 = composerStartRestartGroup;
                i12 = 0;
                str = "getString(...)";
                ri.j.h(localThemeScope, label, string, null, composer2, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g | (i13 & 14), 4);
            } else {
                composer2 = composerStartRestartGroup;
                i12 = 0;
                str = "getString(...)";
            }
            composer2.P();
            composer2.startReplaceGroup(1013494205);
            if (z11) {
                A0 a02 = A0.f151413a;
                String string2 = ((Context) composer2.o(AndroidCompositionLocals_androidKt.g())).getString(Bj.o.f2997S0);
                Intrinsics.i(string2, str);
                String strC = C16193g.c(Bj.o.f2997S0, composer2, i12);
                composer2.startReplaceGroup(5004770);
                if ((57344 & i13) == 16384) {
                    i12 = 1;
                }
                Object objB = composer2.B();
                if (i12 != 0 || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: yr.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return L.d(onViewAllProductsClicked);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                composerStartRestartGroup = composer2;
                P0.k(localThemeScope, a02, string2, (Function0) objB, null, strC, false, 0L, false, composerStartRestartGroup, LocalThemeScope.f15770g | (i13 & 14) | (A0.f151414b << 3), 232);
            } else {
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: yr.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return L.e(localThemeScope, modifier, z10, z11, onViewAllProductsClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, modifier, z10, z11, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
