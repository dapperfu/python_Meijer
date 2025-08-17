package Je;

import Ie.InterfaceC3727a;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final p.a<p0> f15008a = new p.a() { // from class: Je.m0
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return o0.b((p0) xVar, num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<l0, InterfaceC3727a> f15009b = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.n0
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Ke.L.c((l0) jVar);
        }
    }, l0.class, InterfaceC3727a.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static l0 b(p0 p0Var, Integer num) throws GeneralSecurityException {
        return l0.d(p0Var, We.b.b(32), num);
    }

    private static Map<String, Ie.x> c() {
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", k0.f14990i);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", k0.f14991j);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", k0.f14992k);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", k0.f14993l);
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        Ke.Q.g();
        com.google.crypto.tink.internal.s.b().d(c());
        com.google.crypto.tink.internal.t.c().d(f15009b);
        com.google.crypto.tink.internal.p.f().b(f15008a, p0.class);
    }
}
