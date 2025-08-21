package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* renamed from: com.google.android.gms.internal.ads.go0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8270go0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f75241a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = f75241a;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
