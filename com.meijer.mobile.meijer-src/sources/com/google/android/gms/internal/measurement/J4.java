package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes6.dex */
final class J4 extends K4 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f82647e;

    /* renamed from: f, reason: collision with root package name */
    private final int f82648f;

    /* renamed from: g, reason: collision with root package name */
    private int f82649g;

    J4(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f82647e = bArr;
        this.f82649g = 0;
        this.f82648f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void D(byte[] bArr, int i10, int i11) throws IOException {
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final int F() {
        return this.f82648f - this.f82649g;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void A(int i10) throws IOException {
        int i11 = this.f82649g;
        try {
            byte[] bArr = this.f82647e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f82649g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(i11, this.f82648f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void C(long j10) throws IOException {
        int i10 = this.f82649g;
        try {
            byte[] bArr = this.f82647e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f82649g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(i10, this.f82648f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void E(String str) throws IOException {
        int i10 = this.f82649g;
        try {
            int iG = K4.G(str.length() * 3);
            int iG2 = K4.G(str.length());
            if (iG2 != iG) {
                z(C10630q6.b(str));
                byte[] bArr = this.f82647e;
                int i11 = this.f82649g;
                this.f82649g = C10630q6.c(str, bArr, i11, this.f82648f - i11);
                return;
            }
            int i12 = i10 + iG2;
            this.f82649g = i12;
            int iC = C10630q6.c(str, this.f82647e, i12, this.f82648f - i12);
            this.f82649g = i10;
            z((iC - i10) - iG2);
            this.f82649g = iC;
        } catch (C10621p6 e10) {
            this.f82649g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzll(e11);
        }
    }

    public final void H(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f82647e, this.f82649g, i11);
            this.f82649g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(this.f82649g, this.f82648f, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void i(int i10, int i11) throws IOException {
        z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void j(int i10, int i11) throws IOException {
        z(i10 << 3);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void k(int i10, int i11) throws IOException {
        z(i10 << 3);
        z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void l(int i10, int i11) throws IOException {
        z((i10 << 3) | 5);
        A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void m(int i10, long j10) throws IOException {
        z(i10 << 3);
        B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void n(int i10, long j10) throws IOException {
        z((i10 << 3) | 1);
        C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void o(int i10, boolean z10) throws IOException {
        z(i10 << 3);
        x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void p(int i10, String str) throws IOException {
        z((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void q(int i10, G4 g42) throws IOException {
        z((i10 << 3) | 2);
        r(g42);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    final void t(int i10, K5 k52, V5 v52) throws IOException {
        z((i10 << 3) | 2);
        z(((AbstractC10628q4) k52).h(v52));
        v52.d(k52, this.f82657a);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void u(int i10, K5 k52) throws IOException {
        z(11);
        k(2, i10);
        z(26);
        w(k52);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void v(int i10, G4 g42) throws IOException {
        z(11);
        k(2, i10);
        q(3, g42);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void x(byte b10) throws IOException {
        int i10 = this.f82649g;
        try {
            int i11 = i10 + 1;
            try {
                this.f82647e[i10] = b10;
                this.f82649g = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzll(i10, this.f82648f, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void y(int i10) throws IOException {
        if (i10 >= 0) {
            z(i10);
        } else {
            B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void z(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f82649g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f82647e[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzll(i12, this.f82648f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzll(i12, this.f82648f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f82647e[i12] = (byte) i10;
        this.f82649g = i11;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void B(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = K4.f82655c;
        int i11 = this.f82649g;
        if (z10 && this.f82648f - i11 >= 10) {
            while ((j10 & (-128)) != 0) {
                C10603n6.u(this.f82647e, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            C10603n6.u(this.f82647e, i11, (byte) j10);
        } else {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f82647e[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new zzll(i11, this.f82648f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f82647e[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new zzll(i11, this.f82648f, 1, indexOutOfBoundsException);
            }
        }
        this.f82649g = i10;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void r(G4 g42) throws IOException {
        z(g42.f());
        g42.k(this);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void s(byte[] bArr, int i10, int i11) throws IOException {
        z(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final void w(K5 k52) throws IOException {
        z(k52.a());
        k52.c(this);
    }
}
