package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7624bu0 extends AbstractC7943eu0 {

    /* renamed from: f, reason: collision with root package name */
    private final Iterable f72893f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterator f72894g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f72895h;

    /* renamed from: i, reason: collision with root package name */
    private int f72896i;

    /* renamed from: j, reason: collision with root package name */
    private int f72897j;

    /* renamed from: k, reason: collision with root package name */
    private int f72898k;

    /* renamed from: l, reason: collision with root package name */
    private int f72899l;

    /* renamed from: m, reason: collision with root package name */
    private int f72900m;

    /* renamed from: n, reason: collision with root package name */
    private long f72901n;

    /* renamed from: o, reason: collision with root package name */
    private long f72902o;

    /* renamed from: p, reason: collision with root package name */
    private long f72903p;

    /* synthetic */ C7624bu0(Iterable iterable, int i10, boolean z10, C7836du0 c7836du0) {
        super(null);
        this.f72898k = a.e.API_PRIORITY_OTHER;
        this.f72896i = i10;
        this.f72893f = iterable;
        this.f72894g = iterable.iterator();
        this.f72900m = 0;
        if (i10 != 0) {
            G();
            return;
        }
        this.f72895h = Tu0.f70474c;
        this.f72901n = 0L;
        this.f72902o = 0L;
        this.f72903p = 0L;
    }

    private final int C() {
        return (int) (((this.f72896i - this.f72900m) - this.f72901n) + this.f72902o);
    }

    private final void F() {
        int i10 = this.f72896i + this.f72897j;
        this.f72896i = i10;
        int i11 = this.f72898k;
        if (i10 <= i11) {
            this.f72897j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f72897j = i12;
        this.f72896i = i10 - i12;
    }

    final long B() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((H() & 128) == 0) {
                return j10;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final boolean a() throws IOException {
        return (((long) this.f72900m) + this.f72901n) - this.f72902o == ((long) this.f72896i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int i() {
        return (int) ((this.f72900m + this.f72901n) - this.f72902o);
    }

    private final void D() throws zzgyg {
        if (!this.f72894g.hasNext()) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        G();
    }

    private final void G() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f72894g.next();
        this.f72895h = byteBuffer;
        this.f72900m += (int) (this.f72901n - this.f72902o);
        long jPosition = byteBuffer.position();
        this.f72901n = jPosition;
        this.f72902o = jPosition;
        this.f72903p = this.f72895h.limit();
        long jM = C7628bw0.m(this.f72895h);
        this.f72901n += jM;
        this.f72902o += jM;
        this.f72903p += jM;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final void A(int i10) {
        this.f72898k = i10;
        F();
    }

    public final byte H() throws IOException {
        if (this.f72903p - this.f72901n == 0) {
            D();
        }
        long j10 = this.f72901n;
        this.f72901n = 1 + j10;
        return C7628bw0.i(j10);
    }

    public final int I() throws IOException {
        long j10 = this.f72903p;
        long j11 = this.f72901n;
        if (j10 - j11 < 4) {
            int iH = H() & 255;
            int iH2 = (H() & 255) << 8;
            return iH | iH2 | ((H() & 255) << 16) | ((H() & 255) << 24);
        }
        this.f72901n = 4 + j11;
        int i10 = C7628bw0.i(j11) & 255;
        int i11 = (C7628bw0.i(1 + j11) & 255) << 8;
        return i10 | i11 | ((C7628bw0.i(2 + j11) & 255) << 16) | ((C7628bw0.i(j11 + 3) & 255) << 24);
    }

    public final int J() throws IOException {
        int i10;
        long j10 = this.f72901n;
        if (this.f72903p != j10) {
            long j11 = j10 + 1;
            byte bI = C7628bw0.i(j10);
            if (bI >= 0) {
                this.f72901n++;
                return bI;
            }
            if (this.f72903p - this.f72901n >= 10) {
                long j12 = 2 + j10;
                int i11 = (C7628bw0.i(j11) << 7) ^ bI;
                if (i11 < 0) {
                    i10 = i11 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int i12 = (C7628bw0.i(j12) << C14045dq.LIGHTEN) ^ i11;
                    if (i12 >= 0) {
                        i10 = i12 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int i13 = i12 ^ (C7628bw0.i(j13) << 21);
                        if (i13 < 0) {
                            i10 = (-2080896) ^ i13;
                        } else {
                            j13 = 5 + j10;
                            byte bI2 = C7628bw0.i(j14);
                            int i14 = (i13 ^ (bI2 << 28)) ^ 266354560;
                            if (bI2 < 0) {
                                j14 = 6 + j10;
                                if (C7628bw0.i(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (C7628bw0.i(j14) < 0) {
                                        j14 = 8 + j10;
                                        if (C7628bw0.i(j13) < 0) {
                                            j13 = 9 + j10;
                                            if (C7628bw0.i(j14) < 0) {
                                                long j15 = j10 + 10;
                                                if (C7628bw0.i(j13) >= 0) {
                                                    i10 = i14;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i14;
                            }
                            i10 = i14;
                        }
                        j12 = j14;
                    }
                    j12 = j13;
                }
                this.f72901n = j12;
                return i10;
            }
        }
        return (int) B();
    }

    public final long K() throws IOException {
        long j10 = this.f72903p;
        long j11 = this.f72901n;
        if (j10 - j11 < 8) {
            return ((H() & 255) << 56) | (H() & 255) | ((H() & 255) << 8) | ((H() & 255) << 16) | ((H() & 255) << 24) | ((H() & 255) << 32) | ((H() & 255) << 40) | ((H() & 255) << 48);
        }
        this.f72901n = 8 + j11;
        long jI = C7628bw0.i(j11) & 255;
        long jI2 = (C7628bw0.i(1 + j11) & 255) << 8;
        return jI | jI2 | ((C7628bw0.i(j11 + 2) & 255) << 16) | ((C7628bw0.i(3 + j11) & 255) << 24) | ((C7628bw0.i(j11 + 4) & 255) << 32) | ((C7628bw0.i(j11 + 5) & 255) << 40) | ((C7628bw0.i(j11 + 6) & 255) << 48) | ((C7628bw0.i(j11 + 7) & 255) << 56);
    }

    public final long L() throws IOException {
        long j10;
        long j11;
        long j12 = this.f72901n;
        if (this.f72903p != j12) {
            long j13 = j12 + 1;
            byte bI = C7628bw0.i(j12);
            if (bI >= 0) {
                this.f72901n++;
                return bI;
            }
            if (this.f72903p - this.f72901n >= 10) {
                long j14 = 2 + j12;
                int i10 = (C7628bw0.i(j13) << 7) ^ bI;
                if (i10 < 0) {
                    j10 = i10 ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int i11 = (C7628bw0.i(j14) << C14045dq.LIGHTEN) ^ i10;
                    if (i11 >= 0) {
                        j10 = i11 ^ 16256;
                    } else {
                        long j16 = 4 + j12;
                        int i12 = i11 ^ (C7628bw0.i(j15) << 21);
                        if (i12 < 0) {
                            j10 = (-2080896) ^ i12;
                            j14 = j16;
                        } else {
                            j15 = 5 + j12;
                            long jI = (C7628bw0.i(j16) << 28) ^ i12;
                            if (jI >= 0) {
                                j10 = 266354560 ^ jI;
                            } else {
                                long j17 = 6 + j12;
                                long jI2 = jI ^ (C7628bw0.i(j15) << 35);
                                if (jI2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    long j18 = 7 + j12;
                                    long jI3 = jI2 ^ (C7628bw0.i(j17) << 42);
                                    if (jI3 >= 0) {
                                        j10 = 4363953127296L ^ jI3;
                                    } else {
                                        j17 = 8 + j12;
                                        jI2 = jI3 ^ (C7628bw0.i(j18) << 49);
                                        if (jI2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j18 = 9 + j12;
                                            long jI4 = (jI2 ^ (C7628bw0.i(j17) << 56)) ^ 71499008037633920L;
                                            if (jI4 < 0) {
                                                long j19 = j12 + 10;
                                                if (C7628bw0.i(j18) >= 0) {
                                                    j14 = j19;
                                                    j10 = jI4;
                                                }
                                            } else {
                                                j10 = jI4;
                                            }
                                        }
                                    }
                                    j14 = j18;
                                }
                                j10 = j11 ^ jI2;
                                j14 = j17;
                            }
                        }
                    }
                    j14 = j15;
                }
                this.f72901n = j14;
                return j10;
            }
        }
        return B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int j(int i10) throws zzgyg {
        if (i10 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + i();
        int i12 = this.f72898k;
        if (i11 > i12) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f72898k = i11;
        F();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final void z(int i10) throws zzgyg {
        if (this.f72899l != i10) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    private final void E(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 <= C()) {
            int i12 = i11;
            while (i12 > 0) {
                if (this.f72903p - this.f72901n == 0) {
                    D();
                }
                int iMin = Math.min(i12, (int) (this.f72903p - this.f72901n));
                long j10 = iMin;
                C7628bw0.w(this.f72901n, bArr, i11 - i12, j10);
                i12 -= iMin;
                this.f72901n += j10;
            }
            return;
        }
        if (i11 <= 0) {
        } else {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final boolean b() throws IOException {
        if (L() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final double g() throws IOException {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final float h() throws IOException {
        return Float.intBitsToFloat(I());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int k() throws IOException {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int l() throws IOException {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int m() throws IOException {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int n() throws IOException {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int o() throws IOException {
        return AbstractC7943eu0.c(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int p() throws IOException {
        if (a()) {
            this.f72899l = 0;
            return 0;
        }
        int iJ = J();
        this.f72899l = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int q() throws IOException {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long r() throws IOException {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long s() throws IOException {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long t() throws IOException {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long u() throws IOException {
        return AbstractC7943eu0.d(L());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long v() throws IOException {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final Zt0 w() throws IOException {
        int iJ = J();
        if (iJ > 0) {
            long j10 = this.f72903p;
            long j11 = this.f72901n;
            long j12 = iJ;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iJ];
                C7628bw0.w(j11, bArr, 0L, j12);
                this.f72901n += j12;
                return new Wt0(bArr);
            }
        }
        if (iJ > 0 && iJ <= C()) {
            byte[] bArr2 = new byte[iJ];
            E(bArr2, 0, iJ);
            return new Wt0(bArr2);
        }
        if (iJ == 0) {
            return Zt0.f72282b;
        }
        if (iJ < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final String x() throws IOException {
        int iJ = J();
        if (iJ > 0) {
            long j10 = this.f72903p;
            long j11 = this.f72901n;
            long j12 = iJ;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iJ];
                C7628bw0.w(j11, bArr, 0L, j12);
                String str = new String(bArr, Tu0.f70472a);
                this.f72901n += j12;
                return str;
            }
        }
        if (iJ > 0 && iJ <= C()) {
            byte[] bArr2 = new byte[iJ];
            E(bArr2, 0, iJ);
            return new String(bArr2, Tu0.f70472a);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final String y() throws IOException {
        int iJ = J();
        if (iJ > 0) {
            long j10 = this.f72903p;
            long j11 = this.f72901n;
            long j12 = iJ;
            if (j12 <= j10 - j11) {
                String strF = C8161gw0.f(this.f72895h, (int) (j11 - this.f72902o), iJ);
                this.f72901n += j12;
                return strF;
            }
        }
        if (iJ >= 0 && iJ <= C()) {
            byte[] bArr = new byte[iJ];
            E(bArr, 0, iJ);
            return C8161gw0.g(bArr, 0, iJ);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
