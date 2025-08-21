package g2;

import android.location.LocationManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14322b {

    /* renamed from: a, reason: collision with root package name */
    static final WeakHashMap<Object, WeakReference<Object>> f133992a = new WeakHashMap<>();

    /* renamed from: g2.b$a */
    private static class a {
        static boolean a(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    public static boolean a(LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
