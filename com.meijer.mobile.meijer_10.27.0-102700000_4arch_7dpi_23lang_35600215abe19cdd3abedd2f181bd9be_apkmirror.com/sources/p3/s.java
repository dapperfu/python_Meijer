package p3;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface s {

    public static class a implements s {

        /* renamed from: a, reason: collision with root package name */
        private final Random f155454a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f155455b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f155456c;

        public a(int i10) {
            this(i10, new Random());
        }

        private a(int i10, Random random) {
            this(h(i10, random), random);
        }

        private static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // p3.s
        public s a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f155455b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f155455b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f155454a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // p3.s
        public int b(int i10) {
            int i11 = this.f155456c[i10] - 1;
            if (i11 >= 0) {
                return this.f155455b[i11];
            }
            return -1;
        }

        @Override // p3.s
        public int c(int i10) {
            int i11 = this.f155456c[i10] + 1;
            int[] iArr = this.f155455b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // p3.s
        public int d() {
            int[] iArr = this.f155455b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p3.s
        public s e() {
            return new a(0, new Random(this.f155454a.nextLong()));
        }

        @Override // p3.s
        public int f() {
            int[] iArr = this.f155455b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p3.s
        public s g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f155454a.nextInt(this.f155455b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f155454a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f155455b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f155455b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f155454a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // p3.s
        public int getLength() {
            return this.f155455b.length;
        }

        private a(int[] iArr, Random random) {
            this.f155455b = iArr;
            this.f155454a = random;
            this.f155456c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f155456c[iArr[i10]] = i10;
            }
        }
    }

    s a(int i10, int i11);

    int b(int i10);

    int c(int i10);

    int d();

    s e();

    int f();

    s g(int i10, int i11);

    int getLength();
}
