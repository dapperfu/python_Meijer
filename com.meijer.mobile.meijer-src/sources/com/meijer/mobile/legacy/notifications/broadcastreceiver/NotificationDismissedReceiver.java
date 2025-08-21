package com.meijer.mobile.legacy.notifications.broadcastreceiver;

import Z1.b;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.meijer.mobile.legacy.notifications.broadcastreceiver.NotificationDismissedReceiver;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ym.AbstractC18330a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/legacy/notifications/broadcastreceiver/NotificationDismissedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lhi/a;", "c", "Lhi/a;", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "notifications_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class NotificationDismissedReceiver extends AbstractC18330a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, String str2, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("broadlogId", str);
        track.h("deliveryId", str2);
        track.h("action", "2");
        return Unit.f143329a;
    }

    public final InterfaceC14523a c() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    @Override // ym.AbstractC18330a, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        super.onReceive(context, intent);
        if (intent != null) {
            extras = intent.getExtras();
        } else {
            extras = null;
        }
        if (extras != null && extras.containsKey("adobe_push_notification_data_broadlogid_extra") && extras.containsKey("adobe_push_notification_data_deliveryid_extra")) {
            final String string = extras.getString("adobe_push_notification_data_broadlogid_extra", "");
            final String string2 = extras.getString("adobe_push_notification_data_deliveryid_extra", "");
            int i10 = extras.getInt("Cta notification id");
            Intrinsics.g(context);
            NotificationManager notificationManager = (NotificationManager) b.j(context, NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.cancel(i10);
            }
            c().b(C14756c.a("event: tracking"), new Function1() { // from class: ym.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationDismissedReceiver.d(string, string2, (TrackingData) obj);
                }
            });
        }
    }
}
