package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class Z0 extends C8883mb implements InterfaceC4381b1 {
    @Override // Oc.InterfaceC4381b1
    public final void zze() throws RemoteException {
        c2(4, K1());
    }

    @Override // Oc.InterfaceC4381b1
    public final void zzg() throws RemoteException {
        c2(3, K1());
    }

    @Override // Oc.InterfaceC4381b1
    public final void zzh() throws RemoteException {
        c2(2, K1());
    }

    @Override // Oc.InterfaceC4381b1
    public final void zzi() throws RemoteException {
        c2(1, K1());
    }

    Z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // Oc.InterfaceC4381b1
    public final void n0(boolean z10) throws RemoteException {
        Parcel parcelK1 = K1();
        int i10 = C9097ob.f78241b;
        parcelK1.writeInt(z10 ? 1 : 0);
        c2(5, parcelK1);
    }
}
