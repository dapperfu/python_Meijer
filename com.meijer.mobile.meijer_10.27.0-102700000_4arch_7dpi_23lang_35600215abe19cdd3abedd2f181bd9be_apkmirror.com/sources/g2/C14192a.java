package g2;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14192a {

    /* renamed from: g2.a$a, reason: collision with other inner class name */
    private static class C2091a {
        static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }
    }

    /* renamed from: g2.a$b */
    static class b {
        static boolean a(Location location) {
            return location.isMock();
        }
    }

    public static float b(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2091a.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("bearingAccuracy", 0.0f);
    }

    public static long c(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static float d(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2091a.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("speedAccuracy", 0.0f);
    }

    public static float e(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2091a.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean f(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? C2091a.d(location) : a(location, "bearingAccuracy");
    }

    public static boolean g(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? C2091a.e(location) : a(location, "speedAccuracy");
    }

    public static boolean h(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? C2091a.f(location) : a(location, "verticalAccuracy");
    }

    public static boolean i(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(location) : location.isFromMockProvider();
    }

    private static boolean a(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey(str)) {
            return true;
        }
        return false;
    }
}
