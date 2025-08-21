package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.rD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9388rD0 extends AbstractC7308Su {

    /* renamed from: i, reason: collision with root package name */
    private int f78805i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f78806j;

    /* renamed from: k, reason: collision with root package name */
    private int f78807k;

    /* renamed from: l, reason: collision with root package name */
    private long f78808l;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f78810n;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f78813q;

    /* renamed from: m, reason: collision with root package name */
    private int f78809m = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f78811o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f78812p = 0;

    private static int m(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    public final void g() {
        this.f78806j = false;
        byte[] bArr = OV.f69936f;
        this.f78810n = bArr;
        this.f78813q = bArr;
    }

    public final long i() {
        return this.f78808l;
    }

    public final void j(boolean z10) {
        this.f78806j = z10;
    }

    private final int l(long j10) {
        return (int) ((j10 * this.f71016b.f78920a) / 1000000);
    }

    private final void n(boolean z10) {
        int i10;
        int length;
        int i11 = this.f78812p;
        int length2 = this.f78810n.length;
        if (i11 != length2) {
            if (!z10) {
                return;
            } else {
                z10 = true;
            }
        }
        if (this.f78809m == 0) {
            if (z10) {
                o(i11, 3);
                length = i11;
            } else {
                C8211gC.f(i11 >= (length2 >> 1));
                length = this.f78810n.length >> 1;
                o(length, 0);
            }
            i10 = length;
        } else {
            int i12 = length2 >> 1;
            int i13 = i11 - i12;
            if (z10) {
                int iK = k(i13) + (this.f78810n.length >> 1);
                o(iK, 2);
                int i14 = i12 + i13;
                i10 = iK;
                length = i14;
            } else {
                int iK2 = k(i13);
                o(iK2, 1);
                i10 = iK2;
                length = i13;
            }
        }
        C8211gC.g(length % this.f78805i == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        C8211gC.f(i11 >= i10);
        this.f78812p -= length;
        int i15 = this.f78811o + length;
        this.f78811o = i15;
        this.f78811o = i15 % this.f78810n.length;
        this.f78809m = this.f78809m + (i10 / this.f78805i);
        this.f78808l += (length - i10) / r2;
    }

    private final void o(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return;
        }
        C8211gC.d(this.f78812p >= i10);
        if (i11 == 2) {
            int i13 = this.f78811o;
            int i14 = this.f78812p;
            int i15 = i13 + i14;
            byte[] bArr = this.f78810n;
            int length = bArr.length;
            if (i15 <= length) {
                System.arraycopy(bArr, i15 - i10, this.f78813q, 0, i10);
            } else {
                int i16 = i14 - (length - i13);
                if (i16 >= i10) {
                    System.arraycopy(bArr, i16 - i10, this.f78813q, 0, i10);
                } else {
                    int i17 = i10 - i16;
                    System.arraycopy(bArr, length - i17, this.f78813q, 0, i17);
                    System.arraycopy(this.f78810n, 0, this.f78813q, i17, i16);
                }
            }
        } else {
            int i18 = this.f78811o;
            int i19 = i18 + i10;
            byte[] bArr2 = this.f78810n;
            int length2 = bArr2.length;
            if (i19 <= length2) {
                System.arraycopy(bArr2, i18, this.f78813q, 0, i10);
            } else {
                int i20 = length2 - i18;
                System.arraycopy(bArr2, i18, this.f78813q, 0, i20);
                System.arraycopy(this.f78810n, 0, this.f78813q, i20, i10 - i20);
            }
        }
        C8211gC.e(i10 % this.f78805i == 0, "sizeToOutput is not aligned to frame size: " + i10);
        C8211gC.f(this.f78811o < this.f78810n.length);
        byte[] bArr3 = this.f78813q;
        C8211gC.e(i10 % this.f78805i == 0, "byteOutput size is not aligned to frame size " + i10);
        if (i11 != 3) {
            for (int i21 = 0; i21 < i10; i21 += 2) {
                int i22 = i21 + 1;
                int iM = m(bArr3[i22], bArr3[i21]);
                if (i11 == 0) {
                    i12 = ((((i21 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i12 = 10;
                    if (i11 == 2) {
                        i12 = 10 + (((90000 * i21) / (i10 - 1)) / 1000);
                    }
                }
                int i23 = (iM * i12) / 100;
                if (i23 >= 32767) {
                    bArr3[i21] = -1;
                    bArr3[i22] = Byte.MAX_VALUE;
                } else if (i23 <= -32768) {
                    bArr3[i21] = 0;
                    bArr3[i22] = Byte.MIN_VALUE;
                } else {
                    bArr3[i21] = (byte) (i23 & com.medallia.digital.mobilesdk.l3.f93323c);
                    bArr3[i22] = (byte) (i23 >> 8);
                }
            }
        }
        d(i10).put(bArr3, 0, i10).flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    protected final C9453rt c(C9453rt c9453rt) throws zzcg {
        if (c9453rt.f78922c == 2) {
            return c9453rt.f78920a == -1 ? C9453rt.f78919e : c9453rt;
        }
        throw new zzcg("Unhandled input format:", c9453rt);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    public final void f() {
        if (this.f78812p > 0) {
            n(true);
            this.f78809m = 0;
        }
    }

    public C9388rD0() {
        byte[] bArr = OV.f69936f;
        this.f78810n = bArr;
        this.f78813q = bArr;
    }

    private final int k(int i10) {
        boolean z10 = true;
        int iL = ((l(2000000L) - this.f78809m) * this.f78805i) - (this.f78810n.length >> 1);
        if (iL < 0) {
            z10 = false;
        }
        C8211gC.f(z10);
        int iMin = (int) Math.min((i10 * 0.2f) + 0.5f, iL);
        int i11 = this.f78805i;
        return (iMin / i11) * i11;
    }

    private static final boolean p(byte b10, byte b11) {
        if (Math.abs(m(b10, b11)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void a(ByteBuffer byteBuffer) {
        boolean z10;
        int iLimit;
        int i10;
        boolean z11;
        int iPosition;
        while (byteBuffer.hasRemaining() && !h()) {
            boolean z12 = true;
            if (this.f78807k != 0) {
                if (this.f78811o < this.f78810n.length) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C8211gC.f(z10);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 < byteBuffer.limit()) {
                        if (p(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i11 = this.f78805i;
                            iLimit = i11 * (iPosition2 / i11);
                            break;
                        }
                        iPosition2 += 2;
                    } else {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i12 = this.f78811o;
                int i13 = this.f78812p;
                int i14 = i12 + i13;
                int length = this.f78810n.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int iMin = Math.min(iPosition3, i10);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f78810n, i14, iMin);
                int i15 = this.f78812p + iMin;
                this.f78812p = i15;
                if (i15 <= this.f78810n.length) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C8211gC.f(z11);
                if (iLimit >= iLimit2 || iPosition3 >= i10) {
                    z12 = false;
                }
                n(z12);
                if (z12) {
                    this.f78807k = 0;
                    this.f78809m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f78810n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 >= byteBuffer.position()) {
                        if (p(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i16 = this.f78805i;
                            iPosition = ((iLimit4 / i16) * i16) + i16;
                            break;
                        }
                        iLimit4 -= 2;
                    } else {
                        iPosition = byteBuffer.position();
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f78807k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    d(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    public final void e() {
        if (zzg()) {
            int i10 = this.f71016b.f78921b;
            this.f78805i = i10 + i10;
            int iL = l(100000L) / 2;
            int i11 = this.f78805i;
            int i12 = (iL / i11) * i11;
            int i13 = i12 + i12;
            if (this.f78810n.length != i13) {
                this.f78810n = new byte[i13];
                this.f78813q = new byte[i13];
            }
        }
        this.f78807k = 0;
        this.f78808l = 0L;
        this.f78809m = 0;
        this.f78811o = 0;
        this.f78812p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su, com.google.android.gms.internal.ads.InterfaceC9455ru
    public final boolean zzg() {
        if (super.zzg() && this.f78806j) {
            return true;
        }
        return false;
    }
}
