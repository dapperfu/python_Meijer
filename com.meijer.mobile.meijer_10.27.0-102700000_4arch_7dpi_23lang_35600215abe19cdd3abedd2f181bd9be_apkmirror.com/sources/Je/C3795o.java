package Je;

import Ie.InterfaceC3727a;
import Je.C3796p;
import Ke.C3968j;
import Ne.b;
import Ue.C5292i;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Je.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3795o {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C3792l, InterfaceC3727a> f15005a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.m
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Ve.b.c((C3792l) jVar);
        }
    }, C3792l.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f15006b = C11300i.e(c(), InterfaceC3727a.class, y.c.SYMMETRIC, C5292i.f0());

    /* renamed from: c, reason: collision with root package name */
    private static final p.a<C3796p> f15007c = new p.a() { // from class: Je.n
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return C3795o.b((C3796p) xVar, num);
        }
    };

    static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    private static Map<String, Ie.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", k0.f14984c);
        C3796p.b bVarD = C3796p.b().b(16).c(16).d(16);
        C3796p.c cVar = C3796p.c.f15020d;
        map.put("AES128_EAX_RAW", bVarD.e(cVar).a());
        map.put("AES256_EAX", k0.f14985d);
        map.put("AES256_EAX_RAW", C3796p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        C3968j.h();
        com.google.crypto.tink.internal.t.c().d(f15005a);
        com.google.crypto.tink.internal.s.b().d(d());
        com.google.crypto.tink.internal.p.f().b(f15007c, C3796p.class);
        C11296e.d().g(f15006b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3792l b(C3796p c3796p, Integer num) throws GeneralSecurityException {
        f(c3796p);
        return C3792l.d().e(c3796p).c(num).d(We.b.b(c3796p.d())).a();
    }

    private static final void f(C3796p c3796p) throws GeneralSecurityException {
        if (c3796p.d() != 24) {
        } else {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
