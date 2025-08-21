package fsimpl;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.DisplayMetrics;
import com.fullstory.util.Log;
import java.util.ArrayList;

/* renamed from: fsimpl.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14247t {
    private static int a(Context context, gh ghVar) {
        cB.a(ghVar);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        cB.a(ghVar, (short) activityManager.getMemoryClass());
        cB.b(ghVar, memoryInfo.threshold);
        cB.a(ghVar, memoryInfo.totalMem);
        try {
            cB.a(ghVar, Long.valueOf(Os.sysconf(OsConstants._SC_PAGE_SIZE)).intValue());
        } catch (Throwable th2) {
            dI.a("Error getting page size", th2);
        }
        return cB.b(ghVar);
    }

    public static int a(Context context, gh ghVar, C14138ck c14138ck) throws ClassNotFoundException {
        int iA = a(ghVar, a(context));
        int iA2 = a(ghVar, context.getPackageName());
        int iC = c(context, ghVar);
        int iA3 = a(context, ghVar);
        int iB = b(ghVar);
        int iA4 = a(ghVar);
        int iB2 = b(context, ghVar);
        int iC2 = c(ghVar);
        int iE = e(ghVar);
        byte b10 = c14138ck.x() > 0 ? (byte) 2 : (byte) 1;
        cE.a(ghVar);
        cE.a(ghVar, iA2);
        cE.b(ghVar, iA4);
        cE.c(ghVar, iA3);
        cE.d(ghVar, iB);
        cE.e(ghVar, iC);
        cE.f(ghVar, iB2);
        cE.g(ghVar, iC2);
        cE.h(ghVar, iA);
        cE.i(ghVar, iE);
        cE.a(ghVar, b10);
        return cE.b(ghVar);
    }

    private static int a(gh ghVar) {
        int iA = a(ghVar, Build.BOARD);
        int iA2 = a(ghVar, Build.BRAND);
        int iA3 = a(ghVar, Build.DEVICE);
        int iA4 = a(ghVar, Build.DISPLAY);
        int iA5 = a(ghVar, Build.HARDWARE);
        int iA6 = a(ghVar, Build.ID);
        int iA7 = a(ghVar, Build.MANUFACTURER);
        int iA8 = a(ghVar, Build.MODEL);
        int iA9 = a(ghVar, Build.PRODUCT);
        int iA10 = a(ghVar, Build.VERSION.CODENAME);
        int iA11 = a(ghVar, Build.VERSION.INCREMENTAL);
        int iA12 = a(ghVar, Build.VERSION.RELEASE);
        int iD = d(ghVar);
        cC.a(ghVar);
        cC.e(ghVar, iA);
        cC.g(ghVar, iA2);
        cC.d(ghVar, iA3);
        cC.b(ghVar, iA4);
        cC.i(ghVar, iA5);
        cC.a(ghVar, iA6);
        cC.f(ghVar, iA7);
        cC.h(ghVar, iA8);
        cC.c(ghVar, iA9);
        cC.m(ghVar, iA10);
        cC.j(ghVar, iA11);
        cC.k(ghVar, iA12);
        cC.l(ghVar, Build.VERSION.SDK_INT);
        cC.n(ghVar, iD);
        return cC.b(ghVar);
    }

    private static int a(gh ghVar, Class cls, String str) {
        try {
            Object obj = cls.getField(str).get(null);
            if (obj == null) {
                return 0;
            }
            return a(ghVar, obj.toString());
        } catch (NoSuchFieldException e10) {
            Log.w("Field " + str + " not found on " + cls);
            return 0;
        } catch (Throwable th2) {
            dI.a("Error reading static field", th2);
            return 0;
        }
    }

    public static int a(gh ghVar, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return ghVar.a(str.trim());
    }

    public static int a(gh ghVar, boolean z10, C14138ck c14138ck) {
        ArrayList arrayList = new ArrayList(2);
        if (z10) {
            arrayList.add((byte) 0);
        }
        if (c14138ck.O()) {
            arrayList.add((byte) 1);
        }
        int size = arrayList.size();
        if (size <= 0) {
            return 0;
        }
        byte[] bArr = new byte[size];
        for (int i10 = 0; i10 < size; i10++) {
            bArr[i10] = ((Byte) arrayList.get(i10)).byteValue();
        }
        return C14167dm.a(ghVar, bArr);
    }

    private static Class a(String str) throws ClassNotFoundException {
        String str2 = str + ".BuildConfig";
        try {
            Log.d("Trying to find build config at " + str2);
            Class<?> cls = Class.forName(str2);
            Log.d("Found build config at " + str2);
            return cls;
        } catch (ClassNotFoundException e10) {
            Log.d("Did not find build config at " + str2);
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf > 0) {
                return a(str.substring(0, iLastIndexOf));
            }
            return null;
        }
    }

    private static String a(Context context) {
        CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        return applicationLabel != null ? applicationLabel.toString() : "";
    }

    private static int b(Context context, gh ghVar) throws ClassNotFoundException {
        String packageName = context.getPackageName();
        Class clsA = a(packageName);
        if (clsA == null) {
            Log.w("Unable to find " + packageName + ".BuildConfig");
            return 0;
        }
        try {
            int iA = a(ghVar, clsA, "BUILD_TYPE");
            int iA2 = a(ghVar, clsA, "FLAVOR");
            if (iA == 0 && iA2 == 0) {
                return 0;
            }
            C14153cz.a(ghVar);
            C14153cz.a(ghVar, iA);
            C14153cz.b(ghVar, iA2);
            return C14153cz.b(ghVar);
        } catch (Throwable th2) {
            dI.a("Unable to find " + packageName + ".BuildConfig", th2);
            return 0;
        }
    }

    private static int b(gh ghVar) {
        PackageInfo packageInfoA = dP.a();
        int iA = a(ghVar, packageInfoA.versionName);
        cD.a(ghVar);
        cD.a(ghVar, iA);
        cD.b(ghVar, dP.a(packageInfoA));
        return cD.b(ghVar);
    }

    private static int c(Context context, gh ghVar) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            systemAvailableFeatures = new FeatureInfo[0];
        }
        int[] iArr = new int[systemAvailableFeatures.length];
        for (int i10 = 0; i10 < systemAvailableFeatures.length; i10++) {
            String str = systemAvailableFeatures[i10].name;
            if (str == null) {
                str = "GL:" + systemAvailableFeatures[i10].reqGlEsVersion;
            }
            iArr[i10] = a(ghVar, str);
        }
        return cE.a(ghVar, iArr);
    }

    private static int c(gh ghVar) {
        DisplayMetrics displayMetricsA = fC.a();
        if (displayMetricsA == null) {
            return 0;
        }
        cA.a(ghVar);
        cA.a(ghVar, displayMetricsA.density);
        cA.a(ghVar, displayMetricsA.densityDpi);
        cA.c(ghVar, C14168dn.a(ghVar, displayMetricsA.xdpi, displayMetricsA.ydpi));
        cA.b(ghVar, displayMetricsA.scaledDensity);
        cA.b(ghVar, Cdo.a(ghVar, displayMetricsA.widthPixels, displayMetricsA.heightPixels));
        return cA.b(ghVar);
    }

    private static int d(gh ghVar) {
        String[] strArr = Build.SUPPORTED_ABIS;
        int[] iArr = new int[strArr.length];
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = a(ghVar, strArr[i10]);
        }
        return cC.a(ghVar, iArr);
    }

    private static int e(gh ghVar) {
        ArrayList arrayList = new ArrayList();
        if (C14118br.e()) {
            arrayList.add((byte) 0);
        }
        if (C14118br.f()) {
            arrayList.add((byte) 7);
        }
        if (C14118br.g()) {
            arrayList.add((byte) 2);
        }
        if (C14118br.h()) {
            arrayList.add((byte) 3);
        }
        if (C14118br.i()) {
            arrayList.add((byte) 6);
        }
        if (C14118br.j()) {
            arrayList.add((byte) 1);
        }
        if (C14118br.a()) {
            arrayList.add((byte) 5);
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = ((Byte) arrayList.get(i10)).byteValue();
        }
        return cE.a(ghVar, bArr);
    }
}
