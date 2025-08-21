package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9184pI implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78391a = "Google";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9504sI f78392b;

    C9184pI(C9504sI c9504sI, String str, boolean z10) {
        this.f78392b = c9504sI;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77263m5)).booleanValue()) {
            Nc.v.s().w(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f78392b.f79043k.t((InterfaceC9133ot) obj);
        C9504sI c9504sI = this.f78392b;
        C7270Rq c7270RqC0 = c9504sI.f79043k.c0();
        C7914dT c7914dTS = c9504sI.S(this.f78391a, true);
        if (c7914dTS != null && c7270RqC0 != null) {
            c7270RqC0.b(c7914dTS);
        } else if (c7270RqC0 != null) {
            c7270RqC0.cancel(false);
        }
    }
}
