package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.eq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7935eq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f73936a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.aq0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            return new Eq0((Zp0) ck0);
        }
    }, Zp0.class, Tp0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8573kp0 f73937b = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.bq0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            return Bt0.b((Zp0) ck0);
        }
    }, Zp0.class, Pk0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final Dk0 f73938c = C9747vo0.c("type.googleapis.com/google.crypto.tink.HmacKey", Pk0.class, Xr0.SYMMETRIC, Pr0.i0());

    /* renamed from: d, reason: collision with root package name */
    private static final Oo0 f73939d = new Oo0() { // from class: com.google.android.gms.internal.ads.cq0
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Mo0 f73940e = new Mo0() { // from class: com.google.android.gms.internal.ads.dq0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            C8468jq0 c8468jq0 = (C8468jq0) qk0;
            Xp0 xp0 = new Xp0(null);
            xp0.c(c8468jq0);
            xp0.b(Ft0.c(c8468jq0.c()));
            xp0.a(num);
            return xp0.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final int f73941f = 2;

    public static void a(boolean z10) throws GeneralSecurityException {
        int i10 = f73941f;
        if (!C7931eo0.a(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = Jq0.f67981h;
        Jq0.e(Xo0.c());
        Uo0.a().e(f73936a);
        Uo0.a().e(f73937b);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", C9858wq0.f79550a);
        C8042fq0 c8042fq0 = new C8042fq0(null);
        c8042fq0.b(32);
        c8042fq0.c(16);
        C8256hq0 c8256hq0 = C8256hq0.f74792e;
        c8042fq0.d(c8256hq0);
        C8149gq0 c8149gq0 = C8149gq0.f74406d;
        c8042fq0.a(c8149gq0);
        map.put("HMAC_SHA256_128BITTAG_RAW", c8042fq0.e());
        C8042fq0 c8042fq02 = new C8042fq0(null);
        c8042fq02.b(32);
        c8042fq02.c(32);
        C8256hq0 c8256hq02 = C8256hq0.f74789b;
        c8042fq02.d(c8256hq02);
        c8042fq02.a(c8149gq0);
        map.put("HMAC_SHA256_256BITTAG", c8042fq02.e());
        C8042fq0 c8042fq03 = new C8042fq0(null);
        c8042fq03.b(32);
        c8042fq03.c(32);
        c8042fq03.d(c8256hq0);
        c8042fq03.a(c8149gq0);
        map.put("HMAC_SHA256_256BITTAG_RAW", c8042fq03.e());
        C8042fq0 c8042fq04 = new C8042fq0(null);
        c8042fq04.b(64);
        c8042fq04.c(16);
        c8042fq04.d(c8256hq02);
        C8149gq0 c8149gq02 = C8149gq0.f74408f;
        c8042fq04.a(c8149gq02);
        map.put("HMAC_SHA512_128BITTAG", c8042fq04.e());
        C8042fq0 c8042fq05 = new C8042fq0(null);
        c8042fq05.b(64);
        c8042fq05.c(16);
        c8042fq05.d(c8256hq0);
        c8042fq05.a(c8149gq02);
        map.put("HMAC_SHA512_128BITTAG_RAW", c8042fq05.e());
        C8042fq0 c8042fq06 = new C8042fq0(null);
        c8042fq06.b(64);
        c8042fq06.c(32);
        c8042fq06.d(c8256hq02);
        c8042fq06.a(c8149gq02);
        map.put("HMAC_SHA512_256BITTAG", c8042fq06.e());
        C8042fq0 c8042fq07 = new C8042fq0(null);
        c8042fq07.b(64);
        c8042fq07.c(32);
        c8042fq07.d(c8256hq0);
        c8042fq07.a(c8149gq02);
        map.put("HMAC_SHA512_256BITTAG_RAW", c8042fq07.e());
        map.put("HMAC_SHA512_512BITTAG", C9858wq0.f79551b);
        C8042fq0 c8042fq08 = new C8042fq0(null);
        c8042fq08.b(64);
        c8042fq08.c(64);
        c8042fq08.d(c8256hq0);
        c8042fq08.a(c8149gq02);
        map.put("HMAC_SHA512_512BITTAG_RAW", c8042fq08.e());
        to0B.d(Collections.unmodifiableMap(map));
        No0.b().c(f73940e, C8468jq0.class);
        Po0.a().b(f73939d, C8468jq0.class);
        C8678lo0.c().f(f73938c, i10, true);
    }
}
