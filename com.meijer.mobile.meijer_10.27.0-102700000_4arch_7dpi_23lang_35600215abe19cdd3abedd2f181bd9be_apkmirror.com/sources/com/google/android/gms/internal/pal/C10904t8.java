package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.t8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10904t8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10936v8 f84049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10904t8(C10936v8 c10936v8, Class cls) {
        super(cls);
        this.f84049b = c10936v8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Yb ybU = Zb.u();
        ybU.m(AbstractC10605b0.s(We.a(((C10651dc) interfaceC10690g1).t())));
        ybU.n(0);
        return (Zb) ybU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", C10936v8.l(16, 1));
        map.put("AES128_GCM_SIV_RAW", C10936v8.l(16, 3));
        map.put("AES256_GCM_SIV", C10936v8.l(32, 1));
        map.put("AES256_GCM_SIV_RAW", C10936v8.l(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Ye.a(((C10651dc) interfaceC10690g1).t());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10651dc.w(abstractC10605b0, C10833p0.a());
    }
}
