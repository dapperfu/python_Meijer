package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class Ea extends W9 {
    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10953ob c10953ob = (C10953ob) interfaceC10815g1;
        C10889kb c10889kbU = C10905lb.u();
        c10889kbU.o(0);
        c10889kbU.m(AbstractC10730b0.s(We.a(c10953ob.t())));
        c10889kbU.n(c10953ob.y());
        return (C10905lb) c10889kbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        C10937nb c10937nbU = C10953ob.u();
        c10937nbU.m(32);
        C10985qb c10985qbU = C11000rb.u();
        c10985qbU.m(16);
        c10937nbU.n((C11000rb) c10985qbU.j());
        map.put("AES_CMAC", new V9((C10953ob) c10937nbU.j(), 1));
        C10937nb c10937nbU2 = C10953ob.u();
        c10937nbU2.m(32);
        C10985qb c10985qbU2 = C11000rb.u();
        c10985qbU2.m(16);
        c10937nbU2.n((C11000rb) c10985qbU2.j());
        map.put("AES256_CMAC", new V9((C10953ob) c10937nbU2.j(), 1));
        C10937nb c10937nbU3 = C10953ob.u();
        c10937nbU3.m(32);
        C10985qb c10985qbU3 = C11000rb.u();
        c10985qbU3.m(16);
        c10937nbU3.n((C11000rb) c10985qbU3.j());
        map.put("AES256_CMAC_RAW", new V9((C10953ob) c10937nbU3.j(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10953ob c10953ob = (C10953ob) interfaceC10815g1;
        Fa.m(c10953ob.y());
        Fa.n(c10953ob.t());
    }

    Ea(Fa fa2, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10953ob.w(abstractC10730b0, C10958p0.a());
    }
}
