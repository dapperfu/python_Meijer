package Mc;

import android.os.RemoteException;

/* renamed from: Mc.y1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class BinderC4171y1 extends M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A1 f19369a;

    @Override // Mc.N
    public final void w7(Y1 y12) throws RemoteException {
        L3(y12, 1);
    }

    @Override // Mc.N
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // Mc.N
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // Mc.N
    public final boolean zzi() throws RemoteException {
        return false;
    }

    /* synthetic */ BinderC4171y1(A1 a12, C4174z1 c4174z1) {
        this.f19369a = a12;
    }

    @Override // Mc.N
    public final void L3(Y1 y12, int i10) throws RemoteException {
        Qc.p.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        Qc.g.f29940b.post(new RunnableC4168x1(this));
    }
}
