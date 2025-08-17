package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.au0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7517au0 extends AbstractC7943eu0 {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f72558f;

    /* renamed from: g, reason: collision with root package name */
    private int f72559g;

    /* renamed from: h, reason: collision with root package name */
    private int f72560h;

    /* renamed from: i, reason: collision with root package name */
    private int f72561i;

    /* renamed from: j, reason: collision with root package name */
    private final int f72562j;

    /* renamed from: k, reason: collision with root package name */
    private int f72563k;

    /* renamed from: l, reason: collision with root package name */
    private int f72564l;

    /* synthetic */ C7517au0(byte[] bArr, int i10, int i11, boolean z10, C7836du0 c7836du0) {
        super(null);
        this.f72564l = a.e.API_PRIORITY_OTHER;
        this.f72558f = bArr;
        this.f72559g = i11 + i10;
        this.f72561i = i10;
        this.f72562j = i10;
    }

    private final void B() {
        int i10 = this.f72559g + this.f72560h;
        this.f72559g = i10;
        int i11 = i10 - this.f72562j;
        int i12 = this.f72564l;
        if (i11 <= i12) {
            this.f72560h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f72560h = i13;
        this.f72559g = i10 - i13;
    }

    final long G() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f72561i;
            if (i11 == this.f72559g) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.f72558f;
            this.f72561i = i11 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((bArr[i11] & 128) == 0) {
                return j10;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final boolean a() throws IOException {
        return this.f72561i == this.f72559g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int i() {
        return this.f72561i - this.f72562j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final void A(int i10) {
        this.f72564l = i10;
        B();
    }

    public final int C() throws IOException {
        int i10 = this.f72561i;
        if (this.f72559g - i10 < 4) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f72558f;
        this.f72561i = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int D() throws IOException {
        int i10;
        int i11 = this.f72561i;
        int i12 = this.f72559g;
        if (i12 != i11) {
            byte[] bArr = this.f72558f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f72561i = i13;
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
                this.f72561i = i14;
                return i10;
            }
        }
        return (int) G();
    }

    public final long E() throws IOException {
        int i10 = this.f72561i;
        if (this.f72559g - i10 < 8) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f72558f;
        this.f72561i = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    public final long F() throws IOException {
        long j10;
        long j11;
        int i10 = this.f72561i;
        int i11 = this.f72559g;
        if (i11 != i10) {
            byte[] bArr = this.f72558f;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f72561i = i12;
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
                this.f72561i = i13;
                return j10;
            }
        }
        return G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int j(int i10) throws zzgyg {
        if (i10 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + (this.f72561i - this.f72562j);
        if (i11 < 0) {
            throw new zzgyg("Failed to parse the message.");
        }
        int i12 = this.f72564l;
        if (i11 > i12) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f72564l = i11;
        B();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final void z(int i10) throws zzgyg {
        if (this.f72563k != i10) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final boolean b() throws IOException {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final double g() throws IOException {
        return Double.longBitsToDouble(E());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final float h() throws IOException {
        return Float.intBitsToFloat(C());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int k() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int l() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int m() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int n() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int o() throws IOException {
        return AbstractC7943eu0.c(D());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int p() throws IOException {
        if (a()) {
            this.f72563k = 0;
            return 0;
        }
        int iD = D();
        this.f72563k = iD;
        if ((iD >>> 3) != 0) {
            return iD;
        }
        throw new zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final int q() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long r() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long s() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long t() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long u() throws IOException {
        return AbstractC7943eu0.d(F());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final long v() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final Zt0 w() throws IOException {
        int iD = D();
        if (iD > 0) {
            int i10 = this.f72559g;
            int i11 = this.f72561i;
            if (iD <= i10 - i11) {
                Zt0 zt0Z = Zt0.z(this.f72558f, i11, iD);
                this.f72561i += iD;
                return zt0Z;
            }
        }
        if (iD != 0) {
            if (iD > 0) {
                int i12 = this.f72559g;
                int i13 = this.f72561i;
                if (iD <= i12 - i13) {
                    int i14 = iD + i13;
                    this.f72561i = i14;
                    return new Wt0(Arrays.copyOfRange(this.f72558f, i13, i14));
                }
            }
            if (iD <= 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return Zt0.f72282b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final String x() throws IOException {
        int iD = D();
        if (iD > 0) {
            int i10 = this.f72559g;
            int i11 = this.f72561i;
            if (iD <= i10 - i11) {
                String str = new String(this.f72558f, i11, iD, Tu0.f70472a);
                this.f72561i += iD;
                return str;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7943eu0
    public final String y() throws IOException {
        int iD = D();
        if (iD > 0) {
            int i10 = this.f72559g;
            int i11 = this.f72561i;
            if (iD <= i10 - i11) {
                String strG = C8161gw0.g(this.f72558f, i11, iD);
                this.f72561i += iD;
                return strG;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD <= 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
