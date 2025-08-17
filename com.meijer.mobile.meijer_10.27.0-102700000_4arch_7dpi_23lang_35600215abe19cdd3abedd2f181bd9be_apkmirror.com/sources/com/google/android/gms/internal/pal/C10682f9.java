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
final class C10682f9 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10698g9 f83127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10682f9(C10698g9 c10698g9, Class cls) {
        super(cls);
        this.f83127b = c10698g9;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10972xc c10972xc = (C10972xc) interfaceC10690g1;
        KeyPair keyPairC = Ce.c(Ce.k(C10842p9.c(c10972xc.w().y().z())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairC.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairC.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        Gc gcV = Hc.v();
        gcV.n(0);
        gcV.m(c10972xc.w());
        gcV.o(AbstractC10605b0.s(w10.getAffineX().toByteArray()));
        gcV.p(AbstractC10605b0.s(w10.getAffineY().toByteArray()));
        Hc hc2 = (Hc) gcV.j();
        Dc dcU = Ec.u();
        dcU.o(0);
        dcU.n(hc2);
        dcU.m(AbstractC10605b0.s(eCPrivateKey.getS().toByteArray()));
        return (Ec) dcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C10698g9.l(4, 5, 3, E7.a("AES128_GCM"), C10698g9.f83137e, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C10698g9.l(4, 5, 3, E7.a("AES128_GCM"), C10698g9.f83137e, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C10698g9.l(4, 5, 4, E7.a("AES128_GCM"), C10698g9.f83137e, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C10698g9.l(4, 5, 4, E7.a("AES128_GCM"), C10698g9.f83137e, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C10698g9.l(4, 5, 4, E7.a("AES128_GCM"), C10698g9.f83137e, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C10698g9.l(4, 5, 3, E7.a("AES128_CTR_HMAC_SHA256"), C10698g9.f83137e, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C10698g9.l(4, 5, 3, E7.a("AES128_CTR_HMAC_SHA256"), C10698g9.f83137e, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C10698g9.l(4, 5, 4, E7.a("AES128_CTR_HMAC_SHA256"), C10698g9.f83137e, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C10698g9.l(4, 5, 4, E7.a("AES128_CTR_HMAC_SHA256"), C10698g9.f83137e, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10842p9.a(((C10972xc) interfaceC10690g1).w());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10972xc.v(abstractC10605b0, C10833p0.a());
    }
}
