package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9955xl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f79860a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.vl0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            return C7728ct0.a((C9634ul0) ck0);
        }
    }, C9634ul0.class, InterfaceC9418sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f79861b = C9747vo0.c("type.googleapis.com/google.crypto.tink.AesEaxKey", InterfaceC9418sk0.class, Xr0.SYMMETRIC, C8791mr0.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final Mo0 f79862c = new Mo0() { // from class: com.google.android.gms.internal.ads.wl0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
            Bl0 bl0 = (Bl0) qk0;
            int i10 = C9955xl0.f79863d;
            if (bl0.c() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            C9420sl0 c9420sl0 = new C9420sl0(null);
            c9420sl0.c(bl0);
            c9420sl0.a(num);
            c9420sl0.b(Ft0.c(bl0.c()));
            return c9420sl0.d();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f79863d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C7931eo0.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i10 = C8783mn0.f76890f;
        C8783mn0.e(Xo0.c());
        Uo0.a().e(f79860a);
        To0 to0B = To0.b();
        HashMap map = new HashMap();
        map.put("AES128_EAX", Om0.f69171c);
        C10062yl0 c10062yl0 = new C10062yl0(null);
        c10062yl0.a(16);
        c10062yl0.b(16);
        c10062yl0.c(16);
        C10169zl0 c10169zl0 = C10169zl0.f80469d;
        c10062yl0.d(c10169zl0);
        map.put("AES128_EAX_RAW", c10062yl0.e());
        map.put("AES256_EAX", Om0.f69172d);
        C10062yl0 c10062yl02 = new C10062yl0(null);
        c10062yl02.a(16);
        c10062yl02.b(32);
        c10062yl02.c(16);
        c10062yl02.d(c10169zl0);
        map.put("AES256_EAX_RAW", c10062yl02.e());
        to0B.d(Collections.unmodifiableMap(map));
        No0.b().c(f79862c, Bl0.class);
        C8678lo0.c().d(f79861b, true);
    }
}
