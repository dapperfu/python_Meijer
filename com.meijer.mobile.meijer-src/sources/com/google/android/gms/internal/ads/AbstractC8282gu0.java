package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8282gu0 extends AbstractC8708ku0 {

    /* renamed from: e, reason: collision with root package name */
    final byte[] f75259e;

    /* renamed from: f, reason: collision with root package name */
    final int f75260f;

    /* renamed from: g, reason: collision with root package name */
    int f75261g;

    /* renamed from: h, reason: collision with root package name */
    int f75262h;

    AbstractC8282gu0(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f75259e = bArr;
        this.f75260f = bArr.length;
    }

    final void F(byte b10) {
        byte[] bArr = this.f75259e;
        int i10 = this.f75261g;
        bArr[i10] = b10;
        this.f75261g = i10 + 1;
        this.f75262h++;
    }

    final void G(int i10) {
        int i11 = this.f75261g;
        byte[] bArr = this.f75259e;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f75261g = i11 + 4;
        this.f75262h += 4;
    }

    final void H(long j10) {
        int i10 = this.f75261g;
        byte[] bArr = this.f75259e;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.f75261g = i10 + 8;
        this.f75262h += 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8708ku0
    public final int n() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void I(int i10) {
        if (AbstractC8708ku0.f76552c) {
            long j10 = this.f75261g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f75259e;
                int i11 = this.f75261g;
                this.f75261g = i11 + 1;
                C7753bw0.y(bArr, i11, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f75259e;
            int i12 = this.f75261g;
            this.f75261g = i12 + 1;
            C7753bw0.y(bArr2, i12, (byte) i10);
            this.f75262h += (int) (this.f75261g - j10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.f75259e;
            int i13 = this.f75261g;
            this.f75261g = i13 + 1;
            bArr3[i13] = (byte) (i10 | 128);
            this.f75262h++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.f75259e;
        int i14 = this.f75261g;
        this.f75261g = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.f75262h++;
    }

    final void J(long j10) {
        if (AbstractC8708ku0.f76552c) {
            long j11 = this.f75261g;
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr = this.f75259e;
                    int i11 = this.f75261g;
                    this.f75261g = i11 + 1;
                    C7753bw0.y(bArr, i11, (byte) i10);
                    this.f75262h += (int) (this.f75261g - j11);
                    return;
                }
                byte[] bArr2 = this.f75259e;
                int i12 = this.f75261g;
                this.f75261g = i12 + 1;
                C7753bw0.y(bArr2, i12, (byte) (i10 | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr3 = this.f75259e;
                    int i14 = this.f75261g;
                    this.f75261g = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.f75262h++;
                    return;
                }
                byte[] bArr4 = this.f75259e;
                int i15 = this.f75261g;
                this.f75261g = i15 + 1;
                bArr4[i15] = (byte) (i13 | 128);
                this.f75262h++;
                j10 >>>= 7;
            }
        }
    }
}
