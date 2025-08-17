package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class H8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I8 f82644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H8(I8 i82, Class cls) {
        super(cls);
        this.f82644b = i82;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10653de c10653deU = C10687fe.u();
        c10653deU.n(0);
        c10653deU.m(AbstractC10605b0.s(We.a(32)));
        return (C10687fe) c10653deU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", new V9(C10735ie.u(), 1));
        map.put("XCHACHA20_POLY1305_RAW", new V9(C10735ie.u(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10735ie.v(abstractC10605b0, C10833p0.a());
    }
}
