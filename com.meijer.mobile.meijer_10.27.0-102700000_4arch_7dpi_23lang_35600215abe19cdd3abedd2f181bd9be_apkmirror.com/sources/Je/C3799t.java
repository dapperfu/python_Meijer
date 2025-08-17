package Je;

import Ie.InterfaceC3727a;
import Je.C3800u;
import Ke.C3974p;
import Ne.b;
import Ue.C5295l;
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

/* renamed from: Je.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3799t {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C3797q, InterfaceC3727a> f15038a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.r
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Ve.c.c((C3797q) jVar);
        }
    }, C3797q.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f15039b = C11300i.e(c(), InterfaceC3727a.class, y.c.SYMMETRIC, C5295l.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<C3800u> f15040c = new C3788h();

    /* renamed from: d, reason: collision with root package name */
    private static final p.a<C3800u> f15041d = new p.a() { // from class: Je.s
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return C3799t.b((C3800u) xVar, num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final b.EnumC0342b f15042e = b.EnumC0342b.f21530b;

    static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    private static Map<String, Ie.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", k0.f14982a);
        C3800u.b bVarD = C3800u.b().b(12).c(16).d(16);
        C3800u.c cVar = C3800u.c.f15057d;
        map.put("AES128_GCM_RAW", bVarD.e(cVar).a());
        map.put("AES256_GCM", k0.f14983b);
        map.put("AES256_GCM_RAW", C3800u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        b.EnumC0342b enumC0342b = f15042e;
        if (!enumC0342b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3974p.g();
        com.google.crypto.tink.internal.t.c().d(f15038a);
        com.google.crypto.tink.internal.s.b().d(d());
        com.google.crypto.tink.internal.q.b().a(f15040c, C3800u.class);
        com.google.crypto.tink.internal.p.f().b(f15041d, C3800u.class);
        C11296e.d().h(f15039b, enumC0342b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3797q b(C3800u c3800u, Integer num) throws GeneralSecurityException {
        f(c3800u);
        return C3797q.d().e(c3800u).c(num).d(We.b.b(c3800u.d())).a();
    }

    private static final void f(C3800u c3800u) throws GeneralSecurityException {
        if (c3800u.d() != 24) {
        } else {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
