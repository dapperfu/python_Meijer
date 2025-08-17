package Ke;

import Je.C3801v;
import Je.C3805z;
import Ue.C5297n;
import Ue.C5298o;
import Ue.y;
import com.google.crypto.tink.internal.AbstractC11297f;
import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.y;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: Ke.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3978u {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16506a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C3805z, com.google.crypto.tink.internal.H> f16507b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16508c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<C3801v, com.google.crypto.tink.internal.G> f16509d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16510e;

    /* renamed from: Ke.u$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16511a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16511a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16511a[Ue.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16511a[Ue.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16511a[Ue.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f16506a = aVarH;
        f16507b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.q
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return C3978u.j((C3805z) xVar);
            }
        }, C3805z.class, com.google.crypto.tink.internal.H.class);
        f16508c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.r
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return C3978u.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16509d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.s
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return C3978u.i((C3801v) jVar, c10);
            }
        }, C3801v.class, com.google.crypto.tink.internal.G.class);
        f16510e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.t
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return C3978u.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16507b);
        wVar.l(f16508c);
        wVar.k(f16509d);
        wVar.j(f16510e);
    }

    private static Ue.I k(C3805z.c cVar) throws GeneralSecurityException {
        if (C3805z.c.f15079b.equals(cVar)) {
            return Ue.I.TINK;
        }
        if (C3805z.c.f15080c.equals(cVar)) {
            return Ue.I.CRUNCHY;
        }
        if (C3805z.c.f15081d.equals(cVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C3805z.c l(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16511a[i10.ordinal()];
        if (i11 == 1) {
            return C3805z.c.f15079b;
        }
        if (i11 == 2 || i11 == 3) {
            return C3805z.c.f15080c;
        }
        if (i11 == 4) {
            return C3805z.c.f15081d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3801v e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                C5297n c5297nC0 = C5297n.c0(g10.g(), C11319o.b());
                if (c5297nC0.a0() == 0) {
                    return C3801v.d().e(C3805z.b().b(c5297nC0.Z().size()).c(l(g10.e())).a()).d(We.b.a(c5297nC0.Z().v(), Ie.C.b(c10))).c(g10.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3805z f(com.google.crypto.tink.internal.H h10) throws GeneralSecurityException {
        if (h10.d().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                C5298o c5298oC0 = C5298o.c0(h10.d().e0(), C11319o.b());
                if (c5298oC0.a0() == 0) {
                    return C3805z.b().b(c5298oC0.Z()).c(l(h10.d().c0())).a();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (InvalidProtocolBufferException e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + h10.d().d0());
    }

    public static void g() throws GeneralSecurityException {
        h(com.google.crypto.tink.internal.w.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.G i(C3801v c3801v, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", C5297n.b0().x(AbstractC11312h.k(c3801v.f().d(Ie.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(c3801v.a().d()), c3801v.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(C3805z c3805z) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.AesGcmSivKey").z(C5298o.b0().x(c3805z.c()).build().g()).x(k(c3805z.d())).build());
    }
}
