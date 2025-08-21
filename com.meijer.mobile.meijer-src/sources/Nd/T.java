package Nd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* loaded from: classes6.dex */
public abstract class T extends Dd.r implements U {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) Dd.s.a(parcel, StreetViewPanoramaCamera.CREATOR);
        Dd.s.b(parcel);
        w4(streetViewPanoramaCamera);
        parcel2.writeNoException();
        return true;
    }

    public T() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
    }
}
