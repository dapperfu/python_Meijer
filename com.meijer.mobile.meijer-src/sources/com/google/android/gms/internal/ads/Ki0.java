package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class Ki0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f68991a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 10; i10++) {
            bArr[i10 + 48] = (byte) i10;
        }
        for (int i11 = 0; i11 < 26; i11++) {
            byte b10 = (byte) (i11 + 10);
            bArr[i11 + 65] = b10;
            bArr[i11 + 97] = b10;
        }
        f68991a = bArr;
    }

    static int a(char c10) {
        if (c10 < 128) {
            return f68991a[c10];
        }
        return -1;
    }
}
