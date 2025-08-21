package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class A9 implements InterfaceC6878Gc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7819cc0 f65926a;

    A9(C7819cc0 c7819cc0) {
        this.f65926a = c7819cc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6878Gc0
    public final void zza(int i10, long j10) {
        this.f65926a.d(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6878Gc0
    public final void zzb(int i10, long j10, String str) {
        this.f65926a.e(i10, System.currentTimeMillis() - j10, str);
    }
}
