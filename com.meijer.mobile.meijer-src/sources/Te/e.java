package Te;

import Pe.b;
import Te.f;
import We.C5534a;
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
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final p.a<f> f36139a = new p.a() { // from class: Te.b
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return e.d((f) xVar, num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final B<a, g> f36140b = B.b(new B.b() { // from class: Te.c
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return e.e((a) jVar);
        }
    }, a.class, g.class);

    /* renamed from: c, reason: collision with root package name */
    private static final B<a, Ke.w> f36141c = B.b(new B.b() { // from class: Te.d
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return e.f((a) jVar);
        }
    }, a.class, Ke.w.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Ke.k<Ke.w> f36142d = C11425i.e("type.googleapis.com/google.crypto.tink.AesCmacKey", Ke.w.class, y.c.SYMMETRIC, C5534a.f0());

    private static Map<String, Ke.x> g() throws GeneralSecurityException {
        HashMap map = new HashMap();
        f fVar = y.f36205e;
        map.put("AES_CMAC", fVar);
        map.put("AES256_CMAC", fVar);
        map.put("AES256_CMAC_RAW", f.b().b(32).c(16).d(f.c.f36152e).a());
        return Collections.unmodifiableMap(map);
    }

    public static void h(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        Ue.e.h();
        com.google.crypto.tink.internal.p.f().b(f36139a, f.class);
        com.google.crypto.tink.internal.t.c().d(f36140b);
        com.google.crypto.tink.internal.t.c().d(f36141c);
        com.google.crypto.tink.internal.s.b().d(g());
        C11421e.d().g(f36142d, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(f fVar, Integer num) throws GeneralSecurityException {
        i(fVar);
        return a.d().e(fVar).c(Ye.b.b(fVar.d())).d(num).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g e(a aVar) throws GeneralSecurityException {
        i(aVar.a());
        return new Ue.g(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ke.w f(a aVar) throws GeneralSecurityException {
        i(aVar.a());
        return Xe.o.c(aVar);
    }

    private static void i(f fVar) throws GeneralSecurityException {
        if (fVar.d() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
