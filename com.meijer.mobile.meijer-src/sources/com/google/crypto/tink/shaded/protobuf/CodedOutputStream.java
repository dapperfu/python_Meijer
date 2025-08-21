package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p0;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public abstract class CodedOutputStream extends AbstractC11436g {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f89102c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f89103d = o0.E();

    /* renamed from: a, reason: collision with root package name */
    C11440k f89104a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f89105b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f89106e;

        /* renamed from: f, reason: collision with root package name */
        private final int f89107f;

        /* renamed from: g, reason: collision with root package name */
        private final int f89108g;

        /* renamed from: h, reason: collision with root package name */
        private int f89109h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f89106e = bArr;
            this.f89107f = i10;
            this.f89109h = i10;
            this.f89108g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void A0(int i10, Q q10) throws IOException {
            L0(1, 3);
            M0(2, i10);
            S0(3, q10);
            L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B0(int i10, AbstractC11437h abstractC11437h) throws IOException {
            L0(1, 3);
            M0(2, i10);
            i0(3, abstractC11437h);
            L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void K0(int i10, String str) throws IOException {
            L0(i10, 2);
            U0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void M0(int i10, int i11) throws IOException {
            L0(i10, 0);
            N0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void O0(int i10, long j10) throws IOException {
            L0(i10, 0);
            P0(j10);
        }

        public final void S0(int i10, Q q10) throws IOException {
            L0(i10, 2);
            T0(q10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g0(int i10, boolean z10) throws IOException {
            L0(i10, 0);
            f0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i10, AbstractC11437h abstractC11437h) throws IOException {
            L0(i10, 2);
            R0(abstractC11437h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i10, int i11) throws IOException {
            L0(i10, 5);
            o0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i10, long j10) throws IOException {
            L0(i10, 1);
            q0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void v0(int i10, int i11) throws IOException {
            L0(i10, 0);
            w0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void z0(int i10, Q q10, f0 f0Var) throws IOException {
            L0(i10, 2);
            N0(((AbstractC11430a) q10).k(f0Var));
            f0Var.j(q10, this.f89104a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void N0(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f89106e;
                    int i11 = this.f89109h;
                    this.f89109h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & l3.f93323c);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f89109h), Integer.valueOf(this.f89108g), 1), e10);
                }
            }
            byte[] bArr2 = this.f89106e;
            int i12 = this.f89109h;
            this.f89109h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        public final void Q0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f89106e, this.f89109h, i11);
                this.f89109h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f89109h), Integer.valueOf(this.f89108g), Integer.valueOf(i11)), e10);
            }
        }

        public final void U0(String str) throws IOException {
            int i10 = this.f89109h;
            try {
                int iV = CodedOutputStream.V(str.length() * 3);
                int iV2 = CodedOutputStream.V(str.length());
                if (iV2 != iV) {
                    N0(p0.g(str));
                    this.f89109h = p0.f(str, this.f89106e, this.f89109h, e0());
                    return;
                }
                int i11 = i10 + iV2;
                this.f89109h = i11;
                int iF = p0.f(str, this.f89106e, i11, e0());
                this.f89109h = i10;
                N0((iF - i10) - iV2);
                this.f89109h = iF;
            } catch (p0.d e10) {
                this.f89109h = i10;
                a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int e0() {
            return this.f89108g - this.f89109h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void f0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f89106e;
                int i10 = this.f89109h;
                this.f89109h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f89109h), Integer.valueOf(this.f89108g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i10) throws IOException {
            try {
                byte[] bArr = this.f89106e;
                int i11 = this.f89109h;
                int i12 = i11 + 1;
                this.f89109h = i12;
                bArr[i11] = (byte) (i10 & l3.f93323c);
                int i13 = i11 + 2;
                this.f89109h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & l3.f93323c);
                int i14 = i11 + 3;
                this.f89109h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & l3.f93323c);
                this.f89109h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & l3.f93323c);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f89109h), Integer.valueOf(this.f89108g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(long j10) throws IOException {
            try {
                byte[] bArr = this.f89106e;
                int i10 = this.f89109h;
                int i11 = i10 + 1;
                this.f89109h = i11;
                bArr[i10] = (byte) (((int) j10) & l3.f93323c);
                int i12 = i10 + 2;
                this.f89109h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & l3.f93323c);
                int i13 = i10 + 3;
                this.f89109h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & l3.f93323c);
                int i14 = i10 + 4;
                this.f89109h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & l3.f93323c);
                int i15 = i10 + 5;
                this.f89109h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & l3.f93323c);
                int i16 = i10 + 6;
                this.f89109h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & l3.f93323c);
                int i17 = i10 + 7;
                this.f89109h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & l3.f93323c);
                this.f89109h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & l3.f93323c);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f89109h), Integer.valueOf(this.f89108g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void w0(int i10) throws IOException {
            if (i10 >= 0) {
                N0(i10);
            } else {
                P0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void L0(int i10, int i11) throws IOException {
            N0(q0.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P0(long j10) throws IOException {
            if (CodedOutputStream.f89103d && e0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f89106e;
                    int i10 = this.f89109h;
                    this.f89109h = i10 + 1;
                    o0.K(bArr, i10, (byte) ((((int) j10) | 128) & l3.f93323c));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f89106e;
                int i11 = this.f89109h;
                this.f89109h = i11 + 1;
                o0.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f89106e;
                    int i12 = this.f89109h;
                    this.f89109h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & l3.f93323c);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f89109h), Integer.valueOf(this.f89108g), 1), e10);
                }
            }
            byte[] bArr4 = this.f89106e;
            int i13 = this.f89109h;
            this.f89109h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void R0(AbstractC11437h abstractC11437h) throws IOException {
            N0(abstractC11437h.size());
            abstractC11437h.C(this);
        }

        public final void T0(Q q10) throws IOException {
            N0(q10.c());
            q10.i(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.AbstractC11436g
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            Q0(bArr, i10, i11);
        }
    }

    public static int D(int i10, Q q10) {
        return (T(1) * 2) + U(2, i10) + E(3, q10);
    }

    public static int I(int i10, AbstractC11437h abstractC11437h) {
        return (T(1) * 2) + U(2, i10) + g(3, abstractC11437h);
    }

    public static int K(int i10) {
        return 4;
    }

    public static int M(long j10) {
        return 8;
    }

    public static int T(int i10) {
        return V(q0.c(i10, 0));
    }

    public static int Y(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long Z(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream c0(byte[] bArr) {
        return d0(bArr, 0, bArr.length);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int n(int i10) {
        return 4;
    }

    public static int p(long j10) {
        return 8;
    }

    public static int r(float f10) {
        return 4;
    }

    public static int w(int i10) {
        return X(i10);
    }

    public static int z(int i10, C c10) {
        return (T(1) * 2) + U(2, i10) + A(3, c10);
    }

    public abstract void A0(int i10, Q q10) throws IOException;

    public abstract void B0(int i10, AbstractC11437h abstractC11437h) throws IOException;

    public abstract void K0(int i10, String str) throws IOException;

    public abstract void L0(int i10, int i11) throws IOException;

    public abstract void M0(int i10, int i11) throws IOException;

    public abstract void N0(int i10) throws IOException;

    public abstract void O0(int i10, long j10) throws IOException;

    public abstract void P0(long j10) throws IOException;

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11436g
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int e0();

    public abstract void f0(byte b10) throws IOException;

    public abstract void g0(int i10, boolean z10) throws IOException;

    public final void h0(boolean z10) throws IOException {
        f0(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void i0(int i10, AbstractC11437h abstractC11437h) throws IOException;

    public abstract void n0(int i10, int i11) throws IOException;

    public abstract void o0(int i10) throws IOException;

    public abstract void p0(int i10, long j10) throws IOException;

    public abstract void q0(long j10) throws IOException;

    @Deprecated
    final void t0(int i10, Q q10, f0 f0Var) throws IOException {
        L0(i10, 3);
        u0(q10, f0Var);
        L0(i10, 4);
    }

    public abstract void v0(int i10, int i11) throws IOException;

    public abstract void w0(int i10) throws IOException;

    abstract void z0(int i10, Q q10, f0 f0Var) throws IOException;

    private CodedOutputStream() {
    }

    static int H(Q q10, f0 f0Var) {
        return C(((AbstractC11430a) q10).k(f0Var));
    }

    public static CodedOutputStream d0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    @Deprecated
    static int u(Q q10, f0 f0Var) {
        return ((AbstractC11430a) q10).k(f0Var);
    }

    final void a0(String str, p0.d dVar) throws IOException {
        f89102c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C11454z.f89432b);
        try {
            N0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean b0() {
        return this.f89105b;
    }

    @Deprecated
    final void u0(Q q10, f0 f0Var) throws IOException {
        f0Var.j(q10, this.f89104a);
    }

    public static int A(int i10, C c10) {
        return T(i10) + B(c10);
    }

    public static int B(C c10) {
        return C(c10.b());
    }

    static int C(int i10) {
        return V(i10) + i10;
    }

    public static int E(int i10, Q q10) {
        return T(i10) + G(q10);
    }

    static int F(int i10, Q q10, f0 f0Var) {
        return T(i10) + H(q10, f0Var);
    }

    public static int G(Q q10) {
        return C(q10.c());
    }

    public static int J(int i10, int i11) {
        return T(i10) + K(i11);
    }

    public static int L(int i10, long j10) {
        return T(i10) + M(j10);
    }

    public static int N(int i10, int i11) {
        return T(i10) + O(i11);
    }

    public static int O(int i10) {
        return V(Y(i10));
    }

    public static int P(int i10, long j10) {
        return T(i10) + Q(j10);
    }

    public static int Q(long j10) {
        return X(Z(j10));
    }

    public static int R(int i10, String str) {
        return T(i10) + S(str);
    }

    public static int S(String str) {
        int length;
        try {
            length = p0.g(str);
        } catch (p0.d unused) {
            length = str.getBytes(C11454z.f89432b).length;
        }
        return C(length);
    }

    public static int U(int i10, int i11) {
        return T(i10) + V(i11);
    }

    public static int V(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int W(int i10, long j10) {
        return T(i10) + X(j10);
    }

    public static int X(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int d(int i10, boolean z10) {
        return T(i10) + e(z10);
    }

    public static int g(int i10, AbstractC11437h abstractC11437h) {
        return T(i10) + h(abstractC11437h);
    }

    public static int h(AbstractC11437h abstractC11437h) {
        return C(abstractC11437h.size());
    }

    public static int i(int i10, double d10) {
        return T(i10) + j(d10);
    }

    public static int k(int i10, int i11) {
        return T(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return T(i10) + n(i11);
    }

    public static int o(int i10, long j10) {
        return T(i10) + p(j10);
    }

    public static int q(int i10, float f10) {
        return T(i10) + r(f10);
    }

    @Deprecated
    static int s(int i10, Q q10, f0 f0Var) {
        return (T(i10) * 2) + u(q10, f0Var);
    }

    @Deprecated
    public static int t(Q q10) {
        return q10.c();
    }

    public static int v(int i10, int i11) {
        return T(i10) + w(i11);
    }

    public static int x(int i10, long j10) {
        return T(i10) + y(j10);
    }

    public static int y(long j10) {
        return X(j10);
    }

    public final void C0(int i10, int i11) throws IOException {
        n0(i10, i11);
    }

    public final void D0(int i10) throws IOException {
        o0(i10);
    }

    public final void E0(int i10, long j10) throws IOException {
        p0(i10, j10);
    }

    public final void F0(long j10) throws IOException {
        q0(j10);
    }

    public final void G0(int i10, int i11) throws IOException {
        M0(i10, Y(i11));
    }

    public final void H0(int i10) throws IOException {
        N0(Y(i10));
    }

    public final void I0(int i10, long j10) throws IOException {
        O0(i10, Z(j10));
    }

    public final void J0(long j10) throws IOException {
        P0(Z(j10));
    }

    public final void c() {
        if (e0() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void j0(int i10, double d10) throws IOException {
        p0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void k0(double d10) throws IOException {
        q0(Double.doubleToRawLongBits(d10));
    }

    public final void l0(int i10, int i11) throws IOException {
        v0(i10, i11);
    }

    public final void m0(int i10) throws IOException {
        w0(i10);
    }

    public final void r0(int i10, float f10) throws IOException {
        n0(i10, Float.floatToRawIntBits(f10));
    }

    public final void s0(float f10) throws IOException {
        o0(Float.floatToRawIntBits(f10));
    }

    public final void x0(int i10, long j10) throws IOException {
        O0(i10, j10);
    }

    public final void y0(long j10) throws IOException {
        P0(j10);
    }
}
