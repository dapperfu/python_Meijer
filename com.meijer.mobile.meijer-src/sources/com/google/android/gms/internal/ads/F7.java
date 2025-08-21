package com.google.android.gms.internal.ads;

import fsimpl.C14170dq;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class F7 {
    public static double a(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << C14170dq.SCREEN) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double b(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << C14170dq.SCREEN) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int c(byte b10) {
        return b10 < 0 ? b10 + C14170dq.UNAVAILABLE : b10;
    }

    public static int d(ByteBuffer byteBuffer) {
        return (c(byteBuffer.get()) << 8) + c(byteBuffer.get());
    }

    public static long e(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        if (j10 < 0) {
            return j10 + 4294967296L;
        }
        return j10;
    }

    public static long f(ByteBuffer byteBuffer) {
        long jE = e(byteBuffer) << 32;
        if (jE >= 0) {
            return jE + e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
