package Jd;

import Ad.BinderC2809d;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes6.dex */
public abstract class J extends BinderC2809d implements K {
    @Override // Ad.BinderC2809d
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) Ad.r.a(parcel, LocationResult.CREATOR);
            Ad.r.d(parcel);
            F5(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) Ad.r.a(parcel, LocationAvailability.CREATOR);
            Ad.r.d(parcel);
            h2(locationAvailability);
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
