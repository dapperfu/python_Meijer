package com.google.android.gms.internal.vision;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzii extends AbstractC11149e0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f85536b = Logger.getLogger(zzii.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f85537c = l2.m();

    /* renamed from: a, reason: collision with root package name */
    C11210x0 f85538a;

    private static class a extends zzii {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f85539d;

        /* renamed from: e, reason: collision with root package name */
        private final int f85540e;

        /* renamed from: f, reason: collision with root package name */
        private final int f85541f;

        /* renamed from: g, reason: collision with root package name */
        private int f85542g;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i11) | i11) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.f85539d = bArr;
            this.f85540e = 0;
            this.f85542g = 0;
            this.f85541f = i11;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void P(int i10, int i11) throws IOException {
            m(i10, 0);
            j(i11);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void R(int i10, AbstractC11161h0 abstractC11161h0) throws IOException {
            m(1, 3);
            X(2, i10);
            o(3, abstractC11161h0);
            m(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void X(int i10, int i11) throws IOException {
            m(i10, 0);
            O(i11);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void Y(int i10, long j10) throws IOException {
            m(i10, 1);
            Z(j10);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void j0(int i10, int i11) throws IOException {
            m(i10, 5);
            e0(i11);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void n(int i10, long j10) throws IOException {
            m(i10, 0);
            t(j10);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void o(int i10, AbstractC11161h0 abstractC11161h0) throws IOException {
            m(i10, 2);
            u(abstractC11161h0);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void p(int i10, InterfaceC11208w1 interfaceC11208w1) throws IOException {
            m(1, 3);
            X(2, i10);
            m(3, 2);
            v(interfaceC11208w1);
            m(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        final void q(int i10, InterfaceC11208w1 interfaceC11208w1, O1 o12) throws IOException {
            m(i10, 2);
            X x10 = (X) interfaceC11208w1;
            int iE = x10.e();
            if (iE == -1) {
                iE = o12.zzb(x10);
                x10.c(iE);
            }
            O(iE);
            o12.c(interfaceC11208w1, this.f85538a);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void r(int i10, String str) throws IOException {
            m(i10, 2);
            w(str);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void s(int i10, boolean z10) throws IOException {
            m(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        private final void F0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f85539d, this.f85542g, i11);
                this.f85542g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f85542g), Integer.valueOf(this.f85541f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void Z(long j10) throws IOException {
            try {
                byte[] bArr = this.f85539d;
                int i10 = this.f85542g;
                int i11 = i10 + 1;
                this.f85542g = i11;
                bArr[i10] = (byte) j10;
                int i12 = i10 + 2;
                this.f85542g = i12;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i10 + 3;
                this.f85542g = i13;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i10 + 4;
                this.f85542g = i14;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i10 + 5;
                this.f85542g = i15;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i10 + 6;
                this.f85542g = i16;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i10 + 7;
                this.f85542g = i17;
                bArr[i16] = (byte) (j10 >> 48);
                this.f85542g = i10 + 8;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f85542g), Integer.valueOf(this.f85541f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final int b() {
            return this.f85541f - this.f85542g;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void e0(int i10) throws IOException {
            try {
                byte[] bArr = this.f85539d;
                int i11 = this.f85542g;
                int i12 = i11 + 1;
                this.f85542g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f85542g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f85542g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f85542g = i11 + 4;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f85542g), Integer.valueOf(this.f85541f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void g(byte b10) throws IOException {
            try {
                byte[] bArr = this.f85539d;
                int i10 = this.f85542g;
                this.f85542g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f85542g), Integer.valueOf(this.f85541f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void j(int i10) throws IOException {
            if (i10 >= 0) {
                O(i10);
            } else {
                t(i10);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void m(int i10, int i11) throws IOException {
            O((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void w(String str) throws IOException {
            int i10 = this.f85542g;
            try {
                int iO0 = zzii.o0(str.length() * 3);
                int iO02 = zzii.o0(str.length());
                if (iO02 != iO0) {
                    O(o2.d(str));
                    this.f85542g = o2.e(str, this.f85539d, this.f85542g, b());
                    return;
                }
                int i11 = i10 + iO02;
                this.f85542g = i11;
                int iE = o2.e(str, this.f85539d, i11, b());
                this.f85542g = i10;
                O((iE - i10) - iO02);
                this.f85542g = iE;
            } catch (r2 e10) {
                this.f85542g = i10;
                x(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void O(int i10) throws IOException {
            if (zzii.f85537c && !Z.b() && b() >= 5) {
                if ((i10 & (-128)) == 0) {
                    byte[] bArr = this.f85539d;
                    int i11 = this.f85542g;
                    this.f85542g = i11 + 1;
                    l2.l(bArr, i11, (byte) i10);
                    return;
                }
                byte[] bArr2 = this.f85539d;
                int i12 = this.f85542g;
                this.f85542g = i12 + 1;
                l2.l(bArr2, i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & (-128)) == 0) {
                    byte[] bArr3 = this.f85539d;
                    int i14 = this.f85542g;
                    this.f85542g = i14 + 1;
                    l2.l(bArr3, i14, (byte) i13);
                    return;
                }
                byte[] bArr4 = this.f85539d;
                int i15 = this.f85542g;
                this.f85542g = i15 + 1;
                l2.l(bArr4, i15, (byte) (i13 | 128));
                int i16 = i10 >>> 14;
                if ((i16 & (-128)) == 0) {
                    byte[] bArr5 = this.f85539d;
                    int i17 = this.f85542g;
                    this.f85542g = i17 + 1;
                    l2.l(bArr5, i17, (byte) i16);
                    return;
                }
                byte[] bArr6 = this.f85539d;
                int i18 = this.f85542g;
                this.f85542g = i18 + 1;
                l2.l(bArr6, i18, (byte) (i16 | 128));
                int i19 = i10 >>> 21;
                if ((i19 & (-128)) == 0) {
                    byte[] bArr7 = this.f85539d;
                    int i20 = this.f85542g;
                    this.f85542g = i20 + 1;
                    l2.l(bArr7, i20, (byte) i19);
                    return;
                }
                byte[] bArr8 = this.f85539d;
                int i21 = this.f85542g;
                this.f85542g = i21 + 1;
                l2.l(bArr8, i21, (byte) (i19 | 128));
                byte[] bArr9 = this.f85539d;
                int i22 = this.f85542g;
                this.f85542g = i22 + 1;
                l2.l(bArr9, i22, (byte) (i10 >>> 28));
                return;
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f85539d;
                    int i23 = this.f85542g;
                    this.f85542g = i23 + 1;
                    bArr10[i23] = (byte) ((i10 & l3.f93324d) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f85542g), Integer.valueOf(this.f85541f), 1), e10);
                }
            }
            byte[] bArr11 = this.f85539d;
            int i24 = this.f85542g;
            this.f85542g = i24 + 1;
            bArr11[i24] = (byte) i10;
        }

        @Override // com.google.android.gms.internal.vision.AbstractC11149e0
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            F0(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void t(long j10) throws IOException {
            if (zzii.f85537c && b() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f85539d;
                    int i10 = this.f85542g;
                    this.f85542g = i10 + 1;
                    l2.l(bArr, i10, (byte) ((((int) j10) & l3.f93324d) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f85539d;
                int i11 = this.f85542g;
                this.f85542g = i11 + 1;
                l2.l(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f85539d;
                    int i12 = this.f85542g;
                    this.f85542g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & l3.f93324d) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f85542g), Integer.valueOf(this.f85541f), 1), e10);
                }
            }
            byte[] bArr4 = this.f85539d;
            int i13 = this.f85542g;
            this.f85542g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void u(AbstractC11161h0 abstractC11161h0) throws IOException {
            O(abstractC11161h0.e());
            abstractC11161h0.o(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void v(InterfaceC11208w1 interfaceC11208w1) throws IOException {
            O(interfaceC11208w1.zzm());
            interfaceC11208w1.a(this);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzb(String str, Throwable th2) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th2);
        }
    }

    private zzii() {
    }

    public static int A(float f10) {
        return 4;
    }

    private static int E0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int L(boolean z10) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return o0(length) + length;
    }

    public static zzii f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int i0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int o0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int r0(long j10) {
        return 8;
    }

    public static int v0(long j10) {
        return 8;
    }

    public static int w0(int i10) {
        return 4;
    }

    private static long y0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int z(double d10) {
        return 8;
    }

    public static int z0(int i10) {
        return 4;
    }

    public abstract void O(int i10) throws IOException;

    public abstract void P(int i10, int i11) throws IOException;

    public abstract void R(int i10, AbstractC11161h0 abstractC11161h0) throws IOException;

    public abstract void X(int i10, int i11) throws IOException;

    public abstract void Y(int i10, long j10) throws IOException;

    public abstract void Z(long j10) throws IOException;

    public abstract int b();

    public abstract void e0(int i10) throws IOException;

    public abstract void g(byte b10) throws IOException;

    public abstract void j(int i10) throws IOException;

    public abstract void j0(int i10, int i11) throws IOException;

    public abstract void m(int i10, int i11) throws IOException;

    public abstract void n(int i10, long j10) throws IOException;

    public abstract void o(int i10, AbstractC11161h0 abstractC11161h0) throws IOException;

    public abstract void p(int i10, InterfaceC11208w1 interfaceC11208w1) throws IOException;

    abstract void q(int i10, InterfaceC11208w1 interfaceC11208w1, O1 o12) throws IOException;

    public abstract void r(int i10, String str) throws IOException;

    public abstract void s(int i10, boolean z10) throws IOException;

    public abstract void t(long j10) throws IOException;

    public abstract void u(AbstractC11161h0 abstractC11161h0) throws IOException;

    public abstract void v(InterfaceC11208w1 interfaceC11208w1) throws IOException;

    public abstract void w(String str) throws IOException;

    public final void y(boolean z10) throws IOException {
        g(z10 ? (byte) 1 : (byte) 0);
    }

    public static int A0(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    public static int B(int i10, double d10) {
        return o0(i10 << 3) + 8;
    }

    public static int C(int i10, float f10) {
        return o0(i10 << 3) + 4;
    }

    public static int C0(int i10, int i11) {
        return o0(i10 << 3) + k0(i11);
    }

    public static int D(int i10, C11150e1 c11150e1) {
        return (o0(8) << 1) + p0(2, i10) + c(3, c11150e1);
    }

    public static int E(int i10, InterfaceC11208w1 interfaceC11208w1) {
        return (o0(8) << 1) + p0(2, i10) + o0(24) + J(interfaceC11208w1);
    }

    static int F(int i10, InterfaceC11208w1 interfaceC11208w1, O1 o12) {
        return o0(i10 << 3) + e(interfaceC11208w1, o12);
    }

    public static int G(int i10, String str) {
        return o0(i10 << 3) + K(str);
    }

    public static int H(int i10, boolean z10) {
        return o0(i10 << 3) + 1;
    }

    public static int T(int i10, AbstractC11161h0 abstractC11161h0) {
        int iO0 = o0(i10 << 3);
        int iE = abstractC11161h0.e();
        return iO0 + o0(iE) + iE;
    }

    @Deprecated
    static int U(int i10, InterfaceC11208w1 interfaceC11208w1, O1 o12) {
        int iO0 = o0(i10 << 3) << 1;
        X x10 = (X) interfaceC11208w1;
        int iE = x10.e();
        if (iE == -1) {
            iE = o12.zzb(x10);
            x10.c(iE);
        }
        return iO0 + iE;
    }

    public static int b0(int i10, long j10) {
        return o0(i10 << 3) + i0(j10);
    }

    public static int c(int i10, C11150e1 c11150e1) {
        int iO0 = o0(i10 << 3);
        int iB = c11150e1.b();
        return iO0 + o0(iB) + iB;
    }

    public static int c0(int i10, AbstractC11161h0 abstractC11161h0) {
        return (o0(8) << 1) + p0(2, i10) + T(3, abstractC11161h0);
    }

    static int e(InterfaceC11208w1 interfaceC11208w1, O1 o12) {
        X x10 = (X) interfaceC11208w1;
        int iE = x10.e();
        if (iE == -1) {
            iE = o12.zzb(x10);
            x10.c(iE);
        }
        return o0(iE) + iE;
    }

    public static int g0(int i10) {
        return o0(i10 << 3);
    }

    public static int h0(int i10, long j10) {
        return o0(i10 << 3) + i0(j10);
    }

    public static int k0(int i10) {
        if (i10 >= 0) {
            return o0(i10);
        }
        return 10;
    }

    public static int l0(int i10, int i11) {
        return o0(i10 << 3) + k0(i11);
    }

    public static int m0(int i10, long j10) {
        return o0(i10 << 3) + i0(y0(j10));
    }

    public static int p0(int i10, int i11) {
        return o0(i10 << 3) + o0(i11);
    }

    public static int q0(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int t0(int i10, int i11) {
        return o0(i10 << 3) + o0(E0(i11));
    }

    public static int u0(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int x0(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    final void x(String str, r2 r2Var) throws IOException {
        f85536b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) r2Var);
        byte[] bytes = str.getBytes(S0.f85305a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (zzb e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzb(e11);
        }
    }

    public static int B0(int i10) {
        return k0(i10);
    }

    @Deprecated
    public static int D0(int i10) {
        return o0(i10);
    }

    public static int I(AbstractC11161h0 abstractC11161h0) {
        int iE = abstractC11161h0.e();
        return o0(iE) + iE;
    }

    public static int J(InterfaceC11208w1 interfaceC11208w1) {
        int iZzm = interfaceC11208w1.zzm();
        return o0(iZzm) + iZzm;
    }

    public static int K(String str) {
        int length;
        try {
            length = o2.d(str);
        } catch (r2 unused) {
            length = str.getBytes(S0.f85305a).length;
        }
        return o0(length) + length;
    }

    @Deprecated
    public static int V(InterfaceC11208w1 interfaceC11208w1) {
        return interfaceC11208w1.zzm();
    }

    public static int d(C11150e1 c11150e1) {
        int iB = c11150e1.b();
        return o0(iB) + iB;
    }

    public static int d0(long j10) {
        return i0(j10);
    }

    public static int n0(long j10) {
        return i0(y0(j10));
    }

    public static int s0(int i10) {
        return o0(E0(i10));
    }

    public final void N() {
        if (b() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void Q(int i10, long j10) throws IOException {
        n(i10, y0(j10));
    }

    public final void S(long j10) throws IOException {
        t(y0(j10));
    }

    public final void W(int i10) throws IOException {
        O(E0(i10));
    }

    public final void f0(int i10, int i11) throws IOException {
        X(i10, E0(i11));
    }

    public final void h(double d10) throws IOException {
        Z(Double.doubleToRawLongBits(d10));
    }

    public final void i(float f10) throws IOException {
        e0(Float.floatToRawIntBits(f10));
    }

    public final void k(int i10, double d10) throws IOException {
        Y(i10, Double.doubleToRawLongBits(d10));
    }

    public final void l(int i10, float f10) throws IOException {
        j0(i10, Float.floatToRawIntBits(f10));
    }
}
