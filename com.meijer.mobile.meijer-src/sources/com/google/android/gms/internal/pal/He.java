package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes6.dex */
public final class He implements Ne {
    @Override // com.google.android.gms.internal.pal.Ne
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
