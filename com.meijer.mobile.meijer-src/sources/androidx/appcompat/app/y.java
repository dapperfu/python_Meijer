package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l8;
import java.util.Calendar;

/* loaded from: classes.dex */
class y {

    /* renamed from: d, reason: collision with root package name */
    private static y f46240d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f46241a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f46242b;

    /* renamed from: c, reason: collision with root package name */
    private final a f46243c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f46244a;

        /* renamed from: b, reason: collision with root package name */
        long f46245b;

        a() {
        }
    }

    static y a(Context context) {
        if (f46240d == null) {
            Context applicationContext = context.getApplicationContext();
            f46240d = new y(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f46240d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = Z1.e.c(this.f46241a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = Z1.e.c(this.f46241a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f46242b.isProviderEnabled(str)) {
                return this.f46242b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            FS.log_d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f46243c.f46245b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f46243c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        x xVarB = x.b();
        xVarB.a(jCurrentTimeMillis - l8.b.f93366d, location.getLatitude(), location.getLongitude());
        xVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = xVarB.f46239c == 1;
        long j11 = xVarB.f46238b;
        long j12 = xVarB.f46237a;
        xVarB.a(jCurrentTimeMillis + l8.b.f93366d, location.getLatitude(), location.getLongitude());
        long j13 = xVarB.f46238b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + l8.b.f93364b;
        }
        aVar.f46244a = z10;
        aVar.f46245b = j10;
    }

    boolean d() {
        a aVar = this.f46243c;
        if (e()) {
            return aVar.f46244a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f46244a;
        }
        FS.log_i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    y(Context context, LocationManager locationManager) {
        this.f46241a = context;
        this.f46242b = locationManager;
    }
}
