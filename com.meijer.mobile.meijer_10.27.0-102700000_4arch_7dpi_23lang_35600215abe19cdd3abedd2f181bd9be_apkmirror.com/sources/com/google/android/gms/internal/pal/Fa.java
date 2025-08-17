package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Fa extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new Ea(this, C10828ob.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    Fa() {
        super(C10780lb.class, new Da(J7.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10780lb c10780lb = (C10780lb) interfaceC10690g1;
        Ye.b(c10780lb.t(), 0);
        n(c10780lb.z().f());
        m(c10780lb.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(C10875rb c10875rb) throws GeneralSecurityException {
        if (c10875rb.t() >= 10) {
            if (c10875rb.t() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10780lb.w(abstractC10605b0, C10833p0.a());
    }
}
