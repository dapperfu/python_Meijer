package Ue;

import Ke.C;
import Ke.x;
import Te.n;
import We.A;
import We.I;
import We.u;
import We.v;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.C11419c;
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

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f37467a;

    /* renamed from: b, reason: collision with root package name */
    private static final C11419c<I, n.d> f37468b;

    /* renamed from: c, reason: collision with root package name */
    private static final C11419c<u, n.c> f37469c;

    /* renamed from: d, reason: collision with root package name */
    private static final z<Te.n, H> f37470d;

    /* renamed from: e, reason: collision with root package name */
    private static final y<H> f37471e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC11423g<Te.i, G> f37472f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC11422f<G> f37473g;

    static {
        Ye.a aVarH = M.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f37467a = aVarH;
        f37468b = C11419c.a().a(I.RAW, n.d.f36187e).a(I.TINK, n.d.f36184b).a(I.LEGACY, n.d.f36186d).a(I.CRUNCHY, n.d.f36185c).b();
        f37469c = C11419c.a().a(u.SHA1, n.c.f36178b).a(u.SHA224, n.c.f36179c).a(u.SHA256, n.c.f36180d).a(u.SHA384, n.c.f36181e).a(u.SHA512, n.c.f36182f).b();
        f37470d = z.a(new z.b() { // from class: Ue.i
            @Override // com.google.crypto.tink.internal.z.b
            public final K a(x xVar) {
                return m.k((Te.n) xVar);
            }
        }, Te.n.class, H.class);
        f37471e = y.a(new y.b() { // from class: Ue.j
            @Override // com.google.crypto.tink.internal.y.b
            public final x a(K k10) {
                return m.g((H) k10);
            }
        }, aVarH, H.class);
        f37472f = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Ue.k
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final K a(Ke.j jVar, C c10) {
                return m.j((Te.i) jVar, c10);
            }
        }, Te.i.class, G.class);
        f37473g = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Ue.l
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(K k10, C c10) {
                return m.f((G) k10, c10);
            }
        }, aVarH, G.class);
    }

    public static void i(w wVar) throws GeneralSecurityException {
        wVar.m(f37470d);
        wVar.l(f37471e);
        wVar.k(f37472f);
        wVar.j(f37473g);
    }

    private static We.x e(Te.n nVar) throws GeneralSecurityException {
        return We.x.d0().y(nVar.c()).x((u) f37469c.c(nVar.d())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Te.i f(G g10, C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                v vVarF0 = v.f0(g10.g(), C11444o.b());
                if (vVarF0.d0() == 0) {
                    return Te.i.d().e(Te.n.b().c(vVarF0.b0().size()).d(vVarF0.c0().c0()).b(f37469c.b(vVarF0.c0().b0())).e(f37468b.b(g10.e())).a()).d(Ye.b.a(vVarF0.b0().v(), C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Te.n g(H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                We.w wVarF0 = We.w.f0(h10.d().e0(), C11444o.b());
                if (wVarF0.d0() == 0) {
                    return Te.n.b().c(wVarF0.b0()).d(wVarF0.c0().c0()).b(f37469c.b(wVarF0.c0().b0())).e(f37468b.b(h10.d().c0())).a();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + wVarF0.d0());
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void h() throws GeneralSecurityException {
        i(w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static G j(Te.i iVar, C c10) throws GeneralSecurityException {
        return G.b("type.googleapis.com/google.crypto.tink.HmacKey", v.e0().y(e(iVar.a())).x(AbstractC11437h.k(iVar.f().d(C.b(c10)))).build().g(), y.c.SYMMETRIC, (I) f37468b.c(iVar.a().g()), iVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H k(Te.n nVar) throws GeneralSecurityException {
        return H.c(A.f0().y("type.googleapis.com/google.crypto.tink.HmacKey").z(We.w.e0().y(e(nVar)).x(nVar.e()).build().g()).x((I) f37468b.c(nVar.g())).build());
    }
}
