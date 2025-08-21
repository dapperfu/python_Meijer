package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class Tu0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f71312a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f71313b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f71314c;

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static {
        Charset.forName("US-ASCII");
        f71312a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f71313b = bArr;
        f71314c = ByteBuffer.wrap(bArr);
        AbstractC8068eu0.f(bArr, 0, 0, false);
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
