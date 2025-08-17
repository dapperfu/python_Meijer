package com.adobe.marketing.mobile.campaign;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.adobe.marketing.mobile.z;
import f6.C13848d;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes4.dex */
class v {
    static void a(Context context, w wVar) {
        if (context == null) {
            Q5.t.f("Campaign", "LocalNotificationService", "Application context is null, unable to show local notification", new Object[0]);
            return;
        }
        int iNextInt = new SecureRandom().nextInt();
        Calendar calendar = Calendar.getInstance();
        if (wVar.e() > 0) {
            int iE = (int) (wVar.e() - (calendar.getTimeInMillis() / 1000));
            if (iE > 0) {
                calendar.add(13, iE);
            }
        } else {
            calendar.add(13, wVar.d());
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(context, z.class);
        intent.putExtra("NOTIFICATION_SENDER_CODE", 750183);
        intent.putExtra("NOTIFICATION_IDENTIFIER", wVar.f());
        intent.putExtra("NOTIFICATION_REQUEST_CODE", iNextInt);
        intent.putExtra("NOTIFICATION_DEEPLINK", wVar.c());
        intent.putExtra("NOTIFICATION_CONTENT", wVar.b());
        HashMap map = !C13848d.a(wVar.i()) ? new HashMap(wVar.i()) : null;
        if (!C13848d.a(map)) {
            intent.putExtra("NOTIFICATION_USER_INFO", map);
        }
        intent.putExtra("NOTIFICATION_SOUND", wVar.g());
        intent.putExtra("NOTIFICATION_TITLE", wVar.h());
        try {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, iNextInt, intent, 201326592);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
            }
        } catch (Exception e10) {
            Q5.t.f("Campaign", "Campaign", String.format("Unable to create PendingIntent object, error: %s", e10.getLocalizedMessage()), new Object[0]);
        }
    }
}
