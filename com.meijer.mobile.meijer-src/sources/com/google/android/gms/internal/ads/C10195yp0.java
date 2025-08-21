package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.yp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10195yp0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f81134a = new C10088xp0();

    public static byte[] b(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f81134a.get()).nextBytes(bArr);
        return bArr;
    }

    static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandomC = c();
        secureRandomC.nextLong();
        return secureRandomC;
    }

    private static SecureRandom c() {
        Provider providerA = C8270go0.a();
        if (providerA != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
