package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9142q6 implements InterfaceC9035p6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9450t0 f77729a;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f77730b;

    /* renamed from: c, reason: collision with root package name */
    private final C9355s6 f77731c;

    /* renamed from: d, reason: collision with root package name */
    private final C f77732d;

    /* renamed from: e, reason: collision with root package name */
    private final int f77733e;

    /* renamed from: f, reason: collision with root package name */
    private long f77734f;

    /* renamed from: g, reason: collision with root package name */
    private int f77735g;

    /* renamed from: h, reason: collision with root package name */
    private long f77736h;

    @Override // com.google.android.gms.internal.ads.InterfaceC9035p6
    public final void a(long j10) {
        this.f77734f = j10;
        this.f77735g = 0;
        this.f77736h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9035p6
    public final void zza(int i10, long j10) {
        this.f77729a.m(new C9676v6(this.f77731c, 1, i10, j10));
        this.f77730b.d(this.f77732d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9035p6
    public final boolean b(InterfaceC9236r0 interfaceC9236r0, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f77735g) < (i11 = this.f77733e)) {
            int iB = this.f77730b.b(interfaceC9236r0, (int) Math.min(i11 - i10, j11), true);
            if (iB == -1) {
                j11 = 0;
            } else {
                this.f77735g += iB;
                j11 -= iB;
            }
        }
        C9355s6 c9355s6 = this.f77731c;
        int i12 = this.f77735g;
        int i13 = c9355s6.f78151d;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jM = this.f77734f + OV.M(this.f77736h, 1000000L, c9355s6.f78150c, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.f77735g - i15;
            this.f77730b.a(jM, 1, i15, i16, null);
            this.f77736h += i14;
            this.f77735g = i16;
        }
        return j11 <= 0;
    }

    public C9142q6(InterfaceC9450t0 interfaceC9450t0, X0 x02, C9355s6 c9355s6, String str, int i10) throws zzbc {
        this.f77729a = interfaceC9450t0;
        this.f77730b = x02;
        this.f77731c = c9355s6;
        int i11 = c9355s6.f78149b * c9355s6.f78152e;
        int i12 = c9355s6.f78151d;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = c9355s6.f78150c * i13;
            int i15 = i14 * 8;
            int iMax = Math.max(i13, i14 / 10);
            this.f77733e = iMax;
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.B(str);
            c9592uH0.q0(i15);
            c9592uH0.v(i15);
            c9592uH0.r(iMax);
            c9592uH0.r0(c9355s6.f78149b);
            c9592uH0.C(c9355s6.f78150c);
            c9592uH0.u(i10);
            this.f77732d = c9592uH0.H();
            return;
        }
        throw zzbc.a("Expected block size: " + i13 + "; got: " + i12, null);
    }
}
