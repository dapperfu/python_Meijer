package r7;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final double f159416a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j10) {
        return (b() - j10) * f159416a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
