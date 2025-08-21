package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.b9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7672b9 {
    public static String a(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z10) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
