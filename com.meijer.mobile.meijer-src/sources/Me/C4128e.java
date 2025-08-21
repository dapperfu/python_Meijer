package Me;

import Le.C4030f;
import Le.C4035k;
import We.C5537d;
import We.C5538e;
import We.C5539f;
import We.C5540g;
import We.C5541h;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Me.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4128e {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19845a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4035k, com.google.crypto.tink.internal.H> f19846b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19847c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<C4030f, com.google.crypto.tink.internal.G> f19848d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19849e;

    /* renamed from: Me.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19850a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19851b;

        static {
            int[] iArr = new int[We.u.values().length];
            f19851b = iArr;
            try {
                iArr[We.u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19851b[We.u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19851b[We.u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19851b[We.u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19851b[We.u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[We.I.values().length];
            f19850a = iArr2;
            try {
                iArr2[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19850a[We.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19850a[We.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19850a[We.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f19845a = aVarH;
        f19846b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.a
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return C4128e.k((C4035k) xVar);
            }
        }, C4035k.class, com.google.crypto.tink.internal.H.class);
        f19847c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.b
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return C4128e.g((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19848d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.c
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return C4128e.j((C4030f) jVar, c10);
            }
        }, C4030f.class, com.google.crypto.tink.internal.G.class);
        f19849e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.d
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return C4128e.f((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void i(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19846b);
        wVar.l(f19847c);
        wVar.k(f19848d);
        wVar.j(f19849e);
    }

    private static C4035k.c l(We.u uVar) throws GeneralSecurityException {
        int i10 = a.f19851b[uVar.ordinal()];
        if (i10 == 1) {
            return C4035k.c.f18309b;
        }
        if (i10 == 2) {
            return C4035k.c.f18310c;
        }
        if (i10 == 3) {
            return C4035k.c.f18311d;
        }
        if (i10 == 4) {
            return C4035k.c.f18312e;
        }
        if (i10 == 5) {
            return C4035k.c.f18313f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.g());
    }

    private static We.u m(C4035k.c cVar) throws GeneralSecurityException {
        if (C4035k.c.f18309b.equals(cVar)) {
            return We.u.SHA1;
        }
        if (C4035k.c.f18310c.equals(cVar)) {
            return We.u.SHA224;
        }
        if (C4035k.c.f18311d.equals(cVar)) {
            return We.u.SHA256;
        }
        if (C4035k.c.f18312e.equals(cVar)) {
            return We.u.SHA384;
        }
        if (C4035k.c.f18313f.equals(cVar)) {
            return We.u.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    private static We.I n(C4035k.d dVar) throws GeneralSecurityException {
        if (C4035k.d.f18315b.equals(dVar)) {
            return We.I.TINK;
        }
        if (C4035k.d.f18316c.equals(dVar)) {
            return We.I.CRUNCHY;
        }
        if (C4035k.d.f18317d.equals(dVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    private static C4035k.d o(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19850a[i10.ordinal()];
        if (i11 == 1) {
            return C4035k.d.f18315b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4035k.d.f18316c;
        }
        if (i11 == 4) {
            return C4035k.d.f18317d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    private static We.x e(C4035k c4035k) throws GeneralSecurityException {
        return We.x.d0().y(c4035k.g()).x(m(c4035k.d())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4030f f(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C5537d c5537dE0 = C5537d.e0(g10.g(), C11444o.b());
                if (c5537dE0.c0() == 0) {
                    if (c5537dE0.a0().d0() == 0) {
                        if (c5537dE0.b0().d0() == 0) {
                            return C4030f.d().f(C4035k.b().b(c5537dE0.a0().b0().size()).d(c5537dE0.b0().b0().size()).e(c5537dE0.a0().c0().a0()).f(c5537dE0.b0().c0().c0()).c(l(c5537dE0.b0().c0().b0())).g(o(g10.e())).a()).c(Ye.b.a(c5537dE0.a0().b0().v(), Ke.C.b(c10))).d(Ye.b.a(c5537dE0.b0().b0().v(), Ke.C.b(c10))).e(g10.c()).a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4035k g(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C5538e c5538eD0 = C5538e.d0(h10.d().e0(), C11444o.b());
                if (c5538eD0.b0().d0() == 0) {
                    return C4035k.b().b(c5538eD0.a0().b0()).d(c5538eD0.b0().b0()).e(c5538eD0.a0().c0().a0()).f(c5538eD0.b0().c0().c0()).c(l(c5538eD0.b0().c0().b0())).g(o(h10.d().c0())).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void h() throws GeneralSecurityException {
        i(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G j(C4030f c4030f, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", C5537d.d0().x(C5539f.e0().y(C5541h.b0().x(c4030f.a().f()).build()).x(AbstractC11437h.k(c4030f.e().d(Ke.C.b(c10)))).build()).y(We.v.e0().y(e(c4030f.a())).x(AbstractC11437h.k(c4030f.f().d(Ke.C.b(c10)))).build()).build().g(), y.c.SYMMETRIC, n(c4030f.a().h()), c4030f.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H k(C4035k c4035k) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").z(C5538e.c0().x(C5540g.d0().y(C5541h.b0().x(c4035k.f()).build()).x(c4035k.c()).build()).y(We.w.e0().y(e(c4035k)).x(c4035k.e()).build()).build().g()).x(n(c4035k.h())).build());
    }
}
