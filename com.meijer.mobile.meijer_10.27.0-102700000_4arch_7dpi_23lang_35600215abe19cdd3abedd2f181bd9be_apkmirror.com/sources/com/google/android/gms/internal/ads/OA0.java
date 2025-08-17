package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class OA0 implements InterfaceC7976fA0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f69021a;

    /* renamed from: b, reason: collision with root package name */
    private long f69022b;

    /* renamed from: c, reason: collision with root package name */
    private long f69023c;

    /* renamed from: d, reason: collision with root package name */
    private C7488ag f69024d = C7488ag.f72460d;

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final C7488ag zzc() {
        return this.f69024d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final /* synthetic */ boolean zzj() {
        return false;
    }

    public final void a(long j10) {
        this.f69022b = j10;
        if (this.f69021a) {
            this.f69023c = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f69021a) {
            return;
        }
        this.f69023c = SystemClock.elapsedRealtime();
        this.f69021a = true;
    }

    public final void c() {
        if (this.f69021a) {
            a(zza());
            this.f69021a = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final void r(C7488ag c7488ag) {
        if (this.f69021a) {
            a(zza());
        }
        this.f69024d = c7488ag;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final long zza() {
        long j10 = this.f69022b;
        if (!this.f69021a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f69023c;
        C7488ag c7488ag = this.f69024d;
        return j10 + (c7488ag.f72461a == 1.0f ? OV.K(jElapsedRealtime) : c7488ag.a(jElapsedRealtime));
    }

    public OA0(HC hc2) {
    }
}
