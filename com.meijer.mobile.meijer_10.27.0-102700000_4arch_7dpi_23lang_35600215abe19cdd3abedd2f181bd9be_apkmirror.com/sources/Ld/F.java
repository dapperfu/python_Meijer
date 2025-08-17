package Ld;

import Bd.AbstractBinderC2954d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class F extends Bd.r implements G {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bd.e eVarA2 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            n4(eVarA2);
        } else if (i10 == 2) {
            Bd.e eVarA22 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            h(eVarA22);
        } else {
            if (i10 != 3) {
                return false;
            }
            Bd.e eVarA23 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            m0(eVarA23);
        }
        parcel2.writeNoException();
        return true;
    }

    public F() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }
}
