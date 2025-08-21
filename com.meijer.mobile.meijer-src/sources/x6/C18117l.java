package x6;

import android.os.SystemClock;

/* renamed from: x6.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18117l {
    public static long a(long j10, int i10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i11 = (int) j10;
        int i12 = (int) (j10 >> 32);
        int i13 = 0;
        while (i13 < 16) {
            int i14 = i12 ^ (((i10 << i13) | (i10 >>> (32 - i13))) ^ i11);
            i13++;
            int i15 = i11;
            i11 = i14;
            i12 = i15;
        }
        long j11 = (i12 << 32) | (i11 & 4294967295L);
        r.c("FeistelCipher", "FeistelCipherEncode-Time: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms", new Throwable[0]);
        return j11;
    }
}
