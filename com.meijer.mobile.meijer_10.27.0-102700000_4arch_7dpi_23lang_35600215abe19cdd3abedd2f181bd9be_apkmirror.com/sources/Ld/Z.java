package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class Z extends Bd.r implements InterfaceC4041a0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        com.google.android.gms.maps.model.a aVar = (com.google.android.gms.maps.model.a) Bd.s.a(parcel, com.google.android.gms.maps.model.a.CREATOR);
        Bd.s.b(parcel);
        u0(aVar);
        parcel2.writeNoException();
        return true;
    }

    public Z() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }
}
