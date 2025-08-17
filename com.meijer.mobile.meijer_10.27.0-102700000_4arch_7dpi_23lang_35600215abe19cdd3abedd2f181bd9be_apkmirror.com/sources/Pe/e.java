package Pe;

import Ie.C;
import Ie.j;
import Ie.x;
import Oe.e;
import Ue.A;
import Ue.I;
import Ue.p;
import Ue.q;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.K;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.w;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f25276a;

    /* renamed from: b, reason: collision with root package name */
    private static final z<Oe.e, H> f25277b;

    /* renamed from: c, reason: collision with root package name */
    private static final y<H> f25278c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<Oe.a, G> f25279d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<G> f25280e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<e.c, I> f25281f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<I, e.c> f25282g;

    static {
        We.a aVarH = M.h("type.googleapis.com/google.crypto.tink.AesSivKey");
        f25276a = aVarH;
        f25277b = z.a(new z.b() { // from class: Pe.a
            @Override // com.google.crypto.tink.internal.z.b
            public final K a(x xVar) {
                return e.l((Oe.e) xVar);
            }
        }, Oe.e.class, H.class);
        f25278c = y.a(new y.b() { // from class: Pe.b
            @Override // com.google.crypto.tink.internal.y.b
            public final x a(K k10) {
                return e.h((H) k10);
            }
        }, aVarH, H.class);
        f25279d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Pe.c
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final K a(j jVar, C c10) {
                return e.k((Oe.a) jVar, c10);
            }
        }, Oe.a.class, G.class);
        f25280e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Pe.d
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final j a(K k10, C c10) {
                return e.g((G) k10, c10);
            }
        }, aVarH, G.class);
        f25281f = f();
        f25282g = e();
    }

    private static Map<I, e.c> e() {
        EnumMap enumMap = new EnumMap(I.class);
        enumMap.put((EnumMap) I.RAW, (I) e.c.f23613d);
        enumMap.put((EnumMap) I.TINK, (I) e.c.f23611b);
        I i10 = I.CRUNCHY;
        e.c cVar = e.c.f23612c;
        enumMap.put((EnumMap) i10, (I) cVar);
        enumMap.put((EnumMap) I.LEGACY, (I) cVar);
        return Collections.unmodifiableMap(enumMap);
    }

    private static Map<e.c, I> f() {
        HashMap map = new HashMap();
        map.put(e.c.f23613d, I.RAW);
        map.put(e.c.f23611b, I.TINK);
        map.put(e.c.f23612c, I.CRUNCHY);
        return Collections.unmodifiableMap(map);
    }

    public static void j(w wVar) throws GeneralSecurityException {
        wVar.m(f25277b);
        wVar.l(f25278c);
        wVar.k(f25279d);
        wVar.j(f25280e);
    }

    private static I m(e.c cVar) throws GeneralSecurityException {
        Map<e.c, I> map = f25281f;
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static e.c n(I i10) throws GeneralSecurityException {
        Map<I, e.c> map = f25282g;
        if (map.containsKey(i10)) {
            return map.get(i10);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Oe.a g(G g10, C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                p pVarC0 = p.c0(g10.g(), C11319o.b());
                if (pVarC0.a0() == 0) {
                    return Oe.a.d().e(Oe.e.b().b(pVarC0.Z().size()).c(n(g10.e())).a()).d(We.b.a(pVarC0.Z().v(), C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Oe.e h(H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                q qVarC0 = q.c0(h10.d().e0(), C11319o.b());
                if (qVarC0.a0() == 0) {
                    return Oe.e.b().b(qVarC0.Z()).c(n(h10.d().c0())).a();
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
    public static G k(Oe.a aVar, C c10) throws GeneralSecurityException {
        return G.b("type.googleapis.com/google.crypto.tink.AesSivKey", p.b0().x(AbstractC11312h.k(aVar.f().d(C.b(c10)))).build().g(), y.c.SYMMETRIC, m(aVar.a().d()), aVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H l(Oe.e eVar) throws GeneralSecurityException {
        return H.c(A.f0().y("type.googleapis.com/google.crypto.tink.AesSivKey").z(q.b0().x(eVar.c()).build().g()).x(m(eVar.d())).build());
    }
}
