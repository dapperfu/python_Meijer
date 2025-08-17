package Je;

import Ie.InterfaceC3727a;
import Je.C3791k;
import Ke.C3963e;
import Ne.b;
import Ue.C5287d;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Je.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3790j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C3786f, InterfaceC3727a> f14955a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.g
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Ve.h.c((C3786f) jVar);
        }
    }, C3786f.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f14956b = C11300i.e(b(), InterfaceC3727a.class, y.c.SYMMETRIC, C5287d.f0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<C3791k> f14957c = new C3788h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<C3791k> f14958d = new p.a() { // from class: Je.i
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return C3790j.a((C3791k) xVar, num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final b.EnumC0342b f14959e = b.EnumC0342b.f21530b;

    static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    private static Map<String, Ie.x> c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", k0.f14986e);
        C3791k.b bVarE = C3791k.b().b(16).d(32).f(16).e(16);
        C3791k.c cVar = C3791k.c.f14974d;
        C3791k.b bVarC = bVarE.c(cVar);
        C3791k.d dVar = C3791k.d.f14980d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarC.g(dVar).a());
        map.put("AES256_CTR_HMAC_SHA256", k0.f14987f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", C3791k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        b.EnumC0342b enumC0342b = f14959e;
        if (!enumC0342b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3963e.h();
        com.google.crypto.tink.internal.t.c().d(f14955a);
        com.google.crypto.tink.internal.s.b().d(c());
        com.google.crypto.tink.internal.q.b().a(f14957c, C3791k.class);
        com.google.crypto.tink.internal.p.f().b(f14958d, C3791k.class);
        C11296e.d().h(f14956b, enumC0342b, z10);
    }

    static C3786f a(C3791k c3791k, Integer num) throws GeneralSecurityException {
        e(c3791k);
        return C3786f.d().f(c3791k).e(num).c(We.b.b(c3791k.c())).d(We.b.b(c3791k.e())).a();
    }

    private static void e(C3791k c3791k) throws GeneralSecurityException {
        if (c3791k.c() != 16 && c3791k.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
