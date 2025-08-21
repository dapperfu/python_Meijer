package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes6.dex */
public final class Ul0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8698kp0 f71533a = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.Rl0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return C7949do0.a((Ql0) ck0);
        }
    }, Ql0.class, InterfaceC9543sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Mo0 f71534b = new Mo0() { // from class: com.google.android.gms.internal.ads.Sl0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            Yl0 yl0 = (Yl0) qk0;
            Ol0 ol0 = new Ol0(null);
            ol0.c(yl0);
            ol0.a(num);
            ol0.b(Ft0.c(yl0.b()));
            return ol0.d();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Oo0 f71535c = new Oo0() { // from class: com.google.android.gms.internal.ads.Tl0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Dk0 f71536d = C9872vo0.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey", InterfaceC9543sk0.class, Xr0.SYMMETRIC, Br0.g0());

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = C10191yn0.f81119f;
        C10191yn0.e(Xo0.c());
        if (b()) {
            Uo0.a().e(f71533a);
            To0 to0B = To0.b();
            HashMap map = new HashMap();
            Vl0 vl0 = new Vl0(null);
            vl0.a(16);
            Wl0 wl0 = Wl0.f71996b;
            vl0.b(wl0);
            map.put("AES128_GCM_SIV", vl0.c());
            Vl0 vl02 = new Vl0(null);
            vl02.a(16);
            Wl0 wl02 = Wl0.f71998d;
            vl02.b(wl02);
            map.put("AES128_GCM_SIV_RAW", vl02.c());
            Vl0 vl03 = new Vl0(null);
            vl03.a(32);
            vl03.b(wl0);
            map.put("AES256_GCM_SIV", vl03.c());
            Vl0 vl04 = new Vl0(null);
            vl04.a(32);
            vl04.b(wl02);
            map.put("AES256_GCM_SIV_RAW", vl04.c());
            to0B.d(Collections.unmodifiableMap(map));
            Po0.a().b(f71535c, Yl0.class);
            No0.b().c(f71534b, Yl0.class);
            C8803lo0.c().d(f71536d, true);
        }
    }

    private static boolean b() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
