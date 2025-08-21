package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public int f68580a;

    /* renamed from: b, reason: collision with root package name */
    public String f68581b;

    /* renamed from: c, reason: collision with root package name */
    public int f68582c;

    /* renamed from: d, reason: collision with root package name */
    public int f68583d;

    /* renamed from: e, reason: collision with root package name */
    public int f68584e;

    /* renamed from: f, reason: collision with root package name */
    public int f68585f;

    /* renamed from: g, reason: collision with root package name */
    public int f68586g;

    public J0() {
    }

    public J0(J0 j02) {
        this.f68580a = j02.f68580a;
        this.f68581b = j02.f68581b;
        this.f68582c = j02.f68582c;
        this.f68583d = j02.f68583d;
        this.f68584e = j02.f68584e;
        this.f68585f = j02.f68585f;
        this.f68586g = j02.f68586g;
    }

    public final boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (K0.m(i10) && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0 && (i13 = (i10 >>> 12) & 15) != 0 && i13 != 15 && (i14 = (i10 >>> 10) & 3) != 3) {
            int i17 = i13 - 1;
            this.f68580a = i11;
            this.f68581b = K0.f68842a[3 - i12];
            int i18 = K0.f68843b[i14];
            this.f68583d = i18;
            int i19 = 2;
            if (i11 == 2) {
                i18 /= 2;
                this.f68583d = i18;
            } else if (i11 == 0) {
                i18 /= 4;
                this.f68583d = i18;
            }
            int i20 = (i10 >>> 9) & 1;
            this.f68586g = K0.l(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = K0.f68844c[i17];
                } else {
                    i16 = K0.f68845d[i17];
                }
                this.f68585f = i16;
                this.f68582c = (((i16 * 12) / i18) + i20) * 4;
            } else {
                int i21 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = K0.f68846e[i17];
                    } else {
                        i15 = K0.f68847f[i17];
                    }
                    this.f68585f = i15;
                    this.f68582c = ((i15 * 144) / i18) + i20;
                } else {
                    int i22 = K0.f68848g[i17];
                    this.f68585f = i22;
                    if (i12 == 1) {
                        i21 = 72;
                    }
                    this.f68582c = ((i21 * i22) / i18) + i20;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i19 = 1;
            }
            this.f68584e = i19;
            return true;
        }
        return false;
    }
}
