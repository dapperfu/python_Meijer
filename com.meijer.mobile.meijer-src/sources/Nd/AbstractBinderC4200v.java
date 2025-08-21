package Nd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: Nd.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4200v extends Dd.r implements InterfaceC4201w {
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

    public AbstractBinderC4200v() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }
}
