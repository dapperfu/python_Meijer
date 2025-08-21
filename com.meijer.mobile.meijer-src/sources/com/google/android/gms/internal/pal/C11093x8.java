package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.x8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11093x8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11109y8 f85045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11093x8(C11109y8 c11109y8, Class cls) {
        super(cls);
        this.f85045b = c11109y8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10906lc c10906lcU = C10922mc.u();
        c10906lcU.n(0);
        c10906lcU.m(AbstractC10730b0.s(We.a(32)));
        return (C10922mc) c10906lcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new V9(C10970pc.u(), 1));
        map.put("CHACHA20_POLY1305_RAW", new V9(C10970pc.u(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10970pc.v(abstractC10730b0, C10958p0.a());
    }
}
