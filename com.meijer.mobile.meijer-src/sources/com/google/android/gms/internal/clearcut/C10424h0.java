package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10424h0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f82307a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f82308b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f82309c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f82310d;

    /* renamed from: e, reason: collision with root package name */
    private static final J f82311e;

    static {
        byte[] bArr = new byte[0];
        f82309c = bArr;
        f82310d = ByteBuffer.wrap(bArr);
        f82311e = J.b(bArr, 0, bArr.length, false);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iC = c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object d(Object obj, Object obj2) {
        return ((J0) obj).j().H2((J0) obj2).I0();
    }

    static <T> T e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int f(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static boolean g(byte[] bArr) {
        return A1.h(bArr);
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f82307a);
    }

    static boolean i(J0 j02) {
        return false;
    }

    public static int j(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
