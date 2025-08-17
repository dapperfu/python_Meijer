package we;

import Td.C5233k;
import android.os.Bundle;
import android.os.RemoteException;
import xe.t;

/* loaded from: classes4.dex */
class j extends xe.g {

    /* renamed from: a, reason: collision with root package name */
    final xe.i f166049a;

    /* renamed from: b, reason: collision with root package name */
    final C5233k f166050b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f166051c;

    j(l lVar, xe.i iVar, C5233k c5233k) {
        this.f166051c = lVar;
        this.f166049a = iVar;
        this.f166050b = c5233k;
    }

    @Override // xe.h
    public void P(Bundle bundle) throws RemoteException {
        t tVar = this.f166051c.f166054a;
        if (tVar != null) {
            tVar.r(this.f166050b);
        }
        this.f166049a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
