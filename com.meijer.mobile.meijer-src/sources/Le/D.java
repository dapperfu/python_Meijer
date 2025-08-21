package Le;

import Ke.InterfaceC3886a;
import Le.E;
import Me.C4144v;
import Pe.b;
import We.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.internal.C11425i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<A, InterfaceC3886a> f18204a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.B
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return D.b((A) jVar);
        }
    }, A.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final p.a<E> f18205b = new p.a() { // from class: Le.C
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return D.c((E) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18206c = C11425i.e(d(), InterfaceC3886a.class, y.c.SYMMETRIC, We.r.d0());

    static String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    private static Map<String, Ke.x> e() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", E.b(E.a.f18208b));
        map.put("CHACHA20_POLY1305_RAW", E.b(E.a.f18210d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        Me.A.g();
        com.google.crypto.tink.internal.t.c().d(f18204a);
        com.google.crypto.tink.internal.p.f().b(f18205b, E.class);
        com.google.crypto.tink.internal.s.b().d(e());
        C11421e.d().g(f18206c, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3886a b(A a10) throws GeneralSecurityException {
        if (C4144v.f()) {
            return C4144v.d(a10);
        }
        return Xe.g.c(a10);
    }

    static A c(E e10, Integer num) throws GeneralSecurityException {
        return A.d(e10.c(), Ye.b.b(32), num);
    }
}
