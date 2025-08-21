package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class X extends Dd.r implements Y {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        com.google.android.gms.maps.model.a aVar = (com.google.android.gms.maps.model.a) Dd.s.a(parcel, com.google.android.gms.maps.model.a.CREATOR);
        Dd.s.b(parcel);
        v0(aVar);
        parcel2.writeNoException();
        return true;
    }

    public X() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
    }
}
