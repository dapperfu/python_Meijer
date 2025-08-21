package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes6.dex */
public final class Le implements Ne {
    @Override // com.google.android.gms.internal.pal.Ne
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
