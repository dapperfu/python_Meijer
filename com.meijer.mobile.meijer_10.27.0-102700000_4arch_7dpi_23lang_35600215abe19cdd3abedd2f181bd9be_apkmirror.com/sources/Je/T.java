package Je;

import Je.N;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f14894a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<N, com.google.crypto.tink.internal.H> f14895b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f14896c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<M, com.google.crypto.tink.internal.G> f14897d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f14898e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14899a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f14899a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14899a[Ue.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f14894a = aVarH;
        f14895b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Je.O
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return T.j((N) xVar);
            }
        }, N.class, com.google.crypto.tink.internal.H.class);
        f14896c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Je.P
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return T.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f14897d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Je.Q
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return T.i((M) jVar, c10);
            }
        }, M.class, com.google.crypto.tink.internal.G.class);
        f14898e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Je.S
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return T.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f14895b);
        wVar.l(f14896c);
        wVar.k(f14897d);
        wVar.j(f14898e);
    }

    private static Ue.I k(N.a aVar) throws GeneralSecurityException {
        if (N.a.f14891b.equals(aVar)) {
            return Ue.I.TINK;
        }
        if (N.a.f14892c.equals(aVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static N.a l(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f14899a[i10.ordinal()];
        if (i11 == 1) {
            return N.a.f14891b;
        }
        if (i11 == 2) {
            return N.a.f14892c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static M e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                Ue.E eC0 = Ue.E.c0(g10.g(), C11319o.b());
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
                return N.b(Ue.F.c0(h10.d().e0(), C11319o.b()).a0(), l(h10.d().c0()));
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
    public static com.google.crypto.tink.internal.G i(M m10, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", Ue.E.b0().x(Ue.F.b0().x(m10.a().c()).build()).build().g(), y.c.REMOTE, k(m10.a().d()), m10.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(N n10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.KmsAeadKey").z(Ue.F.b0().x(n10.c()).build().g()).x(k(n10.d())).build());
    }
}
