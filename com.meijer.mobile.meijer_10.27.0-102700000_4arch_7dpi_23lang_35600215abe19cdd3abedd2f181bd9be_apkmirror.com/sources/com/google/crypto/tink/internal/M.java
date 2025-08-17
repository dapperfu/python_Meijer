package com.google.crypto.tink.internal;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f88188a = Charset.forName("UTF-8");

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int f() {
        int i10 = 0;
        while (i10 == 0) {
            byte[] bArrD = I.d(4);
            i10 = (bArrD[3] & 255) | ((bArrD[0] & 255) << 24) | ((bArrD[1] & 255) << 16) | ((bArrD[2] & 255) << 8);
        }
        return i10;
    }

    private static final byte a(char c10) throws GeneralSecurityException {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new GeneralSecurityException("Not a printable ASCII character: " + c10);
    }

    public static boolean d() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    private static final byte g(char c10) {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c10);
    }

    public static final We.a b(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = a(str.charAt(i10));
        }
        return We.a.a(bArr);
    }

    public static Integer c() {
        if (!d()) {
            return null;
        }
        return C11292a.a();
    }

    public static final We.a h(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = g(str.charAt(i10));
        }
        return We.a.a(bArr);
    }
}
