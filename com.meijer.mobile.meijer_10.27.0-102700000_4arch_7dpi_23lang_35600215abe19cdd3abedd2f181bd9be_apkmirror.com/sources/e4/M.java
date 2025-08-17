package e4;

/* loaded from: classes4.dex */
public final class M {
    public static boolean b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }

    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long c(d3.D d10, int i10, int i11) {
        d10.W(i10);
        if (d10.a() < 5) {
            return -9223372036854775807L;
        }
        int iQ = d10.q();
        if ((8388608 & iQ) != 0 || ((2096896 & iQ) >> 8) != i11 || (iQ & 32) == 0 || d10.H() < 7 || d10.a() < 7 || (d10.H() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        d10.l(bArr, 0, 6);
        return d(bArr);
    }
}
