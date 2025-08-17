package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.xt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9971xt0 extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) C8795mt0.f76915b.a("AES/ECB/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    C9971xt0() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
