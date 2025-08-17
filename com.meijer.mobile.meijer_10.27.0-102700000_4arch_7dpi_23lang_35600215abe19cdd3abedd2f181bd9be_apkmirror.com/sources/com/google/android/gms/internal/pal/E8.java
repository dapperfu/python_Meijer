package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class E8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F8 f82579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E8(F8 f82, Class cls) {
        super(cls);
        this.f82579b = f82;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Sd sdU = Td.u();
        sdU.m((Wd) interfaceC10690g1);
        sdU.n(0);
        return (Td) sdU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Wd wd2 = (Wd) interfaceC10690g1;
        if (wd2.y().isEmpty() || !wd2.z()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Wd.w(abstractC10605b0, C10833p0.a());
    }
}
