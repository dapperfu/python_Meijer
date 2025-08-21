package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.i9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10855i9 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public C10855i9() {
        super(Hc.class, new C10839h9(InterfaceC10981q7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Hc hc2 = (Hc) interfaceC10815g1;
        Ye.b(hc2.t(), 0);
        C10967p9.a(hc2.u());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Hc.z(abstractC10730b0, C10958p0.a());
    }
}
