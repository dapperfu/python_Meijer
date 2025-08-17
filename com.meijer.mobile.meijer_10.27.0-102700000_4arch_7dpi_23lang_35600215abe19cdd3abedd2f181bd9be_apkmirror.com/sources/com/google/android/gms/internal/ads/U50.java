package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U50 implements InterfaceC9608uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W50 f70545a;

    U50(W50 w50) {
        this.f70545a = w50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final void zza() {
        synchronized (this.f70545a) {
            this.f70545a.f71008d = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C10024yL c10024yL = (C10024yL) obj;
        synchronized (this.f70545a) {
            try {
                this.f70545a.f71008d = c10024yL;
                if (((Boolean) Mc.A.c().a(C8659lf.f75960F3)).booleanValue()) {
                    c10024yL.k().f76999a = this.f70545a.f71007c;
                }
                this.f70545a.f71008d.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
