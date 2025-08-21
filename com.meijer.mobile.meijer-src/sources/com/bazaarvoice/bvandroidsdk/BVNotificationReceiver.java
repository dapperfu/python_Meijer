package com.bazaarvoice.bvandroidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public class BVNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) BVNotificationService.class);
        intent2.setAction(intent.getAction());
        intent2.putExtras(intent.getExtras());
        context.startService(intent2);
    }
}
