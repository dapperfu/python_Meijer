package Me;

import Le.C4041q;
import Le.C4044u;
import We.C5545l;
import We.C5546m;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Me.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4139p {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19859a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4044u, com.google.crypto.tink.internal.H> f19860b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19861c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<C4041q, com.google.crypto.tink.internal.G> f19862d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19863e;

    /* renamed from: Me.p$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19864a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19864a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19864a[We.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19864a[We.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19864a[We.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f19859a = aVarH;
        f19860b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.l
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return C4139p.j((C4044u) xVar);
            }
        }, C4044u.class, com.google.crypto.tink.internal.H.class);
        f19861c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.m
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return C4139p.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19862d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.n
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return C4139p.i((C4041q) jVar, c10);
            }
        }, C4041q.class, com.google.crypto.tink.internal.G.class);
        f19863e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.o
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return C4139p.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19860b);
        wVar.l(f19861c);
        wVar.k(f19862d);
        wVar.j(f19863e);
    }

    private static We.I k(C4044u.c cVar) throws GeneralSecurityException {
        if (C4044u.c.f18392b.equals(cVar)) {
            return We.I.TINK;
        }
        if (C4044u.c.f18393c.equals(cVar)) {
            return We.I.CRUNCHY;
        }
        if (C4044u.c.f18394d.equals(cVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C4044u.c l(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19864a[i10.ordinal()];
        if (i11 == 1) {
            return C4044u.c.f18392b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4044u.c.f18393c;
        }
        if (i11 == 4) {
            return C4044u.c.f18394d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4041q e(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C5545l c5545lC0 = C5545l.c0(g10.g(), C11444o.b());
                if (c5545lC0.a0() == 0) {
                    return C4041q.d().e(C4044u.b().c(c5545lC0.Z().size()).b(12).d(16).e(l(g10.e())).a()).d(Ye.b.a(c5545lC0.Z().v(), Ke.C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4044u f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C5546m c5546mC0 = C5546m.c0(h10.d().e0(), C11444o.b());
                if (c5546mC0.a0() == 0) {
                    return C4044u.b().c(c5546mC0.Z()).b(12).d(16).e(l(h10.d().c0())).a();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(C4041q c4041q, Ke.C c10) throws GeneralSecurityException {
        m(c4041q.a());
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesGcmKey", C5545l.b0().x(AbstractC11437h.k(c4041q.f().d(Ke.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(c4041q.a().f()), c4041q.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(C4044u c4044u) throws GeneralSecurityException {
        m(c4044u);
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.AesGcmKey").z(C5546m.b0().x(c4044u.d()).build().g()).x(k(c4044u.f())).build());
    }

    private static void m(C4044u c4044u) throws GeneralSecurityException {
        if (c4044u.e() == 16) {
            if (c4044u.c() == 12) {
                return;
            } else {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(c4044u.c())));
            }
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c4044u.e())));
    }
}
