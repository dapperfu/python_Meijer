package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.o8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10825o8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10809n8(this, Nb.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    C10825o8() {
        super(Kb.class, new C10793m8(InterfaceC10776l7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Kb kb2 = (Kb) interfaceC10690g1;
        Ye.b(kb2.t(), 0);
        Ye.a(kb2.z().f());
        if (kb2.y().t() != 12 && kb2.y().t() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    static /* bridge */ /* synthetic */ V9 k(int i10, int i11, int i12) {
        Mb mbU = Nb.u();
        mbU.m(i10);
        Pb pbU = Qb.u();
        pbU.m(16);
        mbU.n((Qb) pbU.j());
        return new V9((Nb) mbU.j(), i12);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Kb.w(abstractC10605b0, C10833p0.a());
    }
}
