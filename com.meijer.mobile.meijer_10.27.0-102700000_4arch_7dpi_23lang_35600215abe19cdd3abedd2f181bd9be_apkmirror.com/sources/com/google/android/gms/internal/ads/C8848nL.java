package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8848nL {

    /* renamed from: a, reason: collision with root package name */
    private final XB f77037a;

    /* renamed from: b, reason: collision with root package name */
    private final IC f77038b;

    /* renamed from: c, reason: collision with root package name */
    private final VC f77039c;

    /* renamed from: d, reason: collision with root package name */
    private final C8195hD f77040d;

    /* renamed from: e, reason: collision with root package name */
    private final BE f77041e;

    /* renamed from: f, reason: collision with root package name */
    private final C7987fG f77042f;

    /* renamed from: g, reason: collision with root package name */
    private final C9812wN f77043g;

    /* renamed from: h, reason: collision with root package name */
    private final R90 f77044h;

    /* renamed from: i, reason: collision with root package name */
    private final C9710vS f77045i;

    /* renamed from: j, reason: collision with root package name */
    private final C8269hx f77046j;

    C8848nL(XB xb2, IC ic2, VC vc2, C8195hD c8195hD, BE be2, C7987fG c7987fG, C9812wN c9812wN, R90 r90, C9710vS c9710vS, C8269hx c8269hx) {
        this.f77037a = xb2;
        this.f77038b = ic2;
        this.f77039c = vc2;
        this.f77040d = c8195hD;
        this.f77041e = be2;
        this.f77042f = c7987fG;
        this.f77043g = c9812wN;
        this.f77044h = r90;
        this.f77045i = c9710vS;
        this.f77046j = c8269hx;
    }

    public final void a(C8955oL c8955oL, InterfaceC9008ot interfaceC9008ot) throws Throwable {
        C8634lL c8634lL = c8955oL.f77362a;
        final IC ic2 = this.f77038b;
        Objects.requireNonNull(ic2);
        c8634lL.j(this.f77037a, this.f77039c, this.f77040d, this.f77041e, new Oc.d() { // from class: com.google.android.gms.internal.ads.mL
            @Override // Oc.d
            public final void zzg() {
                ic2.zzb();
            }
        }, this.f77042f);
        if (((Boolean) Mc.A.c().a(C8659lf.f76260aa)).booleanValue() && interfaceC9008ot != null && interfaceC9008ot.zzN() != null) {
            InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
            interfaceC8156guZzN.V(this.f77046j, this.f77045i, this.f77044h);
            interfaceC8156guZzN.N0(this.f77046j, this.f77045i, this.f77043g);
        }
    }
}
