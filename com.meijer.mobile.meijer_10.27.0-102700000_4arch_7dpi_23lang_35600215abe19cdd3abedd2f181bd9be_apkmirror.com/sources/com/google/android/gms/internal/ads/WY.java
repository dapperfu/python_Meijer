package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class WY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f71111a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f71112b;

    WY(Xj0 xj0, Context context) {
        this.f71111a = xj0;
        this.f71112b = context;
    }

    private static final boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 14;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) Mc.A.c().a(C8659lf.f76149Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f71112b.registerReceiver(null, intentFilter) : this.f71112b.registerReceiver(null, intentFilter, 4);
    }

    final /* synthetic */ XY a() throws Exception {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) Mc.A.c().a(C8659lf.f76164Tb)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.f71112b.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : c(b());
        } else {
            Intent intentB = b();
            boolean zC = c(intentB);
            intExtra = intentB != null ? intentB.getIntExtra("level", -1) / intentB.getIntExtra("scale", -1) : -1.0d;
            zIsCharging = zC;
        }
        return new XY(intExtra, zIsCharging);
    }

    @Override // com.google.android.gms.internal.ads.T10
    @SuppressLint({"UnprotectedReceiver"})
    public final com.google.common.util.concurrent.q zzb() {
        return this.f71111a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.UY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f70629a.a();
            }
        });
    }
}
