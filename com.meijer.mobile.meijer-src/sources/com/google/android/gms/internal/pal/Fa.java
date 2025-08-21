package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Fa extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new Ea(this, C10953ob.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    Fa() {
        super(C10905lb.class, new Da(J7.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10905lb c10905lb = (C10905lb) interfaceC10815g1;
        Ye.b(c10905lb.t(), 0);
        n(c10905lb.z().f());
        m(c10905lb.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(C11000rb c11000rb) throws GeneralSecurityException {
        if (c11000rb.t() >= 10) {
            if (c11000rb.t() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10905lb.w(abstractC10730b0, C10958p0.a());
    }
}
