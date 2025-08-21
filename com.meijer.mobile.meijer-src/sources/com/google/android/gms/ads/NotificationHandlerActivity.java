package com.google.android.gms.ads;

import Oc.C4447y;
import Sc.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC10186yl;
import com.google.android.gms.internal.ads.InterfaceC8800ln;

/* loaded from: classes4.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            InterfaceC8800ln interfaceC8800lnJ = C4447y.a().j(this, new BinderC10186yl());
            if (interfaceC8800lnJ == null) {
                p.d("OfflineUtils is null");
            } else {
                interfaceC8800lnJ.O0(getIntent());
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
