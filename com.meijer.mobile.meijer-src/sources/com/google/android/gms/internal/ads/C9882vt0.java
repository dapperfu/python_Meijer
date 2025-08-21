package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9882vt0 {
    public static byte[] a(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 + i10;
                int iDigit = Character.digit(str.charAt(i11), 16);
                int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
