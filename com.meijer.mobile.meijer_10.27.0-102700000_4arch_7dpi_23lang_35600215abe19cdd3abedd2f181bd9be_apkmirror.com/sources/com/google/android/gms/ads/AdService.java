package com.google.android.gms.ads;

import Mc.C4169y;
import Qc.p;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC10061yl;

/* loaded from: classes4.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            C4169y.a().j(this, new BinderC10061yl()).O0(intent);
        } catch (RemoteException e10) {
            p.d("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
