package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9568sx implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f79292a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9675tx f79293b;

    C9568sx(C9675tx c9675tx, String str) {
        this.f79292a = str;
        this.f79293b = c9675tx;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        C9675tx c9675tx = this.f79293b;
        c9675tx.f79533h.a(c9675tx.f79532g.d(c9675tx.f79530e, c9675tx.f79531f, false, this.f79292a, null, c9675tx.d0()));
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C9675tx c9675tx = this.f79293b;
        c9675tx.f79533h.a(c9675tx.f79532g.d(c9675tx.f79530e, c9675tx.f79531f, false, this.f79292a, (String) obj, c9675tx.d0()));
    }
}
