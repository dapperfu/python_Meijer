package Le;

import Ke.InterfaceC3886a;
import Le.C4049z;
import Me.C4143u;
import Pe.b;
import We.C5547n;
import We.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.internal.C11425i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: Le.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4048y {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4045v, InterfaceC3886a> f18408a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.w
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Ne.a.d((C4045v) jVar);
        }
    }, C4045v.class, InterfaceC3886a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final p.a<C4049z> f18409b = new p.a() { // from class: Le.x
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return C4048y.c((C4049z) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<C4049z> f18410c = new C4032h();

    /* renamed from: d, reason: collision with root package name */
    private static final Ke.k<InterfaceC3886a> f18411d = C11425i.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", InterfaceC3886a.class, y.c.SYMMETRIC, C5547n.d0());

    private static boolean b() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    private static Map<String, Ke.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        C4049z.b bVarB = C4049z.b().b(16);
        C4049z.c cVar = C4049z.c.f18416b;
        map.put("AES128_GCM_SIV", bVarB.c(cVar).a());
        C4049z.b bVarB2 = C4049z.b().b(16);
        C4049z.c cVar2 = C4049z.c.f18418d;
        map.put("AES128_GCM_SIV_RAW", bVarB2.c(cVar2).a());
        map.put("AES256_GCM_SIV", C4049z.b().b(32).c(cVar).a());
        map.put("AES256_GCM_SIV_RAW", C4049z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0429b.f25764a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        C4143u.g();
        if (b()) {
            com.google.crypto.tink.internal.t.c().d(f18408a);
            com.google.crypto.tink.internal.s.b().d(d());
            com.google.crypto.tink.internal.q.b().a(f18410c, C4049z.class);
            com.google.crypto.tink.internal.p.f().b(f18409b, C4049z.class);
            C11421e.d().g(f18411d, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4045v c(C4049z c4049z, Integer num) throws GeneralSecurityException {
        return C4045v.d().e(c4049z).c(num).d(Ye.b.b(c4049z.c())).a();
    }
}
