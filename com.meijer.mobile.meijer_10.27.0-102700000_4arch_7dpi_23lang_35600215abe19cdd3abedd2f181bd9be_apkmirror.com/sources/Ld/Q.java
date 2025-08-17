package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class Q extends Bd.r implements S {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bd.k kVarA2 = Bd.j.a2(parcel.readStrongBinder());
        Bd.s.b(parcel);
        d1(kVarA2);
        parcel2.writeNoException();
        return true;
    }

    public Q() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }
}
