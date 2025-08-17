package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class M extends Bd.r implements N {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Md.r rVar = (Md.r) Bd.s.a(parcel, Md.r.CREATOR);
        Bd.s.b(parcel);
        o2(rVar);
        parcel2.writeNoException();
        return true;
    }

    public M() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }
}
