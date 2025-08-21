package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class T5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f71132c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f71133d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71134e;

    /* renamed from: a, reason: collision with root package name */
    private final C8982nU f71130a = new C8982nU(0);

    /* renamed from: f, reason: collision with root package name */
    private long f71135f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f71136g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f71137h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f71131b = new GQ();

    public final long b() {
        return this.f71137h;
    }

    public final C8982nU d() {
        return this.f71130a;
    }

    public final boolean e() {
        return this.f71132c;
    }

    public static long c(GQ gq2) {
        int iT = gq2.t();
        if (gq2.r() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        gq2.h(bArr, 0, 9);
        gq2.l(iT);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
    }

    private final int f(InterfaceC9361r0 interfaceC9361r0) {
        byte[] bArr = OV.f69936f;
        int length = bArr.length;
        this.f71131b.j(bArr, 0);
        this.f71132c = true;
        interfaceC9361r0.zzj();
        return 0;
    }

    private static final int g(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int a(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.f71134e) {
            long jZzd = interfaceC9361r0.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j11 = jZzd - iMin;
            if (interfaceC9361r0.zzf() != j11) {
                n02.f69630a = j11;
                return 1;
            }
            this.f71131b.i(iMin);
            interfaceC9361r0.zzj();
            interfaceC9361r0.g(this.f71131b.n(), 0, iMin);
            GQ gq2 = this.f71131b;
            int iT = gq2.t();
            int iU = gq2.u() - 4;
            while (true) {
                if (iU < iT) {
                    break;
                }
                if (g(gq2.n(), iU) == 442) {
                    gq2.l(iU + 4);
                    long jC = c(gq2);
                    if (jC != -9223372036854775807L) {
                        j10 = jC;
                        break;
                    }
                }
                iU--;
            }
            this.f71136g = j10;
            this.f71134e = true;
            return 0;
        }
        if (this.f71136g == -9223372036854775807L) {
            f(interfaceC9361r0);
            return 0;
        }
        if (this.f71133d) {
            long j12 = this.f71135f;
            if (j12 == -9223372036854775807L) {
                f(interfaceC9361r0);
                return 0;
            }
            C8982nU c8982nU = this.f71130a;
            this.f71137h = c8982nU.c(this.f71136g) - c8982nU.b(j12);
            f(interfaceC9361r0);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, interfaceC9361r0.zzd());
        if (interfaceC9361r0.zzf() != 0) {
            n02.f69630a = 0L;
            return 1;
        }
        this.f71131b.i(iMin2);
        interfaceC9361r0.zzj();
        interfaceC9361r0.g(this.f71131b.n(), 0, iMin2);
        GQ gq3 = this.f71131b;
        int iT2 = gq3.t();
        int iU2 = gq3.u();
        while (true) {
            if (iT2 >= iU2 - 3) {
                break;
            }
            if (g(gq3.n(), iT2) == 442) {
                gq3.l(iT2 + 4);
                long jC2 = c(gq3);
                if (jC2 != -9223372036854775807L) {
                    j10 = jC2;
                    break;
                }
            }
            iT2++;
        }
        this.f71135f = j10;
        this.f71133d = true;
        return 0;
    }

    T5() {
    }
}
