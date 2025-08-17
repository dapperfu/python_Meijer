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
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<M, InterfaceC3727a> f14875a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.F
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return H.c((M) jVar);
        }
    }, M.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f14876b = C11300i.e(d(), InterfaceC3727a.class, y.c.REMOTE, Ue.E.d0());

    /* renamed from: c, reason: collision with root package name */
    private static final p.a<N> f14877c = new p.a() { // from class: Je.G
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return H.e((N) xVar, num);
        }
    };

    static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        T.g();
        com.google.crypto.tink.internal.t.c().d(f14875a);
        com.google.crypto.tink.internal.p.f().b(f14877c, N.class);
        C11296e.d().g(f14876b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3727a c(M m10) throws GeneralSecurityException {
        return Ke.J.c(Ie.u.a(m10.a().c()).b(m10.a().c()), m10.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static M e(N n10, Integer num) throws GeneralSecurityException {
        return M.d(n10, num);
    }
}
