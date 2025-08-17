package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9747vo0 implements Dk0 {

    /* renamed from: a, reason: collision with root package name */
    final String f79129a;

    /* renamed from: b, reason: collision with root package name */
    final Class f79130b;

    /* renamed from: c, reason: collision with root package name */
    final Xr0 f79131c;

    C9747vo0(String str, Class cls, Xr0 xr0, InterfaceC9868wv0 interfaceC9868wv0) {
        this.f79129a = str;
        this.f79130b = cls;
        this.f79131c = xr0;
    }

    public static Dk0 c(String str, Class cls, Xr0 xr0, InterfaceC9868wv0 interfaceC9868wv0) {
        return new C9747vo0(str, cls, xr0, interfaceC9868wv0);
    }

    @Override // com.google.android.gms.internal.ads.Dk0
    public final Class zzb() {
        return this.f79130b;
    }

    @Override // com.google.android.gms.internal.ads.Dk0
    public final Object b(Zt0 zt0) throws GeneralSecurityException {
        return Uo0.a().c(Xo0.c().a(C9749vp0.a(this.f79129a, zt0, this.f79131c, Es0.RAW, null), Bk0.a()), this.f79130b);
    }

    @Override // com.google.android.gms.internal.ads.Dk0
    public final Zr0 a(Zt0 zt0) throws GeneralSecurityException {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v(this.f79129a);
        c7620bs0B0.w(zt0);
        c7620bs0B0.u(Es0.RAW);
        C9749vp0 c9749vp0 = (C9749vp0) Xo0.c().d(No0.b().a(Xo0.c().b(C9856wp0.a((C7832ds0) c7620bs0B0.p())), null), C9749vp0.class, Bk0.a());
        Wr0 wr0B0 = Zr0.b0();
        wr0B0.v(c9749vp0.f());
        wr0B0.w(c9749vp0.d());
        wr0B0.u(c9749vp0.b());
        return (Zr0) wr0B0.p();
    }
}
