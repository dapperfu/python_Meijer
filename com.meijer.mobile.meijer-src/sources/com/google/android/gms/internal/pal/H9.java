package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class H9 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public H9() {
        super(C10923md.class, new G9(InterfaceC10981q7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10923md c10923md = (C10923md) interfaceC10815g1;
        Ye.b(c10923md.t(), 0);
        if (!c10923md.I()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        I9.a(c10923md.u());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10923md.z(abstractC10730b0, C10958p0.a());
    }
}
