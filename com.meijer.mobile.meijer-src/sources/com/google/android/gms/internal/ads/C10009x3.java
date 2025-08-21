package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10009x3 {

    /* renamed from: a, reason: collision with root package name */
    public final X0 f80486a;

    /* renamed from: d, reason: collision with root package name */
    public N3 f80489d;

    /* renamed from: e, reason: collision with root package name */
    public C9581t3 f80490e;

    /* renamed from: f, reason: collision with root package name */
    public int f80491f;

    /* renamed from: g, reason: collision with root package name */
    public int f80492g;

    /* renamed from: h, reason: collision with root package name */
    public int f80493h;

    /* renamed from: i, reason: collision with root package name */
    public int f80494i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f80497l;

    /* renamed from: b, reason: collision with root package name */
    public final M3 f80487b = new M3();

    /* renamed from: c, reason: collision with root package name */
    public final GQ f80488c = new GQ();

    /* renamed from: j, reason: collision with root package name */
    private final GQ f80495j = new GQ(1);

    /* renamed from: k, reason: collision with root package name */
    private final GQ f80496k = new GQ();

    public final void i() {
        M3 m32 = this.f80487b;
        m32.f69330d = 0;
        m32.f69342p = 0L;
        m32.f69343q = false;
        m32.f69337k = false;
        m32.f69341o = false;
        m32.f69339m = null;
        this.f80491f = 0;
        this.f80493h = 0;
        this.f80492g = 0;
        this.f80494i = 0;
        this.f80497l = false;
    }

    public final int a() {
        int i10 = !this.f80497l ? this.f80489d.f69640g[this.f80491f] : this.f80487b.f69336j[this.f80491f] ? 1 : 0;
        return f() != null ? i10 | 1073741824 : i10;
    }

    public final int b() {
        return !this.f80497l ? this.f80489d.f69637d[this.f80491f] : this.f80487b.f69334h[this.f80491f];
    }

    public final long d() {
        return !this.f80497l ? this.f80489d.f69636c[this.f80491f] : this.f80487b.f69332f[this.f80493h];
    }

    public final long e() {
        if (!this.f80497l) {
            return this.f80489d.f69639f[this.f80491f];
        }
        M3 m32 = this.f80487b;
        return m32.f69335i[this.f80491f];
    }

    public final L3 f() {
        if (!this.f80497l) {
            return null;
        }
        M3 m32 = this.f80487b;
        C9581t3 c9581t3 = m32.f69327a;
        int i10 = OV.f69931a;
        int i11 = c9581t3.f79311a;
        L3 l3B = m32.f69339m;
        if (l3B == null) {
            l3B = this.f80489d.f69634a.b(i11);
        }
        if (l3B == null || !l3B.f69087a) {
            return null;
        }
        return l3B;
    }

    public final void h(N3 n32, C9581t3 c9581t3) {
        this.f80489d = n32;
        this.f80490e = c9581t3;
        this.f80486a.d(n32.f69634a.f68864g);
        i();
    }

    public final boolean k() {
        this.f80491f++;
        if (!this.f80497l) {
            return false;
        }
        int i10 = this.f80492g + 1;
        this.f80492g = i10;
        int[] iArr = this.f80487b.f69333g;
        int i11 = this.f80493h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f80493h = i11 + 1;
        this.f80492g = 0;
        return false;
    }

    public C10009x3(X0 x02, N3 n32, C9581t3 c9581t3) {
        this.f80486a = x02;
        this.f80489d = n32;
        this.f80490e = c9581t3;
        h(n32, c9581t3);
    }

    public final int c(int i10, int i11) {
        GQ gq2;
        boolean z10;
        int i12;
        L3 l3F = f();
        if (l3F == null) {
            return 0;
        }
        int i13 = l3F.f69090d;
        if (i13 != 0) {
            gq2 = this.f80487b.f69340n;
        } else {
            byte[] bArr = l3F.f69091e;
            int i14 = OV.f69931a;
            GQ gq3 = this.f80496k;
            int length = bArr.length;
            gq3.j(bArr, length);
            gq2 = this.f80496k;
            i13 = length;
        }
        boolean zB = this.f80487b.b(this.f80491f);
        if (zB || i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        GQ gq4 = this.f80495j;
        if (true != z10) {
            i12 = 0;
        } else {
            i12 = 128;
        }
        gq4.n()[0] = (byte) (i12 | i13);
        gq4.l(0);
        this.f80486a.g(this.f80495j, 1, 1);
        this.f80486a.g(gq2, i13, 1);
        if (!z10) {
            return i13 + 1;
        }
        if (!zB) {
            this.f80488c.i(8);
            GQ gq5 = this.f80488c;
            byte[] bArrN = gq5.n();
            bArrN[0] = 0;
            bArrN[1] = 1;
            bArrN[2] = 0;
            bArrN[3] = (byte) i11;
            bArrN[4] = (byte) ((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f93323c);
            bArrN[5] = (byte) ((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f93323c);
            bArrN[6] = (byte) ((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f93323c);
            bArrN[7] = (byte) (i10 & com.medallia.digital.mobilesdk.l3.f93323c);
            this.f80486a.g(gq5, 8, 1);
            return i13 + 9;
        }
        int i15 = i13 + 1;
        GQ gq6 = this.f80487b.f69340n;
        int iG = gq6.G();
        gq6.m(-2);
        int i16 = (iG * 6) + 2;
        if (i11 != 0) {
            this.f80488c.i(i16);
            byte[] bArrN2 = this.f80488c.n();
            gq6.h(bArrN2, 0, i16);
            int i17 = (((bArrN2[2] & 255) << 8) | (bArrN2[3] & 255)) + i11;
            bArrN2[2] = (byte) ((i17 >> 8) & com.medallia.digital.mobilesdk.l3.f93323c);
            bArrN2[3] = (byte) (i17 & com.medallia.digital.mobilesdk.l3.f93323c);
            gq6 = this.f80488c;
        }
        this.f80486a.g(gq6, i16, 1);
        return i15 + i16;
    }
}
