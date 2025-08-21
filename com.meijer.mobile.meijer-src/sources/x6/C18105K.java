package x6;

import android.os.SystemClock;

/* renamed from: x6.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18105K {
    static String a() {
        long j10;
        int i10;
        long j11;
        int i11;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i12 = 1;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                j10 = 2;
                i10 = 1000000;
                if (i12 >= 1000000) {
                    break;
                }
                if (((4508713 % i12) * 11) % i12 == 0) {
                    i13++;
                }
                if (i12 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis > 2) {
                    break;
                }
                i14++;
                i12++;
            }
            int i15 = i14 / 100;
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            float f10 = 33.34f;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 1; i18 < 1000000; i18++) {
                f10 += i18;
                if ((19.239f * f10) / 3.56f < 10000.0f) {
                    i16++;
                }
                if (i18 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis2 > 2) {
                    break;
                }
                i17++;
            }
            int i19 = i17 / 100;
            long jUptimeMillis3 = SystemClock.uptimeMillis();
            int i20 = 0;
            int i21 = 0;
            for (double d10 = 1.0d; d10 < 1000000.0d; d10 += 1.0d) {
                if (Math.sqrt(d10) > 30.0d) {
                    i20++;
                }
                if (((int) d10) % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis3 > 2) {
                    break;
                }
                i21++;
            }
            int i22 = i20;
            int i23 = i21 / 100;
            long jUptimeMillis4 = SystemClock.uptimeMillis();
            int i24 = 1;
            int i25 = 0;
            int i26 = 0;
            while (true) {
                if (i24 >= i10) {
                    j11 = j10;
                    i11 = i10;
                    break;
                }
                j11 = j10;
                i11 = i10;
                if (Math.acos(i24 / i10) + Math.asin(i24 / i10) + Math.atan(i24 / i11) > 1.5d) {
                    i25++;
                }
                if (i24 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis4 > j11) {
                    break;
                }
                i26++;
                i24++;
                j10 = j11;
                i10 = i11;
            }
            int i27 = i26 / 100;
            long jUptimeMillis5 = SystemClock.uptimeMillis();
            int i28 = i11;
            int i29 = 0;
            for (int i30 = 1; i30 < i28 && SystemClock.uptimeMillis() - jUptimeMillis5 <= j11; i30++) {
                i29++;
            }
            return i13 + "," + i15 + "," + i16 + "," + i19 + "," + i22 + "," + i23 + "," + i25 + "," + i27 + "," + i29;
        } catch (Exception e10) {
            C18095A.a(e10);
            return "-1,-1,-1,-1,-1,-1,-1,-1,-1";
        }
    }
}
