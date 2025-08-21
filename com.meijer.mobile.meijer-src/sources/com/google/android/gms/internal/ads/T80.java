package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class T80 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W80 f71146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f71147b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f71148c;

    T80(W80 w80, K80 k80, boolean z10) {
        this.f71146a = w80;
        this.f71147b = k80;
        this.f71148c = z10;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        K80 k80 = this.f71147b;
        if (k80.zzk()) {
            W80 w80 = this.f71146a;
            k80.e(th2);
            k80.s0(false);
            w80.a(k80);
            if (this.f71148c) {
                this.f71146a.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zzb(Object obj) {
        K80 k80 = this.f71147b;
        k80.s0(true);
        this.f71146a.a(k80);
        if (this.f71148c) {
            this.f71146a.h();
        }
    }
}
