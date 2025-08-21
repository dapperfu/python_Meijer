package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7177Oz implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ij0 f70059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7245Qz f70060b;

    C7177Oz(C7245Qz c7245Qz, Ij0 ij0) {
        this.f70059a = ij0;
        this.f70060b = c7245Qz;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        this.f70059a.zza(th2);
        C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f69035a.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C7245Qz.b(this.f70060b, ((C7008Jz) obj).f68838a, this.f70059a);
    }
}
