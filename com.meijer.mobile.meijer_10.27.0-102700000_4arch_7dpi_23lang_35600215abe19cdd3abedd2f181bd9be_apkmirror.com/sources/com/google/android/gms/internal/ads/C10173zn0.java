package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.zn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10173zn0 extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) C8795mt0.f76915b.a("ChaCha20-Poly1305");
            if (An0.e(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    C10173zn0() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
