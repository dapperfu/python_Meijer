package com.google.firebase.perf.metrics;

import ag.C5688a;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.view.AbstractC6165l;
import androidx.view.C6134H;
import androidx.view.InterfaceC6132F;
import androidx.view.InterfaceC6171r;
import bg.k;
import cg.C6505a;
import cg.EnumC6507c;
import cg.e;
import cg.h;
import cg.l;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.session.SessionManager;
import dg.d;
import dg.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC6171r {

    /* renamed from: A, reason: collision with root package name */
    private static volatile AppStartTrace f89888A;

    /* renamed from: B, reason: collision with root package name */
    private static ExecutorService f89889B;

    /* renamed from: y, reason: collision with root package name */
    private static final l f89890y = new C6505a().a();

    /* renamed from: z, reason: collision with root package name */
    private static final long f89891z = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: b, reason: collision with root package name */
    private final k f89893b;

    /* renamed from: c, reason: collision with root package name */
    private final C6505a f89894c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f89895d;

    /* renamed from: e, reason: collision with root package name */
    private final m.b f89896e;

    /* renamed from: f, reason: collision with root package name */
    private Context f89897f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f89898g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f89899h;

    /* renamed from: j, reason: collision with root package name */
    private final l f89901j;

    /* renamed from: k, reason: collision with root package name */
    private final l f89902k;

    /* renamed from: t, reason: collision with root package name */
    private C5688a f89911t;

    /* renamed from: a, reason: collision with root package name */
    private boolean f89892a = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f89900i = false;

    /* renamed from: l, reason: collision with root package name */
    private l f89903l = null;

    /* renamed from: m, reason: collision with root package name */
    private l f89904m = null;

    /* renamed from: n, reason: collision with root package name */
    private l f89905n = null;

    /* renamed from: o, reason: collision with root package name */
    private l f89906o = null;

    /* renamed from: p, reason: collision with root package name */
    private l f89907p = null;

    /* renamed from: q, reason: collision with root package name */
    private l f89908q = null;

    /* renamed from: r, reason: collision with root package name */
    private l f89909r = null;

    /* renamed from: s, reason: collision with root package name */
    private l f89910s = null;

    /* renamed from: u, reason: collision with root package name */
    private boolean f89912u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f89913v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final b f89914w = new b();

    /* renamed from: x, reason: collision with root package name */
    private boolean f89915x = false;

    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.h(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AppStartTrace f89917a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89917a.f89903l == null) {
                this.f89917a.f89912u = true;
            }
        }

        public c(AppStartTrace appStartTrace) {
            this.f89917a = appStartTrace;
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.f89912u && this.f89903l == null) {
                this.f89915x = this.f89915x || n(this.f89897f);
                this.f89898g = new WeakReference<>(activity);
                this.f89903l = this.f89894c.a();
                if (m().d(this.f89903l) > f89891z) {
                    this.f89900i = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f89912u && !this.f89900i) {
                boolean zH = this.f89895d.h();
                if (zH && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f89914w);
                    e.d(viewFindViewById, new Runnable() { // from class: Xf.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f42249a.q();
                        }
                    });
                    h.a(viewFindViewById, new Runnable() { // from class: Xf.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f42250a.r();
                        }
                    }, new Runnable() { // from class: Xf.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f42251a.s();
                        }
                    });
                }
                if (this.f89905n != null) {
                    return;
                }
                this.f89899h = new WeakReference<>(activity);
                this.f89905n = this.f89894c.a();
                this.f89911t = SessionManager.getInstance().perfSession();
                Wf.a.e().a("onResume(): " + activity.getClass().getName() + ": " + i().d(this.f89905n) + " microseconds");
                f89889B.execute(new Runnable() { // from class: Xf.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42252a.o();
                    }
                });
                if (!zH) {
                    u();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f89912u && this.f89904m == null && !this.f89900i) {
            this.f89904m = this.f89894c.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public synchronized void t(Context context) {
        try {
            if (this.f89892a) {
                return;
            }
            C6134H.l().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f89915x = this.f89915x || n(applicationContext);
                this.f89892a = true;
                this.f89897f = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void u() {
        if (this.f89892a) {
            C6134H.l().getLifecycle().d(this);
            ((Application) this.f89897f).unregisterActivityLifecycleCallbacks(this);
            this.f89892a = false;
        }
    }

    static /* synthetic */ int h(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.f89913v;
        appStartTrace.f89913v = i10 + 1;
        return i10;
    }

    private l i() {
        l lVar = this.f89902k;
        return lVar != null ? lVar : f89890y;
    }

    public static AppStartTrace j() {
        return f89888A != null ? f89888A : k(k.k(), new C6505a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace k(k kVar, C6505a c6505a) {
        if (f89888A == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f89888A == null) {
                        f89888A = new AppStartTrace(kVar, c6505a, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, 10 + f89891z, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f89888A;
    }

    private l m() {
        l lVar = this.f89901j;
        return lVar != null ? lVar : i();
    }

    public static boolean n(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    private void p(final m.b bVar) {
        if (this.f89908q == null || this.f89909r == null || this.f89910s == null) {
            return;
        }
        f89889B.execute(new Runnable() { // from class: Xf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f42253a.f89893b.x(bVar.build(), dg.d.FOREGROUND_BACKGROUND);
            }
        });
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.f89910s != null) {
            return;
        }
        this.f89910s = this.f89894c.a();
        this.f89896e.J(m.F0().Q("_experiment_onDrawFoQ").O(m().e()).P(m().d(this.f89910s)).build());
        if (this.f89901j != null) {
            this.f89896e.J(m.F0().Q("_experiment_procStart_to_classLoad").O(m().e()).P(m().d(i())).build());
        }
        this.f89896e.N("systemDeterminedForeground", this.f89915x ? "true" : "false");
        this.f89896e.M("onDrawCount", this.f89913v);
        this.f89896e.I(this.f89911t.a());
        p(this.f89896e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f89908q != null) {
            return;
        }
        this.f89908q = this.f89894c.a();
        this.f89896e.O(m().e()).P(m().d(this.f89908q));
        p(this.f89896e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.f89909r != null) {
            return;
        }
        this.f89909r = this.f89894c.a();
        this.f89896e.J(m.F0().Q("_experiment_preDrawFoQ").O(m().e()).P(m().d(this.f89909r)).build());
        p(this.f89896e);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f89912u || this.f89900i || !this.f89895d.h() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f89914w);
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f89912u || this.f89900i || this.f89907p != null) {
            return;
        }
        this.f89907p = this.f89894c.a();
        this.f89896e.J(m.F0().Q("_experiment_firstBackgrounding").O(m().e()).P(m().d(this.f89907p)).build());
    }

    @InterfaceC6132F(AbstractC6165l.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f89912u || this.f89900i || this.f89906o != null) {
            return;
        }
        this.f89906o = this.f89894c.a();
        this.f89896e.J(m.F0().Q("_experiment_firstForegrounding").O(m().e()).P(m().d(this.f89906o)).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppStartTrace(k kVar, C6505a c6505a, com.google.firebase.perf.config.a aVar, ExecutorService executorService) {
        this.f89893b = kVar;
        this.f89894c = c6505a;
        this.f89895d = aVar;
        f89889B = executorService;
        this.f89896e = m.F0().Q("_experiment_app_start_ttid");
        this.f89901j = l.f(Process.getStartElapsedRealtime());
        n nVar = (n) f.l().j(n.class);
        this.f89902k = nVar != null ? l.f(nVar.b()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        m.b bVarP = m.F0().Q(EnumC6507c.APP_START_TRACE_NAME.toString()).O(i().e()).P(i().d(this.f89905n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.F0().Q(EnumC6507c.ON_CREATE_TRACE_NAME.toString()).O(i().e()).P(i().d(this.f89903l)).build());
        if (this.f89904m != null) {
            m.b bVarF0 = m.F0();
            bVarF0.Q(EnumC6507c.ON_START_TRACE_NAME.toString()).O(this.f89903l.e()).P(this.f89903l.d(this.f89904m));
            arrayList.add(bVarF0.build());
            m.b bVarF02 = m.F0();
            bVarF02.Q(EnumC6507c.ON_RESUME_TRACE_NAME.toString()).O(this.f89904m.e()).P(this.f89904m.d(this.f89905n));
            arrayList.add(bVarF02.build());
        }
        bVarP.H(arrayList).I(this.f89911t.a());
        this.f89893b.x((m) bVarP.build(), d.FOREGROUND_BACKGROUND);
    }
}
