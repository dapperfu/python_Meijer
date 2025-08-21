package Le;

import Ke.InterfaceC3886a;
import Le.u0;
import Pe.b;
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

/* loaded from: classes8.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<q0, InterfaceC3886a> f18380a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.r0
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return t0.b((q0) jVar);
        }
    }, q0.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18381b = C11425i.e(d(), InterfaceC3886a.class, y.c.SYMMETRIC, We.N.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<u0> f18382c = new C4032h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<u0> f18383d = new p.a() { // from class: Le.s0
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return t0.c((u0) xVar, num);
        }
    };

    static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    private static Map<String, Ke.x> e() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", u0.b(u0.a.f18397b));
        map.put("XCHACHA20_POLY1305_RAW", u0.b(u0.a.f18399d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        Me.X.g();
        com.google.crypto.tink.internal.t.c().d(f18380a);
        com.google.crypto.tink.internal.s.b().d(e());
        com.google.crypto.tink.internal.p.f().b(f18383d, u0.class);
        com.google.crypto.tink.internal.q.b().a(f18382c, u0.class);
        C11421e.d().g(f18381b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3886a b(q0 q0Var) throws GeneralSecurityException {
        if (Me.S.e()) {
            return Me.S.c(q0Var);
        }
        return Xe.s.c(q0Var);
    }

    static q0 c(u0 u0Var, Integer num) throws GeneralSecurityException {
        return q0.d(u0Var.c(), Ye.b.b(32), num);
    }
}
