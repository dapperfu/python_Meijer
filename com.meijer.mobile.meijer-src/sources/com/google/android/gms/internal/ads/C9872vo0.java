package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9872vo0 implements Dk0 {

    /* renamed from: a, reason: collision with root package name */
    final String f79969a;

    /* renamed from: b, reason: collision with root package name */
    final Class f79970b;

    /* renamed from: c, reason: collision with root package name */
    final Xr0 f79971c;

    C9872vo0(String str, Class cls, Xr0 xr0, InterfaceC9993wv0 interfaceC9993wv0) {
        this.f79969a = str;
        this.f79970b = cls;
        this.f79971c = xr0;
    }

    public static Dk0 c(String str, Class cls, Xr0 xr0, InterfaceC9993wv0 interfaceC9993wv0) {
        return new C9872vo0(str, cls, xr0, interfaceC9993wv0);
    }

    @Override // com.google.android.gms.internal.ads.Dk0
    public final Class zzb() {
        return this.f79970b;
    }

    @Override // com.google.android.gms.internal.ads.Dk0
    public final Object b(Zt0 zt0) throws GeneralSecurityException {
        return Uo0.a().c(Xo0.c().a(C9874vp0.a(this.f79969a, zt0, this.f79971c, Es0.RAW, null), Bk0.a()), this.f79970b);
    }

    @Override // com.google.android.gms.internal.ads.Dk0
    public final Zr0 a(Zt0 zt0) throws GeneralSecurityException {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v(this.f79969a);
        c7745bs0B0.w(zt0);
        c7745bs0B0.u(Es0.RAW);
        C9874vp0 c9874vp0 = (C9874vp0) Xo0.c().d(No0.b().a(Xo0.c().b(C9981wp0.a((C7957ds0) c7745bs0B0.p())), null), C9874vp0.class, Bk0.a());
        Wr0 wr0B0 = Zr0.b0();
        wr0B0.v(c9874vp0.f());
        wr0B0.w(c9874vp0.d());
        wr0B0.u(c9874vp0.b());
        return (Zr0) wr0B0.p();
    }
}
