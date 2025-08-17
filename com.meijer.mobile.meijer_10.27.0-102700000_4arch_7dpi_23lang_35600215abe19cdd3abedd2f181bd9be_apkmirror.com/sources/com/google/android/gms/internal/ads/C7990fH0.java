package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7990fH0 {

    /* renamed from: a, reason: collision with root package name */
    private int f74073a;

    /* renamed from: b, reason: collision with root package name */
    private int f74074b;

    /* renamed from: c, reason: collision with root package name */
    private int f74075c = 0;

    /* renamed from: d, reason: collision with root package name */
    private YG0[] f74076d = new YG0[100];

    public C7990fH0(boolean z10, int i10) {
    }

    public final synchronized int a() {
        return this.f74074b * 65536;
    }

    public final synchronized YG0 b() {
        YG0 yg0;
        try {
            this.f74074b++;
            int i10 = this.f74075c;
            if (i10 > 0) {
                YG0[] yg0Arr = this.f74076d;
                int i11 = i10 - 1;
                this.f74075c = i11;
                yg0 = yg0Arr[i11];
                if (yg0 == null) {
                    throw null;
                }
                yg0Arr[i11] = null;
            } else {
                yg0 = new YG0(new byte[65536], 0);
                int i12 = this.f74074b;
                YG0[] yg0Arr2 = this.f74076d;
                int length = yg0Arr2.length;
                if (i12 > length) {
                    this.f74076d = (YG0[]) Arrays.copyOf(yg0Arr2, length + length);
                    return yg0;
                }
            }
            return yg0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(YG0 yg0) {
        YG0[] yg0Arr = this.f74076d;
        int i10 = this.f74075c;
        this.f74075c = i10 + 1;
        yg0Arr[i10] = yg0;
        this.f74074b--;
        notifyAll();
    }

    public final synchronized void d(ZG0 zg0) {
        while (zg0 != null) {
            try {
                YG0[] yg0Arr = this.f74076d;
                int i10 = this.f74075c;
                this.f74075c = i10 + 1;
                yg0Arr[i10] = zg0.zzc();
                this.f74074b--;
                zg0 = zg0.zzd();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i10) {
        int i11 = this.f74073a;
        this.f74073a = i10;
        if (i10 < i11) {
            g();
        }
    }

    public final synchronized void g() {
        int i10 = this.f74073a;
        int i11 = OV.f69091a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f74074b);
        int i12 = this.f74075c;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f74076d, iMax, i12, (Object) null);
        this.f74075c = iMax;
    }
}
