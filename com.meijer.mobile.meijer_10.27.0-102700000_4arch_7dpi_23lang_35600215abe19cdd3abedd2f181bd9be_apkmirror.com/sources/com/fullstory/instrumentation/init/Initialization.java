package com.fullstory.instrumentation.init;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Process;
import android.view.WindowManager;
import com.fullstory.Reason;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.jni.FSNative;
import com.fullstory.util.Log;
import fsimpl.C13993br;
import fsimpl.C14013ck;
import fsimpl.C14020cr;
import fsimpl.R;
import fsimpl.dI;
import fsimpl.dP;
import fsimpl.eY;
import fsimpl.fC;
import fsimpl.fT;
import java.util.Locale;

/* loaded from: classes14.dex */
public class Initialization {

    /* renamed from: a, reason: collision with root package name */
    public static String f64338a;

    /* renamed from: b, reason: collision with root package name */
    private C14013ck f64339b;

    /* renamed from: c, reason: collision with root package name */
    private ConnectivityManager f64340c;

    /* renamed from: d, reason: collision with root package name */
    private WindowManager f64341d;

    /* renamed from: e, reason: collision with root package name */
    private PackageInfo f64342e;

    /* renamed from: f, reason: collision with root package name */
    private Context f64343f;

    private static String a() {
        return Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : ActivityThread.currentProcessName();
    }

    private void a(Application application, Context context, C14020cr c14020cr, boolean z10) {
        Log.v("[startup] init!");
        Bootstrap.success(new R(application, context, this.f64339b, c14020cr, z10));
    }

    private void a(Context context) {
        C13993br.e(this.f64339b.J());
        C13993br.f(this.f64339b.K());
        C13993br.g(this.f64339b.L());
        C13993br.h(this.f64339b.M());
        C13993br.i(this.f64339b.N());
        C13993br.a(this.f64339b.q());
        C13993br.b(this.f64339b.w());
        C13993br.c(this.f64339b.C());
        C13993br.d(this.f64339b.D());
        Log.setLevel(this.f64339b.r());
        Log.setLogcatLevel(this.f64339b.s());
        if (this.f64339b.o()) {
            Log.DISABLE_LOGGING = false;
            this.f64339b.a();
        }
        if (this.f64339b.p()) {
            if (((context.getApplicationInfo().flags & 2) != 0) || this.f64339b.b()) {
                Log.API_TRACE = true;
            } else {
                Log.logAlways("API Trace disabled for non-debuggable build");
            }
        }
    }

    private static boolean a(int i10, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Bootstrap.disable(i10, str);
        return false;
    }

    private boolean a(Application application, Boolean[] boolArr) {
        Log.i("Initialized " + application.getClass() + " (SDK " + Build.VERSION.SDK_INT + ")");
        if (!FSNative.a()) {
            return b(-32766, "Unable to load FSNative.", new Object[0]);
        }
        boolArr[0] = Boolean.valueOf(!eY.hook());
        return b();
    }

    private boolean a(Context context, int i10, int i11) {
        return context.checkPermission("android.permission.INTERNET", i10, i11) == -1 ? a(-32767, "Missing %s permission", "android.permission.INTERNET") : b();
    }

    private static boolean a(Context context, String str) {
        String strA = a();
        if (str != null) {
            return str.equals(strA);
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str2 = applicationInfo != null ? applicationInfo.packageName : null;
        return str2 != null && str2.equals(strA);
    }

    private static boolean b() {
        return true;
    }

    private static boolean b(int i10, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Bootstrap.fail(i10, str);
        return false;
    }

    private boolean b(Context context, int i10, int i11) {
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", i10, i11) == -1 ? a(-32767, "Missing %s permission.", "android.permission.ACCESS_NETWORK_STATE") : b();
    }

    private boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f64343f.getSystemService("connectivity");
        this.f64340c = connectivityManager;
        return connectivityManager == null ? b(-32765, "Failed to get ConnectivityManager.", new Object[0]) : b();
    }

    private boolean d() {
        WindowManager windowManager = (WindowManager) this.f64343f.getSystemService("window");
        this.f64341d = windowManager;
        return windowManager == null ? b(-32765, "Failed to get WindowManager.", new Object[0]) : b();
    }

    private boolean e() {
        PackageInfo packageInfoA = dP.a(this.f64343f);
        this.f64342e = packageInfoA;
        return packageInfoA == null ? b(-32764, "Failed to get PackageInfo.", new Object[0]) : b();
    }

    private boolean f() {
        int iM = this.f64339b.m();
        if (iM > Build.VERSION.SDK_INT) {
            return a(Reason.OS_VERSION_TOO_LOW, "API Version %d is less than minimum configured version %d.", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(iM));
        }
        int iN = this.f64339b.n();
        return iN < Build.VERSION.SDK_INT ? a(Reason.OS_VERSION_TOO_HIGH, "API Version %d is greater than maximum configured version %d.", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(iN)) : b();
    }

    private boolean g() {
        return !fT.a() ? b(-32762, "Unable to use necessary reflection.", new Object[0]) : b();
    }

    private void h() {
        f64338a = String.format("FS/%s %s/%d Android/%s  %s %s", "1.62.0", this.f64342e.packageName, Integer.valueOf(dP.a(this.f64342e)), Build.VERSION.RELEASE, Build.BRAND, Build.MODEL);
    }

    public void init(Application application, Context context) {
        this.f64343f = context;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        Boolean[] boolArr = {false};
        try {
            C14013ck c14013ckA = C14013ck.a(context);
            this.f64339b = c14013ckA;
            if (c14013ckA == null) {
                Bootstrap.fail(-32763, "Failed to load configuration.");
                return;
            }
            if (!a(context, c14013ckA.W())) {
                if (!this.f64339b.V()) {
                    Log.i("Not application process, FS will not start for process: " + a());
                    return;
                }
                Log.i("Configured to ignore process check results, proceeding...");
            }
            a(context);
            if (a(context, iMyPid, iMyUid) && b(context, iMyPid, iMyUid) && f() && c() && d() && e() && g() && a(application, boolArr)) {
                C14020cr c14020cr = new C14020cr();
                application.registerActivityLifecycleCallbacks(c14020cr);
                h();
                fC.a(this.f64341d);
                a(application, context, c14020cr, boolArr[0].booleanValue());
            }
        } catch (Throwable th2) {
            dI.a(-32768, "Unexpected error starting up", th2);
        }
    }
}
