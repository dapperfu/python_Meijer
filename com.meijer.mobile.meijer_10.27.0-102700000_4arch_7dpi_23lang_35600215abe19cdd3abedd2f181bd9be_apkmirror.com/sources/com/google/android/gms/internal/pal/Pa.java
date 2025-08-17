package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Pa extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new Oa(this, Uc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final int f() {
        return 2;
    }

    public Pa() {
        super(Rc.class, new Na(J7.class));
    }

    static /* bridge */ /* synthetic */ V9 m(int i10, int i11, int i12, int i13) {
        Tc tcU = Uc.u();
        Wc wcU = Xc.u();
        wcU.n(i12);
        wcU.m(i11);
        tcU.n((Xc) wcU.j());
        tcU.m(i10);
        return new V9((Uc) tcU.j(), i13);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        l((Rc) interfaceC10690g1);
    }

    public static final void l(Rc rc2) throws GeneralSecurityException {
        Ye.b(rc2.t(), 0);
        if (rc2.A().f() >= 16) {
            n(rc2.z());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Xc xc2) throws GeneralSecurityException {
        if (xc2.t() >= 10) {
            int iZ = xc2.z() - 2;
            if (iZ != 1) {
                if (iZ != 2) {
                    if (iZ != 3) {
                        if (iZ != 4) {
                            if (iZ == 5) {
                                if (xc2.t() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (xc2.t() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    if (xc2.t() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                if (xc2.t() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (xc2.t() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Rc.y(abstractC10605b0, C10833p0.a());
    }
}
