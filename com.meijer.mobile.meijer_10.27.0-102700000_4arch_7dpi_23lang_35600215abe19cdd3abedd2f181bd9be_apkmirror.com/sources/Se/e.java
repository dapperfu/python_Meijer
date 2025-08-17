package Se;

import Ie.C;
import Ie.x;
import Re.f;
import Ue.A;
import Ue.C5284a;
import Ue.C5285b;
import Ue.C5286c;
import Ue.I;
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

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f33581a;

    /* renamed from: b, reason: collision with root package name */
    private static final z<Re.f, H> f33582b;

    /* renamed from: c, reason: collision with root package name */
    private static final y<H> f33583c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<Re.a, G> f33584d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<G> f33585e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33586a;

        static {
            int[] iArr = new int[I.values().length];
            f33586a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33586a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33586a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33586a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        We.a aVarH = M.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f33581a = aVarH;
        f33582b = z.a(new z.b() { // from class: Se.a
            @Override // com.google.crypto.tink.internal.z.b
            public final K a(x xVar) {
                return e.k((Re.f) xVar);
            }
        }, Re.f.class, H.class);
        f33583c = y.a(new y.b() { // from class: Se.b
            @Override // com.google.crypto.tink.internal.y.b
            public final x a(K k10) {
                return e.g((H) k10);
            }
        }, aVarH, H.class);
        f33584d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Se.c
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final K a(Ie.j jVar, C c10) {
                return e.j((Re.a) jVar, c10);
            }
        }, Re.a.class, G.class);
        f33585e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Se.d
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(K k10, C c10) {
                return e.f((G) k10, c10);
            }
        }, aVarH, G.class);
    }

    public static void i(w wVar) throws GeneralSecurityException {
        wVar.m(f33582b);
        wVar.l(f33583c);
        wVar.k(f33584d);
        wVar.j(f33585e);
    }

    private static I l(f.c cVar) throws GeneralSecurityException {
        if (f.c.f32149b.equals(cVar)) {
            return I.TINK;
        }
        if (f.c.f32150c.equals(cVar)) {
            return I.CRUNCHY;
        }
        if (f.c.f32152e.equals(cVar)) {
            return I.RAW;
        }
        if (f.c.f32151d.equals(cVar)) {
            return I.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static f.c m(I i10) throws GeneralSecurityException {
        int i11 = a.f33586a[i10.ordinal()];
        if (i11 == 1) {
            return f.c.f32149b;
        }
        if (i11 == 2) {
            return f.c.f32150c;
        }
        if (i11 == 3) {
            return f.c.f32151d;
        }
        if (i11 == 4) {
            return f.c.f32152e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    private static C5286c e(Re.f fVar) {
        return C5286c.b0().x(fVar.c()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Re.a f(G g10, C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C5284a c5284aE0 = C5284a.e0(g10.g(), C11319o.b());
                if (c5284aE0.c0() == 0) {
                    return Re.a.d().e(Re.f.b().b(c5284aE0.a0().size()).c(c5284aE0.b0().a0()).d(m(g10.e())).a()).c(We.b.a(c5284aE0.a0().v(), C.b(c10))).d(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Re.f g(H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C5285b c5285bD0 = C5285b.d0(h10.d().e0(), C11319o.b());
                return Re.f.b().b(c5285bD0.a0()).c(c5285bD0.b0().a0()).d(m(h10.d().c0())).a();
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void h() throws GeneralSecurityException {
        i(w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static G j(Re.a aVar, C c10) throws GeneralSecurityException {
        return G.b("type.googleapis.com/google.crypto.tink.AesCmacKey", C5284a.d0().y(e(aVar.a())).x(AbstractC11312h.k(aVar.e().d(C.b(c10)))).build().g(), y.c.SYMMETRIC, l(aVar.a().f()), aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H k(Re.f fVar) throws GeneralSecurityException {
        return H.c(A.f0().y("type.googleapis.com/google.crypto.tink.AesCmacKey").z(C5285b.c0().y(e(fVar)).x(fVar.d()).build().g()).x(l(fVar.f())).build());
    }
}
