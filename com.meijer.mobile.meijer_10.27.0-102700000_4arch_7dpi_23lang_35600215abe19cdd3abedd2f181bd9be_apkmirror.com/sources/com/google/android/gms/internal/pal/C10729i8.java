package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10729i8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10713h8(this, C10971xb.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final int f() {
        return 2;
    }

    C10729i8() {
        super(C10923ub.class, new C10697g8(InterfaceC10776l7.class));
    }

    static /* bridge */ /* synthetic */ V9 k(int i10, int i11, int i12, int i13, int i14, int i15) {
        Db dbU = Eb.u();
        Gb gbU = Hb.u();
        gbU.m(16);
        dbU.n((Hb) gbU.j());
        dbU.m(i10);
        Eb eb2 = (Eb) dbU.j();
        Tc tcU = Uc.u();
        Wc wcU = Xc.u();
        wcU.n(5);
        wcU.m(i13);
        tcU.n((Xc) wcU.j());
        tcU.m(32);
        Uc uc2 = (Uc) tcU.j();
        C10955wb c10955wbT = C10971xb.t();
        c10955wbT.m(eb2);
        c10955wbT.n(uc2);
        return new V9((C10971xb) c10955wbT.j(), i15);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10923ub c10923ub = (C10923ub) interfaceC10690g1;
        Ye.b(c10923ub.t(), 0);
        new C10777l8();
        C10777l8.l(c10923ub.y());
        new Pa();
        Pa.l(c10923ub.z());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10923ub.w(abstractC10605b0, C10833p0.a());
    }
}
