package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U50 implements InterfaceC9733uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W50 f71385a;

    U50(W50 w50) {
        this.f71385a = w50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final void zza() {
        synchronized (this.f71385a) {
            this.f71385a.f71848d = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C10149yL c10149yL = (C10149yL) obj;
        synchronized (this.f71385a) {
            try {
                this.f71385a.f71848d = c10149yL;
                if (((Boolean) Oc.A.c().a(C8784lf.f76800F3)).booleanValue()) {
                    c10149yL.k().f77839a = this.f71385a.f71847c;
                }
                this.f71385a.f71848d.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
