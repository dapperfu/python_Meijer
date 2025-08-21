package com.google.android.gms.ads;

import Oc.C4447y;
import Sc.p;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC10186yl;

/* loaded from: classes4.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            C4447y.a().j(this, new BinderC10186yl()).O0(intent);
        } catch (RemoteException e10) {
            p.d("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
