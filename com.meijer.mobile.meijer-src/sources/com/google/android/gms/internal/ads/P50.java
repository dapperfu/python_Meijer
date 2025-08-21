package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class P50 implements InterfaceC9733uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Q50 f70103a;

    P50(Q50 q50) {
        this.f70103a = q50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final void zza() {
        synchronized (this.f70103a) {
            this.f70103a.f70349i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C10149yL c10149yL = (C10149yL) obj;
        synchronized (this.f70103a) {
            try {
                this.f70103a.f70349i = c10149yL;
                if (((Boolean) Oc.A.c().a(C8784lf.f76800F3)).booleanValue()) {
                    c10149yL.k().f77839a = this.f70103a.f70344d;
                }
                this.f70103a.f70349i.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
