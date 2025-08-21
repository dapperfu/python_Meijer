package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class RG0 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f70685a;

    /* renamed from: b, reason: collision with root package name */
    private final C7900dG0[] f70686b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f70687c;

    /* renamed from: d, reason: collision with root package name */
    private final int[][][] f70688d;

    /* renamed from: e, reason: collision with root package name */
    private final C7900dG0 f70689e;

    RG0(String[] strArr, int[] iArr, C7900dG0[] c7900dG0Arr, int[] iArr2, int[][][] iArr3, C7900dG0 c7900dG0) {
        this.f70685a = iArr;
        this.f70686b = c7900dG0Arr;
        this.f70688d = iArr3;
        this.f70687c = iArr2;
        this.f70689e = c7900dG0;
    }

    public final C7900dG0 e() {
        return this.f70689e;
    }

    public final int a(int i10, int i11, boolean z10) {
        int i12 = this.f70686b[i10].b(i11).f79961a;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f70688d[i10][i11][i15] & 7) == 4) {
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
            String str2 = this.f70686b[i10].b(i11).b(iArrCopyOf[i13]).f66504o;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f70688d[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(iMin, this.f70687c[i10]) : iMin;
    }

    public final int b(int i10, int i11, int i12) {
        return this.f70688d[i10][i11][i12];
    }

    public final int c(int i10) {
        return this.f70685a[i10];
    }

    public final C7900dG0 d(int i10) {
        return this.f70686b[i10];
    }
}
