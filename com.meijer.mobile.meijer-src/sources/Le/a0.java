package Le;

import Le.V;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f18269a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<V, com.google.crypto.tink.internal.H> f18270b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f18271c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<U, com.google.crypto.tink.internal.G> f18272d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f18273e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18274a;

        static {
            int[] iArr = new int[We.I.values().length];
            f18274a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18274a[We.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f18269a = aVarH;
        f18270b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Le.W
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return a0.k((V) xVar);
            }
        }, V.class, com.google.crypto.tink.internal.H.class);
        f18271c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Le.X
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return a0.g((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f18272d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Le.Y
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return a0.j((U) jVar, c10);
            }
        }, U.class, com.google.crypto.tink.internal.G.class);
        f18273e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Le.Z
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return a0.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void i(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f18270b);
        wVar.l(f18271c);
        wVar.k(f18272d);
        wVar.j(f18273e);
    }

    private static We.I m(V.d dVar) throws GeneralSecurityException {
        if (V.d.f18255b.equals(dVar)) {
            return We.I.TINK;
        }
        if (V.d.f18256c.equals(dVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    private static V.d n(We.I i10) throws GeneralSecurityException {
        int i11 = a.f18274a[i10.ordinal()];
        if (i11 == 1) {
            return V.d.f18255b;
        }
        if (i11 == 2) {
            return V.d.f18256c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static U e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                We.G gC0 = We.G.c0(g10.g(), C11444o.b());
                if (gC0.a0() == 0) {
                    return U.d(f(gC0.Z(), g10.e()), g10.c());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + gC0);
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    private static V f(We.H h10, We.I i10) throws GeneralSecurityException {
        V.c cVar;
        Ke.x xVarA = Ke.E.a(We.A.f0().y(h10.b0().d0()).z(h10.b0().e0()).x(We.I.RAW).build().o());
        if (xVarA instanceof C4044u) {
            cVar = V.c.f18248b;
        } else if (xVarA instanceof E) {
            cVar = V.c.f18250d;
        } else if (xVarA instanceof u0) {
            cVar = V.c.f18249c;
        } else if (xVarA instanceof C4035k) {
            cVar = V.c.f18251e;
        } else if (xVarA instanceof C4040p) {
            cVar = V.c.f18252f;
        } else if (xVarA instanceof C4049z) {
            cVar = V.c.f18253g;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + xVarA);
        }
        return V.b().f(n(i10)).e(h10.c0()).c((AbstractC4027c) xVarA).d(cVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static V g(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(We.H.e0(h10.d().e0(), C11444o.b()), h10.d().c0());
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void h() throws GeneralSecurityException {
        i(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G j(U u10, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", We.G.b0().x(l(u10.a())).build().g(), y.c.REMOTE, m(u10.a().e()), u10.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H k(V v10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").z(l(v10).g()).x(m(v10.e())).build());
    }

    private static We.H l(V v10) throws GeneralSecurityException {
        try {
            return We.H.d0().y(v10.d()).x(We.A.h0(Ke.E.b(v10.c()), C11444o.b())).build();
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }
}
