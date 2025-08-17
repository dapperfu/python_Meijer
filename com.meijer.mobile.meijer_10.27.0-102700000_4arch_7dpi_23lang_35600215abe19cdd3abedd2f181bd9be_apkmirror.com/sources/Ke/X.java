package Ke;

import Je.q0;
import Je.u0;
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
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final We.a f16480a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<u0, com.google.crypto.tink.internal.H> f16481b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.y<com.google.crypto.tink.internal.H> f16482c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11298g<q0, com.google.crypto.tink.internal.G> f16483d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11297f<com.google.crypto.tink.internal.G> f16484e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16485a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16485a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16485a[Ue.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16485a[Ue.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16485a[Ue.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        We.a aVarH = com.google.crypto.tink.internal.M.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f16480a = aVarH;
        f16481b = com.google.crypto.tink.internal.z.a(new z.b() { // from class: Ke.T
            @Override // com.google.crypto.tink.internal.z.b
            public final com.google.crypto.tink.internal.K a(Ie.x xVar) {
                return X.j((u0) xVar);
            }
        }, u0.class, com.google.crypto.tink.internal.H.class);
        f16482c = com.google.crypto.tink.internal.y.a(new y.b() { // from class: Ke.U
            @Override // com.google.crypto.tink.internal.y.b
            public final Ie.x a(com.google.crypto.tink.internal.K k10) {
                return X.f((com.google.crypto.tink.internal.H) k10);
            }
        }, aVarH, com.google.crypto.tink.internal.H.class);
        f16483d = AbstractC11298g.a(new AbstractC11298g.b() { // from class: Ke.V
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final com.google.crypto.tink.internal.K a(Ie.j jVar, Ie.C c10) {
                return X.i((q0) jVar, c10);
            }
        }, q0.class, com.google.crypto.tink.internal.G.class);
        f16484e = AbstractC11297f.a(new AbstractC11297f.b() { // from class: Ke.W
            @Override // com.google.crypto.tink.internal.AbstractC11297f.b
            public final Ie.j a(com.google.crypto.tink.internal.K k10, Ie.C c10) {
                return X.e((com.google.crypto.tink.internal.G) k10, c10);
            }
        }, aVarH, com.google.crypto.tink.internal.G.class);
    }

    public static void h(com.google.crypto.tink.internal.w wVar) throws GeneralSecurityException {
        wVar.m(f16481b);
        wVar.l(f16482c);
        wVar.k(f16483d);
        wVar.j(f16484e);
    }

    private static Ue.I k(u0.a aVar) throws GeneralSecurityException {
        if (u0.a.f15060b.equals(aVar)) {
            return Ue.I.TINK;
        }
        if (u0.a.f15061c.equals(aVar)) {
            return Ue.I.CRUNCHY;
        }
        if (u0.a.f15062d.equals(aVar)) {
            return Ue.I.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static u0.a l(Ue.I i10) throws GeneralSecurityException {
        int i11 = a.f16485a[i10.ordinal()];
        if (i11 == 1) {
            return u0.a.f15060b;
        }
        if (i11 == 2 || i11 == 3) {
            return u0.a.f15061c;
        }
        if (i11 == 4) {
            return u0.a.f15062d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q0 e(com.google.crypto.tink.internal.G g10, Ie.C c10) throws GeneralSecurityException {
        if (g10.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                Ue.N nC0 = Ue.N.c0(g10.g(), C11319o.b());
                if (nC0.a0() == 0) {
                    return q0.d(l(g10.e()), We.b.a(nC0.Z().v(), Ie.C.b(c10)), g10.c());
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
                if (Ue.O.a0(h10.d().e0(), C11319o.b()).Z() == 0) {
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
    public static com.google.crypto.tink.internal.G i(q0 q0Var, Ie.C c10) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.G.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", Ue.N.b0().x(AbstractC11312h.k(q0Var.f().d(Ie.C.b(c10)))).build().g(), y.c.SYMMETRIC, k(q0Var.a().c()), q0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.H j(u0 u0Var) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.H.c(Ue.A.f0().y("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").z(Ue.O.Y().g()).x(k(u0Var.c())).build());
    }
}
