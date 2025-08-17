package com.gimbal.internal.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;

/* loaded from: classes4.dex */
public class GimbalServiceStartStopReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f64384a = C6381b.a(GimbalServiceStartStopReceiver.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f64385b = C6383d.a(GimbalServiceStartStopReceiver.class.getName());

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
                f64385b.g("Unable start Gimbal Service when boot completed.", new Object[0]);
                return;
            }
        }
        if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
            intent2.getAction();
            context.stopService(intent2);
        }
    }
}
