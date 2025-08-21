package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import O4.C4356d;
import O4.EnumC4374w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59356a = AbstractC4373v.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List<WorkSpec> list) {
        boolean z10;
        Iterator<WorkSpec> it = list.iterator();
        boolean requiresBatteryNotLow = false;
        boolean requiresCharging = false;
        boolean requiresStorageNotLow = false;
        boolean z11 = false;
        while (it.hasNext()) {
            C4356d c4356d = it.next().constraints;
            requiresBatteryNotLow |= c4356d.getRequiresBatteryNotLow();
            requiresCharging |= c4356d.getRequiresCharging();
            requiresStorageNotLow |= c4356d.getRequiresStorageNotLow();
            if (c4356d.getRequiredNetworkType() != EnumC4374w.NOT_REQUIRED) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 |= z10;
            if (requiresBatteryNotLow && requiresCharging && requiresStorageNotLow && z11) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, requiresBatteryNotLow, requiresCharging, requiresStorageNotLow, z11));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4373v.e().a(f59356a, "onReceive : " + intent);
        context.startService(b.a(context));
    }
}
