package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Eq0 implements Tp0 {
    public Eq0(Zp0 zp0) throws GeneralSecurityException {
        if (C8056eo0.a(2)) {
        } else {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
