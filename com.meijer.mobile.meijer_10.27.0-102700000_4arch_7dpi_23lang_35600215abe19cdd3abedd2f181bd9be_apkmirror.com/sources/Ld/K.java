package Ld;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class K extends Bd.r implements L {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Location location = (Location) Bd.s.a(parcel, Location.CREATOR);
        Bd.s.b(parcel);
        i2(location);
        parcel2.writeNoException();
        return true;
    }

    public K() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }
}
