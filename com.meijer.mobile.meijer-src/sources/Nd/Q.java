package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class Q extends Dd.r implements S {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Dd.k kVarA2 = Dd.j.a2(parcel.readStrongBinder());
        Dd.s.b(parcel);
        U8(kVarA2);
        parcel2.writeNoException();
        return true;
    }

    public Q() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }
}
