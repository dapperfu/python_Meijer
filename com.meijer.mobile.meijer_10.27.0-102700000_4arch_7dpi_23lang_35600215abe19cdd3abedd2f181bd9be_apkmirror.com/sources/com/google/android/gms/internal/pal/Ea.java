package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class Ea extends W9 {
    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10828ob c10828ob = (C10828ob) interfaceC10690g1;
        C10764kb c10764kbU = C10780lb.u();
        c10764kbU.o(0);
        c10764kbU.m(AbstractC10605b0.s(We.a(c10828ob.t())));
        c10764kbU.n(c10828ob.y());
        return (C10780lb) c10764kbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        C10812nb c10812nbU = C10828ob.u();
        c10812nbU.m(32);
        C10860qb c10860qbU = C10875rb.u();
        c10860qbU.m(16);
        c10812nbU.n((C10875rb) c10860qbU.j());
        map.put("AES_CMAC", new V9((C10828ob) c10812nbU.j(), 1));
        C10812nb c10812nbU2 = C10828ob.u();
        c10812nbU2.m(32);
        C10860qb c10860qbU2 = C10875rb.u();
        c10860qbU2.m(16);
        c10812nbU2.n((C10875rb) c10860qbU2.j());
        map.put("AES256_CMAC", new V9((C10828ob) c10812nbU2.j(), 1));
        C10812nb c10812nbU3 = C10828ob.u();
        c10812nbU3.m(32);
        C10860qb c10860qbU3 = C10875rb.u();
        c10860qbU3.m(16);
        c10812nbU3.n((C10875rb) c10860qbU3.j());
        map.put("AES256_CMAC_RAW", new V9((C10828ob) c10812nbU3.j(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10828ob c10828ob = (C10828ob) interfaceC10690g1;
        Fa.m(c10828ob.y());
        Fa.n(c10828ob.t());
    }

    Ea(Fa fa2, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10828ob.w(abstractC10605b0, C10833p0.a());
    }
}
