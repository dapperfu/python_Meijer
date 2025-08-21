package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public class P0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f70069a;

    /* renamed from: b, reason: collision with root package name */
    private final O0 f70070b;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f70069a;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        return this.f70070b;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return false;
    }

    public P0(long j10, long j11) {
        R0 r02;
        this.f70069a = j10;
        if (j11 == 0) {
            r02 = R0.f70546c;
        } else {
            r02 = new R0(0L, j11);
        }
        this.f70070b = new O0(r02, r02);
    }
}
