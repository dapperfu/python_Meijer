package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8156fl implements InterfaceC7338Tq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7270Rq f74998a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6993Jk f74999b;

    C8156fl(C8370hl c8370hl, C7270Rq c7270Rq, C6993Jk c6993Jk) {
        this.f74998a = c7270Rq;
        this.f74999b = c6993Jk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7338Tq
    public final void zza() {
        Rc.p0.k("callJs > getEngine: Promise rejected");
        this.f74998a.c(new zzbnv("Unable to obtain a JavascriptEngine."));
        this.f74999b.h();
    }
}
