package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class F9 extends AbstractC10843pa {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new E9(this, C10652dd.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public F9() {
        super(C10750jd.class, C10798md.class, new D9(InterfaceC10840p7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10750jd c10750jd = (C10750jd) interfaceC10690g1;
        if (c10750jd.z().y()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!c10750jd.H()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        Ye.b(c10750jd.t(), 0);
        I9.a(c10750jd.y().u());
    }

    static /* bridge */ /* synthetic */ V9 k(int i10, int i11, int i12, int i13) {
        C10686fd c10686fdT = C10702gd.t();
        c10686fdT.o(i10);
        c10686fdT.n(i11);
        c10686fdT.m(i12);
        C10702gd c10702gd = (C10702gd) c10686fdT.j();
        C10618bd c10618bdT = C10652dd.t();
        c10618bdT.m(c10702gd);
        return new V9((C10652dd) c10618bdT.j(), i13);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10750jd.w(abstractC10605b0, C10833p0.a());
    }
}
