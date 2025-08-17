package Ke;

import Je.C3792l;
import Je.C3796p;
import Ue.C5292i;
import Ue.C5293j;
import Ue.C5294k;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Ke.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3968j {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16493a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C3796p, com.google.crypto.tink.internal.H> f16494b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16495c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<C3792l, com.google.crypto.tink.internal.G> f16496d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16497e;

    /* renamed from: Ke.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16498a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16498a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16498a[Ue.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16498a[Ue.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16498a[Ue.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f16493a = aVarH;
        f16494b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.f
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return C3968j.k((C3796p) xVar);
            }
        }, C3796p.class, com.google.crypto.tink.internal.H.class);
        f16495c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.g
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return C3968j.g((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16496d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.h
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return C3968j.j((C3792l) jVar, c10);
            }
        }, C3792l.class, com.google.crypto.tink.internal.G.class);
        f16497e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.i
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return C3968j.f((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void i(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16494b);
        wVar.l(f16495c);
        wVar.k(f16496d);
        wVar.j(f16497e);
    }

    private static Ue.I l(C3796p.c cVar) throws GeneralSecurityException {
        if (C3796p.c.f15018b.equals(cVar)) {
            return Ue.I.TINK;
        }
        if (C3796p.c.f15019c.equals(cVar)) {
            return Ue.I.CRUNCHY;
        }
        if (C3796p.c.f15020d.equals(cVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C3796p.c m(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16498a[i10.ordinal()];
        if (i11 == 1) {
            return C3796p.c.f15018b;
        }
        if (i11 == 2 || i11 == 3) {
            return C3796p.c.f15019c;
        }
        if (i11 == 4) {
            return C3796p.c.f15020d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    private static C5294k e(C3796p c3796p) throws GeneralSecurityException {
        if (c3796p.e() == 16) {
            return C5294k.b0().x(c3796p.c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c3796p.e())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3792l f(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C5292i c5292iE0 = C5292i.e0(g10.g(), C11319o.b());
                if (c5292iE0.c0() == 0) {
                    return C3792l.d().e(C3796p.b().c(c5292iE0.a0().size()).b(c5292iE0.b0().a0()).d(16).e(m(g10.e())).a()).d(We.b.a(c5292iE0.a0().v(), Ie.C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3796p g(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C5293j c5293jD0 = C5293j.d0(h10.d().e0(), C11319o.b());
                return C3796p.b().c(c5293jD0.a0()).b(c5293jD0.b0().a0()).d(16).e(m(h10.d().c0())).a();
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
    public static com.google.crypto.tink.internal.G j(C3792l c3792l, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesEaxKey", C5292i.d0().y(e(c3792l.a())).x(AbstractC11312h.k(c3792l.f().d(Ie.C.b(c10)))).build().g(), y.c.SYMMETRIC, l(c3792l.a().f()), c3792l.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H k(C3796p c3796p) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.AesEaxKey").z(C5293j.c0().y(e(c3796p)).x(c3796p.d()).build().g()).x(l(c3796p.f())).build());
    }
}
