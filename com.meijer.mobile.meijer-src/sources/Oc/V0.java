package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class V0 extends C8883mb implements Y0 {
    @Override // Oc.Y0
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // Oc.Y0
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // Oc.Y0
    public final float zzg() throws RemoteException {
        throw null;
    }

    V0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // Oc.Y0
    public final InterfaceC4381b1 zzi() throws RemoteException {
        InterfaceC4381b1 z02;
        Parcel parcelA2 = a2(11, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            z02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            z02 = iInterfaceQueryLocalInterface instanceof InterfaceC4381b1 ? (InterfaceC4381b1) iInterfaceQueryLocalInterface : new Z0(strongBinder);
        }
        parcelA2.recycle();
        return z02;
    }

    @Override // Oc.Y0
    public final void v5(InterfaceC4381b1 interfaceC4381b1) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC4381b1);
        c2(8, parcelK1);
    }
}
