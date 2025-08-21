package Oc;

import android.os.RemoteException;

/* renamed from: Oc.y1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class BinderC4449y1 extends M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A1 f23556a;

    @Override // Oc.N
    public final void h6(Y1 y12) throws RemoteException {
        L5(y12, 1);
    }

    @Override // Oc.N
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // Oc.N
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // Oc.N
    public final boolean zzi() throws RemoteException {
        return false;
    }

    /* synthetic */ BinderC4449y1(A1 a12, C4452z1 c4452z1) {
        this.f23556a = a12;
    }

    @Override // Oc.N
    public final void L5(Y1 y12, int i10) throws RemoteException {
        Sc.p.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        Sc.g.f34490b.post(new RunnableC4446x1(this));
    }
}
