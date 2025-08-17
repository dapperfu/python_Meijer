package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.x8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10968x8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10984y8 f84205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10968x8(C10984y8 c10984y8, Class cls) {
        super(cls);
        this.f84205b = c10984y8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10781lc c10781lcU = C10797mc.u();
        c10781lcU.n(0);
        c10781lcU.m(AbstractC10605b0.s(We.a(32)));
        return (C10797mc) c10781lcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new V9(C10845pc.u(), 1));
        map.put("CHACHA20_POLY1305_RAW", new V9(C10845pc.u(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10845pc.v(abstractC10605b0, C10833p0.a());
    }
}
