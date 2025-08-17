package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes6.dex */
public final class WF0 {

    /* renamed from: a, reason: collision with root package name */
    private final Random f71044a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f71045b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f71046c;

    public WF0(int i10) {
        this(0, new Random());
    }

    public final int c() {
        return this.f71045b.length;
    }

    private WF0(int i10, Random random) {
        this(new int[0], random);
    }

    public final int a() {
        int[] iArr = this.f71045b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = this.f71045b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int d(int i10) {
        int i11 = this.f71046c[i10] + 1;
        int[] iArr = this.f71045b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int e(int i10) {
        int i11 = this.f71046c[i10] - 1;
        if (i11 >= 0) {
            return this.f71045b[i11];
        }
        return -1;
    }

    public final WF0 f() {
        return new WF0(0, new Random(this.f71044a.nextLong()));
    }

    public final WF0 g(int i10, int i11) {
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            iArr[i13] = this.f71044a.nextInt(this.f71045b.length + 1);
            int i14 = i13 + 1;
            int iNextInt = this.f71044a.nextInt(i14);
            iArr2[i13] = iArr2[iNextInt];
            iArr2[iNextInt] = i13;
            i13 = i14;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f71045b.length + i11];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr4 = this.f71045b;
            if (i12 >= iArr4.length + i11) {
                return new WF0(iArr3, new Random(this.f71044a.nextLong()));
            }
            if (i15 >= i11 || i16 != iArr[i15]) {
                int i17 = i16 + 1;
                int i18 = iArr4[i16];
                iArr3[i12] = i18;
                if (i18 >= 0) {
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

    public final WF0 h(int i10, int i11) {
        int[] iArr = new int[this.f71045b.length - i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f71045b;
            if (i12 >= iArr2.length) {
                return new WF0(iArr, new Random(this.f71044a.nextLong()));
            }
            int i14 = iArr2[i12];
            if (i14 < 0 || i14 >= i11) {
                int i15 = i12 - i13;
                if (i14 >= 0) {
                    i14 -= i11;
                }
                iArr[i15] = i14;
            } else {
                i13++;
            }
            i12++;
        }
    }

    private WF0(int[] iArr, Random random) {
        this.f71045b = iArr;
        this.f71044a = random;
        this.f71046c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f71046c[iArr[i10]] = i10;
        }
    }
}
