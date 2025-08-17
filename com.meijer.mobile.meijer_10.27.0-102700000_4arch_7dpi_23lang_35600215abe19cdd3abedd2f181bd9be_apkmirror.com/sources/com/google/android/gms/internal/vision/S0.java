package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f84465a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f84466b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f84467c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f84468d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC11076u0 f84469e;

    static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static boolean g(InterfaceC11083w1 interfaceC11083w1) {
        return false;
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static {
        byte[] bArr = new byte[0];
        f84467c = bArr;
        f84468d = ByteBuffer.wrap(bArr);
        f84469e = AbstractC11076u0.b(bArr, 0, bArr.length, false);
    }

    static Object e(Object obj, Object obj2) {
        return ((InterfaceC11083w1) obj).zzp().W2((InterfaceC11083w1) obj2).zze();
    }

    static <T> T f(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f84465a);
    }

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    public static boolean h(byte[] bArr) {
        return o2.f(bArr);
    }
}
