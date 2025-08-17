package Ce;

import java.util.Arrays;

/* renamed from: Ce.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3033z {
    static Object a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    static int b(int i10, int i11) {
        return i10 & (~i11);
    }

    static int c(int i10, int i11) {
        return i10 & i11;
    }

    static int d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    static int e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    static void i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    static int j(int i10) {
        return Math.max(4, I.a(i10 + 1, 1.0d));
    }

    static int f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iC = I.c(obj);
        int i13 = iC & i10;
        int iH = h(obj3, i13);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i10);
        int i14 = -1;
        while (true) {
            i11 = iH - 1;
            i12 = iArr[i11];
            if (b(i12, i10) == iB && Be.l.a(obj, objArr[i11]) && (objArr2 == null || Be.l.a(obj2, objArr2[i11]))) {
                break;
            }
            int iC2 = c(i12, i10);
            if (iC2 == 0) {
                return -1;
            }
            i14 = i11;
            iH = iC2;
        }
        int iC3 = c(i12, i10);
        if (i14 == -1) {
            i(obj3, i13, iC3);
            return i11;
        }
        iArr[i14] = d(iArr[i14], iC3, i10);
        return i11;
    }
}
