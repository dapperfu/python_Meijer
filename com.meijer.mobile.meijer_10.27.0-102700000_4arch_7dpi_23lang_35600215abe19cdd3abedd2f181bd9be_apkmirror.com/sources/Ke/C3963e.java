package Ke;

import Je.C3786f;
import Je.C3791k;
import Ue.C5287d;
import Ue.C5288e;
import Ue.C5289f;
import Ue.C5290g;
import Ue.C5291h;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Ke.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3963e {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16486a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C3791k, com.google.crypto.tink.internal.H> f16487b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16488c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<C3786f, com.google.crypto.tink.internal.G> f16489d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16490e;

    /* renamed from: Ke.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16491a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16492b;

        static {
            int[] iArr = new int[Ue.u.values().length];
            f16492b = iArr;
            try {
                iArr[Ue.u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16492b[Ue.u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16492b[Ue.u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16492b[Ue.u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16492b[Ue.u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Ue.I.values().length];
            f16491a = iArr2;
            try {
                iArr2[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16491a[Ue.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16491a[Ue.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16491a[Ue.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f16486a = aVarH;
        f16487b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.a
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return C3963e.k((C3791k) xVar);
            }
        }, C3791k.class, com.google.crypto.tink.internal.H.class);
        f16488c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.b
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return C3963e.g((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16489d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.c
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return C3963e.j((C3786f) jVar, c10);
            }
        }, C3786f.class, com.google.crypto.tink.internal.G.class);
        f16490e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.d
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return C3963e.f((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void i(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16487b);
        wVar.l(f16488c);
        wVar.k(f16489d);
        wVar.j(f16490e);
    }

    private static C3791k.c l(Ue.u uVar) throws GeneralSecurityException {
        int i10 = a.f16492b[uVar.ordinal()];
        if (i10 == 1) {
            return C3791k.c.f14972b;
        }
        if (i10 == 2) {
            return C3791k.c.f14973c;
        }
        if (i10 == 3) {
            return C3791k.c.f14974d;
        }
        if (i10 == 4) {
            return C3791k.c.f14975e;
        }
        if (i10 == 5) {
            return C3791k.c.f14976f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.g());
    }

    private static Ue.u m(C3791k.c cVar) throws GeneralSecurityException {
        if (C3791k.c.f14972b.equals(cVar)) {
            return Ue.u.SHA1;
        }
        if (C3791k.c.f14973c.equals(cVar)) {
            return Ue.u.SHA224;
        }
        if (C3791k.c.f14974d.equals(cVar)) {
            return Ue.u.SHA256;
        }
        if (C3791k.c.f14975e.equals(cVar)) {
            return Ue.u.SHA384;
        }
        if (C3791k.c.f14976f.equals(cVar)) {
            return Ue.u.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    private static Ue.I n(C3791k.d dVar) throws GeneralSecurityException {
        if (C3791k.d.f14978b.equals(dVar)) {
            return Ue.I.TINK;
        }
        if (C3791k.d.f14979c.equals(dVar)) {
            return Ue.I.CRUNCHY;
        }
        if (C3791k.d.f14980d.equals(dVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    private static C3791k.d o(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16491a[i10.ordinal()];
        if (i11 == 1) {
            return C3791k.d.f14978b;
        }
        if (i11 == 2 || i11 == 3) {
            return C3791k.d.f14979c;
        }
        if (i11 == 4) {
            return C3791k.d.f14980d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    private static Ue.x e(C3791k c3791k) throws GeneralSecurityException {
        return Ue.x.d0().y(c3791k.g()).x(m(c3791k.d())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3786f f(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C5287d c5287dE0 = C5287d.e0(g10.g(), C11319o.b());
                if (c5287dE0.c0() == 0) {
                    if (c5287dE0.a0().d0() == 0) {
                        if (c5287dE0.b0().d0() == 0) {
                            return C3786f.d().f(C3791k.b().b(c5287dE0.a0().b0().size()).d(c5287dE0.b0().b0().size()).e(c5287dE0.a0().c0().a0()).f(c5287dE0.b0().c0().c0()).c(l(c5287dE0.b0().c0().b0())).g(o(g10.e())).a()).c(We.b.a(c5287dE0.a0().b0().v(), Ie.C.b(c10))).d(We.b.a(c5287dE0.b0().b0().v(), Ie.C.b(c10))).e(g10.c()).a();
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
    public static C3791k g(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C5288e c5288eD0 = C5288e.d0(h10.d().e0(), C11319o.b());
                if (c5288eD0.b0().d0() == 0) {
                    return C3791k.b().b(c5288eD0.a0().b0()).d(c5288eD0.b0().b0()).e(c5288eD0.a0().c0().a0()).f(c5288eD0.b0().c0().c0()).c(l(c5288eD0.b0().c0().b0())).g(o(h10.d().c0())).a();
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
    public static com.google.crypto.tink.internal.G j(C3786f c3786f, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", C5287d.d0().x(C5289f.e0().y(C5291h.b0().x(c3786f.a().f()).build()).x(AbstractC11312h.k(c3786f.e().d(Ie.C.b(c10)))).build()).y(Ue.v.e0().y(e(c3786f.a())).x(AbstractC11312h.k(c3786f.f().d(Ie.C.b(c10)))).build()).build().g(), y.c.SYMMETRIC, n(c3786f.a().h()), c3786f.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H k(C3791k c3791k) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").z(C5288e.c0().x(C5290g.d0().y(C5291h.b0().x(c3791k.f()).build()).x(c3791k.c()).build()).y(Ue.w.e0().y(e(c3791k)).x(c3791k.e()).build()).build().g()).x(n(c3791k.h())).build());
    }
}
