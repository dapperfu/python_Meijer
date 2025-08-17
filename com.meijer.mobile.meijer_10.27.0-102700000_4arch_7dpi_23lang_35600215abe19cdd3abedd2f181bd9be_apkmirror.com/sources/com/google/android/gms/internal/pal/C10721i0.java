package com.google.android.gms.internal.pal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10721i0 extends AbstractC10753k0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f83161d;

    /* renamed from: e, reason: collision with root package name */
    private final int f83162e;

    /* renamed from: f, reason: collision with root package name */
    private int f83163f;

    C10721i0(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f83161d = bArr;
        this.f83163f = 0;
        this.f83162e = i11;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final int g() {
        return this.f83162e - this.f83163f;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void q(byte[] bArr, int i10, int i11) throws IOException {
        E(bArr, 0, i11);
    }

    public final void E(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f83161d, this.f83163f, i11);
            this.f83163f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f83163f), Integer.valueOf(this.f83162e), Integer.valueOf(i11)), e10);
        }
    }

    public final void F(String str) throws IOException {
        int i10 = this.f83163f;
        try {
            int iA = AbstractC10753k0.a(str.length() * 3);
            int iA2 = AbstractC10753k0.a(str.length());
            if (iA2 != iA) {
                u(Y1.c(str));
                byte[] bArr = this.f83161d;
                int i11 = this.f83163f;
                this.f83163f = Y1.b(str, bArr, i11, this.f83162e - i11);
                return;
            }
            int i12 = i10 + iA2;
            this.f83163f = i12;
            int iB = Y1.b(str, this.f83161d, i12, this.f83162e - i12);
            this.f83163f = i10;
            u((iB - i10) - iA2);
            this.f83163f = iB;
        } catch (X1 e10) {
            this.f83163f = i10;
            e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzacf(e11);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void h(byte b10) throws IOException {
        try {
            byte[] bArr = this.f83161d;
            int i10 = this.f83163f;
            this.f83163f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f83163f), Integer.valueOf(this.f83162e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void i(int i10, boolean z10) throws IOException {
        u(i10 << 3);
        h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void j(int i10, AbstractC10605b0 abstractC10605b0) throws IOException {
        u((i10 << 3) | 2);
        u(abstractC10605b0.f());
        abstractC10605b0.o(this);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void k(int i10, int i11) throws IOException {
        u((i10 << 3) | 5);
        l(i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void l(int i10) throws IOException {
        try {
            byte[] bArr = this.f83161d;
            int i11 = this.f83163f;
            int i12 = i11 + 1;
            this.f83163f = i12;
            bArr[i11] = (byte) (i10 & com.medallia.digital.mobilesdk.l3.f92484c);
            int i13 = i11 + 2;
            this.f83163f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i14 = i11 + 3;
            this.f83163f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f92484c);
            this.f83163f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f92484c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f83163f), Integer.valueOf(this.f83162e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void m(int i10, long j10) throws IOException {
        u((i10 << 3) | 1);
        n(j10);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void n(long j10) throws IOException {
        try {
            byte[] bArr = this.f83161d;
            int i10 = this.f83163f;
            int i11 = i10 + 1;
            this.f83163f = i11;
            bArr[i10] = (byte) (((int) j10) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i12 = i10 + 2;
            this.f83163f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i13 = i10 + 3;
            this.f83163f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i14 = i10 + 4;
            this.f83163f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i15 = i10 + 5;
            this.f83163f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i16 = i10 + 6;
            this.f83163f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & com.medallia.digital.mobilesdk.l3.f92484c);
            int i17 = i10 + 7;
            this.f83163f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & com.medallia.digital.mobilesdk.l3.f92484c);
            this.f83163f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & com.medallia.digital.mobilesdk.l3.f92484c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f83163f), Integer.valueOf(this.f83162e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void o(int i10, int i11) throws IOException {
        u(i10 << 3);
        p(i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void p(int i10) throws IOException {
        if (i10 >= 0) {
            u(i10);
        } else {
            w(i10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void r(int i10, String str) throws IOException {
        u((i10 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void s(int i10, int i11) throws IOException {
        u((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void t(int i10, int i11) throws IOException {
        u(i10 << 3);
        u(i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void u(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f83161d;
                int i11 = this.f83163f;
                this.f83163f = i11 + 1;
                bArr[i11] = (byte) ((i10 & com.medallia.digital.mobilesdk.l3.f92485d) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f83163f), Integer.valueOf(this.f83162e), 1), e10);
            }
        }
        byte[] bArr2 = this.f83161d;
        int i12 = this.f83163f;
        this.f83163f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void v(int i10, long j10) throws IOException {
        u(i10 << 3);
        w(j10);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10753k0
    public final void w(long j10) throws IOException {
        if (AbstractC10753k0.f83201c && this.f83162e - this.f83163f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f83161d;
                int i10 = this.f83163f;
                this.f83163f = i10 + 1;
                T1.s(bArr, i10, (byte) ((((int) j10) & com.medallia.digital.mobilesdk.l3.f92485d) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f83161d;
            int i11 = this.f83163f;
            this.f83163f = i11 + 1;
            T1.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f83161d;
                int i12 = this.f83163f;
                this.f83163f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & com.medallia.digital.mobilesdk.l3.f92485d) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f83163f), Integer.valueOf(this.f83162e), 1), e10);
            }
        }
        byte[] bArr4 = this.f83161d;
        int i13 = this.f83163f;
        this.f83163f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
