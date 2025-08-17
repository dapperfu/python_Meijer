package com.google.android.gms.internal.vision;

import fsimpl.C14045dq;

/* loaded from: classes6.dex */
final class q2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static void i(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(byte b10) {
        return b10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(byte b10) {
        return b10 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(byte b10) {
        return b10 < -16;
    }

    private static boolean o(byte b10) {
        return b10 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(byte b10, byte b11, char[] cArr, int i10) throws zzjk {
        if (b10 < -62 || o(b11)) {
            throw zzjk.f();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzjk {
        if (!o(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !o(b12) && !o(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
            return;
        }
        throw zzjk.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzjk {
        if (!o(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !o(b12)))) {
            cArr[i10] = (char) (((b10 & C14045dq.MULTIPLY) << 12) | ((b11 & 63) << 6) | (b12 & 63));
            return;
        }
        throw zzjk.f();
    }
}
