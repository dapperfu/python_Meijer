package Te;

import Le.C4032h;
import Pe.b;
import Te.n;
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
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final B<i, g> f36164a = B.b(new B.b() { // from class: Te.j
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return new Ue.h((i) jVar);
        }
    }, i.class, g.class);

    /* renamed from: b, reason: collision with root package name */
    private static final B<i, Ke.w> f36165b = B.b(new B.b() { // from class: Te.k
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Xe.o.d((i) jVar);
        }
    }, i.class, Ke.w.class);

    /* renamed from: c, reason: collision with root package name */
    private static final Ke.k<Ke.w> f36166c = C11425i.e("type.googleapis.com/google.crypto.tink.HmacKey", Ke.w.class, y.c.SYMMETRIC, We.v.g0());

    /* renamed from: d, reason: collision with root package name */
    private static final q.a<n> f36167d = new C4032h();

    /* renamed from: e, reason: collision with root package name */
    private static final p.a<n> f36168e = new p.a() { // from class: Te.l
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return m.a((n) xVar, num);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final b.EnumC0429b f36169f = b.EnumC0429b.f25765b;

    private static Map<String, Ke.x> b() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", y.f36201a);
        n.b bVarD = n.b().c(32).d(16);
        n.d dVar = n.d.f36187e;
        n.b bVarE = bVarD.e(dVar);
        n.c cVar = n.c.f36180d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarE.b(cVar).a());
        n.b bVarD2 = n.b().c(32).d(32);
        n.d dVar2 = n.d.f36184b;
        map.put("HMAC_SHA256_256BITTAG", bVarD2.e(dVar2).b(cVar).a());
        map.put("HMAC_SHA256_256BITTAG_RAW", n.b().c(32).d(32).e(dVar).b(cVar).a());
        n.b bVarE2 = n.b().c(64).d(16).e(dVar2);
        n.c cVar2 = n.c.f36182f;
        map.put("HMAC_SHA512_128BITTAG", bVarE2.b(cVar2).a());
        map.put("HMAC_SHA512_128BITTAG_RAW", n.b().c(64).d(16).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG", n.b().c(64).d(32).e(dVar2).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG_RAW", n.b().c(64).d(32).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_512BITTAG", y.f36204d);
        map.put("HMAC_SHA512_512BITTAG_RAW", n.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void c(boolean z10) throws GeneralSecurityException {
        b.EnumC0429b enumC0429b = f36169f;
        if (!enumC0429b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        Ue.m.h();
        com.google.crypto.tink.internal.t.c().d(f36164a);
        com.google.crypto.tink.internal.t.c().d(f36165b);
        com.google.crypto.tink.internal.s.b().d(b());
        com.google.crypto.tink.internal.p.f().b(f36168e, n.class);
        com.google.crypto.tink.internal.q.b().a(f36167d, n.class);
        C11421e.d().h(f36166c, enumC0429b, z10);
    }

    static i a(n nVar, Integer num) throws GeneralSecurityException {
        return i.d().e(nVar).d(Ye.b.b(nVar.e())).c(num).a();
    }
}
