package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.h8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10713h8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10729i8 f83154b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10713h8(C10729i8 c10729i8, Class cls) {
        super(cls);
        this.f83154b = c10729i8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10971xb c10971xb = (C10971xb) interfaceC10690g1;
        new C10777l8();
        Bb bbG = C10761k8.g(c10971xb.w());
        InterfaceC10690g1 interfaceC10690g1A = new Pa().a().a(c10971xb.y());
        C10907tb c10907tbU = C10923ub.u();
        c10907tbU.m(bbG);
        c10907tbU.n((Rc) interfaceC10690g1A);
        c10907tbU.o(0);
        return (C10923ub) c10907tbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", C10729i8.k(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", C10729i8.k(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", C10729i8.k(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", C10729i8.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10971xb c10971xb = (C10971xb) interfaceC10690g1;
        ((C10761k8) new C10777l8().a()).d(c10971xb.w());
        new Pa().a().d(c10971xb.y());
        Ye.a(c10971xb.w().t());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10971xb.v(abstractC10605b0, C10833p0.a());
    }
}
