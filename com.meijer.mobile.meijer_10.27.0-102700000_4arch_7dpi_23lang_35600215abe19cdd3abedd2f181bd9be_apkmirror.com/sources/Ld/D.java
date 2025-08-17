package Ld;

import Bd.AbstractBinderC2954d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class D extends Bd.r implements E {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bd.e eVarA2 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
        Bd.s.b(parcel);
        boolean zH = h(eVarA2);
        parcel2.writeNoException();
        parcel2.writeInt(zH ? 1 : 0);
        return true;
    }

    public D() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
}
