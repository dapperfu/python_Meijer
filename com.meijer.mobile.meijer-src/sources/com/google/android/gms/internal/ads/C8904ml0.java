package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ml0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8904ml0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8698kp0 f77715a = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.jl0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return C8280gt0.a((C8477il0) ck0);
        }
    }, C8477il0.class, InterfaceC9543sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f77716b = C9872vo0.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", InterfaceC9543sk0.class, Xr0.SYMMETRIC, Xq0.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final Oo0 f77717c = new Oo0() { // from class: com.google.android.gms.internal.ads.kl0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Mo0 f77718d = new Mo0() { // from class: com.google.android.gms.internal.ads.ll0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
            C9438rl0 c9438rl0 = (C9438rl0) qk0;
            int i10 = C8904ml0.f77720f;
            if (c9438rl0.b() != 16 && c9438rl0.b() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            C8157fl0 c8157fl0 = new C8157fl0(null);
            c8157fl0.d(c9438rl0);
            c8157fl0.c(num);
            c8157fl0.a(Ft0.c(c9438rl0.b()));
            c8157fl0.b(Ft0.c(c9438rl0.c()));
            return c8157fl0.e();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f77719e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f77720f = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        int i10 = f77719e;
        if (!C8056eo0.a(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = C8268gn0.f75240f;
        C8268gn0.e(Xo0.c());
        Uo0.a().e(f77715a);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", Om0.f70013e);
        C9011nl0 c9011nl0 = new C9011nl0(null);
        c9011nl0.a(16);
        c9011nl0.c(32);
        c9011nl0.e(16);
        c9011nl0.d(16);
        C9118ol0 c9118ol0 = C9118ol0.f78261d;
        c9011nl0.b(c9118ol0);
        C9225pl0 c9225pl0 = C9225pl0.f78478d;
        c9011nl0.f(c9225pl0);
        map.put("AES128_CTR_HMAC_SHA256_RAW", c9011nl0.g());
        map.put("AES256_CTR_HMAC_SHA256", Om0.f70014f);
        C9011nl0 c9011nl02 = new C9011nl0(null);
        c9011nl02.a(32);
        c9011nl02.c(32);
        c9011nl02.e(32);
        c9011nl02.d(16);
        c9011nl02.b(c9118ol0);
        c9011nl02.f(c9225pl0);
        map.put("AES256_CTR_HMAC_SHA256_RAW", c9011nl02.g());
        to0B.d(Collections.unmodifiableMap(map));
        Po0.a().b(f77717c, C9438rl0.class);
        No0.b().c(f77718d, C9438rl0.class);
        C8803lo0.c().f(f77716b, i10, true);
    }
}
