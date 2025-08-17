package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class V extends Bd.r implements W {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Md.A a10 = (Md.A) Bd.s.a(parcel, Md.A.CREATOR);
        Bd.s.b(parcel);
        j7(a10);
        parcel2.writeNoException();
        return true;
    }

    public V() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }
}
