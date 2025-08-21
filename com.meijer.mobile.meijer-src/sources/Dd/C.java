package Dd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class C extends C3100a implements InterfaceC3101b {
    @Override // Dd.InterfaceC3101b
    public final int zzf() throws RemoteException {
        Parcel parcelK1 = K1(6, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // Dd.InterfaceC3101b
    public final boolean y4(InterfaceC3101b interfaceC3101b) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, interfaceC3101b);
        Parcel parcelK1 = K1(5, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }
}
