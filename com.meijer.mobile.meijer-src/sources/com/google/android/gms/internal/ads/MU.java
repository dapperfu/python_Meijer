package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class MU implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z50 f69494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OU f69495b;

    MU(OU ou2, Z50 z50) {
        this.f69494a = z50;
        this.f69495b = ou2;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        synchronized (this.f69495b) {
            try {
                this.f69495b.f69929h.b(th2, this.f69494a);
                Z50 z50A = this.f69495b.f69929h.a();
                if (this.f69494a.f72904v0) {
                    while (z50A != null) {
                        this.f69495b.e(z50A);
                        z50A = this.f69495b.f69929h.a();
                    }
                } else if (z50A != null) {
                    this.f69495b.e(z50A);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC8129fV interfaceC8129fV = (InterfaceC8129fV) obj;
        synchronized (this.f69495b) {
            try {
                this.f69495b.f69929h.c(interfaceC8129fV, this.f69494a);
                Z50 z50A = this.f69495b.f69929h.a();
                if (z50A != null) {
                    this.f69495b.e(z50A);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
