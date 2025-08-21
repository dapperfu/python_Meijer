package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes8.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f89011a = new a();

    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return I.c();
        }
    }

    public static byte[] d(int i10) {
        byte[] bArr = new byte[i10];
        f89011a.get().nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom b() {
        Provider providerA = C11418b.a();
        if (providerA != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerB = C11418b.b();
        if (providerB != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerB);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom c() {
        SecureRandom secureRandomB = b();
        secureRandomB.nextLong();
        return secureRandomB;
    }
}
