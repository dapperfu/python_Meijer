package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.qt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9223qt0 implements InterfaceC9650ut0 {
    @Override // com.google.android.gms.internal.ads.InterfaceC9650ut0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
