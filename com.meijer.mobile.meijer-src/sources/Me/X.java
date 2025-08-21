package Me;

import Le.q0;
import Le.u0;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19839a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<u0, com.google.crypto.tink.internal.H> f19840b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19841c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<q0, com.google.crypto.tink.internal.G> f19842d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19843e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19844a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19844a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19844a[We.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19844a[We.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19844a[We.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f19839a = aVarH;
        f19840b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.T
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return X.j((u0) xVar);
            }
        }, u0.class, com.google.crypto.tink.internal.H.class);
        f19841c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.U
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return X.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19842d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.V
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return X.i((q0) jVar, c10);
            }
        }, q0.class, com.google.crypto.tink.internal.G.class);
        f19843e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.W
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return X.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19840b);
        wVar.l(f19841c);
        wVar.k(f19842d);
        wVar.j(f19843e);
    }

    private static We.I k(u0.a aVar) throws GeneralSecurityException {
        if (u0.a.f18397b.equals(aVar)) {
            return We.I.TINK;
        }
        if (u0.a.f18398c.equals(aVar)) {
            return We.I.CRUNCHY;
        }
        if (u0.a.f18399d.equals(aVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static u0.a l(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19844a[i10.ordinal()];
        if (i11 == 1) {
            return u0.a.f18397b;
        }
        if (i11 == 2 || i11 == 3) {
            return u0.a.f18398c;
        }
        if (i11 == 4) {
            return u0.a.f18399d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q0 e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                We.N nC0 = We.N.c0(g10.g(), C11444o.b());
                if (nC0.a0() == 0) {
                    return q0.d(l(g10.e()), Ye.b.a(nC0.Z().v(), Ke.C.b(c10)), g10.c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u0 f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (We.O.a0(h10.d().e0(), C11444o.b()).Z() == 0) {
                    return u0.b(l(h10.d().c0()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(q0 q0Var, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", We.N.b0().x(AbstractC11437h.k(q0Var.f().d(Ke.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(q0Var.a().c()), q0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(u0 u0Var) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").z(We.O.Y().g()).x(k(u0Var.c())).build());
    }
}
