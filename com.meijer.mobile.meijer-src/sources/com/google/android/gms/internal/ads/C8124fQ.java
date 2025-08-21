package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8124fQ {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f74940a;

    /* renamed from: b, reason: collision with root package name */
    private int f74941b;

    /* renamed from: c, reason: collision with root package name */
    private int f74942c;

    /* renamed from: d, reason: collision with root package name */
    private int f74943d;

    public C8124fQ(byte[] bArr, int i10) {
        this.f74940a = bArr;
        this.f74943d = i10;
    }

    public final int a() {
        return ((this.f74943d - this.f74941b) * 8) - this.f74942c;
    }

    public final int c() {
        return (this.f74941b * 8) + this.f74942c;
    }

    public final int d(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f74942c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f74942c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f74942c = i13;
            byte[] bArr = this.f74940a;
            int i14 = this.f74941b;
            this.f74941b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f74940a;
        int i15 = this.f74941b;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f74942c = 0;
            this.f74941b = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        q();
        return i18;
    }

    public final void h(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (true) {
            i12 = i11 >> 3;
            if (i13 >= i12) {
                break;
            }
            byte[] bArr2 = this.f74940a;
            int i14 = this.f74941b;
            int i15 = i14 + 1;
            this.f74941b = i15;
            byte b10 = bArr2[i14];
            int i16 = this.f74942c;
            byte b11 = (byte) (b10 << i16);
            bArr[i13] = b11;
            bArr[i13] = (byte) (((bArr2[i15] & 255) >> (8 - i16)) | b11);
            i13++;
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (com.medallia.digital.mobilesdk.l3.f93323c >> i17));
        bArr[i12] = b12;
        int i18 = this.f74942c;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.f74940a;
            int i19 = this.f74941b;
            this.f74941b = i19 + 1;
            b12 = (byte) (b12 | ((bArr3[i19] & 255) << i18));
            bArr[i12] = b12;
            i18 -= 8;
        }
        int i20 = i18 + i17;
        this.f74942c = i20;
        byte[] bArr4 = this.f74940a;
        int i21 = this.f74941b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i17))) | b12);
        if (i20 == 8) {
            this.f74942c = 0;
            this.f74941b = i21 + 1;
        }
        q();
    }

    public final void k(byte[] bArr, int i10) {
        this.f74940a = bArr;
        this.f74941b = 0;
        this.f74942c = 0;
        this.f74943d = i10;
    }

    public C8124fQ() {
        this.f74940a = OV.f69936f;
    }

    private final void q() {
        int i10;
        int i11 = this.f74941b;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f74943d) || (i11 == i10 && this.f74942c == 0))) {
            z10 = true;
        }
        C8211gC.f(z10);
    }

    public final int b() {
        C8211gC.f(this.f74942c == 0);
        return this.f74941b;
    }

    public final void f() {
        if (this.f74942c == 0) {
            return;
        }
        this.f74942c = 0;
        this.f74941b++;
        q();
    }

    public final void g(int i10, int i11) {
        int iMin = Math.min(8 - this.f74942c, 14);
        int i12 = this.f74942c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f74940a;
        int i14 = this.f74941b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = 14 - iMin;
        int i16 = i10 & 16383;
        bArr[i14] = (byte) (b10 | ((i16 >>> i15) << i13));
        int i17 = i14 + 1;
        while (i15 > 8) {
            i15 -= 8;
            this.f74940a[i17] = (byte) (i16 >>> i15);
            i17++;
        }
        byte[] bArr2 = this.f74940a;
        byte b11 = (byte) (bArr2[i17] & ((1 << r0) - 1));
        bArr2[i17] = b11;
        bArr2[i17] = (byte) (((i16 & ((1 << i15) - 1)) << (8 - i15)) | b11);
        n(14);
        q();
    }

    public final void i(byte[] bArr, int i10, int i11) {
        C8211gC.f(this.f74942c == 0);
        System.arraycopy(this.f74940a, this.f74941b, bArr, 0, i11);
        this.f74941b += i11;
        q();
    }

    public final void l(int i10) {
        int i11 = i10 / 8;
        this.f74941b = i11;
        this.f74942c = i10 - (i11 * 8);
        q();
    }

    public final void m() {
        int i10 = this.f74942c + 1;
        this.f74942c = i10;
        if (i10 == 8) {
            this.f74942c = 0;
            this.f74941b++;
        }
        q();
    }

    public final void n(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f74941b + i11;
        this.f74941b = i12;
        int i13 = this.f74942c + (i10 - (i11 * 8));
        this.f74942c = i13;
        if (i13 > 7) {
            this.f74941b = i12 + 1;
            this.f74942c = i13 - 8;
        }
        q();
    }

    public final void o(int i10) {
        C8211gC.f(this.f74942c == 0);
        this.f74941b += i10;
        q();
    }

    public final boolean p() {
        int i10 = this.f74940a[this.f74941b] & (128 >> this.f74942c);
        m();
        return i10 != 0;
    }

    public final void j(GQ gq2) {
        k(gq2.n(), gq2.u());
        l(gq2.t() * 8);
    }

    public final long e(int i10) {
        if (i10 <= 32) {
            int iD = d(i10);
            int i11 = OV.f69931a;
            return 4294967295L & iD;
        }
        int iD2 = d(i10 - 32);
        int iD3 = d(32);
        int i12 = OV.f69931a;
        return (4294967295L & iD3) | ((iD2 & 4294967295L) << 32);
    }
}
