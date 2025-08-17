package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.pal.je, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10751je extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) Ee.f82584e.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    C10751je() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
