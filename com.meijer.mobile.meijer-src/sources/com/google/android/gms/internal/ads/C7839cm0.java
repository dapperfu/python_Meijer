package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7839cm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8698kp0 f74083a = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.am0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            Zl0 zl0 = (Zl0) ck0;
            int i10 = C7839cm0.f74086d;
            return An0.d() ? An0.a(zl0) : C8173ft0.a(zl0);
        }
    }, Zl0.class, InterfaceC9543sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Mo0 f74084b = new Mo0() { // from class: com.google.android.gms.internal.ads.bm0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            int i10 = C7839cm0.f74086d;
            return Zl0.a(((C8052em0) qk0).b(), Ft0.c(32), num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Dk0 f74085c = C9872vo0.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", InterfaceC9543sk0.class, Xr0.SYMMETRIC, Hr0.g0());

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f74086d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = Fn0.f67698f;
        Fn0.e(Xo0.c());
        Uo0.a().e(f74083a);
        No0.b().c(f74084b, C8052em0.class);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", C8052em0.c(C7946dm0.f74315b));
        map.put("CHACHA20_POLY1305_RAW", C8052em0.c(C7946dm0.f74317d));
        to0B.d(Collections.unmodifiableMap(map));
        C8803lo0.c().d(f74085c, true);
    }
}
