package S7;

import android.app.Activity;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s7.OneAgentConfiguration;
import t7.f;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LS7/d;", "LS7/c;", "Lt7/f;", "viewContextApi", "Landroid/app/Application;", "applicationContext", "Ls7/a;", "oneAgentConfiguration", "<init>", "(Lt7/f;Landroid/app/Application;Ls7/a;)V", "", "a", "()V", "b", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lt7/f;", "Landroid/app/Application;", "c", "Ls7/a;", "", "d", "Z", "alreadyAdded", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f viewContextApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Application applicationContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OneAgentConfiguration oneAgentConfiguration;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean alreadyAdded;

    public d(f viewContextApi, Application applicationContext, OneAgentConfiguration oneAgentConfiguration) {
        Intrinsics.j(viewContextApi, "viewContextApi");
        Intrinsics.j(applicationContext, "applicationContext");
        Intrinsics.j(oneAgentConfiguration, "oneAgentConfiguration");
        this.viewContextApi = viewContextApi;
        this.applicationContext = applicationContext;
        this.oneAgentConfiguration = oneAgentConfiguration;
    }

    public final void a() {
        if (!this.oneAgentConfiguration.getActivityMonitoring() || this.alreadyAdded) {
            return;
        }
        this.applicationContext.registerActivityLifecycleCallbacks(this);
        this.alreadyAdded = true;
    }

    public final void b() {
        this.applicationContext.unregisterActivityLifecycleCallbacks(this);
        this.alreadyAdded = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.viewContextApi.a();
    }

    @Override // S7.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.viewContextApi.b(activity.getComponentName().getClassName());
    }
}
