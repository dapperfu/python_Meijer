package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class V0 extends C8758mb implements Y0 {
    @Override // Mc.Y0
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // Mc.Y0
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // Mc.Y0
    public final float zzg() throws RemoteException {
        throw null;
    }

    V0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // Mc.Y0
    public final InterfaceC4103b1 zzi() throws RemoteException {
        InterfaceC4103b1 z02;
        Parcel parcelA2 = a2(11, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            z02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            z02 = iInterfaceQueryLocalInterface instanceof InterfaceC4103b1 ? (InterfaceC4103b1) iInterfaceQueryLocalInterface : new Z0(strongBinder);
        }
        parcelA2.recycle();
        return z02;
    }

    @Override // Mc.Y0
    public final void I6(InterfaceC4103b1 interfaceC4103b1) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC4103b1);
        b2(8, parcelA1);
    }
}
