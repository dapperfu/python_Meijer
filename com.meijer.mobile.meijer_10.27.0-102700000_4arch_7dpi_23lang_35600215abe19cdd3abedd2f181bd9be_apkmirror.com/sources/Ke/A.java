package Ke;

import Je.E;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16451a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<Je.E, com.google.crypto.tink.internal.H> f16452b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16453c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<Je.A, com.google.crypto.tink.internal.G> f16454d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16455e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16456a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16456a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16456a[Ue.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16456a[Ue.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16456a[Ue.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f16451a = aVarH;
        f16452b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.w
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return A.j((Je.E) xVar);
            }
        }, Je.E.class, com.google.crypto.tink.internal.H.class);
        f16453c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.x
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return A.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16454d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.y
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return A.i((Je.A) jVar, c10);
            }
        }, Je.A.class, com.google.crypto.tink.internal.G.class);
        f16455e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.z
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return A.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16452b);
        wVar.l(f16453c);
        wVar.k(f16454d);
        wVar.j(f16455e);
    }

    private static Ue.I k(E.a aVar) throws GeneralSecurityException {
        if (E.a.f14871b.equals(aVar)) {
            return Ue.I.TINK;
        }
        if (E.a.f14872c.equals(aVar)) {
            return Ue.I.CRUNCHY;
        }
        if (E.a.f14873d.equals(aVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static E.a l(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16456a[i10.ordinal()];
        if (i11 == 1) {
            return E.a.f14871b;
        }
        if (i11 == 2 || i11 == 3) {
            return E.a.f14872c;
        }
        if (i11 == 4) {
            return E.a.f14873d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Je.A e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                Ue.r rVarC0 = Ue.r.c0(g10.g(), C11319o.b());
                if (rVarC0.a0() == 0) {
                    return Je.A.d(l(g10.e()), We.b.a(rVarC0.Z().v(), Ie.C.b(c10)), g10.c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Je.E f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                Ue.s.Z(h10.d().e0(), C11319o.b());
                return Je.E.b(l(h10.d().c0()));
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
    public static com.google.crypto.tink.internal.G i(Je.A a10, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", Ue.r.b0().x(AbstractC11312h.k(a10.f().d(Ie.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(a10.a().c()), a10.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(Je.E e10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").z(Ue.s.Y().g()).x(k(e10.c())).build());
    }
}
