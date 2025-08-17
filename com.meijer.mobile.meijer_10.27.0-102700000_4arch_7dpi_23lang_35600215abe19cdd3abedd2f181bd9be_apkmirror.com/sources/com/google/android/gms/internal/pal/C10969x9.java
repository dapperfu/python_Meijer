package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.x9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10969x9 implements InterfaceC10840p7 {

    /* renamed from: a, reason: collision with root package name */
    private final B9 f84206a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC11001z9 f84207b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10921u9 f84208c;

    /* renamed from: d, reason: collision with root package name */
    private final C10905t9 f84209d;

    private C10969x9(B9 b92, InterfaceC11001z9 interfaceC11001z9, C10905t9 c10905t9, InterfaceC10921u9 interfaceC10921u9, int i10, byte[] bArr) {
        this.f84206a = b92;
        this.f84207b = interfaceC11001z9;
        this.f84209d = c10905t9;
        this.f84208c = interfaceC10921u9;
    }

    static C10969x9 a(C10750jd c10750jd) throws GeneralSecurityException {
        B9 b9A;
        if (c10750jd.H()) {
            if (c10750jd.y().I()) {
                if (!c10750jd.z().y()) {
                    C10702gd c10702gdU = c10750jd.y().u();
                    InterfaceC11001z9 interfaceC11001z9B = C9.b(c10702gdU);
                    C10905t9 c10905t9C = C9.c(c10702gdU);
                    InterfaceC10921u9 interfaceC10921u9A = C9.a(c10702gdU);
                    int iZ = c10702gdU.z();
                    int i10 = 1;
                    if (iZ - 2 == 1) {
                        int iZ2 = c10750jd.y().u().z() - 2;
                        if (iZ2 != 1) {
                            if (iZ2 != 2 && iZ2 != 3 && iZ2 != 4) {
                                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                            }
                            byte[] bArrZ = c10750jd.z().z();
                            byte[] bArrZ2 = c10750jd.y().A().z();
                            int iZ3 = c10750jd.y().u().z() - 2;
                            if (iZ3 != 2) {
                                if (iZ3 != 3) {
                                    if (iZ3 == 4) {
                                        i10 = 3;
                                    } else {
                                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                    }
                                } else {
                                    i10 = 2;
                                }
                            }
                            b9A = K9.a(bArrZ, bArrZ2, i10);
                        } else {
                            b9A = M9.a(c10750jd.z().z());
                        }
                        return new C10969x9(b9A, interfaceC11001z9B, c10905t9C, interfaceC10921u9A, 32, null);
                    }
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(Zc.a(iZ)));
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}
