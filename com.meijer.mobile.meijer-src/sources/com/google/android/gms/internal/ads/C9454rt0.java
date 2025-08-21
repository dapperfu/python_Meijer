package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.rt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9454rt0 implements InterfaceC9775ut0 {
    @Override // com.google.android.gms.internal.ads.InterfaceC9775ut0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
