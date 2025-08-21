package ye;

import Vd.C5517k;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes4.dex */
final class k extends j {

    /* renamed from: d, reason: collision with root package name */
    final String f171374d;

    k(l lVar, C5517k c5517k, String str) {
        super(lVar, new ze.i("OnRequestInstallCallback"), c5517k);
        this.f171374d = str;
    }

    @Override // ye.j, ze.h
    public final void P(Bundle bundle) throws RemoteException {
        super.P(bundle);
        this.f171372b.e(new d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
