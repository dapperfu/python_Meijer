package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class V implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Y f71588a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71589b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71590c;

    /* renamed from: d, reason: collision with root package name */
    private final long f71591d;

    /* renamed from: e, reason: collision with root package name */
    private final long f71592e;

    /* renamed from: f, reason: collision with root package name */
    private final long f71593f;

    public V(Y y10, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f71588a = y10;
        this.f71589b = j10;
        this.f71590c = j12;
        this.f71591d = j13;
        this.f71592e = j14;
        this.f71593f = j15;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f71589b;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public final long e(long j10) {
        return this.f71588a.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        R0 r02 = new R0(j10, X.f(this.f71588a.zza(j10), 0L, this.f71590c, this.f71591d, this.f71592e, this.f71593f));
        return new O0(r02, r02);
    }
}
