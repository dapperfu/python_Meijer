package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.q8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10982q8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10997r8 f84644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10982q8(C10997r8 c10997r8, Class cls) {
        super(cls);
        this.f84644b = c10997r8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Sb sbU = Tb.u();
        sbU.m(AbstractC10730b0.s(We.a(((Wb) interfaceC10815g1).t())));
        sbU.n(0);
        return (Tb) sbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", C10997r8.k(16, 1));
        map.put("AES128_GCM_RAW", C10997r8.k(16, 3));
        map.put("AES256_GCM", C10997r8.k(32, 1));
        map.put("AES256_GCM_RAW", C10997r8.k(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Ye.a(((Wb) interfaceC10815g1).t());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Wb.w(abstractC10730b0, C10958p0.a());
    }
}
