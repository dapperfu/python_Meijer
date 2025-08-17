package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.eL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7887eL {

    /* renamed from: a, reason: collision with root package name */
    private final XB f73811a;

    /* renamed from: b, reason: collision with root package name */
    private final IC f73812b;

    /* renamed from: c, reason: collision with root package name */
    private final VC f73813c;

    /* renamed from: d, reason: collision with root package name */
    private final C8195hD f73814d;

    /* renamed from: e, reason: collision with root package name */
    private final BE f73815e;

    /* renamed from: f, reason: collision with root package name */
    private final Z50 f73816f;

    /* renamed from: g, reason: collision with root package name */
    private final C7648c60 f73817g;

    /* renamed from: h, reason: collision with root package name */
    private final C8269hx f73818h;

    public C7887eL(XB xb2, IC ic2, VC vc2, C8195hD c8195hD, BE be2, Z50 z50, C7648c60 c7648c60, C8269hx c8269hx) {
        this.f73811a = xb2;
        this.f73812b = ic2;
        this.f73813c = vc2;
        this.f73814d = c8195hD;
        this.f73815e = be2;
        this.f73816f = z50;
        this.f73817g = c7648c60;
        this.f73818h = c8269hx;
    }

    public final void a(C8315iL c8315iL) {
        final IC ic2 = this.f73812b;
        UK uk2 = c8315iL.f74945a;
        Objects.requireNonNull(ic2);
        uk2.i(this.f73811a, this.f73813c, this.f73814d, this.f73815e, new Oc.d() { // from class: com.google.android.gms.internal.ads.dL
            @Override // Oc.d
            public final void zzg() {
                ic2.zzb();
            }
        });
        c8315iL.h(this.f73816f, this.f73817g, this.f73818h);
    }
}
