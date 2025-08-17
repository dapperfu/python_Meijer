package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7086Pz implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ij0 f69472a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7120Qz f69473b;

    C7086Pz(C7120Qz c7120Qz, Ij0 ij0) {
        this.f69472a = ij0;
        this.f69473b = c7120Qz;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f68195a.d();
            }
        });
        this.f69472a.zza(th2);
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f68195a.d();
            }
        });
        this.f69472a.zzb((C6577Az) obj);
    }
}
