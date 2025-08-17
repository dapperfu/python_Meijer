package hd;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C14402c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C14402c f134613e = new ComponentCallbacks2C14402c();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f134614a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f134615b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f134616c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f134617d = false;

    /* renamed from: hd.c$a */
    public interface a {
        void a(boolean z10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static ComponentCallbacks2C14402c b() {
        return f134613e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C14402c componentCallbacks2C14402c = f134613e;
        synchronized (componentCallbacks2C14402c) {
            try {
                if (!componentCallbacks2C14402c.f134617d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C14402c);
                    application.registerComponentCallbacks(componentCallbacks2C14402c);
                    componentCallbacks2C14402c.f134617d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f134613e) {
            try {
                Iterator it = this.f134616c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f134613e) {
            this.f134616c.add(aVar);
        }
    }

    public boolean d() {
        return this.f134614a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f134615b.get()) {
            if (com.google.android.gms.common.util.p.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f134615b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f134614a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f134615b;
        boolean zCompareAndSet = this.f134614a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f134615b;
        boolean zCompareAndSet = this.f134614a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f134614a.compareAndSet(false, true)) {
            this.f134615b.set(true);
            f(true);
        }
    }

    private ComponentCallbacks2C14402c() {
    }
}
