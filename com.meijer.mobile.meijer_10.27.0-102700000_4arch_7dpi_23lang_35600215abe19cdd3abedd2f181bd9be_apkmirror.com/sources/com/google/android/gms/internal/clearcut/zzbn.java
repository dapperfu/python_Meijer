package com.google.android.gms.internal.clearcut;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzbn extends AbstractC10351z {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f81635b = Logger.getLogger(zzbn.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f81636c = C10350y1.x();

    /* renamed from: a, reason: collision with root package name */
    N f81637a;

    static class a extends zzbn {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f81638d;

        /* renamed from: e, reason: collision with root package name */
        private final int f81639e;

        /* renamed from: f, reason: collision with root package name */
        private final int f81640f;

        /* renamed from: g, reason: collision with root package name */
        private int f81641g;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f81638d = bArr;
            this.f81639e = i10;
            this.f81641g = i10;
            this.f81640f = i12;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void A0(int i10) throws IOException {
            try {
                byte[] bArr = this.f81638d;
                int i11 = this.f81641g;
                int i12 = i11 + 1;
                this.f81641g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f81641g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f81641g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f81641g = i11 + 4;
                bArr[i14] = i10 >> 24;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81641g), Integer.valueOf(this.f81640f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void G(int i10, int i11) throws IOException {
            y0((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void I(int i10, A a10) throws IOException {
            G(1, 3);
            b0(2, i10);
            m(3, a10);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void J(int i10, J0 j02) throws IOException {
            G(1, 3);
            b0(2, i10);
            n(3, j02);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void K(int i10, boolean z10) throws IOException {
            G(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        public final int K0() {
            return this.f81641g - this.f81639e;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void L(long j10) throws IOException {
            if (zzbn.f81636c && u() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f81638d;
                    int i10 = this.f81641g;
                    this.f81641g = i10 + 1;
                    C10350y1.k(bArr, i10, (byte) ((((int) j10) & l3.f92485d) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f81638d;
                int i11 = this.f81641g;
                this.f81641g = i11 + 1;
                C10350y1.k(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f81638d;
                    int i12 = this.f81641g;
                    this.f81641g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & l3.f92485d) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81641g), Integer.valueOf(this.f81640f), 1), e10);
                }
            }
            byte[] bArr4 = this.f81638d;
            int i13 = this.f81641g;
            this.f81641g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void M(J0 j02) throws IOException {
            y0(j02.i());
            j02.k(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void T(int i10, int i11) throws IOException {
            G(i10, 0);
            x0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void U(int i10, long j10) throws IOException {
            G(i10, 1);
            c0(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC10351z
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            c(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public void b() {
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void b0(int i10, int i11) throws IOException {
            G(i10, 0);
            y0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void c(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f81638d, this.f81641g, i11);
                this.f81641g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81641g), Integer.valueOf(this.f81640f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void c0(long j10) throws IOException {
            try {
                byte[] bArr = this.f81638d;
                int i10 = this.f81641g;
                int i11 = i10 + 1;
                this.f81641g = i11;
                bArr[i10] = (byte) j10;
                int i12 = i10 + 2;
                this.f81641g = i12;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i10 + 3;
                this.f81641g = i13;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i10 + 4;
                this.f81641g = i14;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i10 + 5;
                this.f81641g = i15;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i10 + 6;
                this.f81641g = i16;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i10 + 7;
                this.f81641g = i17;
                bArr[i16] = (byte) (j10 >> 48);
                this.f81641g = i10 + 8;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81641g), Integer.valueOf(this.f81640f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void g(byte b10) throws IOException {
            try {
                byte[] bArr = this.f81638d;
                int i10 = this.f81641g;
                this.f81641g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81641g), Integer.valueOf(this.f81640f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void i0(int i10, int i11) throws IOException {
            G(i10, 5);
            A0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void l(int i10, long j10) throws IOException {
            G(i10, 0);
            L(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void m(int i10, A a10) throws IOException {
            G(i10, 2);
            q(a10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void m0(String str) throws IOException {
            int iB;
            int i10 = this.f81641g;
            try {
                int iD0 = zzbn.D0(str.length() * 3);
                int iD02 = zzbn.D0(str.length());
                if (iD02 == iD0) {
                    int i11 = i10 + iD02;
                    this.f81641g = i11;
                    iB = A1.b(str, this.f81638d, i11, u());
                    this.f81641g = i10;
                    y0((iB - i10) - iD02);
                } else {
                    y0(A1.a(str));
                    iB = A1.b(str, this.f81638d, this.f81641g, u());
                }
                this.f81641g = iB;
            } catch (D1 e10) {
                this.f81641g = i10;
                s(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void n(int i10, J0 j02) throws IOException {
            G(i10, 2);
            M(j02);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void o(int i10, J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException {
            G(i10, 2);
            AbstractC10325q abstractC10325q = (AbstractC10325q) j02;
            int iD = abstractC10325q.d();
            if (iD == -1) {
                iD = interfaceC10279a1.g(abstractC10325q);
                abstractC10325q.c(iD);
            }
            y0(iD);
            interfaceC10279a1.a(j02, this.f81637a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void p(int i10, String str) throws IOException {
            G(i10, 2);
            m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void q(A a10) throws IOException {
            y0(a10.size());
            a10.h(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void r(J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException {
            AbstractC10325q abstractC10325q = (AbstractC10325q) j02;
            int iD = abstractC10325q.d();
            if (iD == -1) {
                iD = interfaceC10279a1.g(abstractC10325q);
                abstractC10325q.c(iD);
            }
            y0(iD);
            interfaceC10279a1.a(j02, this.f81637a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int u() {
            return this.f81640f - this.f81641g;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void x0(int i10) throws IOException {
            if (i10 >= 0) {
                y0(i10);
            } else {
                L(i10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void y0(int i10) throws IOException {
            if (zzbn.f81636c && u() >= 10) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f81638d;
                    int i11 = this.f81641g;
                    this.f81641g = i11 + 1;
                    C10350y1.k(bArr, i11, (byte) ((i10 & l3.f92485d) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f81638d;
                int i12 = this.f81641g;
                this.f81641g = i12 + 1;
                C10350y1.k(bArr2, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f81638d;
                    int i13 = this.f81641g;
                    this.f81641g = i13 + 1;
                    bArr3[i13] = (byte) ((i10 & l3.f92485d) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81641g), Integer.valueOf(this.f81640f), 1), e10);
                }
            }
            byte[] bArr4 = this.f81638d;
            int i14 = this.f81641g;
            this.f81641g = i14 + 1;
            bArr4[i14] = (byte) i10;
        }
    }

    static final class b extends a {

        /* renamed from: h, reason: collision with root package name */
        private final ByteBuffer f81642h;

        /* renamed from: i, reason: collision with root package name */
        private int f81643i;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f81642h = byteBuffer;
            this.f81643i = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn.a, com.google.android.gms.internal.clearcut.zzbn
        public final void b() {
            this.f81642h.position(this.f81643i + K0());
        }
    }

    static final class c extends zzbn {

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f81644d;

        /* renamed from: e, reason: collision with root package name */
        private final ByteBuffer f81645e;

        /* renamed from: f, reason: collision with root package name */
        private final int f81646f;

        c(ByteBuffer byteBuffer) {
            super();
            this.f81644d = byteBuffer;
            this.f81645e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f81646f = byteBuffer.position();
        }

        private final void K0(String str) throws IOException {
            try {
                A1.c(str, this.f81645e);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void A0(int i10) throws IOException {
            try {
                this.f81645e.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new zzc(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void G(int i10, int i11) throws IOException {
            y0((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void I(int i10, A a10) throws IOException {
            G(1, 3);
            b0(2, i10);
            m(3, a10);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void J(int i10, J0 j02) throws IOException {
            G(1, 3);
            b0(2, i10);
            n(3, j02);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void K(int i10, boolean z10) throws IOException {
            G(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void L(long j10) throws IOException {
            while (((-128) & j10) != 0) {
                try {
                    this.f81645e.put((byte) ((((int) j10) & l3.f92485d) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new zzc(e10);
                }
            }
            this.f81645e.put((byte) j10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void M(J0 j02) throws IOException {
            y0(j02.i());
            j02.k(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void T(int i10, int i11) throws IOException {
            G(i10, 0);
            x0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void U(int i10, long j10) throws IOException {
            G(i10, 1);
            c0(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC10351z
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            c(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void b() {
            this.f81644d.position(this.f81645e.position());
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void b0(int i10, int i11) throws IOException {
            G(i10, 0);
            y0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void c(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.f81645e.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(e10);
            } catch (BufferOverflowException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void c0(long j10) throws IOException {
            try {
                this.f81645e.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new zzc(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void g(byte b10) throws IOException {
            try {
                this.f81645e.put(b10);
            } catch (BufferOverflowException e10) {
                throw new zzc(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void i0(int i10, int i11) throws IOException {
            G(i10, 5);
            A0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void l(int i10, long j10) throws IOException {
            G(i10, 0);
            L(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void m(int i10, A a10) throws IOException {
            G(i10, 2);
            q(a10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void m0(String str) throws IOException {
            int iPosition = this.f81645e.position();
            try {
                int iD0 = zzbn.D0(str.length() * 3);
                int iD02 = zzbn.D0(str.length());
                if (iD02 != iD0) {
                    y0(A1.a(str));
                    K0(str);
                    return;
                }
                int iPosition2 = this.f81645e.position() + iD02;
                this.f81645e.position(iPosition2);
                K0(str);
                int iPosition3 = this.f81645e.position();
                this.f81645e.position(iPosition);
                y0(iPosition3 - iPosition2);
                this.f81645e.position(iPosition3);
            } catch (D1 e10) {
                this.f81645e.position(iPosition);
                s(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new zzc(e11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void n(int i10, J0 j02) throws IOException {
            G(i10, 2);
            M(j02);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void o(int i10, J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException {
            G(i10, 2);
            r(j02, interfaceC10279a1);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void p(int i10, String str) throws IOException {
            G(i10, 2);
            m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void q(A a10) throws IOException {
            y0(a10.size());
            a10.h(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void r(J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException {
            AbstractC10325q abstractC10325q = (AbstractC10325q) j02;
            int iD = abstractC10325q.d();
            if (iD == -1) {
                iD = interfaceC10279a1.g(abstractC10325q);
                abstractC10325q.c(iD);
            }
            y0(iD);
            interfaceC10279a1.a(j02, this.f81637a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int u() {
            return this.f81645e.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void x0(int i10) throws IOException {
            if (i10 >= 0) {
                y0(i10);
            } else {
                L(i10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void y0(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.f81645e.put((byte) ((i10 & l3.f92485d) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new zzc(e10);
                }
            }
            this.f81645e.put((byte) i10);
        }
    }

    static final class d extends zzbn {

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f81647d;

        /* renamed from: e, reason: collision with root package name */
        private final ByteBuffer f81648e;

        /* renamed from: f, reason: collision with root package name */
        private final long f81649f;

        /* renamed from: g, reason: collision with root package name */
        private final long f81650g;

        /* renamed from: h, reason: collision with root package name */
        private final long f81651h;

        /* renamed from: i, reason: collision with root package name */
        private final long f81652i;

        /* renamed from: j, reason: collision with root package name */
        private long f81653j;

        d(ByteBuffer byteBuffer) {
            super();
            this.f81647d = byteBuffer;
            this.f81648e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jO = C10350y1.o(byteBuffer);
            this.f81649f = jO;
            long jPosition = byteBuffer.position() + jO;
            this.f81650g = jPosition;
            long jLimit = jO + byteBuffer.limit();
            this.f81651h = jLimit;
            this.f81652i = jLimit - 10;
            this.f81653j = jPosition;
        }

        private final void K0(long j10) {
            this.f81648e.position((int) (j10 - this.f81649f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void A0(int i10) throws IOException {
            this.f81648e.putInt((int) (this.f81653j - this.f81649f), i10);
            this.f81653j += 4;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void G(int i10, int i11) throws IOException {
            y0((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void I(int i10, A a10) throws IOException {
            G(1, 3);
            b0(2, i10);
            m(3, a10);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void J(int i10, J0 j02) throws IOException {
            G(1, 3);
            b0(2, i10);
            n(3, j02);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void K(int i10, boolean z10) throws IOException {
            G(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void L(long j10) throws IOException {
            if (this.f81653j <= this.f81652i) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f81653j;
                    this.f81653j = j11 + 1;
                    C10350y1.c(j11, (byte) ((((int) j10) & l3.f92485d) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f81653j;
                this.f81653j = 1 + j12;
                C10350y1.c(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f81653j;
                if (j13 >= this.f81651h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f81653j), Long.valueOf(this.f81651h), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f81653j = 1 + j13;
                    C10350y1.c(j13, (byte) j10);
                    return;
                } else {
                    this.f81653j = j13 + 1;
                    C10350y1.c(j13, (byte) ((((int) j10) & l3.f92485d) | 128));
                    j10 >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void M(J0 j02) throws IOException {
            y0(j02.i());
            j02.k(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void T(int i10, int i11) throws IOException {
            G(i10, 0);
            x0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void U(int i10, long j10) throws IOException {
            G(i10, 1);
            c0(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC10351z
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            c(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void b() {
            this.f81647d.position((int) (this.f81653j - this.f81649f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void b0(int i10, int i11) throws IOException {
            G(i10, 0);
            y0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void c(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f81651h - j10;
                long j12 = this.f81653j;
                if (j11 >= j12) {
                    C10350y1.l(bArr, i10, j12, j10);
                    this.f81653j += j10;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f81653j), Long.valueOf(this.f81651h), Integer.valueOf(i11)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void c0(long j10) throws IOException {
            this.f81648e.putLong((int) (this.f81653j - this.f81649f), j10);
            this.f81653j += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void g(byte b10) throws IOException {
            long j10 = this.f81653j;
            if (j10 >= this.f81651h) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f81653j), Long.valueOf(this.f81651h), 1));
            }
            this.f81653j = 1 + j10;
            C10350y1.c(j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void i0(int i10, int i11) throws IOException {
            G(i10, 5);
            A0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void l(int i10, long j10) throws IOException {
            G(i10, 0);
            L(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void m(int i10, A a10) throws IOException {
            G(i10, 2);
            q(a10);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void m0(String str) throws IOException {
            long j10 = this.f81653j;
            try {
                int iD0 = zzbn.D0(str.length() * 3);
                int iD02 = zzbn.D0(str.length());
                if (iD02 != iD0) {
                    int iA = A1.a(str);
                    y0(iA);
                    K0(this.f81653j);
                    A1.c(str, this.f81648e);
                    this.f81653j += iA;
                    return;
                }
                int i10 = ((int) (this.f81653j - this.f81649f)) + iD02;
                this.f81648e.position(i10);
                A1.c(str, this.f81648e);
                int iPosition = this.f81648e.position() - i10;
                y0(iPosition);
                this.f81653j += iPosition;
            } catch (D1 e10) {
                this.f81653j = j10;
                K0(j10);
                s(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new zzc(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new zzc(e12);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void n(int i10, J0 j02) throws IOException {
            G(i10, 2);
            M(j02);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void o(int i10, J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException {
            G(i10, 2);
            r(j02, interfaceC10279a1);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void p(int i10, String str) throws IOException {
            G(i10, 2);
            m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void q(A a10) throws IOException {
            y0(a10.size());
            a10.h(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void r(J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException {
            AbstractC10325q abstractC10325q = (AbstractC10325q) j02;
            int iD = abstractC10325q.d();
            if (iD == -1) {
                iD = interfaceC10279a1.g(abstractC10325q);
                abstractC10325q.c(iD);
            }
            y0(iD);
            interfaceC10279a1.a(j02, this.f81637a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int u() {
            return (int) (this.f81651h - this.f81653j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void x0(int i10) throws IOException {
            if (i10 >= 0) {
                y0(i10);
            } else {
                L(i10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void y0(int i10) throws IOException {
            long j10;
            if (this.f81653j <= this.f81652i) {
                while (true) {
                    int i11 = i10 & (-128);
                    j10 = this.f81653j;
                    if (i11 == 0) {
                        break;
                    }
                    this.f81653j = j10 + 1;
                    C10350y1.c(j10, (byte) ((i10 & l3.f92485d) | 128));
                    i10 >>>= 7;
                }
            } else {
                while (true) {
                    j10 = this.f81653j;
                    if (j10 >= this.f81651h) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f81653j), Long.valueOf(this.f81651h), 1));
                    }
                    if ((i10 & (-128)) == 0) {
                        break;
                    }
                    this.f81653j = j10 + 1;
                    C10350y1.c(j10, (byte) ((i10 & l3.f92485d) | 128));
                    i10 >>>= 7;
                }
            }
            this.f81653j = 1 + j10;
            C10350y1.c(j10, (byte) i10);
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(String str, Throwable th2) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th2);
        }

        zzc(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    private zzbn() {
    }

    public static int A(int i10, C10326q0 c10326q0) {
        return (B0(1) << 1) + n0(2, i10) + d(3, c10326q0);
    }

    static int B(int i10, J0 j02, InterfaceC10279a1 interfaceC10279a1) {
        return B0(i10) + E(j02, interfaceC10279a1);
    }

    public static int B0(int i10) {
        return D0(i10 << 3);
    }

    public static int C(int i10, String str) {
        return B0(i10) + q0(str);
    }

    public static int C0(int i10) {
        if (i10 >= 0) {
            return D0(i10);
        }
        return 10;
    }

    public static int D(A a10) {
        int size = a10.size();
        return D0(size) + size;
    }

    public static int D0(int i10) {
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

    static int E(J0 j02, InterfaceC10279a1 interfaceC10279a1) {
        AbstractC10325q abstractC10325q = (AbstractC10325q) j02;
        int iD = abstractC10325q.d();
        if (iD == -1) {
            iD = interfaceC10279a1.g(abstractC10325q);
            abstractC10325q.c(iD);
        }
        return D0(iD) + iD;
    }

    public static int E0(int i10) {
        return D0(I0(i10));
    }

    public static int F(boolean z10) {
        return 1;
    }

    public static int F0(int i10) {
        return 4;
    }

    public static int G0(int i10) {
        return 4;
    }

    public static int H0(int i10) {
        return C0(i10);
    }

    private static int I0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    @Deprecated
    public static int J0(int i10) {
        return D0(i10);
    }

    public static int N(int i10, A a10) {
        int iB0 = B0(i10);
        int size = a10.size();
        return iB0 + D0(size) + size;
    }

    public static int O(int i10, J0 j02) {
        return B0(i10) + R(j02);
    }

    @Deprecated
    static int P(int i10, J0 j02, InterfaceC10279a1 interfaceC10279a1) {
        int iB0 = B0(i10) << 1;
        AbstractC10325q abstractC10325q = (AbstractC10325q) j02;
        int iD = abstractC10325q.d();
        if (iD == -1) {
            iD = interfaceC10279a1.g(abstractC10325q);
            abstractC10325q.c(iD);
        }
        return iB0 + iD;
    }

    public static int Q(int i10, boolean z10) {
        return B0(i10) + 1;
    }

    public static int R(J0 j02) {
        int i10 = j02.i();
        return D0(i10) + i10;
    }

    public static zzbn S(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int W(int i10, long j10) {
        return B0(i10) + h0(j10);
    }

    public static int X(int i10, A a10) {
        return (B0(1) << 1) + n0(2, i10) + N(3, a10);
    }

    public static int Y(int i10, J0 j02) {
        return (B0(1) << 1) + n0(2, i10) + O(3, j02);
    }

    @Deprecated
    public static int Z(J0 j02) {
        return j02.i();
    }

    public static int a0(byte[] bArr) {
        int length = bArr.length;
        return D0(length) + length;
    }

    public static int d(int i10, C10326q0 c10326q0) {
        int iB0 = B0(i10);
        int iA = c10326q0.a();
        return iB0 + D0(iA) + iA;
    }

    public static int d0(int i10, long j10) {
        return B0(i10) + h0(j10);
    }

    public static int e(C10326q0 c10326q0) {
        int iA = c10326q0.a();
        return D0(iA) + iA;
    }

    public static int e0(long j10) {
        return h0(j10);
    }

    public static zzbn f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return C10350y1.y() ? new d(byteBuffer) : new c(byteBuffer);
    }

    public static int g0(int i10, long j10) {
        return B0(i10) + h0(u0(j10));
    }

    public static int h0(long j10) {
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

    public static int j0(int i10, int i11) {
        return B0(i10) + C0(i11);
    }

    public static int k0(int i10, long j10) {
        return B0(i10) + 8;
    }

    public static int l0(long j10) {
        return h0(u0(j10));
    }

    public static int n0(int i10, int i11) {
        return B0(i10) + D0(i11);
    }

    public static int o0(int i10, long j10) {
        return B0(i10) + 8;
    }

    public static int p0(long j10) {
        return 8;
    }

    public static int q0(String str) {
        int length;
        try {
            length = A1.a(str);
        } catch (D1 unused) {
            length = str.getBytes(C10299h0.f81467a).length;
        }
        return D0(length) + length;
    }

    public static int r0(int i10, int i11) {
        return B0(i10) + D0(I0(i11));
    }

    public static int s0(long j10) {
        return 8;
    }

    public static int t0(int i10, int i11) {
        return B0(i10) + 4;
    }

    private static long u0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int v0(int i10, int i11) {
        return B0(i10) + 4;
    }

    public static int w(double d10) {
        return 8;
    }

    public static int w0(int i10, int i11) {
        return B0(i10) + C0(i11);
    }

    public static int x(float f10) {
        return 4;
    }

    public static int y(int i10, double d10) {
        return B0(i10) + 8;
    }

    public static int z(int i10, float f10) {
        return B0(i10) + 4;
    }

    public abstract void A0(int i10) throws IOException;

    public abstract void G(int i10, int i11) throws IOException;

    public final void H(int i10, long j10) throws IOException {
        l(i10, u0(j10));
    }

    public abstract void I(int i10, A a10) throws IOException;

    public abstract void J(int i10, J0 j02) throws IOException;

    public abstract void K(int i10, boolean z10) throws IOException;

    public abstract void L(long j10) throws IOException;

    public abstract void M(J0 j02) throws IOException;

    public abstract void T(int i10, int i11) throws IOException;

    public abstract void U(int i10, long j10) throws IOException;

    public final void V(long j10) throws IOException {
        L(u0(j10));
    }

    public abstract void b() throws IOException;

    public abstract void b0(int i10, int i11) throws IOException;

    public abstract void c(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void c0(long j10) throws IOException;

    public final void f0(int i10, int i11) throws IOException {
        b0(i10, I0(i11));
    }

    public abstract void g(byte b10) throws IOException;

    public final void h(double d10) throws IOException {
        c0(Double.doubleToRawLongBits(d10));
    }

    public final void i(float f10) throws IOException {
        A0(Float.floatToRawIntBits(f10));
    }

    public abstract void i0(int i10, int i11) throws IOException;

    public final void j(int i10, double d10) throws IOException {
        U(i10, Double.doubleToRawLongBits(d10));
    }

    public final void k(int i10, float f10) throws IOException {
        i0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void l(int i10, long j10) throws IOException;

    public abstract void m(int i10, A a10) throws IOException;

    public abstract void m0(String str) throws IOException;

    public abstract void n(int i10, J0 j02) throws IOException;

    abstract void o(int i10, J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException;

    public abstract void p(int i10, String str) throws IOException;

    public abstract void q(A a10) throws IOException;

    abstract void r(J0 j02, InterfaceC10279a1 interfaceC10279a1) throws IOException;

    final void s(String str, D1 d12) throws IOException {
        f81635b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) d12);
        byte[] bytes = str.getBytes(C10299h0.f81467a);
        try {
            y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (zzc e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzc(e11);
        }
    }

    public final void t(boolean z10) throws IOException {
        g(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract int u();

    public abstract void x0(int i10) throws IOException;

    public abstract void y0(int i10) throws IOException;

    public final void z0(int i10) throws IOException {
        y0(I0(i10));
    }
}
