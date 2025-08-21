package Me;

import Le.E;
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
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19810a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<Le.E, com.google.crypto.tink.internal.H> f19811b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19812c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<Le.A, com.google.crypto.tink.internal.G> f19813d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19814e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19815a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19815a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19815a[We.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19815a[We.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19815a[We.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f19810a = aVarH;
        f19811b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.w
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return A.j((Le.E) xVar);
            }
        }, Le.E.class, com.google.crypto.tink.internal.H.class);
        f19812c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.x
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return A.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19813d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.y
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return A.i((Le.A) jVar, c10);
            }
        }, Le.A.class, com.google.crypto.tink.internal.G.class);
        f19814e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.z
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return A.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19811b);
        wVar.l(f19812c);
        wVar.k(f19813d);
        wVar.j(f19814e);
    }

    private static We.I k(E.a aVar) throws GeneralSecurityException {
        if (E.a.f18208b.equals(aVar)) {
            return We.I.TINK;
        }
        if (E.a.f18209c.equals(aVar)) {
            return We.I.CRUNCHY;
        }
        if (E.a.f18210d.equals(aVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static E.a l(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19815a[i10.ordinal()];
        if (i11 == 1) {
            return E.a.f18208b;
        }
        if (i11 == 2 || i11 == 3) {
            return E.a.f18209c;
        }
        if (i11 == 4) {
            return E.a.f18210d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Le.A e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                We.r rVarC0 = We.r.c0(g10.g(), C11444o.b());
                if (rVarC0.a0() == 0) {
                    return Le.A.d(l(g10.e()), Ye.b.a(rVarC0.Z().v(), Ke.C.b(c10)), g10.c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Le.E f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                We.s.Z(h10.d().e0(), C11444o.b());
                return Le.E.b(l(h10.d().c0()));
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(Le.A a10, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", We.r.b0().x(AbstractC11437h.k(a10.f().d(Ke.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(a10.a().c()), a10.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(Le.E e10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").z(We.s.Y().g()).x(k(e10.c())).build());
    }
}
