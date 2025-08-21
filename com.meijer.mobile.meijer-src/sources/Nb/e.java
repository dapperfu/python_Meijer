package Nb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f20755a;

    /* renamed from: b, reason: collision with root package name */
    public s f20756b;

    /* renamed from: c, reason: collision with root package name */
    private ActivityManager f20757c;

    public final ActivityManager.AppTask a(Intent intent) {
        Intent intent2;
        ActivityManager.AppTask next;
        ComponentName component;
        ActivityManager.RecentTaskInfo taskInfo;
        Iterator<ActivityManager.AppTask> it = this.f20757c.getAppTasks().iterator();
        do {
            intent2 = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            if (next != null && (taskInfo = next.getTaskInfo()) != null) {
                intent2 = taskInfo.baseIntent;
            }
        } while (!((intent2 == null || intent == null || (component = intent2.getComponent()) == null) ? false : component.equals(intent.getComponent())));
        return next;
    }

    public e(Context context, s sVar) {
        this.f20755a = context;
        this.f20757c = (ActivityManager) context.getSystemService("activity");
        this.f20756b = sVar;
    }
}
