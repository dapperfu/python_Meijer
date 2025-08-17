package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8157gu0 extends AbstractC8583ku0 {

    /* renamed from: e, reason: collision with root package name */
    final byte[] f74419e;

    /* renamed from: f, reason: collision with root package name */
    final int f74420f;

    /* renamed from: g, reason: collision with root package name */
    int f74421g;

    /* renamed from: h, reason: collision with root package name */
    int f74422h;

    AbstractC8157gu0(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f74419e = bArr;
        this.f74420f = bArr.length;
    }

    final void F(byte b10) {
        byte[] bArr = this.f74419e;
        int i10 = this.f74421g;
        bArr[i10] = b10;
        this.f74421g = i10 + 1;
        this.f74422h++;
    }

    final void G(int i10) {
        int i11 = this.f74421g;
        byte[] bArr = this.f74419e;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f74421g = i11 + 4;
        this.f74422h += 4;
    }

    final void H(long j10) {
        int i10 = this.f74421g;
        byte[] bArr = this.f74419e;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.f74421g = i10 + 8;
        this.f74422h += 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8583ku0
    public final int n() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void I(int i10) {
        if (AbstractC8583ku0.f75712c) {
            long j10 = this.f74421g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f74419e;
                int i11 = this.f74421g;
                this.f74421g = i11 + 1;
                C7628bw0.y(bArr, i11, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f74419e;
            int i12 = this.f74421g;
            this.f74421g = i12 + 1;
            C7628bw0.y(bArr2, i12, (byte) i10);
            this.f74422h += (int) (this.f74421g - j10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.f74419e;
            int i13 = this.f74421g;
            this.f74421g = i13 + 1;
            bArr3[i13] = (byte) (i10 | 128);
            this.f74422h++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.f74419e;
        int i14 = this.f74421g;
        this.f74421g = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.f74422h++;
    }

    final void J(long j10) {
        if (AbstractC8583ku0.f75712c) {
            long j11 = this.f74421g;
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr = this.f74419e;
                    int i11 = this.f74421g;
                    this.f74421g = i11 + 1;
                    C7628bw0.y(bArr, i11, (byte) i10);
                    this.f74422h += (int) (this.f74421g - j11);
                    return;
                }
                byte[] bArr2 = this.f74419e;
                int i12 = this.f74421g;
                this.f74421g = i12 + 1;
                C7628bw0.y(bArr2, i12, (byte) (i10 | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr3 = this.f74419e;
                    int i14 = this.f74421g;
                    this.f74421g = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.f74422h++;
                    return;
                }
                byte[] bArr4 = this.f74419e;
                int i15 = this.f74421g;
                this.f74421g = i15 + 1;
                bArr4[i15] = (byte) (i13 | 128);
                this.f74422h++;
                j10 >>>= 7;
            }
        }
    }
}
