package com.google.android.gms.internal.pal;

import fsimpl.C14170dq;

/* loaded from: classes6.dex */
public final class Pe {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & C14170dq.MULTIPLY));
        }
        return sb2.toString();
    }
}
