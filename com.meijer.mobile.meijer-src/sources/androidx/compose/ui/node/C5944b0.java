package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aZ\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/q;", "cb", "Landroidx/compose/ui/node/z;", "d", "(IILandroidx/compose/ui/node/q;)Landroidx/compose/ui/node/z;", "diagonals", "callback", "", "b", "(Landroidx/compose/ui/node/z;Landroidx/compose/ui/node/q;)V", "e", "(IILandroidx/compose/ui/node/q;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/f;", "forward", "backward", "", "snake", "", "h", "(IIIILandroidx/compose/ui/node/q;[I[I[I)Z", "g", "(IIIILandroidx/compose/ui/node/q;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "(IIIIZ[I)V", "i", "j", "([III)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5944b0 {
    private static final void b(C5971z c5971z, InterfaceC5963q interfaceC5963q) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c5971z.getLastIndex()) {
            int i13 = i10 + 2;
            int iB = c5971z.b(i10) - c5971z.b(i13);
            int iB2 = c5971z.b(i10 + 1) - c5971z.b(i13);
            int iB3 = c5971z.b(i13);
            i10 += 3;
            while (i11 < iB) {
                interfaceC5963q.remove(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                interfaceC5963q.b(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC5963q.c(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    private static final boolean c(int i10, int i11, int i12, int i13, InterfaceC5963q interfaceC5963q, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = (i17 & 1) == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && C5951f.b(iArr2, i19 + 1) < C5951f.b(iArr2, i19 - 1))) {
                iB = C5951f.b(iArr2, i19 + 1);
                i15 = iB;
            } else {
                iB = C5951f.b(iArr2, i19 - 1);
                i15 = iB - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = ((i14 != 0 ? 1 : 0) & (i15 == iB ? 1 : 0)) + i20;
            while (i15 > i10 && i20 > i12) {
                if (!interfaceC5963q.a(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            C5951f.d(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (C5951f.b(iArr, i16) >= i15) {
                    f(i15, i20, iB, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final C5971z d(int i10, int i11, InterfaceC5963q interfaceC5963q) {
        char c10 = 1;
        int i12 = ((i10 + i11) + 1) / 2;
        C5971z c5971z = new C5971z(i12 * 3);
        C5971z c5971z2 = new C5971z(i12 * 4);
        c5971z2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrA = C5951f.a(new int[i13]);
        int[] iArrA2 = C5951f.a(new int[i13]);
        int[] iArrB = w0.b(new int[5]);
        while (c5971z2.d()) {
            int iF = c5971z2.f();
            int iF2 = c5971z2.f();
            int iF3 = c5971z2.f();
            int iF4 = c5971z2.f();
            int[] iArr = iArrB;
            if (h(iF4, iF3, iF2, iF, interfaceC5963q, iArrA, iArrA2, iArrB)) {
                char c11 = c10;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c10]) > 0) {
                    w0.a(iArr, c5971z);
                }
                c5971z2.h(iF4, iArr[0], iF2, iArr[c11]);
                c5971z2.h(iArr[2], iF3, iArr[3], iF);
                iArrB = iArr;
                c10 = c11;
            } else {
                iArrB = iArr;
            }
        }
        c5971z.k();
        c5971z.g(i10, i11, 0);
        return c5971z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    private static final boolean g(int i10, int i11, int i12, int i13, InterfaceC5963q interfaceC5963q, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        ?? r16;
        int i16 = (i11 - i10) - (i13 - i12);
        int i17 = 1;
        boolean z10 = (Math.abs(i16) & 1) == 1;
        int i18 = -i14;
        int i19 = i18;
        while (i19 <= i14) {
            if (i19 == i18 || (i19 != i14 && C5951f.b(iArr, i19 + 1) > C5951f.b(iArr, i19 - 1))) {
                iB = C5951f.b(iArr, i19 + 1);
                i15 = iB;
            } else {
                iB = C5951f.b(iArr, i19 - 1);
                i15 = iB + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = i20 - ((i14 != 0 ? i17 : 0) & (i15 == iB ? i17 : 0));
            while (i15 < i11 && i20 < i13) {
                if (!interfaceC5963q.a(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            C5951f.d(iArr, i19, i15);
            if (z10) {
                int i22 = i16 - i19;
                r16 = i17;
                r16 = r16;
                if (i22 >= i18 + 1) {
                    r16 = r16;
                    if (i22 <= i14 - 1) {
                        if (C5951f.b(iArr2, i22) <= i15) {
                            f(iB, i21, i15, i20, false, iArr3);
                            return r16;
                        }
                    }
                }
                i19 += 2;
                i17 = r16;
            } else {
                r16 = i17;
            }
            i19 += 2;
            i17 = r16;
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, InterfaceC5963q interfaceC5963q, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            C5951f.d(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            C5951f.d(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (g(i10, i11, i12, i13, interfaceC5963q, iArr4, iArr5, i17, iArr3) || c(i10, i11, i12, i13, interfaceC5963q, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    public static final void e(int i10, int i11, InterfaceC5963q interfaceC5963q) {
        b(d(i10, i11, interfaceC5963q), interfaceC5963q);
    }
}
