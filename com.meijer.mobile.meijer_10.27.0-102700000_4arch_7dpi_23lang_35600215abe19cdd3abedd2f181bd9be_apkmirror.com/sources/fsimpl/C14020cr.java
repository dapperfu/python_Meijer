package fsimpl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.cr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14020cr implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private List f131997a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List f131998b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List f131999c = new ArrayList();

    public List getCreated() {
        return this.f131997a;
    }

    public List getResumed() {
        return this.f131999c;
    }

    public List getStarted() {
        return this.f131998b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f131997a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f131997a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f131999c.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f131999c.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f131998b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f131998b.remove(activity);
    }
}
