package com.google.android.gms.internal.ads;

import com.google.maps.android.BuildConfig;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Gk0 {
    public static final Qk0 a(Qk0 qk0) throws GeneralSecurityException {
        return qk0 != null ? qk0 : Wk0.a(b(null).j());
    }

    static final C7832ds0 b(Qk0 qk0) {
        try {
            return ((C9856wp0) Xo0.c().e(null, C9856wp0.class)).c();
        } catch (GeneralSecurityException e10) {
            throw new zzgnt("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(BuildConfig.TRAVIS), e10);
        }
    }
}
