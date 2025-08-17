package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class A70 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D70 f65084a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E70 f65085b;

    A70(E70 e70, D70 d70) {
        this.f65084a = d70;
        this.f65085b = e70;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        synchronized (this.f65085b) {
            this.f65085b.f66356e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f65085b) {
            try {
                this.f65085b.f66356e = null;
                this.f65085b.f66355d.addFirst(this.f65084a);
                E70 e70 = this.f65085b;
                if (e70.f66357f == 1) {
                    e70.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
