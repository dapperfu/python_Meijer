package Ld;

import Cd.BinderC3047d;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes6.dex */
public abstract class J extends BinderC3047d implements K {
    @Override // Cd.BinderC3047d
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) Cd.r.a(parcel, LocationResult.CREATOR);
            Cd.r.d(parcel);
            P5(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) Cd.r.a(parcel, LocationAvailability.CREATOR);
            Cd.r.d(parcel);
            j2(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }

    public J() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static K a2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof K ? (K) iInterfaceQueryLocalInterface : new I(iBinder);
    }
}
