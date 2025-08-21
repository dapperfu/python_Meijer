package com.google.android.gms.internal.ads;

import Xc.AbstractC5571e;
import Xc.InterfaceC5570d;

/* renamed from: com.google.android.gms.internal.ads.Dv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6800Dv implements InterfaceC5570d {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f67140a;

    /* renamed from: b, reason: collision with root package name */
    private IB f67141b;

    /* renamed from: c, reason: collision with root package name */
    private Xc.B f67142c;

    /* synthetic */ C6800Dv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f67140a = c7643av;
    }

    @Override // Xc.InterfaceC5570d
    public final /* bridge */ /* synthetic */ InterfaceC5570d a(Xc.B b10) {
        this.f67142c = b10;
        return this;
    }

    @Override // Xc.InterfaceC5570d
    public final /* bridge */ /* synthetic */ InterfaceC5570d b(IB ib2) {
        this.f67141b = ib2;
        return this;
    }

    @Override // Xc.InterfaceC5570d
    public final AbstractC5571e zzc() {
        C9358qy0.c(this.f67141b, IB.class);
        C9358qy0.c(this.f67142c, Xc.B.class);
        return new C6834Ev(this.f67140a, this.f67142c, new C8421iA(), new C8528jB(), new MN(), this.f67141b, null, null, null);
    }
}
