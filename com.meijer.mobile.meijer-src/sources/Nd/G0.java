package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class G0 extends Dd.r implements H0 {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Dd.B bA2 = Dd.A.a2(parcel.readStrongBinder());
        Dd.s.b(parcel);
        R8(bA2);
        parcel2.writeNoException();
        return true;
    }

    public G0() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }
}
