package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;
import fsimpl.C14170dq;

/* renamed from: com.google.android.gms.internal.ads.qa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9309qa {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f78634a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f78635b = 0;

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            char[] cArr2 = f78634a;
            int i11 = i10 + i10;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & C14170dq.MULTIPLY];
        }
        return new String(cArr);
    }

    public static long a(double d10, int i10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / displayMetrics.density);
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static boolean c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}
