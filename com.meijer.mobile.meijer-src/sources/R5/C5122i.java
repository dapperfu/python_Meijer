package R5;

import R5.InterfaceC5123j;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: R5.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5122i implements InterfaceC5123j {
    private Locale z(Resources resources) {
        Configuration configuration;
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        return configuration.getLocales().get(0);
    }

    private boolean B(String str) {
        return str == null || str.trim().isEmpty();
    }

    @Override // R5.InterfaceC5123j
    public String b() {
        return "Android";
    }

    @Override // R5.InterfaceC5123j
    public String d() {
        return Build.VERSION.RELEASE;
    }

    @Override // R5.InterfaceC5123j
    public String f() {
        return Build.ID;
    }

    @Override // R5.InterfaceC5123j
    public String k() {
        return "Application";
    }

    @Override // R5.InterfaceC5123j
    public String m() {
        return "android";
    }

    @Override // R5.InterfaceC5123j
    public String p() {
        return Build.MANUFACTURER;
    }

    @Override // R5.InterfaceC5123j
    public String q() {
        return Build.MODEL;
    }

    @Override // R5.InterfaceC5123j
    public String u() {
        String str = b() + " " + d();
        boolean zB = B(str);
        String strF = zzbz.UNKNOWN_CONTENT_TYPE;
        if (zB) {
            str = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        String strJ = j();
        if (B(strJ)) {
            strJ = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        String strQ = B(q()) ? zzbz.UNKNOWN_CONTENT_TYPE : q();
        if (!B(f())) {
            strF = f();
        }
        return String.format("Mozilla/5.0 (Linux; U; %s; %s; %s Build/%s)", str, strJ, strQ, strF);
    }

    C5122i() {
    }

    private PackageInfo A() {
        Context contextX = x();
        if (contextX == null) {
            return null;
        }
        try {
            PackageManager packageManager = contextX.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getPackageInfo(contextX.getPackageName(), 0);
        } catch (Exception e10) {
            t.a("Services", "DeviceInfoService", String.format("PackageManager couldn't find application version (%s)", e10.getLocalizedMessage()), new Object[0]);
            return null;
        }
    }

    private Context x() {
        return K.f().a().getApplicationContext();
    }

    private Activity y() {
        return K.f().a().c();
    }

    @Override // R5.InterfaceC5123j
    public int a() {
        Activity activityY = y();
        if (activityY == null) {
            return 0;
        }
        return activityY.getResources().getConfiguration().orientation;
    }

    @Override // R5.InterfaceC5123j
    public String c() {
        ApplicationInfo applicationInfo;
        Context contextX = x();
        if (contextX == null) {
            return null;
        }
        try {
            PackageManager packageManager = contextX.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextX.getPackageName(), 0)) == null) {
                return null;
            }
            return (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (Exception e10) {
            t.a("Services", "DeviceInfoService", String.format("PackageManager couldn't find application name (%s)", e10), new Object[0]);
            return null;
        }
    }

    @Override // R5.InterfaceC5123j
    public String e() {
        Context contextX = x();
        if (contextX == null) {
            return null;
        }
        return contextX.getPackageName();
    }

    @Override // R5.InterfaceC5123j
    public String g() {
        PackageInfo packageInfoA = A();
        if (packageInfoA != null) {
            return packageInfoA.versionName;
        }
        return null;
    }

    @Override // R5.InterfaceC5123j
    public InterfaceC5123j.a h() {
        Context contextX = x();
        if (contextX == null) {
            return InterfaceC5123j.a.UNKNOWN;
        }
        Resources resources = contextX.getResources();
        if (resources == null) {
            return InterfaceC5123j.a.UNKNOWN;
        }
        if ((resources.getConfiguration().uiMode & 15) == 6) {
            return InterfaceC5123j.a.WATCH;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f10 = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f11 = displayMetrics.widthPixels / displayMetrics.xdpi;
        if (Math.sqrt((f11 * f11) + (f10 * f10)) >= 6.5d) {
            return InterfaceC5123j.a.TABLET;
        }
        return InterfaceC5123j.a.PHONE;
    }

    @Override // R5.InterfaceC5123j
    public Locale i() {
        return z(Resources.getSystem());
    }

    @Override // R5.InterfaceC5123j
    public String j() {
        Locale localeV = v();
        if (localeV == null) {
            localeV = Locale.US;
        }
        String language = localeV.getLanguage();
        String country = localeV.getCountry();
        if (!country.isEmpty()) {
            return language + "-" + country;
        }
        return language;
    }

    @Override // R5.InterfaceC5123j
    public String l() {
        TelephonyManager telephonyManager;
        Context contextX = x();
        if (contextX == null || (telephonyManager = (TelephonyManager) contextX.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    @Override // R5.InterfaceC5123j
    public InterfaceC5123j.b n() {
        Resources resources;
        Context contextX = x();
        if (contextX == null || (resources = contextX.getResources()) == null) {
            return null;
        }
        return new C5124k(resources.getDisplayMetrics());
    }

    @Override // R5.InterfaceC5123j
    public File o() {
        Context contextX = x();
        if (contextX == null) {
            return null;
        }
        return contextX.getCacheDir();
    }

    @Override // R5.InterfaceC5123j
    public String r() {
        int iLongValue;
        PackageInfo packageInfoA = A();
        if (packageInfoA == null) {
            return null;
        }
        Locale locale = Locale.US;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                iLongValue = (int) ((Long) packageInfoA.getClass().getDeclaredMethod("getLongVersionCode", null).invoke(packageInfoA, null)).longValue();
            } catch (Exception e10) {
                t.a("Services", "DeviceInfoService", String.format("Failed to get app version code, (%s)", e10), new Object[0]);
                iLongValue = 0;
            }
        } else {
            iLongValue = packageInfoA.versionCode;
        }
        if (iLongValue <= 0) {
            return null;
        }
        return String.format(locale, "%d", Integer.valueOf(iLongValue));
    }

    @Override // R5.InterfaceC5123j
    public InputStream s(String str) {
        Context contextX = x();
        if (!B(str) && contextX != null) {
            Resources resources = contextX.getResources();
            if (resources == null) {
                t.a("Services", "DeviceInfoService", String.format("%s (Resources), unable to read (%s) from the the assets folder.", "Unexpected Null Value", str), new Object[0]);
                return null;
            }
            AssetManager assets = resources.getAssets();
            if (assets == null) {
                t.a("Services", "DeviceInfoService", String.format("%s (AssetManager), unable to read (%s) from the the assets folder.", "Unexpected Null Value", str), new Object[0]);
                return null;
            }
            try {
                return assets.open(str);
            } catch (IOException e10) {
                t.a("Services", "DeviceInfoService", String.format("Unable to read (%s) from the the assets folder. (%s)", str, e10), new Object[0]);
            }
        }
        return null;
    }

    @Override // R5.InterfaceC5123j
    public String t(String str) throws PackageManager.NameNotFoundException {
        Context contextX = x();
        if (!B(str) && contextX != null) {
            PackageManager packageManager = contextX.getPackageManager();
            if (packageManager == null) {
                t.a("Services", "DeviceInfoService", String.format("%s (Package Manager), unable to read property for key (%s).", "Unexpected Null Value", str), new Object[0]);
                return null;
            }
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextX.getPackageName(), 128);
                if (applicationInfo == null) {
                    t.a("Services", "DeviceInfoService", String.format("%s (Application info), unable to read property for key (%s).", "Unexpected Null Value", str), new Object[0]);
                    return null;
                }
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null) {
                    t.a("Services", "DeviceInfoService", String.format("%s (ApplicationInfo's metaData), unable to read property for key (%s).", "Unexpected Null Value", str), new Object[0]);
                    return null;
                }
                return bundle.getString(str);
            } catch (Exception e10) {
                t.a("Services", "DeviceInfoService", String.format("Unable to read property for key (%s). Exception - (%s)", str, e10), new Object[0]);
            }
        }
        return null;
    }

    @Override // R5.InterfaceC5123j
    public Locale v() {
        Context contextX = x();
        if (contextX == null) {
            return null;
        }
        return z(contextX.getResources());
    }

    @Override // R5.InterfaceC5123j
    public File w() {
        Context contextX = x();
        if (contextX == null || contextX.getApplicationInfo() == null) {
            return null;
        }
        return new File(contextX.getApplicationInfo().dataDir);
    }
}
