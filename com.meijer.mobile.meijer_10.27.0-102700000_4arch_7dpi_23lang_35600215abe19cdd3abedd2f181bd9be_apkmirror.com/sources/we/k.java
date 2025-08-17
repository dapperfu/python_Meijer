package we;

import Td.C5233k;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes4.dex */
final class k extends j {

    /* renamed from: d, reason: collision with root package name */
    final String f166052d;

    k(l lVar, C5233k c5233k, String str) {
        super(lVar, new xe.i("OnRequestInstallCallback"), c5233k);
        this.f166052d = str;
    }

    @Override // we.j, xe.h
    public final void P(Bundle bundle) throws RemoteException {
        super.P(bundle);
        this.f166050b.e(new d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
