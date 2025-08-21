package Le;

import Ke.InterfaceC3886a;
import Le.C4035k;
import Me.C4128e;
import Pe.b;
import We.C5537d;
import We.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.internal.C11425i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Le.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4034j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4030f, InterfaceC3886a> f18292a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.g
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Xe.h.c((C4030f) jVar);
        }
    }, C4030f.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18293b = C11425i.e(b(), InterfaceC3886a.class, y.c.SYMMETRIC, C5537d.f0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<C4035k> f18294c = new C4032h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<C4035k> f18295d = new p.a() { // from class: Le.i
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return C4034j.a((C4035k) xVar, num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final b.EnumC0429b f18296e = b.EnumC0429b.f25765b;

    static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    private static Map<String, Ke.x> c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", k0.f18323e);
        C4035k.b bVarE = C4035k.b().b(16).d(32).f(16).e(16);
        C4035k.c cVar = C4035k.c.f18311d;
        C4035k.b bVarC = bVarE.c(cVar);
        C4035k.d dVar = C4035k.d.f18317d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarC.g(dVar).a());
        map.put("AES256_CTR_HMAC_SHA256", k0.f18324f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", C4035k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        b.EnumC0429b enumC0429b = f18296e;
        if (!enumC0429b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4128e.h();
        com.google.crypto.tink.internal.t.c().d(f18292a);
        com.google.crypto.tink.internal.s.b().d(c());
        com.google.crypto.tink.internal.q.b().a(f18294c, C4035k.class);
        com.google.crypto.tink.internal.p.f().b(f18295d, C4035k.class);
        C11421e.d().h(f18293b, enumC0429b, z10);
    }

    static C4030f a(C4035k c4035k, Integer num) throws GeneralSecurityException {
        e(c4035k);
        return C4030f.d().f(c4035k).e(num).c(Ye.b.b(c4035k.c())).d(Ye.b.b(c4035k.e())).a();
    }

    private static void e(C4035k c4035k) throws GeneralSecurityException {
        if (c4035k.c() != 16 && c4035k.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
