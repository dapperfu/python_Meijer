package com.google.android.gms.internal.atv_ads_framework;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f80872a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f80873b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f80874c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f80875d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f80876e;

    /* renamed from: f, reason: collision with root package name */
    public static final C10260u0 f80877f;

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f80873b);
    }

    static {
        byte[] bArr = new byte[0];
        f80875d = bArr;
        f80876e = ByteBuffer.wrap(bArr);
        int i10 = C10260u0.f81064a;
        C10254s0 c10254s0 = new C10254s0(bArr, 0, 0, false, null);
        try {
            c10254s0.a(0);
            f80877f = c10254s0;
        } catch (zzdr e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
