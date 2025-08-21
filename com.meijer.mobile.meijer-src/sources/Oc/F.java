package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class F extends C8883mb implements H {
    @Override // Oc.H
    public final void zzc() throws RemoteException {
        c2(6, K1());
    }

    @Override // Oc.H
    public final void zzd() throws RemoteException {
        c2(1, K1());
    }

    @Override // Oc.H
    public final void zzg() throws RemoteException {
        c2(7, K1());
    }

    @Override // Oc.H
    public final void zzh() throws RemoteException {
        c2(3, K1());
    }

    @Override // Oc.H
    public final void zzi() throws RemoteException {
        c2(4, K1());
    }

    @Override // Oc.H
    public final void zzj() throws RemoteException {
        c2(5, K1());
    }

    F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // Oc.H
    public final void zzk() throws RemoteException {
        c2(9, K1());
    }

    @Override // Oc.H
    public final void b(W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(8, parcelK1);
    }

    @Override // Oc.H
    public final void zze(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(2, parcelK1);
    }
}
