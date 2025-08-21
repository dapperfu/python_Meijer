package Le;

import Ke.InterfaceC3886a;
import Le.C4044u;
import Me.C4139p;
import Pe.b;
import We.C5545l;
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

/* renamed from: Le.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4043t {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4041q, InterfaceC3886a> f18375a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.r
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Xe.c.c((C4041q) jVar);
        }
    }, C4041q.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18376b = C11425i.e(c(), InterfaceC3886a.class, y.c.SYMMETRIC, C5545l.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<C4044u> f18377c = new C4032h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<C4044u> f18378d = new p.a() { // from class: Le.s
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return C4043t.b((C4044u) xVar, num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final b.EnumC0429b f18379e = b.EnumC0429b.f25765b;

    static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    private static Map<String, Ke.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", k0.f18319a);
        C4044u.b bVarD = C4044u.b().b(12).c(16).d(16);
        C4044u.c cVar = C4044u.c.f18394d;
        map.put("AES128_GCM_RAW", bVarD.e(cVar).a());
        map.put("AES256_GCM", k0.f18320b);
        map.put("AES256_GCM_RAW", C4044u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        b.EnumC0429b enumC0429b = f18379e;
        if (!enumC0429b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4139p.g();
        com.google.crypto.tink.internal.t.c().d(f18375a);
        com.google.crypto.tink.internal.s.b().d(d());
        com.google.crypto.tink.internal.q.b().a(f18377c, C4044u.class);
        com.google.crypto.tink.internal.p.f().b(f18378d, C4044u.class);
        C11421e.d().h(f18376b, enumC0429b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4041q b(C4044u c4044u, Integer num) throws GeneralSecurityException {
        f(c4044u);
        return C4041q.d().e(c4044u).c(num).d(Ye.b.b(c4044u.d())).a();
    }

    private static final void f(C4044u c4044u) throws GeneralSecurityException {
        if (c4044u.d() != 24) {
        } else {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
