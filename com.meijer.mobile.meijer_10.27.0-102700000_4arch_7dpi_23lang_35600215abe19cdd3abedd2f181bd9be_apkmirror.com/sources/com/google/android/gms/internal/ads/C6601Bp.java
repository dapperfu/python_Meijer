package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6601Bp implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.q f65584a;

    C6601Bp(C6635Cp c6635Cp, com.google.common.util.concurrent.q qVar) {
        this.f65584a = qVar;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C6635Cp.f65824l.remove(this.f65584a);
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        C6635Cp.f65824l.remove(this.f65584a);
    }
}
