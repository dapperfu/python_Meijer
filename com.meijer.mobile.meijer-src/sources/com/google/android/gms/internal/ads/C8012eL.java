package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.eL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8012eL {

    /* renamed from: a, reason: collision with root package name */
    private final XB f74651a;

    /* renamed from: b, reason: collision with root package name */
    private final IC f74652b;

    /* renamed from: c, reason: collision with root package name */
    private final VC f74653c;

    /* renamed from: d, reason: collision with root package name */
    private final C8320hD f74654d;

    /* renamed from: e, reason: collision with root package name */
    private final BE f74655e;

    /* renamed from: f, reason: collision with root package name */
    private final Z50 f74656f;

    /* renamed from: g, reason: collision with root package name */
    private final C7773c60 f74657g;

    /* renamed from: h, reason: collision with root package name */
    private final C8394hx f74658h;

    public C8012eL(XB xb2, IC ic2, VC vc2, C8320hD c8320hD, BE be2, Z50 z50, C7773c60 c7773c60, C8394hx c8394hx) {
        this.f74651a = xb2;
        this.f74652b = ic2;
        this.f74653c = vc2;
        this.f74654d = c8320hD;
        this.f74655e = be2;
        this.f74656f = z50;
        this.f74657g = c7773c60;
        this.f74658h = c8394hx;
    }

    public final void a(C8440iL c8440iL) {
        final IC ic2 = this.f74652b;
        UK uk2 = c8440iL.f75785a;
        Objects.requireNonNull(ic2);
        uk2.i(this.f74651a, this.f74653c, this.f74654d, this.f74655e, new Qc.d() { // from class: com.google.android.gms.internal.ads.dL
            @Override // Qc.d
            public final void zzg() {
                ic2.zzb();
            }
        });
        c8440iL.h(this.f74656f, this.f74657g, this.f74658h);
    }
}
