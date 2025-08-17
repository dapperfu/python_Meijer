package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class MU implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z50 f68654a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OU f68655b;

    MU(OU ou2, Z50 z50) {
        this.f68654a = z50;
        this.f68655b = ou2;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        synchronized (this.f68655b) {
            try {
                this.f68655b.f69089h.b(th2, this.f68654a);
                Z50 z50A = this.f68655b.f69089h.a();
                if (this.f68654a.f72064v0) {
                    while (z50A != null) {
                        this.f68655b.e(z50A);
                        z50A = this.f68655b.f69089h.a();
                    }
                } else if (z50A != null) {
                    this.f68655b.e(z50A);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC8004fV interfaceC8004fV = (InterfaceC8004fV) obj;
        synchronized (this.f68655b) {
            try {
                this.f68655b.f69089h.c(interfaceC8004fV, this.f68654a);
                Z50 z50A = this.f68655b.f69089h.a();
                if (z50A != null) {
                    this.f68655b.e(z50A);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
