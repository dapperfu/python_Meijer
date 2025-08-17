package Oe;

import Ie.InterfaceC3732f;
import Ie.x;
import Je.C3788h;
import Ne.b;
import Oe.e;
import Ue.p;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.internal.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final B<a, InterfaceC3732f> f23603a = B.b(new B.b() { // from class: Oe.b
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return d.b((a) jVar);
        }
    }, a.class, InterfaceC3732f.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ie.k<InterfaceC3732f> f23604b = C11300i.e(c(), InterfaceC3732f.class, y.c.SYMMETRIC, p.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<e> f23605c = new C3788h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<e> f23606d = new p.a() { // from class: Oe.c
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(x xVar, Integer num) {
            return d.e((e) xVar, num);
        }
    };

    static String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    private static Map<String, x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES256_SIV", l.f23626a);
        map.put("AES256_SIV_RAW", e.b().b(64).c(e.c.f23613d).a());
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        Pe.e.i();
        t.c().d(f23603a);
        s.b().d(d());
        q.b().a(f23605c, e.class);
        com.google.crypto.tink.internal.p.f().b(f23606d, e.class);
        C11296e.d().g(f23604b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3732f b(a aVar) throws GeneralSecurityException {
        g(aVar.a());
        return Ve.d.c(aVar);
    }

    static a e(e eVar, Integer num) throws GeneralSecurityException {
        g(eVar);
        return a.d().e(eVar).c(num).d(We.b.b(eVar.c())).a();
    }

    private static void g(e eVar) throws GeneralSecurityException {
        if (eVar.c() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + eVar.c() + ". Valid keys must have 64 bytes.");
    }
}
