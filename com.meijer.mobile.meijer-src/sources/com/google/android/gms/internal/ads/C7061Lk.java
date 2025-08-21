package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7061Lk implements InterfaceC7338Tq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6993Jk f69259a;

    C7061Lk(C7162Ok c7162Ok, C6993Jk c6993Jk) {
        this.f69259a = c6993Jk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7338Tq
    public final void zza() {
        Rc.p0.k("Rejecting reference for JS Engine.");
        if (((Boolean) Oc.A.c().a(C8784lf.f76748B7)).booleanValue()) {
            this.f69259a.d(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.f69259a.c();
        }
    }
}
