package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class Ma {

    /* renamed from: a, reason: collision with root package name */
    private static final C10745bf f83610a;

    /* renamed from: b, reason: collision with root package name */
    private static final C10936na f83611b;

    /* renamed from: c, reason: collision with root package name */
    private static final C10888ka f83612c;

    /* renamed from: d, reason: collision with root package name */
    private static final U9 f83613d;

    /* renamed from: e, reason: collision with root package name */
    private static final R9 f83614e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f83615f = 0;

    static {
        C10745bf c10745bfA = Ba.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f83610a = c10745bfA;
        f83611b = C10936na.c(Ia.f83515a, Ha.class, C10999ra.class);
        f83612c = C10888ka.c(Ja.f83531a, c10745bfA, C10999ra.class);
        f83613d = U9.c(Ka.f83571a, Ca.class, C10984qa.class);
        f83614e = R9.b(new P9() { // from class: com.google.android.gms.internal.pal.La
            @Override // com.google.android.gms.internal.pal.P9
            public final AbstractC11028t7 a(InterfaceC11015sa interfaceC11015sa, C10721a8 c10721a8) throws GeneralSecurityException {
                Ga ga2;
                int i10 = Ma.f83615f;
                if (!((C10984qa) interfaceC11015sa).d().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    C10905lb c10905lbW = C10905lb.w(((C10984qa) interfaceC11015sa).b(), C10958p0.a());
                    if (c10905lbW.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11000rb c11000rbY = c10905lbW.y();
                    int iF = ((C10984qa) interfaceC11015sa).f();
                    int iT = c11000rbY.t();
                    int i11 = iF - 2;
                    if (i11 == 1) {
                        ga2 = Ga.f83464b;
                    } else if (i11 == 2) {
                        ga2 = Ga.f83466d;
                    } else if (i11 == 3) {
                        ga2 = Ga.f83467e;
                    } else {
                        if (i11 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + Yd.a(iF));
                        }
                        ga2 = Ga.f83465c;
                    }
                    return Ca.b(Ha.b(iT, ga2), C10762cf.b(c10905lbW.z().z(), c10721a8), ((C10984qa) interfaceC11015sa).c());
                } catch (zzadi | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, c10745bfA, C10984qa.class);
    }

    public static void a() throws GeneralSecurityException {
        C10840ha c10840haB = C10840ha.b();
        c10840haB.f(f83611b);
        c10840haB.e(f83612c);
        c10840haB.d(f83613d);
        c10840haB.c(f83614e);
    }
}
