package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7647c6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f73096c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f73097d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f73098e;

    /* renamed from: a, reason: collision with root package name */
    private final C8857nU f73094a = new C8857nU(0);

    /* renamed from: f, reason: collision with root package name */
    private long f73099f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f73100g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f73101h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f73095b = new GQ();

    public final int a(InterfaceC9236r0 interfaceC9236r0, N0 n02, int i10) throws IOException {
        if (i10 <= 0) {
            e(interfaceC9236r0);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (this.f73098e) {
            if (this.f73100g == -9223372036854775807L) {
                e(interfaceC9236r0);
                return 0;
            }
            if (this.f73097d) {
                long j11 = this.f73099f;
                if (j11 == -9223372036854775807L) {
                    e(interfaceC9236r0);
                    return 0;
                }
                C8857nU c8857nU = this.f73094a;
                this.f73101h = c8857nU.c(this.f73100g) - c8857nU.b(j11);
                e(interfaceC9236r0);
                return 0;
            }
            int iMin = (int) Math.min(112800L, interfaceC9236r0.zzd());
            if (interfaceC9236r0.zzf() != 0) {
                n02.f68790a = 0L;
                return 1;
            }
            this.f73095b.i(iMin);
            interfaceC9236r0.zzj();
            interfaceC9236r0.g(this.f73095b.n(), 0, iMin);
            GQ gq2 = this.f73095b;
            int iT = gq2.t();
            int iU = gq2.u();
            while (true) {
                if (iT >= iU) {
                    break;
                }
                if (gq2.n()[iT] == 71) {
                    long jB = C8607l6.b(gq2, iT, i10);
                    if (jB != -9223372036854775807L) {
                        j10 = jB;
                        break;
                    }
                }
                iT++;
            }
            this.f73099f = j10;
            this.f73097d = true;
            return 0;
        }
        long jZzd = interfaceC9236r0.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j12 = jZzd - iMin2;
        if (interfaceC9236r0.zzf() != j12) {
            n02.f68790a = j12;
            return 1;
        }
        this.f73095b.i(iMin2);
        interfaceC9236r0.zzj();
        interfaceC9236r0.g(this.f73095b.n(), 0, iMin2);
        GQ gq3 = this.f73095b;
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
                        long jB2 = C8607l6.b(gq3, i11, i10);
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
        this.f73100g = j10;
        this.f73098e = true;
        return 0;
    }

    public final long b() {
        return this.f73101h;
    }

    public final C8857nU c() {
        return this.f73094a;
    }

    public final boolean d() {
        return this.f73096c;
    }

    private final int e(InterfaceC9236r0 interfaceC9236r0) {
        byte[] bArr = OV.f69096f;
        int length = bArr.length;
        this.f73095b.j(bArr, 0);
        this.f73096c = true;
        interfaceC9236r0.zzj();
        return 0;
    }

    C7647c6(int i10) {
    }
}
