package Je;

import Ie.InterfaceC3727a;
import Ne.b;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f14883a = C11300i.e(d(), InterfaceC3727a.class, y.c.SYMMETRIC, Ue.G.d0());

    /* renamed from: b, reason: collision with root package name */
    private static final p.a<V> f14884b = new p.a() { // from class: Je.J
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return L.e((V) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<U, InterfaceC3727a> f14885c = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.K
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return L.c((U) jVar);
        }
    }, U.class, InterfaceC3727a.class);

    static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        a0.h();
        com.google.crypto.tink.internal.p.f().b(f14884b, V.class);
        com.google.crypto.tink.internal.t.c().d(f14885c);
        C11296e.d().g(f14883a, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3727a c(U u10) throws GeneralSecurityException {
        String strD = u10.a().d();
        return Ke.J.c(I.d(u10.a().c(), Ie.u.a(strD).b(strD)), u10.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static U e(V v10, Integer num) throws GeneralSecurityException {
        return U.d(v10, num);
    }
}
