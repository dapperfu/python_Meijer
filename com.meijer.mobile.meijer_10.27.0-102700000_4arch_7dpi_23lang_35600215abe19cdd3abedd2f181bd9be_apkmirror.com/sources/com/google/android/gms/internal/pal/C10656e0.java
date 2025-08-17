package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10656e0 extends AbstractC10689g0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f83091e;

    /* renamed from: f, reason: collision with root package name */
    private int f83092f;

    /* renamed from: g, reason: collision with root package name */
    private int f83093g;

    /* renamed from: h, reason: collision with root package name */
    private int f83094h;

    /* renamed from: i, reason: collision with root package name */
    private int f83095i;

    /* renamed from: j, reason: collision with root package name */
    private int f83096j;

    /* synthetic */ C10656e0(byte[] bArr, int i10, int i11, boolean z10, C10622c0 c10622c0) {
        super(null);
        this.f83096j = a.e.API_PRIORITY_OTHER;
        this.f83091e = bArr;
        this.f83092f = i11;
        this.f83094h = 0;
    }

    private final void v() {
        int i10 = this.f83092f + this.f83093g;
        this.f83092f = i10;
        int i11 = this.f83096j;
        if (i10 <= i11) {
            this.f83093g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f83093g = i12;
        this.f83092f = i10 - i12;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final int a() {
        return this.f83094h;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final boolean i() throws IOException {
        return this.f83094h == this.f83092f;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final int b(int i10) throws zzadi {
        if (i10 < 0) {
            throw zzadi.f();
        }
        int i11 = i10 + this.f83094h;
        if (i11 < 0) {
            throw zzadi.g();
        }
        int i12 = this.f83096j;
        if (i11 > i12) {
            throw zzadi.i();
        }
        this.f83096j = i11;
        v();
        return i12;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final void g(int i10) throws zzadi {
        if (this.f83095i != i10) {
            throw zzadi.b();
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final void h(int i10) {
        this.f83096j = i10;
        v();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final boolean k(int i10) throws IOException {
        int iC;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f83092f - this.f83094h < 10) {
                while (i12 < 10) {
                    if (o() < 0) {
                        i12++;
                    }
                }
                throw zzadi.e();
            }
            while (i12 < 10) {
                byte[] bArr = this.f83091e;
                int i13 = this.f83094h;
                this.f83094h = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzadi.e();
            return true;
        }
        if (i11 == 1) {
            u(8);
            return true;
        }
        if (i11 == 2) {
            u(q());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzadi.a();
            }
            u(4);
            return true;
        }
        do {
            iC = c();
            if (iC == 0) {
                break;
            }
        } while (k(iC));
        g(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final byte o() throws IOException {
        int i10 = this.f83094h;
        if (i10 == this.f83092f) {
            throw zzadi.i();
        }
        byte[] bArr = this.f83091e;
        this.f83094h = i10 + 1;
        return bArr[i10];
    }

    public final int p() throws IOException {
        int i10 = this.f83094h;
        if (this.f83092f - i10 < 4) {
            throw zzadi.i();
        }
        byte[] bArr = this.f83091e;
        this.f83094h = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final int q() throws IOException {
        int i10;
        int i11 = this.f83094h;
        int i12 = this.f83092f;
        if (i12 != i11) {
            byte[] bArr = this.f83091e;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f83094h = i13;
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
                this.f83094h = i14;
                return i10;
            }
        }
        return (int) t();
    }

    public final long r() throws IOException {
        int i10 = this.f83094h;
        if (this.f83092f - i10 < 8) {
            throw zzadi.i();
        }
        byte[] bArr = this.f83091e;
        this.f83094h = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long s() throws IOException {
        long j10;
        long j11;
        int i10 = this.f83094h;
        int i11 = this.f83092f;
        if (i11 != i10) {
            byte[] bArr = this.f83091e;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f83094h = i12;
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
                            long j13 = i18 ^ (bArr[i17] << 28);
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
                this.f83094h = i13;
                return j10;
            }
        }
        return t();
    }

    final long t() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((o() & 128) == 0) {
                return j10;
            }
        }
        throw zzadi.e();
    }

    public final void u(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.f83092f;
            int i12 = this.f83094h;
            if (i10 <= i11 - i12) {
                this.f83094h = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzadi.i();
        }
        throw zzadi.f();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final int c() throws IOException {
        if (i()) {
            this.f83095i = 0;
            return 0;
        }
        int iQ = q();
        this.f83095i = iQ;
        if ((iQ >>> 3) != 0) {
            return iQ;
        }
        throw zzadi.c();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final AbstractC10605b0 d() throws IOException {
        int iQ = q();
        if (iQ > 0) {
            int i10 = this.f83092f;
            int i11 = this.f83094h;
            if (iQ <= i10 - i11) {
                AbstractC10605b0 abstractC10605b0T = AbstractC10605b0.t(this.f83091e, i11, iQ);
                this.f83094h += iQ;
                return abstractC10605b0T;
            }
        }
        if (iQ != 0) {
            if (iQ > 0) {
                int i12 = this.f83092f;
                int i13 = this.f83094h;
                if (iQ <= i12 - i13) {
                    int i14 = iQ + i13;
                    this.f83094h = i14;
                    return AbstractC10605b0.v(Arrays.copyOfRange(this.f83091e, i13, i14));
                }
            }
            if (iQ <= 0) {
                throw zzadi.f();
            }
            throw zzadi.i();
        }
        return AbstractC10605b0.f83055b;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final String e() throws IOException {
        int iQ = q();
        if (iQ > 0) {
            int i10 = this.f83092f;
            int i11 = this.f83094h;
            if (iQ <= i10 - i11) {
                String str = new String(this.f83091e, i11, iQ, J0.f82677b);
                this.f83094h += iQ;
                return str;
            }
        }
        if (iQ == 0) {
            return "";
        }
        if (iQ < 0) {
            throw zzadi.f();
        }
        throw zzadi.i();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final String f() throws IOException {
        int iQ = q();
        if (iQ > 0) {
            int i10 = this.f83092f;
            int i11 = this.f83094h;
            if (iQ <= i10 - i11) {
                String strD = Y1.d(this.f83091e, i11, iQ);
                this.f83094h += iQ;
                return strD;
            }
        }
        if (iQ == 0) {
            return "";
        }
        if (iQ <= 0) {
            throw zzadi.f();
        }
        throw zzadi.i();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10689g0
    public final boolean j() throws IOException {
        if (s() != 0) {
            return true;
        }
        return false;
    }
}
