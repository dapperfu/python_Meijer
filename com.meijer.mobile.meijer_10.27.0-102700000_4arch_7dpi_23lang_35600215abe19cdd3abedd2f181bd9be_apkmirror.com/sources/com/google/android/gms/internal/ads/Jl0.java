package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Jl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f67962a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.Fl0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            return C7834dt0.a((El0) ck0);
        }
    }, El0.class, InterfaceC9418sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f67963b = C9747vo0.c("type.googleapis.com/google.crypto.tink.AesGcmKey", InterfaceC9418sk0.class, Xr0.SYMMETRIC, C9753vr0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final Oo0 f67964c = new Oo0() { // from class: com.google.android.gms.internal.ads.Gl0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Mo0 f67965d = new Mo0() { // from class: com.google.android.gms.internal.ads.Il0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
            Nl0 nl0 = (Nl0) qk0;
            int i10 = Jl0.f67967f;
            if (nl0.b() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            Cl0 cl0 = new Cl0(null);
            cl0.c(nl0);
            cl0.a(num);
            cl0.b(Ft0.c(nl0.b()));
            return cl0.d();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f67966e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f67967f = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        int i10 = f67966e;
        if (!C7931eo0.a(i10)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = C9531tn0.f78626f;
        C9531tn0.e(Xo0.c());
        Uo0.a().e(f67962a);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("AES128_GCM", Om0.f69169a);
        Kl0 kl0 = new Kl0(null);
        kl0.a(12);
        kl0.b(16);
        kl0.c(16);
        Ll0 ll0 = Ll0.f68422d;
        kl0.d(ll0);
        map.put("AES128_GCM_RAW", kl0.e());
        map.put("AES256_GCM", Om0.f69170b);
        Kl0 kl02 = new Kl0(null);
        kl02.a(12);
        kl02.b(32);
        kl02.c(16);
        kl02.d(ll0);
        map.put("AES256_GCM_RAW", kl02.e());
        to0B.d(Collections.unmodifiableMap(map));
        Po0.a().b(f67964c, Nl0.class);
        No0.b().c(f67965d, Nl0.class);
        C8678lo0.c().f(f67963b, i10, true);
    }
}
