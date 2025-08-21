package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Op0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mo0 f70022a = new Mo0() { // from class: com.google.android.gms.internal.ads.Lp0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            return Op0.b((Sp0) qk0, num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8698kp0 f70023b = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.Mp0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return Op0.c((Kp0) ck0);
        }
    }, Kp0.class, Tp0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC8698kp0 f70024c = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.Np0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return Op0.a((Kp0) ck0);
        }
    }, Kp0.class, Pk0.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Dk0 f70025d = C9872vo0.c("type.googleapis.com/google.crypto.tink.AesCmacKey", Pk0.class, Xr0.SYMMETRIC, Oq0.h0());

    public static void d(boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i10 = Bq0.f66445f;
        Bq0.e(Xo0.c());
        No0.b().c(f70022a, Sp0.class);
        Uo0.a().e(f70023b);
        Uo0.a().e(f70024c);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        Sp0 sp0 = C9983wq0.f80392c;
        map.put("AES_CMAC", sp0);
        map.put("AES256_CMAC", sp0);
        Pp0 pp0 = new Pp0(null);
        pp0.a(32);
        pp0.b(16);
        pp0.c(Qp0.f70502e);
        map.put("AES256_CMAC_RAW", pp0.d());
        to0B.d(Collections.unmodifiableMap(map));
        C8803lo0.c().d(f70025d, true);
    }

    public static /* synthetic */ Pk0 a(Kp0 kp0) throws GeneralSecurityException {
        e(kp0.b());
        return Bt0.a(kp0);
    }

    public static /* synthetic */ Kp0 b(Sp0 sp0, Integer num) throws GeneralSecurityException {
        e(sp0);
        Ip0 ip0 = new Ip0(null);
        ip0.c(sp0);
        ip0.a(Ft0.c(sp0.c()));
        ip0.b(num);
        return ip0.d();
    }

    public static /* synthetic */ Tp0 c(Kp0 kp0) throws GeneralSecurityException {
        e(kp0.b());
        return new Dq0(kp0);
    }

    private static void e(Sp0 sp0) throws GeneralSecurityException {
        if (sp0.c() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
