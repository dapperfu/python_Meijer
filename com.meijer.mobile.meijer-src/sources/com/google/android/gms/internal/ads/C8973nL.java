package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8973nL {

    /* renamed from: a, reason: collision with root package name */
    private final XB f77877a;

    /* renamed from: b, reason: collision with root package name */
    private final IC f77878b;

    /* renamed from: c, reason: collision with root package name */
    private final VC f77879c;

    /* renamed from: d, reason: collision with root package name */
    private final C8320hD f77880d;

    /* renamed from: e, reason: collision with root package name */
    private final BE f77881e;

    /* renamed from: f, reason: collision with root package name */
    private final C8112fG f77882f;

    /* renamed from: g, reason: collision with root package name */
    private final C9937wN f77883g;

    /* renamed from: h, reason: collision with root package name */
    private final R90 f77884h;

    /* renamed from: i, reason: collision with root package name */
    private final C9835vS f77885i;

    /* renamed from: j, reason: collision with root package name */
    private final C8394hx f77886j;

    C8973nL(XB xb2, IC ic2, VC vc2, C8320hD c8320hD, BE be2, C8112fG c8112fG, C9937wN c9937wN, R90 r90, C9835vS c9835vS, C8394hx c8394hx) {
        this.f77877a = xb2;
        this.f77878b = ic2;
        this.f77879c = vc2;
        this.f77880d = c8320hD;
        this.f77881e = be2;
        this.f77882f = c8112fG;
        this.f77883g = c9937wN;
        this.f77884h = r90;
        this.f77885i = c9835vS;
        this.f77886j = c8394hx;
    }

    public final void a(C9080oL c9080oL, InterfaceC9133ot interfaceC9133ot) throws Throwable {
        C8759lL c8759lL = c9080oL.f78202a;
        final IC ic2 = this.f77878b;
        Objects.requireNonNull(ic2);
        c8759lL.j(this.f77877a, this.f77879c, this.f77880d, this.f77881e, new Qc.d() { // from class: com.google.android.gms.internal.ads.mL
            @Override // Qc.d
            public final void zzg() {
                ic2.zzb();
            }
        }, this.f77882f);
        if (((Boolean) Oc.A.c().a(C8784lf.f77100aa)).booleanValue() && interfaceC9133ot != null && interfaceC9133ot.zzN() != null) {
            InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
            interfaceC8281guZzN.V(this.f77886j, this.f77885i, this.f77884h);
            interfaceC8281guZzN.M0(this.f77886j, this.f77885i, this.f77883g);
        }
    }
}
