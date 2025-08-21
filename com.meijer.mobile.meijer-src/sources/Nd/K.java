package Nd;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class K extends Dd.r implements L {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Location location = (Location) Dd.s.a(parcel, Location.CREATOR);
        Dd.s.b(parcel);
        k2(location);
        parcel2.writeNoException();
        return true;
    }

    public K() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }
}
