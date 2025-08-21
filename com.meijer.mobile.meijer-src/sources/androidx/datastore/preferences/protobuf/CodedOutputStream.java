package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC6082f {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f54371c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f54372d = o0.B();

    /* renamed from: a, reason: collision with root package name */
    C6086j f54373a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54374b;

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

    private static abstract class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        final byte[] f54375e;

        /* renamed from: f, reason: collision with root package name */
        final int f54376f;

        /* renamed from: g, reason: collision with root package name */
        int f54377g;

        /* renamed from: h, reason: collision with root package name */
        int f54378h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f54375e = bArr;
            this.f54376f = bArr.length;
        }

        final void a1(byte b10) {
            byte[] bArr = this.f54375e;
            int i10 = this.f54377g;
            this.f54377g = i10 + 1;
            bArr[i10] = b10;
            this.f54378h++;
        }

        final void b1(int i10) {
            byte[] bArr = this.f54375e;
            int i11 = this.f54377g;
            int i12 = i11 + 1;
            this.f54377g = i12;
            bArr[i11] = (byte) (i10 & l3.f93323c);
            int i13 = i11 + 2;
            this.f54377g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & l3.f93323c);
            int i14 = i11 + 3;
            this.f54377g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & l3.f93323c);
            this.f54377g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & l3.f93323c);
            this.f54378h += 4;
        }

        final void c1(long j10) {
            byte[] bArr = this.f54375e;
            int i10 = this.f54377g;
            int i11 = i10 + 1;
            this.f54377g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f54377g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f54377g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f54377g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f54377g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & l3.f93323c);
            int i16 = i10 + 6;
            this.f54377g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & l3.f93323c);
            int i17 = i10 + 7;
            this.f54377g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & l3.f93323c);
            this.f54377g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & l3.f93323c);
            this.f54378h += 8;
        }

        final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void e1(int i10, int i11) {
            f1(q0.c(i10, i11));
        }

        final void f1(int i10) {
            if (CodedOutputStream.f54372d) {
                long j10 = this.f54377g;
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f54375e;
                    int i11 = this.f54377g;
                    this.f54377g = i11 + 1;
                    o0.H(bArr, i11, (byte) ((i10 | 128) & l3.f93323c));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f54375e;
                int i12 = this.f54377g;
                this.f54377g = i12 + 1;
                o0.H(bArr2, i12, (byte) i10);
                this.f54378h += (int) (this.f54377g - j10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f54375e;
                int i13 = this.f54377g;
                this.f54377g = i13 + 1;
                bArr3[i13] = (byte) ((i10 | 128) & l3.f93323c);
                this.f54378h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f54375e;
            int i14 = this.f54377g;
            this.f54377g = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f54378h++;
        }

        final void g1(long j10) {
            if (CodedOutputStream.f54372d) {
                long j11 = this.f54377g;
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f54375e;
                    int i10 = this.f54377g;
                    this.f54377g = i10 + 1;
                    o0.H(bArr, i10, (byte) ((((int) j10) | 128) & l3.f93323c));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f54375e;
                int i11 = this.f54377g;
                this.f54377g = i11 + 1;
                o0.H(bArr2, i11, (byte) j10);
                this.f54378h += (int) (this.f54377g - j11);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f54375e;
                int i12 = this.f54377g;
                this.f54377g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) | 128) & l3.f93323c);
                this.f54378h++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f54375e;
            int i13 = this.f54377g;
            this.f54377g = i13 + 1;
            bArr4[i13] = (byte) j10;
            this.f54378h++;
        }
    }

    private static class c extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f54379e;

        /* renamed from: f, reason: collision with root package name */
        private final int f54380f;

        /* renamed from: g, reason: collision with root package name */
        private final int f54381g;

        /* renamed from: h, reason: collision with root package name */
        private int f54382h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f54379e = bArr;
            this.f54380f = i10;
            this.f54382h = i10;
            this.f54381g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(int i10, int i11) throws IOException {
            V0(i10, 0);
            E0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void H0(int i10, P p10, f0 f0Var) throws IOException {
            V0(i10, 2);
            X0(((AbstractC6077a) p10).l(f0Var));
            f0Var.i(p10, this.f54373a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J0(int i10, P p10) throws IOException {
            V0(1, 3);
            W0(2, i10);
            b1(3, p10);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(int i10, AbstractC6083g abstractC6083g) throws IOException {
            V0(1, 3);
            W0(2, i10);
            n0(3, abstractC6083g);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(int i10, int i11) throws IOException {
            V0(i10, 0);
            X0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int i10, long j10) throws IOException {
            V0(i10, 0);
            Z0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0() {
        }

        public final void b1(int i10, P p10) throws IOException {
            V0(i10, 2);
            I0(p10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j0(int i10, boolean z10) throws IOException {
            V0(i10, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n0(int i10, AbstractC6083g abstractC6083g) throws IOException {
            V0(i10, 2);
            o0(abstractC6083g);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(int i10, int i11) throws IOException {
            V0(i10, 5);
            u0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i10, long j10) throws IOException {
            V0(i10, 1);
            w0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U0(String str) throws IOException {
            int i10 = this.f54382h;
            try {
                int iW = CodedOutputStream.W(str.length() * 3);
                int iW2 = CodedOutputStream.W(str.length());
                if (iW2 != iW) {
                    X0(p0.c(str));
                    this.f54382h = p0.b(str, this.f54379e, this.f54382h, h0());
                    return;
                }
                int i11 = i10 + iW2;
                this.f54382h = i11;
                int iB = p0.b(str, this.f54379e, i11, h0());
                this.f54382h = i10;
                X0((iB - i10) - iW2);
                this.f54382h = iB;
            } catch (p0.d e10) {
                this.f54382h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X0(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f54379e;
                    int i11 = this.f54382h;
                    this.f54382h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & l3.f93323c);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54382h), Integer.valueOf(this.f54381g), 1), e10);
                }
            }
            byte[] bArr2 = this.f54379e;
            int i12 = this.f54382h;
            this.f54382h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        public final void a1(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f54379e, this.f54382h, i11);
                this.f54382h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54382h), Integer.valueOf(this.f54381g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int h0() {
            return this.f54381g - this.f54382h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f54379e;
                int i10 = this.f54382h;
                this.f54382h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54382h), Integer.valueOf(this.f54381g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(int i10) throws IOException {
            try {
                byte[] bArr = this.f54379e;
                int i11 = this.f54382h;
                int i12 = i11 + 1;
                this.f54382h = i12;
                bArr[i11] = (byte) (i10 & l3.f93323c);
                int i13 = i11 + 2;
                this.f54382h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & l3.f93323c);
                int i14 = i11 + 3;
                this.f54382h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & l3.f93323c);
                this.f54382h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & l3.f93323c);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54382h), Integer.valueOf(this.f54381g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j10) throws IOException {
            try {
                byte[] bArr = this.f54379e;
                int i10 = this.f54382h;
                int i11 = i10 + 1;
                this.f54382h = i11;
                bArr[i10] = (byte) (((int) j10) & l3.f93323c);
                int i12 = i10 + 2;
                this.f54382h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & l3.f93323c);
                int i13 = i10 + 3;
                this.f54382h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & l3.f93323c);
                int i14 = i10 + 4;
                this.f54382h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & l3.f93323c);
                int i15 = i10 + 5;
                this.f54382h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & l3.f93323c);
                int i16 = i10 + 6;
                this.f54382h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & l3.f93323c);
                int i17 = i10 + 7;
                this.f54382h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & l3.f93323c);
                this.f54382h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & l3.f93323c);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54382h), Integer.valueOf(this.f54381g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I0(P p10) throws IOException {
            X0(p10.c());
            p10.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V0(int i10, int i11) throws IOException {
            X0(q0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z0(long j10) throws IOException {
            if (CodedOutputStream.f54372d && h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f54379e;
                    int i10 = this.f54382h;
                    this.f54382h = i10 + 1;
                    o0.H(bArr, i10, (byte) ((((int) j10) | 128) & l3.f93323c));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f54379e;
                int i11 = this.f54382h;
                this.f54382h = i11 + 1;
                o0.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f54379e;
                    int i12 = this.f54382h;
                    this.f54382h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & l3.f93323c);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54382h), Integer.valueOf(this.f54381g), 1), e10);
                }
            }
            byte[] bArr4 = this.f54379e;
            int i13 = this.f54382h;
            this.f54382h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.AbstractC6082f
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o0(AbstractC6083g abstractC6083g) throws IOException {
            X0(abstractC6083g.size());
            abstractC6083g.C(this);
        }
    }

    private static final class d extends b {

        /* renamed from: i, reason: collision with root package name */
        private final OutputStream f54383i;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void H0(int i10, P p10, f0 f0Var) throws IOException {
            V0(i10, 2);
            l1(p10, f0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J0(int i10, P p10) throws IOException {
            V0(1, 3);
            W0(2, i10);
            k1(3, p10);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(int i10, AbstractC6083g abstractC6083g) throws IOException {
            V0(1, 3);
            W0(2, i10);
            n0(3, abstractC6083g);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void X0(int i10) throws IOException {
            i1(5);
            f1(i10);
        }

        public void k1(int i10, P p10) throws IOException {
            V0(i10, 2);
            I0(p10);
        }

        void l1(P p10, f0 f0Var) throws IOException {
            X0(((AbstractC6077a) p10).l(f0Var));
            f0Var.i(p10, this.f54373a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(int i10, AbstractC6083g abstractC6083g) throws IOException {
            V0(i10, 2);
            o0(abstractC6083g);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u0(int i10) throws IOException {
            i1(4);
            b1(i10);
        }

        private void h1() throws IOException {
            this.f54383i.write(this.f54375e, 0, this.f54377g);
            this.f54377g = 0;
        }

        private void i1(int i10) throws IOException {
            if (this.f54376f - this.f54377g < i10) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void E0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int i10, long j10) throws IOException {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Z0(long j10) throws IOException {
            i1(10);
            g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0() throws IOException {
            if (this.f54377g > 0) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i0(byte b10) throws IOException {
            if (this.f54377g == this.f54376f) {
                h1();
            }
            a1(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j0(int i10, boolean z10) throws IOException {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : (byte) 0);
        }

        public void j1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f54376f;
            int i13 = this.f54377g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f54375e, i13, i11);
                this.f54377g += i11;
                this.f54378h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f54375e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f54377g = this.f54376f;
            this.f54378h += i14;
            h1();
            if (i16 <= this.f54376f) {
                System.arraycopy(bArr, i15, this.f54375e, 0, i16);
                this.f54377g = i16;
            } else {
                this.f54383i.write(bArr, i15, i16);
            }
            this.f54378h += i16;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t0(int i10, int i11) throws IOException {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i10, long j10) throws IOException {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(long j10) throws IOException {
            i1(8);
            c1(j10);
        }

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream != null) {
                this.f54383i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(P p10) throws IOException {
            X0(p10.c());
            p10.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void U0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iW = CodedOutputStream.W(length);
                int i10 = iW + length;
                int i11 = this.f54376f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = p0.b(str, bArr, 0, length);
                    X0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f54377g) {
                    h1();
                }
                int iW2 = CodedOutputStream.W(str.length());
                int i12 = this.f54377g;
                try {
                    if (iW2 == iW) {
                        int i13 = i12 + iW2;
                        this.f54377g = i13;
                        int iB2 = p0.b(str, this.f54375e, i13, this.f54376f - i13);
                        this.f54377g = i12;
                        iC = (iB2 - i12) - iW2;
                        f1(iC);
                        this.f54377g = iB2;
                    } else {
                        iC = p0.c(str);
                        f1(iC);
                        this.f54377g = p0.b(str, this.f54375e, this.f54377g, iC);
                    }
                    this.f54378h += iC;
                } catch (p0.d e10) {
                    this.f54378h -= this.f54377g - i12;
                    this.f54377g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (p0.d e12) {
                c0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void V0(int i10, int i11) throws IOException {
            X0(q0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.AbstractC6082f
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void m0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(AbstractC6083g abstractC6083g) throws IOException {
            X0(abstractC6083g.size());
            abstractC6083g.C(this);
        }
    }

    public static int D(int i10, P p10) {
        return (U(1) * 2) + V(2, i10) + E(3, p10);
    }

    static int I(int i10) {
        return i10 > 4096 ? RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT : i10;
    }

    public static int J(int i10, AbstractC6083g abstractC6083g) {
        return (U(1) * 2) + V(2, i10) + g(3, abstractC6083g);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int N(long j10) {
        return 8;
    }

    public static int U(int i10) {
        return W(q0.c(i10, 0));
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
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
        return Y(i10);
    }

    public static int z(int i10, B b10) {
        return (U(1) * 2) + V(2, i10) + A(3, b10);
    }

    @Deprecated
    final void A0(int i10, P p10, f0 f0Var) throws IOException {
        V0(i10, 3);
        C0(p10, f0Var);
        V0(i10, 4);
    }

    public abstract void D0(int i10, int i11) throws IOException;

    public abstract void E0(int i10) throws IOException;

    abstract void H0(int i10, P p10, f0 f0Var) throws IOException;

    public abstract void I0(P p10) throws IOException;

    public abstract void J0(int i10, P p10) throws IOException;

    public abstract void K0(int i10, AbstractC6083g abstractC6083g) throws IOException;

    public abstract void T0(int i10, String str) throws IOException;

    public abstract void U0(String str) throws IOException;

    public abstract void V0(int i10, int i11) throws IOException;

    public abstract void W0(int i10, int i11) throws IOException;

    public abstract void X0(int i10) throws IOException;

    public abstract void Y0(int i10, long j10) throws IOException;

    public abstract void Z0(long j10) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.AbstractC6082f
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void b0() throws IOException;

    public abstract int h0();

    public abstract void i0(byte b10) throws IOException;

    public abstract void j0(int i10, boolean z10) throws IOException;

    public final void k0(boolean z10) throws IOException {
        i0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void l0(byte[] bArr) throws IOException {
        m0(bArr, 0, bArr.length);
    }

    abstract void m0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void n0(int i10, AbstractC6083g abstractC6083g) throws IOException;

    public abstract void o0(AbstractC6083g abstractC6083g) throws IOException;

    public abstract void t0(int i10, int i11) throws IOException;

    public abstract void u0(int i10) throws IOException;

    public abstract void v0(int i10, long j10) throws IOException;

    public abstract void w0(long j10) throws IOException;

    @Deprecated
    public final void z0(int i10, P p10) throws IOException {
        V0(i10, 3);
        B0(p10);
        V0(i10, 4);
    }

    private CodedOutputStream() {
    }

    static int H(P p10, f0 f0Var) {
        return C(((AbstractC6077a) p10).l(f0Var));
    }

    public static CodedOutputStream e0(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static CodedOutputStream g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    @Deprecated
    static int u(P p10, f0 f0Var) {
        return ((AbstractC6077a) p10).l(f0Var);
    }

    @Deprecated
    final void C0(P p10, f0 f0Var) throws IOException {
        f0Var.i(p10, this.f54373a);
    }

    final void c0(String str, p0.d dVar) throws IOException {
        f54371c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C6100y.f54706b);
        try {
            X0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean d0() {
        return this.f54374b;
    }

    public static int A(int i10, B b10) {
        return U(i10) + B(b10);
    }

    public static int B(B b10) {
        return C(b10.b());
    }

    static int C(int i10) {
        return W(i10) + i10;
    }

    public static int E(int i10, P p10) {
        return U(i10) + G(p10);
    }

    static int F(int i10, P p10, f0 f0Var) {
        return U(i10) + H(p10, f0Var);
    }

    public static int G(P p10) {
        return C(p10.c());
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = p0.c(str);
        } catch (p0.d unused) {
            length = str.getBytes(C6100y.f54706b).length;
        }
        return C(length);
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static int g(int i10, AbstractC6083g abstractC6083g) {
        return U(i10) + h(abstractC6083g);
    }

    public static int h(AbstractC6083g abstractC6083g) {
        return C(abstractC6083g.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    @Deprecated
    static int s(int i10, P p10, f0 f0Var) {
        return (U(i10) * 2) + u(p10, f0Var);
    }

    @Deprecated
    public static int t(P p10) {
        return p10.c();
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    @Deprecated
    public final void B0(P p10) throws IOException {
        p10.i(this);
    }

    public final void F0(int i10, long j10) throws IOException {
        Y0(i10, j10);
    }

    public final void G0(long j10) throws IOException {
        Z0(j10);
    }

    public final void L0(int i10, int i11) throws IOException {
        t0(i10, i11);
    }

    public final void M0(int i10) throws IOException {
        u0(i10);
    }

    public final void N0(int i10, long j10) throws IOException {
        v0(i10, j10);
    }

    public final void O0(long j10) throws IOException {
        w0(j10);
    }

    public final void P0(int i10, int i11) throws IOException {
        W0(i10, Z(i11));
    }

    public final void Q0(int i10) throws IOException {
        X0(Z(i10));
    }

    public final void R0(int i10, long j10) throws IOException {
        Y0(i10, a0(j10));
    }

    public final void S0(long j10) throws IOException {
        Z0(a0(j10));
    }

    public final void c() {
        if (h0() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void p0(int i10, double d10) throws IOException {
        v0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void q0(double d10) throws IOException {
        w0(Double.doubleToRawLongBits(d10));
    }

    public final void r0(int i10, int i11) throws IOException {
        D0(i10, i11);
    }

    public final void s0(int i10) throws IOException {
        E0(i10);
    }

    public final void x0(int i10, float f10) throws IOException {
        t0(i10, Float.floatToRawIntBits(f10));
    }

    public final void y0(float f10) throws IOException {
        u0(Float.floatToRawIntBits(f10));
    }
}
