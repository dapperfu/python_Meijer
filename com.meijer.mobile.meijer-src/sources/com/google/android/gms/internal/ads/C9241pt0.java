package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.pt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9241pt0 implements InterfaceC9775ut0 {
    @Override // com.google.android.gms.internal.ads.InterfaceC9775ut0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
