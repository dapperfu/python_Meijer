package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Nd.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4202x extends Dd.r implements InterfaceC4203y {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4202x() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }
}
