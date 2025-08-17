package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class XL {

    /* renamed from: a, reason: collision with root package name */
    private int f71317a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f71318b;

    public final int a() {
        return this.f71317a;
    }

    public final long b(int i10) {
        if (i10 >= 0 && i10 < this.f71317a) {
            return this.f71318b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f71317a);
    }

    public final void c(long j10) {
        int i10 = this.f71317a;
        long[] jArr = this.f71318b;
        if (i10 == jArr.length) {
            this.f71318b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f71318b;
        int i11 = this.f71317a;
        this.f71317a = i11 + 1;
        jArr2[i11] = j10;
    }

    public final void d(long[] jArr) {
        int i10 = this.f71317a;
        int length = jArr.length;
        int i11 = i10 + length;
        long[] jArr2 = this.f71318b;
        int length2 = jArr2.length;
        if (i11 > length2) {
            this.f71318b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i11));
        }
        System.arraycopy(jArr, 0, this.f71318b, this.f71317a, length);
        this.f71317a = i11;
    }

    public XL(int i10) {
        this.f71318b = new long[i10];
    }
}
