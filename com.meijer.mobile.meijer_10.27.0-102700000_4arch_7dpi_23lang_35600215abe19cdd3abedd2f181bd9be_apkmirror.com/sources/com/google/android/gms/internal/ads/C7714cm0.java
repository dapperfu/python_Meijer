package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7714cm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f73243a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.am0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            Zl0 zl0 = (Zl0) ck0;
            int i10 = C7714cm0.f73246d;
            return An0.d() ? An0.a(zl0) : C8048ft0.a(zl0);
        }
    }, Zl0.class, InterfaceC9418sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Mo0 f73244b = new Mo0() { // from class: com.google.android.gms.internal.ads.bm0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            int i10 = C7714cm0.f73246d;
            return Zl0.a(((C7927em0) qk0).b(), Ft0.c(32), num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Dk0 f73245c = C9747vo0.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", InterfaceC9418sk0.class, Xr0.SYMMETRIC, Hr0.g0());

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f73246d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C7931eo0.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = Fn0.f66858f;
        Fn0.e(Xo0.c());
        Uo0.a().e(f73243a);
        No0.b().c(f73244b, C7927em0.class);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", C7927em0.c(C7821dm0.f73475b));
        map.put("CHACHA20_POLY1305_RAW", C7927em0.c(C7821dm0.f73477d));
        to0B.d(Collections.unmodifiableMap(map));
        C8678lo0.c().d(f73245c, true);
    }
}
