package Ke;

import Je.C3797q;
import Je.C3800u;
import Ue.C5295l;
import Ue.C5296m;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Ke.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3974p {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16500a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C3800u, com.google.crypto.tink.internal.H> f16501b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16502c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<C3797q, com.google.crypto.tink.internal.G> f16503d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16504e;

    /* renamed from: Ke.p$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16505a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16505a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16505a[Ue.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16505a[Ue.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16505a[Ue.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f16500a = aVarH;
        f16501b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.l
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return C3974p.j((C3800u) xVar);
            }
        }, C3800u.class, com.google.crypto.tink.internal.H.class);
        f16502c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.m
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return C3974p.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16503d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.n
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return C3974p.i((C3797q) jVar, c10);
            }
        }, C3797q.class, com.google.crypto.tink.internal.G.class);
        f16504e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.o
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return C3974p.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16501b);
        wVar.l(f16502c);
        wVar.k(f16503d);
        wVar.j(f16504e);
    }

    private static Ue.I k(C3800u.c cVar) throws GeneralSecurityException {
        if (C3800u.c.f15055b.equals(cVar)) {
            return Ue.I.TINK;
        }
        if (C3800u.c.f15056c.equals(cVar)) {
            return Ue.I.CRUNCHY;
        }
        if (C3800u.c.f15057d.equals(cVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C3800u.c l(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16505a[i10.ordinal()];
        if (i11 == 1) {
            return C3800u.c.f15055b;
        }
        if (i11 == 2 || i11 == 3) {
            return C3800u.c.f15056c;
        }
        if (i11 == 4) {
            return C3800u.c.f15057d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3797q e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C5295l c5295lC0 = C5295l.c0(g10.g(), C11319o.b());
                if (c5295lC0.a0() == 0) {
                    return C3797q.d().e(C3800u.b().c(c5295lC0.Z().size()).b(12).d(16).e(l(g10.e())).a()).d(We.b.a(c5295lC0.Z().v(), Ie.C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3800u f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C5296m c5296mC0 = C5296m.c0(h10.d().e0(), C11319o.b());
                if (c5296mC0.a0() == 0) {
                    return C3800u.b().c(c5296mC0.Z()).b(12).d(16).e(l(h10.d().c0())).a();
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
    public static com.google.crypto.tink.internal.G i(C3797q c3797q, Ie.C c10) throws GeneralSecurityException {
        m(c3797q.a());
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesGcmKey", C5295l.b0().x(AbstractC11312h.k(c3797q.f().d(Ie.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(c3797q.a().f()), c3797q.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(C3800u c3800u) throws GeneralSecurityException {
        m(c3800u);
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.AesGcmKey").z(C5296m.b0().x(c3800u.d()).build().g()).x(k(c3800u.f())).build());
    }

    private static void m(C3800u c3800u) throws GeneralSecurityException {
        if (c3800u.e() == 16) {
            if (c3800u.c() == 12) {
                return;
            } else {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(c3800u.c())));
            }
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c3800u.e())));
    }
}
