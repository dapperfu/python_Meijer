package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8373hm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8698kp0 f75617a = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.fm0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            C9013nm0 c9013nm0 = (C9013nm0) ck0;
            int i10 = C8373hm0.f75620d;
            return On0.b(Ok0.a(c9013nm0.b().d()).zzb(), c9013nm0.c());
        }
    }, C9013nm0.class, InterfaceC9543sk0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Dk0 f75618b = C9872vo0.c("type.googleapis.com/google.crypto.tink.KmsAeadKey", InterfaceC9543sk0.class, Xr0.REMOTE, C9773us0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final Mo0 f75619c = new Mo0() { // from class: com.google.android.gms.internal.ads.gm0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            return C9013nm0.a((C9227pm0) qk0, num);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f75620d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = C9761um0.f79754f;
        C9761um0.e(Xo0.c());
        Uo0.a().e(f75617a);
        No0.b().c(f75619c, C9227pm0.class);
        C8803lo0.c().d(f75618b, true);
    }
}
