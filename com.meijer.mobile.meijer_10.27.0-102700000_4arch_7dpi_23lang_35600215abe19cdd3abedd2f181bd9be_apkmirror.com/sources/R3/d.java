package R3;

import d3.P;

/* loaded from: classes4.dex */
final class d {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f31695a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f31696b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31697c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f31698d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f31699e;

        /* renamed from: f, reason: collision with root package name */
        public final long f31700f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f31695a = jArr;
            this.f31696b = iArr;
            this.f31697c = i10;
            this.f31698d = jArr2;
            this.f31699e = iArr2;
            this.f31700f = j10;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iJ = 0;
        for (int i12 : iArr) {
            iJ += P.j(i12, i11);
        }
        long[] jArr2 = new long[iJ];
        int[] iArr2 = new int[iJ];
        long[] jArr3 = new long[iJ];
        int[] iArr3 = new int[iJ];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = i13 * j10;
                iArr3[i14] = 1;
                j11 += iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * i13);
    }
}
