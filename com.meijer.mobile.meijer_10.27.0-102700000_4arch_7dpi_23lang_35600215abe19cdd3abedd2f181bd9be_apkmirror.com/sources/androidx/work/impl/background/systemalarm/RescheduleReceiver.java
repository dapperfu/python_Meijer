package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import O4.O;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59176a = AbstractC4333v.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4333v.e().a(f59176a, "Received intent " + intent);
        try {
            O.p(context).y(goAsync());
        } catch (IllegalStateException e10) {
            AbstractC4333v.e().d(f59176a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
