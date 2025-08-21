package com.google.android.gms.internal.pal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10846i0 extends AbstractC10878k0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f84001d;

    /* renamed from: e, reason: collision with root package name */
    private final int f84002e;

    /* renamed from: f, reason: collision with root package name */
    private int f84003f;

    C10846i0(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f84001d = bArr;
        this.f84003f = 0;
        this.f84002e = i11;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final int g() {
        return this.f84002e - this.f84003f;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void q(byte[] bArr, int i10, int i11) throws IOException {
        E(bArr, 0, i11);
    }

    public final void E(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f84001d, this.f84003f, i11);
            this.f84003f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f84003f), Integer.valueOf(this.f84002e), Integer.valueOf(i11)), e10);
        }
    }

    public final void F(String str) throws IOException {
        int i10 = this.f84003f;
        try {
            int iA = AbstractC10878k0.a(str.length() * 3);
            int iA2 = AbstractC10878k0.a(str.length());
            if (iA2 != iA) {
                u(Y1.c(str));
                byte[] bArr = this.f84001d;
                int i11 = this.f84003f;
                this.f84003f = Y1.b(str, bArr, i11, this.f84002e - i11);
                return;
            }
            int i12 = i10 + iA2;
            this.f84003f = i12;
            int iB = Y1.b(str, this.f84001d, i12, this.f84002e - i12);
            this.f84003f = i10;
            u((iB - i10) - iA2);
            this.f84003f = iB;
        } catch (X1 e10) {
            this.f84003f = i10;
            e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzacf(e11);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void h(byte b10) throws IOException {
        try {
            byte[] bArr = this.f84001d;
            int i10 = this.f84003f;
            this.f84003f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f84003f), Integer.valueOf(this.f84002e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void i(int i10, boolean z10) throws IOException {
        u(i10 << 3);
        h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void j(int i10, AbstractC10730b0 abstractC10730b0) throws IOException {
        u((i10 << 3) | 2);
        u(abstractC10730b0.f());
        abstractC10730b0.o(this);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void k(int i10, int i11) throws IOException {
        u((i10 << 3) | 5);
        l(i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void l(int i10) throws IOException {
        try {
            byte[] bArr = this.f84001d;
            int i11 = this.f84003f;
            int i12 = i11 + 1;
            this.f84003f = i12;
            bArr[i11] = (byte) (i10 & com.medallia.digital.mobilesdk.l3.f93323c);
            int i13 = i11 + 2;
            this.f84003f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i14 = i11 + 3;
            this.f84003f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f93323c);
            this.f84003f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f93323c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f84003f), Integer.valueOf(this.f84002e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void m(int i10, long j10) throws IOException {
        u((i10 << 3) | 1);
        n(j10);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void n(long j10) throws IOException {
        try {
            byte[] bArr = this.f84001d;
            int i10 = this.f84003f;
            int i11 = i10 + 1;
            this.f84003f = i11;
            bArr[i10] = (byte) (((int) j10) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i12 = i10 + 2;
            this.f84003f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i13 = i10 + 3;
            this.f84003f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i14 = i10 + 4;
            this.f84003f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i15 = i10 + 5;
            this.f84003f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i16 = i10 + 6;
            this.f84003f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & com.medallia.digital.mobilesdk.l3.f93323c);
            int i17 = i10 + 7;
            this.f84003f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & com.medallia.digital.mobilesdk.l3.f93323c);
            this.f84003f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & com.medallia.digital.mobilesdk.l3.f93323c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f84003f), Integer.valueOf(this.f84002e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void o(int i10, int i11) throws IOException {
        u(i10 << 3);
        p(i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void p(int i10) throws IOException {
        if (i10 >= 0) {
            u(i10);
        } else {
            w(i10);
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void r(int i10, String str) throws IOException {
        u((i10 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void s(int i10, int i11) throws IOException {
        u((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void t(int i10, int i11) throws IOException {
        u(i10 << 3);
        u(i11);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void u(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f84001d;
                int i11 = this.f84003f;
                this.f84003f = i11 + 1;
                bArr[i11] = (byte) ((i10 & com.medallia.digital.mobilesdk.l3.f93324d) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f84003f), Integer.valueOf(this.f84002e), 1), e10);
            }
        }
        byte[] bArr2 = this.f84001d;
        int i12 = this.f84003f;
        this.f84003f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void v(int i10, long j10) throws IOException {
        u(i10 << 3);
        w(j10);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10878k0
    public final void w(long j10) throws IOException {
        if (AbstractC10878k0.f84041c && this.f84002e - this.f84003f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f84001d;
                int i10 = this.f84003f;
                this.f84003f = i10 + 1;
                T1.s(bArr, i10, (byte) ((((int) j10) & com.medallia.digital.mobilesdk.l3.f93324d) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f84001d;
            int i11 = this.f84003f;
            this.f84003f = i11 + 1;
            T1.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f84001d;
                int i12 = this.f84003f;
                this.f84003f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & com.medallia.digital.mobilesdk.l3.f93324d) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f84003f), Integer.valueOf(this.f84002e), 1), e10);
            }
        }
        byte[] bArr4 = this.f84001d;
        int i13 = this.f84003f;
        this.f84003f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
