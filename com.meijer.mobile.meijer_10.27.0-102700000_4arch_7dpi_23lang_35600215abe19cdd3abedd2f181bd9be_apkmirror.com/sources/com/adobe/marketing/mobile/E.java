package com.adobe.marketing.mobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class E extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("NOTIFICATION_USER_INFO")) {
            Q5.t.a("Campaign", "NotificationDismissalHandler", "Notification dismissed", new Object[0]);
            Map map = (Map) intent.getSerializableExtra("NOTIFICATION_USER_INFO");
            if (map != null) {
                HashMap map2 = new HashMap(3);
                map2.put("broadlogId", map.get("broadlogId"));
                map2.put("deliveryId", map.get("deliveryId"));
                map2.put("action", "2");
                B.b(map2);
            }
        }
    }
}
