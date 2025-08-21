package Dd;

import Od.E;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class o extends C3100a implements q {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // Dd.q
    public final E W3(int i10, int i11, int i12) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        parcelA2.writeInt(i11);
        parcelA2.writeInt(i12);
        Parcel parcelK1 = K1(1, parcelA2);
        E e10 = (E) s.a(parcelK1, E.CREATOR);
        parcelK1.recycle();
        return e10;
    }
}
