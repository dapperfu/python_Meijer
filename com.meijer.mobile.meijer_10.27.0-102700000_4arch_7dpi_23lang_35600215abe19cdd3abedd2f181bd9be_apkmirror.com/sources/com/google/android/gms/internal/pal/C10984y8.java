package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.y8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10984y8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10968x8(this, C10845pc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    C10984y8() {
        super(C10797mc.class, new C10952w8(InterfaceC10776l7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10797mc c10797mc = (C10797mc) interfaceC10690g1;
        Ye.b(c10797mc.t(), 0);
        if (c10797mc.y().f() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10797mc.w(abstractC10605b0, C10833p0.a());
    }
}
