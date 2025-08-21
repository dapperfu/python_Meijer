package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10080xl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8698kp0 f80700a = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.vl0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return C7853ct0.a((C9759ul0) ck0);
        }
    }, C9759ul0.class, InterfaceC9543sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f80701b = C9872vo0.c("type.googleapis.com/google.crypto.tink.AesEaxKey", InterfaceC9543sk0.class, Xr0.SYMMETRIC, C8916mr0.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final Mo0 f80702c = new Mo0() { // from class: com.google.android.gms.internal.ads.wl0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
            Bl0 bl0 = (Bl0) qk0;
            int i10 = C10080xl0.f80703d;
            if (bl0.c() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            C9545sl0 c9545sl0 = new C9545sl0(null);
            c9545sl0.c(bl0);
            c9545sl0.a(num);
            c9545sl0.b(Ft0.c(bl0.c()));
            return c9545sl0.d();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f80703d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i10 = C8908mn0.f77730f;
        C8908mn0.e(Xo0.c());
        Uo0.a().e(f80700a);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("AES128_EAX", Om0.f70011c);
        C10187yl0 c10187yl0 = new C10187yl0(null);
        c10187yl0.a(16);
        c10187yl0.b(16);
        c10187yl0.c(16);
        C10294zl0 c10294zl0 = C10294zl0.f81309d;
        c10187yl0.d(c10294zl0);
        map.put("AES128_EAX_RAW", c10187yl0.e());
        map.put("AES256_EAX", Om0.f70012d);
        C10187yl0 c10187yl02 = new C10187yl0(null);
        c10187yl02.a(16);
        c10187yl02.b(32);
        c10187yl02.c(16);
        c10187yl02.d(c10294zl0);
        map.put("AES256_EAX_RAW", c10187yl02.e());
        to0B.d(Collections.unmodifiableMap(map));
        No0.b().c(f80702c, Bl0.class);
        C8803lo0.c().d(f80701b, true);
    }
}
