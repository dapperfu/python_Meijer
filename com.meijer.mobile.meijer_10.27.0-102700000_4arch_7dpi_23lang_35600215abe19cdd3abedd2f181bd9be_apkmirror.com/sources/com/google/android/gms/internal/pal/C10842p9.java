package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.pal.p9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10842p9 {
    public static String b(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return "HmacSha1";
        }
        if (i11 == 2) {
            return "HmacSha384";
        }
        if (i11 == 3) {
            return "HmacSha256";
        }
        if (i11 == 4) {
            return "HmacSha512";
        }
        if (i11 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(Oc.a(i10))));
    }

    public static int c(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(Mc.a(i10))));
    }

    public static int d(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(C10876rc.a(i10))));
            }
        }
        return i12;
    }

    public static void a(Ac ac2) throws GeneralSecurityException {
        Ce.k(c(ac2.y().z()));
        b(ac2.y().A());
        if (ac2.E() != 2) {
            Z7.c(ac2.t().w());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
