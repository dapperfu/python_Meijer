package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.g9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10823g9 extends AbstractC10968pa {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f83977e = new byte[0];

    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10807f9(this, C11097xc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    C10823g9() {
        super(Ec.class, Hc.class, new C10790e9(InterfaceC10965p7.class));
    }

    static /* bridge */ /* synthetic */ V9 l(int i10, int i11, int i12, D7 d72, byte[] bArr, int i13) {
        C11081wc c11081wcT = C11097xc.t();
        Jc jcT = Kc.t();
        int i14 = 4;
        jcT.n(4);
        jcT.o(5);
        jcT.m(AbstractC10730b0.s(bArr));
        Kc kc2 = (Kc) jcT.j();
        C11066vd c11066vdT = C11082wd.t();
        c11066vdT.m(d72.a());
        c11066vdT.n(AbstractC10730b0.s(d72.b()));
        int iC = d72.c() - 1;
        if (iC == 0) {
            i14 = 3;
        } else if (iC != 1) {
            i14 = iC != 2 ? 6 : 5;
        }
        c11066vdT.o(i14);
        C11082wd c11082wd = (C11082wd) c11066vdT.j();
        C11033tc c11033tcT = C11049uc.t();
        c11033tcT.m(c11082wd);
        C11049uc c11049uc = (C11049uc) c11033tcT.j();
        C11129zc c11129zcU = Ac.u();
        c11129zcU.n(kc2);
        c11129zcU.m(c11049uc);
        c11129zcU.o(i12);
        c11081wcT.m((Ac) c11129zcU.j());
        return new V9((C11097xc) c11081wcT.j(), i13);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Ec ec2 = (Ec) interfaceC10815g1;
        if (ec2.z().y()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        Ye.b(ec2.t(), 0);
        C10967p9.a(ec2.y().u());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Ec.w(abstractC10730b0, C10958p0.a());
    }
}
