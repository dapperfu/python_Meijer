package Cd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes6.dex */
public abstract class F0 extends BinderC3047d implements G0 {
    @Override // Cd.BinderC3047d
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) r.a(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) r.a(parcel, LocationAvailability.CREATOR);
        r.d(parcel);
        S1(status, locationAvailability);
        return true;
    }

    public F0() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }
}
