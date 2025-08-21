package Nd;

import Dd.AbstractBinderC3103d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class r0 extends Dd.r implements s0 {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Dd.e eVarA2 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            com.google.android.gms.dynamic.b bVarX0 = x0(eVarA2);
            parcel2.writeNoException();
            Dd.s.e(parcel2, bVarX0);
        } else {
            if (i10 != 2) {
                return false;
            }
            Dd.e eVarA22 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            com.google.android.gms.dynamic.b bVarF = f(eVarA22);
            parcel2.writeNoException();
            Dd.s.e(parcel2, bVarF);
        }
        return true;
    }

    public r0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }
}
