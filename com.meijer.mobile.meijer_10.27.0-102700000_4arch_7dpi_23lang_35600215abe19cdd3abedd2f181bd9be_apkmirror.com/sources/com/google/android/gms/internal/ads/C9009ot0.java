package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.ads.ot0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9009ot0 implements InterfaceC9650ut0 {
    @Override // com.google.android.gms.internal.ads.InterfaceC9650ut0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
