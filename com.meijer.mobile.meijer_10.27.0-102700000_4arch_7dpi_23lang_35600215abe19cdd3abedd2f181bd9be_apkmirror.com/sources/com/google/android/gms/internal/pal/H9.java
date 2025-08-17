package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class H9 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public H9() {
        super(C10798md.class, new G9(InterfaceC10856q7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10798md c10798md = (C10798md) interfaceC10690g1;
        Ye.b(c10798md.t(), 0);
        if (!c10798md.I()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        I9.a(c10798md.u());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10798md.z(abstractC10605b0, C10833p0.a());
    }
}
