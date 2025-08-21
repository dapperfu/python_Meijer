package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.t8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11029t8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11061v8 f84889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11029t8(C11061v8 c11061v8, Class cls) {
        super(cls);
        this.f84889b = c11061v8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Yb ybU = Zb.u();
        ybU.m(AbstractC10730b0.s(We.a(((C10776dc) interfaceC10815g1).t())));
        ybU.n(0);
        return (Zb) ybU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", C11061v8.l(16, 1));
        map.put("AES128_GCM_SIV_RAW", C11061v8.l(16, 3));
        map.put("AES256_GCM_SIV", C11061v8.l(32, 1));
        map.put("AES256_GCM_SIV_RAW", C11061v8.l(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Ye.a(((C10776dc) interfaceC10815g1).t());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10776dc.w(abstractC10730b0, C10958p0.a());
    }
}
