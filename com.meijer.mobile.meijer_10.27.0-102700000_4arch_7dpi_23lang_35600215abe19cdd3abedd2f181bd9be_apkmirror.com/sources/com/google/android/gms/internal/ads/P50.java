package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class P50 implements InterfaceC9608uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Q50 f69263a;

    P50(Q50 q50) {
        this.f69263a = q50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final void zza() {
        synchronized (this.f69263a) {
            this.f69263a.f69509i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C10024yL c10024yL = (C10024yL) obj;
        synchronized (this.f69263a) {
            try {
                this.f69263a.f69509i = c10024yL;
                if (((Boolean) Mc.A.c().a(C8659lf.f75960F3)).booleanValue()) {
                    c10024yL.k().f76999a = this.f69263a.f69504d;
                }
                this.f69263a.f69509i.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
