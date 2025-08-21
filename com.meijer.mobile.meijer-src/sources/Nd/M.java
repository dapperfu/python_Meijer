package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class M extends Dd.r implements N {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Od.r rVar = (Od.r) Dd.s.a(parcel, Od.r.CREATOR);
        Dd.s.b(parcel);
        b7(rVar);
        parcel2.writeNoException();
        return true;
    }

    public M() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }
}
