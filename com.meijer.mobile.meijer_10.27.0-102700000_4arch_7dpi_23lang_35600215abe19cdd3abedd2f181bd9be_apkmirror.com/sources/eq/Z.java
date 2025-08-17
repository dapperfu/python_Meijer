package eq;

import Ji.LocalThemeScope;
import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import com.google.zxing.WriterException;
import d0.C13457y;
import fh.C13893b;
import ji.q1;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "data", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "LGg/b;", "d", "(Ljava/lang/String;)LGg/b;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class Z {
    public static final void b(final LocalThemeScope localThemeScope, final Modifier modifier, final String data, Composer composer, final int i10) {
        int i11;
        Unit unit;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-934141762);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(data) ? 256 : 128;
        }
        if ((i11 & 131) == 130 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-934141762, i11, -1, "com.meijer.mobile.shopandscan.presentation.component.PDF417Barcode (PDF417Barcode.kt:33)");
            }
            Gg.b bVarD = d(data);
            composerStartRestartGroup.startReplaceGroup(-62063913);
            if (bVarD == null) {
                unit = null;
            } else {
                Bitmap bitmapA = new C13893b().a(bVarD);
                Intrinsics.i(bitmapA, "createBitmap(...)");
                C13457y.b(V0.M.c(bitmapA), null, androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(272)), H1.h.p(72)), null, InterfaceC5784k.INSTANCE.e(), 0.0f, null, 0, composerStartRestartGroup, 25008, 232);
                unit = Unit.f142422a;
            }
            composerStartRestartGroup.P();
            if (unit == null) {
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(com.meijer.mobile.shopandscan.e.f116922K, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f140080j << 3) | (i11 & 14) | LocalThemeScope.f15770g, 4);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.Y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z.c(localThemeScope, modifier, data, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, str, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final Gg.b d(String str) {
        try {
            return new C13893b().b(str, com.google.zxing.a.PDF_417, 100, 100, MapsKt.r(TuplesKt.a(com.google.zxing.f.MARGIN, 0)));
        } catch (WriterException unused) {
            return null;
        }
    }
}
