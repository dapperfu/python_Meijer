package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class F9 extends AbstractC10968pa {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new E9(this, C10777dd.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public F9() {
        super(C10875jd.class, C10923md.class, new D9(InterfaceC10965p7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10875jd c10875jd = (C10875jd) interfaceC10815g1;
        if (c10875jd.z().y()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!c10875jd.H()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        Ye.b(c10875jd.t(), 0);
        I9.a(c10875jd.y().u());
    }

    static /* bridge */ /* synthetic */ V9 k(int i10, int i11, int i12, int i13) {
        C10811fd c10811fdT = C10827gd.t();
        c10811fdT.o(i10);
        c10811fdT.n(i11);
        c10811fdT.m(i12);
        C10827gd c10827gd = (C10827gd) c10811fdT.j();
        C10743bd c10743bdT = C10777dd.t();
        c10743bdT.m(c10827gd);
        return new V9((C10777dd) c10743bdT.j(), i13);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10875jd.w(abstractC10730b0, C10958p0.a());
    }
}
