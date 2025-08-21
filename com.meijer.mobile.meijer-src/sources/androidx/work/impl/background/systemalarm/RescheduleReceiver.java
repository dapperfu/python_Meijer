package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import P4.O;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59362a = AbstractC4373v.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4373v.e().a(f59362a, "Received intent " + intent);
        try {
            O.p(context).y(goAsync());
        } catch (IllegalStateException e10) {
            AbstractC4373v.e().d(f59362a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
