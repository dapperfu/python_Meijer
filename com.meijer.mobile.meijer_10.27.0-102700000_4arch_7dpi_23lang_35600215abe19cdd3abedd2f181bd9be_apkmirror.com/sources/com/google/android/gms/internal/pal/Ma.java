package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class Ma {

    /* renamed from: a, reason: collision with root package name */
    private static final C10620bf f82770a;

    /* renamed from: b, reason: collision with root package name */
    private static final C10811na f82771b;

    /* renamed from: c, reason: collision with root package name */
    private static final C10763ka f82772c;

    /* renamed from: d, reason: collision with root package name */
    private static final U9 f82773d;

    /* renamed from: e, reason: collision with root package name */
    private static final R9 f82774e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f82775f = 0;

    static {
        C10620bf c10620bfA = Ba.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f82770a = c10620bfA;
        f82771b = C10811na.c(Ia.f82675a, Ha.class, C10874ra.class);
        f82772c = C10763ka.c(Ja.f82691a, c10620bfA, C10874ra.class);
        f82773d = U9.c(Ka.f82731a, Ca.class, C10859qa.class);
        f82774e = R9.b(new P9() { // from class: com.google.android.gms.internal.pal.La
            @Override // com.google.android.gms.internal.pal.P9
            public final AbstractC10903t7 a(InterfaceC10890sa interfaceC10890sa, C10596a8 c10596a8) throws GeneralSecurityException {
                Ga ga2;
                int i10 = Ma.f82775f;
                if (!((C10859qa) interfaceC10890sa).d().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    C10780lb c10780lbW = C10780lb.w(((C10859qa) interfaceC10890sa).b(), C10833p0.a());
                    if (c10780lbW.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C10875rb c10875rbY = c10780lbW.y();
                    int iF = ((C10859qa) interfaceC10890sa).f();
                    int iT = c10875rbY.t();
                    int i11 = iF - 2;
                    if (i11 == 1) {
                        ga2 = Ga.f82624b;
                    } else if (i11 == 2) {
                        ga2 = Ga.f82626d;
                    } else if (i11 == 3) {
                        ga2 = Ga.f82627e;
                    } else {
                        if (i11 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + Yd.a(iF));
                        }
                        ga2 = Ga.f82625c;
                    }
                    return Ca.b(Ha.b(iT, ga2), C10637cf.b(c10780lbW.z().z(), c10596a8), ((C10859qa) interfaceC10890sa).c());
                } catch (zzadi | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, c10620bfA, C10859qa.class);
    }

    public static void a() throws GeneralSecurityException {
        C10715ha c10715haB = C10715ha.b();
        c10715haB.f(f82771b);
        c10715haB.e(f82772c);
        c10715haB.d(f82773d);
        c10715haB.c(f82774e);
    }
}
