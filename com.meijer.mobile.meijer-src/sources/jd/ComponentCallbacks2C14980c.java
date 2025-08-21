package jd;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C14980c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C14980c f140302e = new ComponentCallbacks2C14980c();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f140303a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f140304b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f140305c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f140306d = false;

    /* renamed from: jd.c$a */
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

    public static ComponentCallbacks2C14980c b() {
        return f140302e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C14980c componentCallbacks2C14980c = f140302e;
        synchronized (componentCallbacks2C14980c) {
            try {
                if (!componentCallbacks2C14980c.f140306d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C14980c);
                    application.registerComponentCallbacks(componentCallbacks2C14980c);
                    componentCallbacks2C14980c.f140306d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f140302e) {
            try {
                Iterator it = this.f140305c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f140302e) {
            this.f140305c.add(aVar);
        }
    }

    public boolean d() {
        return this.f140303a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f140304b.get()) {
            if (com.google.android.gms.common.util.p.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f140304b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f140303a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f140304b;
        boolean zCompareAndSet = this.f140303a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f140304b;
        boolean zCompareAndSet = this.f140303a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f140303a.compareAndSet(false, true)) {
            this.f140304b.set(true);
            f(true);
        }
    }

    private ComponentCallbacks2C14980c() {
    }
}
