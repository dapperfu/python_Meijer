package Ld;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: Ld.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4072z extends Bd.r implements A {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) Bd.s.a(parcel, LatLng.CREATOR);
        Bd.s.b(parcel);
        c0(latLng);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4072z() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }
}
