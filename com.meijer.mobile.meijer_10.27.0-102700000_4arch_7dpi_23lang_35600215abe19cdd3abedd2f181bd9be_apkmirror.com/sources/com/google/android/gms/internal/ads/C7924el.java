package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7924el implements InterfaceC7279Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6868Jk f73927a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f73928b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7145Rq f73929c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8245hl f73930d;

    C7924el(C8245hl c8245hl, C6868Jk c6868Jk, Object obj, C7145Rq c7145Rq) {
        this.f73927a = c6868Jk;
        this.f73928b = obj;
        this.f73929c = c7145Rq;
        this.f73930d = c8245hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7279Vq
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        Pc.p0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f73928b;
        C7145Rq c7145Rq = this.f73929c;
        C8245hl.b(this.f73930d, this.f73927a, (InterfaceC7105Qk) obj, obj2, c7145Rq);
    }
}
