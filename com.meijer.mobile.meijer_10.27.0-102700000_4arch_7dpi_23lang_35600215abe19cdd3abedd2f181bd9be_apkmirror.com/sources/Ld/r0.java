package Ld;

import Bd.AbstractBinderC2954d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class r0 extends Bd.r implements s0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bd.e eVarA2 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            com.google.android.gms.dynamic.b bVarM0 = m0(eVarA2);
            parcel2.writeNoException();
            Bd.s.e(parcel2, bVarM0);
        } else {
            if (i10 != 2) {
                return false;
            }
            Bd.e eVarA22 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            com.google.android.gms.dynamic.b bVarH = h(eVarA22);
            parcel2.writeNoException();
            Bd.s.e(parcel2, bVarH);
        }
        return true;
    }

    public r0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }
}
