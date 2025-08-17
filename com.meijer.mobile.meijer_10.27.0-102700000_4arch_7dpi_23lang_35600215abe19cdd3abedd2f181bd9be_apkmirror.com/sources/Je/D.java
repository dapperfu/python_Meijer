package Je;

import Ie.InterfaceC3727a;
import Je.E;
import Ke.C3979v;
import Ne.b;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<A, InterfaceC3727a> f14867a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.B
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return D.b((A) jVar);
        }
    }, A.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final p.a<E> f14868b = new p.a() { // from class: Je.C
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return D.c((E) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f14869c = C11300i.e(d(), InterfaceC3727a.class, y.c.SYMMETRIC, Ue.r.d0());

    static String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    private static Map<String, Ie.x> e() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", E.b(E.a.f14871b));
        map.put("CHACHA20_POLY1305_RAW", E.b(E.a.f14873d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        Ke.A.g();
        com.google.crypto.tink.internal.t.c().d(f14867a);
        com.google.crypto.tink.internal.p.f().b(f14868b, E.class);
        com.google.crypto.tink.internal.s.b().d(e());
        C11296e.d().g(f14869c, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3727a b(A a10) throws GeneralSecurityException {
        if (C3979v.f()) {
            return C3979v.d(a10);
        }
        return Ve.g.c(a10);
    }

    static A c(E e10, Integer num) throws GeneralSecurityException {
        return A.d(e10.c(), We.b.b(32), num);
    }
}
