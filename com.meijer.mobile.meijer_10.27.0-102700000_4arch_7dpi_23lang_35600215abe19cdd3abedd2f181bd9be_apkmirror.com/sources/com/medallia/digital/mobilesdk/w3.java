package com.medallia.digital.mobilesdk;

import android.app.NotificationChannel;
import android.os.Build;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
public class w3 extends y5<Boolean> {
    protected w3(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private boolean r() {
        NotificationChannel notificationChannelI;
        String str;
        androidx.core.app.q qVarF = androidx.core.app.q.f(i4.c().d());
        if (qVarF == null) {
            str = "NotificationManagerCompat is null";
        } else {
            if (qVarF.a()) {
                if (Build.VERSION.SDK_INT < 26 || (notificationChannelI = qVarF.i("Medallia Digital")) == null) {
                    return true;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Notification ManagerCompat channel: ");
                sb2.append(notificationChannelI.getImportance() != 0);
                a4.b(sb2.toString());
                return notificationChannelI.getImportance() != 0;
            }
            str = "Notification ManagerCompat areNotificationsEnabled: false";
        }
        a4.b(str);
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92924R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean j() {
        a4.b("LocalNotificationsEnabledCollector collectValue was called");
        boolean zR = r();
        a4.b(String.format(Locale.US, "Collectors > LocalNotifications is enable : %s", Boolean.valueOf(zR)));
        return Boolean.valueOf(zR);
    }
}
