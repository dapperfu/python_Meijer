package Je;

import Ie.InterfaceC3727a;
import Je.C3805z;
import Ke.C3978u;
import Ne.b;
import Ue.C5297n;
import Ue.y;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11296e;
import com.google.crypto.tink.internal.C11300i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: Je.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3804y {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C3801v, InterfaceC3727a> f15071a = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.w
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Le.a.d((C3801v) jVar);
        }
    }, C3801v.class, InterfaceC3727a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final p.a<C3805z> f15072b = new p.a() { // from class: Je.x
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return C3804y.c((C3805z) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final q.a<C3805z> f15073c = new C3788h();

    /* renamed from: d, reason: collision with root package name */
    private static final Ie.k<InterfaceC3727a> f15074d = C11300i.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", InterfaceC3727a.class, y.c.SYMMETRIC, C5297n.d0());

    private static boolean b() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    private static Map<String, Ie.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        C3805z.b bVarB = C3805z.b().b(16);
        C3805z.c cVar = C3805z.c.f15079b;
        map.put("AES128_GCM_SIV", bVarB.c(cVar).a());
        C3805z.b bVarB2 = C3805z.b().b(16);
        C3805z.c cVar2 = C3805z.c.f15081d;
        map.put("AES128_GCM_SIV_RAW", bVarB2.c(cVar2).a());
        map.put("AES256_GCM_SIV", C3805z.b().b(32).c(cVar).a());
        map.put("AES256_GCM_SIV_RAW", C3805z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!b.EnumC0342b.f21529a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        C3978u.g();
        if (b()) {
            com.google.crypto.tink.internal.t.c().d(f15071a);
            com.google.crypto.tink.internal.s.b().d(d());
            com.google.crypto.tink.internal.q.b().a(f15073c, C3805z.class);
            com.google.crypto.tink.internal.p.f().b(f15072b, C3805z.class);
            C11296e.d().g(f15074d, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3801v c(C3805z c3805z, Integer num) throws GeneralSecurityException {
        return C3801v.d().e(c3805z).c(num).d(We.b.b(c3805z.c())).a();
    }
}
