package Je;

import Ie.InterfaceC3727a;
import Je.u0;
import Ne.b;
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

/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<q0, InterfaceC3727a> f15043a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.r0
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return t0.b((q0) jVar);
        }
    }, q0.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f15044b = C11300i.e(d(), InterfaceC3727a.class, y.c.SYMMETRIC, Ue.N.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<u0> f15045c = new C3788h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<u0> f15046d = new p.a() { // from class: Je.s0
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return t0.c((u0) xVar, num);
        }
    };

    static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    private static Map<String, Ie.x> e() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", u0.b(u0.a.f15060b));
        map.put("XCHACHA20_POLY1305_RAW", u0.b(u0.a.f15062d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        Ke.X.g();
        com.google.crypto.tink.internal.t.c().d(f15043a);
        com.google.crypto.tink.internal.s.b().d(e());
        com.google.crypto.tink.internal.p.f().b(f15046d, u0.class);
        com.google.crypto.tink.internal.q.b().a(f15045c, u0.class);
        C11296e.d().g(f15044b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3727a b(q0 q0Var) throws GeneralSecurityException {
        if (Ke.S.e()) {
            return Ke.S.c(q0Var);
        }
        return Ve.s.c(q0Var);
    }

    static q0 c(u0 u0Var, Integer num) throws GeneralSecurityException {
        return q0.d(u0Var.c(), We.b.b(32), num);
    }
}
