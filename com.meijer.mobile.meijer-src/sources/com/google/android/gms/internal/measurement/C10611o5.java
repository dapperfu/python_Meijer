package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10611o5 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f83155a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f83156b;

    public static int b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static {
        Charset.forName("US-ASCII");
        f83155a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f83156b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = I4.f82638a;
        try {
            new H4(bArr, 0, 0, false, null).c(0);
        } catch (zzmr e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    static boolean d(K5 k52) {
        if (k52 instanceof AbstractC10636r4) {
            throw null;
        }
        return false;
    }
}
