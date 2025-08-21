package x6;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
final class T {
    public static String b() throws ClassNotFoundException {
        try {
            try {
                try {
                    Class.forName("com.akamai.react.RNAkamaibmpModule");
                    return "4";
                } catch (Exception unused) {
                    Class.forName("io.flutter.plugins.GeneratedPluginRegistrant");
                    return "3";
                }
            } catch (Exception unused2) {
                return "0";
            }
        } catch (Exception unused3) {
            Class.forName("org.apache.cordova.CordovaPlugin");
            return "2";
        }
    }

    public static String c(Application application) throws Exception {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        r.c("SystemInfoListener", "Getting system information", new Throwable[0]);
        if (application == null) {
            return "-1";
        }
        application.getPackageManager();
        DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
        int i11 = displayMetrics.heightPixels;
        int i12 = displayMetrics.widthPixels;
        BatteryManager batteryManager = (BatteryManager) application.getSystemService("batterymanager");
        Pair pair = new Pair(Boolean.valueOf(batteryManager.isCharging()), Integer.valueOf(batteryManager.getIntProperty(4)));
        if (application.getResources().getConfiguration().orientation == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (application.getResources().getConfiguration().orientation != 2) {
                i10 = -1;
            }
        }
        String language = Locale.getDefault().getLanguage();
        String str15 = Build.VERSION.RELEASE;
        int i13 = Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) == 1 ? 1 : 0;
        String str16 = Build.MODEL;
        String str17 = Build.BOOTLOADER;
        int i14 = Build.VERSION.SDK_INT;
        String str18 = Build.HARDWARE;
        String packageName = application.getPackageName();
        String strE = e(application);
        int i15 = application.getResources().getConfiguration().keyboard == 1 ? 0 : 1;
        int iA = a(application);
        try {
            str2 = Build.VERSION.CODENAME;
            try {
                str = Build.VERSION.INCREMENTAL;
                try {
                    str3 = Build.MANUFACTURER;
                } catch (Exception unused) {
                    str3 = "-1";
                    str4 = str3;
                }
            } catch (Exception unused2) {
                str = "-1";
                str3 = str;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                str12 = str11;
                str13 = str12;
                i14 = -1;
                str14 = "-1";
                String str19 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19)), new Throwable[0]);
                return str19;
            }
        } catch (Exception unused3) {
            str = "-1";
            str2 = str;
            str3 = str2;
        }
        try {
            str4 = Build.PRODUCT;
            try {
                str5 = Build.TAGS;
            } catch (Exception unused4) {
                str5 = "-1";
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                str12 = str11;
                str13 = str12;
                str14 = "-1";
                String str192 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192)), new Throwable[0]);
                return str192;
            }
            try {
                str6 = Build.TYPE;
                try {
                    str7 = Build.USER;
                    try {
                        str8 = Build.DISPLAY;
                    } catch (Exception unused5) {
                        str8 = "-1";
                        str9 = str8;
                        str10 = str9;
                        str11 = str10;
                        str12 = str11;
                        str13 = str12;
                        str14 = "-1";
                        String str1922 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                        r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922)), new Throwable[0]);
                        return str1922;
                    }
                    try {
                        str9 = Build.BOARD;
                    } catch (Exception unused6) {
                        str9 = "-1";
                        str10 = str9;
                        str11 = str10;
                        str12 = str11;
                        str13 = str12;
                        str14 = "-1";
                        String str19222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                        r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222)), new Throwable[0]);
                        return str19222;
                    }
                } catch (Exception unused7) {
                    str7 = "-1";
                    str8 = str7;
                    str9 = str8;
                    str10 = str9;
                    str11 = str10;
                    str12 = str11;
                    str13 = str12;
                    str14 = "-1";
                    String str192222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                    r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222)), new Throwable[0]);
                    return str192222;
                }
            } catch (Exception unused8) {
                str6 = "-1";
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                str12 = str11;
                str13 = str12;
                str14 = "-1";
                String str1922222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222)), new Throwable[0]);
                return str1922222;
            }
            try {
                str10 = Build.BRAND;
            } catch (Exception unused9) {
                str10 = "-1";
                str11 = str10;
                str12 = str11;
                str13 = str12;
                str14 = "-1";
                String str19222222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222222)), new Throwable[0]);
                return str19222222;
            }
        } catch (Exception unused10) {
            str4 = "-1";
            str5 = str4;
            str6 = str5;
            str7 = str6;
            str8 = str7;
            str9 = str8;
            str10 = str9;
            str11 = str10;
            str12 = str11;
            str13 = str12;
            str14 = "-1";
            String str192222222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
            r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222222)), new Throwable[0]);
            return str192222222;
        }
        try {
            str11 = Build.DEVICE;
            try {
                str12 = Build.FINGERPRINT;
                try {
                    str13 = Build.HOST;
                    try {
                        str14 = Build.ID;
                    } catch (Exception unused11) {
                        str14 = "-1";
                        String str1922222222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                        r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222222)), new Throwable[0]);
                        return str1922222222;
                    }
                } catch (Exception unused12) {
                    str13 = "-1";
                }
            } catch (Exception unused13) {
                str12 = "-1";
                str13 = str12;
                str14 = "-1";
                String str19222222222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
                r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str19222222222)), new Throwable[0]);
                return str19222222222;
            }
        } catch (Exception unused14) {
            str11 = "-1";
            str12 = str11;
            str13 = str12;
            str14 = "-1";
            String str192222222222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
            r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str192222222222)), new Throwable[0]);
            return str192222222222;
        }
        String str1922222222222 = "-1,uaend,-1," + i11 + "," + i12 + "," + (((Boolean) pair.first).booleanValue() ? 1 : 0) + "," + pair.second + "," + i10 + "," + S.c(language) + "," + S.c(str15) + "," + i13 + "," + S.c(str16) + "," + S.c(str17) + "," + S.c(str18) + "," + S.c("-1") + "," + packageName + "," + S.c("-1") + ",-1," + strE + ",-1," + i15 + "," + iA + "," + S.c(str2) + "," + S.c(str) + "," + i14 + "," + S.c(str3) + "," + S.c(str4) + "," + S.c(str5) + "," + S.c(str6) + "," + S.c(str7) + "," + S.c(str8) + "," + S.c(str9) + "," + S.c(str10) + "," + S.c(str11) + "," + S.c(str12) + "," + S.c(str13) + "," + S.c(str14);
        r.c("SystemInfoListener", "System Info: ".concat(String.valueOf(str1922222222222)), new Throwable[0]);
        return str1922222222222;
    }

    static String d() {
        return "Akamai BMPSDK/3.3.9 (Android; " + Build.VERSION.RELEASE + "; " + Build.MANUFACTURER + "; " + Build.MODEL + "; " + Locale.getDefault().getLanguage() + ")";
    }

    static String e(Application application) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Settings.Secure.getString(application.getContentResolver(), "android_id");
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("com.akamai.botman.preferences", 0);
        String string = sharedPreferences.getString("ifv", "-1");
        if (string != "-1") {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("ifv", string2);
        editorEdit.commit();
        return string2;
    }

    T() {
    }

    static int a(Context context) throws Exception {
        return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0);
    }

    public static String f() throws InterruptedException, IOException {
        String line;
        try {
            Process processExec = Runtime.getRuntime().exec("cat /proc/cpuinfo");
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    return line;
                }
            } while (!line.contains("architecture"));
            return line.split("architecture: ")[1];
        } catch (Exception e10) {
            C18095A.a(e10);
            return "default-arch";
        }
    }

    public static String g(Application application) throws PackageManager.NameNotFoundException {
        String str;
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            str = packageInfo.versionName + " " + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "-1";
        }
        r.c("SystemInfoListener", "appVersion ".concat(String.valueOf(str)), new Throwable[0]);
        return str;
    }
}
