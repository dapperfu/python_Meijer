package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class A8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B8 f83317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A8(B8 b82, Class cls) {
        super(cls);
        this.f83317b = b82;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Md mdU = Nd.u();
        mdU.m((Qd) interfaceC10815g1);
        mdU.n(0);
        return (Nd) mdU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Qd.v(abstractC10730b0, C10958p0.a());
    }
}
