package com.google.firebase.perf.metrics;

import Zf.k;
import ag.C5599a;
import ag.EnumC5601c;
import ag.e;
import ag.h;
import ag.l;
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
import androidx.view.AbstractC6023l;
import androidx.view.C5992H;
import androidx.view.InterfaceC5990F;
import androidx.view.InterfaceC6029r;
import bg.d;
import bg.m;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC6029r {

    /* renamed from: A, reason: collision with root package name */
    private static volatile AppStartTrace f89046A;

    /* renamed from: B, reason: collision with root package name */
    private static ExecutorService f89047B;

    /* renamed from: y, reason: collision with root package name */
    private static final l f89048y = new C5599a().a();

    /* renamed from: z, reason: collision with root package name */
    private static final long f89049z = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: b, reason: collision with root package name */
    private final k f89051b;

    /* renamed from: c, reason: collision with root package name */
    private final C5599a f89052c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f89053d;

    /* renamed from: e, reason: collision with root package name */
    private final m.b f89054e;

    /* renamed from: f, reason: collision with root package name */
    private Context f89055f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f89056g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f89057h;

    /* renamed from: j, reason: collision with root package name */
    private final l f89059j;

    /* renamed from: k, reason: collision with root package name */
    private final l f89060k;

    /* renamed from: t, reason: collision with root package name */
    private Yf.a f89069t;

    /* renamed from: a, reason: collision with root package name */
    private boolean f89050a = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f89058i = false;

    /* renamed from: l, reason: collision with root package name */
    private l f89061l = null;

    /* renamed from: m, reason: collision with root package name */
    private l f89062m = null;

    /* renamed from: n, reason: collision with root package name */
    private l f89063n = null;

    /* renamed from: o, reason: collision with root package name */
    private l f89064o = null;

    /* renamed from: p, reason: collision with root package name */
    private l f89065p = null;

    /* renamed from: q, reason: collision with root package name */
    private l f89066q = null;

    /* renamed from: r, reason: collision with root package name */
    private l f89067r = null;

    /* renamed from: s, reason: collision with root package name */
    private l f89068s = null;

    /* renamed from: u, reason: collision with root package name */
    private boolean f89070u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f89071v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final b f89072w = new b();

    /* renamed from: x, reason: collision with root package name */
    private boolean f89073x = false;

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
        private final AppStartTrace f89075a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89075a.f89061l == null) {
                this.f89075a.f89070u = true;
            }
        }

        public c(AppStartTrace appStartTrace) {
            this.f89075a = appStartTrace;
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
            if (!this.f89070u && this.f89061l == null) {
                this.f89073x = this.f89073x || n(this.f89055f);
                this.f89056g = new WeakReference<>(activity);
                this.f89061l = this.f89052c.a();
                if (m().d(this.f89061l) > f89049z) {
                    this.f89058i = true;
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
            if (!this.f89070u && !this.f89058i) {
                boolean zH = this.f89053d.h();
                if (zH && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f89072w);
                    e.d(viewFindViewById, new Runnable() { // from class: Vf.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37537a.q();
                        }
                    });
                    h.a(viewFindViewById, new Runnable() { // from class: Vf.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37538a.r();
                        }
                    }, new Runnable() { // from class: Vf.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37539a.s();
                        }
                    });
                }
                if (this.f89063n != null) {
                    return;
                }
                this.f89057h = new WeakReference<>(activity);
                this.f89063n = this.f89052c.a();
                this.f89069t = SessionManager.getInstance().perfSession();
                Uf.a.e().a("onResume(): " + activity.getClass().getName() + ": " + i().d(this.f89063n) + " microseconds");
                f89047B.execute(new Runnable() { // from class: Vf.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37540a.o();
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
        if (!this.f89070u && this.f89062m == null && !this.f89058i) {
            this.f89062m = this.f89052c.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public synchronized void t(Context context) {
        try {
            if (this.f89050a) {
                return;
            }
            C5992H.l().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f89073x = this.f89073x || n(applicationContext);
                this.f89050a = true;
                this.f89055f = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void u() {
        if (this.f89050a) {
            C5992H.l().getLifecycle().d(this);
            ((Application) this.f89055f).unregisterActivityLifecycleCallbacks(this);
            this.f89050a = false;
        }
    }

    static /* synthetic */ int h(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.f89071v;
        appStartTrace.f89071v = i10 + 1;
        return i10;
    }

    private l i() {
        l lVar = this.f89060k;
        return lVar != null ? lVar : f89048y;
    }

    public static AppStartTrace j() {
        return f89046A != null ? f89046A : k(k.k(), new C5599a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace k(k kVar, C5599a c5599a) {
        if (f89046A == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f89046A == null) {
                        f89046A = new AppStartTrace(kVar, c5599a, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, 10 + f89049z, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f89046A;
    }

    private l m() {
        l lVar = this.f89059j;
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
        if (this.f89066q == null || this.f89067r == null || this.f89068s == null) {
            return;
        }
        f89047B.execute(new Runnable() { // from class: Vf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f37541a.f89051b.x(bVar.build(), bg.d.FOREGROUND_BACKGROUND);
            }
        });
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.f89068s != null) {
            return;
        }
        this.f89068s = this.f89052c.a();
        this.f89054e.J(m.F0().Q("_experiment_onDrawFoQ").O(m().e()).P(m().d(this.f89068s)).build());
        if (this.f89059j != null) {
            this.f89054e.J(m.F0().Q("_experiment_procStart_to_classLoad").O(m().e()).P(m().d(i())).build());
        }
        this.f89054e.N("systemDeterminedForeground", this.f89073x ? "true" : "false");
        this.f89054e.M("onDrawCount", this.f89071v);
        this.f89054e.I(this.f89069t.a());
        p(this.f89054e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f89066q != null) {
            return;
        }
        this.f89066q = this.f89052c.a();
        this.f89054e.O(m().e()).P(m().d(this.f89066q));
        p(this.f89054e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.f89067r != null) {
            return;
        }
        this.f89067r = this.f89052c.a();
        this.f89054e.J(m.F0().Q("_experiment_preDrawFoQ").O(m().e()).P(m().d(this.f89067r)).build());
        p(this.f89054e);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f89070u || this.f89058i || !this.f89053d.h() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f89072w);
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f89070u || this.f89058i || this.f89065p != null) {
            return;
        }
        this.f89065p = this.f89052c.a();
        this.f89054e.J(m.F0().Q("_experiment_firstBackgrounding").O(m().e()).P(m().d(this.f89065p)).build());
    }

    @InterfaceC5990F(AbstractC6023l.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f89070u || this.f89058i || this.f89064o != null) {
            return;
        }
        this.f89064o = this.f89052c.a();
        this.f89054e.J(m.F0().Q("_experiment_firstForegrounding").O(m().e()).P(m().d(this.f89064o)).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppStartTrace(k kVar, C5599a c5599a, com.google.firebase.perf.config.a aVar, ExecutorService executorService) {
        this.f89051b = kVar;
        this.f89052c = c5599a;
        this.f89053d = aVar;
        f89047B = executorService;
        this.f89054e = m.F0().Q("_experiment_app_start_ttid");
        this.f89059j = l.f(Process.getStartElapsedRealtime());
        n nVar = (n) f.l().j(n.class);
        this.f89060k = nVar != null ? l.f(nVar.b()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        m.b bVarP = m.F0().Q(EnumC5601c.APP_START_TRACE_NAME.toString()).O(i().e()).P(i().d(this.f89063n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.F0().Q(EnumC5601c.ON_CREATE_TRACE_NAME.toString()).O(i().e()).P(i().d(this.f89061l)).build());
        if (this.f89062m != null) {
            m.b bVarF0 = m.F0();
            bVarF0.Q(EnumC5601c.ON_START_TRACE_NAME.toString()).O(this.f89061l.e()).P(this.f89061l.d(this.f89062m));
            arrayList.add(bVarF0.build());
            m.b bVarF02 = m.F0();
            bVarF02.Q(EnumC5601c.ON_RESUME_TRACE_NAME.toString()).O(this.f89062m.e()).P(this.f89062m.d(this.f89063n));
            arrayList.add(bVarF02.build());
        }
        bVarP.H(arrayList).I(this.f89069t.a());
        this.f89051b.x((m) bVarP.build(), d.FOREGROUND_BACKGROUND);
    }
}
