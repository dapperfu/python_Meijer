package Bd;

import Md.E;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class p extends r implements q {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        s.b(parcel);
        E eK3 = K3(i12, i13, i14);
        parcel2.writeNoException();
        s.d(parcel2, eK3);
        return true;
    }

    public p() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static q a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new o(iBinder);
    }
}
