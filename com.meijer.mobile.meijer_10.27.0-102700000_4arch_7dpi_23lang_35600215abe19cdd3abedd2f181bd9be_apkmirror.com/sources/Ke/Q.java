package Ke;

import Je.l0;
import Je.p0;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16471a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<p0, com.google.crypto.tink.internal.H> f16472b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16473c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<l0, com.google.crypto.tink.internal.G> f16474d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16475e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16476a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16476a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16476a[Ue.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f16471a = aVarH;
        f16472b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.M
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return Q.j((p0) xVar);
            }
        }, p0.class, com.google.crypto.tink.internal.H.class);
        f16473c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.N
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return Q.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16474d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.O
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return Q.i((l0) jVar, c10);
            }
        }, l0.class, com.google.crypto.tink.internal.G.class);
        f16475e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.P
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return Q.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16472b);
        wVar.l(f16473c);
        wVar.k(f16474d);
        wVar.j(f16475e);
    }

    private static Ue.I k(p0.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, p0.a.f15024b)) {
            return Ue.I.TINK;
        }
        if (Objects.equals(aVar, p0.a.f15025c)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static p0.a l(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16476a[i10.ordinal()];
        if (i11 == 1) {
            return p0.a.f15024b;
        }
        if (i11 == 2) {
            return p0.a.f15025c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l0 e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                Ue.K kE0 = Ue.K.e0(g10.g(), C11319o.b());
                if (kE0.c0() == 0) {
                    if (kE0.a0().size() == 32) {
                        return l0.d(p0.b(l(g10.e()), kE0.b0().a0()), We.b.a(kE0.a0().v(), Ie.C.b(c10)), g10.c());
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p0 f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                Ue.L lC0 = Ue.L.c0(h10.d().e0(), C11319o.b());
                if (lC0.a0() == 0) {
                    return p0.b(l(h10.d().c0()), lC0.Z().a0());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(l0 l0Var, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", Ue.K.d0().x(AbstractC11312h.k(l0Var.f().d(Ie.C.b(c10)))).y(Ue.M.b0().x(l0Var.a().c()).build()).build().g(), y.c.SYMMETRIC, k(l0Var.a().d()), l0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(p0 p0Var) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.XAesGcmKey").z(Ue.L.b0().x(Ue.M.b0().x(p0Var.c()).build()).build().g()).x(k(p0Var.d())).build());
    }
}
