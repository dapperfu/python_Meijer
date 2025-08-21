package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.co0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7843co0 extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) C8920mt0.f77755b.a("AES/GCM-SIV/NoPadding");
            if (C7949do0.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    C7843co0() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
