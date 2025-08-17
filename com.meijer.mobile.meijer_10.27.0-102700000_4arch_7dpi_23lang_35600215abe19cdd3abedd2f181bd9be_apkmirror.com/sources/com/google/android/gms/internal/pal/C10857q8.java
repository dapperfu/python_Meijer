package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.q8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10857q8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10872r8 f83804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10857q8(C10872r8 c10872r8, Class cls) {
        super(cls);
        this.f83804b = c10872r8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Sb sbU = Tb.u();
        sbU.m(AbstractC10605b0.s(We.a(((Wb) interfaceC10690g1).t())));
        sbU.n(0);
        return (Tb) sbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", C10872r8.k(16, 1));
        map.put("AES128_GCM_RAW", C10872r8.k(16, 3));
        map.put("AES256_GCM", C10872r8.k(32, 1));
        map.put("AES256_GCM_RAW", C10872r8.k(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Ye.a(((Wb) interfaceC10690g1).t());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Wb.w(abstractC10605b0, C10833p0.a());
    }
}
