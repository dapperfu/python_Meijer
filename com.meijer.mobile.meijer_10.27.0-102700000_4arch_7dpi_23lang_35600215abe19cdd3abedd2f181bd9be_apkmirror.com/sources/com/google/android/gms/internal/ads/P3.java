package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes6.dex */
final class P3 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R3 f69239a;

    /* synthetic */ P3(R3 r32, Q3 q32) {
        this.f69239a = r32;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        R3 r32 = this.f69239a;
        return r32.f69766d.e(r32.f69768f);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        R3 r32 = this.f69239a;
        long jF = r32.f69766d.f(j10);
        long j11 = r32.f69764b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jF);
        R3 r33 = this.f69239a;
        long jLongValue = j11 + bigIntegerValueOf.multiply(BigInteger.valueOf(r33.f69765c - r33.f69764b)).divide(BigInteger.valueOf(this.f69239a.f69768f)).longValue();
        R0 r02 = new R0(j10, Math.max(this.f69239a.f69764b, Math.min(jLongValue - 30000, r0.f69765c - 1)));
        return new O0(r02, r02);
    }
}
