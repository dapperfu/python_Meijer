package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U80 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W80 f70548a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f70549b;

    U80(W80 w80, K80 k80) {
        this.f70548a = w80;
        this.f70549b = k80;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zzb(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        K80 k80 = this.f70549b;
        k80.e(th2);
        k80.r0(false);
        this.f70548a.a(k80);
    }
}
