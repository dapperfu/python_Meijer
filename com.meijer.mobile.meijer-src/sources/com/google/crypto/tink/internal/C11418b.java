package com.google.crypto.tink.internal;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

/* renamed from: com.google.crypto.tink.internal.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11418b {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f89029a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider b() {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Provider a() {
        for (String str : f89029a) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
