package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import O4.O;
import W4.A;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

/* loaded from: classes4.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f59171a = AbstractC4333v.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f59172a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f59173b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f59174c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f59172a = intent;
            this.f59173b = context;
            this.f59174c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f59172a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f59172a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f59172a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f59172a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC4333v.e().a(ConstraintProxyUpdateReceiver.f59171a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                A.c(this.f59173b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                A.c(this.f59173b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                A.c(this.f59173b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                A.c(this.f59173b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f59174c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            O.p(context).v().d(new a(intent, context, goAsync()));
            return;
        }
        AbstractC4333v.e().a(f59171a, "Ignoring unknown action " + action);
    }
}
