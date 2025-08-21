package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Wk0 {
    public static byte[] b(Qk0 qk0) throws GeneralSecurityException {
        return ((C9981wp0) Xo0.c().e(qk0, C9981wp0.class)).c().j();
    }

    public static Qk0 a(byte[] bArr) throws GeneralSecurityException {
        try {
            C7957ds0 c7957ds0F0 = C7957ds0.f0(bArr, C9350qu0.a());
            Xo0 xo0C = Xo0.c();
            C9981wp0 c9981wp0A = C9981wp0.a(c7957ds0F0);
            if (!xo0C.k(c9981wp0A)) {
                return new C10193yo0(c9981wp0A);
            }
            return xo0C.b(c9981wp0A);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
