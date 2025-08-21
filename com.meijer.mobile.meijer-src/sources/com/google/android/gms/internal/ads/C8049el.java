package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8049el implements InterfaceC7404Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6993Jk f74767a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f74768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7270Rq f74769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8370hl f74770d;

    C8049el(C8370hl c8370hl, C6993Jk c6993Jk, Object obj, C7270Rq c7270Rq) {
        this.f74767a = c6993Jk;
        this.f74768b = obj;
        this.f74769c = c7270Rq;
        this.f74770d = c8370hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7404Vq
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        Rc.p0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f74768b;
        C7270Rq c7270Rq = this.f74769c;
        C8370hl.b(this.f74770d, this.f74767a, (InterfaceC7230Qk) obj, obj2, c7270Rq);
    }
}
