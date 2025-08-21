package com.adobe.marketing.mobile.assurance.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adobe.marketing.mobile.C6571e;
import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6547d {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f63071a;

    private boolean l() {
        return true;
    }

    boolean m(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("manifest")) == null) {
            return false;
        }
        String strOptString = jSONObjectOptJSONObject.optString("package", "");
        Application applicationB = R5.K.f().a().b();
        return applicationB != null && strOptString.equals(applicationB.getPackageName());
    }

    private HashMap<String, Object> d() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Canonical platform name", "Android");
        map.put("Device name", Build.MODEL);
        map.put("Device type", Build.DEVICE);
        map.put("Device manufacturer", Build.MANUFACTURER);
        map.put("Operating system", "Android " + Build.VERSION.RELEASE);
        map.put("Carrier name", f());
        map.put("Battery level", Integer.valueOf(a()));
        map.put("Screen size", g());
        map.put("Location service enabled", j());
        map.put("Location authorization status", b());
        map.put("Low power mode enabled", Boolean.valueOf(k()));
        return map;
    }

    private boolean h() {
        return Build.VERSION.SDK_INT < 29;
    }

    Map<String, Object> c() {
        HashMap map = new HashMap();
        map.put("version", C6571e.a());
        map.put("deviceInfo", d());
        map.put("type", "connect");
        map.put("appSettings", this.f63071a);
        return map;
    }

    JSONObject e() throws JSONException, PackageManager.NameNotFoundException {
        Application applicationB = R5.K.f().a().b();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (applicationB == null) {
            return jSONObject2;
        }
        try {
            String packageName = applicationB.getPackageName();
            jSONObject2.put("package", packageName);
            try {
                PackageInfo packageInfo = applicationB.getApplicationContext().getPackageManager().getPackageInfo(packageName, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                String str = packageInfo.versionName;
                String strValueOf = String.valueOf(packageInfo.versionCode);
                jSONObject2.put("versionName", str);
                jSONObject2.put("versionCode", strValueOf);
            } catch (PackageManager.NameNotFoundException unused) {
                FS.log_d("Assurance", "Failed to get package info for " + packageName);
            }
            ApplicationInfo applicationInfo = applicationB.getApplicationInfo();
            if (applicationInfo != null) {
                String str2 = applicationInfo.name;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", str2);
                jSONObject2.put("application", jSONObject3);
            }
            jSONObject.put("manifest", jSONObject2);
        } catch (JSONException unused2) {
            FS.log_d("Assurance", "Failed to put version details into fallbackManifestData");
        }
        return jSONObject;
    }

    C6547d() {
        JSONObject jSONObjectB = C6558o.b("AndroidManifest.xml");
        this.f63071a = m(jSONObjectB) ? jSONObjectB : e();
    }

    private int a() {
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        return ((BatteryManager) applicationContext.getSystemService("batterymanager")).getIntProperty(4);
    }

    private String b() {
        if (!l()) {
            return "Always";
        }
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext == null) {
            return "Unknown";
        }
        int iA = Z1.b.a(applicationContext, "android.permission.ACCESS_FINE_LOCATION");
        if (iA == 0) {
            if (h() || i()) {
                return "Always";
            }
            return "When in use";
        }
        if (iA == -1) {
            return "Denied";
        }
        return zzbz.UNKNOWN_CONTENT_TYPE;
    }

    private String f() {
        TelephonyManager telephonyManager;
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext == null || (telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone")) == null) {
            return "Unknown";
        }
        return telephonyManager.getNetworkOperatorName();
    }

    private String g() {
        int i10 = Resources.getSystem().getDisplayMetrics().heightPixels;
        return String.format(Locale.US, "%dx%d", Integer.valueOf(Resources.getSystem().getDisplayMetrics().widthPixels), Integer.valueOf(i10));
    }

    private boolean i() {
        if (!l()) {
            return true;
        }
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext == null || Z1.b.a(applicationContext, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        if (h() || Z1.b.a(applicationContext, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    private Boolean j() {
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext == null) {
            return Boolean.FALSE;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Boolean.valueOf(((LocationManager) applicationContext.getSystemService("location")).isLocationEnabled());
        }
        boolean z10 = false;
        if (Settings.Secure.getInt(applicationContext.getContentResolver(), "location_mode", 0) != 0) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private boolean k() {
        PowerManager powerManager;
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext == null || (powerManager = (PowerManager) applicationContext.getSystemService("power")) == null) {
            return false;
        }
        return powerManager.isPowerSaveMode();
    }
}
