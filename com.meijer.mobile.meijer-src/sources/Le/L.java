package Le;

import Ke.InterfaceC3886a;
import Pe.b;
import We.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.internal.C11425i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18220a = C11425i.e(d(), InterfaceC3886a.class, y.c.SYMMETRIC, We.G.d0());

    /* renamed from: b, reason: collision with root package name */
    private static final p.a<V> f18221b = new p.a() { // from class: Le.J
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return L.e((V) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<U, InterfaceC3886a> f18222c = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.K
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return L.c((U) jVar);
        }
    }, U.class, InterfaceC3886a.class);

    static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        a0.h();
        com.google.crypto.tink.internal.p.f().b(f18221b, V.class);
        com.google.crypto.tink.internal.t.c().d(f18222c);
        C11421e.d().g(f18220a, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3886a c(U u10) throws GeneralSecurityException {
        String strD = u10.a().d();
        return Me.J.c(I.d(u10.a().c(), Ke.u.a(strD).b(strD)), u10.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static U e(V v10, Integer num) throws GeneralSecurityException {
        return U.d(v10, num);
    }
}
