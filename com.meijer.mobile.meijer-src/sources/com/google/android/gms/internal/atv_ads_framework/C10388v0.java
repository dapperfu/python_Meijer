package com.google.android.gms.internal.atv_ads_framework;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10388v0 extends AbstractC10394x0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f81907e;

    /* renamed from: f, reason: collision with root package name */
    private final int f81908f;

    /* renamed from: g, reason: collision with root package name */
    private int f81909g;

    C10388v0(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f81907e = bArr;
        this.f81909g = 0;
        this.f81908f = i11;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final int d() {
        return this.f81908f - this.f81909g;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void n(byte[] bArr, int i10, int i11) throws IOException {
        B(bArr, 0, i11);
    }

    public final void B(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f81907e, this.f81909g, i11);
            this.f81909g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzct(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81909g), Integer.valueOf(this.f81908f), Integer.valueOf(i11)), e10);
        }
    }

    public final void C(String str) throws IOException {
        int i10 = this.f81909g;
        try {
            int iY = AbstractC10394x0.y(str.length() * 3);
            int iY2 = AbstractC10394x0.y(str.length());
            if (iY2 != iY) {
                r(f2.c(str));
                byte[] bArr = this.f81907e;
                int i11 = this.f81909g;
                this.f81909g = f2.b(str, bArr, i11, this.f81908f - i11);
                return;
            }
            int i12 = i10 + iY2;
            this.f81909g = i12;
            int iB = f2.b(str, this.f81907e, i12, this.f81908f - i12);
            this.f81909g = i10;
            r((iB - i10) - iY2);
            this.f81909g = iB;
        } catch (e2 e10) {
            this.f81909g = i10;
            b(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzct(e11);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void e(byte b10) throws IOException {
        try {
            byte[] bArr = this.f81907e;
            int i10 = this.f81909g;
            this.f81909g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzct(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81909g), Integer.valueOf(this.f81908f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void f(int i10, boolean z10) throws IOException {
        r(i10 << 3);
        e(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void g(int i10, AbstractC10374q0 abstractC10374q0) throws IOException {
        r((i10 << 3) | 2);
        r(abstractC10374q0.f());
        abstractC10374q0.m(this);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void h(int i10, int i11) throws IOException {
        r((i10 << 3) | 5);
        i(i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void i(int i10) throws IOException {
        try {
            byte[] bArr = this.f81907e;
            int i11 = this.f81909g;
            int i12 = i11 + 1;
            this.f81909g = i12;
            bArr[i11] = (byte) (i10 & l3.f93323c);
            int i13 = i11 + 2;
            this.f81909g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & l3.f93323c);
            int i14 = i11 + 3;
            this.f81909g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & l3.f93323c);
            this.f81909g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & l3.f93323c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzct(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81909g), Integer.valueOf(this.f81908f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void j(int i10, long j10) throws IOException {
        r((i10 << 3) | 1);
        k(j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void k(long j10) throws IOException {
        try {
            byte[] bArr = this.f81907e;
            int i10 = this.f81909g;
            int i11 = i10 + 1;
            this.f81909g = i11;
            bArr[i10] = (byte) (((int) j10) & l3.f93323c);
            int i12 = i10 + 2;
            this.f81909g = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & l3.f93323c);
            int i13 = i10 + 3;
            this.f81909g = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & l3.f93323c);
            int i14 = i10 + 4;
            this.f81909g = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & l3.f93323c);
            int i15 = i10 + 5;
            this.f81909g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & l3.f93323c);
            int i16 = i10 + 6;
            this.f81909g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & l3.f93323c);
            int i17 = i10 + 7;
            this.f81909g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & l3.f93323c);
            this.f81909g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & l3.f93323c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzct(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81909g), Integer.valueOf(this.f81908f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void l(int i10, int i11) throws IOException {
        r(i10 << 3);
        m(i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void m(int i10) throws IOException {
        if (i10 >= 0) {
            r(i10);
        } else {
            t(i10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void o(int i10, String str) throws IOException {
        r((i10 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void p(int i10, int i11) throws IOException {
        r((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void q(int i10, int i11) throws IOException {
        r(i10 << 3);
        r(i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void r(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f81907e;
                int i11 = this.f81909g;
                this.f81909g = i11 + 1;
                bArr[i11] = (byte) ((i10 & l3.f93324d) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzct(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81909g), Integer.valueOf(this.f81908f), 1), e10);
            }
        }
        byte[] bArr2 = this.f81907e;
        int i12 = this.f81909g;
        this.f81909g = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void s(int i10, long j10) throws IOException {
        r(i10 << 3);
        t(j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10394x0
    public final void t(long j10) throws IOException {
        if (AbstractC10394x0.f81913c && this.f81908f - this.f81909g >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f81907e;
                int i10 = this.f81909g;
                this.f81909g = i10 + 1;
                C10326a2.s(bArr, i10, (byte) ((((int) j10) & l3.f93324d) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f81907e;
            int i11 = this.f81909g;
            this.f81909g = i11 + 1;
            C10326a2.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f81907e;
                int i12 = this.f81909g;
                this.f81909g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & l3.f93324d) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzct(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f81909g), Integer.valueOf(this.f81908f), 1), e10);
            }
        }
        byte[] bArr4 = this.f81907e;
        int i13 = this.f81909g;
        this.f81909g = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
