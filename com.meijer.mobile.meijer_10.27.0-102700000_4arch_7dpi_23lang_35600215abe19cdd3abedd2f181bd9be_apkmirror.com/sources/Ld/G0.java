package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class G0 extends Bd.r implements H0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bd.B bA2 = Bd.A.a2(parcel.readStrongBinder());
        Bd.s.b(parcel);
        L2(bA2);
        parcel2.writeNoException();
        return true;
    }

    public G0() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }
}
