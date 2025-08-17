package Bd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class C extends C2951a implements InterfaceC2952b {
    @Override // Bd.InterfaceC2952b
    public final int zzf() throws RemoteException {
        Parcel parcelA1 = A1(6, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // Bd.InterfaceC2952b
    public final boolean Y6(InterfaceC2952b interfaceC2952b) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, interfaceC2952b);
        Parcel parcelA1 = A1(5, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }
}
