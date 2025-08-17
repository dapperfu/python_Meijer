package Np;

import F1.t;
import Ji.LocalThemeScope;
import V0.C5306c0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.w;
import androidx.compose.ui.text.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Np.d.d(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.ui.graphics.e graphicsLayer) {
        Intrinsics.j(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.u(androidx.compose.ui.graphics.c.INSTANCE.c());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, w wVar, String str, X0.c drawWithContent) {
        Intrinsics.j(drawWithContent, "$this$drawWithContent");
        long jB = drawWithContent.b();
        float f10 = 2;
        long jD = U0.k.d((Float.floatToRawIntBits((Float.intBitsToFloat((int) (jB >> 32)) / f10) - 300.0f < 0.0f ? (600.0f - r4) + 300.0f : 600.0f) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (jB & 4294967295L)) / f10) - 200.0f < 0.0f ? (400.0f - r2) - 200.0f : 400.0f) & 4294967295L));
        long jB2 = drawWithContent.b();
        long jE = U0.f.e((Float.floatToRawIntBits(RangesKt.e((Float.intBitsToFloat((int) (jB2 >> 32)) / f10) - 300.0f, 0.0f)) << 32) | (Float.floatToRawIntBits(RangesKt.e((Float.intBitsToFloat((int) (jB2 & 4294967295L)) / f10) - 400.0f, 0.0f)) & 4294967295L));
        drawWithContent.a2();
        X0.f.i1(drawWithContent, localThemeScope.getAdsColors().l().o0().getColor(), jE, jD, 0.0f, null, null, C5306c0.INSTANCE.j(), 56, null);
        int i10 = (int) (jE & 4294967295L);
        x.b(drawWithContent, wVar, str, (496 & 4) != 0 ? U0.f.INSTANCE.c() : U0.f.e((Float.floatToRawIntBits(RangesKt.e((Float.intBitsToFloat((int) (drawWithContent.b() >> 32)) / f10) - (((int) (w.b(wVar, str, TextStyle.c(localThemeScope.getAdsTypography().getHeadings().getSeven().getStyle(), localThemeScope.getAdsColors().getAdsColorInteractiveEnabled04().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)) / 2), 0.0f)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (jD & 4294967295L)) + 12) & 4294967295L)), (496 & 8) != 0 ? TextStyle.INSTANCE.a() : TextStyle.c(localThemeScope.getAdsTypography().getHeadings().getSeven().getStyle(), localThemeScope.getAdsColors().getAdsColorInteractiveEnabled04().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (496 & 16) != 0 ? t.INSTANCE.a() : 0, (496 & 32) != 0, (496 & 64) != 0 ? Integer.MAX_VALUE : 0, (496 & 128) != 0 ? U0.k.INSTANCE.a() : 0L, (496 & 256) != 0 ? X0.f.INSTANCE.a() : 0);
        int i11 = (int) (jE >> 32);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i10)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11)) << 32)), U0.f.e((Float.floatToRawIntBits(RangesKt.e(Float.intBitsToFloat(i10) + 70.0f, 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11)) << 32)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i11) - 3.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i10)) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(RangesKt.e(Float.intBitsToFloat(i11) + 70.0f, 0.0f)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i10)) & 4294967295L)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.b() >> 32));
        long jE2 = U0.f.e((Float.floatToRawIntBits(RangesKt.j((fIntBitsToFloat / f10) + 300.0f, fIntBitsToFloat)) << 32) | (Float.floatToRawIntBits(RangesKt.e((Float.intBitsToFloat((int) (r1 & 4294967295L)) / f10) - 400.0f, 0.0f)) & 4294967295L));
        long color = localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor();
        int i12 = (int) (jE2 >> 32);
        int i13 = (int) (jE2 & 4294967295L);
        long jE3 = U0.f.e((Float.floatToRawIntBits(RangesKt.j(Float.intBitsToFloat(i12) + 3.0f, Float.intBitsToFloat((int) (drawWithContent.b() >> 32)))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i13)) & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.b() >> 32));
        X0.f.O0(drawWithContent, color, jE3, U0.f.e((Float.floatToRawIntBits(RangesKt.j(((fIntBitsToFloat2 / f10) + 300.0f) - 70.0f, fIntBitsToFloat2)) << 32) | (Float.floatToRawIntBits(RangesKt.e((Float.intBitsToFloat((int) (r8 & 4294967295L)) / f10) - 400.0f, 0.0f)) & 4294967295L)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i12)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i13)) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i12)) << 32) | (Float.floatToRawIntBits(RangesKt.j(Float.intBitsToFloat(i13) + 70.0f, Float.intBitsToFloat((int) (drawWithContent.b() & 4294967295L)))) & 4294967295L)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        long jE4 = U0.f.e((Float.floatToRawIntBits(RangesKt.j(Float.intBitsToFloat(i10) + 400.0f, Float.intBitsToFloat((int) (drawWithContent.b() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11)) << 32));
        int i14 = (int) (jE4 >> 32);
        int i15 = (int) (jE4 & 4294967295L);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), jE4, U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i14)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i15) - 70.0f) & 4294967295L)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i14) - 3.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i15)) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(RangesKt.j(Float.intBitsToFloat(i14) + 70.0f, Float.intBitsToFloat((int) (drawWithContent.b() >> 32)))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i15)) & 4294967295L)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        long jE5 = U0.f.e((Float.floatToRawIntBits(RangesKt.j(Float.intBitsToFloat(i10) + 400.0f, Float.intBitsToFloat((int) (drawWithContent.b() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i12)) << 32));
        int i16 = (int) (jE5 >> 32);
        int i17 = (int) (jE5 & 4294967295L);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i16)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i17)) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i16)) << 32) | (Float.floatToRawIntBits(RangesKt.e(Float.intBitsToFloat(i17) - 70.0f, 0.0f)) & 4294967295L)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        X0.f.O0(drawWithContent, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.f.e((Float.floatToRawIntBits(RangesKt.j(Float.intBitsToFloat(i16) + 3.0f, Float.intBitsToFloat((int) (drawWithContent.b() >> 32)))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i17)) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i17)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i16) - 70.0f) << 32)), 6.0f, 0, null, 0.0f, null, 0, 496, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
