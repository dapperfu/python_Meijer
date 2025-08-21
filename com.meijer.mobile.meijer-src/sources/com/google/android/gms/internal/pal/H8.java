package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class H8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I8 f83484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H8(I8 i82, Class cls) {
        super(cls);
        this.f83484b = i82;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10778de c10778deU = C10812fe.u();
        c10778deU.n(0);
        c10778deU.m(AbstractC10730b0.s(We.a(32)));
        return (C10812fe) c10778deU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", new V9(C10860ie.u(), 1));
        map.put("XCHACHA20_POLY1305_RAW", new V9(C10860ie.u(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10860ie.v(abstractC10730b0, C10958p0.a());
    }
}
