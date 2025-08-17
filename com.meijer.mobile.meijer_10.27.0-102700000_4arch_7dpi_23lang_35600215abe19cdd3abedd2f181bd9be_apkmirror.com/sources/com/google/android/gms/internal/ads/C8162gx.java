package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8162gx implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R90 f74550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f74551b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Qc.v f74552c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8269hx f74553d;

    C8162gx(C8269hx c8269hx, R90 r90, String str, Qc.v vVar) {
        this.f74550a = r90;
        this.f74551b = str;
        this.f74552c = vVar;
        this.f74553d = c8269hx;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(final Throwable th2) {
        Xj0 xj0 = this.f74553d.f74841e;
        final R90 r90 = this.f74550a;
        final String str = this.f74551b;
        final Qc.v vVar = this.f74552c;
        xj0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.ex
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76372ia)).booleanValue();
                C8162gx c8162gx = this.f73957a;
                Throwable th3 = th2;
                if (zBooleanValue) {
                    C8269hx c8269hx = c8162gx.f74553d;
                    c8269hx.f74845i = C7142Rn.e(c8269hx.f74837a);
                    c8162gx.f74553d.f74845i.b(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    C8269hx c8269hx2 = c8162gx.f74553d;
                    c8269hx2.f74844h = C7142Rn.c(c8269hx2.f74837a);
                    c8162gx.f74553d.f74844h.b(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                Qc.v vVar2 = vVar;
                r90.d(str, vVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final R90 r90 = this.f74550a;
        final String str = (String) obj;
        Xj0 xj0 = this.f74553d.f74841e;
        final Qc.v vVar = this.f74552c;
        xj0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.fx
            @Override // java.lang.Runnable
            public final void run() {
                r90.d(str, vVar, null);
            }
        });
    }
}
