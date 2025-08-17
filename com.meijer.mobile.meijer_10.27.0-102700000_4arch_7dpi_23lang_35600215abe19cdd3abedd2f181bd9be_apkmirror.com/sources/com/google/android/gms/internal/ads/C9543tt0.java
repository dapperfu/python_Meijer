package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.ads.tt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9543tt0 implements InterfaceC9650ut0 {
    @Override // com.google.android.gms.internal.ads.InterfaceC9650ut0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
