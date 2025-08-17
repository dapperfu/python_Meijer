package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f82676a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f82677b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f82678c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f82679d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f82680e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC10689g0 f82681f;

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iD = d(length, bArr, 0, length);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f82677b);
    }

    static {
        byte[] bArr = new byte[0];
        f82679d = bArr;
        f82680e = ByteBuffer.wrap(bArr);
        f82681f = AbstractC10689g0.n(bArr, 0, 0, false);
    }

    static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static Object g(Object obj, Object obj2) {
        return ((InterfaceC10690g1) obj).x().B3((InterfaceC10690g1) obj2).B();
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static boolean i(byte[] bArr) {
        return Y1.e(bArr);
    }
}
