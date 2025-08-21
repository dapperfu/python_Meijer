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
import x6.C18097C;
import x6.C18114i;
import x6.C18115j;
import x6.C18124t;
import x6.C18125u;
import x6.C18127w;
import x6.r;

@SuppressLint({"Registered"})
@Deprecated
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static C18097C f65007a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f65008b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f65009c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f65010d;

    /* renamed from: e, reason: collision with root package name */
    private static String f65011e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f65012f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f65013g = 0;

    /* renamed from: com.cyberfend.cyfsecurity.a$a, reason: collision with other inner class name */
    static class C1260a implements C18124t.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f65014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f65015b;

        @Override // x6.C18124t.a
        public final void a(JSONObject jSONObject) throws JSONException {
            String string;
            if (this.f65014a) {
                C18114i.q().g(this.f65015b, a.f65011e, jSONObject);
            }
            try {
                string = jSONObject.getString("serversidesignal");
            } catch (JSONException unused) {
                a.f65007a.c(3);
                string = null;
            }
            a.f65007a.e(this.f65015b, a.f65011e, string);
            a.j();
        }

        C1260a(boolean z10, Application application) {
            this.f65014a = z10;
            this.f65015b = application;
        }

        @Override // x6.C18124t.a
        public final void a() {
            if (this.f65014a) {
                C18114i.q().g(this.f65015b, a.f65011e, null);
            }
            a.f65007a.e(this.f65015b, a.f65011e, null);
            a.f65007a.c(2);
            a.j();
        }
    }

    private static void f(boolean z10, Application application) {
        try {
            String str = f65011e;
            if (str == null || str.length() <= 0) {
                C18097C c18097c = f65007a;
                c18097c.f170398m = false;
                c18097c.i();
            } else {
                f65012f = true;
                int i10 = z10 ? 3 : 2;
                C18124t.a();
                C18124t.b(application, f65011e, i10, new C1260a(z10, application));
            }
        } catch (Exception unused) {
            f65012f = false;
        }
    }

    static /* synthetic */ boolean j() {
        f65012f = false;
        return false;
    }

    public static void o(int i10) {
        if ((i10 < 4 || i10 > 6) && i10 != 15) {
            r.e("CYFMonitor", "Invalid log level specified in setLogLevel(), ignoring.", new Throwable[0]);
        } else {
            r.f170588b.f170589a = i10;
        }
    }

    static {
        FS.log_i("CYFMonitor", "Initializing Akamai BMP SDK Version 3.3.9");
        new Thread(SensorDataBuilder.a().new a()).start();
        f65007a = new C18097C();
        f65008b = false;
        f65009c = false;
        f65010d = false;
        f65011e = null;
        f65012f = false;
    }

    public static void a() {
        try {
            r.c("CYFMonitor", "Stop collecting sensor data", new Throwable[0]);
            f65007a.s();
            f65007a.p();
        } catch (Exception unused) {
        }
    }

    public static void b(Activity activity) {
        try {
            r.c("CYFMonitor", "Start collecting sensor data", new Throwable[0]);
            if (C18127w.f170599c == 0) {
                C18127w.f170599c = SystemClock.uptimeMillis();
            }
            if (C18127w.f170597a == 0) {
                C18127w.f170597a = System.currentTimeMillis();
            }
            f65007a.r();
            f65007a.n();
            if (C18097C.h(activity.getWindow())) {
                return;
            }
            f65007a.m(activity.getWindow());
            f65007a.f((ViewGroup) activity.findViewById(R.id.content));
        } catch (Exception unused) {
        }
    }

    public static void c(Application application) {
        try {
            if (!f65007a.t().booleanValue() || f65012f) {
                return;
            }
            f(false, application);
        } catch (Exception unused) {
        }
    }

    private static void d(Application application, String str, Boolean bool) {
        FS.log_i("CYFMonitor", "Initializing Akamai BMP Monitor");
        if (f65009c) {
            return;
        }
        if (SensorDataBuilder.f65005b) {
            r.c("CYFMonitor", "Load Library Failure", new Throwable[0]);
            return;
        }
        f65007a.c(0);
        long jUptimeMillis = SystemClock.uptimeMillis();
        r.c("CYFMonitor", "Registering activity lifecycle callbacks", new Throwable[0]);
        C18115j.a().b(application);
        f65007a.q(application);
        f65007a.o(application);
        f65007a.k(application);
        f65007a.d(application);
        application.registerActivityLifecycleCallbacks(new C18125u());
        f65009c = true;
        f65008b = true;
        f65011e = str;
        f(bool.booleanValue(), application);
        r.c("CYFMonitor", "Initialize-Time: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms", new Throwable[0]);
    }

    public static void e(boolean z10) {
        f65010d = z10;
    }

    public static C18097C g() {
        return f65007a;
    }

    public static synchronized void k() {
        C18097C.j();
    }

    public static synchronized String l() {
        return f65007a.a();
    }

    public static synchronized void m(Application application, String str) {
        d(application, str, Boolean.FALSE);
    }

    public static boolean n() {
        return f65010d;
    }
}
