package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6936Lk implements InterfaceC7213Tq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6868Jk f68419a;

    C6936Lk(C7037Ok c7037Ok, C6868Jk c6868Jk) {
        this.f68419a = c6868Jk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7213Tq
    public final void zza() {
        Pc.p0.k("Rejecting reference for JS Engine.");
        if (((Boolean) Mc.A.c().a(C8659lf.f75908B7)).booleanValue()) {
            this.f68419a.d(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.f68419a.c();
        }
    }
}
