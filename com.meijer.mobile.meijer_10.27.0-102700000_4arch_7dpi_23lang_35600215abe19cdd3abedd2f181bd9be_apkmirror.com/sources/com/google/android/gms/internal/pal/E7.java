package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class E7 {
    public static D7 a(String str) throws GeneralSecurityException {
        D7 d72 = (D7) Z7.k().get(str);
        if (d72 != null) {
            return d72;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
