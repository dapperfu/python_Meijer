package Nd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Nd.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4175b0 extends Dd.r implements InterfaceC4177c0 {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4184g c4185g0;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c4185g0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            c4185g0 = iInterfaceQueryLocalInterface instanceof InterfaceC4184g ? (InterfaceC4184g) iInterfaceQueryLocalInterface : new C4185g0(strongBinder);
        }
        Dd.s.b(parcel);
        C7(c4185g0);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4175b0() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }
}
