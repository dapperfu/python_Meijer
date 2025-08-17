package R7;

import android.app.Application;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LR7/c;", "", "LR7/a;", "appStartupManager", "LR7/d;", "visibilityManager", "Landroid/app/Application;", "application", "<init>", "(LR7/a;LR7/d;Landroid/app/Application;)V", "", "b", "()V", "a", "LR7/a;", "Landroid/app/Application;", "", "c", "Z", "isAppStarted", "Landroid/app/Application$ActivityLifecycleCallbacks;", "d", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleListener", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a appStartupManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isAppStarted;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Application.ActivityLifecycleCallbacks activityLifecycleListener;

    public final void a() {
        this.isAppStarted = false;
        this.application.unregisterActivityLifecycleCallbacks(this.activityLifecycleListener);
    }

    public c(a appStartupManager, d visibilityManager, Application application) {
        Intrinsics.j(appStartupManager, "appStartupManager");
        Intrinsics.j(visibilityManager, "visibilityManager");
        Intrinsics.j(application, "application");
        this.appStartupManager = appStartupManager;
        this.application = application;
        this.activityLifecycleListener = Build.VERSION.SDK_INT >= 29 ? new S7.a(appStartupManager, visibilityManager) : new S7.b(appStartupManager, visibilityManager);
    }

    public final void b() {
        if (this.isAppStarted) {
            return;
        }
        this.isAppStarted = true;
        this.appStartupManager.a(T7.a.f34868b);
        this.application.registerActivityLifecycleCallbacks(this.activityLifecycleListener);
    }
}
