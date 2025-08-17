package com.radiusnetworks.flybuy.sdk.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/sync/SyncBootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SyncBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Exception {
        try {
            FlyBuyCore.INSTANCE.getSync$core_defaultRelease().a();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
