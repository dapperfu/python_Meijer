package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.n8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10809n8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10825o8 f83240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10809n8(C10825o8 c10825o8, Class cls) {
        super(cls);
        this.f83240b = c10825o8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Nb nb2 = (Nb) interfaceC10690g1;
        Jb jbU = Kb.u();
        jbU.m(AbstractC10605b0.s(We.a(nb2.t())));
        jbU.n(nb2.y());
        jbU.o(0);
        return (Kb) jbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", C10825o8.k(16, 16, 1));
        map.put("AES128_EAX_RAW", C10825o8.k(16, 16, 3));
        map.put("AES256_EAX", C10825o8.k(32, 16, 1));
        map.put("AES256_EAX_RAW", C10825o8.k(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Nb nb2 = (Nb) interfaceC10690g1;
        Ye.a(nb2.t());
        if (nb2.y().t() != 12 && nb2.y().t() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Nb.w(abstractC10605b0, C10833p0.a());
    }
}
