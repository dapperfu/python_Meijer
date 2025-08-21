package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.pal.se, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11019se {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f84880a = Charset.forName("UTF-8");

    public static byte[] a(String str, int i10) {
        byte[] bytes = str.getBytes(f84880a);
        int length = bytes.length;
        C11003re c11003re = new C11003re(2, new byte[(length * 3) / 4]);
        if (!c11003re.a(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i11 = c11003re.f84667b;
        byte[] bArr = c11003re.f84666a;
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }
}
