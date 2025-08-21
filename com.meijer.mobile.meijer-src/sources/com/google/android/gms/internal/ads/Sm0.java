package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Sm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mo0 f70999a = new Mo0() { // from class: com.google.android.gms.internal.ads.Qm0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            return Pm0.a((Um0) qk0, Ft0.c(32), num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8698kp0 f71000b = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.Rm0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return Qn0.a((Pm0) ck0);
        }
    }, Pm0.class, InterfaceC9543sk0.class);

    public static void a(boolean z10) throws GeneralSecurityException {
        int i10 = Vn0.f71767f;
        Vn0.e(Xo0.c());
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", Om0.f70015g);
        to0B.d(Collections.unmodifiableMap(map));
        Uo0.a().e(f71000b);
        No0.b().c(f70999a, Um0.class);
    }
}
