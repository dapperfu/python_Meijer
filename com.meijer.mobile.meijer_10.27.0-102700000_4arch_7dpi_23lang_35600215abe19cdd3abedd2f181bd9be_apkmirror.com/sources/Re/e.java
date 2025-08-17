package Re;

import Ne.b;
import Re.f;
import Ue.C5284a;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final p.a<f> f32139a = new p.a() { // from class: Re.b
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return e.d((f) xVar, num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final B<a, g> f32140b = B.b(new B.b() { // from class: Re.c
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return e.e((a) jVar);
        }
    }, a.class, g.class);

    /* renamed from: c, reason: collision with root package name */
    private static final B<a, Ie.w> f32141c = B.b(new B.b() { // from class: Re.d
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return e.f((a) jVar);
        }
    }, a.class, Ie.w.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Ie.k<Ie.w> f32142d = C11300i.e("type.googleapis.com/google.crypto.tink.AesCmacKey", Ie.w.class, y.c.SYMMETRIC, C5284a.f0());

    private static Map<String, Ie.x> g() throws GeneralSecurityException {
        HashMap map = new HashMap();
        f fVar = y.f32205e;
        map.put("AES_CMAC", fVar);
        map.put("AES256_CMAC", fVar);
        map.put("AES256_CMAC_RAW", f.b().b(32).c(16).d(f.c.f32152e).a());
        return Collections.unmodifiableMap(map);
    }

    public static void h(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        Se.e.h();
        com.google.crypto.tink.internal.p.f().b(f32139a, f.class);
        com.google.crypto.tink.internal.t.c().d(f32140b);
        com.google.crypto.tink.internal.t.c().d(f32141c);
        com.google.crypto.tink.internal.s.b().d(g());
        C11296e.d().g(f32142d, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(f fVar, Integer num) throws GeneralSecurityException {
        i(fVar);
        return a.d().e(fVar).c(We.b.b(fVar.d())).d(num).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g e(a aVar) throws GeneralSecurityException {
        i(aVar.a());
        return new Se.g(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ie.w f(a aVar) throws GeneralSecurityException {
        i(aVar.a());
        return Ve.o.c(aVar);
    }

    private static void i(f fVar) throws GeneralSecurityException {
        if (fVar.d() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
