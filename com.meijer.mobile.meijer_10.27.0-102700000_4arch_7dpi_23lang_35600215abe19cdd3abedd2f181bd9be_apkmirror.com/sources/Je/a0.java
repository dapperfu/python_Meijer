package Je;

import Je.V;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f14932a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<V, com.google.crypto.tink.internal.H> f14933b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f14934c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<U, com.google.crypto.tink.internal.G> f14935d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f14936e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14937a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f14937a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14937a[Ue.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f14932a = aVarH;
        f14933b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Je.W
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return a0.k((V) xVar);
            }
        }, V.class, com.google.crypto.tink.internal.H.class);
        f14934c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Je.X
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return a0.g((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f14935d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Je.Y
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return a0.j((U) jVar, c10);
            }
        }, U.class, com.google.crypto.tink.internal.G.class);
        f14936e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Je.Z
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return a0.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void i(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f14933b);
        wVar.l(f14934c);
        wVar.k(f14935d);
        wVar.j(f14936e);
    }

    private static Ue.I m(V.d dVar) throws GeneralSecurityException {
        if (V.d.f14918b.equals(dVar)) {
            return Ue.I.TINK;
        }
        if (V.d.f14919c.equals(dVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    private static V.d n(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f14937a[i10.ordinal()];
        if (i11 == 1) {
            return V.d.f14918b;
        }
        if (i11 == 2) {
            return V.d.f14919c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static U e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                Ue.G gC0 = Ue.G.c0(g10.g(), C11319o.b());
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

    private static V f(Ue.H h10, Ue.I i10) throws GeneralSecurityException {
        V.c cVar;
        Ie.x xVarA = Ie.E.a(Ue.A.f0().y(h10.b0().d0()).z(h10.b0().e0()).x(Ue.I.RAW).build().o());
        if (xVarA instanceof C3800u) {
            cVar = V.c.f14911b;
        } else if (xVarA instanceof E) {
            cVar = V.c.f14913d;
        } else if (xVarA instanceof u0) {
            cVar = V.c.f14912c;
        } else if (xVarA instanceof C3791k) {
            cVar = V.c.f14914e;
        } else if (xVarA instanceof C3796p) {
            cVar = V.c.f14915f;
        } else if (xVarA instanceof C3805z) {
            cVar = V.c.f14916g;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + xVarA);
        }
        return V.b().f(n(i10)).e(h10.c0()).c((AbstractC3783c) xVarA).d(cVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static V g(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(Ue.H.e0(h10.d().e0(), C11319o.b()), h10.d().c0());
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
    public static com.google.crypto.tink.internal.G j(U u10, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", Ue.G.b0().x(l(u10.a())).build().g(), y.c.REMOTE, m(u10.a().e()), u10.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H k(V v10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").z(l(v10).g()).x(m(v10.e())).build());
    }

    private static Ue.H l(V v10) throws GeneralSecurityException {
        try {
            return Ue.H.d0().y(v10.d()).x(Ue.A.h0(Ie.E.b(v10.c()), C11319o.b())).build();
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }
}
