package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9059pI implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77551a = "Google";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9379sI f77552b;

    C9059pI(C9379sI c9379sI, String str, boolean z10) {
        this.f77552b = c9379sI;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76423m5)).booleanValue()) {
            Lc.v.s().w(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f77552b.f78203k.t((InterfaceC9008ot) obj);
        C9379sI c9379sI = this.f77552b;
        C7145Rq c7145RqC0 = c9379sI.f78203k.c0();
        C7789dT c7789dTS = c9379sI.S(this.f77551a, true);
        if (c7789dTS != null && c7145RqC0 != null) {
            c7145RqC0.b(c7789dTS);
        } else if (c7145RqC0 != null) {
            c7145RqC0.cancel(false);
        }
    }
}
