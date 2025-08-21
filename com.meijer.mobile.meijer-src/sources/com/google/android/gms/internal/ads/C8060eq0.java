package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.eq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8060eq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8698kp0 f74776a = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.aq0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return new Eq0((Zp0) ck0);
        }
    }, Zp0.class, Tp0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8698kp0 f74777b = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.bq0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return Bt0.b((Zp0) ck0);
        }
    }, Zp0.class, Pk0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final Dk0 f74778c = C9872vo0.c("type.googleapis.com/google.crypto.tink.HmacKey", Pk0.class, Xr0.SYMMETRIC, Pr0.i0());

    /* renamed from: d, reason: collision with root package name */
    private static final Oo0 f74779d = new Oo0() { // from class: com.google.android.gms.internal.ads.cq0
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Mo0 f74780e = new Mo0() { // from class: com.google.android.gms.internal.ads.dq0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            C8593jq0 c8593jq0 = (C8593jq0) qk0;
            Xp0 xp0 = new Xp0(null);
            xp0.c(c8593jq0);
            xp0.b(Ft0.c(c8593jq0.c()));
            xp0.a(num);
            return xp0.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final int f74781f = 2;

    public static void a(boolean z10) throws GeneralSecurityException {
        int i10 = f74781f;
        if (!C8056eo0.a(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = Jq0.f68821h;
        Jq0.e(Xo0.c());
        Uo0.a().e(f74776a);
        Uo0.a().e(f74777b);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", C9983wq0.f80390a);
        C8167fq0 c8167fq0 = new C8167fq0(null);
        c8167fq0.b(32);
        c8167fq0.c(16);
        C8381hq0 c8381hq0 = C8381hq0.f75632e;
        c8167fq0.d(c8381hq0);
        C8274gq0 c8274gq0 = C8274gq0.f75246d;
        c8167fq0.a(c8274gq0);
        map.put("HMAC_SHA256_128BITTAG_RAW", c8167fq0.e());
        C8167fq0 c8167fq02 = new C8167fq0(null);
        c8167fq02.b(32);
        c8167fq02.c(32);
        C8381hq0 c8381hq02 = C8381hq0.f75629b;
        c8167fq02.d(c8381hq02);
        c8167fq02.a(c8274gq0);
        map.put("HMAC_SHA256_256BITTAG", c8167fq02.e());
        C8167fq0 c8167fq03 = new C8167fq0(null);
        c8167fq03.b(32);
        c8167fq03.c(32);
        c8167fq03.d(c8381hq0);
        c8167fq03.a(c8274gq0);
        map.put("HMAC_SHA256_256BITTAG_RAW", c8167fq03.e());
        C8167fq0 c8167fq04 = new C8167fq0(null);
        c8167fq04.b(64);
        c8167fq04.c(16);
        c8167fq04.d(c8381hq02);
        C8274gq0 c8274gq02 = C8274gq0.f75248f;
        c8167fq04.a(c8274gq02);
        map.put("HMAC_SHA512_128BITTAG", c8167fq04.e());
        C8167fq0 c8167fq05 = new C8167fq0(null);
        c8167fq05.b(64);
        c8167fq05.c(16);
        c8167fq05.d(c8381hq0);
        c8167fq05.a(c8274gq02);
        map.put("HMAC_SHA512_128BITTAG_RAW", c8167fq05.e());
        C8167fq0 c8167fq06 = new C8167fq0(null);
        c8167fq06.b(64);
        c8167fq06.c(32);
        c8167fq06.d(c8381hq02);
        c8167fq06.a(c8274gq02);
        map.put("HMAC_SHA512_256BITTAG", c8167fq06.e());
        C8167fq0 c8167fq07 = new C8167fq0(null);
        c8167fq07.b(64);
        c8167fq07.c(32);
        c8167fq07.d(c8381hq0);
        c8167fq07.a(c8274gq02);
        map.put("HMAC_SHA512_256BITTAG_RAW", c8167fq07.e());
        map.put("HMAC_SHA512_512BITTAG", C9983wq0.f80391b);
        C8167fq0 c8167fq08 = new C8167fq0(null);
        c8167fq08.b(64);
        c8167fq08.c(64);
        c8167fq08.d(c8381hq0);
        c8167fq08.a(c8274gq02);
        map.put("HMAC_SHA512_512BITTAG_RAW", c8167fq08.e());
        to0B.d(Collections.unmodifiableMap(map));
        No0.b().c(f74780e, C8593jq0.class);
        Po0.a().b(f74779d, C8593jq0.class);
        C8803lo0.c().f(f74778c, i10, true);
    }
}
