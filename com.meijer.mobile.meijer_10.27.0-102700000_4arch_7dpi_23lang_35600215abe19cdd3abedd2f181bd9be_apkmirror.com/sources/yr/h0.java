package yr;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001ac\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "starsRating", "LH1/h;", "iconSize", "LJi/T;", "colors", "", "filledStarContentDescription", "unfilledStarContentDescription", "halfFilledStarContentDescription", "", "maxStars", "", "c", "(LJi/M;Landroidx/compose/ui/Modifier;DFLJi/T;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;II)V", "rating", "f", "(D)D", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class h0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02dd A[LOOP:0: B:146:0x0216->B:181:0x02dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e4 A[EDGE_INSN: B:191:0x02e4->B:183:0x02e4 BREAK  A[LOOP:0: B:146:0x0216->B:181:0x02dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final double r35, float r37, Ji.T r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.h0.c(Ji.M, androidx.compose.ui.Modifier, double, float, Ji.T, java.lang.String, java.lang.String, java.lang.String, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit d(Ref.ObjectRef objectRef, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, (String) objectRef.f142835a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, double d10, float f10, Ji.T t10, String str, String str2, String str3, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, d10, f10, t10, str, str2, str3, i10, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    public static final double f(double d10) {
        double dRound = Math.round(d10 * 10) / 10.0d;
        int i10 = (int) dRound;
        double d11 = dRound % 1.0d;
        return d11 <= 0.3d ? i10 : d11 <= 0.6d ? i10 + 0.5d : i10 + 1.0d;
    }
}
