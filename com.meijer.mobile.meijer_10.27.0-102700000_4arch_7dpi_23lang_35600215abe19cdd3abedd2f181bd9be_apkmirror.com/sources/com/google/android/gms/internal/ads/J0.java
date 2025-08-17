package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public int f67740a;

    /* renamed from: b, reason: collision with root package name */
    public String f67741b;

    /* renamed from: c, reason: collision with root package name */
    public int f67742c;

    /* renamed from: d, reason: collision with root package name */
    public int f67743d;

    /* renamed from: e, reason: collision with root package name */
    public int f67744e;

    /* renamed from: f, reason: collision with root package name */
    public int f67745f;

    /* renamed from: g, reason: collision with root package name */
    public int f67746g;

    public J0() {
    }

    public J0(J0 j02) {
        this.f67740a = j02.f67740a;
        this.f67741b = j02.f67741b;
        this.f67742c = j02.f67742c;
        this.f67743d = j02.f67743d;
        this.f67744e = j02.f67744e;
        this.f67745f = j02.f67745f;
        this.f67746g = j02.f67746g;
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
            this.f67740a = i11;
            this.f67741b = K0.f68002a[3 - i12];
            int i18 = K0.f68003b[i14];
            this.f67743d = i18;
            int i19 = 2;
            if (i11 == 2) {
                i18 /= 2;
                this.f67743d = i18;
            } else if (i11 == 0) {
                i18 /= 4;
                this.f67743d = i18;
            }
            int i20 = (i10 >>> 9) & 1;
            this.f67746g = K0.l(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = K0.f68004c[i17];
                } else {
                    i16 = K0.f68005d[i17];
                }
                this.f67745f = i16;
                this.f67742c = (((i16 * 12) / i18) + i20) * 4;
            } else {
                int i21 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = K0.f68006e[i17];
                    } else {
                        i15 = K0.f68007f[i17];
                    }
                    this.f67745f = i15;
                    this.f67742c = ((i15 * 144) / i18) + i20;
                } else {
                    int i22 = K0.f68008g[i17];
                    this.f67745f = i22;
                    if (i12 == 1) {
                        i21 = 72;
                    }
                    this.f67742c = ((i21 * i22) / i18) + i20;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i19 = 1;
            }
            this.f67744e = i19;
            return true;
        }
        return false;
    }
}
