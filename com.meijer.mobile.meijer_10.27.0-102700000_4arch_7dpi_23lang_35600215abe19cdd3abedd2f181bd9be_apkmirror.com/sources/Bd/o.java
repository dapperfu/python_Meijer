package Bd;

import Md.E;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class o extends C2951a implements q {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // Bd.q
    public final E K3(int i10, int i11, int i12) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        parcelA2.writeInt(i11);
        parcelA2.writeInt(i12);
        Parcel parcelA1 = A1(1, parcelA2);
        E e10 = (E) s.a(parcelA1, E.CREATOR);
        parcelA1.recycle();
        return e10;
    }
}
