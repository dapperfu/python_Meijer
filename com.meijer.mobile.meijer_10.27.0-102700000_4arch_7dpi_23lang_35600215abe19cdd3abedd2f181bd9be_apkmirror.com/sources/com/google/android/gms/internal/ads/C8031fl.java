package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8031fl implements InterfaceC7213Tq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7145Rq f74158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6868Jk f74159b;

    C8031fl(C8245hl c8245hl, C7145Rq c7145Rq, C6868Jk c6868Jk) {
        this.f74158a = c7145Rq;
        this.f74159b = c6868Jk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7213Tq
    public final void zza() {
        Pc.p0.k("callJs > getEngine: Promise rejected");
        this.f74158a.c(new zzbnv("Unable to obtain a JavascriptEngine."));
        this.f74159b.h();
    }
}
