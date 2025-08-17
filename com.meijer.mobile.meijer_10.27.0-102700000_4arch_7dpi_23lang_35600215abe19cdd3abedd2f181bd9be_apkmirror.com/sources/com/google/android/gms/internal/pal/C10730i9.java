package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.i9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10730i9 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public C10730i9() {
        super(Hc.class, new C10714h9(InterfaceC10856q7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Hc hc2 = (Hc) interfaceC10690g1;
        Ye.b(hc2.t(), 0);
        C10842p9.a(hc2.u());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Hc.z(abstractC10605b0, C10833p0.a());
    }
}
