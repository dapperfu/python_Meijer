package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Ld.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4070x extends Bd.r implements InterfaceC4071y {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4070x() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }
}
