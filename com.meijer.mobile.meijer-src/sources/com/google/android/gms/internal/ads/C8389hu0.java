package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.hu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8389hu0 extends AbstractC8708ku0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f75641e;

    /* renamed from: f, reason: collision with root package name */
    private final int f75642f;

    /* renamed from: g, reason: collision with root package name */
    private int f75643g;

    C8389hu0(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f75641e = bArr;
        this.f75643g = 0;
        this.f75642f = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final int n() {
        return this.f75642f - this.f75643g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void A(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f75643g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f75641e[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzgwt(i12, this.f75642f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzgwt(i12, this.f75642f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f75641e[i12] = (byte) i10;
        this.f75643g = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void B(int i10, long j10) throws IOException {
        A(i10 << 3);
        C(j10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void C(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.f75643g;
        if (!AbstractC8708ku0.f76552c || this.f75642f - i11 < 10) {
            int i12 = i11;
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.f75641e[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new zzgwt(i12, this.f75642f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i12 + 1;
            try {
                this.f75641e[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new zzgwt(i12, this.f75642f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                C7753bw0.y(this.f75641e, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            C7753bw0.y(this.f75641e, i11, (byte) j10);
        }
        this.f75643g = i10;
    }

    public final void F(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.f75641e, this.f75643g, i11);
            this.f75643g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgwt(this.f75643g, this.f75642f, i11, e10);
        }
    }

    public final void G(String str) throws IOException {
        int i10 = this.f75643g;
        try {
            int iE = AbstractC8708ku0.e(str.length() * 3);
            int iE2 = AbstractC8708ku0.e(str.length());
            if (iE2 != iE) {
                A(C8286gw0.e(str));
                byte[] bArr = this.f75641e;
                int i11 = this.f75643g;
                this.f75643g = C8286gw0.d(str, bArr, i11, this.f75642f - i11);
                return;
            }
            int i12 = i10 + iE2;
            this.f75643g = i12;
            int iD = C8286gw0.d(str, this.f75641e, i12, this.f75642f - i12);
            this.f75643g = i10;
            A((iD - i10) - iE2);
            this.f75643g = iD;
        } catch (C8179fw0 e10) {
            this.f75643g = i10;
            h(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgwt(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void k(byte b10) throws IOException {
        int i10 = this.f75643g;
        try {
            int i11 = i10 + 1;
            try {
                this.f75641e[i10] = b10;
                this.f75643g = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzgwt(i10, this.f75642f, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void l(int i10, boolean z10) throws IOException {
        A(i10 << 3);
        k(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void m(int i10, Zt0 zt0) throws IOException {
        A((i10 << 3) | 2);
        A(zt0.k());
        zt0.s(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void o(int i10, int i11) throws IOException {
        A((i10 << 3) | 5);
        p(i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void p(int i10) throws IOException {
        int i11 = this.f75643g;
        try {
            byte[] bArr = this.f75641e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f75643g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgwt(i11, this.f75642f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void q(int i10, long j10) throws IOException {
        A((i10 << 3) | 1);
        r(j10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void r(long j10) throws IOException {
        int i10 = this.f75643g;
        try {
            byte[] bArr = this.f75641e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f75643g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgwt(i10, this.f75642f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void s(int i10, int i11) throws IOException {
        A(i10 << 3);
        t(i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void t(int i10) throws IOException {
        if (i10 >= 0) {
            A(i10);
        } else {
            C(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    final void u(int i10, InterfaceC9245pv0 interfaceC9245pv0, Hv0 hv0) throws IOException {
        A((i10 << 3) | 2);
        A(((Ht0) interfaceC9245pv0).e(hv0));
        hv0.c(interfaceC9245pv0, this.f76554a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void v(int i10, InterfaceC9245pv0 interfaceC9245pv0) throws IOException {
        A(11);
        z(2, i10);
        A(26);
        A(interfaceC9245pv0.zzaY());
        interfaceC9245pv0.c(this);
        A(12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void w(int i10, Zt0 zt0) throws IOException {
        A(11);
        z(2, i10);
        m(3, zt0);
        A(12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void x(int i10, String str) throws IOException {
        A((i10 << 3) | 2);
        G(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void y(int i10, int i11) throws IOException {
        A((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final void z(int i10, int i11) throws IOException {
        A(i10 << 3);
        A(i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0, com.google.android.gms.internal.ads.Qt0
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        F(bArr, i10, i11);
    }
}
