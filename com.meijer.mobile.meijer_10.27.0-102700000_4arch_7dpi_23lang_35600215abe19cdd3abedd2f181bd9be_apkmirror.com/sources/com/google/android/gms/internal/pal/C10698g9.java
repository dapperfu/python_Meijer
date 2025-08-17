package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.g9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10698g9 extends AbstractC10843pa {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f83137e = new byte[0];

    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10682f9(this, C10972xc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    C10698g9() {
        super(Ec.class, Hc.class, new C10665e9(InterfaceC10840p7.class));
    }

    static /* bridge */ /* synthetic */ V9 l(int i10, int i11, int i12, D7 d72, byte[] bArr, int i13) {
        C10956wc c10956wcT = C10972xc.t();
        Jc jcT = Kc.t();
        int i14 = 4;
        jcT.n(4);
        jcT.o(5);
        jcT.m(AbstractC10605b0.s(bArr));
        Kc kc2 = (Kc) jcT.j();
        C10941vd c10941vdT = C10957wd.t();
        c10941vdT.m(d72.a());
        c10941vdT.n(AbstractC10605b0.s(d72.b()));
        int iC = d72.c() - 1;
        if (iC == 0) {
            i14 = 3;
        } else if (iC != 1) {
            i14 = iC != 2 ? 6 : 5;
        }
        c10941vdT.o(i14);
        C10957wd c10957wd = (C10957wd) c10941vdT.j();
        C10908tc c10908tcT = C10924uc.t();
        c10908tcT.m(c10957wd);
        C10924uc c10924uc = (C10924uc) c10908tcT.j();
        C11004zc c11004zcU = Ac.u();
        c11004zcU.n(kc2);
        c11004zcU.m(c10924uc);
        c11004zcU.o(i12);
        c10956wcT.m((Ac) c11004zcU.j());
        return new V9((C10972xc) c10956wcT.j(), i13);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Ec ec2 = (Ec) interfaceC10690g1;
        if (ec2.z().y()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        Ye.b(ec2.t(), 0);
        C10842p9.a(ec2.y().u());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Ec.w(abstractC10605b0, C10833p0.a());
    }
}
