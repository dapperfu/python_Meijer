package fsimpl;

/* loaded from: classes14.dex */
class go {
    private static char a(int i10) {
        return (char) ((i10 >>> 10) + 55232);
    }

    static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (d(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || d(b12) || d(b13)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int iE = ((b10 & 7) << 18) | (e(b11) << 12) | (e(b12) << 6) | e(b13);
        cArr[i10] = a(iE);
        cArr[i10 + 1] = b(iE);
    }

    static void a(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i10] = (char) (((b10 & C14045dq.MULTIPLY) << 12) | (e(b11) << 6) | e(b12));
    }

    static void a(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (d(b11)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | e(b11));
    }

    static void a(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    static boolean a(byte b10) {
        return b10 >= 0;
    }

    private static char b(int i10) {
        return (char) ((i10 & 1023) + 56320);
    }

    static boolean b(byte b10) {
        return b10 < -32;
    }

    static boolean c(byte b10) {
        return b10 < -16;
    }

    private static boolean d(byte b10) {
        return b10 > -65;
    }

    private static int e(byte b10) {
        return b10 & 63;
    }
}
