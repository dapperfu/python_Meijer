package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.y8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11109y8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C11093x8(this, C10970pc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    C11109y8() {
        super(C10922mc.class, new C11077w8(InterfaceC10901l7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10922mc c10922mc = (C10922mc) interfaceC10815g1;
        Ye.b(c10922mc.t(), 0);
        if (c10922mc.y().f() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10922mc.w(abstractC10730b0, C10958p0.a());
    }
}
