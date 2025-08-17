package com.cyberfend.cyfsecurity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.cyberfend.cyfsecurity.SensorDataBuilder.a;
import com.fullstory.FS;
import org.json.JSONException;
import org.json.JSONObject;
import w6.C17776C;
import w6.C17787i;
import w6.C17788j;
import w6.C17797t;
import w6.C17798u;
import w6.C17800w;
import w6.r;

@SuppressLint({"Registered"})
@Deprecated
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static C17776C f64167a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f64168b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f64169c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f64170d;

    /* renamed from: e, reason: collision with root package name */
    private static String f64171e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f64172f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f64173g = 0;

    /* renamed from: com.cyberfend.cyfsecurity.a$a, reason: collision with other inner class name */
    static class C1251a implements C17797t.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f64174a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f64175b;

        @Override // w6.C17797t.a
        public final void a(JSONObject jSONObject) throws JSONException {
            String string;
            if (this.f64174a) {
                C17787i.q().g(this.f64175b, a.f64171e, jSONObject);
            }
            try {
                string = jSONObject.getString("serversidesignal");
            } catch (JSONException unused) {
                a.f64167a.c(3);
                string = null;
            }
            a.f64167a.e(this.f64175b, a.f64171e, string);
            a.j();
        }

        C1251a(boolean z10, Application application) {
            this.f64174a = z10;
            this.f64175b = application;
        }

        @Override // w6.C17797t.a
        public final void a() {
            if (this.f64174a) {
                C17787i.q().g(this.f64175b, a.f64171e, null);
            }
            a.f64167a.e(this.f64175b, a.f64171e, null);
            a.f64167a.c(2);
            a.j();
        }
    }

    private static void f(boolean z10, Application application) {
        try {
            String str = f64171e;
            if (str == null || str.length() <= 0) {
                C17776C c17776c = f64167a;
                c17776c.f165753m = false;
                c17776c.i();
            } else {
                f64172f = true;
                int i10 = z10 ? 3 : 2;
                C17797t.a();
                C17797t.b(application, f64171e, i10, new C1251a(z10, application));
            }
        } catch (Exception unused) {
            f64172f = false;
        }
    }

    static /* synthetic */ boolean j() {
        f64172f = false;
        return false;
    }

    public static void o(int i10) {
        if ((i10 < 4 || i10 > 6) && i10 != 15) {
            r.e("CYFMonitor", "Invalid log level specified in setLogLevel(), ignoring.", new Throwable[0]);
        } else {
            r.f165943b.f165944a = i10;
        }
    }

    static {
        FS.log_i("CYFMonitor", "Initializing Akamai BMP SDK Version 3.3.9");
        new Thread(SensorDataBuilder.a().new a()).start();
        f64167a = new C17776C();
        f64168b = false;
        f64169c = false;
        f64170d = false;
        f64171e = null;
        f64172f = false;
    }

    public static void a() {
        try {
            r.c("CYFMonitor", "Stop collecting sensor data", new Throwable[0]);
            f64167a.s();
            f64167a.p();
        } catch (Exception unused) {
        }
    }

    public static void b(Activity activity) {
        try {
            r.c("CYFMonitor", "Start collecting sensor data", new Throwable[0]);
            if (C17800w.f165954c == 0) {
                C17800w.f165954c = SystemClock.uptimeMillis();
            }
            if (C17800w.f165952a == 0) {
                C17800w.f165952a = System.currentTimeMillis();
            }
            f64167a.r();
            f64167a.n();
            if (C17776C.h(activity.getWindow())) {
                return;
            }
            f64167a.m(activity.getWindow());
            f64167a.f((ViewGroup) activity.findViewById(R.id.content));
        } catch (Exception unused) {
        }
    }

    public static void c(Application application) {
        try {
            if (!f64167a.t().booleanValue() || f64172f) {
                return;
            }
            f(false, application);
        } catch (Exception unused) {
        }
    }

    private static void d(Application application, String str, Boolean bool) {
        FS.log_i("CYFMonitor", "Initializing Akamai BMP Monitor");
        if (f64169c) {
            return;
        }
        if (SensorDataBuilder.f64165b) {
            r.c("CYFMonitor", "Load Library Failure", new Throwable[0]);
            return;
        }
        f64167a.c(0);
        long jUptimeMillis = SystemClock.uptimeMillis();
        r.c("CYFMonitor", "Registering activity lifecycle callbacks", new Throwable[0]);
        C17788j.a().b(application);
        f64167a.q(application);
        f64167a.o(application);
        f64167a.k(application);
        f64167a.d(application);
        application.registerActivityLifecycleCallbacks(new C17798u());
        f64169c = true;
        f64168b = true;
        f64171e = str;
        f(bool.booleanValue(), application);
        r.c("CYFMonitor", "Initialize-Time: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms", new Throwable[0]);
    }

    public static void e(boolean z10) {
        f64170d = z10;
    }

    public static C17776C g() {
        return f64167a;
    }

    public static synchronized void k() {
        C17776C.j();
    }

    public static synchronized String l() {
        return f64167a.a();
    }

    public static synchronized void m(Application application, String str) {
        d(application, str, Boolean.FALSE);
    }

    public static boolean n() {
        return f64170d;
    }
}
