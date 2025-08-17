package kotlin;

import Ji.LocalThemeScope;
import V0.C5346q0;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yr.C18297x;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJi/M;", "", "progressValue", "maxValue", "", "c", "(LJi/M;DDLandroidx/compose/runtime/Composer;I)V", "", "isCurrencyType", "Landroidx/compose/ui/Modifier;", "modifier", "isRewardDetailsPage", "e", "(LJi/M;ZDDLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lo.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15457x {
    public static final void c(final LocalThemeScope localThemeScope, final double d10, final double d11, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1310187957);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.g(d10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.g(d11) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1310187957, i11, -1, "com.meijer.mobile.mperks.ux.common.RewardProgressBar (RewardProgressBar.kt:36)");
            }
            float f10 = 8;
            C18297x.c(localThemeScope, J.i(J.h(D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, H1.h.p(4), 7, null), 0.0f, 1, null), H1.h.p(f10)), H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), CollectionsKt.p(C5346q0.m(localThemeScope.getAdsColors().getAcresGradientBlueStart().getColor()), C5346q0.m(localThemeScope.getAdsColors().getAcresGradientBlueEnd().getColor())), (float) d10, (float) d11, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lo.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15457x.d(localThemeScope, d10, d11, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, double d10, double d11, int i10, Composer composer, int i11) {
        c(localThemeScope, d10, d11, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ji.LocalThemeScope r30, final boolean r31, final double r32, final double r34, androidx.compose.ui.Modifier r36, boolean r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15457x.e(Ji.M, boolean, double, double, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, boolean z10, double d10, double d11, Modifier modifier, boolean z11, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, z10, d10, d11, modifier, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
