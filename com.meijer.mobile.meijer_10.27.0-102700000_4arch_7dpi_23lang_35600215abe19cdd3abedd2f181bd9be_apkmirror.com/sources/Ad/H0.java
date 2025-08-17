package Ad;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes6.dex */
public abstract class H0 extends BinderC2809d implements I0 {
    @Override // Ad.BinderC2809d
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) r.a(parcel, Status.CREATOR);
        Location location = (Location) r.a(parcel, Location.CREATOR);
        r.d(parcel);
        w1(status, location);
        return true;
    }

    public H0() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }
}
