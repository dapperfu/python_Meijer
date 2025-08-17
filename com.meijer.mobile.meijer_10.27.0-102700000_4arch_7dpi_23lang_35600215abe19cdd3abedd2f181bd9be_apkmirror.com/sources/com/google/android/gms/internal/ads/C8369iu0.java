package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.iu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8369iu0 extends AbstractC8157gu0 {

    /* renamed from: i, reason: collision with root package name */
    private final OutputStream f75019i;

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void A(int i10) throws IOException {
        L(5);
        I(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void p(int i10) throws IOException {
        L(4);
        G(i10);
    }

    private final void K() throws IOException {
        this.f75019i.write(this.f74419e, 0, this.f74421g);
        this.f74421g = 0;
    }

    private final void L(int i10) throws IOException {
        if (this.f74420f - this.f74421g < i10) {
            K();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void B(int i10, long j10) throws IOException {
        L(20);
        I(i10 << 3);
        J(j10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void C(long j10) throws IOException {
        L(10);
        J(j10);
    }

    public final void M(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f74420f;
        int i13 = this.f74421g;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.f74419e, i13, i11);
            this.f74421g += i11;
            this.f74422h += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.f74419e, i13, i14);
        int i15 = i10 + i14;
        this.f74421g = this.f74420f;
        this.f74422h += i14;
        K();
        int i16 = i11 - i14;
        if (i16 <= this.f74420f) {
            System.arraycopy(bArr, i15, this.f74419e, 0, i16);
            this.f74421g = i16;
        } else {
            this.f75019i.write(bArr, i15, i16);
        }
        this.f74422h += i16;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void j() throws IOException {
        if (this.f74421g > 0) {
            K();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void k(byte b10) throws IOException {
        if (this.f74421g == this.f74420f) {
            K();
        }
        F(b10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void l(int i10, boolean z10) throws IOException {
        L(11);
        I(i10 << 3);
        F(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void m(int i10, Zt0 zt0) throws IOException {
        A((i10 << 3) | 2);
        A(zt0.k());
        zt0.s(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void o(int i10, int i11) throws IOException {
        L(14);
        I((i10 << 3) | 5);
        G(i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void q(int i10, long j10) throws IOException {
        L(18);
        I((i10 << 3) | 1);
        H(j10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void r(long j10) throws IOException {
        L(8);
        H(j10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void s(int i10, int i11) throws IOException {
        L(20);
        I(i10 << 3);
        if (i11 >= 0) {
            I(i11);
        } else {
            J(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void t(int i10) throws IOException {
        if (i10 >= 0) {
            A(i10);
        } else {
            C(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    final void u(int i10, InterfaceC9120pv0 interfaceC9120pv0, Hv0 hv0) throws IOException {
        A((i10 << 3) | 2);
        A(((Ht0) interfaceC9120pv0).e(hv0));
        hv0.c(interfaceC9120pv0, this.f75714a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void v(int i10, InterfaceC9120pv0 interfaceC9120pv0) throws IOException {
        A(11);
        z(2, i10);
        A(26);
        A(interfaceC9120pv0.zzaY());
        interfaceC9120pv0.c(this);
        A(12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void w(int i10, Zt0 zt0) throws IOException {
        A(11);
        z(2, i10);
        m(3, zt0);
        A(12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void x(int i10, String str) throws IOException {
        A((i10 << 3) | 2);
        N(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void y(int i10, int i11) throws IOException {
        A((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final void z(int i10, int i11) throws IOException {
        L(20);
        I(i10 << 3);
        I(i11);
    }

    C8369iu0(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream != null) {
            this.f75019i = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    public final void N(String str) throws IOException {
        int iE;
        try {
            int length = str.length() * 3;
            int iE2 = AbstractC8583ku0.e(length);
            int i10 = iE2 + length;
            int i11 = this.f74420f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iD = C8161gw0.d(str, bArr, 0, length);
                A(iD);
                M(bArr, 0, iD);
                return;
            }
            if (i10 > i11 - this.f74421g) {
                K();
            }
            int iE3 = AbstractC8583ku0.e(str.length());
            int i12 = this.f74421g;
            try {
                if (iE3 == iE2) {
                    int i13 = i12 + iE3;
                    this.f74421g = i13;
                    int iD2 = C8161gw0.d(str, this.f74419e, i13, this.f74420f - i13);
                    this.f74421g = i12;
                    iE = (iD2 - i12) - iE3;
                    I(iE);
                    this.f74421g = iD2;
                } else {
                    iE = C8161gw0.e(str);
                    I(iE);
                    this.f74421g = C8161gw0.d(str, this.f74419e, this.f74421g, iE);
                }
                this.f74422h += iE;
            } catch (C8054fw0 e10) {
                this.f74422h -= this.f74421g - i12;
                this.f74421g = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgwt(e11);
            }
        } catch (C8054fw0 e12) {
            h(str, e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0, com.google.android.gms.internal.ads.Qt0
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        M(bArr, i10, i11);
    }
}
