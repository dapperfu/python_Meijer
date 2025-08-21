package Le;

import Le.N;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f18231a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<N, com.google.crypto.tink.internal.H> f18232b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f18233c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<M, com.google.crypto.tink.internal.G> f18234d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f18235e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18236a;

        static {
            int[] iArr = new int[We.I.values().length];
            f18236a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18236a[We.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f18231a = aVarH;
        f18232b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Le.O
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return T.j((N) xVar);
            }
        }, N.class, com.google.crypto.tink.internal.H.class);
        f18233c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Le.P
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return T.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f18234d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Le.Q
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return T.i((M) jVar, c10);
            }
        }, M.class, com.google.crypto.tink.internal.G.class);
        f18235e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Le.S
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return T.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f18232b);
        wVar.l(f18233c);
        wVar.k(f18234d);
        wVar.j(f18235e);
    }

    private static We.I k(N.a aVar) throws GeneralSecurityException {
        if (N.a.f18228b.equals(aVar)) {
            return We.I.TINK;
        }
        if (N.a.f18229c.equals(aVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static N.a l(We.I i10) throws GeneralSecurityException {
        int i11 = a.f18236a[i10.ordinal()];
        if (i11 == 1) {
            return N.a.f18228b;
        }
        if (i11 == 2) {
            return N.a.f18229c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static M e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                We.E eC0 = We.E.c0(g10.g(), C11444o.b());
                if (eC0.a0() == 0) {
                    return M.d(N.b(eC0.Z().a0(), l(g10.e())), g10.c());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + eC0);
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static N f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return N.b(We.F.c0(h10.d().e0(), C11444o.b()).a0(), l(h10.d().c0()));
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(M m10, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", We.E.b0().x(We.F.b0().x(m10.a().c()).build()).build().g(), y.c.REMOTE, k(m10.a().d()), m10.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(N n10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.KmsAeadKey").z(We.F.b0().x(n10.c()).build().g()).x(k(n10.d())).build());
    }
}
