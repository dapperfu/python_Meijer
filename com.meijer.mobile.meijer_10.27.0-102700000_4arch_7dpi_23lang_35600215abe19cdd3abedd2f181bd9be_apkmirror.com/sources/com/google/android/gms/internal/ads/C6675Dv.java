package com.google.android.gms.internal.ads;

import Vc.AbstractC5368e;
import Vc.InterfaceC5367d;

/* renamed from: com.google.android.gms.internal.ads.Dv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6675Dv implements InterfaceC5367d {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f66300a;

    /* renamed from: b, reason: collision with root package name */
    private IB f66301b;

    /* renamed from: c, reason: collision with root package name */
    private Vc.B f66302c;

    /* synthetic */ C6675Dv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f66300a = c7518av;
    }

    @Override // Vc.InterfaceC5367d
    public final /* bridge */ /* synthetic */ InterfaceC5367d a(IB ib2) {
        this.f66301b = ib2;
        return this;
    }

    @Override // Vc.InterfaceC5367d
    public final /* bridge */ /* synthetic */ InterfaceC5367d b(Vc.B b10) {
        this.f66302c = b10;
        return this;
    }

    @Override // Vc.InterfaceC5367d
    public final AbstractC5368e zzc() {
        C9233qy0.c(this.f66301b, IB.class);
        C9233qy0.c(this.f66302c, Vc.B.class);
        return new C6709Ev(this.f66300a, this.f66302c, new C8296iA(), new C8403jB(), new MN(), this.f66301b, null, null, null);
    }
}
