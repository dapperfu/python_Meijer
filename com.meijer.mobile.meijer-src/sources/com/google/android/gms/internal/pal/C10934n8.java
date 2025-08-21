package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.n8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10934n8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10950o8 f84080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10934n8(C10950o8 c10950o8, Class cls) {
        super(cls);
        this.f84080b = c10950o8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Nb nb2 = (Nb) interfaceC10815g1;
        Jb jbU = Kb.u();
        jbU.m(AbstractC10730b0.s(We.a(nb2.t())));
        jbU.n(nb2.y());
        jbU.o(0);
        return (Kb) jbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", C10950o8.k(16, 16, 1));
        map.put("AES128_EAX_RAW", C10950o8.k(16, 16, 3));
        map.put("AES256_EAX", C10950o8.k(32, 16, 1));
        map.put("AES256_EAX_RAW", C10950o8.k(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Nb nb2 = (Nb) interfaceC10815g1;
        Ye.a(nb2.t());
        if (nb2.y().t() != 12 && nb2.y().t() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Nb.w(abstractC10730b0, C10958p0.a());
    }
}
