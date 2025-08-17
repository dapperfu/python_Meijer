package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class RG0 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f69845a;

    /* renamed from: b, reason: collision with root package name */
    private final C7775dG0[] f69846b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f69847c;

    /* renamed from: d, reason: collision with root package name */
    private final int[][][] f69848d;

    /* renamed from: e, reason: collision with root package name */
    private final C7775dG0 f69849e;

    RG0(String[] strArr, int[] iArr, C7775dG0[] c7775dG0Arr, int[] iArr2, int[][][] iArr3, C7775dG0 c7775dG0) {
        this.f69845a = iArr;
        this.f69846b = c7775dG0Arr;
        this.f69848d = iArr3;
        this.f69847c = iArr2;
        this.f69849e = c7775dG0;
    }

    public final C7775dG0 e() {
        return this.f69849e;
    }

    public final int a(int i10, int i11, boolean z10) {
        int i12 = this.f69846b[i10].b(i11).f79121a;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f69848d[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int i16 = 0;
        int iMin = 16;
        boolean z11 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.f69846b[i10].b(i11).b(iArrCopyOf[i13]).f65664o;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f69848d[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(iMin, this.f69847c[i10]) : iMin;
    }

    public final int b(int i10, int i11, int i12) {
        return this.f69848d[i10][i11][i12];
    }

    public final int c(int i10) {
        return this.f69845a[i10];
    }

    public final C7775dG0 d(int i10) {
        return this.f69846b[i10];
    }
}
