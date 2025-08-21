package ye;

import Vd.C5517k;
import android.os.Bundle;
import android.os.RemoteException;
import ze.t;

/* loaded from: classes4.dex */
class j extends ze.g {

    /* renamed from: a, reason: collision with root package name */
    final ze.i f171371a;

    /* renamed from: b, reason: collision with root package name */
    final C5517k f171372b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f171373c;

    j(l lVar, ze.i iVar, C5517k c5517k) {
        this.f171373c = lVar;
        this.f171371a = iVar;
        this.f171372b = c5517k;
    }

    @Override // ze.h
    public void P(Bundle bundle) throws RemoteException {
        t tVar = this.f171373c.f171376a;
        if (tVar != null) {
            tVar.r(this.f171372b);
        }
        this.f171371a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
