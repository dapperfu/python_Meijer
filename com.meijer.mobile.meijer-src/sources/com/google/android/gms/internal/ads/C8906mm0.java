package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8906mm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Dk0 f77721a = C9872vo0.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", InterfaceC9543sk0.class, Xr0.SYMMETRIC, As0.g0());

    /* renamed from: b, reason: collision with root package name */
    private static final Mo0 f77722b = new Mo0() { // from class: com.google.android.gms.internal.ads.km0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            return C9868vm0.a((Am0) qk0, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC8698kp0 f77723c = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.lm0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) throws GeneralSecurityException {
            C9868vm0 c9868vm0 = (C9868vm0) ck0;
            int i10 = C8906mm0.f77724d;
            String strD = c9868vm0.b().d();
            AbstractC7624al0 abstractC7624al0B = c9868vm0.b().b();
            InterfaceC9543sk0 interfaceC9543sk0Zzb = Ok0.a(strD).zzb();
            int i11 = C8585jm0.f76357e;
            try {
                return On0.b(new C8585jm0(C7957ds0.f0(Wk0.b(abstractC7624al0B), C9350qu0.a()), interfaceC9543sk0Zzb), c9868vm0.c());
            } catch (zzgyg e10) {
                throw new GeneralSecurityException(e10);
            }
        }
    }, C9868vm0.class, InterfaceC9543sk0.class);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f77724d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = Fm0.f67692f;
        Fm0.e(Xo0.c());
        No0.b().c(f77722b, Am0.class);
        Uo0.a().e(f77723c);
        C8803lo0.c().d(f77721a, true);
    }
}
