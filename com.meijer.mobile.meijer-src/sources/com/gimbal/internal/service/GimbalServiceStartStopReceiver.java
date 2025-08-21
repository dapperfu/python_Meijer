package com.gimbal.internal.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;

/* loaded from: classes4.dex */
public class GimbalServiceStartStopReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f65224a = C13785b.a(GimbalServiceStartStopReceiver.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f65225b = C13787d.a(GimbalServiceStartStopReceiver.class.getName());

    public static String a(Context context) {
        return context.getPackageName() + ".service.GIMBAL_SERVICE";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String packageName = context.getPackageName();
        Intent intent2 = new Intent(a(context));
        intent2.setPackage(packageName);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            intent2.getAction();
            try {
                context.startService(intent2);
                return;
            } catch (IllegalStateException unused) {
                f65225b.g("Unable start Gimbal Service when boot completed.", new Object[0]);
                return;
            }
        }
        if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
            intent2.getAction();
            context.stopService(intent2);
        }
    }
}
