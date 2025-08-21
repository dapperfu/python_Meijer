package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.f9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10807f9 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10823g9 f83967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10807f9(C10823g9 c10823g9, Class cls) {
        super(cls);
        this.f83967b = c10823g9;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C11097xc c11097xc = (C11097xc) interfaceC10815g1;
        KeyPair keyPairC = Ce.c(Ce.k(C10967p9.c(c11097xc.w().y().z())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairC.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairC.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        Gc gcV = Hc.v();
        gcV.n(0);
        gcV.m(c11097xc.w());
        gcV.o(AbstractC10730b0.s(w10.getAffineX().toByteArray()));
        gcV.p(AbstractC10730b0.s(w10.getAffineY().toByteArray()));
        Hc hc2 = (Hc) gcV.j();
        Dc dcU = Ec.u();
        dcU.o(0);
        dcU.n(hc2);
        dcU.m(AbstractC10730b0.s(eCPrivateKey.getS().toByteArray()));
        return (Ec) dcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C10823g9.l(4, 5, 3, E7.a("AES128_GCM"), C10823g9.f83977e, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C10823g9.l(4, 5, 3, E7.a("AES128_GCM"), C10823g9.f83977e, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C10823g9.l(4, 5, 4, E7.a("AES128_GCM"), C10823g9.f83977e, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C10823g9.l(4, 5, 4, E7.a("AES128_GCM"), C10823g9.f83977e, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C10823g9.l(4, 5, 4, E7.a("AES128_GCM"), C10823g9.f83977e, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C10823g9.l(4, 5, 3, E7.a("AES128_CTR_HMAC_SHA256"), C10823g9.f83977e, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C10823g9.l(4, 5, 3, E7.a("AES128_CTR_HMAC_SHA256"), C10823g9.f83977e, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C10823g9.l(4, 5, 4, E7.a("AES128_CTR_HMAC_SHA256"), C10823g9.f83977e, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C10823g9.l(4, 5, 4, E7.a("AES128_CTR_HMAC_SHA256"), C10823g9.f83977e, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10967p9.a(((C11097xc) interfaceC10815g1).w());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C11097xc.v(abstractC10730b0, C10958p0.a());
    }
}
