package Me;

import Le.C4036l;
import Le.C4040p;
import We.C5542i;
import We.C5543j;
import We.C5544k;
import We.y;
import com.google.crypto.tink.internal.AbstractC11422f;
import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Me.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4133j {

    /* renamed from: a, reason: collision with root package name */
    private static final Ye.a f19852a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4040p, com.google.crypto.tink.internal.H> f19853b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f19854c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11423g<C4036l, com.google.crypto.tink.internal.G> f19855d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11422f<com.google.crypto.tink.internal.G> f19856e;

    /* renamed from: Me.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19857a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19857a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19857a[We.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19857a[We.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19857a[We.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Ye.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f19852a = aVarH;
        f19853b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Me.f
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ke.x xVar) {
                return C4133j.k((C4040p) xVar);
            }
        }, C4040p.class, com.google.crypto.tink.internal.H.class);
        f19854c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Me.g
            @Override // com.google.crypto.tink.internal.y.b
            public final Ke.x a(com.google.crypto.tink.internal.K k10) {
                return C4133j.g((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f19855d = AbstractC11423g.a(new AbstractC11423g.b() { // from class: Me.h
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final com.google.crypto.tink.internal.K a(Ke.j jVar, Ke.C c10) {
                return C4133j.j((C4036l) jVar, c10);
            }
        }, C4036l.class, com.google.crypto.tink.internal.G.class);
        f19856e = AbstractC11422f.a(new AbstractC11422f.b() { // from class: Me.i
            @Override // com.google.crypto.tink.internal.AbstractC11422f.b
            public final Ke.j a(com.google.crypto.tink.internal.K k10, Ke.C c10) {
                return C4133j.f((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void i(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f19853b);
        wVar.l(f19854c);
        wVar.k(f19855d);
        wVar.j(f19856e);
    }

    private static We.I l(C4040p.c cVar) throws GeneralSecurityException {
        if (C4040p.c.f18355b.equals(cVar)) {
            return We.I.TINK;
        }
        if (C4040p.c.f18356c.equals(cVar)) {
            return We.I.CRUNCHY;
        }
        if (C4040p.c.f18357d.equals(cVar)) {
            return We.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C4040p.c m(We.I i10) throws GeneralSecurityException {
        int i11 = a.f19857a[i10.ordinal()];
        if (i11 == 1) {
            return C4040p.c.f18355b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4040p.c.f18356c;
        }
        if (i11 == 4) {
            return C4040p.c.f18357d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    private static C5544k e(C4040p c4040p) throws GeneralSecurityException {
        if (c4040p.e() == 16) {
            return C5544k.b0().x(c4040p.c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c4040p.e())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4036l f(com.google.crypto.tink.internal.G g10, Ke.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C5542i c5542iE0 = C5542i.e0(g10.g(), C11444o.b());
                if (c5542iE0.c0() == 0) {
                    return C4036l.d().e(C4040p.b().c(c5542iE0.a0().size()).b(c5542iE0.b0().a0()).d(16).e(m(g10.e())).a()).d(Ye.b.a(c5542iE0.a0().v(), Ke.C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4040p g(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C5543j c5543jD0 = C5543j.d0(h10.d().e0(), C11444o.b());
                return C4040p.b().c(c5543jD0.a0()).b(c5543jD0.b0().a0()).d(16).e(m(h10.d().c0())).a();
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void h() throws GeneralSecurityException {
        i(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G j(C4036l c4036l, Ke.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesEaxKey", C5542i.d0().y(e(c4036l.a())).x(AbstractC11437h.k(c4036l.f().d(Ke.C.b(c10)))).build().g(), y.c.SYMMETRIC, l(c4036l.a().f()), c4036l.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H k(C4040p c4040p) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(We.A.f0().y("type.googleapis.com/google.crypto.tink.AesEaxKey").z(C5543j.c0().y(e(c4040p)).x(c4040p.d()).build().g()).x(l(c4040p.f())).build());
    }
}
