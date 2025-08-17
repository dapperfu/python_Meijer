package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7052Oz implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ij0 f69219a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7120Qz f69220b;

    C7052Oz(C7120Qz c7120Qz, Ij0 ij0) {
        this.f69219a = ij0;
        this.f69220b = c7120Qz;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        this.f69219a.zza(th2);
        C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f68195a.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C7120Qz.b(this.f69220b, ((C6883Jz) obj).f67998a, this.f69219a);
    }
}
