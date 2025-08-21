package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class OA0 implements InterfaceC8101fA0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f69861a;

    /* renamed from: b, reason: collision with root package name */
    private long f69862b;

    /* renamed from: c, reason: collision with root package name */
    private long f69863c;

    /* renamed from: d, reason: collision with root package name */
    private C7613ag f69864d = C7613ag.f73300d;

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final C7613ag zzc() {
        return this.f69864d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final /* synthetic */ boolean zzj() {
        return false;
    }

    public final void a(long j10) {
        this.f69862b = j10;
        if (this.f69861a) {
            this.f69863c = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f69861a) {
            return;
        }
        this.f69863c = SystemClock.elapsedRealtime();
        this.f69861a = true;
    }

    public final void c() {
        if (this.f69861a) {
            a(zza());
            this.f69861a = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final void r(C7613ag c7613ag) {
        if (this.f69861a) {
            a(zza());
        }
        this.f69864d = c7613ag;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final long zza() {
        long j10 = this.f69862b;
        if (!this.f69861a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f69863c;
        C7613ag c7613ag = this.f69864d;
        return j10 + (c7613ag.f73301a == 1.0f ? OV.K(jElapsedRealtime) : c7613ag.a(jElapsedRealtime));
    }

    public OA0(HC hc2) {
    }
}
