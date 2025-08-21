package Le;

import Ke.InterfaceC3886a;
import Le.C4040p;
import Me.C4133j;
import Pe.b;
import We.C5542i;
import We.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.internal.C11425i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Le.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4039o {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4036l, InterfaceC3886a> f18342a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.m
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Xe.b.c((C4036l) jVar);
        }
    }, C4036l.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18343b = C11425i.e(c(), InterfaceC3886a.class, y.c.SYMMETRIC, C5542i.f0());

    /* renamed from: c, reason: collision with root package name */
    private static final p.a<C4040p> f18344c = new p.a() { // from class: Le.n
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return C4039o.b((C4040p) xVar, num);
        }
    };

    static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    private static Map<String, Ke.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", k0.f18321c);
        C4040p.b bVarD = C4040p.b().b(16).c(16).d(16);
        C4040p.c cVar = C4040p.c.f18357d;
        map.put("AES128_EAX_RAW", bVarD.e(cVar).a());
        map.put("AES256_EAX", k0.f18322d);
        map.put("AES256_EAX_RAW", C4040p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        C4133j.h();
        com.google.crypto.tink.internal.t.c().d(f18342a);
        com.google.crypto.tink.internal.s.b().d(d());
        com.google.crypto.tink.internal.p.f().b(f18344c, C4040p.class);
        C11421e.d().g(f18343b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4036l b(C4040p c4040p, Integer num) throws GeneralSecurityException {
        f(c4040p);
        return C4036l.d().e(c4040p).c(num).d(Ye.b.b(c4040p.d())).a();
    }

    private static final void f(C4040p c4040p) throws GeneralSecurityException {
        if (c4040p.d() != 24) {
        } else {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
