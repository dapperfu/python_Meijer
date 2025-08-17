package Re;

import Je.C3788h;
import Ne.b;
import Re.n;
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
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final B<i, g> f32164a = B.b(new B.b() { // from class: Re.j
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return new Se.h((i) jVar);
        }
    }, i.class, g.class);

    /* renamed from: b, reason: collision with root package name */
    private static final B<i, Ie.w> f32165b = B.b(new B.b() { // from class: Re.k
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Ve.o.d((i) jVar);
        }
    }, i.class, Ie.w.class);

    /* renamed from: c, reason: collision with root package name */
    private static final Ie.k<Ie.w> f32166c = C11300i.e("type.googleapis.com/google.crypto.tink.HmacKey", Ie.w.class, y.c.SYMMETRIC, Ue.v.g0());

    /* renamed from: d, reason: collision with root package name */
    private static final q.a<n> f32167d = new C3788h();

    /* renamed from: e, reason: collision with root package name */
    private static final p.a<n> f32168e = new p.a() { // from class: Re.l
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return m.a((n) xVar, num);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final b.EnumC0342b f32169f = b.EnumC0342b.f21530b;

    private static Map<String, Ie.x> b() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", y.f32201a);
        n.b bVarD = n.b().c(32).d(16);
        n.d dVar = n.d.f32187e;
        n.b bVarE = bVarD.e(dVar);
        n.c cVar = n.c.f32180d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarE.b(cVar).a());
        n.b bVarD2 = n.b().c(32).d(32);
        n.d dVar2 = n.d.f32184b;
        map.put("HMAC_SHA256_256BITTAG", bVarD2.e(dVar2).b(cVar).a());
        map.put("HMAC_SHA256_256BITTAG_RAW", n.b().c(32).d(32).e(dVar).b(cVar).a());
        n.b bVarE2 = n.b().c(64).d(16).e(dVar2);
        n.c cVar2 = n.c.f32182f;
        map.put("HMAC_SHA512_128BITTAG", bVarE2.b(cVar2).a());
        map.put("HMAC_SHA512_128BITTAG_RAW", n.b().c(64).d(16).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG", n.b().c(64).d(32).e(dVar2).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG_RAW", n.b().c(64).d(32).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_512BITTAG", y.f32204d);
        map.put("HMAC_SHA512_512BITTAG_RAW", n.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void c(boolean z10) throws GeneralSecurityException {
        b.EnumC0342b enumC0342b = f32169f;
        if (!enumC0342b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        Se.m.h();
        com.google.crypto.tink.internal.t.c().d(f32164a);
        com.google.crypto.tink.internal.t.c().d(f32165b);
        com.google.crypto.tink.internal.s.b().d(b());
        com.google.crypto.tink.internal.p.f().b(f32168e, n.class);
        com.google.crypto.tink.internal.q.b().a(f32167d, n.class);
        C11296e.d().h(f32166c, enumC0342b, z10);
    }

    static i a(n nVar, Integer num) throws GeneralSecurityException {
        return i.d().e(nVar).d(We.b.b(nVar.e())).c(num).a();
    }
}
