package Re;

import Ke.C;
import Ke.j;
import Ke.x;
import Qe.e;
import We.A;
import We.I;
import We.p;
import We.q;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.K;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.w;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f32490a;

    /* renamed from: b, reason: collision with root package name */
    private static final z<Qe.e, H> f32491b;

    /* renamed from: c, reason: collision with root package name */
    private static final y<H> f32492c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<Qe.a, G> f32493d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<G> f32494e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<e.c, I> f32495f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<I, e.c> f32496g;

    static {
        Ye.a aVarH = M.h("type.googleapis.com/google.crypto.tink.AesSivKey");
        f32490a = aVarH;
        f32491b = z.a(new z.b() { // from class: Re.a
            @Override // com.google.crypto.tink.internal.z.b
            public final K a(x xVar) {
                return e.l((Qe.e) xVar);
            }
        }, Qe.e.class, H.class);
        f32492c = y.a(new y.b() { // from class: Re.b
            @Override // com.google.crypto.tink.internal.y.b
            public final x a(K k10) {
                return e.h((H) k10);
            }
        }, aVarH, H.class);
        f32493d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Re.c
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final K a(j jVar, C c10) {
                return e.k((Qe.a) jVar, c10);
            }
        }, Qe.a.class, G.class);
        f32494e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Re.d
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final j a(K k10, C c10) {
                return e.g((G) k10, c10);
            }
        }, aVarH, G.class);
        f32495f = f();
        f32496g = e();
    }

    private static Map<I, e.c> e() {
        EnumMap enumMap = new EnumMap(I.class);
        enumMap.put((EnumMap) I.RAW, (I) e.c.f28101d);
        enumMap.put((EnumMap) I.TINK, (I) e.c.f28099b);
        I i10 = I.CRUNCHY;
        e.c cVar = e.c.f28100c;
        enumMap.put((EnumMap) i10, (I) cVar);
        enumMap.put((EnumMap) I.LEGACY, (I) cVar);
        return Collections.unmodifiableMap(enumMap);
    }

    private static Map<e.c, I> f() {
        HashMap map = new HashMap();
        map.put(e.c.f28101d, I.RAW);
        map.put(e.c.f28099b, I.TINK);
        map.put(e.c.f28100c, I.CRUNCHY);
        return Collections.unmodifiableMap(map);
    }

    public static void j(w wVar) throws GeneralSecurityException {
        wVar.m(f32491b);
        wVar.l(f32492c);
        wVar.k(f32493d);
        wVar.j(f32494e);
    }

    private static I m(e.c cVar) throws GeneralSecurityException {
        Map<e.c, I> map = f32495f;
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static e.c n(I i10) throws GeneralSecurityException {
        Map<I, e.c> map = f32496g;
        if (map.containsKey(i10)) {
            return map.get(i10);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Qe.a g(G g10, C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                p pVarC0 = p.c0(g10.g(), C11444o.b());
                if (pVarC0.a0() == 0) {
                    return Qe.a.d().e(Qe.e.b().b(pVarC0.Z().size()).c(n(g10.e())).a()).d(Ye.b.a(pVarC0.Z().v(), C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Qe.e h(H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                q qVarC0 = q.c0(h10.d().e0(), C11444o.b());
                if (qVarC0.a0() == 0) {
                    return Qe.e.b().b(qVarC0.Z()).c(n(h10.d().c0())).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + h10.d().d0());
    }

    public static void i() throws GeneralSecurityException {
        j(w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static G k(Qe.a aVar, C c10) throws GeneralSecurityException {
        return G.b("type.googleapis.com/google.crypto.tink.AesSivKey", p.b0().x(AbstractC11437h.k(aVar.f().d(C.b(c10)))).build().g(), y.c.SYMMETRIC, m(aVar.a().d()), aVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H l(Qe.e eVar) throws GeneralSecurityException {
        return H.c(A.f0().y("type.googleapis.com/google.crypto.tink.AesSivKey").z(q.b0().x(eVar.c()).build().g()).x(m(eVar.d())).build());
    }
}
