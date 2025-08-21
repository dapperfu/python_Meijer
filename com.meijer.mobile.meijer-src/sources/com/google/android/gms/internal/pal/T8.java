package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes6.dex */
final class T8 extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) Ee.f83424e.a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    T8() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
