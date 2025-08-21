package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.h8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10838h8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10854i8 f83994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10838h8(C10854i8 c10854i8, Class cls) {
        super(cls);
        this.f83994b = c10854i8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C11096xb c11096xb = (C11096xb) interfaceC10815g1;
        new C10902l8();
        Bb bbG = C10886k8.g(c11096xb.w());
        InterfaceC10815g1 interfaceC10815g1A = new Pa().a().a(c11096xb.y());
        C11032tb c11032tbU = C11048ub.u();
        c11032tbU.m(bbG);
        c11032tbU.n((Rc) interfaceC10815g1A);
        c11032tbU.o(0);
        return (C11048ub) c11032tbU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", C10854i8.k(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", C10854i8.k(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", C10854i8.k(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", C10854i8.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C11096xb c11096xb = (C11096xb) interfaceC10815g1;
        ((C10886k8) new C10902l8().a()).d(c11096xb.w());
        new Pa().a().d(c11096xb.y());
        Ye.a(c11096xb.w().t());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C11096xb.v(abstractC10730b0, C10958p0.a());
    }
}
