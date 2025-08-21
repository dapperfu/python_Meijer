package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Hp0 {
    public static boolean c(byte[] bArr, byte[] bArr2) {
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

    static {
        Charset.forName("UTF-8");
    }

    public static final Et0 a(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i10] = (byte) cCharAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
        }
        return Et0.b(bArr);
    }

    public static final Et0 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i10] = (byte) cCharAt;
            } else {
                throw new zzgnt("Not a printable ASCII character: " + cCharAt);
            }
        }
        return Et0.b(bArr);
    }
}
