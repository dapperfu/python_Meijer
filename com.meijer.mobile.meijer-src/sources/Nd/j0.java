package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class j0 extends Dd.r implements n0 {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    public j0() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }
}
