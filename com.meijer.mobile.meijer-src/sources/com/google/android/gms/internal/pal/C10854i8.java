package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10854i8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10838h8(this, C11096xb.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final int f() {
        return 2;
    }

    C10854i8() {
        super(C11048ub.class, new C10822g8(InterfaceC10901l7.class));
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
        C11080wb c11080wbT = C11096xb.t();
        c11080wbT.m(eb2);
        c11080wbT.n(uc2);
        return new V9((C11096xb) c11080wbT.j(), i15);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C11048ub c11048ub = (C11048ub) interfaceC10815g1;
        Ye.b(c11048ub.t(), 0);
        new C10902l8();
        C10902l8.l(c11048ub.y());
        new Pa();
        Pa.l(c11048ub.z());
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C11048ub.w(abstractC10730b0, C10958p0.a());
    }
}
