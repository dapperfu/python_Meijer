package Wa;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import eb.C13786c;
import eb.C13787d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private static final C13786c f40882f = C13787d.a(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static a f40883g;

    /* renamed from: a, reason: collision with root package name */
    private Handler f40884a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40885b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f40886c = true;

    /* renamed from: d, reason: collision with root package name */
    public final List<b> f40887d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private Runnable f40888e;

    /* renamed from: Wa.a$a, reason: collision with other inner class name */
    final class RunnableC0878a implements Runnable {
        RunnableC0878a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!a.this.f40885b || !a.this.f40886c) {
                a.f40882f.c("still foreground", new Object[0]);
                return;
            }
            a.g(a.this);
            a.f40882f.c("went background", new Object[0]);
            Iterator it = a.this.f40887d.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).b();
                } catch (Exception e10) {
                    a.f40882f.g("Listener failed", e10);
                }
            }
        }
    }

    static /* synthetic */ boolean g(a aVar) {
        aVar.f40885b = false;
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
        this.f40886c = true;
        Runnable runnable = this.f40888e;
        if (runnable != null) {
            this.f40884a.removeCallbacks(runnable);
        }
        Handler handler = this.f40884a;
        RunnableC0878a runnableC0878a = new RunnableC0878a();
        this.f40888e = runnableC0878a;
        handler.postDelayed(runnableC0878a, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f40886c = false;
        boolean z10 = this.f40885b;
        this.f40885b = true;
        Runnable runnable = this.f40888e;
        if (runnable != null) {
            this.f40884a.removeCallbacks(runnable);
        }
        if (z10) {
            f40882f.c("still foreground", new Object[0]);
            return;
        }
        f40882f.c("went foreground", new Object[0]);
        Iterator<b> it = this.f40887d.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Exception e10) {
                f40882f.g("Listener failed", e10);
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
        return f40883g;
    }

    public static a b(Application application, Handler handler) {
        a aVar = f40883g;
        if (aVar != null) {
            application.unregisterActivityLifecycleCallbacks(aVar);
        }
        a aVar2 = new a(application, handler);
        f40883g = aVar2;
        return aVar2;
    }

    public final void c(b bVar) {
        this.f40887d.add(bVar);
    }

    private a(Application application, Handler handler) {
        this.f40884a = handler;
        application.registerActivityLifecycleCallbacks(this);
    }
}
