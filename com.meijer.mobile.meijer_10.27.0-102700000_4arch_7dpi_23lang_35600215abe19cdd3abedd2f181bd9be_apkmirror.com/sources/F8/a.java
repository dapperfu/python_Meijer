package F8;

import android.app.Activity;

/* loaded from: classes4.dex */
public class a implements d<Activity> {
    @Override // F8.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(Activity activity) {
        return new e(activity.getComponentName().getClassName(), System.identityHashCode(activity));
    }
}
