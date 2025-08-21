package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class KF0 implements ZG0 {

    /* renamed from: a, reason: collision with root package name */
    public long f68905a;

    /* renamed from: b, reason: collision with root package name */
    public long f68906b;

    /* renamed from: c, reason: collision with root package name */
    public YG0 f68907c;

    /* renamed from: d, reason: collision with root package name */
    public KF0 f68908d;

    public final KF0 b() {
        this.f68907c = null;
        KF0 kf0 = this.f68908d;
        this.f68908d = null;
        return kf0;
    }

    @Override // com.google.android.gms.internal.ads.ZG0
    public final ZG0 zzd() {
        KF0 kf0 = this.f68908d;
        if (kf0 == null || kf0.f68907c == null) {
            return null;
        }
        return kf0;
    }

    public final int a(long j10) {
        long j11 = j10 - this.f68905a;
        int i10 = this.f68907c.f72361b;
        return (int) j11;
    }

    public final void c(long j10, int i10) {
        C8211gC.f(this.f68907c == null);
        this.f68905a = j10;
        this.f68906b = j10 + 65536;
    }

    @Override // com.google.android.gms.internal.ads.ZG0
    public final YG0 zzc() {
        YG0 yg0 = this.f68907c;
        yg0.getClass();
        return yg0;
    }

    public KF0(long j10, int i10) {
        c(j10, 65536);
    }
}
