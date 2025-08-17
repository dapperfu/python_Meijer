package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9884x3 {

    /* renamed from: a, reason: collision with root package name */
    public final X0 f79646a;

    /* renamed from: d, reason: collision with root package name */
    public N3 f79649d;

    /* renamed from: e, reason: collision with root package name */
    public C9456t3 f79650e;

    /* renamed from: f, reason: collision with root package name */
    public int f79651f;

    /* renamed from: g, reason: collision with root package name */
    public int f79652g;

    /* renamed from: h, reason: collision with root package name */
    public int f79653h;

    /* renamed from: i, reason: collision with root package name */
    public int f79654i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f79657l;

    /* renamed from: b, reason: collision with root package name */
    public final M3 f79647b = new M3();

    /* renamed from: c, reason: collision with root package name */
    public final GQ f79648c = new GQ();

    /* renamed from: j, reason: collision with root package name */
    private final GQ f79655j = new GQ(1);

    /* renamed from: k, reason: collision with root package name */
    private final GQ f79656k = new GQ();

    public final void i() {
        M3 m32 = this.f79647b;
        m32.f68490d = 0;
        m32.f68502p = 0L;
        m32.f68503q = false;
        m32.f68497k = false;
        m32.f68501o = false;
        m32.f68499m = null;
        this.f79651f = 0;
        this.f79653h = 0;
        this.f79652g = 0;
        this.f79654i = 0;
        this.f79657l = false;
    }

    public final int a() {
        int i10 = !this.f79657l ? this.f79649d.f68800g[this.f79651f] : this.f79647b.f68496j[this.f79651f] ? 1 : 0;
        return f() != null ? i10 | 1073741824 : i10;
    }

    public final int b() {
        return !this.f79657l ? this.f79649d.f68797d[this.f79651f] : this.f79647b.f68494h[this.f79651f];
    }

    public final long d() {
        return !this.f79657l ? this.f79649d.f68796c[this.f79651f] : this.f79647b.f68492f[this.f79653h];
    }

    public final long e() {
        if (!this.f79657l) {
            return this.f79649d.f68799f[this.f79651f];
        }
        M3 m32 = this.f79647b;
        return m32.f68495i[this.f79651f];
    }

    public final L3 f() {
        if (!this.f79657l) {
            return null;
        }
        M3 m32 = this.f79647b;
        C9456t3 c9456t3 = m32.f68487a;
        int i10 = OV.f69091a;
        int i11 = c9456t3.f78471a;
        L3 l3B = m32.f68499m;
        if (l3B == null) {
            l3B = this.f79649d.f68794a.b(i11);
        }
        if (l3B == null || !l3B.f68247a) {
            return null;
        }
        return l3B;
    }

    public final void h(N3 n32, C9456t3 c9456t3) {
        this.f79649d = n32;
        this.f79650e = c9456t3;
        this.f79646a.d(n32.f68794a.f68024g);
        i();
    }

    public final boolean k() {
        this.f79651f++;
        if (!this.f79657l) {
            return false;
        }
        int i10 = this.f79652g + 1;
        this.f79652g = i10;
        int[] iArr = this.f79647b.f68493g;
        int i11 = this.f79653h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f79653h = i11 + 1;
        this.f79652g = 0;
        return false;
    }

    public C9884x3(X0 x02, N3 n32, C9456t3 c9456t3) {
        this.f79646a = x02;
        this.f79649d = n32;
        this.f79650e = c9456t3;
        h(n32, c9456t3);
    }

    public final int c(int i10, int i11) {
        GQ gq2;
        boolean z10;
        int i12;
        L3 l3F = f();
        if (l3F == null) {
            return 0;
        }
        int i13 = l3F.f68250d;
        if (i13 != 0) {
            gq2 = this.f79647b.f68500n;
        } else {
            byte[] bArr = l3F.f68251e;
            int i14 = OV.f69091a;
            GQ gq3 = this.f79656k;
            int length = bArr.length;
            gq3.j(bArr, length);
            gq2 = this.f79656k;
            i13 = length;
        }
        boolean zB = this.f79647b.b(this.f79651f);
        if (zB || i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        GQ gq4 = this.f79655j;
        if (true != z10) {
            i12 = 0;
        } else {
            i12 = 128;
        }
        gq4.n()[0] = (byte) (i12 | i13);
        gq4.l(0);
        this.f79646a.g(this.f79655j, 1, 1);
        this.f79646a.g(gq2, i13, 1);
        if (!z10) {
            return i13 + 1;
        }
        if (!zB) {
            this.f79648c.i(8);
            GQ gq5 = this.f79648c;
            byte[] bArrN = gq5.n();
            bArrN[0] = 0;
            bArrN[1] = 1;
            bArrN[2] = 0;
            bArrN[3] = (byte) i11;
            bArrN[4] = (byte) ((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f92484c);
            bArrN[5] = (byte) ((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f92484c);
            bArrN[6] = (byte) ((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f92484c);
            bArrN[7] = (byte) (i10 & com.medallia.digital.mobilesdk.l3.f92484c);
            this.f79646a.g(gq5, 8, 1);
            return i13 + 9;
        }
        int i15 = i13 + 1;
        GQ gq6 = this.f79647b.f68500n;
        int iG = gq6.G();
        gq6.m(-2);
        int i16 = (iG * 6) + 2;
        if (i11 != 0) {
            this.f79648c.i(i16);
            byte[] bArrN2 = this.f79648c.n();
            gq6.h(bArrN2, 0, i16);
            int i17 = (((bArrN2[2] & 255) << 8) | (bArrN2[3] & 255)) + i11;
            bArrN2[2] = (byte) ((i17 >> 8) & com.medallia.digital.mobilesdk.l3.f92484c);
            bArrN2[3] = (byte) (i17 & com.medallia.digital.mobilesdk.l3.f92484c);
            gq6 = this.f79648c;
        }
        this.f79646a.g(gq6, i16, 1);
        return i15 + i16;
    }
}
