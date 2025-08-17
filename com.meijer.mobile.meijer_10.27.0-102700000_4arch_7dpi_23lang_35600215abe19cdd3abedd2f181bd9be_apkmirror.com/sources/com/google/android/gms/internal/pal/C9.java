package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class C9 {
    static InterfaceC10921u9 a(C10702gd c10702gd) throws GeneralSecurityException {
        if (c10702gd.w() == 3) {
            return new C10873r9(16);
        }
        if (c10702gd.w() == 4) {
            return new C10873r9(32);
        }
        if (c10702gd.w() == 5) {
            return new C10889s9();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static InterfaceC11001z9 b(C10702gd c10702gd) throws GeneralSecurityException {
        if (c10702gd.z() == 3) {
            return new L9(new C10905t9("HmacSha256"));
        }
        if (c10702gd.z() == 4) {
            return J9.b(1);
        }
        if (c10702gd.z() == 5) {
            return J9.b(2);
        }
        if (c10702gd.z() == 6) {
            return J9.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static C10905t9 c(C10702gd c10702gd) {
        if (c10702gd.y() == 3) {
            return new C10905t9("HmacSha256");
        }
        if (c10702gd.y() == 4) {
            return new C10905t9("HmacSha384");
        }
        if (c10702gd.y() == 5) {
            return new C10905t9("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
