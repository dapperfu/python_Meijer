package Me;

import Le.l0;
import Le.p0;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19830a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<p0, com.google.crypto.tink.internal.H> f19831b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19832c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<l0, com.google.crypto.tink.internal.G> f19833d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19834e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19835a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19835a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19835a[We.I.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f19830a = aVarH;
        f19831b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.M
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return Q.j((p0) xVar);
            }
        }, p0.class, com.google.crypto.tink.internal.H.class);
        f19832c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.N
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return Q.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19833d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.O
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return Q.i((l0) jVar, c10);
            }
        }, l0.class, com.google.crypto.tink.internal.G.class);
        f19834e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.P
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return Q.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19831b);
        wVar.l(f19832c);
        wVar.k(f19833d);
        wVar.j(f19834e);
    }

    private static We.I k(p0.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, p0.a.f18361b)) {
            return We.I.TINK;
        }
        if (Objects.equals(aVar, p0.a.f18362c)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static p0.a l(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19835a[i10.ordinal()];
        if (i11 == 1) {
            return p0.a.f18361b;
        }
        if (i11 == 2) {
            return p0.a.f18362c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l0 e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                We.K kE0 = We.K.e0(g10.g(), C11444o.b());
                if (kE0.c0() == 0) {
                    if (kE0.a0().size() == 32) {
                        return l0.d(p0.b(l(g10.e()), kE0.b0().a0()), Ye.b.a(kE0.a0().v(), Ke.C.b(c10)), g10.c());
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
                We.L lC0 = We.L.c0(h10.d().e0(), C11444o.b());
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
    public static com.google.crypto.tink.internal.G i(l0 l0Var, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", We.K.d0().x(AbstractC11437h.k(l0Var.f().d(Ke.C.b(c10)))).y(We.M.b0().x(l0Var.a().c()).build()).build().g(), y.c.SYMMETRIC, k(l0Var.a().d()), l0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(p0 p0Var) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.XAesGcmKey").z(We.L.b0().x(We.M.b0().x(p0Var.c()).build()).build().g()).x(k(p0Var.d())).build());
    }
}
