package U5;

import R5.EnumC5116c;
import R5.InterfaceC5115b;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0019\t\u000f\u0015\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"LU5/a;", "LR5/b;", "<init>", "()V", "Landroid/app/Application;", "application", "", "f", "(Landroid/app/Application;)V", "b", "()Landroid/app/Application;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "c", "()Landroid/app/Activity;", "LR5/c;", "e", "()LR5/c;", "Landroid/net/ConnectivityManager;", "d", "()Landroid/net/ConnectivityManager;", "LU5/a$a;", "callback", "a", "(LU5/a$a;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "applicationContext", "Landroid/net/ConnectivityManager;", "connectivityManager", "LU5/a$b;", "LU5/a$b;", "activityTracker", "LU5/a$c;", "LU5/a$c;", "appStateTracker", "LU5/a$d;", "g", "LU5/a$d;", "systemActivityLifecycleCallbacks", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC5115b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static volatile WeakReference<Application> application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile WeakReference<Context> applicationContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static volatile ConnectivityManager connectivityManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static d systemActivityLifecycleCallbacks;

    /* renamed from: a, reason: collision with root package name */
    public static final a f37108a = new a();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static b activityTracker = new b();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static c appStateTracker = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LU5/a$a;", "", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: U5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0815a {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: U5.a$a$a, reason: collision with other inner class name */
        public static final class C0816a {
            public static void a(InterfaceC0815a interfaceC0815a, Activity activity) {
                Intrinsics.j(activity, "activity");
            }
        }

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LU5/a$b;", "LU5/a$e;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "b", "()Ljava/lang/ref/WeakReference;", "setCurrentActivity", "(Ljava/lang/ref/WeakReference;)V", "currentActivity", "", "LU5/a$a;", "Ljava/util/List;", "()Ljava/util/List;", "setActivityCallbacks", "(Ljava/util/List;)V", "activityCallbacks", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private volatile WeakReference<Activity> currentActivity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private volatile List<InterfaceC0815a> activityCallbacks = new ArrayList();

        public final List<InterfaceC0815a> a() {
            return this.activityCallbacks;
        }

        public final WeakReference<Activity> b() {
            return this.currentActivity;
        }

        @Override // U5.a.InterfaceC0815a
        public void onActivityPaused(Activity activity) {
            Intrinsics.j(activity, "activity");
            Iterator<T> it = this.activityCallbacks.iterator();
            while (it.hasNext()) {
                ((InterfaceC0815a) it.next()).onActivityPaused(activity);
            }
        }

        @Override // U5.a.InterfaceC0815a
        public void onActivityResumed(Activity activity) {
            Intrinsics.j(activity, "activity");
            this.currentActivity = new WeakReference<>(activity);
            Iterator<T> it = this.activityCallbacks.iterator();
            while (it.hasNext()) {
                ((InterfaceC0815a) it.next()).onActivityResumed(activity);
            }
        }

        @Override // U5.a.e
        public void onTrimMemory(int i10) {
            e.C0817a.b(this, i10);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LU5/a$c;", "LU5/a$e;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "", "level", "onTrimMemory", "(I)V", "LR5/c;", "a", "LR5/c;", "()LR5/c;", "setAppState", "(LR5/c;)V", "appState", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private volatile EnumC5116c appState = EnumC5116c.UNKNOWN;

        /* renamed from: a, reason: from getter */
        public final EnumC5116c getAppState() {
            return this.appState;
        }

        @Override // U5.a.InterfaceC0815a
        public void onActivityResumed(Activity activity) {
            Intrinsics.j(activity, "activity");
            this.appState = EnumC5116c.FOREGROUND;
        }

        @Override // U5.a.e
        public void onTrimMemory(int level) {
            if (level >= 20) {
                this.appState = EnumC5116c.BACKGROUND;
            }
        }

        @Override // U5.a.InterfaceC0815a
        public void onActivityPaused(Activity activity) {
            e.C0817a.a(this, activity);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LU5/a$d;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/content/ComponentCallbacks2;", "", "LU5/a$e;", "listeners", "<init>", "(Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "", "level", "onTrimMemory", "(I)V", "onActivityStopped", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "savedInstanceState", "onActivityCreated", "onActivityStarted", "a", "Ljava/util/List;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    private static final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<e> listeners;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.j(activity, "activity");
            Intrinsics.j(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.j(newConfig, "newConfig");
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends e> listeners) {
            Intrinsics.j(listeners, "listeners");
            this.listeners = listeners;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.j(activity, "activity");
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onActivityPaused(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.j(activity, "activity");
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onActivityResumed(activity);
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onTrimMemory(level);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LU5/a$e;", "LU5/a$a;", "", "level", "", "onTrimMemory", "(I)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private interface e extends InterfaceC0815a {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: U5.a$e$a, reason: collision with other inner class name */
        public static final class C0817a {
            public static void b(e eVar, int i10) {
            }

            public static void a(e eVar, Activity activity) {
                Intrinsics.j(activity, "activity");
                InterfaceC0815a.C0816a.a(eVar, activity);
            }
        }

        void onTrimMemory(int level);
    }

    public final void a(InterfaceC0815a callback) {
        Intrinsics.j(callback, "callback");
        activityTracker.a().add(callback);
    }

    @Override // R5.InterfaceC5115b
    public Application b() {
        WeakReference<Application> weakReference = application;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // R5.InterfaceC5115b
    public Activity c() {
        WeakReference<Activity> weakReferenceB = activityTracker.b();
        if (weakReferenceB != null) {
            return weakReferenceB.get();
        }
        return null;
    }

    @Override // R5.InterfaceC5115b
    public ConnectivityManager d() {
        return connectivityManager;
    }

    @Override // R5.InterfaceC5115b
    public EnumC5116c e() {
        return appStateTracker.getAppState();
    }

    @Override // R5.InterfaceC5115b
    public void f(Application application2) {
        Intrinsics.j(application2, "application");
        WeakReference<Application> weakReference = application;
        if ((weakReference != null ? weakReference.get() : null) != null) {
            return;
        }
        application = new WeakReference<>(application2);
        Context applicationContext2 = application2.getApplicationContext();
        if (applicationContext2 != null) {
            applicationContext = new WeakReference<>(applicationContext2);
        }
        Object systemService = application2.getSystemService("connectivity");
        connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        d dVar = new d(CollectionsKt.p(activityTracker, appStateTracker));
        systemActivityLifecycleCallbacks = dVar;
        application2.registerActivityLifecycleCallbacks(dVar);
        application2.registerComponentCallbacks(systemActivityLifecycleCallbacks);
    }

    @Override // R5.InterfaceC5115b
    public Context getApplicationContext() {
        WeakReference<Context> weakReference = applicationContext;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private a() {
    }
}
