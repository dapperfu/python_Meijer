package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GQ {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f67186d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f67187e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC8450jh0 f67188f = AbstractC8450jh0.y(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f67189a;

    /* renamed from: b, reason: collision with root package name */
    private int f67190b;

    /* renamed from: c, reason: collision with root package name */
    private int f67191c;

    public GQ(byte[] bArr, int i10) {
        this.f67189a = bArr;
        this.f67191c = i10;
    }

    public final long L() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f67190b == this.f67191c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jC = C();
            j10 |= (127 & jC) << (i10 * 7);
            if ((jC & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public final String b(int i10, Charset charset) {
        byte[] bArr = this.f67189a;
        int i11 = this.f67190b;
        String str = new String(bArr, i11, i10, charset);
        this.f67190b = i11 + i10;
        return str;
    }

    public final void j(byte[] bArr, int i10) {
        this.f67189a = bArr;
        this.f67191c = i10;
        this.f67190b = 0;
    }

    public final void k(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f67189a.length) {
            z10 = true;
        }
        C8086gC.d(z10);
        this.f67191c = i10;
    }

    public final void l(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f67191c) {
            z10 = true;
        }
        C8086gC.d(z10);
        this.f67190b = i10;
    }

    public final byte[] n() {
        return this.f67189a;
    }

    public final int r() {
        return this.f67191c - this.f67190b;
    }

    public final int t() {
        return this.f67190b;
    }

    public final int u() {
        return this.f67191c;
    }

    public GQ() {
        this.f67189a = OV.f69096f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int p(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L11
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L25
        L11:
            int r0 = r4.f67191c
            int r2 = r4.f67190b
            int r0 = r0 - r2
            if (r0 <= 0) goto L25
            byte[] r5 = r4.f67189a
            r5 = r5[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.Fi0.a(r2)
            byte r5 = (byte) r5
            goto L67
        L25:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L36
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
        L36:
            int r0 = r4.f67191c
            int r3 = r4.f67190b
            int r0 = r0 - r3
            if (r0 < r2) goto L4b
            byte[] r5 = r4.f67189a
            r0 = r5[r3]
            int r3 = r3 + r1
            r5 = r5[r3]
            char r5 = com.google.android.gms.internal.ads.Fi0.b(r0, r5)
        L48:
            byte r5 = (byte) r5
            r1 = r2
            goto L67
        L4b:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            int r5 = r4.f67191c
            int r0 = r4.f67190b
            int r5 = r5 - r0
            if (r5 < r2) goto L70
            byte[] r5 = r4.f67189a
            int r1 = r0 + 1
            r1 = r5[r1]
            r5 = r5[r0]
            char r5 = com.google.android.gms.internal.ads.Fi0.b(r1, r5)
            goto L48
        L67:
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.Fi0.a(r2)
            int r5 = r5 << 16
            int r5 = r5 + r1
            return r5
        L70:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GQ.p(java.nio.charset.Charset):int");
    }

    public final int A() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        this.f67190b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final int C() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        this.f67190b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int D() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        this.f67190b = i10 + 2;
        int i13 = bArr[i11] & 255;
        this.f67190b = i10 + 4;
        return i13 | (i12 << 8);
    }

    public final int E() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f67190b = i13;
        int i14 = bArr[i11] & 255;
        this.f67190b = i10 + 3;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int G() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        this.f67190b = i10 + 2;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final long H() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f67190b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f67190b = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.f67190b = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.f67190b = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.f67190b = i16;
        long j15 = bArr[i15];
        this.f67190b = i10 + 7;
        long j16 = bArr[i16];
        this.f67190b = i10 + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((j16 & 255) << 48);
    }

    public final long I() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f67190b = i12;
        long j11 = bArr[i11];
        this.f67190b = i10 + 3;
        long j12 = bArr[i12];
        this.f67190b = i10 + 4;
        return ((bArr[r2] & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final long J() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f67190b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f67190b = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.f67190b = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.f67190b = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.f67190b = i16;
        long j15 = bArr[i15];
        this.f67190b = i10 + 7;
        long j16 = bArr[i16];
        this.f67190b = i10 + 8;
        return (bArr[r3] & 255) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8);
    }

    public final long K() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f67190b = i12;
        long j11 = bArr[i11];
        this.f67190b = i10 + 3;
        long j12 = bArr[i12];
        this.f67190b = i10 + 4;
        return (bArr[r2] & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long N() {
        int i10;
        int i11;
        long j10 = this.f67189a[this.f67190b];
        int i12 = 7;
        while (true) {
            i10 = 0;
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r7 - 1;
                i10 = 7 - i12;
            } else if (i12 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i11 = 1; i11 < i10; i11++) {
            if ((this.f67189a[this.f67190b + i11] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r2 & 63);
        }
        this.f67190b += i10;
        return j10;
    }

    public final String O(char c10) {
        int i10 = this.f67191c;
        int i11 = this.f67190b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f67191c && this.f67189a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f67189a;
        int i12 = this.f67190b;
        String strC = OV.c(bArr, i12, i11 - i12);
        this.f67190b = i11;
        if (i11 < this.f67191c) {
            this.f67190b = i11 + 1;
        }
        return strC;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String P(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.jh0 r0 = com.google.android.gms.internal.ads.GQ.f67188f
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.C8086gC.e(r0, r1)
            int r0 = r4.f67191c
            int r1 = r4.f67190b
            int r0 = r0 - r1
            if (r0 != 0) goto L1c
            r5 = 0
            return r5
        L1c:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L27
            r4.c()
        L27:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r3 = 1
            if (r1 != 0) goto L5f
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            goto L5f
        L37:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r3 = 2
            if (r0 != 0) goto L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L51
            goto L5f
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L5f:
            int r0 = r4.f67190b
        L61:
            int r1 = r4.f67191c
            int r2 = r3 + (-1)
            int r2 = r1 - r2
            if (r0 >= r2) goto Lbe
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L79
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L83
        L79:
            byte[] r1 = r4.f67189a
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.OV.l(r1)
            if (r1 != 0) goto Lbf
        L83:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L93
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La3
        L93:
            byte[] r1 = r4.f67189a
            r2 = r1[r0]
            if (r2 != 0) goto La3
            int r2 = r0 + 1
            r1 = r1[r2]
            boolean r1 = com.google.android.gms.internal.ads.OV.l(r1)
            if (r1 != 0) goto Lbf
        La3:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lbc
            int r1 = r0 + 1
            byte[] r2 = r4.f67189a
            r1 = r2[r1]
            if (r1 != 0) goto Lbc
            r1 = r2[r0]
            boolean r1 = com.google.android.gms.internal.ads.OV.l(r1)
            if (r1 == 0) goto Lbc
            goto Lbf
        Lbc:
            int r0 = r0 + r3
            goto L61
        Lbe:
            r0 = r1
        Lbf:
            int r1 = r4.f67190b
            int r0 = r0 - r1
            java.lang.String r0 = r4.b(r0, r5)
            int r1 = r4.f67190b
            int r2 = r4.f67191c
            if (r1 == r2) goto Ldb
            char[] r1 = com.google.android.gms.internal.ads.GQ.f67186d
            char r1 = r4.o(r5, r1)
            r2 = 13
            if (r1 != r2) goto Ldb
            char[] r1 = com.google.android.gms.internal.ads.GQ.f67187e
            r4.o(r5, r1)
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GQ.P(java.nio.charset.Charset):java.lang.String");
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f67190b;
        int i12 = (i11 + i10) - 1;
        String strC = OV.c(this.f67189a, i11, (i12 >= this.f67191c || this.f67189a[i12] != 0) ? i10 : i10 - 1);
        this.f67190b += i10;
        return strC;
    }

    public final Charset c() {
        int i10 = this.f67191c;
        int i11 = this.f67190b;
        int i12 = i10 - i11;
        if (i12 >= 3) {
            byte[] bArr = this.f67189a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f67190b = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i12 < 2) {
            return null;
        }
        byte[] bArr2 = this.f67189a;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.f67190b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f67190b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short d() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        this.f67190b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final short e() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        this.f67190b = i10 + 2;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final void f(int i10) {
        byte[] bArr = this.f67189a;
        if (i10 > bArr.length) {
            this.f67189a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void g(C7999fQ c7999fQ, int i10) {
        h(c7999fQ.f74100a, 0, i10);
        c7999fQ.l(0);
    }

    public final void h(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f67189a, this.f67190b, bArr, i10, i11);
        this.f67190b += i11;
    }

    public final void i(int i10) {
        byte[] bArr = this.f67189a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        j(bArr, i10);
    }

    public final void m(int i10) {
        l(this.f67190b + i10);
    }

    public final char q(Charset charset) {
        C8086gC.e(f67188f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (p(charset) >> 16);
    }

    public final int s() {
        return this.f67189a.length;
    }

    public final int v() {
        return this.f67189a[this.f67190b] & 255;
    }

    public final int w() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f67190b = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.f67190b = i15;
        int i16 = bArr[i13] & 255;
        this.f67190b = i10 + 4;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int x() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f67190b = i13;
        int i14 = bArr[i11] & 255;
        this.f67190b = i10 + 3;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final int y() {
        byte[] bArr = this.f67189a;
        int i10 = this.f67190b;
        int i11 = i10 + 1;
        this.f67190b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f67190b = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.f67190b = i15;
        int i16 = bArr[i13] & 255;
        this.f67190b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | (i14 << 8) | i12 | (i16 << 16);
    }

    public GQ(int i10) {
        this.f67189a = new byte[i10];
        this.f67191c = i10;
    }

    private final char o(Charset charset, char[] cArr) {
        int iP = p(charset);
        if (iP != 0) {
            int i10 = iP >> 16;
            for (char c10 : cArr) {
                char c11 = (char) i10;
                if (c10 == c11) {
                    this.f67190b += (char) iP;
                    return c11;
                }
            }
        }
        return (char) 0;
    }

    public final int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public final int F() {
        int iW = w();
        if (iW >= 0) {
            return iW;
        }
        throw new IllegalStateException("Top bit not zero: " + iW);
    }

    public final long M() {
        long J10 = J();
        if (J10 >= 0) {
            return J10;
        }
        throw new IllegalStateException("Top bit not zero: " + J10);
    }

    public final int z() {
        int iY = y();
        if (iY >= 0) {
            return iY;
        }
        throw new IllegalStateException("Top bit not zero: " + iY);
    }

    public GQ(byte[] bArr) {
        this.f67189a = bArr;
        this.f67191c = bArr.length;
    }
}
