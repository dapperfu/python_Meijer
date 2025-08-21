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
    protected static final Class<?> f53891a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f53892b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f53893c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f53894d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f53895e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f53896f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f53897g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f53898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f53899b;

        a(d dVar, Object obj) {
            this.f53898a = dVar;
            this.f53899b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53898a.f53904a = this.f53899b;
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f53900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f53901b;

        b(Application application, d dVar) {
            this.f53900a = application;
            this.f53901b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53900a.unregisterActivityLifecycleCallbacks(this.f53901b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f53903b;

        c(Object obj, Object obj2) {
            this.f53902a = obj;
            this.f53903b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = e.f53894d;
                if (method != null) {
                    method.invoke(this.f53902a, this.f53903b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    e.f53895e.invoke(this.f53902a, this.f53903b, Boolean.FALSE);
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
        Object f53904a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f53905b;

        /* renamed from: c, reason: collision with root package name */
        private final int f53906c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f53907d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f53908e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f53909f = false;

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
            if (this.f53905b == activity) {
                this.f53905b = null;
                this.f53908e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f53908e || this.f53909f || this.f53907d || !e.h(this.f53904a, this.f53906c, activity)) {
                return;
            }
            this.f53909f = true;
            this.f53904a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f53905b == activity) {
                this.f53907d = true;
            }
        }

        d(Activity activity) {
            this.f53905b = activity;
            this.f53906c = activity.hashCode();
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
            Object obj2 = f53893c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f53897g.postAtFrontOfQueue(new c(f53892b.get(activity), obj2));
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
        f53891a = clsA;
        f53892b = b();
        f53893c = f();
        f53894d = d(clsA);
        f53895e = c(clsA);
        f53896f = e(clsA);
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
        if (g() && f53896f == null) {
            return false;
        }
        if (f53895e == null && f53894d == null) {
            return false;
        }
        try {
            Object obj2 = f53893c.get(activity);
            if (obj2 == null || (obj = f53892b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f53897g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f53896f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th2) {
                f53897g.post(new b(application, dVar));
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
