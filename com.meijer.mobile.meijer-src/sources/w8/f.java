package w8;

import android.content.Context;
import android.os.BatteryManager;
import i8.x;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final BatteryManager f167011a;

    public static f b(Context context) {
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager != null) {
                return new f(batteryManager);
            }
            if (x.f137412b) {
                z8.f.u("BatteryTracker", "unable to track the battery service");
            }
            return null;
        } catch (Exception e10) {
            if (x.f137412b) {
                z8.f.v("BatteryTracker", "unable to track the battery service", e10);
            }
            return null;
        }
    }

    public int a() {
        try {
            int intProperty = this.f167011a.getIntProperty(4);
            if (intProperty >= 0 && intProperty <= 100) {
                return intProperty;
            }
            if (x.f137412b) {
                z8.f.u("BatteryTracker", "invalid battery level '" + intProperty + "' detected");
            }
            return Integer.MIN_VALUE;
        } catch (Exception e10) {
            if (x.f137412b) {
                z8.f.v("BatteryTracker", "unable to determine the battery level", e10);
            }
            return Integer.MIN_VALUE;
        }
    }

    f(BatteryManager batteryManager) {
        this.f167011a = batteryManager;
    }
}
