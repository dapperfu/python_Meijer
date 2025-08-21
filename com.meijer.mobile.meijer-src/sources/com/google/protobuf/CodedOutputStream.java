package com.google.protobuf;

import com.google.protobuf.q0;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public abstract class CodedOutputStream extends AbstractC11645f {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f91260c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f91261d = p0.E();

    /* renamed from: a, reason: collision with root package name */
    C11649j f91262a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f91263b;

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
        private final byte[] f91264e;

        /* renamed from: f, reason: collision with root package name */
        private final int f91265f;

        /* renamed from: g, reason: collision with root package name */
        private final int f91266g;

        /* renamed from: h, reason: collision with root package name */
        private int f91267h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f91264e = bArr;
            this.f91265f = i10;
            this.f91267h = i10;
            this.f91266g = i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A0(int i10, int i11) throws IOException {
            S0(i10, 0);
            B0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void E0(int i10, P p10, f0 f0Var) throws IOException {
            S0(i10, 2);
            U0(((AbstractC11640a) p10).r(f0Var));
            f0Var.h(p10, this.f91262a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G0(int i10, P p10) throws IOException {
            S0(1, 3);
            T0(2, i10);
            Y0(3, p10);
            S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H0(int i10, AbstractC11646g abstractC11646g) throws IOException {
            S0(1, 3);
            T0(2, i10);
            k0(3, abstractC11646g);
            S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q0(int i10, String str) throws IOException {
            S0(i10, 2);
            R0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T0(int i10, int i11) throws IOException {
            S0(i10, 0);
            U0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V0(int i10, long j10) throws IOException {
            S0(i10, 0);
            W0(j10);
        }

        public final void Y0(int i10, P p10) throws IOException {
            S0(i10, 2);
            F0(p10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i10, boolean z10) throws IOException {
            S0(i10, 0);
            f0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i10, AbstractC11646g abstractC11646g) throws IOException {
            S0(i10, 2);
            l0(abstractC11646g);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i10, int i11) throws IOException {
            S0(i10, 5);
            r0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i10, long j10) throws IOException {
            S0(i10, 1);
            t0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i10) throws IOException {
            if (i10 >= 0) {
                U0(i10);
            } else {
                W0(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R0(String str) throws IOException {
            int i10 = this.f91267h;
            try {
                int iV = CodedOutputStream.V(str.length() * 3);
                int iV2 = CodedOutputStream.V(str.length());
                if (iV2 != iV) {
                    U0(q0.g(str));
                    this.f91267h = q0.f(str, this.f91264e, this.f91267h, e0());
                    return;
                }
                int i11 = i10 + iV2;
                this.f91267h = i11;
                int iF = q0.f(str, this.f91264e, i11, e0());
                this.f91267h = i10;
                U0((iF - i10) - iV2);
                this.f91267h = iF;
            } catch (q0.d e10) {
                this.f91267h = i10;
                a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U0(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f91264e;
                    int i11 = this.f91267h;
                    this.f91267h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & l3.f93324d) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f91267h), Integer.valueOf(this.f91266g), 1), e10);
                }
            }
            byte[] bArr2 = this.f91264e;
            int i12 = this.f91267h;
            this.f91267h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        public final void X0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f91264e, this.f91267h, i11);
                this.f91267h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f91267h), Integer.valueOf(this.f91266g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int e0() {
            return this.f91266g - this.f91267h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f91264e;
                int i10 = this.f91267h;
                this.f91267h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f91267h), Integer.valueOf(this.f91266g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i10) throws IOException {
            try {
                byte[] bArr = this.f91264e;
                int i11 = this.f91267h;
                int i12 = i11 + 1;
                this.f91267h = i12;
                bArr[i11] = (byte) (i10 & l3.f93323c);
                int i13 = i11 + 2;
                this.f91267h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & l3.f93323c);
                int i14 = i11 + 3;
                this.f91267h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & l3.f93323c);
                this.f91267h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & l3.f93323c);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f91267h), Integer.valueOf(this.f91266g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(long j10) throws IOException {
            try {
                byte[] bArr = this.f91264e;
                int i10 = this.f91267h;
                int i11 = i10 + 1;
                this.f91267h = i11;
                bArr[i10] = (byte) (((int) j10) & l3.f93323c);
                int i12 = i10 + 2;
                this.f91267h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & l3.f93323c);
                int i13 = i10 + 3;
                this.f91267h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & l3.f93323c);
                int i14 = i10 + 4;
                this.f91267h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & l3.f93323c);
                int i15 = i10 + 5;
                this.f91267h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & l3.f93323c);
                int i16 = i10 + 6;
                this.f91267h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & l3.f93323c);
                int i17 = i10 + 7;
                this.f91267h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & l3.f93323c);
                this.f91267h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & l3.f93323c);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f91267h), Integer.valueOf(this.f91266g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F0(P p10) throws IOException {
            U0(p10.c());
            p10.l(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S0(int i10, int i11) throws IOException {
            U0(r0.c(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W0(long j10) throws IOException {
            if (CodedOutputStream.f91261d && e0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f91264e;
                    int i10 = this.f91267h;
                    this.f91267h = i10 + 1;
                    p0.K(bArr, i10, (byte) ((((int) j10) & l3.f93324d) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f91264e;
                int i11 = this.f91267h;
                this.f91267h = i11 + 1;
                p0.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f91264e;
                    int i12 = this.f91267h;
                    this.f91267h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & l3.f93324d) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f91267h), Integer.valueOf(this.f91266g), 1), e10);
                }
            }
            byte[] bArr4 = this.f91264e;
            int i13 = this.f91267h;
            this.f91267h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC11645f
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            X0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(byte[] bArr, int i10, int i11) throws IOException {
            U0(i11);
            X0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(AbstractC11646g abstractC11646g) throws IOException {
            U0(abstractC11646g.size());
            abstractC11646g.D(this);
        }
    }

    public static int D(int i10, P p10) {
        return (T(1) * 2) + U(2, i10) + E(3, p10);
    }

    public static int I(int i10, AbstractC11646g abstractC11646g) {
        return (T(1) * 2) + U(2, i10) + g(3, abstractC11646g);
    }

    public static int K(int i10) {
        return 4;
    }

    public static int M(long j10) {
        return 8;
    }

    public static int T(int i10) {
        return V(r0.c(i10, 0));
    }

    public static int V(int i10) {
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

    public static int X(long j10) {
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

    public static int z(int i10, C c10) {
        return (T(1) * 2) + U(2, i10) + A(3, c10);
    }

    public abstract void A0(int i10, int i11) throws IOException;

    public abstract void B0(int i10) throws IOException;

    abstract void E0(int i10, P p10, f0 f0Var) throws IOException;

    public abstract void F0(P p10) throws IOException;

    public abstract void G0(int i10, P p10) throws IOException;

    public abstract void H0(int i10, AbstractC11646g abstractC11646g) throws IOException;

    public abstract void Q0(int i10, String str) throws IOException;

    public abstract void R0(String str) throws IOException;

    public abstract void S0(int i10, int i11) throws IOException;

    public abstract void T0(int i10, int i11) throws IOException;

    public abstract void U0(int i10) throws IOException;

    public abstract void V0(int i10, long j10) throws IOException;

    public abstract void W0(long j10) throws IOException;

    @Override // com.google.protobuf.AbstractC11645f
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int e0();

    public abstract void f0(byte b10) throws IOException;

    public abstract void g0(int i10, boolean z10) throws IOException;

    public final void h0(boolean z10) throws IOException {
        f0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void i0(byte[] bArr) throws IOException {
        j0(bArr, 0, bArr.length);
    }

    abstract void j0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void k0(int i10, AbstractC11646g abstractC11646g) throws IOException;

    public abstract void l0(AbstractC11646g abstractC11646g) throws IOException;

    public abstract void q0(int i10, int i11) throws IOException;

    public abstract void r0(int i10) throws IOException;

    public abstract void s0(int i10, long j10) throws IOException;

    public abstract void t0(long j10) throws IOException;

    @Deprecated
    public final void w0(int i10, P p10) throws IOException {
        S0(i10, 3);
        y0(p10);
        S0(i10, 4);
    }

    @Deprecated
    final void x0(int i10, P p10, f0 f0Var) throws IOException {
        S0(i10, 3);
        z0(p10, f0Var);
        S0(i10, 4);
    }

    private CodedOutputStream() {
    }

    static int H(P p10, f0 f0Var) {
        return C(((AbstractC11640a) p10).r(f0Var));
    }

    public static CodedOutputStream d0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    @Deprecated
    static int u(P p10, f0 f0Var) {
        return ((AbstractC11640a) p10).r(f0Var);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return V(i10);
        }
        return 10;
    }

    final void a0(String str, q0.d dVar) throws IOException {
        f91260c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C11663y.f91596b);
        try {
            U0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean b0() {
        return this.f91263b;
    }

    @Deprecated
    final void z0(P p10, f0 f0Var) throws IOException {
        f0Var.h(p10, this.f91262a);
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

    public static int E(int i10, P p10) {
        return T(i10) + G(p10);
    }

    static int F(int i10, P p10, f0 f0Var) {
        return T(i10) + H(p10, f0Var);
    }

    public static int G(P p10) {
        return C(p10.c());
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
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(C11663y.f91596b).length;
        }
        return C(length);
    }

    public static int U(int i10, int i11) {
        return T(i10) + V(i11);
    }

    public static int W(int i10, long j10) {
        return T(i10) + X(j10);
    }

    public static int d(int i10, boolean z10) {
        return T(i10) + e(z10);
    }

    public static int g(int i10, AbstractC11646g abstractC11646g) {
        return T(i10) + h(abstractC11646g);
    }

    public static int h(AbstractC11646g abstractC11646g) {
        return C(abstractC11646g.size());
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
    static int s(int i10, P p10, f0 f0Var) {
        return (T(i10) * 2) + u(p10, f0Var);
    }

    @Deprecated
    public static int t(P p10) {
        return p10.c();
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

    public final void C0(int i10, long j10) throws IOException {
        V0(i10, j10);
    }

    public final void D0(long j10) throws IOException {
        W0(j10);
    }

    public final void I0(int i10, int i11) throws IOException {
        q0(i10, i11);
    }

    public final void J0(int i10) throws IOException {
        r0(i10);
    }

    public final void K0(int i10, long j10) throws IOException {
        s0(i10, j10);
    }

    public final void L0(long j10) throws IOException {
        t0(j10);
    }

    public final void M0(int i10, int i11) throws IOException {
        T0(i10, Y(i11));
    }

    public final void N0(int i10) throws IOException {
        U0(Y(i10));
    }

    public final void O0(int i10, long j10) throws IOException {
        V0(i10, Z(j10));
    }

    public final void P0(long j10) throws IOException {
        W0(Z(j10));
    }

    public final void c() {
        if (e0() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void m0(int i10, double d10) throws IOException {
        s0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void n0(double d10) throws IOException {
        t0(Double.doubleToRawLongBits(d10));
    }

    public final void o0(int i10, int i11) throws IOException {
        A0(i10, i11);
    }

    public final void p0(int i10) throws IOException {
        B0(i10);
    }

    public final void u0(int i10, float f10) throws IOException {
        q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void v0(float f10) throws IOException {
        r0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void y0(P p10) throws IOException {
        p10.l(this);
    }
}
