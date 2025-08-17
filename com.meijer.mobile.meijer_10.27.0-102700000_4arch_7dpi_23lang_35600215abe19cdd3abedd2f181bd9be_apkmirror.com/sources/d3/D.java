package d3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f127062d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f127063e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final Ce.O<Charset> f127064f = Ce.O.D(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f127065a;

    /* renamed from: b, reason: collision with root package name */
    private int f127066b;

    /* renamed from: c, reason: collision with root package name */
    private int f127067c;

    public D() {
        this.f127065a = P.f127091f;
    }

    public String B() {
        return n((char) 0);
    }

    public void T(byte[] bArr) {
        U(bArr, bArr.length);
    }

    private void Y(Charset charset) {
        if (m(charset, f127062d) == '\r') {
            m(charset, f127063e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int d(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported charset: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L41:
            r0 = 2
            goto L44
        L43:
            r0 = 1
        L44:
            int r1 = r4.f127066b
        L46:
            int r2 = r4.f127067c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La5
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5e
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L69
        L5e:
            byte[] r2 = r4.f127065a
            r2 = r2[r1]
            boolean r2 = d3.P.E0(r2)
            if (r2 == 0) goto L69
            goto La2
        L69:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L79
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
        L79:
            byte[] r2 = r4.f127065a
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = d3.P.E0(r2)
            if (r2 == 0) goto L8a
            goto La2
        L8a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La3
            byte[] r2 = r4.f127065a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La3
            r2 = r2[r1]
            boolean r2 = d3.P.E0(r2)
            if (r2 == 0) goto La3
        La2:
            return r1
        La3:
            int r1 = r1 + r0
            goto L46
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.D.d(java.nio.charset.Charset):int");
    }

    private int i(Charset charset) {
        byte b10;
        byte b11;
        byte b12 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b10 = this.f127065a[this.f127066b];
            b11 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f127065a;
                int i10 = this.f127066b;
                b11 = bArr[i10];
                b10 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f127065a;
                int i11 = this.f127066b;
                b11 = bArr2[i11 + 1];
                b10 = bArr2[i11];
            }
            b12 = 2;
        }
        return He.f.g(b11, b10, (byte) 0, b12);
    }

    public long A() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        this.f127066b = i10 + 1;
        this.f127066b = i10 + 2;
        this.f127066b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f127066b = i10 + 4;
        long j11 = j10 | ((bArr[r4] & 255) << 32);
        this.f127066b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f127066b = i10 + 6;
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        this.f127066b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f127066b = i10 + 8;
        return (bArr[r4] & 255) | j14;
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f127066b;
        int i12 = (i11 + i10) - 1;
        String strH = P.H(this.f127065a, i11, (i12 >= this.f127067c || this.f127065a[i12] != 0) ? i10 : i10 - 1);
        this.f127066b += i10;
        return strH;
    }

    public short D() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f127066b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String E(int i10) {
        return F(i10, StandardCharsets.UTF_8);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f127065a, this.f127066b, i10, charset);
        this.f127066b += i10;
        return str;
    }

    public int H() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        this.f127066b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f127066b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f127066b = i10 + 4;
        return i13;
    }

    public long J() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        this.f127066b = i10 + 1;
        this.f127066b = i10 + 2;
        this.f127066b = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f127066b = i10 + 4;
        return (bArr[r4] & 255) | j10;
    }

    public int K() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f127066b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f127066b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f127066b == this.f127067c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jH = H();
            j10 |= (127 & jH) << (i10 * 7);
            if ((jH & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public int P() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f127066b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long Q() {
        int i10;
        int i11;
        long j10 = this.f127065a[this.f127066b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f127065a[this.f127066b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f127066b += i11;
        return j10;
    }

    public void U(byte[] bArr, int i10) {
        this.f127065a = bArr;
        this.f127067c = i10;
        this.f127066b = 0;
    }

    public void V(int i10) {
        C13466a.a(i10 >= 0 && i10 <= this.f127065a.length);
        this.f127067c = i10;
    }

    public void W(int i10) {
        C13466a.a(i10 >= 0 && i10 <= this.f127067c);
        this.f127066b = i10;
    }

    public void X(int i10) {
        W(this.f127066b + i10);
    }

    public int a() {
        return this.f127067c - this.f127066b;
    }

    public int b() {
        return this.f127065a.length;
    }

    public byte[] e() {
        return this.f127065a;
    }

    public int f() {
        return this.f127066b;
    }

    public int g() {
        return this.f127067c;
    }

    public char h(Charset charset) {
        C13466a.b(f127064f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f127065a[this.f127066b] & 255;
    }

    public void k(C c10, int i10) {
        l(c10.f127058a, 0, i10);
        c10.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f127065a, this.f127066b, bArr, i10, i11);
        this.f127066b += i11;
    }

    public int q() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f127066b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f127066b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f127066b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int r() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f127066b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f127066b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public String s() {
        return t(StandardCharsets.UTF_8);
    }

    public String t(Charset charset) {
        C13466a.b(f127064f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            R();
        }
        String strF = F(d(charset) - this.f127066b, charset);
        if (this.f127066b == this.f127067c) {
            return strF;
        }
        Y(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f127066b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f127066b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f127066b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long v() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        this.f127066b = i10 + 1;
        this.f127066b = i10 + 2;
        this.f127066b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f127066b = i10 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.f127066b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.f127066b = i10 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.f127066b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.f127066b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public short w() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = bArr[i10] & 255;
        this.f127066b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long x() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        this.f127066b = i10 + 1;
        this.f127066b = i10 + 2;
        this.f127066b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f127066b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j10;
    }

    public int z() {
        byte[] bArr = this.f127065a;
        int i10 = this.f127066b;
        int i11 = i10 + 1;
        this.f127066b = i11;
        int i12 = bArr[i10] & 255;
        this.f127066b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public D(int i10) {
        this.f127065a = new byte[i10];
        this.f127067c = i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 != 0) {
            char c10 = (char) (i10 >> 16);
            if (He.b.a(cArr, c10)) {
                this.f127066b += i10 & 65535;
                return c10;
            }
            return (char) 0;
        }
        return (char) 0;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int M() {
        return He.f.d(N());
    }

    public long O() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException("Top bit not zero: " + jA);
    }

    public Charset R() {
        if (a() >= 3) {
            byte[] bArr = this.f127065a;
            int i10 = this.f127066b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f127066b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f127065a;
            int i11 = this.f127066b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f127066b = i11 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f127066b = i11 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public void S(int i10) {
        byte[] bArr;
        if (b() < i10) {
            bArr = new byte[i10];
        } else {
            bArr = this.f127065a;
        }
        U(bArr, i10);
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f127065a = Arrays.copyOf(this.f127065a, i10);
        }
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f127066b;
        while (i10 < this.f127067c && this.f127065a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f127065a;
        int i11 = this.f127066b;
        String strH = P.H(bArr, i11, i10 - i11);
        this.f127066b = i10;
        if (i10 < this.f127067c) {
            this.f127066b = i10 + 1;
        }
        return strH;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public D(byte[] bArr) {
        this.f127065a = bArr;
        this.f127067c = bArr.length;
    }

    public D(byte[] bArr, int i10) {
        this.f127065a = bArr;
        this.f127067c = i10;
    }
}
