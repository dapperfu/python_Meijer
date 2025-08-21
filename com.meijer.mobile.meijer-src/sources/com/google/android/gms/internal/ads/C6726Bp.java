package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6726Bp implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.q f66424a;

    C6726Bp(C6760Cp c6760Cp, com.google.common.util.concurrent.q qVar) {
        this.f66424a = qVar;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C6760Cp.f66664l.remove(this.f66424a);
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        C6760Cp.f66664l.remove(this.f66424a);
    }
}
