package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class A9 implements InterfaceC6753Gc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7694cc0 f65086a;

    A9(C7694cc0 c7694cc0) {
        this.f65086a = c7694cc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6753Gc0
    public final void zza(int i10, long j10) {
        this.f65086a.d(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6753Gc0
    public final void zzb(int i10, long j10, String str) {
        this.f65086a.e(i10, System.currentTimeMillis() - j10, str);
    }
}
