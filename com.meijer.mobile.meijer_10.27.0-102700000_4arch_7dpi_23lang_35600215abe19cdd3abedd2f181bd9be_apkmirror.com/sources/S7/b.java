package S7;

import R7.f;
import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LS7/b;", "LS7/c;", "LR7/a;", "appStartupManager", "LR7/d;", "visibilityManager", "<init>", "(LR7/a;LR7/d;)V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityPaused", "onActivityStopped", "a", "LR7/a;", "b", "LR7/d;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final R7.a appStartupManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final R7.d visibilityManager;

    public b(R7.a appStartupManager, R7.d visibilityManager) {
        Intrinsics.j(appStartupManager, "appStartupManager");
        Intrinsics.j(visibilityManager, "visibilityManager");
        this.appStartupManager = appStartupManager;
        this.visibilityManager = visibilityManager;
    }

    @Override // S7.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.j(activity, "activity");
        this.appStartupManager.a(T7.a.f34869c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.visibilityManager.b(f.a(activity));
    }

    @Override // S7.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.appStartupManager.a(T7.a.f34871e);
    }

    @Override // S7.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.appStartupManager.a(T7.a.f34870d);
        this.visibilityManager.a(f.a(activity));
    }

    @Override // S7.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.visibilityManager.c(f.a(activity), activity.isChangingConfigurations());
    }
}
