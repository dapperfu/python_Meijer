package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class H extends Dd.r implements I {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        boolean zZzb = zzb();
        parcel2.writeNoException();
        int i12 = Dd.s.f6126b;
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }

    public H() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }
}
