package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Ec.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import tc.p;
import tc.u;

/* loaded from: classes4.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        u.f(context);
        p.a aVarD = p.a().b(queryParameter).d(a.b(iIntValue));
        if (queryParameter2 != null) {
            aVarD.c(Base64.decode(queryParameter2, 0));
        }
        u.c().e().m(aVarD.a(), i10, new Runnable() { // from class: Ac.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.a();
            }
        });
    }
}
