package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.x9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11094x9 implements InterfaceC10965p7 {

    /* renamed from: a, reason: collision with root package name */
    private final B9 f85046a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC11126z9 f85047b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC11046u9 f85048c;

    /* renamed from: d, reason: collision with root package name */
    private final C11030t9 f85049d;

    private C11094x9(B9 b92, InterfaceC11126z9 interfaceC11126z9, C11030t9 c11030t9, InterfaceC11046u9 interfaceC11046u9, int i10, byte[] bArr) {
        this.f85046a = b92;
        this.f85047b = interfaceC11126z9;
        this.f85049d = c11030t9;
        this.f85048c = interfaceC11046u9;
    }

    static C11094x9 a(C10875jd c10875jd) throws GeneralSecurityException {
        B9 b9A;
        if (c10875jd.H()) {
            if (c10875jd.y().I()) {
                if (!c10875jd.z().y()) {
                    C10827gd c10827gdU = c10875jd.y().u();
                    InterfaceC11126z9 interfaceC11126z9B = C9.b(c10827gdU);
                    C11030t9 c11030t9C = C9.c(c10827gdU);
                    InterfaceC11046u9 interfaceC11046u9A = C9.a(c10827gdU);
                    int iZ = c10827gdU.z();
                    int i10 = 1;
                    if (iZ - 2 == 1) {
                        int iZ2 = c10875jd.y().u().z() - 2;
                        if (iZ2 != 1) {
                            if (iZ2 != 2 && iZ2 != 3 && iZ2 != 4) {
                                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                            }
                            byte[] bArrZ = c10875jd.z().z();
                            byte[] bArrZ2 = c10875jd.y().A().z();
                            int iZ3 = c10875jd.y().u().z() - 2;
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
                            b9A = M9.a(c10875jd.z().z());
                        }
                        return new C11094x9(b9A, interfaceC11126z9B, c11030t9C, interfaceC11046u9A, 32, null);
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
