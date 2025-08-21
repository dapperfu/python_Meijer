package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7772c6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f73936c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f73937d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f73938e;

    /* renamed from: a, reason: collision with root package name */
    private final C8982nU f73934a = new C8982nU(0);

    /* renamed from: f, reason: collision with root package name */
    private long f73939f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f73940g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f73941h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f73935b = new GQ();

    public final int a(InterfaceC9361r0 interfaceC9361r0, N0 n02, int i10) throws IOException {
        if (i10 <= 0) {
            e(interfaceC9361r0);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (this.f73938e) {
            if (this.f73940g == -9223372036854775807L) {
                e(interfaceC9361r0);
                return 0;
            }
            if (this.f73937d) {
                long j11 = this.f73939f;
                if (j11 == -9223372036854775807L) {
                    e(interfaceC9361r0);
                    return 0;
                }
                C8982nU c8982nU = this.f73934a;
                this.f73941h = c8982nU.c(this.f73940g) - c8982nU.b(j11);
                e(interfaceC9361r0);
                return 0;
            }
            int iMin = (int) Math.min(112800L, interfaceC9361r0.zzd());
            if (interfaceC9361r0.zzf() != 0) {
                n02.f69630a = 0L;
                return 1;
            }
            this.f73935b.i(iMin);
            interfaceC9361r0.zzj();
            interfaceC9361r0.g(this.f73935b.n(), 0, iMin);
            GQ gq2 = this.f73935b;
            int iT = gq2.t();
            int iU = gq2.u();
            while (true) {
                if (iT >= iU) {
                    break;
                }
                if (gq2.n()[iT] == 71) {
                    long jB = C8732l6.b(gq2, iT, i10);
                    if (jB != -9223372036854775807L) {
                        j10 = jB;
                        break;
                    }
                }
                iT++;
            }
            this.f73939f = j10;
            this.f73937d = true;
            return 0;
        }
        long jZzd = interfaceC9361r0.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j12 = jZzd - iMin2;
        if (interfaceC9361r0.zzf() != j12) {
            n02.f69630a = j12;
            return 1;
        }
        this.f73935b.i(iMin2);
        interfaceC9361r0.zzj();
        interfaceC9361r0.g(this.f73935b.n(), 0, iMin2);
        GQ gq3 = this.f73935b;
        int iT2 = gq3.t();
        int iU2 = gq3.u();
        int i11 = iU2 - 188;
        while (true) {
            if (i11 < iT2) {
                break;
            }
            byte[] bArrN = gq3.n();
            int i12 = -4;
            int i13 = 0;
            while (true) {
                if (i12 > 4) {
                    break;
                }
                int i14 = (i12 * 188) + i11;
                if (i14 < iT2 || i14 >= iU2 || bArrN[i14] != 71) {
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 5) {
                        long jB2 = C8732l6.b(gq3, i11, i10);
                        if (jB2 != -9223372036854775807L) {
                            j10 = jB2;
                            break;
                        }
                    }
                }
                i12++;
            }
            i11--;
        }
        this.f73940g = j10;
        this.f73938e = true;
        return 0;
    }

    public final long b() {
        return this.f73941h;
    }

    public final C8982nU c() {
        return this.f73934a;
    }

    public final boolean d() {
        return this.f73936c;
    }

    private final int e(InterfaceC9361r0 interfaceC9361r0) {
        byte[] bArr = OV.f69936f;
        int length = bArr.length;
        this.f73935b.j(bArr, 0);
        this.f73936c = true;
        interfaceC9361r0.zzj();
        return 0;
    }

    C7772c6(int i10) {
    }
}
