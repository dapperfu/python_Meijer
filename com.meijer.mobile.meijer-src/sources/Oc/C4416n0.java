package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* renamed from: Oc.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4416n0 extends C8883mb implements InterfaceC4422p0 {
    @Override // Oc.InterfaceC4422p0
    public final void zzb() throws RemoteException {
        c2(5, K1());
    }

    @Override // Oc.InterfaceC4422p0
    public final void zzc() throws RemoteException {
        c2(3, K1());
    }

    @Override // Oc.InterfaceC4422p0
    public final void zze() throws RemoteException {
        c2(4, K1());
    }

    @Override // Oc.InterfaceC4422p0
    public final void zzf() throws RemoteException {
        c2(2, K1());
    }

    C4416n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // Oc.InterfaceC4422p0
    public final void a0(W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(1, parcelK1);
    }
}
