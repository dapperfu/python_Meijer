package Ua;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import cb.C6382c;
import cb.C6383d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private static final C6382c f35857f = C6383d.a(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static a f35858g;

    /* renamed from: a, reason: collision with root package name */
    private Handler f35859a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35860b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35861c = true;

    /* renamed from: d, reason: collision with root package name */
    public final List<b> f35862d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private Runnable f35863e;

    /* renamed from: Ua.a$a, reason: collision with other inner class name */
    final class RunnableC0785a implements Runnable {
        RunnableC0785a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!a.this.f35860b || !a.this.f35861c) {
                a.f35857f.c("still foreground", new Object[0]);
                return;
            }
            a.g(a.this);
            a.f35857f.c("went background", new Object[0]);
            Iterator it = a.this.f35862d.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).b();
                } catch (Exception e10) {
                    a.f35857f.g("Listener failed", e10);
                }
            }
        }
    }

    static /* synthetic */ boolean g(a aVar) {
        aVar.f35860b = false;
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f35861c = true;
        Runnable runnable = this.f35863e;
        if (runnable != null) {
            this.f35859a.removeCallbacks(runnable);
        }
        Handler handler = this.f35859a;
        RunnableC0785a runnableC0785a = new RunnableC0785a();
        this.f35863e = runnableC0785a;
        handler.postDelayed(runnableC0785a, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f35861c = false;
        boolean z10 = this.f35860b;
        this.f35860b = true;
        Runnable runnable = this.f35863e;
        if (runnable != null) {
            this.f35859a.removeCallbacks(runnable);
        }
        if (z10) {
            f35857f.c("still foreground", new Object[0]);
            return;
        }
        f35857f.c("went foreground", new Object[0]);
        Iterator<b> it = this.f35862d.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Exception e10) {
                f35857f.g("Listener failed", e10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public static a a() {
        return f35858g;
    }

    public static a b(Application application, Handler handler) {
        a aVar = f35858g;
        if (aVar != null) {
            application.unregisterActivityLifecycleCallbacks(aVar);
        }
        a aVar2 = new a(application, handler);
        f35858g = aVar2;
        return aVar2;
    }

    public final void c(b bVar) {
        this.f35862d.add(bVar);
    }

    private a(Application application, Handler handler) {
        this.f35859a = handler;
        application.registerActivityLifecycleCallbacks(this);
    }
}
