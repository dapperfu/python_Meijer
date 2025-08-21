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
final class C7180Pb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Activity f70206a;

    /* renamed from: b, reason: collision with root package name */
    private Context f70207b;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f70213h;

    /* renamed from: j, reason: collision with root package name */
    private long f70215j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f70208c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f70209d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70210e = false;

    /* renamed from: f, reason: collision with root package name */
    private final List f70211f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f70212g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f70214i = false;

    public final Activity a() {
        return this.f70206a;
    }

    public final Context b() {
        return this.f70207b;
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
        synchronized (this.f70208c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f70206a = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(InterfaceC7214Qb interfaceC7214Qb) {
        synchronized (this.f70208c) {
            this.f70211f.add(interfaceC7214Qb);
        }
    }

    public final void g(Application application, Context context) {
        if (this.f70214i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f70207b = application;
        this.f70215j = ((Long) Oc.A.c().a(C8784lf.f77119c1)).longValue();
        this.f70214i = true;
    }

    public final void h(InterfaceC7214Qb interfaceC7214Qb) {
        synchronized (this.f70208c) {
            this.f70211f.remove(interfaceC7214Qb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f70208c) {
            try {
                Activity activity2 = this.f70206a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f70206a = null;
                }
                Iterator it = this.f70212g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC8031ec) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        Nc.v.s().x(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        Sc.p.e("", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    C7180Pb() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f70208c) {
            Iterator it = this.f70212g.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC8031ec) it.next()).zzb();
                } catch (Exception e10) {
                    Nc.v.s().x(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    Sc.p.e("", e10);
                }
            }
        }
        this.f70210e = true;
        Runnable runnable = this.f70213h;
        if (runnable != null) {
            Rc.D0.f32295l.removeCallbacks(runnable);
        }
        HandlerC6982Jd0 handlerC6982Jd0 = Rc.D0.f32295l;
        RunnableC7146Ob runnableC7146Ob = new RunnableC7146Ob(this);
        this.f70213h = runnableC7146Ob;
        handlerC6982Jd0.postDelayed(runnableC7146Ob, this.f70215j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f70210e = false;
        boolean z10 = this.f70209d;
        this.f70209d = true;
        Runnable runnable = this.f70213h;
        if (runnable != null) {
            Rc.D0.f32295l.removeCallbacks(runnable);
        }
        synchronized (this.f70208c) {
            Iterator it = this.f70212g.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC8031ec) it.next()).zzc();
                } catch (Exception e10) {
                    Nc.v.s().x(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    Sc.p.e("", e10);
                }
            }
            if (!z10) {
                Iterator it2 = this.f70211f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC7214Qb) it2.next()).a(true);
                    } catch (Exception e11) {
                        Sc.p.e("", e11);
                    }
                }
            } else {
                Sc.p.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }
}
