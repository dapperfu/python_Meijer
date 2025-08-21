package Ue;

import Ke.C;
import Ke.x;
import Te.f;
import We.A;
import We.C5534a;
import We.C5535b;
import We.C5536c;
import We.I;
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

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f37457a;

    /* renamed from: b, reason: collision with root package name */
    private static final z<Te.f, H> f37458b;

    /* renamed from: c, reason: collision with root package name */
    private static final y<H> f37459c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<Te.a, G> f37460d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<G> f37461e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37462a;

        static {
            int[] iArr = new int[I.values().length];
            f37462a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37462a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37462a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37462a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Ye.a aVarH = M.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f37457a = aVarH;
        f37458b = z.a(new z.b() { // from class: Ue.a
            @Override // com.google.crypto.tink.internal.z.b
            public final K a(x xVar) {
                return e.k((Te.f) xVar);
            }
        }, Te.f.class, H.class);
        f37459c = y.a(new y.b() { // from class: Ue.b
            @Override // com.google.crypto.tink.internal.y.b
            public final x a(K k10) {
                return e.g((H) k10);
            }
        }, aVarH, H.class);
        f37460d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Ue.c
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final K a(Ke.j jVar, C c10) {
                return e.j((Te.a) jVar, c10);
            }
        }, Te.a.class, G.class);
        f37461e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Ue.d
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(K k10, C c10) {
                return e.f((G) k10, c10);
            }
        }, aVarH, G.class);
    }

    public static void i(w wVar) throws GeneralSecurityException {
        wVar.m(f37458b);
        wVar.l(f37459c);
        wVar.k(f37460d);
        wVar.j(f37461e);
    }

    private static I l(f.c cVar) throws GeneralSecurityException {
        if (f.c.f36149b.equals(cVar)) {
            return I.TINK;
        }
        if (f.c.f36150c.equals(cVar)) {
            return I.CRUNCHY;
        }
        if (f.c.f36152e.equals(cVar)) {
            return I.RAW;
        }
        if (f.c.f36151d.equals(cVar)) {
            return I.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static f.c m(I i10) throws GeneralSecurityException {
        int i11 = a.f37462a[i10.ordinal()];
        if (i11 == 1) {
            return f.c.f36149b;
        }
        if (i11 == 2) {
            return f.c.f36150c;
        }
        if (i11 == 3) {
            return f.c.f36151d;
        }
        if (i11 == 4) {
            return f.c.f36152e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    private static C5536c e(Te.f fVar) {
        return C5536c.b0().x(fVar.c()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Te.a f(G g10, C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C5534a c5534aE0 = C5534a.e0(g10.g(), C11444o.b());
                if (c5534aE0.c0() == 0) {
                    return Te.a.d().e(Te.f.b().b(c5534aE0.a0().size()).c(c5534aE0.b0().a0()).d(m(g10.e())).a()).c(Ye.b.a(c5534aE0.a0().v(), C.b(c10))).d(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Te.f g(H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C5535b c5535bD0 = C5535b.d0(h10.d().e0(), C11444o.b());
                return Te.f.b().b(c5535bD0.a0()).c(c5535bD0.b0().a0()).d(m(h10.d().c0())).a();
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
    public static G j(Te.a aVar, C c10) throws GeneralSecurityException {
        return G.b("type.googleapis.com/google.crypto.tink.AesCmacKey", C5534a.d0().y(e(aVar.a())).x(AbstractC11437h.k(aVar.e().d(C.b(c10)))).build().g(), y.c.SYMMETRIC, l(aVar.a().f()), aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H k(Te.f fVar) throws GeneralSecurityException {
        return H.c(A.f0().y("type.googleapis.com/google.crypto.tink.AesCmacKey").z(C5535b.c0().y(e(fVar)).x(fVar.d()).build().g()).x(l(fVar.f())).build());
    }
}
