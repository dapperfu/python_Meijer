package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class Z0 extends C8758mb implements InterfaceC4103b1 {
    @Override // Mc.InterfaceC4103b1
    public final void zze() throws RemoteException {
        b2(4, A1());
    }

    @Override // Mc.InterfaceC4103b1
    public final void zzg() throws RemoteException {
        b2(3, A1());
    }

    @Override // Mc.InterfaceC4103b1
    public final void zzh() throws RemoteException {
        b2(2, A1());
    }

    @Override // Mc.InterfaceC4103b1
    public final void zzi() throws RemoteException {
        b2(1, A1());
    }

    Z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // Mc.InterfaceC4103b1
    public final void k0(boolean z10) throws RemoteException {
        Parcel parcelA1 = A1();
        int i10 = C8972ob.f77401b;
        parcelA1.writeInt(z10 ? 1 : 0);
        b2(5, parcelA1);
    }
}
