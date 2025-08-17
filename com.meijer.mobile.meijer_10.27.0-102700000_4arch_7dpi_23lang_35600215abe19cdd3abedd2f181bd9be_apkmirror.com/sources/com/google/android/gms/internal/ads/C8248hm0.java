package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8248hm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8573kp0 f74777a = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.fm0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) {
            C8888nm0 c8888nm0 = (C8888nm0) ck0;
            int i10 = C8248hm0.f74780d;
            return On0.b(Ok0.a(c8888nm0.b().d()).zzb(), c8888nm0.c());
        }
    }, C8888nm0.class, InterfaceC9418sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f74778b = C9747vo0.c("type.googleapis.com/google.crypto.tink.KmsAeadKey", InterfaceC9418sk0.class, Xr0.REMOTE, C9648us0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final Mo0 f74779c = new Mo0() { // from class: com.google.android.gms.internal.ads.gm0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            return C8888nm0.a((C9102pm0) qk0, num);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f74780d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C7931eo0.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = C9636um0.f78914f;
        C9636um0.e(Xo0.c());
        Uo0.a().e(f74777a);
        No0.b().c(f74779c, C9102pm0.class);
        C8678lo0.c().d(f74778b, true);
    }
}
