package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class MT {

    /* renamed from: a, reason: collision with root package name */
    private long[] f69490a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private Object[] f69491b = new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f69492c;

    /* renamed from: d, reason: collision with root package name */
    private int f69493d;

    public MT(int i10) {
    }

    public final synchronized int a() {
        return this.f69493d;
    }

    public final synchronized Object b() {
        if (this.f69493d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j10) {
        Object objF;
        objF = null;
        while (this.f69493d > 0 && j10 - this.f69490a[this.f69492c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j10, Object obj) {
        try {
            if (this.f69493d > 0) {
                if (j10 <= this.f69490a[((this.f69492c + r0) - 1) % this.f69491b.length]) {
                    e();
                }
            }
            int length = this.f69491b.length;
            if (this.f69493d >= length) {
                int i10 = length + length;
                long[] jArr = new long[i10];
                Object[] objArr = new Object[i10];
                int i11 = this.f69492c;
                int i12 = length - i11;
                System.arraycopy(this.f69490a, i11, jArr, 0, i12);
                System.arraycopy(this.f69491b, this.f69492c, objArr, 0, i12);
                int i13 = this.f69492c;
                if (i13 > 0) {
                    System.arraycopy(this.f69490a, 0, jArr, i12, i13);
                    System.arraycopy(this.f69491b, 0, objArr, i12, this.f69492c);
                }
                this.f69490a = jArr;
                this.f69491b = objArr;
                this.f69492c = 0;
            }
            int i14 = this.f69492c;
            int i15 = this.f69493d;
            Object[] objArr2 = this.f69491b;
            int length2 = (i14 + i15) % objArr2.length;
            this.f69490a[length2] = j10;
            objArr2[length2] = obj;
            this.f69493d = i15 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f69492c = 0;
        this.f69493d = 0;
        Arrays.fill(this.f69491b, (Object) null);
    }

    private final Object f() {
        C8211gC.f(this.f69493d > 0);
        Object[] objArr = this.f69491b;
        int i10 = this.f69492c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f69492c = (i10 + 1) % objArr.length;
        this.f69493d--;
        return obj;
    }
}
