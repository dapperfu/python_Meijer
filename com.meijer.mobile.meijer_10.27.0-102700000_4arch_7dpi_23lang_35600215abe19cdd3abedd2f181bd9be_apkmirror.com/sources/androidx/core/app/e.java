package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.fullstory.FS;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f53667a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f53668b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f53669c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f53670d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f53671e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f53672f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f53673g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f53674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f53675b;

        a(d dVar, Object obj) {
            this.f53674a = dVar;
            this.f53675b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53674a.f53680a = this.f53675b;
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f53676a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f53677b;

        b(Application application, d dVar) {
            this.f53676a = application;
            this.f53677b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53676a.unregisterActivityLifecycleCallbacks(this.f53677b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f53679b;

        c(Object obj, Object obj2) {
            this.f53678a = obj;
            this.f53679b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = e.f53670d;
                if (method != null) {
                    method.invoke(this.f53678a, this.f53679b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    e.f53671e.invoke(this.f53678a, this.f53679b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                FS.log_e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f53680a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f53681b;

        /* renamed from: c, reason: collision with root package name */
        private final int f53682c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f53683d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f53684e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f53685f = false;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f53681b == activity) {
                this.f53681b = null;
                this.f53684e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f53684e || this.f53685f || this.f53683d || !e.h(this.f53680a, this.f53682c, activity)) {
                return;
            }
            this.f53685f = true;
            this.f53680a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f53681b == activity) {
                this.f53683d = true;
            }
        }

        d(Activity activity) {
            this.f53681b = activity;
            this.f53682c = activity.hashCode();
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f53669c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f53673g.postAtFrontOfQueue(new c(f53668b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            FS.log_e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static {
        Class<?> clsA = a();
        f53667a = clsA;
        f53668b = b();
        f53669c = f();
        f53670d = d(clsA);
        f53671e = c(clsA);
        f53672f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f53672f == null) {
            return false;
        }
        if (f53671e == null && f53670d == null) {
            return false;
        }
        try {
            Object obj2 = f53669c.get(activity);
            if (obj2 == null || (obj = f53668b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f53673g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f53672f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th2) {
                f53673g.post(new b(application, dVar));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
