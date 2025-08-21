package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class A70 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D70 f65924a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E70 f65925b;

    A70(E70 e70, D70 d70) {
        this.f65924a = d70;
        this.f65925b = e70;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        synchronized (this.f65925b) {
            this.f65925b.f67196e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f65925b) {
            try {
                this.f65925b.f67196e = null;
                this.f65925b.f67195d.addFirst(this.f65924a);
                E70 e70 = this.f65925b;
                if (e70.f67197f == 1) {
                    e70.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
