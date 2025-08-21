package Nd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: Nd.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4204z extends Dd.r implements A {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) Dd.s.a(parcel, LatLng.CREATOR);
        Dd.s.b(parcel);
        e0(latLng);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4204z() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }
}
