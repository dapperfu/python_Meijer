package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.on0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8997on0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f77428a = new C8890nn0();

    public static SecretKey c(byte[] bArr) throws GeneralSecurityException {
        Ct0.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec a(byte[] bArr, int i10, int i11) {
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        return new GCMParameterSpec(128, bArr, i10, 12);
    }

    public static Cipher b() {
        return (Cipher) f77428a.get();
    }
}
