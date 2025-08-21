package com.google.android.gms.internal.pal;

import android.util.Base64;

/* loaded from: classes6.dex */
public final class N2 {
    public static String a(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z10) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, true != z10 ? 2 : 11);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
