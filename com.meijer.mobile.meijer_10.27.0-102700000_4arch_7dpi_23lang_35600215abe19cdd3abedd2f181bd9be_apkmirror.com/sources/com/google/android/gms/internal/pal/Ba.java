package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Ba {
    public static final C10620bf a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i10] = (byte) cCharAt;
            } else {
                throw new zzqc("Not a printable ASCII character: " + cCharAt);
            }
        }
        return C10620bf.b(bArr);
    }
}
