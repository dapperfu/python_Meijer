package Nd;

import Dd.AbstractBinderC3103d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class D extends Dd.r implements E {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Dd.e eVarA2 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
        Dd.s.b(parcel);
        boolean zF = f(eVarA2);
        parcel2.writeNoException();
        parcel2.writeInt(zF ? 1 : 0);
        return true;
    }

    public D() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
}
