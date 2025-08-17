package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class A8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B8 f82477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A8(B8 b82, Class cls) {
        super(cls);
        this.f82477b = b82;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Md mdU = Nd.u();
        mdU.m((Qd) interfaceC10690g1);
        mdU.n(0);
        return (Nd) mdU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Qd.v(abstractC10605b0, C10833p0.a());
    }
}
