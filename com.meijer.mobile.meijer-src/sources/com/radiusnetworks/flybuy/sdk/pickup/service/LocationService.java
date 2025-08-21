package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.content.Intent;
import android.os.Build;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import kotlin.Metadata;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/service/LocationService;", "Lcom/radiusnetworks/flybuy/sdk/pickup/service/t;", "<init>", "()V", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationService extends t {
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        try {
            LogExtensionsKt.logd(this, true, "Starting in foreground");
            C15809k.d(C15784P.a(C15800f0.b()), null, null, new v(this, null), 3, null);
            return 2;
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            if (Build.VERSION.SDK_INT < 31 || !a.a(e10)) {
                LogExtensionsKt.loge(this, false, e10, "Unable to start location service due to security exception.", new Object[0]);
            } else {
                LogExtensionsKt.loge(this, false, e10, "App not in a valid state to start location service (e.g. started from bg)", new Object[0]);
            }
            stopSelf();
            return 2;
        }
    }
}
