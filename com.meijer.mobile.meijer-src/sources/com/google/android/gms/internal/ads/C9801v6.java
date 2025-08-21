package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9801v6 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9480s6 f79827a;

    /* renamed from: b, reason: collision with root package name */
    private final int f79828b;

    /* renamed from: c, reason: collision with root package name */
    private final long f79829c;

    /* renamed from: d, reason: collision with root package name */
    private final long f79830d;

    /* renamed from: e, reason: collision with root package name */
    private final long f79831e;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f79831e;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    private final long a(long j10) {
        return OV.M(j10 * this.f79828b, 1000000L, this.f79827a.f78990c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long jMax = Math.max(0L, Math.min((this.f79827a.f78990c * j10) / (this.f79828b * 1000000), this.f79830d - 1));
        long jA = a(jMax);
        R0 r02 = new R0(jA, this.f79829c + (this.f79827a.f78991d * jMax));
        if (jA >= j10 || jMax == this.f79830d - 1) {
            return new O0(r02, r02);
        }
        long j11 = jMax + 1;
        return new O0(r02, new R0(a(j11), this.f79829c + (j11 * this.f79827a.f78991d)));
    }

    public C9801v6(C9480s6 c9480s6, int i10, long j10, long j11) {
        this.f79827a = c9480s6;
        this.f79828b = i10;
        this.f79829c = j10;
        long j12 = (j11 - j10) / c9480s6.f78991d;
        this.f79830d = j12;
        this.f79831e = a(j12);
    }
}
