package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7055Pb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Activity f69366a;

    /* renamed from: b, reason: collision with root package name */
    private Context f69367b;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f69373h;

    /* renamed from: j, reason: collision with root package name */
    private long f69375j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f69368c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f69369d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f69370e = false;

    /* renamed from: f, reason: collision with root package name */
    private final List f69371f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f69372g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f69374i = false;

    public final Activity a() {
        return this.f69366a;
    }

    public final Context b() {
        return this.f69367b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    private final void k(Activity activity) {
        synchronized (this.f69368c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f69366a = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(InterfaceC7089Qb interfaceC7089Qb) {
        synchronized (this.f69368c) {
            this.f69371f.add(interfaceC7089Qb);
        }
    }

    public final void g(Application application, Context context) {
        if (this.f69374i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f69367b = application;
        this.f69375j = ((Long) Mc.A.c().a(C8659lf.f76279c1)).longValue();
        this.f69374i = true;
    }

    public final void h(InterfaceC7089Qb interfaceC7089Qb) {
        synchronized (this.f69368c) {
            this.f69371f.remove(interfaceC7089Qb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f69368c) {
            try {
                Activity activity2 = this.f69366a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f69366a = null;
                }
                Iterator it = this.f69372g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC7906ec) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        Lc.v.s().x(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        Qc.p.e("", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    C7055Pb() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f69368c) {
            Iterator it = this.f69372g.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC7906ec) it.next()).zzb();
                } catch (Exception e10) {
                    Lc.v.s().x(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    Qc.p.e("", e10);
                }
            }
        }
        this.f69370e = true;
        Runnable runnable = this.f69373h;
        if (runnable != null) {
            Pc.D0.f25081l.removeCallbacks(runnable);
        }
        HandlerC6857Jd0 handlerC6857Jd0 = Pc.D0.f25081l;
        RunnableC7021Ob runnableC7021Ob = new RunnableC7021Ob(this);
        this.f69373h = runnableC7021Ob;
        handlerC6857Jd0.postDelayed(runnableC7021Ob, this.f69375j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f69370e = false;
        boolean z10 = this.f69369d;
        this.f69369d = true;
        Runnable runnable = this.f69373h;
        if (runnable != null) {
            Pc.D0.f25081l.removeCallbacks(runnable);
        }
        synchronized (this.f69368c) {
            Iterator it = this.f69372g.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC7906ec) it.next()).zzc();
                } catch (Exception e10) {
                    Lc.v.s().x(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    Qc.p.e("", e10);
                }
            }
            if (!z10) {
                Iterator it2 = this.f69371f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC7089Qb) it2.next()).a(true);
                    } catch (Exception e11) {
                        Qc.p.e("", e11);
                    }
                }
            } else {
                Qc.p.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }
}
