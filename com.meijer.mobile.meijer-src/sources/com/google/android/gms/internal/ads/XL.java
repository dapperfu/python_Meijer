package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class XL {

    /* renamed from: a, reason: collision with root package name */
    private int f72157a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f72158b;

    public final int a() {
        return this.f72157a;
    }

    public final long b(int i10) {
        if (i10 >= 0 && i10 < this.f72157a) {
            return this.f72158b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f72157a);
    }

    public final void c(long j10) {
        int i10 = this.f72157a;
        long[] jArr = this.f72158b;
        if (i10 == jArr.length) {
            this.f72158b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f72158b;
        int i11 = this.f72157a;
        this.f72157a = i11 + 1;
        jArr2[i11] = j10;
    }

    public final void d(long[] jArr) {
        int i10 = this.f72157a;
        int length = jArr.length;
        int i11 = i10 + length;
        long[] jArr2 = this.f72158b;
        int length2 = jArr2.length;
        if (i11 > length2) {
            this.f72158b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i11));
        }
        System.arraycopy(jArr, 0, this.f72158b, this.f72157a, length);
        this.f72157a = i11;
    }

    public XL(int i10) {
        this.f72158b = new long[i10];
    }
}
