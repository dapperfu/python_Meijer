package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class LF0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f68318a = new GQ(32);

    /* renamed from: b, reason: collision with root package name */
    private KF0 f68319b;

    /* renamed from: c, reason: collision with root package name */
    private KF0 f68320c;

    /* renamed from: d, reason: collision with root package name */
    private KF0 f68321d;

    /* renamed from: e, reason: collision with root package name */
    private long f68322e;

    /* renamed from: f, reason: collision with root package name */
    private final C7990fH0 f68323f;

    public final long b() {
        return this.f68322e;
    }

    public final void g() {
        this.f68320c = this.f68319b;
    }

    private final int i(int i10) {
        KF0 kf0 = this.f68321d;
        if (kf0.f68067c == null) {
            YG0 yg0B = this.f68323f.b();
            KF0 kf02 = new KF0(this.f68321d.f68066b, 65536);
            kf0.f68067c = yg0B;
            kf0.f68068d = kf02;
        }
        return Math.min(i10, (int) (this.f68321d.f68066b - this.f68322e));
    }

    private static KF0 j(KF0 kf0, long j10) {
        while (j10 >= kf0.f68066b) {
            kf0 = kf0.f68068d;
        }
        return kf0;
    }

    private static KF0 m(KF0 kf0, By0 by0, NF0 nf0, GQ gq2) {
        KF0 kf0L;
        if (by0.l()) {
            long j10 = nf0.f68849b;
            int iG = 1;
            gq2.i(1);
            KF0 kf0L2 = l(kf0, j10, gq2.n(), 1);
            long j11 = j10 + 1;
            byte b10 = gq2.n()[0];
            int i10 = b10 & 128;
            int i11 = b10 & Byte.MAX_VALUE;
            Qx0 qx0 = by0.f65630c;
            byte[] bArr = qx0.f69689a;
            if (bArr == null) {
                qx0.f69689a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            kf0L = l(kf0L2, j11, qx0.f69689a, i11);
            long j12 = j11 + i11;
            if (z10) {
                gq2.i(2);
                kf0L = l(kf0L, j12, gq2.n(), 2);
                j12 += 2;
                iG = gq2.G();
            }
            int i12 = iG;
            int[] iArr = qx0.f69692d;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = qx0.f69693e;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i12 * 6;
                gq2.i(i13);
                kf0L = l(kf0L, j12, gq2.n(), i13);
                j12 += i13;
                gq2.l(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = gq2.G();
                    iArr4[i14] = gq2.F();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = nf0.f68848a - ((int) (j12 - nf0.f68849b));
            }
            W0 w02 = nf0.f68850c;
            int i15 = OV.f69091a;
            qx0.c(i12, iArr2, iArr4, w02.f70968b, qx0.f69689a, w02.f70967a, w02.f70969c, w02.f70970d);
            long j13 = nf0.f68849b;
            int i16 = (int) (j12 - j13);
            nf0.f68849b = j13 + i16;
            nf0.f68848a -= i16;
        } else {
            kf0L = kf0;
        }
        if (!by0.e()) {
            by0.j(nf0.f68848a);
            return k(kf0L, nf0.f68849b, by0.f65631d, nf0.f68848a);
        }
        gq2.i(4);
        KF0 kf0L3 = l(kf0L, nf0.f68849b, gq2.n(), 4);
        int iF = gq2.F();
        nf0.f68849b += 4;
        nf0.f68848a -= 4;
        by0.j(iF);
        KF0 kf0K = k(kf0L3, nf0.f68849b, by0.f65631d, iF);
        nf0.f68849b += iF;
        int i17 = nf0.f68848a - iF;
        nf0.f68848a = i17;
        ByteBuffer byteBuffer = by0.f65634g;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            by0.f65634g = ByteBuffer.allocate(i17);
        } else {
            by0.f65634g.clear();
        }
        return k(kf0K, nf0.f68849b, by0.f65634g, nf0.f68848a);
    }

    private final void n(int i10) {
        long j10 = this.f68322e + i10;
        this.f68322e = j10;
        KF0 kf0 = this.f68321d;
        if (j10 == kf0.f68066b) {
            this.f68321d = kf0.f68068d;
        }
    }

    public final void c(long j10) {
        KF0 kf0;
        if (j10 != -1) {
            while (true) {
                kf0 = this.f68319b;
                if (j10 < kf0.f68066b) {
                    break;
                }
                this.f68323f.c(kf0.f68067c);
                this.f68319b = this.f68319b.b();
            }
            if (this.f68320c.f68065a < kf0.f68065a) {
                this.f68320c = kf0;
            }
        }
    }

    public final void d(By0 by0, NF0 nf0) {
        m(this.f68320c, by0, nf0, this.f68318a);
    }

    public final void e(By0 by0, NF0 nf0) {
        this.f68320c = m(this.f68320c, by0, nf0, this.f68318a);
    }

    public final void f() {
        KF0 kf0 = this.f68319b;
        if (kf0.f68067c != null) {
            this.f68323f.d(kf0);
            kf0.b();
        }
        this.f68319b.c(0L, 65536);
        KF0 kf02 = this.f68319b;
        this.f68320c = kf02;
        this.f68321d = kf02;
        this.f68322e = 0L;
        this.f68323f.g();
    }

    public final void h(GQ gq2, int i10) {
        while (i10 > 0) {
            int i11 = i(i10);
            KF0 kf0 = this.f68321d;
            gq2.h(kf0.f68067c.f71520a, kf0.a(this.f68322e), i11);
            i10 -= i11;
            n(i11);
        }
    }

    public LF0(C7990fH0 c7990fH0) {
        this.f68323f = c7990fH0;
        KF0 kf0 = new KF0(0L, 65536);
        this.f68319b = kf0;
        this.f68320c = kf0;
        this.f68321d = kf0;
    }

    private static KF0 k(KF0 kf0, long j10, ByteBuffer byteBuffer, int i10) {
        KF0 kf0J = j(kf0, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (kf0J.f68066b - j10));
            byteBuffer.put(kf0J.f68067c.f71520a, kf0J.a(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == kf0J.f68066b) {
                kf0J = kf0J.f68068d;
            }
        }
        return kf0J;
    }

    private static KF0 l(KF0 kf0, long j10, byte[] bArr, int i10) {
        KF0 kf0J = j(kf0, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (kf0J.f68066b - j10));
            System.arraycopy(kf0J.f68067c.f71520a, kf0J.a(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == kf0J.f68066b) {
                kf0J = kf0J.f68068d;
            }
        }
        return kf0J;
    }

    public final int a(InterfaceC9685vA0 interfaceC9685vA0, int i10, boolean z10) throws IOException {
        int i11 = i(i10);
        KF0 kf0 = this.f68321d;
        int iZza = interfaceC9685vA0.zza(kf0.f68067c.f71520a, kf0.a(this.f68322e), i11);
        if (iZza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        n(iZza);
        return iZza;
    }
}
