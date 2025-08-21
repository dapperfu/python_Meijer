package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class E9 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F9 f83420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E9(F9 f92, Class cls) {
        super(cls);
        this.f83420b = f92;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        byte[] bArrB = Ze.b();
        byte[] bArrC = Ze.c(bArrB);
        C10907ld c10907ldV = C10923md.v();
        c10907ldV.o(0);
        c10907ldV.m(((C10777dd) interfaceC10815g1).w());
        c10907ldV.n(AbstractC10730b0.s(bArrC));
        C10923md c10923md = (C10923md) c10907ldV.j();
        C10859id c10859idU = C10875jd.u();
        c10859idU.o(0);
        c10859idU.n(c10923md);
        c10859idU.m(AbstractC10730b0.s(bArrB));
        return (C10875jd) c10859idU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() {
        HashMap map = new HashMap();
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", F9.k(3, 3, 3, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", F9.k(3, 3, 3, 3));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", F9.k(3, 3, 4, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", F9.k(3, 3, 4, 3));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", F9.k(3, 3, 5, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", F9.k(3, 3, 5, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", F9.k(4, 3, 3, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", F9.k(4, 3, 3, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", F9.k(4, 3, 4, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", F9.k(4, 3, 4, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", F9.k(5, 4, 3, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", F9.k(5, 4, 3, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", F9.k(5, 4, 4, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", F9.k(5, 4, 4, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", F9.k(6, 5, 3, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", F9.k(6, 5, 3, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", F9.k(6, 5, 4, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", F9.k(6, 5, 4, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        I9.a(((C10777dd) interfaceC10815g1).w());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10777dd.v(abstractC10730b0, C10958p0.a());
    }
}
