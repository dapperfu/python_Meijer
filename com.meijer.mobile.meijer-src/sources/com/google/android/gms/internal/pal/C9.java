package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class C9 {
    static InterfaceC11046u9 a(C10827gd c10827gd) throws GeneralSecurityException {
        if (c10827gd.w() == 3) {
            return new C10998r9(16);
        }
        if (c10827gd.w() == 4) {
            return new C10998r9(32);
        }
        if (c10827gd.w() == 5) {
            return new C11014s9();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static InterfaceC11126z9 b(C10827gd c10827gd) throws GeneralSecurityException {
        if (c10827gd.z() == 3) {
            return new L9(new C11030t9("HmacSha256"));
        }
        if (c10827gd.z() == 4) {
            return J9.b(1);
        }
        if (c10827gd.z() == 5) {
            return J9.b(2);
        }
        if (c10827gd.z() == 6) {
            return J9.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static C11030t9 c(C10827gd c10827gd) {
        if (c10827gd.y() == 3) {
            return new C11030t9("HmacSha256");
        }
        if (c10827gd.y() == 4) {
            return new C11030t9("HmacSha384");
        }
        if (c10827gd.y() == 5) {
            return new C11030t9("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
