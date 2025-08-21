package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.st0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9561st0 implements InterfaceC9775ut0 {
    @Override // com.google.android.gms.internal.ads.InterfaceC9775ut0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
