package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ml0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8779ml0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f76875a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.jl0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            return C8155gt0.a((C8352il0) ck0);
        }
    }, C8352il0.class, InterfaceC9418sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f76876b = C9747vo0.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", InterfaceC9418sk0.class, Xr0.SYMMETRIC, Xq0.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final Oo0 f76877c = new Oo0() { // from class: com.google.android.gms.internal.ads.kl0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Mo0 f76878d = new Mo0() { // from class: com.google.android.gms.internal.ads.ll0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
            C9313rl0 c9313rl0 = (C9313rl0) qk0;
            int i10 = C8779ml0.f76880f;
            if (c9313rl0.b() != 16 && c9313rl0.b() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            C8032fl0 c8032fl0 = new C8032fl0(null);
            c8032fl0.d(c9313rl0);
            c8032fl0.c(num);
            c8032fl0.a(Ft0.c(c9313rl0.b()));
            c8032fl0.b(Ft0.c(c9313rl0.c()));
            return c8032fl0.e();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f76879e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f76880f = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        int i10 = f76879e;
        if (!C7931eo0.a(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = C8143gn0.f74400f;
        C8143gn0.e(Xo0.c());
        Uo0.a().e(f76875a);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", Om0.f69173e);
        C8886nl0 c8886nl0 = new C8886nl0(null);
        c8886nl0.a(16);
        c8886nl0.c(32);
        c8886nl0.e(16);
        c8886nl0.d(16);
        C8993ol0 c8993ol0 = C8993ol0.f77421d;
        c8886nl0.b(c8993ol0);
        C9100pl0 c9100pl0 = C9100pl0.f77638d;
        c8886nl0.f(c9100pl0);
        map.put("AES128_CTR_HMAC_SHA256_RAW", c8886nl0.g());
        map.put("AES256_CTR_HMAC_SHA256", Om0.f69174f);
        C8886nl0 c8886nl02 = new C8886nl0(null);
        c8886nl02.a(32);
        c8886nl02.c(32);
        c8886nl02.e(32);
        c8886nl02.d(16);
        c8886nl02.b(c8993ol0);
        c8886nl02.f(c9100pl0);
        map.put("AES256_CTR_HMAC_SHA256_RAW", c8886nl02.g());
        to0B.d(Collections.unmodifiableMap(map));
        Po0.a().b(f76877c, C9313rl0.class);
        No0.b().c(f76878d, C9313rl0.class);
        C8678lo0.c().f(f76876b, i10, true);
    }
}
