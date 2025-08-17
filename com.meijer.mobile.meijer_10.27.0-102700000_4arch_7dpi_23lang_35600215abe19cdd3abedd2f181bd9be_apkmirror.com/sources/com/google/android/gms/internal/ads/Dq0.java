package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Dq0 implements Tp0 {
    public Dq0(Kp0 kp0) throws GeneralSecurityException {
        if (C7931eo0.a(1)) {
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
