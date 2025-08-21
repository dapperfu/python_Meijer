package Qe;

import Ke.InterfaceC3891f;
import Ke.x;
import Le.C4032h;
import Pe.b;
import Qe.e;
import We.p;
import We.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.internal.C11425i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.internal.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final B<a, InterfaceC3891f> f28091a = B.b(new B.b() { // from class: Qe.b
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return d.b((a) jVar);
        }
    }, a.class, InterfaceC3891f.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ke.k<InterfaceC3891f> f28092b = C11425i.e(c(), InterfaceC3891f.class, y.c.SYMMETRIC, p.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<e> f28093c = new C4032h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<e> f28094d = new p.a() { // from class: Qe.c
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(x xVar, Integer num) {
            return d.e((e) xVar, num);
        }
    };

    static String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    private static Map<String, x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES256_SIV", l.f28114a);
        map.put("AES256_SIV_RAW", e.b().b(64).c(e.c.f28101d).a());
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        Re.e.i();
        t.c().d(f28091a);
        s.b().d(d());
        q.b().a(f28093c, e.class);
        com.google.crypto.tink.internal.p.f().b(f28094d, e.class);
        C11421e.d().g(f28092b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3891f b(a aVar) throws GeneralSecurityException {
        g(aVar.a());
        return Xe.d.c(aVar);
    }

    static a e(e eVar, Integer num) throws GeneralSecurityException {
        g(eVar);
        return a.d().e(eVar).c(num).d(Ye.b.b(eVar.c())).a();
    }

    private static void g(e eVar) throws GeneralSecurityException {
        if (eVar.c() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + eVar.c() + ". Valid keys must have 64 bytes.");
    }
}
