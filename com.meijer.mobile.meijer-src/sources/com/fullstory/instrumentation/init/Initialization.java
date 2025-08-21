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
import fsimpl.C14118br;
import fsimpl.C14138ck;
import fsimpl.C14145cr;
import fsimpl.R;
import fsimpl.dI;
import fsimpl.dP;
import fsimpl.eY;
import fsimpl.fC;
import fsimpl.fT;
import java.util.Locale;

/* loaded from: classes15.dex */
public class Initialization {

    /* renamed from: a, reason: collision with root package name */
    public static String f65178a;

    /* renamed from: b, reason: collision with root package name */
    private C14138ck f65179b;

    /* renamed from: c, reason: collision with root package name */
    private ConnectivityManager f65180c;

    /* renamed from: d, reason: collision with root package name */
    private WindowManager f65181d;

    /* renamed from: e, reason: collision with root package name */
    private PackageInfo f65182e;

    /* renamed from: f, reason: collision with root package name */
    private Context f65183f;

    private static String a() {
        return Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : ActivityThread.currentProcessName();
    }

    private void a(Application application, Context context, C14145cr c14145cr, boolean z10) {
        Log.v("[startup] init!");
        Bootstrap.success(new R(application, context, this.f65179b, c14145cr, z10));
    }

    private void a(Context context) {
        C14118br.e(this.f65179b.J());
        C14118br.f(this.f65179b.K());
        C14118br.g(this.f65179b.L());
        C14118br.h(this.f65179b.M());
        C14118br.i(this.f65179b.N());
        C14118br.a(this.f65179b.q());
        C14118br.b(this.f65179b.w());
        C14118br.c(this.f65179b.C());
        C14118br.d(this.f65179b.D());
        Log.setLevel(this.f65179b.r());
        Log.setLogcatLevel(this.f65179b.s());
        if (this.f65179b.o()) {
            Log.DISABLE_LOGGING = false;
            this.f65179b.a();
        }
        if (this.f65179b.p()) {
            if (((context.getApplicationInfo().flags & 2) != 0) || this.f65179b.b()) {
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
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f65183f.getSystemService("connectivity");
        this.f65180c = connectivityManager;
        return connectivityManager == null ? b(-32765, "Failed to get ConnectivityManager.", new Object[0]) : b();
    }

    private boolean d() {
        WindowManager windowManager = (WindowManager) this.f65183f.getSystemService("window");
        this.f65181d = windowManager;
        return windowManager == null ? b(-32765, "Failed to get WindowManager.", new Object[0]) : b();
    }

    private boolean e() {
        PackageInfo packageInfoA = dP.a(this.f65183f);
        this.f65182e = packageInfoA;
        return packageInfoA == null ? b(-32764, "Failed to get PackageInfo.", new Object[0]) : b();
    }

    private boolean f() {
        int iM = this.f65179b.m();
        if (iM > Build.VERSION.SDK_INT) {
            return a(Reason.OS_VERSION_TOO_LOW, "API Version %d is less than minimum configured version %d.", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(iM));
        }
        int iN = this.f65179b.n();
        return iN < Build.VERSION.SDK_INT ? a(Reason.OS_VERSION_TOO_HIGH, "API Version %d is greater than maximum configured version %d.", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(iN)) : b();
    }

    private boolean g() {
        return !fT.a() ? b(-32762, "Unable to use necessary reflection.", new Object[0]) : b();
    }

    private void h() {
        f65178a = String.format("FS/%s %s/%d Android/%s  %s %s", "1.62.2", this.f65182e.packageName, Integer.valueOf(dP.a(this.f65182e)), Build.VERSION.RELEASE, Build.BRAND, Build.MODEL);
    }

    public void init(Application application, Context context) {
        this.f65183f = context;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        Boolean[] boolArr = {false};
        try {
            C14138ck c14138ckA = C14138ck.a(context);
            this.f65179b = c14138ckA;
            if (c14138ckA == null) {
                Bootstrap.fail(-32763, "Failed to load configuration.");
                return;
            }
            if (!a(context, c14138ckA.W())) {
                if (!this.f65179b.V()) {
                    Log.i("Not application process, FS will not start for process: " + a());
                    return;
                }
                Log.i("Configured to ignore process check results, proceeding...");
            }
            a(context);
            if (a(context, iMyPid, iMyUid) && b(context, iMyPid, iMyUid) && f() && c() && d() && e() && g() && a(application, boolArr)) {
                C14145cr c14145cr = new C14145cr();
                application.registerActivityLifecycleCallbacks(c14145cr);
                h();
                fC.a(this.f65181d);
                a(application, context, c14145cr, boolArr[0].booleanValue());
            }
        } catch (Throwable th2) {
            dI.a(-32768, "Unexpected error starting up", th2);
        }
    }
}
