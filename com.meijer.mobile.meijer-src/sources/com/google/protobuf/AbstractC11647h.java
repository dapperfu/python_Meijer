package com.google.protobuf;

import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11647h {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f91355f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f91356a;

    /* renamed from: b, reason: collision with root package name */
    int f91357b;

    /* renamed from: c, reason: collision with root package name */
    int f91358c;

    /* renamed from: d, reason: collision with root package name */
    C11648i f91359d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f91360e;

    /* renamed from: com.google.protobuf.h$b */
    private static final class b extends AbstractC11647h {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f91361g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f91362h;

        /* renamed from: i, reason: collision with root package name */
        private int f91363i;

        /* renamed from: j, reason: collision with root package name */
        private int f91364j;

        /* renamed from: k, reason: collision with root package name */
        private int f91365k;

        /* renamed from: l, reason: collision with root package name */
        private int f91366l;

        /* renamed from: m, reason: collision with root package name */
        private int f91367m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f91368n;

        /* renamed from: o, reason: collision with root package name */
        private int f91369o;

        private void P() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f91361g;
                int i11 = this.f91365k;
                this.f91365k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void Q() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f91369o = a.e.API_PRIORITY_OTHER;
            this.f91361g = bArr;
            this.f91363i = i11 + i10;
            this.f91365k = i10;
            this.f91366l = i10;
            this.f91362h = z10;
        }

        private void M() {
            int i10 = this.f91363i + this.f91364j;
            this.f91363i = i10;
            int i11 = i10 - this.f91366l;
            int i12 = this.f91369o;
            if (i11 <= i12) {
                this.f91364j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f91364j = i13;
            this.f91363i = i10 - i13;
        }

        private void O() throws IOException {
            if (this.f91363i - this.f91365k >= 10) {
                P();
            } else {
                Q();
            }
        }

        public byte F() throws IOException {
            int i10 = this.f91365k;
            if (i10 == this.f91363i) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f91361g;
            this.f91365k = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f91363i;
                int i12 = this.f91365k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f91365k = i13;
                    return Arrays.copyOfRange(this.f91361g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (i10 == 0) {
                return C11663y.f91598d;
            }
            throw InvalidProtocolBufferException.g();
        }

        public int H() throws IOException {
            int i10 = this.f91365k;
            if (this.f91363i - i10 < 4) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f91361g;
            this.f91365k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long I() throws IOException {
            int i10 = this.f91365k;
            if (this.f91363i - i10 < 8) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f91361g;
            this.f91365k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int J() throws IOException {
            int i10;
            int i11 = this.f91365k;
            int i12 = this.f91363i;
            if (i12 != i11) {
                byte[] bArr = this.f91361g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f91365k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << C14170dq.LIGHTEN) ^ i15;
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
                    this.f91365k = i14;
                    return i10;
                }
            }
            return (int) L();
        }

        public long K() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f91365k;
            int i11 = this.f91363i;
            if (i11 != i10) {
                byte[] bArr = this.f91361g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f91365k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << C14170dq.LIGHTEN) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f91365k = i13;
                    return j10;
                }
            }
            return L();
        }

        long L() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((F() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void N(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f91363i;
                int i12 = this.f91365k;
                if (i10 <= i11 - i12) {
                    this.f91365k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f91367m != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int e() {
            return this.f91365k - this.f91366l;
        }

        @Override // com.google.protobuf.AbstractC11647h
        public boolean f() throws IOException {
            return this.f91365k == this.f91363i;
        }

        @Override // com.google.protobuf.AbstractC11647h
        public void j(int i10) {
            this.f91369o = i10;
            M();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int k(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i11 = this.f91369o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.k();
            }
            this.f91369o = iE;
            M();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int A() throws IOException {
            if (f()) {
                this.f91367m = 0;
                return 0;
            }
            int iJ = J();
            this.f91367m = iJ;
            if (r0.a(iJ) != 0) {
                return this.f91367m;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int B() throws IOException {
            return J();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public long C() throws IOException {
            return K();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public boolean D(int i10) throws IOException {
            int iB = r0.b(i10);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 3) {
                            if (iB != 4) {
                                if (iB == 5) {
                                    N(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            return false;
                        }
                        E();
                        a(r0.c(r0.a(i10), 4));
                        return true;
                    }
                    N(J());
                    return true;
                }
                N(8);
                return true;
            }
            O();
            return true;
        }

        @Override // com.google.protobuf.AbstractC11647h
        public boolean l() throws IOException {
            if (K() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC11647h
        public AbstractC11646g m() throws IOException {
            AbstractC11646g abstractC11646gK;
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f91363i;
                int i11 = this.f91365k;
                if (iJ <= i10 - i11) {
                    if (this.f91362h && this.f91368n) {
                        abstractC11646gK = AbstractC11646g.C(this.f91361g, i11, iJ);
                    } else {
                        abstractC11646gK = AbstractC11646g.k(this.f91361g, i11, iJ);
                    }
                    this.f91365k += iJ;
                    return abstractC11646gK;
                }
            }
            if (iJ == 0) {
                return AbstractC11646g.f91343b;
            }
            return AbstractC11646g.B(G(iJ));
        }

        @Override // com.google.protobuf.AbstractC11647h
        public double n() throws IOException {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int o() throws IOException {
            return J();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int p() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public long q() throws IOException {
            return I();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public float r() throws IOException {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int s() throws IOException {
            return J();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public long t() throws IOException {
            return K();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int u() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public long v() throws IOException {
            return I();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public int w() throws IOException {
            return AbstractC11647h.c(J());
        }

        @Override // com.google.protobuf.AbstractC11647h
        public long x() throws IOException {
            return AbstractC11647h.d(K());
        }

        @Override // com.google.protobuf.AbstractC11647h
        public String y() throws IOException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f91363i;
                int i11 = this.f91365k;
                if (iJ <= i10 - i11) {
                    String str = new String(this.f91361g, i11, iJ, C11663y.f91596b);
                    this.f91365k += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // com.google.protobuf.AbstractC11647h
        public String z() throws IOException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f91363i;
                int i11 = this.f91365k;
                if (iJ <= i10 - i11) {
                    String strE = q0.e(this.f91361g, i11, iJ);
                    this.f91365k += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC11647h g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static AbstractC11647h h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10, i11, false);
    }

    public abstract int A() throws IOException;

    public abstract int B() throws IOException;

    public abstract long C() throws IOException;

    public abstract boolean D(int i10) throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int e();

    public abstract boolean f() throws IOException;

    public abstract void j(int i10);

    public abstract int k(int i10) throws InvalidProtocolBufferException;

    public abstract boolean l() throws IOException;

    public abstract AbstractC11646g m() throws IOException;

    public abstract double n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract float r() throws IOException;

    public abstract int s() throws IOException;

    public abstract long t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract String y() throws IOException;

    public abstract String z() throws IOException;

    private AbstractC11647h() {
        this.f91357b = f91355f;
        this.f91358c = a.e.API_PRIORITY_OTHER;
        this.f91360e = false;
    }

    static AbstractC11647h i(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.k(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public void b() throws InvalidProtocolBufferException {
        if (this.f91356a >= this.f91357b) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public void E() throws IOException {
        int iA;
        do {
            iA = A();
            if (iA != 0) {
                b();
                this.f91356a++;
                this.f91356a--;
            } else {
                return;
            }
        } while (D(iA));
    }
}
