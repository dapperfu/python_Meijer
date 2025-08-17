package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.Reason;
import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7730cu0 extends AbstractC7943eu0 {

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f73276f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f73277g;

    /* renamed from: h, reason: collision with root package name */
    private int f73278h;

    /* renamed from: i, reason: collision with root package name */
    private int f73279i;

    /* renamed from: j, reason: collision with root package name */
    private int f73280j;

    /* renamed from: k, reason: collision with root package name */
    private int f73281k;

    /* renamed from: l, reason: collision with root package name */
    private int f73282l;

    /* renamed from: m, reason: collision with root package name */
    private int f73283m;

    /* synthetic */ C7730cu0(InputStream inputStream, int i10, C7836du0 c7836du0) {
        super(null);
        this.f73283m = a.e.API_PRIORITY_OTHER;
        byte[] bArr = Tu0.f70473b;
        this.f73276f = inputStream;
        this.f73277g = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f73278h = 0;
        this.f73280j = 0;
        this.f73282l = 0;
    }

    private final void D() {
        int i10 = this.f73278h + this.f73279i;
        this.f73278h = i10;
        int i11 = this.f73282l + i10;
        int i12 = this.f73283m;
        if (i11 <= i12) {
            this.f73279i = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f73279i = i13;
        this.f73278h = i10 - i13;
    }

    final long M() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f73280j == this.f73278h) {
                E(1);
            }
            byte[] bArr = this.f73277g;
            int i11 = this.f73280j;
            this.f73280j = i11 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((bArr[i11] & 128) == 0) {
                return j10;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int i() {
        return this.f73282l + this.f73280j;
    }

    private final List C(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f73276f.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f73282l += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final boolean F(int i10) throws IOException {
        int i11 = this.f73280j;
        int i12 = i11 + i10;
        int i13 = this.f73278h;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.f73282l;
        if (i10 > (a.e.API_PRIORITY_OTHER - i14) - i11 || i14 + i11 + i10 > this.f73283m) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.f73277g;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.f73282l + i11;
            this.f73282l = i14;
            i13 = this.f73278h - i11;
            this.f73278h = i13;
            this.f73280j = 0;
        }
        try {
            int i15 = this.f73276f.read(this.f73277g, i13, Math.min(4096 - i13, (a.e.API_PRIORITY_OTHER - i14) - i13));
            if (i15 == 0 || i15 < -1 || i15 > 4096) {
                throw new IllegalStateException(String.valueOf(this.f73276f.getClass()) + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 <= 0) {
                return false;
            }
            this.f73278h += i15;
            D();
            if (this.f73278h >= i10) {
                return true;
            }
            return F(i10);
        } catch (zzgyg e10) {
            e10.a();
            throw e10;
        }
    }

    private final byte[] H(int i10) throws IOException {
        if (i10 == 0) {
            return Tu0.f70473b;
        }
        int i11 = this.f73282l;
        int i12 = this.f73280j;
        int i13 = i11 + i12 + i10;
        if (Reason.OS_VERSION_TOO_LOW + i13 > 0) {
            throw new zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f73283m;
        if (i13 > i14) {
            B((i14 - i11) - i12);
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.f73278h - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.f73276f.available()) {
                    return null;
                }
            } catch (zzgyg e10) {
                e10.a();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f73277g, this.f73280j, bArr, 0, i15);
        this.f73282l += this.f73278h;
        this.f73280j = 0;
        this.f73278h = 0;
        while (i15 < i10) {
            try {
                int i17 = this.f73276f.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f73282l += i17;
                i15 += i17;
            } catch (zzgyg e11) {
                e11.a();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final void A(int i10) {
        this.f73283m = i10;
        D();
    }

    public final void B(int i10) throws IOException {
        int i11 = this.f73278h;
        int i12 = this.f73280j;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f73280j = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f73282l;
        int i15 = i14 + i12;
        int i16 = this.f73283m;
        if (i15 + i10 > i16) {
            B((i16 - i14) - i12);
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f73282l = i15;
        this.f73278h = 0;
        this.f73280j = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.f73276f.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(String.valueOf(this.f73276f.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzgyg e10) {
                    e10.a();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f73282l += i13;
                D();
                throw th2;
            }
        }
        this.f73282l += i13;
        D();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.f73278h;
        int i18 = i17 - this.f73280j;
        this.f73280j = i17;
        E(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.f73278h;
            if (i19 <= i20) {
                this.f73280j = i19;
                return;
            } else {
                i18 += i20;
                this.f73280j = i20;
                E(1);
            }
        }
    }

    public final int I() throws IOException {
        int i10 = this.f73280j;
        if (this.f73278h - i10 < 4) {
            E(4);
            i10 = this.f73280j;
        }
        byte[] bArr = this.f73277g;
        this.f73280j = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int J() throws IOException {
        int i10;
        int i11 = this.f73280j;
        int i12 = this.f73278h;
        if (i12 != i11) {
            byte[] bArr = this.f73277g;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f73280j = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << C14045dq.LIGHTEN) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f73280j = i14;
                return i10;
            }
        }
        return (int) M();
    }

    public final long K() throws IOException {
        int i10 = this.f73280j;
        if (this.f73278h - i10 < 8) {
            E(8);
            i10 = this.f73280j;
        }
        byte[] bArr = this.f73277g;
        this.f73280j = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    public final long L() throws IOException {
        long j10;
        long j11;
        int i10 = this.f73280j;
        int i11 = this.f73278h;
        if (i11 != i10) {
            byte[] bArr = this.f73277g;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f73280j = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << C14045dq.LIGHTEN) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j12 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j12;
                        } else {
                            i15 = i10 + 5;
                            long j13 = (bArr[i17] << 28) ^ i18;
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j14 = (bArr[i15] << 35) ^ j13;
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j15 = j14 ^ (bArr[i13] << 42);
                                    if (j15 >= 0) {
                                        j10 = j15 ^ 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j14 = j15 ^ (bArr[i19] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            long j16 = (j14 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                i13 = i10 + 10;
                                                if (bArr[i19] >= 0) {
                                                    j10 = j16;
                                                }
                                            } else {
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    i13 = i19;
                                }
                                j10 = j14 ^ j11;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.f73280j = i13;
                return j10;
            }
        }
        return M();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final boolean a() throws IOException {
        return this.f73280j == this.f73278h && !F(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int j(int i10) throws zzgyg {
        if (i10 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.f73282l + this.f73280j;
        if (i11 < 0) {
            throw new zzgyg("Failed to parse the message.");
        }
        int i12 = this.f73283m;
        if (i11 > i12) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f73283m = i11;
        D();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final void z(int i10) throws zzgyg {
        if (this.f73281k != i10) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    private final void E(int i10) throws IOException {
        if (!F(i10)) {
            if (i10 > (a.e.API_PRIORITY_OTHER - this.f73282l) - this.f73280j) {
                throw new zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final byte[] G(int i10, boolean z10) throws IOException {
        byte[] bArrH = H(i10);
        if (bArrH != null) {
            return bArrH;
        }
        int i11 = this.f73280j;
        int i12 = this.f73278h;
        int i13 = i12 - i11;
        this.f73282l += i12;
        this.f73280j = 0;
        this.f73278h = 0;
        List<byte[]> listC = C(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f73277g, i11, bArr, 0, i13);
        for (byte[] bArr2 : listC) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
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
            this.f73281k = 0;
            return 0;
        }
        int iJ = J();
        this.f73281k = iJ;
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
        int i10 = this.f73278h;
        int i11 = this.f73280j;
        if (iJ <= i10 - i11 && iJ > 0) {
            Zt0 zt0Z = Zt0.z(this.f73277g, i11, iJ);
            this.f73280j += iJ;
            return zt0Z;
        }
        if (iJ == 0) {
            return Zt0.f72282b;
        }
        if (iJ >= 0) {
            byte[] bArrH = H(iJ);
            if (bArrH != null) {
                return Zt0.z(bArrH, 0, bArrH.length);
            }
            int i12 = this.f73280j;
            int i13 = this.f73278h;
            int i14 = i13 - i12;
            this.f73282l += i13;
            this.f73280j = 0;
            this.f73278h = 0;
            List<byte[]> listC = C(iJ - i14);
            byte[] bArr = new byte[iJ];
            System.arraycopy(this.f73277g, i12, bArr, 0, i14);
            for (byte[] bArr2 : listC) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return new Wt0(bArr);
        }
        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final String x() throws IOException {
        int iJ = J();
        if (iJ > 0) {
            int i10 = this.f73278h;
            int i11 = this.f73280j;
            if (iJ <= i10 - i11) {
                String str = new String(this.f73277g, i11, iJ, Tu0.f70472a);
                this.f73280j += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ >= 0) {
            if (iJ <= this.f73278h) {
                E(iJ);
                String str2 = new String(this.f73277g, this.f73280j, iJ, Tu0.f70472a);
                this.f73280j += iJ;
                return str2;
            }
            return new String(G(iJ, false), Tu0.f70472a);
        }
        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final String y() throws IOException {
        byte[] bArrG;
        int iJ = J();
        int i10 = this.f73280j;
        int i11 = this.f73278h;
        if (iJ <= i11 - i10 && iJ > 0) {
            bArrG = this.f73277g;
            this.f73280j = i10 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ >= 0) {
                i10 = 0;
                if (iJ <= i11) {
                    E(iJ);
                    bArrG = this.f73277g;
                    this.f73280j = iJ;
                } else {
                    bArrG = G(iJ, false);
                }
            } else {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return C8161gw0.g(bArrG, i10, iJ);
    }
}
