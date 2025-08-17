package Se;

import Ie.C;
import Ie.x;
import Re.n;
import Ue.A;
import Ue.I;
import Ue.u;
import Ue.v;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.C11294c;
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

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f33591a;

    /* renamed from: b, reason: collision with root package name */
    private static final C11294c<I, n.d> f33592b;

    /* renamed from: c, reason: collision with root package name */
    private static final C11294c<u, n.c> f33593c;

    /* renamed from: d, reason: collision with root package name */
    private static final z<Re.n, H> f33594d;

    /* renamed from: e, reason: collision with root package name */
    private static final y<H> f33595e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC11298g<Re.i, G> f33596f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC11297f<G> f33597g;

    static {
        We.a aVarH = M.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f33591a = aVarH;
        f33592b = C11294c.a().a(I.RAW, n.d.f32187e).a(I.TINK, n.d.f32184b).a(I.LEGACY, n.d.f32186d).a(I.CRUNCHY, n.d.f32185c).b();
        f33593c = C11294c.a().a(u.SHA1, n.c.f32178b).a(u.SHA224, n.c.f32179c).a(u.SHA256, n.c.f32180d).a(u.SHA384, n.c.f32181e).a(u.SHA512, n.c.f32182f).b();
        f33594d = z.a(new z.b() { // from class: Se.i
            @Override // com.google.crypto.tink.internal.z.b
            public final K a(x xVar) {
                return m.k((Re.n) xVar);
            }
        }, Re.n.class, H.class);
        f33595e = y.a(new y.b() { // from class: Se.j
            @Override // com.google.crypto.tink.internal.y.b
            public final x a(K k10) {
                return m.g((H) k10);
            }
        }, aVarH, H.class);
        f33596f = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Se.k
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final K a(Ie.j jVar, C c10) {
                return m.j((Re.i) jVar, c10);
            }
        }, Re.i.class, G.class);
        f33597g = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Se.l
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(K k10, C c10) {
                return m.f((G) k10, c10);
            }
        }, aVarH, G.class);
    }

    public static void i(w wVar) throws GeneralSecurityException {
        wVar.m(f33594d);
        wVar.l(f33595e);
        wVar.k(f33596f);
        wVar.j(f33597g);
    }

    private static Ue.x e(Re.n nVar) throws GeneralSecurityException {
        return Ue.x.d0().y(nVar.c()).x((u) f33593c.c(nVar.d())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Re.i f(G g10, C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                v vVarF0 = v.f0(g10.g(), C11319o.b());
                if (vVarF0.d0() == 0) {
                    return Re.i.d().e(Re.n.b().c(vVarF0.b0().size()).d(vVarF0.c0().c0()).b(f33593c.b(vVarF0.c0().b0())).e(f33592b.b(g10.e())).a()).d(We.b.a(vVarF0.b0().v(), C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Re.n g(H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                Ue.w wVarF0 = Ue.w.f0(h10.d().e0(), C11319o.b());
                if (wVarF0.d0() == 0) {
                    return Re.n.b().c(wVarF0.b0()).d(wVarF0.c0().c0()).b(f33593c.b(wVarF0.c0().b0())).e(f33592b.b(h10.d().c0())).a();
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
    public static G j(Re.i iVar, C c10) throws GeneralSecurityException {
        return G.b("type.googleapis.com/google.crypto.tink.HmacKey", v.e0().y(e(iVar.a())).x(AbstractC11312h.k(iVar.f().d(C.b(c10)))).build().g(), y.c.SYMMETRIC, (I) f33592b.c(iVar.a().g()), iVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H k(Re.n nVar) throws GeneralSecurityException {
        return H.c(A.f0().y("type.googleapis.com/google.crypto.tink.HmacKey").z(Ue.w.e0().y(e(nVar)).x(nVar.e()).build().g()).x((I) f33592b.c(nVar.g())).build());
    }
}
