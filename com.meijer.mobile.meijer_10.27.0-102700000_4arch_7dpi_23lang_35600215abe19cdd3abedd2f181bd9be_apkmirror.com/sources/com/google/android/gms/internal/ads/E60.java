package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class E60 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F60 f66350a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f66351b;

    E60(F60 f60, int i10) {
        this.f66351b = i10;
        this.f66350a = f60;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Lc.v.s().x(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10 = this.f66351b;
        this.f66350a.b((String) obj, i10);
    }
}
