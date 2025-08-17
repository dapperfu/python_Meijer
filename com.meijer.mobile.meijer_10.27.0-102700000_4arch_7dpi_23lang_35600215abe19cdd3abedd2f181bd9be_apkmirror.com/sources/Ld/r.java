package Ld;

import Bd.AbstractBinderC2954d;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class r extends Bd.r implements InterfaceC4065s {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bd.e eVarA2 = AbstractBinderC2954d.a2(parcel.readStrongBinder());
        Bd.s.b(parcel);
        h(eVarA2);
        parcel2.writeNoException();
        return true;
    }

    public r() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }
}
