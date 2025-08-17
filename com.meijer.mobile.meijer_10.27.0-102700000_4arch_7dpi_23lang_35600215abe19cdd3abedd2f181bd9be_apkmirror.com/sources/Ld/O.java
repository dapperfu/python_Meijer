package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class O extends Bd.r implements P {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bd.h hVarA2 = Bd.g.a2(parcel.readStrongBinder());
        Bd.s.b(parcel);
        Y2(hVarA2);
        parcel2.writeNoException();
        return true;
    }

    public O() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }
}
