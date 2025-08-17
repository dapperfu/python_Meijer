package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class V implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Y f70748a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70749b;

    /* renamed from: c, reason: collision with root package name */
    private final long f70750c;

    /* renamed from: d, reason: collision with root package name */
    private final long f70751d;

    /* renamed from: e, reason: collision with root package name */
    private final long f70752e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70753f;

    public V(Y y10, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f70748a = y10;
        this.f70749b = j10;
        this.f70750c = j12;
        this.f70751d = j13;
        this.f70752e = j14;
        this.f70753f = j15;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f70749b;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public final long e(long j10) {
        return this.f70748a.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        R0 r02 = new R0(j10, X.f(this.f70748a.zza(j10), 0L, this.f70750c, this.f70751d, this.f70752e, this.f70753f));
        return new O0(r02, r02);
    }
}
