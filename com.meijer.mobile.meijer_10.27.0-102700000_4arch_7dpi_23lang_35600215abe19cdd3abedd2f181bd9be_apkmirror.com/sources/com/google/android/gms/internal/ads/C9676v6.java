package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9676v6 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9355s6 f78987a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78988b;

    /* renamed from: c, reason: collision with root package name */
    private final long f78989c;

    /* renamed from: d, reason: collision with root package name */
    private final long f78990d;

    /* renamed from: e, reason: collision with root package name */
    private final long f78991e;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f78991e;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    private final long a(long j10) {
        return OV.M(j10 * this.f78988b, 1000000L, this.f78987a.f78150c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long jMax = Math.max(0L, Math.min((this.f78987a.f78150c * j10) / (this.f78988b * 1000000), this.f78990d - 1));
        long jA = a(jMax);
        R0 r02 = new R0(jA, this.f78989c + (this.f78987a.f78151d * jMax));
        if (jA >= j10 || jMax == this.f78990d - 1) {
            return new O0(r02, r02);
        }
        long j11 = jMax + 1;
        return new O0(r02, new R0(a(j11), this.f78989c + (j11 * this.f78987a.f78151d)));
    }

    public C9676v6(C9355s6 c9355s6, int i10, long j10, long j11) {
        this.f78987a = c9355s6;
        this.f78988b = i10;
        this.f78989c = j10;
        long j12 = (j11 - j10) / c9355s6.f78151d;
        this.f78990d = j12;
        this.f78991e = a(j12);
    }
}
