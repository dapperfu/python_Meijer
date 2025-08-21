package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class V extends Dd.r implements W {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Od.A a10 = (Od.A) Dd.s.a(parcel, Od.A.CREATOR);
        Dd.s.b(parcel);
        p1(a10);
        parcel2.writeNoException();
        return true;
    }

    public V() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }
}
