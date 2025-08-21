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
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<M, InterfaceC3886a> f18212a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.F
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return H.c((M) jVar);
        }
    }, M.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18213b = C11425i.e(d(), InterfaceC3886a.class, y.c.REMOTE, We.E.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final p.a<N> f18214c = new p.a() { // from class: Le.G
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return H.e((N) xVar, num);
        }
    };

    static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        T.g();
        com.google.crypto.tink.internal.t.c().d(f18212a);
        com.google.crypto.tink.internal.p.f().b(f18214c, N.class);
        C11421e.d().g(f18213b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3886a c(M m10) throws GeneralSecurityException {
        return Me.J.c(Ke.u.a(m10.a().c()).b(m10.a().c()), m10.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static M e(N n10, Integer num) throws GeneralSecurityException {
        return M.d(n10, num);
    }
}
