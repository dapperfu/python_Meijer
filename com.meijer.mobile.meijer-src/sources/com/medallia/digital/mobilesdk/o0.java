package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes8.dex */
class o0 {
    o0() {
    }

    protected ApplicationInfo a() {
        return i4.c().b().getApplicationInfo();
    }

    protected Calendar b() {
        return Calendar.getInstance();
    }

    protected ConnectivityManager c() {
        return (ConnectivityManager) i4.c().b().getSystemService("connectivity");
    }

    protected StatFs d() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }

    protected Point e() {
        Point point = new Point();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowManager windowManager = (WindowManager) i4.c().d().getSystemService("window");
                if (windowManager != null) {
                    Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                    return new Point(bounds.width(), bounds.height());
                }
            } else {
                Display displayF = f();
                if (displayF != null) {
                    displayF.getSize(point);
                }
            }
            return point;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return point;
        }
    }

    public Display f() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                if (i4.c().b().getSystemService("window") != null) {
                    return ((WindowManager) i4.c().b().getSystemService("window")).getDefaultDisplay();
                }
                return null;
            }
            if (i4.c() == null || i4.c().d() == null || i4.c().d().getDisplay() == null) {
                return null;
            }
            return i4.c().d().getDisplay();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected Locale g() {
        return Locale.getDefault();
    }

    protected ActivityManager.MemoryInfo h() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) i4.c().b().getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return memoryInfo;
    }

    protected PackageManager i() {
        return i4.c().b().getPackageManager();
    }

    protected d7 j() {
        return d7.b();
    }

    protected TelephonyManager k() {
        return (TelephonyManager) i4.c().b().getSystemService("phone");
    }
}
