package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class O extends Dd.r implements P {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Dd.h hVarA2 = Dd.g.a2(parcel.readStrongBinder());
        Dd.s.b(parcel);
        B6(hVarA2);
        parcel2.writeNoException();
        return true;
    }

    public O() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }
}
