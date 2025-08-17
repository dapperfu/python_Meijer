package com.google.android.gms.ads;

import Mc.C4169y;
import Qc.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC10061yl;
import com.google.android.gms.internal.ads.InterfaceC8675ln;

/* loaded from: classes4.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            InterfaceC8675ln interfaceC8675lnJ = C4169y.a().j(this, new BinderC10061yl());
            if (interfaceC8675lnJ == null) {
                p.d("OfflineUtils is null");
            } else {
                interfaceC8675lnJ.O0(getIntent());
            }
        } catch (RemoteException e10) {
            p.d("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
