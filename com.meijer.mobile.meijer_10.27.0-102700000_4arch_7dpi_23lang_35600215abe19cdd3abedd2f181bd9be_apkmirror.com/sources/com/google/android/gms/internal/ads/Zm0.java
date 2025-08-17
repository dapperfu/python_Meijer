package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Zm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f72245a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.Wm0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            Vm0 vm0 = (Vm0) ck0;
            int i10 = Zm0.f72249e;
            return Wn0.b() ? Wn0.a(vm0) : Dt0.a(vm0);
        }
    }, Vm0.class, InterfaceC9418sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f72246b = C9747vo0.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", InterfaceC9418sk0.class, Xr0.SYMMETRIC, Us0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final Oo0 f72247c = new Oo0() { // from class: com.google.android.gms.internal.ads.Xm0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Mo0 f72248d = new Mo0() { // from class: com.google.android.gms.internal.ads.Ym0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            int i10 = Zm0.f72249e;
            return Vm0.a(((C7610bn0) qk0).b(), Ft0.c(32), num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f72249e = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C7931eo0.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = C7612bo0.f72874f;
        C7612bo0.e(Xo0.c());
        Uo0.a().e(f72245a);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", C7610bn0.c(C7503an0.f72492b));
        map.put("XCHACHA20_POLY1305_RAW", C7610bn0.c(C7503an0.f72494d));
        to0B.d(Collections.unmodifiableMap(map));
        No0.b().c(f72248d, C7610bn0.class);
        Po0.a().b(f72247c, C7610bn0.class);
        C8678lo0.c().d(f72246b, true);
    }
}
