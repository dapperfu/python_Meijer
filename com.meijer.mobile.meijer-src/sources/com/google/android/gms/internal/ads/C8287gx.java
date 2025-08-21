package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8287gx implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R90 f75390a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f75391b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Sc.v f75392c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8394hx f75393d;

    C8287gx(C8394hx c8394hx, R90 r90, String str, Sc.v vVar) {
        this.f75390a = r90;
        this.f75391b = str;
        this.f75392c = vVar;
        this.f75393d = c8394hx;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(final Throwable th2) {
        Xj0 xj0 = this.f75393d.f75681e;
        final R90 r90 = this.f75390a;
        final String str = this.f75391b;
        final Sc.v vVar = this.f75392c;
        xj0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.ex
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77212ia)).booleanValue();
                C8287gx c8287gx = this.f74797a;
                Throwable th3 = th2;
                if (zBooleanValue) {
                    C8394hx c8394hx = c8287gx.f75393d;
                    c8394hx.f75685i = C7267Rn.e(c8394hx.f75677a);
                    c8287gx.f75393d.f75685i.b(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    C8394hx c8394hx2 = c8287gx.f75393d;
                    c8394hx2.f75684h = C7267Rn.c(c8394hx2.f75677a);
                    c8287gx.f75393d.f75684h.b(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                Sc.v vVar2 = vVar;
                r90.d(str, vVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final R90 r90 = this.f75390a;
        final String str = (String) obj;
        Xj0 xj0 = this.f75393d.f75681e;
        final Sc.v vVar = this.f75392c;
        xj0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.fx
            @Override // java.lang.Runnable
            public final void run() {
                r90.d(str, vVar, null);
            }
        });
    }
}
