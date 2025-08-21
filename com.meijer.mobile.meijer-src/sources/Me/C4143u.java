package Me;

import Le.C4045v;
import Le.C4049z;
import We.C5547n;
import We.C5548o;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Me.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4143u {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19865a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4049z, com.google.crypto.tink.internal.H> f19866b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19867c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<C4045v, com.google.crypto.tink.internal.G> f19868d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19869e;

    /* renamed from: Me.u$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19870a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19870a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19870a[We.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19870a[We.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19870a[We.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f19865a = aVarH;
        f19866b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.q
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return C4143u.j((C4049z) xVar);
            }
        }, C4049z.class, com.google.crypto.tink.internal.H.class);
        f19867c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.r
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return C4143u.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19868d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.s
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return C4143u.i((C4045v) jVar, c10);
            }
        }, C4045v.class, com.google.crypto.tink.internal.G.class);
        f19869e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.t
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return C4143u.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19866b);
        wVar.l(f19867c);
        wVar.k(f19868d);
        wVar.j(f19869e);
    }

    private static We.I k(C4049z.c cVar) throws GeneralSecurityException {
        if (C4049z.c.f18416b.equals(cVar)) {
            return We.I.TINK;
        }
        if (C4049z.c.f18417c.equals(cVar)) {
            return We.I.CRUNCHY;
        }
        if (C4049z.c.f18418d.equals(cVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C4049z.c l(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19870a[i10.ordinal()];
        if (i11 == 1) {
            return C4049z.c.f18416b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4049z.c.f18417c;
        }
        if (i11 == 4) {
            return C4049z.c.f18418d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4045v e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                C5547n c5547nC0 = C5547n.c0(g10.g(), C11444o.b());
                if (c5547nC0.a0() == 0) {
                    return C4045v.d().e(C4049z.b().b(c5547nC0.Z().size()).c(l(g10.e())).a()).d(Ye.b.a(c5547nC0.Z().v(), Ke.C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4049z f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                C5548o c5548oC0 = C5548o.c0(h10.d().e0(), C11444o.b());
                if (c5548oC0.a0() == 0) {
                    return C4049z.b().b(c5548oC0.Z()).c(l(h10.d().c0())).a();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(C4045v c4045v, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", C5547n.b0().x(AbstractC11437h.k(c4045v.f().d(Ke.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(c4045v.a().d()), c4045v.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(C4049z c4049z) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.AesGcmSivKey").z(C5548o.b0().x(c4049z.c()).build().g()).x(k(c4049z.d())).build());
    }
}
