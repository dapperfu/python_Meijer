package Pc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.EnumC6756Ge;

@TargetApi(26)
/* loaded from: classes4.dex */
public class I0 extends F0 {
    @Override // Pc.C4558b
    public final Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // Pc.C4558b
    public final boolean h(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // Pc.C4558b
    public final EnumC6756Ge f(Context context, TelephonyManager telephonyManager) {
        Lc.v.t();
        if (D0.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (telephonyManager.isDataEnabled()) {
                return EnumC6756Ge.ENUM_TRUE;
            }
            return EnumC6756Ge.ENUM_FALSE;
        }
        return EnumC6756Ge.ENUM_FALSE;
    }

    @Override // Pc.C4558b
    public final void g(Context context, String str, String str2) {
        com.adobe.marketing.mobile.v.a();
        NotificationChannel notificationChannelA = com.adobe.marketing.mobile.u.a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) Mc.A.c().a(C8659lf.f76510s8)).intValue());
        notificationChannelA.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelA);
    }
}
