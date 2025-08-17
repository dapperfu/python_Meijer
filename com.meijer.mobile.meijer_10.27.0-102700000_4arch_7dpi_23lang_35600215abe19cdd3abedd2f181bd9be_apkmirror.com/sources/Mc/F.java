package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class F extends C8758mb implements H {
    @Override // Mc.H
    public final void zzc() throws RemoteException {
        b2(6, A1());
    }

    @Override // Mc.H
    public final void zzd() throws RemoteException {
        b2(1, A1());
    }

    @Override // Mc.H
    public final void zzg() throws RemoteException {
        b2(7, A1());
    }

    @Override // Mc.H
    public final void zzh() throws RemoteException {
        b2(3, A1());
    }

    @Override // Mc.H
    public final void zzi() throws RemoteException {
        b2(4, A1());
    }

    @Override // Mc.H
    public final void zzj() throws RemoteException {
        b2(5, A1());
    }

    F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // Mc.H
    public final void zzk() throws RemoteException {
        b2(9, A1());
    }

    @Override // Mc.H
    public final void b(W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(8, parcelA1);
    }

    @Override // Mc.H
    public final void zze(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(2, parcelA1);
    }
}
