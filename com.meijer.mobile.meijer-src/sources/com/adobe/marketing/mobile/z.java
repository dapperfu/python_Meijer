package com.adobe.marketing.mobile;

import android.R;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.m;
import java.security.SecureRandom;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class z extends BroadcastReceiver {
    private Bitmap b(Context context) {
        Drawable applicationIcon;
        if (context == null) {
            return null;
        }
        int i10 = B.i();
        if (i10 != -1) {
            applicationIcon = Z1.b.e(context, i10);
        } else {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            applicationIcon = (applicationInfo == null || context.getPackageManager() == null) ? null : context.getPackageManager().getApplicationIcon(applicationInfo);
        }
        if (applicationIcon == null) {
            return null;
        }
        return applicationIcon instanceof BitmapDrawable ? ((BitmapDrawable) applicationIcon).getBitmap() : a(applicationIcon);
    }

    private Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private int c() {
        if (B.j() != -1) {
            return B.j();
        }
        return R.drawable.sym_def_app_icon;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            R5.t.a("Campaign", "LocalNotificationHandler", "Failed to load extras from local notification intent", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String string = extras.getString("NOTIFICATION_CONTENT");
        extras.getInt("NOTIFICATION_REQUEST_CODE");
        int i10 = extras.getInt("NOTIFICATION_SENDER_CODE");
        String string2 = extras.getString("NOTIFICATION_IDENTIFIER");
        String string3 = extras.getString("NOTIFICATION_DEEPLINK");
        extras.getString("NOTIFICATION_SOUND");
        HashMap map = (HashMap) extras.getSerializable("NOTIFICATION_USER_INFO");
        String string4 = extras.getString("NOTIFICATION_TITLE");
        if (i10 != 750183) {
            R5.t.e("Campaign", "LocalNotificationHandler", "Request code does not match", new Object[0]);
            return;
        }
        if (string == null) {
            R5.t.a("Campaign", "LocalNotificationHandler", "%s (local notification message)", "Unexpected Null Value");
            return;
        }
        Activity activityC = R5.K.f().a().c();
        if (string3 != null && !string3.isEmpty()) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse(string3));
            intent2 = intent3;
        } else if (activityC != null) {
            intent2 = activityC.getIntent();
        } else {
            intent2 = intent;
        }
        intent2.setFlags(603979776);
        intent2.putExtra("NOTIFICATION_IDENTIFIER", string2);
        intent2.putExtra("NOTIFICATION_USER_INFO", map);
        int i11 = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        try {
            PendingIntent activity = PendingIntent.getActivity(applicationContext, i10, intent2, 201326592);
            if (activity == null) {
                R5.t.a("Campaign", "LocalNotificationHandler", "Failed to retrieve sender from broadcast, unable to post notification", new Object[0]);
                return;
            }
            String strC = R5.K.f().e().c();
            if (i11 >= 26 && notificationManager.getNotificationChannel("ADOBE_EXPERIENCE_PLATFORM_SDK") == null) {
                v.a();
                NotificationChannel notificationChannelA = u.a("ADOBE_EXPERIENCE_PLATFORM_SDK", "ADOBE_EXPERIENCE_PLATFORM_SDK", 4);
                notificationChannelA.setDescription("Adobe Experience Platform SDK Notifications");
                notificationManager.createNotificationChannel(notificationChannelA);
            }
            m.e eVarY = new m.e(context, "ADOBE_EXPERIENCE_PLATFORM_SDK").A(new m.c()).z(RingtoneManager.getDefaultUri(2)).v(1).A(new m.c()).y(c());
            Bitmap bitmapB = b(context);
            if (bitmapB != null) {
                eVarY.q(bitmapB);
            }
            if (!g6.i.a(string4)) {
                eVarY.k(string4);
            } else {
                eVarY.k(strC);
            }
            eVarY.j(string);
            eVarY.i(activity);
            Intent intent4 = new Intent(applicationContext, (Class<?>) E.class);
            intent4.putExtra("NOTIFICATION_USER_INFO", map);
            eVarY.n(PendingIntent.getBroadcast(applicationContext, i10, intent4, 201326592));
            eVarY.f(true);
            notificationManager.notify(new SecureRandom().nextInt(), eVarY.c());
        } catch (Exception e10) {
            R5.t.f("Campaign", "LocalNotificationHandler", "unexpected error posting notification (%s)", e10);
        }
    }
}
