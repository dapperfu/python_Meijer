package Nd;

import Dd.AbstractBinderC3103d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class F extends Dd.r implements G {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Dd.e eVarA2 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            K5(eVarA2);
        } else if (i10 == 2) {
            Dd.e eVarA22 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            f(eVarA22);
        } else {
            if (i10 != 3) {
                return false;
            }
            Dd.e eVarA23 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            x0(eVarA23);
        }
        parcel2.writeNoException();
        return true;
    }

    public F() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }
}
