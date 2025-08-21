package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U80 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W80 f71388a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f71389b;

    U80(W80 w80, K80 k80) {
        this.f71388a = w80;
        this.f71389b = k80;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zzb(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        K80 k80 = this.f71389b;
        k80.e(th2);
        k80.s0(false);
        this.f71388a.a(k80);
    }
}
