package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class MT {

    /* renamed from: a, reason: collision with root package name */
    private long[] f68650a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private Object[] f68651b = new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f68652c;

    /* renamed from: d, reason: collision with root package name */
    private int f68653d;

    public MT(int i10) {
    }

    public final synchronized int a() {
        return this.f68653d;
    }

    public final synchronized Object b() {
        if (this.f68653d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j10) {
        Object objF;
        objF = null;
        while (this.f68653d > 0 && j10 - this.f68650a[this.f68652c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j10, Object obj) {
        try {
            if (this.f68653d > 0) {
                if (j10 <= this.f68650a[((this.f68652c + r0) - 1) % this.f68651b.length]) {
                    e();
                }
            }
            int length = this.f68651b.length;
            if (this.f68653d >= length) {
                int i10 = length + length;
                long[] jArr = new long[i10];
                Object[] objArr = new Object[i10];
                int i11 = this.f68652c;
                int i12 = length - i11;
                System.arraycopy(this.f68650a, i11, jArr, 0, i12);
                System.arraycopy(this.f68651b, this.f68652c, objArr, 0, i12);
                int i13 = this.f68652c;
                if (i13 > 0) {
                    System.arraycopy(this.f68650a, 0, jArr, i12, i13);
                    System.arraycopy(this.f68651b, 0, objArr, i12, this.f68652c);
                }
                this.f68650a = jArr;
                this.f68651b = objArr;
                this.f68652c = 0;
            }
            int i14 = this.f68652c;
            int i15 = this.f68653d;
            Object[] objArr2 = this.f68651b;
            int length2 = (i14 + i15) % objArr2.length;
            this.f68650a[length2] = j10;
            objArr2[length2] = obj;
            this.f68653d = i15 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f68652c = 0;
        this.f68653d = 0;
        Arrays.fill(this.f68651b, (Object) null);
    }

    private final Object f() {
        C8086gC.f(this.f68653d > 0);
        Object[] objArr = this.f68651b;
        int i10 = this.f68652c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f68652c = (i10 + 1) % objArr.length;
        this.f68653d--;
        return obj;
    }
}
