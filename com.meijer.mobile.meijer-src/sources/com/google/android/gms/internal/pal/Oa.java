package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class Oa extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Pa f83657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Oa(Pa pa2, Class cls) {
        super(cls);
        this.f83657b = pa2;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Uc uc2 = (Uc) interfaceC10815g1;
        Qc qcU = Rc.u();
        qcU.o(0);
        qcU.n(uc2.z());
        qcU.m(AbstractC10730b0.s(We.a(uc2.t())));
        return (Rc) qcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", Pa.m(32, 16, 5, 1));
        map.put("HMAC_SHA256_128BITTAG_RAW", Pa.m(32, 16, 5, 3));
        map.put("HMAC_SHA256_256BITTAG", Pa.m(32, 32, 5, 1));
        map.put("HMAC_SHA256_256BITTAG_RAW", Pa.m(32, 32, 5, 3));
        map.put("HMAC_SHA512_128BITTAG", Pa.m(64, 16, 6, 1));
        map.put("HMAC_SHA512_128BITTAG_RAW", Pa.m(64, 16, 6, 3));
        map.put("HMAC_SHA512_256BITTAG", Pa.m(64, 32, 6, 1));
        map.put("HMAC_SHA512_256BITTAG_RAW", Pa.m(64, 32, 6, 3));
        map.put("HMAC_SHA512_512BITTAG", Pa.m(64, 64, 6, 1));
        map.put("HMAC_SHA512_512BITTAG_RAW", Pa.m(64, 64, 6, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Uc uc2 = (Uc) interfaceC10815g1;
        if (uc2.t() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        Pa.n(uc2.z());
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Uc.y(abstractC10730b0, C10958p0.a());
    }
}
