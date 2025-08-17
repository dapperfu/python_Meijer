package com.google.crypto.tink.internal;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

/* renamed from: com.google.crypto.tink.internal.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11293b {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f88189a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider b() {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Provider a() {
        for (String str : f88189a) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
