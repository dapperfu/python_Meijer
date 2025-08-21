package fsimpl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.cr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14145cr implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private List f133247a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List f133248b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List f133249c = new ArrayList();

    public List getCreated() {
        return this.f133247a;
    }

    public List getResumed() {
        return this.f133249c;
    }

    public List getStarted() {
        return this.f133248b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f133247a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f133247a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f133249c.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f133249c.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f133248b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f133248b.remove(activity);
    }
}
