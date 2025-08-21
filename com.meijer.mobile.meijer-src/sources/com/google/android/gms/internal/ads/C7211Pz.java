package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7211Pz implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ij0 f70312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7245Qz f70313b;

    C7211Pz(C7245Qz c7245Qz, Ij0 ij0) {
        this.f70312a = ij0;
        this.f70313b = c7245Qz;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f69035a.d();
            }
        });
        this.f70312a.zza(th2);
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f69035a.d();
            }
        });
        this.f70312a.zzb((C6702Az) obj);
    }
}
