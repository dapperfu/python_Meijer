package j0;

import androidx.compose.foundation.layout.AbstractC5667m;
import androidx.compose.ui.layout.f0;
import com.google.android.gms.common.api.a;
import java.util.List;
import k0.C15086a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lj0/F;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Landroidx/compose/ui/layout/K;", "measureScope", "", "Landroidx/compose/ui/layout/I;", "measurables", "", "Landroidx/compose/ui/layout/f0;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Landroidx/compose/ui/layout/J;", "a", "(Lj0/F;IIIIILandroidx/compose/ui/layout/K;Ljava/util/List;[Landroidx/compose/ui/layout/f0;II[II)Landroidx/compose/ui/layout/J;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14798G {
    public static final androidx.compose.ui.layout.J a(InterfaceC14797F interfaceC14797F, int i10, int i11, int i12, int i13, int i14, androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, f0[] f0VarArr, int i15, int i16, int[] iArr, int i17) {
        int i18;
        char c10;
        char c11;
        int i19;
        int iMax;
        int iMax2;
        InterfaceC14797F interfaceC14797F2;
        int i20;
        long j10;
        int i21;
        int i22 = i13;
        long j11 = i14;
        int i23 = i16 - i15;
        int[] iArr2 = new int[i23];
        int i24 = 0;
        int i25 = i15;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        float f10 = 0.0f;
        while (true) {
            int i31 = a.e.API_PRIORITY_OTHER;
            int i32 = 1;
            if (i25 >= i16) {
                break;
            }
            androidx.compose.ui.layout.I i33 = list.get(i25);
            RowColumnParentData rowColumnParentDataC = C14796E.c(i33);
            float fE = C14796E.e(rowColumnParentDataC);
            if (i28 == 0 && !C14796E.f(rowColumnParentDataC)) {
                i32 = i24;
            }
            if (fE > 0.0f) {
                f10 += fE;
                i29++;
                i20 = i25;
                j10 = j11;
            } else {
                if (i22 != Integer.MAX_VALUE && rowColumnParentDataC != null) {
                    rowColumnParentDataC.c();
                }
                int i34 = i12 - i30;
                f0 f0VarK0 = f0VarArr[i25];
                if (f0VarK0 == null) {
                    if (i12 != Integer.MAX_VALUE) {
                        i31 = i34 < 0 ? i24 : i34;
                    }
                    i20 = i25;
                    interfaceC14797F2 = interfaceC14797F;
                    j10 = j11;
                    i21 = i27;
                    f0VarK0 = i33.k0(InterfaceC14797F.l(interfaceC14797F2, 0, 0, i31, i22, false, 16, null));
                } else {
                    interfaceC14797F2 = interfaceC14797F;
                    i20 = i25;
                    j10 = j11;
                    i21 = i27;
                }
                int iH = interfaceC14797F2.h(f0VarK0);
                int iK = interfaceC14797F2.k(f0VarK0);
                iArr2[i20 - i15] = iH;
                int i35 = i34 - iH;
                if (i35 < 0) {
                    i35 = 0;
                }
                int iMin = Math.min(i14, i35);
                i30 += iH + iMin;
                int iMax3 = Math.max(i21, iK);
                f0VarArr[i20] = f0VarK0;
                i27 = iMax3;
                i26 = iMin;
            }
            i25 = i20 + 1;
            i28 = i32;
            j11 = j10;
            i24 = 0;
        }
        InterfaceC14797F interfaceC14797F3 = interfaceC14797F;
        long j12 = j11;
        int i36 = i27;
        if (i29 == 0) {
            i30 -= i26;
            i18 = 0;
        } else {
            long j13 = j12 * (i29 - 1);
            long jRound = ((i12 != Integer.MAX_VALUE ? i12 : i10) - i30) - j13;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i37 = i15; i37 < i16; i37++) {
                jRound -= Math.round(C14796E.e(C14796E.c(list.get(i37))) * f11);
            }
            int i38 = i15;
            int i39 = 0;
            while (i38 < i16) {
                if (f0VarArr[i38] == null) {
                    androidx.compose.ui.layout.I i40 = list.get(i38);
                    RowColumnParentData rowColumnParentDataC2 = C14796E.c(i40);
                    float fE2 = C14796E.e(rowColumnParentDataC2);
                    if (i22 != Integer.MAX_VALUE && rowColumnParentDataC2 != null) {
                        rowColumnParentDataC2.c();
                    }
                    if (!(fE2 > 0.0f)) {
                        C15086a.b("All weights <= 0 should have placeables");
                    }
                    int iB = MathKt.b(jRound);
                    long j14 = jRound - iB;
                    int iMax4 = Math.max(0, Math.round(fE2 * f11) + iB);
                    if (C14796E.b(rowColumnParentDataC2)) {
                        c10 = 65535;
                        if (iMax4 != Integer.MAX_VALUE) {
                            c11 = 65535;
                            i19 = iMax4;
                        }
                        interfaceC14797F3 = interfaceC14797F;
                        f0 f0VarK02 = i40.k0(interfaceC14797F3.a(i19, 0, iMax4, i22, true));
                        int iH2 = interfaceC14797F3.h(f0VarK02);
                        int iK2 = interfaceC14797F3.k(f0VarK02);
                        iArr2[i38 - i15] = iH2;
                        i39 += iH2;
                        int iMax5 = Math.max(i36, iK2);
                        f0VarArr[i38] = f0VarK02;
                        i36 = iMax5;
                        jRound = j14;
                    } else {
                        c10 = 65535;
                    }
                    c11 = c10;
                    i19 = 0;
                    interfaceC14797F3 = interfaceC14797F;
                    f0 f0VarK022 = i40.k0(interfaceC14797F3.a(i19, 0, iMax4, i22, true));
                    int iH22 = interfaceC14797F3.h(f0VarK022);
                    int iK22 = interfaceC14797F3.k(f0VarK022);
                    iArr2[i38 - i15] = iH22;
                    i39 += iH22;
                    int iMax52 = Math.max(i36, iK22);
                    f0VarArr[i38] = f0VarK022;
                    i36 = iMax52;
                    jRound = j14;
                }
                i38++;
                i22 = i13;
            }
            i18 = (int) (i39 + j13);
            int i41 = i12 - i30;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i41) {
                i18 = i41;
            }
        }
        int i42 = i36;
        if (i28 != 0) {
            iMax = 0;
            iMax2 = 0;
            for (int i43 = i15; i43 < i16; i43++) {
                f0 f0Var = f0VarArr[i43];
                Intrinsics.g(f0Var);
                AbstractC5667m abstractC5667mA = C14796E.a(C14796E.d(f0Var));
                Integer numB = abstractC5667mA != null ? abstractC5667mA.b(f0Var) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iK3 = interfaceC14797F3.k(f0Var);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iK3;
                    }
                    iMax2 = Math.max(iMax2, iK3 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i44 = i30 + i18;
        if (i44 < 0) {
            i44 = 0;
        }
        int iMax6 = Math.max(i44, i10);
        int iMax7 = Math.max(i42, Math.max(i11, iMax2 + iMax));
        int[] iArr3 = new int[i23];
        interfaceC14797F3.c(iMax6, iArr2, iArr3, k10);
        return interfaceC14797F3.f(f0VarArr, k10, iMax, iArr3, iMax6, iMax7, iArr, i17, i15, i16);
    }
}
