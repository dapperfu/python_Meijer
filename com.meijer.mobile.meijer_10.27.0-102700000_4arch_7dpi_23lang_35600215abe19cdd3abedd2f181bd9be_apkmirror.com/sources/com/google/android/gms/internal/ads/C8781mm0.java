package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8781mm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Dk0 f76881a = C9747vo0.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", InterfaceC9418sk0.class, Xr0.SYMMETRIC, As0.g0());

    /* renamed from: b, reason: collision with root package name */
    private static final Mo0 f76882b = new Mo0() { // from class: com.google.android.gms.internal.ads.km0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) {
            return C9743vm0.a((Am0) qk0, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC8573kp0 f76883c = AbstractC8573kp0.b(new InterfaceC8360ip0() { // from class: com.google.android.gms.internal.ads.lm0
        @Override // com.google.android.gms.internal.ads.InterfaceC8360ip0
        public final Object a(Ck0 ck0) throws GeneralSecurityException {
            C9743vm0 c9743vm0 = (C9743vm0) ck0;
            int i10 = C8781mm0.f76884d;
            String strD = c9743vm0.b().d();
            AbstractC7499al0 abstractC7499al0B = c9743vm0.b().b();
            InterfaceC9418sk0 interfaceC9418sk0Zzb = Ok0.a(strD).zzb();
            int i11 = C8460jm0.f75517e;
            try {
                return On0.b(new C8460jm0(C7832ds0.f0(Wk0.b(abstractC7499al0B), C9225qu0.a()), interfaceC9418sk0Zzb), c9743vm0.c());
            } catch (zzgyg e10) {
                throw new GeneralSecurityException(e10);
            }
        }
    }, C9743vm0.class, InterfaceC9418sk0.class);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f76884d = 0;

    public static void a(boolean z10) throws GeneralSecurityException {
        if (!C7931eo0.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = Fm0.f66852f;
        Fm0.e(Xo0.c());
        No0.b().c(f76882b, Am0.class);
        Uo0.a().e(f76883c);
        C8678lo0.c().d(f76881a, true);
    }
}
