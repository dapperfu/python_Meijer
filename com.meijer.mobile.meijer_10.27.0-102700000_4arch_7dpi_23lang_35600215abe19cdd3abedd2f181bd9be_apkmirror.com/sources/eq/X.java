package eq;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C17906T0;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LJi/M;", "", "isWarning", "isError", "isItemSyncing", "", "b", "(LJi/M;ZZZLandroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class X {
    public static final void b(final LocalThemeScope localThemeScope, final boolean z10, final boolean z11, final boolean z12, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1228037788);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z12) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1228037788, i11, -1, "com.meijer.mobile.shopandscan.presentation.component.ItemDividerComponent (ItemDividerComponent.kt:24)");
            }
            if (z12) {
                composerStartRestartGroup.startReplaceGroup(-57516750);
                composer2 = composerStartRestartGroup;
                C17906T0.f(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(1)), localThemeScope.getAdsColors().getAdsColorSupportInformationalBg().getColor(), 0L, 0, composer2, 6, 12);
                composer2.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-57297797);
                C17917Z.a(null, z10 ? localThemeScope.getAdsColors().getAdsColorSupportWarning().getColor() : z11 ? localThemeScope.getAdsColors().getAdsColorSupportError().getColor() : localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composerStartRestartGroup, 0, 13);
                composer2 = composerStartRestartGroup;
                composer2.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.W
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return X.c(localThemeScope, z10, z11, z12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, int i10, Composer composer, int i11) {
        b(localThemeScope, z10, z11, z12, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
