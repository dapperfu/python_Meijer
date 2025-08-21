package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.bt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7747bt0 extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) C8920mt0.f77755b.a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    C7747bt0() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
