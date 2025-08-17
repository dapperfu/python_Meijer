package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5942h {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f54244f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f54245a;

    /* renamed from: b, reason: collision with root package name */
    int f54246b;

    /* renamed from: c, reason: collision with root package name */
    int f54247c;

    /* renamed from: d, reason: collision with root package name */
    C5943i f54248d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54249e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends AbstractC5942h {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f54250g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f54251h;

        /* renamed from: i, reason: collision with root package name */
        private int f54252i;

        /* renamed from: j, reason: collision with root package name */
        private int f54253j;

        /* renamed from: k, reason: collision with root package name */
        private int f54254k;

        /* renamed from: l, reason: collision with root package name */
        private int f54255l;

        /* renamed from: m, reason: collision with root package name */
        private int f54256m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f54257n;

        /* renamed from: o, reason: collision with root package name */
        private int f54258o;

        private void R() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f54250g;
                int i11 = this.f54254k;
                this.f54254k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void S() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f54258o = a.e.API_PRIORITY_OTHER;
            this.f54250g = bArr;
            this.f54252i = i11 + i10;
            this.f54254k = i10;
            this.f54255l = i10;
            this.f54251h = z10;
        }

        private void O() {
            int i10 = this.f54252i + this.f54253j;
            this.f54252i = i10;
            int i11 = i10 - this.f54255l;
            int i12 = this.f54258o;
            if (i11 <= i12) {
                this.f54253j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f54253j = i13;
            this.f54252i = i10 - i13;
        }

        private void Q() throws IOException {
            if (this.f54252i - this.f54254k >= 10) {
                R();
            } else {
                S();
            }
        }

        public byte H() throws IOException {
            int i10 = this.f54254k;
            if (i10 == this.f54252i) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f54250g;
            this.f54254k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f54252i;
                int i12 = this.f54254k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f54254k = i13;
                    return Arrays.copyOfRange(this.f54250g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.m();
            }
            if (i10 == 0) {
                return C5958y.f54484d;
            }
            throw InvalidProtocolBufferException.g();
        }

        public int J() throws IOException {
            int i10 = this.f54254k;
            if (this.f54252i - i10 < 4) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f54250g;
            this.f54254k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws IOException {
            int i10 = this.f54254k;
            if (this.f54252i - i10 < 8) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f54250g;
            this.f54254k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int L() throws IOException {
            int i10;
            int i11 = this.f54254k;
            int i12 = this.f54252i;
            if (i12 != i11) {
                byte[] bArr = this.f54250g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f54254k = i13;
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
                    this.f54254k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f54254k;
            int i11 = this.f54252i;
            if (i11 != i10) {
                byte[] bArr = this.f54250g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f54254k = i12;
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
                    this.f54254k = i13;
                    return j10;
                }
            }
            return N();
        }

        long N() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((H() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void P(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f54252i;
                int i12 = this.f54254k;
                if (i10 <= i11 - i12) {
                    this.f54254k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f54256m != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int e() {
            return this.f54254k - this.f54255l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public boolean f() throws IOException {
            return this.f54254k == this.f54252i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public void l(int i10) {
            this.f54258o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int m(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i11 = this.f54258o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.m();
            }
            this.f54258o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public String A() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f54252i;
                int i11 = this.f54254k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f54250g, i11, iL, C5958y.f54482b);
                    this.f54254k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public String B() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f54252i;
                int i11 = this.f54254k;
                if (iL <= i10 - i11) {
                    String strA = p0.a(this.f54250g, i11, iL);
                    this.f54254k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int C() throws IOException {
            if (f()) {
                this.f54256m = 0;
                return 0;
            }
            int iL = L();
            this.f54256m = iL;
            if (q0.a(iL) != 0) {
                return this.f54256m;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int D() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long E() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public boolean F(int i10) throws IOException {
            int iB = q0.b(i10);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 3) {
                            if (iB != 4) {
                                if (iB == 5) {
                                    P(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            return false;
                        }
                        G();
                        a(q0.c(q0.a(i10), 4));
                        return true;
                    }
                    P(L());
                    return true;
                }
                P(8);
                return true;
            }
            Q();
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public boolean n() throws IOException {
            if (M() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public AbstractC5941g o() throws IOException {
            AbstractC5941g abstractC5941gL;
            int iL = L();
            if (iL > 0) {
                int i10 = this.f54252i;
                int i11 = this.f54254k;
                if (iL <= i10 - i11) {
                    if (this.f54251h && this.f54257n) {
                        abstractC5941gL = AbstractC5941g.B(this.f54250g, i11, iL);
                    } else {
                        abstractC5941gL = AbstractC5941g.l(this.f54250g, i11, iL);
                    }
                    this.f54254k += iL;
                    return abstractC5941gL;
                }
            }
            if (iL == 0) {
                return AbstractC5941g.f54232b;
            }
            return AbstractC5941g.z(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public double p() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int q() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int r() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long s() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public float t() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int u() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long v() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int w() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long x() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int y() throws IOException {
            return AbstractC5942h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long z() throws IOException {
            return AbstractC5942h.d(M());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends AbstractC5942h {

        /* renamed from: g, reason: collision with root package name */
        private final InputStream f54259g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f54260h;

        /* renamed from: i, reason: collision with root package name */
        private int f54261i;

        /* renamed from: j, reason: collision with root package name */
        private int f54262j;

        /* renamed from: k, reason: collision with root package name */
        private int f54263k;

        /* renamed from: l, reason: collision with root package name */
        private int f54264l;

        /* renamed from: m, reason: collision with root package name */
        private int f54265m;

        /* renamed from: n, reason: collision with root package name */
        private int f54266n;

        private void Z() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f54260h;
                int i11 = this.f54263k;
                this.f54263k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void a0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f54266n = a.e.API_PRIORITY_OTHER;
            C5958y.b(inputStream, "input");
            this.f54259g = inputStream;
            this.f54260h = new byte[i10];
            this.f54261i = 0;
            this.f54263k = 0;
            this.f54265m = 0;
        }

        private byte[] M(int i10) throws IOException {
            if (i10 == 0) {
                return C5958y.f54484d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = this.f54265m;
            int i12 = this.f54263k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f54247c > 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i14 = this.f54266n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw InvalidProtocolBufferException.m();
            }
            int i15 = this.f54261i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f54259g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f54260h, this.f54263k, bArr, 0, i15);
            this.f54265m += this.f54261i;
            this.f54263k = 0;
            this.f54261i = 0;
            while (i15 < i10) {
                int I10 = I(this.f54259g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f54265m += I10;
                i15 += I10;
            }
            return bArr;
        }

        private List<byte[]> N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f54259g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.f54265m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f54261i + this.f54262j;
            this.f54261i = i10;
            int i11 = this.f54265m + i10;
            int i12 = this.f54266n;
            if (i11 <= i12) {
                this.f54262j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f54262j = i13;
            this.f54261i = i10 - i13;
        }

        private void X(int i10) throws IOException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = this.f54265m;
            int i12 = this.f54263k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f54266n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw InvalidProtocolBufferException.m();
            }
            this.f54265m = i11 + i12;
            int i15 = this.f54261i - i12;
            this.f54261i = 0;
            this.f54263k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f54259g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f54259g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } finally {
                    this.f54265m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f54261i;
            int i17 = i16 - this.f54263k;
            this.f54263k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f54261i;
                if (i18 <= i19) {
                    this.f54263k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f54263k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws IOException {
            if (this.f54261i - this.f54263k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private boolean b0(int i10) throws IOException {
            int i11 = this.f54263k;
            int i12 = i11 + i10;
            int i13 = this.f54261i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f54247c;
            int i15 = this.f54265m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f54266n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f54260h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f54265m += i11;
                this.f54261i -= i11;
                this.f54263k = 0;
            }
            InputStream inputStream = this.f54259g;
            byte[] bArr2 = this.f54260h;
            int i16 = this.f54261i;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f54247c - this.f54265m) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.f54260h.length) {
                throw new IllegalStateException(this.f54259g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f54261i += I10;
            T();
            if (this.f54261i >= i10) {
                return true;
            }
            return b0(i10);
        }

        public byte K() throws IOException {
            if (this.f54263k == this.f54261i) {
                U(1);
            }
            byte[] bArr = this.f54260h;
            int i10 = this.f54263k;
            this.f54263k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws IOException {
            int i10 = this.f54263k;
            if (this.f54261i - i10 < 4) {
                U(4);
                i10 = this.f54263k;
            }
            byte[] bArr = this.f54260h;
            this.f54263k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws IOException {
            int i10 = this.f54263k;
            if (this.f54261i - i10 < 8) {
                U(8);
                i10 = this.f54263k;
            }
            byte[] bArr = this.f54260h;
            this.f54263k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int Q() throws IOException {
            int i10;
            int i11 = this.f54263k;
            int i12 = this.f54261i;
            if (i12 != i11) {
                byte[] bArr = this.f54260h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f54263k = i13;
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
                    this.f54263k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f54263k;
            int i11 = this.f54261i;
            if (i11 != i10) {
                byte[] bArr = this.f54260h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f54263k = i12;
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
                    this.f54263k = i13;
                    return j10;
                }
            }
            return S();
        }

        long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((K() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void W(int i10) throws IOException {
            int i11 = this.f54261i;
            int i12 = this.f54263k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f54263k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f54264l != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int e() {
            return this.f54265m + this.f54263k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public boolean f() throws IOException {
            return this.f54263k == this.f54261i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public void l(int i10) {
            this.f54266n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int m(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = i10 + this.f54265m + this.f54263k;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i12 = this.f54266n;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.m();
            }
            this.f54266n = i11;
            T();
            return i12;
        }

        private static int H(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC5941g J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return AbstractC5941g.k(bArrM);
            }
            int i11 = this.f54263k;
            int i12 = this.f54261i;
            int length = i12 - i11;
            this.f54265m += i12;
            this.f54263k = 0;
            this.f54261i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f54260h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC5941g.z(bArr);
        }

        private byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                if (z10) {
                    return (byte[]) bArrM.clone();
                }
                return bArrM;
            }
            int i11 = this.f54263k;
            int i12 = this.f54261i;
            int length = i12 - i11;
            this.f54265m += i12;
            this.f54263k = 0;
            this.f54261i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f54260h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private void U(int i10) throws IOException {
            if (!b0(i10)) {
                if (i10 > (this.f54247c - this.f54265m) - this.f54263k) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        private static long V(InputStream inputStream, long j10) throws IOException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.j();
                throw e10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public String A() throws IOException {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f54261i;
                int i11 = this.f54263k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f54260h, i11, iQ, C5958y.f54482b);
                    this.f54263k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ >= 0) {
                if (iQ <= this.f54261i) {
                    U(iQ);
                    String str2 = new String(this.f54260h, this.f54263k, iQ, C5958y.f54482b);
                    this.f54263k += iQ;
                    return str2;
                }
                return new String(L(iQ, false), C5958y.f54482b);
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f54263k;
            int i11 = this.f54261i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f54260h;
                this.f54263k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ >= 0) {
                    i10 = 0;
                    if (iQ <= i11) {
                        U(iQ);
                        bArrL = this.f54260h;
                        this.f54263k = iQ;
                    } else {
                        bArrL = L(iQ, false);
                    }
                } else {
                    throw InvalidProtocolBufferException.g();
                }
            }
            return p0.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int C() throws IOException {
            if (f()) {
                this.f54264l = 0;
                return 0;
            }
            int iQ = Q();
            this.f54264l = iQ;
            if (q0.a(iQ) != 0) {
                return this.f54264l;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int D() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long E() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public boolean F(int i10) throws IOException {
            int iB = q0.b(i10);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 3) {
                            if (iB != 4) {
                                if (iB == 5) {
                                    W(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            return false;
                        }
                        G();
                        a(q0.c(q0.a(i10), 4));
                        return true;
                    }
                    W(Q());
                    return true;
                }
                W(8);
                return true;
            }
            Y();
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public boolean n() throws IOException {
            if (R() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public AbstractC5941g o() throws IOException {
            int iQ = Q();
            int i10 = this.f54261i;
            int i11 = this.f54263k;
            if (iQ <= i10 - i11 && iQ > 0) {
                AbstractC5941g abstractC5941gL = AbstractC5941g.l(this.f54260h, i11, iQ);
                this.f54263k += iQ;
                return abstractC5941gL;
            }
            if (iQ == 0) {
                return AbstractC5941g.f54232b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public double p() throws IOException {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int q() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int r() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long s() throws IOException {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public float t() throws IOException {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int u() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long v() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int w() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long x() throws IOException {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public int y() throws IOException {
            return AbstractC5942h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5942h
        public long z() throws IOException {
            return AbstractC5942h.d(R());
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC5942h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC5942h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public abstract String A() throws IOException;

    public abstract String B() throws IOException;

    public abstract int C() throws IOException;

    public abstract int D() throws IOException;

    public abstract long E() throws IOException;

    public abstract boolean F(int i10) throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int e();

    public abstract boolean f() throws IOException;

    public abstract void l(int i10);

    public abstract int m(int i10) throws InvalidProtocolBufferException;

    public abstract boolean n() throws IOException;

    public abstract AbstractC5941g o() throws IOException;

    public abstract double p() throws IOException;

    public abstract int q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract float t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;

    private AbstractC5942h() {
        this.f54246b = f54244f;
        this.f54247c = a.e.API_PRIORITY_OTHER;
        this.f54249e = false;
    }

    public static AbstractC5942h g(InputStream inputStream) {
        return h(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    public static AbstractC5942h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(C5958y.f54484d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static AbstractC5942h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public void b() throws InvalidProtocolBufferException {
        if (this.f54245a >= this.f54246b) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public void G() throws IOException {
        int iC;
        do {
            iC = C();
            if (iC != 0) {
                b();
                this.f54245a++;
                this.f54245a--;
            } else {
                return;
            }
        } while (F(iC));
    }
}
