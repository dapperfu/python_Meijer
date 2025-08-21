package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes6.dex */
final class P3 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R3 f70079a;

    /* synthetic */ P3(R3 r32, Q3 q32) {
        this.f70079a = r32;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        R3 r32 = this.f70079a;
        return r32.f70606d.e(r32.f70608f);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        R3 r32 = this.f70079a;
        long jF = r32.f70606d.f(j10);
        long j11 = r32.f70604b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jF);
        R3 r33 = this.f70079a;
        long jLongValue = j11 + bigIntegerValueOf.multiply(BigInteger.valueOf(r33.f70605c - r33.f70604b)).divide(BigInteger.valueOf(this.f70079a.f70608f)).longValue();
        R0 r02 = new R0(j10, Math.max(this.f70079a.f70604b, Math.min(jLongValue - 30000, r0.f70605c - 1)));
        return new O0(r02, r02);
    }
}
