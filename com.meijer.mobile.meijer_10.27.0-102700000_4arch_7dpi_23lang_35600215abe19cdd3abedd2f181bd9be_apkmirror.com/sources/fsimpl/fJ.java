package fsimpl;

/* loaded from: classes14.dex */
class fJ {
    public static int a(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >> 16);
    }

    public static int a(int i10, float f10) {
        long jMax = Math.max(2L, a((long) Math.ceil(i10 / f10)));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        throw new IllegalArgumentException("Too large (" + i10 + " expected elements with load factor " + f10 + ")");
    }

    public static long a(long j10) {
        if (j10 == 0) {
            return 1L;
        }
        long j11 = j10 - 1;
        long j12 = j11 | (j11 >> 1);
        long j13 = j12 | (j12 >> 2);
        long j14 = j13 | (j13 >> 4);
        long j15 = j14 | (j14 >> 8);
        long j16 = j15 | (j15 >> 16);
        return (j16 | (j16 >> 32)) + 1;
    }
}
